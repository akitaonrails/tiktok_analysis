package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.drawerlayout.widget.DrawerLayout$DrawerListener;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0Ibb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469810Ibb extends C21586319dt {
    public int LL;
    public float LLILLJJLI;
    public float LLILLL;
    public boolean LLILZ;
    public int LLILZIL;

    private final void setRightEdgePercentage(float f) {
        double d = f;
        if (0.0d <= d && d <= 1.0d) {
            try {
                Field declaredField = C469810Ibb.class.getSuperclass().getDeclaredField("mRightCallback");
                declaredField.setAccessible(true);
                AbstractC21586119dr abstractC21586119dr = (AbstractC21586119dr) declaredField.get(this);
                Field declaredField2 = abstractC21586119dr.getClass().getDeclaredField("mPeekRunnable");
                declaredField2.setAccessible(true);
                declaredField2.set(abstractC21586119dr, null);
                Field declaredField3 = C469810Ibb.class.getSuperclass().getDeclaredField("mLeftCallback");
                declaredField3.setAccessible(true);
                AbstractC21586119dr abstractC21586119dr2 = (AbstractC21586119dr) declaredField3.get(this);
                Field declaredField4 = abstractC21586119dr2.getClass().getDeclaredField("mPeekRunnable");
                declaredField4.setAccessible(true);
                declaredField4.set(abstractC21586119dr2, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJII(e);
            }
        }
    }

    @Override // X.C21586319dt, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 2) {
                    float f = this.LLILLJJLI;
                    if (x > f && !this.LLILZ) {
                        return false;
                    }
                    if (this.LLILZIL != 0 && this.LLILZ) {
                        return false;
                    }
                    int iAbs = (int) Math.abs(x - f);
                    int iAbs2 = (int) Math.abs(y - this.LLILLL);
                    int i = (iAbs * iAbs) + (iAbs2 * iAbs2);
                    int i2 = this.LL;
                    if (i > i2 * i2 * 2 && iAbs < iAbs2 * 4) {
                        return false;
                    }
                }
            } else {
                this.LLILLJJLI = x;
                this.LLILLL = y;
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJII(e);
            return false;
        }
    }

    @Override // X.C21586319dt, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (isDrawerOpen(8388613)) {
                return super.onTouchEvent(motionEvent);
            }
            closeDrawer(8388613);
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (motionEvent.getAction() == 1 && (e instanceof IllegalArgumentException)) {
                motionEvent.setAction(3);
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public final void setViewPagerPos(int i) {
        this.LLILZIL = i;
    }

    public C469810Ibb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C469810Ibb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZIL = -1;
        this.LL = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        setRightEdgePercentage(0.0f);
        addDrawerListener(new DrawerLayout$DrawerListener() { // from class: X.0Ibc
            @Override // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
            public final void onDrawerSlide(View view, float f) {
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
            public final void onDrawerClosed(View view) {
                this.LIZ.LLILZ = false;
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
            public final void onDrawerOpened(View view) {
                this.LIZ.LLILZ = true;
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
            public final void onDrawerStateChanged(int i2) {
                this.LIZ.getClass();
            }
        });
    }
}
