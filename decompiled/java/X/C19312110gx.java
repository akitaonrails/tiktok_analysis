package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.10gx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19312110gx extends C21594419fC {
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public double LLIZLLLIL;
    public int LLJ;
    public int LLJI;

    @Override // X.C21594419fC, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // X.C21594419fC, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public C19312110gx(Context context) {
        super(context);
        this.LLJ = Integer.MIN_VALUE;
        this.LLJI = -1;
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            final Context context2 = getContext();
            declaredField.set(this, new Scroller(context2) { // from class: X.10hS
                {
                    DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                }

                @Override // android.widget.Scroller
                public final void startScroll(int i, int i2, int i3, int i4, int i5) {
                    super.startScroll(i, i2, i3, i4, 150);
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!C0XGZ.LIZ()) {
            return;
        }
        this.LLJI = -1;
        requestLayout();
    }

    public final void setIsFullScreenDialog(boolean z) {
        this.LLILZLL = z;
    }

    public final void setPanelMaxHeightRatio(double d) {
        this.LLIZLLLIL = d;
    }

    public final void setShouldAdjustHeightDynamically(boolean z) {
        this.LLIZ = z;
    }

    public final void setShouldLimitHeight(boolean z) {
        this.LLILZIL = z;
    }

    public final void setTheOnePanelHeight(int i) {
        this.LLJ = i;
    }

    @Override // X.C21594419fC, androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i, int i2) {
        int iLIZIZ;
        super.onMeasure(i, i2);
        int i3 = 0;
        if (!this.LLILZLL && this.LLIZ) {
            if (this.LLJI == -1) {
                this.LLJI = this.LLJ;
                int childCount = getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt != null) {
                        if (childAt instanceof ComposeView) {
                            childAt.measure(i, i2);
                        } else {
                            childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                        }
                        this.LLJI = Math.max(this.LLJI, childAt.getMeasuredHeight());
                    }
                }
                int i5 = this.LLJI;
                if (this.LLIZLLLIL <= 0.0d) {
                    iLIZIZ = Integer.MAX_VALUE;
                } else {
                    iLIZIZ = ((int) (((double) getContext().getResources().getDisplayMetrics().heightPixels) * this.LLIZLLLIL)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(52.5f)));
                }
                this.LLJI = Math.min(i5, iLIZIZ);
            }
            int i6 = this.LLJI;
            if (i6 > 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            int i7 = getResources().getDisplayMetrics().heightPixels;
            View viewLIZ = C19313210h8.LIZ(this);
            if (viewLIZ != null) {
                ViewPagerBottomSheetBehavior.LIZ(viewLIZ).setPeekHeight(i7);
            }
            requestLayout();
            return;
        }
        if (!this.LLILZIL) {
            return;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i));
        View childAt2 = getChildAt(getCurrentItem());
        if (childAt2 == null) {
            return;
        }
        if (childAt2 instanceof ComposeView) {
            childAt2.measure(iMakeMeasureSpec, i2);
        } else {
            childAt2.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        int measuredHeight = childAt2.getMeasuredHeight();
        if (measuredHeight > 0) {
            i3 = measuredHeight;
        }
        int iMax = Math.max(measuredHeight, (int) (((double) Resources.getSystem().getDisplayMetrics().heightPixels) * 0.6d));
        if (i3 != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}
