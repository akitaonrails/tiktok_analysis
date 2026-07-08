package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.16FB, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16FB extends FrameLayout implements InterfaceC1318370kPb, InterfaceC20097013kG {
    public final C1317550kOH LL;
    public final C1318260kPQ LLILLJJLI;
    public final int[] LLILLL;
    public final int[] LLILZ;
    public final C01GW LLILZIL;
    public boolean LLILZLL;
    public C16FG LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public VelocityTracker LLJJIII;
    public boolean LLJJIJI;
    public C16FI LLJJIJIIJIL;
    public EnumC19356710o9 LLJJIJIL;
    public EnumC481060Itk LLJJJ;
    public EnumC1355250lN5 LLJJJIL;
    public float LLJJJJ;
    public final C16FE LLJJJJJIL;
    public float LLJJJJLIIL;
    public float LLJJL;
    public final C21581419d6 LLJJLIIIJLLLLLLLZ;
    public float LLJL;
    public final C21616519il LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public boolean LLJLLIL;
    public InterfaceC19341710lj LLJLLL;
    public C16FH LLJZ;
    public boolean LLJZIJLIL;
    public int LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;

    public C16FB(Context context) {
        this(context, null, 6, 0);
    }

    public C16FB(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        stopNestedScroll(0);
    }

    private final ValueAnimator getManuallyRefreshAnimator() {
        return (ValueAnimator) this.LLJLL.getValue();
    }

    private final int getTouchSlop() {
        return ((Number) this.LLILZIL.getValue()).intValue();
    }

    public final void LIZ() {
        C21616519il c21616519il = this.LLJLIL;
        if (c21616519il.LJFF) {
            c21616519il.LIZLLL();
        }
        if (this.LLJLILLLLZIIL && getManuallyRefreshAnimator().isRunning()) {
            getManuallyRefreshAnimator().cancel();
        }
    }

    public final void LJ() {
        C16FG c16fg = this.LLIZ;
        if (c16fg != null) {
            int actualHeight = c16fg.getActualHeight();
            setRefreshing(true);
            this.LLJLILLLLZIIL = true;
            C16FG c16fg2 = this.LLIZ;
            if (c16fg2 != null) {
                c16fg2.LIZIZ(true);
            }
            C16FG c16fg3 = this.LLIZ;
            if (c16fg3 != null) {
                c16fg3.onHiddenChanged(false);
            }
            LIZ();
            getManuallyRefreshAnimator().setIntValues(actualHeight, 0);
            getManuallyRefreshAnimator().start();
        }
    }

    public final int getHeaderHeight() {
        C16FG c16fg = this.LLIZ;
        if (c16fg != null) {
            return c16fg.getActualHeight();
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.LLILLJJLI.LJIIIIZZ(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LLILLJJLI.LIZLLL;
    }

    private final View getNestedChild() {
        if (getChildCount() == 0) {
            return null;
        }
        if (getChildCount() > 2) {
            throw new IllegalArgumentException("Spring layout just have one child view");
        }
        int i = 0;
        if (getChildCount() == 2) {
            if (!(getChildAt(0) instanceof C16FG)) {
                throw new IllegalArgumentException("Spring layout just have one child view");
            }
            if (getChildAt(1) instanceof C16FG) {
                throw new IllegalArgumentException("Header view must as first child");
            }
        }
        int childCount = getChildCount();
        if (childCount >= 0) {
            while (true) {
                View childAt = getChildAt(i);
                if (!(childAt instanceof C16FG) && childAt != null) {
                    return childAt;
                }
                if (i == childCount) {
                    break;
                }
                i++;
            }
        }
        return null;
    }

    public final boolean LIZJ() {
        return getScrollY() == 0 && this.LLLFF && getHeaderHeight() > 0;
    }

    public final int getNestedScrollY() {
        return getScrollY() - getHeaderHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLJJIII = VelocityTracker.obtain();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.LLJJIII;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        LIZ();
    }

    public final int getHoverBottomHeight() {
        return this.LLL;
    }

    public final float getMaxOverScrollDistance() {
        return this.LLJJJJLIIL;
    }

    public final C16FG getNestedHeader() {
        return this.LLIZ;
    }

    @Override // android.view.View
    public final EnumC19356710o9 getOverScrollMode() {
        return this.LLJJIJIL;
    }

    public final float getRubberBandCoefficient() {
        return this.LLJJL;
    }

    public final EnumC1355250lN5 getScrollDirectionMode() {
        return this.LLJJJIL;
    }

    public final EnumC481060Itk getScrollMode() {
        return this.LLJJJ;
    }

    public final float getSpringStiffness() {
        return this.LLJL;
    }

    public final void LJFF(float f) {
        boolean z;
        EnumC19356710o9 enumC19356710o9 = this.LLJJIJIL;
        if (enumC19356710o9 != EnumC19356710o9.ALWAYS && enumC19356710o9 != EnumC19356710o9.ONLY_TOP) {
            return;
        }
        if (!this.LLLFFI && !this.LLLF) {
            z = false;
        } else {
            z = true;
        }
        LIZIZ(-1, z, Float.valueOf(f));
    }

    public final void LJI(int i) {
        int i2;
        C16FG c16fg;
        C16FG c16fg2;
        boolean z = true;
        if (Math.abs(i) <= 1) {
            return;
        }
        this.LLJ = this.LLJJJJJIL.LIZIZ(getNestedScrollY()) + i;
        int headerHeight = getHeaderHeight();
        C16FE c16fe = this.LLJJJJJIL;
        int i3 = this.LLJ;
        int nestedScrollY = getNestedScrollY() + i;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        scrollTo(0, headerHeight + c16fe.LIZ(i3, nestedScrollY, i2));
        this.LLJ = this.LLJJJJJIL.LIZIZ(getNestedScrollY());
        if (getNestedScrollY() >= 0) {
            if (this.LLIZLLLIL && (c16fg2 = this.LLIZ) != null) {
                c16fg2.onHiddenChanged(true);
            }
            z = false;
        } else if (!this.LLIZLLLIL && (c16fg = this.LLIZ) != null) {
            c16fg.onHiddenChanged(false);
        }
        this.LLIZLLLIL = z;
        C16FG c16fg3 = this.LLIZ;
        if (c16fg3 != null) {
            c16fg3.LIZ(getNestedScrollY(), false);
        }
        C16FI c16fi = this.LLJJIJIIJIL;
        if (c16fi != null) {
            c16fi.LIZ(getNestedScrollY(), this.LLJ, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16FB.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        boolean z2 = false;
        z = false;
        z = false;
        if (this.LLJJI) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = true;
        if (actionMasked != 0) {
            int i2 = -1;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.LLJILJIL) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i = 1;
                                }
                                this.LLJILJIL = motionEvent.getPointerId(i);
                                this.LLJIJIL = C814420VxA.LIZIZ(motionEvent.getY(i));
                                this.LLJI = C814420VxA.LIZIZ(motionEvent.getX(i));
                            }
                        } else {
                            this.LLJILJIL = motionEvent.getPointerId(motionEvent.getActionIndex());
                            this.LLJIJIL = C814420VxA.LIZIZ(motionEvent.getY(motionEvent.getActionIndex()));
                            this.LLJI = C814420VxA.LIZIZ(motionEvent.getX(motionEvent.getActionIndex()));
                        }
                    } else {
                        this.LLJJ = false;
                        this.LLJIJIL = 0;
                        this.LLJI = 0;
                        if (getNestedScrollY() != 0) {
                            if (getNestedScrollY() >= 0) {
                                i2 = 1;
                            }
                            LIZIZ(i2, true, Float.valueOf(0.0f));
                        }
                    }
                } else {
                    View nestedChild = getNestedChild();
                    if (nestedChild != null) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.LLJILJIL);
                        if (iFindPointerIndex < 0) {
                            return false;
                        }
                        int iLIZIZ = C814420VxA.LIZIZ(motionEvent.getY(iFindPointerIndex));
                        int i3 = this.LLJIJIL - iLIZIZ;
                        this.LLJIJIL = iLIZIZ;
                        int iLIZIZ2 = C814420VxA.LIZIZ(motionEvent.getX(motionEvent.getActionIndex()));
                        int i4 = this.LLJI - iLIZIZ2;
                        this.LLJI = iLIZIZ2;
                        if (LIZLLL(i4, i3)) {
                            if (LIZJ()) {
                                this.LLJJ = true;
                            } else if (i3 > 0) {
                                int i5 = C19356810oA.LIZ[this.LLJJIJIL.ordinal()];
                                if ((i5 == 1 || i5 == 2) && !nestedChild.canScrollVertically(1) && getNestedScrollY() + i3 > 0) {
                                    z2 = true;
                                }
                                this.LLJJ = z2;
                            } else if (i3 < 0) {
                                int i6 = C19356810oA.LIZ[this.LLJJIJIL.ordinal()];
                                if ((i6 == 1 || i6 == 3) && !nestedChild.canScrollVertically(-1) && getNestedScrollY() + i3 < 0) {
                                    z = true;
                                }
                                this.LLJJ = z;
                            }
                        }
                    }
                }
            } else {
                this.LLJJ = false;
                this.LLJIJIL = 0;
                this.LLJI = 0;
                if (getNestedScrollY() != 0) {
                    if (getNestedScrollY() >= 0) {
                        i2 = 1;
                    }
                    LIZIZ(i2, true, Float.valueOf(0.0f));
                }
            }
        } else {
            if (getNestedScrollY() == 0) {
                z3 = false;
            }
            this.LLJJ = z3;
            if (LIZJ()) {
                this.LLJJ = false;
            }
            this.LLJILJIL = motionEvent.getPointerId(0);
            this.LLJIJIL = C814420VxA.LIZIZ(motionEvent.getY());
            this.LLJI = C814420VxA.LIZIZ(motionEvent.getX());
        }
        return this.LLJJ;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLJJI) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (actionMasked != 0) {
            int i2 = -1;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.LLJILJIL) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i = 1;
                                }
                                this.LLJILJIL = motionEvent.getPointerId(i);
                                this.LLJIJIL = C814420VxA.LIZIZ(motionEvent.getY(i));
                                this.LLJI = C814420VxA.LIZIZ(motionEvent.getX(i));
                            }
                        } else {
                            this.LLJILJIL = motionEvent.getPointerId(motionEvent.getActionIndex());
                            this.LLJIJIL = C814420VxA.LIZIZ(motionEvent.getY(motionEvent.getActionIndex()));
                            this.LLJI = C814420VxA.LIZIZ(motionEvent.getX(motionEvent.getActionIndex()));
                        }
                    } else {
                        this.LLJJ = false;
                        this.LLJIJIL = 0;
                        this.LLJI = 0;
                        if (getNestedScrollY() != 0) {
                            if (getNestedScrollY() >= 0) {
                                i2 = 1;
                            }
                            LIZIZ(i2, true, Float.valueOf(0.0f));
                        }
                    }
                } else {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.LLJILJIL);
                    if (iFindPointerIndex < 0) {
                        return false;
                    }
                    int iLIZIZ = C814420VxA.LIZIZ(motionEvent.getY(iFindPointerIndex));
                    int i3 = this.LLJIJIL - iLIZIZ;
                    this.LLJIJIL = iLIZIZ;
                    LJI(i3);
                }
            } else {
                this.LLJJ = false;
                this.LLJIJIL = 0;
                this.LLJI = 0;
                if (getNestedScrollY() != 0) {
                    if (getNestedScrollY() >= 0) {
                        i2 = 1;
                    }
                    LIZIZ(i2, true, Float.valueOf(0.0f));
                }
            }
        } else {
            this.LLJILJIL = motionEvent.getPointerId(0);
            this.LLJIJIL = C814420VxA.LIZIZ(motionEvent.getY());
            this.LLJI = C814420VxA.LIZIZ(motionEvent.getX());
            LIZ();
        }
        return this.LLJJ;
    }

    public final void setHoverAtBottom(boolean z) {
        if (this.LLJZIJLIL == z) {
            return;
        }
        this.LLJZIJLIL = z;
        int i = 1;
        if (z) {
            if (!this.LLLF) {
                this.LLLF = true;
                C16FH c16fh = this.LLJZ;
                if (c16fh != null) {
                    c16fh.LIZ();
                    return;
                }
                return;
            }
            return;
        }
        if (!this.LLLF) {
            return;
        }
        this.LLLF = false;
        if (getNestedScrollY() < 0) {
            i = -1;
        }
        LIZIZ(i, this.LLJZIJLIL, Float.valueOf(0.0f));
    }

    public final void setHoverBottomHeight(int i) {
        this.LLL = i;
    }

    public final void setMaxOverScrollDistance(float f) {
        if (f >= 1.0f) {
            this.LLJJJJLIIL = f;
            this.LLJJJJJIL.LIZ = f;
            C21616519il c21616519il = this.LLJLIL;
            if (c21616519il != null) {
                c21616519il.LJI = (f - 1) + getHeaderHeight();
            }
            C21616519il c21616519il2 = this.LLJLIL;
            if (c21616519il2 != null) {
                c21616519il2.LJII = (-this.LLJJJJLIIL) + 1;
                return;
            }
            return;
        }
        throw new IllegalStateException("maxOverScrollDistance must >= 1");
    }

    public final void setNestedHeader(C16FG c16fg) {
        int actualHeight;
        int actualHeight2;
        this.LLIZ = c16fg;
        int childCount = getChildCount();
        if (childCount >= 0) {
            int i = 0;
            while (true) {
                if (getChildAt(i) instanceof C16FG) {
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
                    removeViewAt(i);
                    break;
                } else if (i == childCount) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (this.LLJLIL.LJFF) {
            LIZ();
            scrollTo(0, 0);
        }
        if (!(c16fg instanceof View)) {
            this.LLIZ = null;
            setRefreshing(false);
            this.LLLFFI = false;
            scrollTo(0, 0);
            return;
        }
        View view = (View) this.LLIZ;
        C16FG c16fg2 = this.LLIZ;
        if (c16fg2 != null) {
            actualHeight = c16fg2.getActualHeight();
        } else {
            actualHeight = 0;
        }
        addView(view, 0, new ViewGroup.LayoutParams(-1, actualHeight));
        this.LLJLIL.LJI = (this.LLJJJJLIIL - 1) + c16fg.getActualHeight();
        C16FG c16fg3 = this.LLIZ;
        if (c16fg3 != null) {
            actualHeight2 = c16fg3.getActualHeight();
        } else {
            actualHeight2 = 0;
        }
        scrollTo(0, actualHeight2);
        C16FG c16fg4 = this.LLIZ;
        if (c16fg4 != null) {
            c16fg4.LIZIZ(this.LLLFF);
        }
    }

    public final void setNestedScrollEnabledWhenNonTouch(boolean z) {
        this.LLJLLIL = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LLILLJJLI.LJIIIZ(z);
    }

    public final void setOnHoverBottomListener(final Function0<Unit> function0) {
        setOnHoverBottomListener(new C16FH() { // from class: X.16FF
            @Override // X.C16FH
            public final void LIZ() {
                function0.invoke();
            }
        });
    }

    public final void setOnRefreshListener(final Function0<Unit> function0) {
        setOnRefreshListener(new InterfaceC19341710lj() { // from class: X.10mK
            @Override // X.InterfaceC19341710lj
            public final void LJFF() {
                function0.invoke();
            }
        });
    }

    public final void setOnScrollChangeListener(final InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Boolean, Unit> interfaceC1631620sYq) {
        setOnScrollChangeListener(new C16FI() { // from class: X.0nG9
            @Override // X.C16FI
            public final void LIZ(int i, int i2, boolean z) {
                interfaceC1631620sYq.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
            }
        });
    }

    public final void setOverScrollMode(EnumC19356710o9 enumC19356710o9) {
        this.LLJJIJIL = enumC19356710o9;
    }

    public final void setRefreshing(boolean z) {
        if (this.LLLFF == z) {
            return;
        }
        this.LLLFF = z;
        int i = 1;
        if (z) {
            if (!this.LLLFFI) {
                this.LLLFFI = true;
                InterfaceC19341710lj interfaceC19341710lj = this.LLJLLL;
                if (interfaceC19341710lj != null) {
                    interfaceC19341710lj.LJFF();
                }
                C16FG c16fg = this.LLIZ;
                if (c16fg != null) {
                    c16fg.LIZIZ(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.LLLFFI) {
            return;
        }
        this.LLLFFI = false;
        C16FG c16fg2 = this.LLIZ;
        if (c16fg2 != null) {
            c16fg2.LIZIZ(false);
        }
        if (getNestedScrollY() < 0) {
            i = -1;
        }
        LIZIZ(i, this.LLLFF, Float.valueOf(0.0f));
    }

    public final void setRubberBandCoefficient(float f) {
        this.LLJJL = f;
        this.LLJJJJJIL.LIZIZ = f;
    }

    public final void setScrollDirectionMode(EnumC1355250lN5 enumC1355250lN5) {
        this.LLJJJIL = enumC1355250lN5;
    }

    public final void setScrollMode(EnumC481060Itk enumC481060Itk) {
        this.LLJJJ = enumC481060Itk;
    }

    public final void setSpringStiffness(float f) {
        this.LLJL = f;
        this.LLJJLIIIJLLLLLLLZ.LIZIZ(f);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    @Override // X.InterfaceC20097013kG
    public final void stopNestedScroll(int i) {
        this.LLILLJJLI.LJIIJJI(i);
    }

    public final void setOnHoverBottomListener(C16FH c16fh) {
        this.LLJZ = c16fh;
    }

    public final void setOnRefreshListener(InterfaceC19341710lj interfaceC19341710lj) {
        this.LLJLLL = interfaceC19341710lj;
    }

    public final void setOnScrollChangeListener(C16FI c16fi) {
        this.LLJJIJIIJIL = c16fi;
    }

    public final boolean LIZLLL(int i, int i2) {
        if (Math.abs(i2) > getTouchSlop() && this.LLJJJIL.getValue() * Math.abs(i2) > Math.abs(i)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.LLILLJJLI.LIZIZ(f, f2);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
        int i2;
        this.LL.LIZIZ(i);
        if (i == 0 && getNestedScrollY() != 0) {
            if (getNestedScrollY() < 0) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            LIZIZ(i2, true, Float.valueOf(0.0f));
        }
        stopNestedScroll(i);
    }

    @Override // X.InterfaceC20097013kG
    public final boolean startNestedScroll(int i, int i2) {
        return this.LLILLJJLI.LJIIJ(i, i2);
    }

    public C16FB(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLL = new int[2];
        this.LLILZ = new int[2];
        this.LLILZIL = C452501pT.LIZIZ(new C481070Itl(context));
        EnumC19356710o9 enumC19356710o9 = EnumC19356710o9.ALWAYS;
        this.LLJJIJIL = enumC19356710o9;
        EnumC481060Itk enumC481060Itk = EnumC481060Itk.NONE;
        this.LLJJJ = enumC481060Itk;
        EnumC1355250lN5 enumC1355250lN5 = EnumC1355250lN5.BALANCED;
        this.LLJJJIL = enumC1355250lN5;
        this.LLJJJJJIL = new C16FE();
        this.LLJJJJLIIL = 2000.0f;
        this.LLJJL = 0.55f;
        C21581419d6 c21581419d6 = new C21581419d6();
        c21581419d6.LIZ(1.0f);
        c21581419d6.LJIIIIZZ = 0.0f;
        this.LLJJLIIIJLLLLLLLZ = c21581419d6;
        this.LLJL = 100.0f;
        C21616519il c21616519il = new C21616519il(this, AbstractC21616419ik.LJIL);
        c21616519il.LJJ = c21581419d6;
        c21581419d6.LIZIZ(this.LLJL);
        float f = this.LLJJJJLIIL;
        float f2 = 1;
        c21616519il.LJII = (-f) + f2;
        c21616519il.LJI = (f - f2) + getHeaderHeight();
        c21616519il.LIZJ(new InterfaceC20731416Am() { // from class: X.16FC
            @Override // X.InterfaceC20731416Am
            public final void LIZ(float f3, float f4) {
                C16FG nestedHeader;
                C16FG nestedHeader2;
                C16FB c16fb = this.LIZ;
                c16fb.LLJ = c16fb.LLJJJJJIL.LIZIZ(c16fb.getNestedScrollY());
                C16FG nestedHeader3 = this.LIZ.getNestedHeader();
                boolean z = true;
                if (nestedHeader3 != null) {
                    nestedHeader3.LIZ(this.LIZ.getNestedScrollY(), true);
                }
                C16FB c16fb2 = this.LIZ;
                C16FI c16fi = c16fb2.LLJJIJIIJIL;
                if (c16fi != null) {
                    c16fi.LIZ(c16fb2.getNestedScrollY(), this.LIZ.LLJ, true);
                }
                C16FB c16fb3 = this.LIZ;
                if (c16fb3.getNestedScrollY() >= 0) {
                    C16FB c16fb4 = this.LIZ;
                    if (c16fb4.LLIZLLLIL && (nestedHeader2 = c16fb4.getNestedHeader()) != null) {
                        nestedHeader2.onHiddenChanged(true);
                    }
                    z = false;
                } else {
                    C16FB c16fb5 = this.LIZ;
                    if (!c16fb5.LLIZLLLIL && (nestedHeader = c16fb5.getNestedHeader()) != null) {
                        nestedHeader.onHiddenChanged(false);
                    }
                }
                c16fb3.LLIZLLLIL = z;
                if (this.LIZ.getNestedScrollY() >= (-this.LIZ.getHeaderHeight())) {
                    this.LIZ.LLILZLL = false;
                }
            }
        });
        c21616519il.LIZIZ(new InterfaceC1427630nFp() { // from class: X.16FD
            @Override // X.InterfaceC1427630nFp
            public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z, float f3, float f4) {
                C16FB c16fb = this.LIZ;
                c16fb.LLJ = c16fb.LLJJJJJIL.LIZIZ(c16fb.getNestedScrollY());
            }
        });
        this.LLJLIL = c21616519il;
        this.LLJLL = C452501pT.LIZIZ(new C1906630ziP(this));
        this.LLJLLIL = true;
        this.LLL = -1;
        if (getChildCount() <= 1) {
            this.LL = new C1317550kOH();
            this.LLILLJJLI = new C1318260kPQ(this);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SpringLayout, i, 0);
            this.LLJJJ = typedArrayObtainStyledAttributes.getInt(R$styleable.SpringLayout_tux_scrollMode, 0) == 1 ? EnumC481060Itk.REFRESH : enumC481060Itk;
            int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.SpringLayout_tux_overScrollMode, 3);
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        enumC19356710o9 = EnumC19356710o9.ONLY_BOTTOM;
                    }
                } else {
                    enumC19356710o9 = EnumC19356710o9.ONLY_TOP;
                }
            } else {
                enumC19356710o9 = EnumC19356710o9.NONE;
            }
            this.LLJJIJIL = enumC19356710o9;
            int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.SpringLayout_tux_scrollDirectionMode, 0);
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        enumC1355250lN5 = EnumC1355250lN5.EASY_VERTICAL;
                    }
                } else {
                    enumC1355250lN5 = EnumC1355250lN5.EASY_HORIZONTAL;
                }
            }
            this.LLJJJIL = enumC1355250lN5;
            this.LLJJIJI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SpringLayout_tux_forceHandleEventMode, false);
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Spring layout just have one child view");
    }

    public final void LIZIZ(int i, boolean z, Float f) {
        float yVelocity;
        LIZ();
        if (i != 0) {
            VelocityTracker velocityTracker = this.LLJJIII;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LLJJJJ);
            }
            if (f != null) {
                yVelocity = f.floatValue();
            } else {
                VelocityTracker velocityTracker2 = this.LLJJIII;
                if (velocityTracker2 != null) {
                    yVelocity = velocityTracker2.getYVelocity(this.LLJILJIL);
                } else {
                    yVelocity = 0.0f;
                }
                if (i >= 0 ? yVelocity < 0.0f : yVelocity > 0.0f) {
                    yVelocity = -yVelocity;
                }
            }
            C21616519il c21616519il = this.LLJLIL;
            if (i < 0 && this.LLJJJ == EnumC481060Itk.REFRESH && z && ((getNestedScrollY() < (-getHeaderHeight()) || this.LLLFFI) && !this.LLILZLL)) {
                c21616519il.LJJ.LJIIIIZZ = 0.0f;
                if (!this.LLLFFI) {
                    setRefreshing(true);
                }
                this.LLILZLL = true;
            } else {
                int nestedScrollY = getNestedScrollY();
                int i2 = this.LLL;
                if (1 <= i2 && i2 <= nestedScrollY && z) {
                    c21616519il.LJJ.LJIIIIZZ = i2;
                    if (!this.LLLF) {
                        setHoverAtBottom(true);
                    }
                } else if (i >= 0 || this.LLJJJ != EnumC481060Itk.REFRESH || !z || ((getNestedScrollY() >= (-getHeaderHeight()) && !this.LLLFFI) || !this.LLILZLL)) {
                    c21616519il.LJJ.LJIIIIZZ = getHeaderHeight();
                }
            }
            c21616519il.LIZ = yVelocity / 2.0f;
            getScrollY();
            c21616519il.LJIIIZ();
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LLILLJJLI.LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        this.LLJJJJ = f2;
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC1318530kPr
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    public /* synthetic */ C16FB(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.LL.LIZ(i, i2);
        startNestedScroll(2, i2);
        if (!this.LLJJIJI) {
            this.LLJJI = true;
        }
        if (i2 == 0) {
            LIZ();
        }
    }

    @Override // X.InterfaceC1318370kPb
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        boolean z;
        getNestedScrollY();
        if (!this.LLJLLIL && i2 == 1) {
            z = false;
        } else {
            z = true;
        }
        if ((i & 2) == 0 || !z) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC20097013kG
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.LLILLJJLI.LIZLLL(i, i2, iArr, null, i3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.LLILLJJLI.LJ(i, i2, i3, i4, iArr);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int headerHeight = getHeaderHeight();
        Object obj = this.LLIZ;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null) {
            view.layout(0, 0, view.getMeasuredWidth(), headerHeight);
        }
        View nestedChild = getNestedChild();
        if (nestedChild != null) {
            nestedChild.layout(0, headerHeight, nestedChild.getMeasuredWidth(), nestedChild.getMeasuredHeight() + headerHeight);
        }
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int nestedScrollY;
        int i4;
        if (this.LLJJI && !this.LLJJIJI) {
            if (getNestedScrollY() != 0) {
                if (getNestedScrollY() < 0) {
                    if (getNestedScrollY() + i2 >= 0) {
                        nestedScrollY = getNestedScrollY();
                        i4 = -nestedScrollY;
                    }
                    i4 = i2;
                } else {
                    if (getNestedScrollY() + i2 <= 0) {
                        nestedScrollY = getNestedScrollY();
                        i4 = -nestedScrollY;
                    }
                    i4 = i2;
                }
                if ((getNestedScrollY() > 0 && view.canScrollVertically(1)) || (getNestedScrollY() < 0 && view.canScrollVertically(-1))) {
                    i4 = -getNestedScrollY();
                }
                iArr[1] = i4;
                if (i3 == 0) {
                    LJI(i4);
                }
            }
            if (this.LLILLJJLI.LIZLLL) {
                dispatchNestedPreScroll(i, i2, iArr, null, i3);
            }
            getNestedScrollY();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.LLILLL);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, i5, this.LLILLL);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        int i7 = i4;
        if (this.LLJJI && !this.LLJJIJI) {
            boolean z = true;
            if (this.LLILLJJLI.LIZLLL) {
                dispatchNestedScroll(i, i2, i3, i7, this.LLILZ);
                i7 += this.LLILZ[1];
            }
            if (i7 != 0 && getNestedScrollY() == 0) {
                if (i7 >= 0 ? this.LLJJIJIL != EnumC19356710o9.ONLY_BOTTOM : this.LLJJIJIL != EnumC19356710o9.ONLY_TOP) {
                    if (this.LLJJIJIL != EnumC19356710o9.ALWAYS) {
                        return;
                    }
                }
                if (i5 == 0) {
                    LJI(i7);
                    return;
                }
                if (i5 != 1 || i2 == 0) {
                    return;
                }
                if (i7 < 0) {
                    i6 = -1;
                } else {
                    i6 = 1;
                }
                if (!this.LLLFFI && !this.LLLF) {
                    z = false;
                }
                LIZIZ(i6, z, null);
            }
        }
    }
}
