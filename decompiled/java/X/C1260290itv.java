package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0itv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1260290itv extends LinearLayout {
    public final Scroller LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public VelocityTracker LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public float LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public View LLJJ;
    public ViewPager LLJJI;
    public EnumC1260310itx LLJJIII;
    public int LLJJIJI;
    public final int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public InterfaceC1260330itz LLJLL;
    public final C1260300itw LLJLLIL;
    public boolean LLJLLL;

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LL.computeScrollOffset()) {
            int currY = this.LL.getCurrY();
            if (this.LLJJIII != EnumC1260310itx.UP) {
                if (this.LLJLLIL.LIZIZ()) {
                    scrollTo(0, getScrollY() + (currY - this.LLJJJIL));
                    if (this.LLJJL <= this.LLJJJJ) {
                        this.LL.forceFinished(true);
                        if ((getParent() instanceof C16FB) && this.LLJLIL) {
                            float currVelocity = this.LL.getCurrVelocity();
                            if (currVelocity > 0.0f) {
                                currVelocity = -currVelocity;
                            }
                            ((C16FB) getParent()).LJFF(currVelocity);
                            return;
                        }
                        return;
                    }
                }
                invalidate();
            } else {
                if (this.LLJJL >= this.LLJJJJJIL) {
                    int finalY = this.LL.getFinalY() - currY;
                    int duration = this.LL.getDuration() - this.LL.timePassed();
                    C1260300itw c1260300itw = this.LLJLLIL;
                    Scroller scroller = this.LL;
                    int currVelocity2 = scroller == null ? 0 : this.LLJJIJIIJIL >= 14 ? (int) scroller.getCurrVelocity() : finalY / duration;
                    View viewLIZ = c1260300itw.LIZ();
                    if (viewLIZ instanceof AbsListView) {
                        AbsListView absListView = (AbsListView) viewLIZ;
                        if (c1260300itw.LIZJ >= 21) {
                            absListView.fling(currVelocity2);
                        } else {
                            absListView.smoothScrollBy(finalY, duration);
                        }
                    } else if (viewLIZ instanceof ScrollView) {
                        ((ScrollView) viewLIZ).fling(currVelocity2);
                    } else if (viewLIZ instanceof RecyclerView) {
                        ((RecyclerView) viewLIZ).fling(0, currVelocity2);
                    } else if (viewLIZ instanceof WebView) {
                        ((WebView) viewLIZ).flingScroll(0, currVelocity2);
                    }
                    this.LL.forceFinished(true);
                    return;
                }
                scrollTo(0, currY);
            }
            this.LLJJJIL = currY;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        View view = this.LLJJ;
        if (view != null && !view.isClickable()) {
            this.LLJJ.setClickable(true);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof ViewPager)) {
                this.LLJJI = (ViewPager) childAt;
            }
        }
        super.onFinishInflate();
    }

    public int getCurScrollY() {
        return this.LLJJL;
    }

    public C1260300itw getHelper() {
        return this.LLJLLIL;
    }

    public int getMaxY() {
        return this.LLJJJJJIL;
    }

    public int getMinY() {
        return this.LLJJJJ;
    }

    public int getTabsMarginTop() {
        return this.LLJJJJLIIL;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        View viewLIZ;
        if (i < 0) {
            if (getScrollY() > this.LLJJJJ) {
                return true;
            }
            return false;
        }
        if (i > 0 && (viewLIZ = this.LLJLLIL.LIZ()) != null) {
            if (viewLIZ.canScrollVertically(i) || getScrollY() < this.LLJJJJJIL) {
                return true;
            }
            return false;
        }
        return super.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        EnumC1260310itx enumC1260310itx;
        int i;
        try {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int iAbs = (int) Math.abs(x - this.LLILLJJLI);
            int iAbs2 = (int) Math.abs(y - this.LLILLL);
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            InterfaceC1260330itz interfaceC1260330itz = this.LLJLL;
                            if (interfaceC1260330itz != null) {
                                interfaceC1260330itz.onScrollEnd();
                            }
                            if (this.LLJJJ && this.LLJJLIIIJLLLLLLLZ && (iAbs > (i = this.LLIZ) || iAbs2 > i)) {
                                int action2 = motionEvent.getAction();
                                motionEvent.setAction(3);
                                boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                                motionEvent.setAction(action2);
                                return zDispatchTouchEvent;
                            }
                        }
                    } else {
                        if (this.LLILZLL == null) {
                            this.LLILZLL = VelocityTracker.obtain();
                        }
                        this.LLILZLL.addMovement(motionEvent);
                        float f = this.LLILZIL - y;
                        InterfaceC1260330itz interfaceC1260330itz2 = this.LLJLL;
                        if (interfaceC1260330itz2 != null) {
                            interfaceC1260330itz2.onScrolled(this.LLILZ - x, f);
                        }
                        if (this.LLJJIJIL) {
                            int i2 = this.LLIZ;
                            if (iAbs <= i2 || iAbs <= iAbs2) {
                                if (iAbs2 > i2 && iAbs2 > iAbs) {
                                    this.LLJJIJIL = false;
                                    this.LLJJJ = true;
                                }
                            } else {
                                this.LLJJIJIL = false;
                                this.LLJJJ = false;
                            }
                        }
                        if (this.LLJJJ && iAbs2 > this.LLIZ && iAbs2 > iAbs && (this.LLJJL < this.LLJJJJJIL || this.LLJLLIL.LIZIZ())) {
                            ViewPager viewPager = this.LLJJI;
                            if (viewPager != null) {
                                viewPager.requestDisallowInterceptTouchEvent(true);
                            }
                            scrollBy(0, (int) (f + 0.5f));
                        }
                        this.LLILZ = x;
                        this.LLILZIL = y;
                        this.LLJILJIL = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        this.LLJILJILJ = (int) (this.LLJILJIL - this.LLJI);
                        float f2 = (int) (rawY - this.LLJIJIL);
                        this.LLJILLL = f2;
                        if (Math.abs(f2) > this.LLJL) {
                            Math.abs(this.LLJILLL);
                            Math.abs(this.LLJILJILJ);
                        }
                    }
                } else {
                    InterfaceC1260330itz interfaceC1260330itz3 = this.LLJLL;
                    if (interfaceC1260330itz3 != null) {
                        interfaceC1260330itz3.onScrollEnd();
                    }
                    if (this.LLJJJ && iAbs2 > iAbs && iAbs2 > this.LLIZ) {
                        this.LLILZLL.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LLJ);
                        float f3 = -this.LLILZLL.getYVelocity();
                        if (Math.abs(f3) > this.LLIZLLLIL) {
                            if (f3 <= 0.0f) {
                                enumC1260310itx = EnumC1260310itx.DOWN;
                            } else {
                                enumC1260310itx = EnumC1260310itx.UP;
                            }
                            this.LLJJIII = enumC1260310itx;
                            if (enumC1260310itx != EnumC1260310itx.UP || this.LLJJL < this.LLJJJJJIL) {
                                this.LL.fling(0, getScrollY(), 0, (int) f3, 0, 0, -2147483647, Integer.MAX_VALUE);
                                this.LLJLIL = true;
                                this.LL.computeScrollOffset();
                                this.LLJJJIL = getScrollY();
                                invalidate();
                            }
                        }
                        if (this.LLJJLIIIJLLLLLLLZ || this.LLJJL < this.LLJJJJJIL) {
                            int action3 = motionEvent.getAction();
                            motionEvent.setAction(3);
                            boolean zDispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                            motionEvent.setAction(action3);
                            return zDispatchTouchEvent2;
                        }
                    }
                }
            } else {
                this.LLJI = motionEvent.getRawX();
                this.LLJIJIL = motionEvent.getRawY();
                this.LLJJIJIL = true;
                this.LLJJJ = true;
                this.LLILLJJLI = x;
                this.LLILLL = y;
                this.LLILZ = x;
                this.LLILZIL = y;
                getScrollY();
                if (((int) y) + getScrollY() <= this.LLJJIJI) {
                    z = true;
                } else {
                    z = false;
                }
                this.LLJJLIIIJLLLLLLLZ = z;
                VelocityTracker velocityTracker = this.LLILZLL;
                if (velocityTracker == null) {
                    this.LLILZLL = VelocityTracker.obtain();
                } else {
                    velocityTracker.clear();
                }
                this.LLILZLL.addMovement(motionEvent);
                this.LL.forceFinished(true);
                this.LLJLIL = false;
            }
            super.dispatchTouchEvent(motionEvent);
            return true;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return true;
        }
    }

    public void setCanScrollUp(boolean z) {
        if (this.LLJLILLLLZIIL == z) {
            return;
        }
        this.LLJLILLLLZIIL = z;
        if (z) {
            this.LLJJJJJIL = this.LLJJIJI - this.LLJJJJLIIL;
            return;
        }
        if (this.LLJJL != 0) {
            scrollTo(0, 0);
        }
        this.LLJJJJJIL = 0;
    }

    public void setMaxScrollHeight(int i) {
        int iMin = Math.min(i, this.LLJJIJI - this.LLJJJJLIIL);
        this.LLJJJJJIL = iMin;
        this.LLJJJJJIL = Math.max(iMin, 0);
    }

    public void setMinY(int i) {
        this.LLJJJJ = i;
    }

    public void setOnScrollListener(InterfaceC1260330itz interfaceC1260330itz) {
        this.LLJLL = interfaceC1260330itz;
    }

    public void setScrollMinY(int i) {
        this.LLJL = i;
    }

    public void setTabsMarginTop(int i) {
        this.LLJJJJLIIL = i;
    }

    public C1260290itv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJL = 10;
        this.LLJLILLLLZIIL = true;
        this.LLJLLIL = new C1260300itw();
        this.LL = new Scroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LLIZ = viewConfiguration.getScaledTouchSlop();
        this.LLIZLLLIL = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LLJ = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LLJJIJIIJIL = Build.VERSION.SDK_INT;
        setOrientation(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScrollableLayout);
        this.LLJJJJLIIL = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.ScrollableLayout_tabs_marginTop, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View childAt = getChildAt(0);
        this.LLJJ = childAt;
        if (childAt != null) {
            measureChildWithMargins(childAt, i, 0, 0, 0);
            this.LLJJIJI = this.LLJJ.getMeasuredHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) + (this.LLJJIJI - this.LLJJJJLIIL), 1073741824));
        if (!this.LLJLLL) {
            this.LLJJJJJIL = this.LLJJIJI - this.LLJJJJLIIL;
            this.LLJLLL = true;
        }
        if (!this.LLJLILLLLZIIL) {
            this.LLJJJJJIL = 0;
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        int scrollY = getScrollY();
        if (scrollY + i2 < 0) {
            i2 /= 3;
        }
        int i3 = i2 + scrollY;
        int i4 = this.LLJJJJJIL;
        if (i3 >= i4 || i3 <= (i4 = this.LLJJJJ)) {
            i3 = i4;
        }
        super.scrollBy(i, i3 - scrollY);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        int i3 = this.LLJJJJJIL;
        if (i2 >= i3) {
            i2 = i3;
        } else {
            int i4 = this.LLJJJJ;
            if (i2 <= i4) {
                i2 = i4;
            }
        }
        this.LLJJL = i2;
        InterfaceC1260330itz interfaceC1260330itz = this.LLJLL;
        if (interfaceC1260330itz != null) {
            interfaceC1260330itz.onScroll(i2, i3);
        }
        super.scrollTo(i, i2);
    }
}
