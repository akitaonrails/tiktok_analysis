package X;

import Y.ARunnableS6S0111000_31;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.16FJ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16FJ extends FrameLayout implements InterfaceC1318370kPb, InterfaceC20097013kG {
    public RecyclerView LL;
    public final C1317550kOH LLILLJJLI;
    public final C1318260kPQ LLILLL;
    public final int[] LLILZ;
    public boolean LLILZIL;
    public C16FG LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public VelocityTracker LLJJI;
    public final boolean LLJJIII;
    public InterfaceC19382710sL LLJJIJI;
    public InterfaceC1115680f8g LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public EnumC19356910oB LLJJJ;
    public EnumC584680MwU LLJJJIL;
    public float LLJJJJ;
    public final C16FE LLJJJJJIL;
    public float LLJJJJLIIL;
    public float LLJJL;
    public final C21581419d6 LLJJLIIIJLLLLLLLZ;
    public float LLJL;
    public final C21616519il LLJLIL;
    public InterfaceC1112920f4E LLJLILLLLZIIL;
    public C16FO LLJLL;
    public boolean LLJLLIL;
    public final int LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;

    @Override // X.InterfaceC20097013kG
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        throw null;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public final void LIZ() {
        C21616519il c21616519il = this.LLJLIL;
        if (c21616519il.LJFF) {
            c21616519il.LIZLLL();
        }
    }

    public final int getHeaderHeight() {
        C16FG c16fg = this.LLILZLL;
        if (c16fg != null) {
            return c16fg.getActualHeight();
        }
        return 0;
    }

    private final View getNestedChild() {
        if (getChildCount() == 0) {
            return null;
        }
        if (getChildCount() > 2) {
            throw new IllegalArgumentException("Spring layout just have one child view");
        }
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
            int i = 0;
            while (true) {
                View childAt = getChildAt(i);
                if (!(childAt instanceof C16FG) && childAt != null) {
                    if (childAt instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) childAt;
                        int childCount2 = viewGroup.getChildCount();
                        for (int i2 = 0; i2 < childCount2; i2++) {
                            if (viewGroup.getChildAt(i2) instanceof RecyclerView) {
                                this.LL = (RecyclerView) viewGroup.getChildAt(i2);
                            }
                        }
                    }
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

    public final boolean LIZLLL() {
        return getScrollY() == 0 && this.LLJZIJLIL && getHeaderHeight() > 0;
    }

    public final void LJ() {
        if (getNestedScrollY() != 0) {
            LIZIZ(getNestedScrollY() < 0 ? -1 : 1, true, Float.valueOf(0.0f), false);
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        InterfaceC1115680f8g interfaceC1115680f8g;
        int scrollY = getScrollY();
        C16FG c16fg = this.LLILZLL;
        return (scrollY < (c16fg != null ? c16fg.getActualHeight() : 0) || ((interfaceC1115680f8g = this.LLJJIJIIJIL) != null && interfaceC1115680f8g.getBottomFadingEdgeStrength() > 0.0f)) ? 1.0f : 0.0f;
    }

    public final int getNestedScrollY() {
        return getScrollY() - getHeaderHeight();
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        int scrollY = getScrollY();
        C16FG c16fg = this.LLILZLL;
        return scrollY > (c16fg != null ? c16fg.getActualHeight() : 0) ? 1.0f : 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        scrollTo(0, getHeaderHeight());
        this.LLJJI = VelocityTracker.obtain();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.LLJJI;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        LIZ();
        this.LLJJI = null;
    }

    public final InterfaceC1115680f8g getBottomFadingListener() {
        return this.LLJJIJIIJIL;
    }

    public final boolean getContentScrollWhenRefreshDone() {
        return this.LLJJIJIL;
    }

    public final float getMaxOverScrollDistance() {
        return this.LLJJJJLIIL;
    }

    public final C16FG getNestedHeader() {
        return this.LLILZLL;
    }

    @Override // android.view.View
    public final EnumC19356910oB getOverScrollMode() {
        return this.LLJJJ;
    }

    public final float getRubberBandCoefficient() {
        return this.LLJJL;
    }

    public final EnumC584680MwU getScrollMode() {
        return this.LLJJJIL;
    }

    public final float getSpringStiffness() {
        return this.LLJL;
    }

    private final void setHoverAtBottom(boolean z) {
        if (this.LLJLLIL == z) {
            return;
        }
        this.LLJLLIL = z;
        int i = 1;
        if (z) {
            if (!this.LLJZ) {
                this.LLJZ = true;
                C16FO c16fo = this.LLJLL;
                if (c16fo != null) {
                    c16fo.LIZ();
                    return;
                }
                return;
            }
            return;
        }
        if (!this.LLJZ) {
            return;
        }
        this.LLJZ = false;
        if (getNestedScrollY() < 0) {
            i = -1;
        }
        LIZIZ(i, this.LLJLLIL, Float.valueOf(0.0f), false);
    }

    public final void LJFF(int i) {
        int i2;
        C16FG c16fg;
        C16FG c16fg2;
        boolean z = true;
        if (Math.abs(i) <= 1) {
            return;
        }
        this.LLIZLLLIL = this.LLJJJJJIL.LIZIZ(getNestedScrollY()) + i;
        int headerHeight = getHeaderHeight();
        C16FE c16fe = this.LLJJJJJIL;
        int i3 = this.LLIZLLLIL;
        int nestedScrollY = getNestedScrollY() + i;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        scrollTo(0, headerHeight + c16fe.LIZ(i3, nestedScrollY, i2));
        if (getNestedScrollY() < 0 && this.LLJJJIL == EnumC584680MwU.REFRESH) {
            LJI(true, false);
        }
        this.LLIZLLLIL = this.LLJJJJJIL.LIZIZ(getNestedScrollY());
        if (getNestedScrollY() >= 0) {
            if (this.LLIZ && (c16fg2 = this.LLILZLL) != null) {
                c16fg2.onHiddenChanged(true);
            }
            z = false;
        } else if (!this.LLIZ && (c16fg = this.LLILZLL) != null) {
            c16fg.onHiddenChanged(false);
        }
        this.LLIZ = z;
        C16FG c16fg3 = this.LLILZLL;
        if (c16fg3 != null) {
            c16fg3.LIZ(getNestedScrollY(), false);
        }
        InterfaceC19382710sL interfaceC19382710sL = this.LLJJIJI;
        if (interfaceC19382710sL != null) {
            interfaceC19382710sL.LIZ(getNestedScrollY(), this.LLIZLLLIL, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00f2 A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:3:0x0001, B:5:0x0009, B:6:0x000c, B:8:0x0010, B:10:0x0015, B:21:0x002e, B:25:0x003d, B:27:0x004e, B:29:0x0075, B:32:0x007e, B:34:0x009c, B:36:0x00a2, B:45:0x00be, B:47:0x00c4, B:48:0x00cc, B:50:0x00d2, B:51:0x00d5, B:53:0x00d9, B:55:0x00e0, B:57:0x00e6, B:59:0x00ec, B:61:0x00f2, B:73:0x0115, B:74:0x0118, B:62:0x00f7, B:64:0x00fe, B:66:0x0104, B:40:0x00b0, B:42:0x00b4, B:44:0x00ba, B:76:0x0157, B:78:0x015d, B:80:0x0161, B:82:0x0181, B:69:0x010c, B:71:0x0110), top: B:87:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0157 A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:3:0x0001, B:5:0x0009, B:6:0x000c, B:8:0x0010, B:10:0x0015, B:21:0x002e, B:25:0x003d, B:27:0x004e, B:29:0x0075, B:32:0x007e, B:34:0x009c, B:36:0x00a2, B:45:0x00be, B:47:0x00c4, B:48:0x00cc, B:50:0x00d2, B:51:0x00d5, B:53:0x00d9, B:55:0x00e0, B:57:0x00e6, B:59:0x00ec, B:61:0x00f2, B:73:0x0115, B:74:0x0118, B:62:0x00f7, B:64:0x00fe, B:66:0x0104, B:40:0x00b0, B:42:0x00b4, B:44:0x00ba, B:76:0x0157, B:78:0x015d, B:80:0x0161, B:82:0x0181, B:69:0x010c, B:71:0x0110), top: B:87:0x0001, inners: #1 }] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16FJ.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int i;
        try {
            z = false;
            i = 0;
            z2 = false;
            z2 = false;
            z2 = false;
            z = false;
            z = false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LLJJ) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = true;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.LLJIJIL) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i = 1;
                                }
                                this.LLJIJIL = motionEvent.getPointerId(i);
                                this.LLJI = C814420VxA.LIZIZ(motionEvent.getY(i));
                                this.LLJ = C814420VxA.LIZIZ(motionEvent.getX(i));
                            }
                        } else {
                            this.LLJIJIL = motionEvent.getPointerId(motionEvent.getActionIndex());
                            this.LLJI = C814420VxA.LIZIZ(motionEvent.getY(motionEvent.getActionIndex()));
                            this.LLJ = C814420VxA.LIZIZ(motionEvent.getX(motionEvent.getActionIndex()));
                        }
                    } else {
                        this.LLJILLL = false;
                        this.LLJI = 0;
                        this.LLJ = 0;
                        LJ();
                    }
                } else {
                    View nestedChild = getNestedChild();
                    if (nestedChild != null) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.LLJIJIL);
                        if (iFindPointerIndex < 0) {
                            return false;
                        }
                        int iLIZIZ = C814420VxA.LIZIZ(motionEvent.getY(iFindPointerIndex));
                        int i2 = this.LLJI - iLIZIZ;
                        this.LLJI = iLIZIZ;
                        int iLIZIZ2 = C814420VxA.LIZIZ(motionEvent.getX(motionEvent.getActionIndex()));
                        int i3 = this.LLJ - iLIZIZ2;
                        this.LLJ = iLIZIZ2;
                        if (Math.abs(i2) > Math.abs(i3)) {
                            if (LIZLLL()) {
                                this.LLJILLL = true;
                            } else if (i2 > 0) {
                                int i4 = C19357010oC.LIZ[this.LLJJJ.ordinal()];
                                if ((i4 == 1 || i4 == 2) && !nestedChild.canScrollVertically(1) && getNestedScrollY() + i2 > 0) {
                                    z2 = true;
                                }
                                this.LLJILLL = z2;
                            } else if (i2 < 0) {
                                int i5 = C19357010oC.LIZ[this.LLJJJ.ordinal()];
                                if ((i5 == 1 || i5 == 3) && !nestedChild.canScrollVertically(-1) && getNestedScrollY() + i2 < 0) {
                                    z = true;
                                }
                                this.LLJILLL = z;
                            }
                        }
                    }
                }
            } else {
                this.LLJILLL = false;
                this.LLJI = 0;
                this.LLJ = 0;
                LJ();
            }
        } else {
            if (getNestedScrollY() == 0) {
                z3 = false;
            }
            this.LLJILLL = z3;
            if (LIZLLL()) {
                this.LLJILLL = false;
            }
            this.LLJIJIL = motionEvent.getPointerId(0);
            this.LLJI = C814420VxA.LIZIZ(motionEvent.getY());
            this.LLJ = C814420VxA.LIZIZ(motionEvent.getX());
        }
        return this.LLJILLL;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LLJJ) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.LLJIJIL) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i = 1;
                                }
                                this.LLJIJIL = motionEvent.getPointerId(i);
                                this.LLJI = C814420VxA.LIZIZ(motionEvent.getY(i));
                                this.LLJ = C814420VxA.LIZIZ(motionEvent.getX(i));
                            }
                        } else {
                            this.LLJIJIL = motionEvent.getPointerId(motionEvent.getActionIndex());
                            this.LLJI = C814420VxA.LIZIZ(motionEvent.getY(motionEvent.getActionIndex()));
                            this.LLJ = C814420VxA.LIZIZ(motionEvent.getX(motionEvent.getActionIndex()));
                        }
                    } else {
                        this.LLJILLL = false;
                        this.LLJI = 0;
                        this.LLJ = 0;
                        LJ();
                    }
                } else {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.LLJIJIL);
                    if (iFindPointerIndex < 0) {
                        return false;
                    }
                    int iLIZIZ = C814420VxA.LIZIZ(motionEvent.getY(iFindPointerIndex));
                    int i2 = this.LLJI - iLIZIZ;
                    this.LLJI = iLIZIZ;
                    LJFF(i2);
                }
            } else {
                this.LLJILLL = false;
                this.LLJI = 0;
                this.LLJ = 0;
                LJ();
            }
        } else {
            this.LLJIJIL = motionEvent.getPointerId(0);
            this.LLJI = C814420VxA.LIZIZ(motionEvent.getY());
            this.LLJ = C814420VxA.LIZIZ(motionEvent.getX());
            LIZ();
        }
        return this.LLJILLL;
    }

    public final void setBottomFadingListener(InterfaceC1115680f8g interfaceC1115680f8g) {
        this.LLJJIJIIJIL = interfaceC1115680f8g;
    }

    public final void setContentScrollWhenRefreshDone(boolean z) {
        this.LLJJIJIL = z;
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
        this.LLILZLL = c16fg;
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
            this.LLILZLL = null;
            LJI(false, false);
            this.LLL = false;
            scrollTo(0, 0);
            return;
        }
        View view = (View) this.LLILZLL;
        C16FG c16fg2 = this.LLILZLL;
        if (c16fg2 != null) {
            actualHeight = c16fg2.getActualHeight();
        } else {
            actualHeight = 0;
        }
        addView(view, 0, new ViewGroup.LayoutParams(-1, actualHeight));
        this.LLJLIL.LJI = (this.LLJJJJLIIL - 1) + c16fg.getActualHeight();
        C16FG c16fg3 = this.LLILZLL;
        if (c16fg3 != null) {
            actualHeight2 = c16fg3.getActualHeight();
        } else {
            actualHeight2 = 0;
        }
        scrollTo(0, actualHeight2);
        C16FG c16fg4 = this.LLILZLL;
        if (c16fg4 != null) {
            c16fg4.LIZIZ(this.LLJZIJLIL);
        }
    }

    public final void setOnHoverBottomListener(final Function0<Unit> function0) {
        this.LLJLL = new C16FO() { // from class: X.16FN
            @Override // X.C16FO
            public final void LIZ() {
                function0.invoke();
            }
        };
    }

    public final void setOnRefreshListener(InterfaceC1112920f4E interfaceC1112920f4E) {
        this.LLJLILLLLZIIL = interfaceC1112920f4E;
    }

    public final void setOnScrollChangeListener(final InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Boolean, Unit> interfaceC1631620sYq) {
        this.LLJJIJI = new InterfaceC19382710sL() { // from class: X.10qk
            @Override // X.InterfaceC19382710sL
            public final void LIZ(int i, int i2, boolean z) {
                interfaceC1631620sYq.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
            }
        };
    }

    public final void setOverScrollMode(EnumC19356910oB enumC19356910oB) {
        this.LLJJJ = enumC19356910oB;
    }

    public final void setRefreshing(boolean z) {
        LJI(z, false);
    }

    public final void setRubberBandCoefficient(float f) {
        this.LLJJL = f;
        this.LLJJJJJIL.LIZIZ = f;
    }

    public final void setScrollMode(EnumC584680MwU enumC584680MwU) {
        this.LLJJJIL = enumC584680MwU;
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
        this.LLILLL.LJIIJJI(i);
    }

    public final void setOnHoverBottomListener(C16FO c16fo) {
        this.LLJLL = c16fo;
    }

    public final void setOnScrollChangeListener(InterfaceC19382710sL interfaceC19382710sL) {
        this.LLJJIJI = interfaceC19382710sL;
    }

    public C16FJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setWillNotDraw(false);
        this.LLILZ = new int[2];
        EnumC19356910oB enumC19356910oB = EnumC19356910oB.NONE;
        this.LLJJJ = enumC19356910oB;
        EnumC584680MwU enumC584680MwU = EnumC584680MwU.NONE;
        this.LLJJJIL = enumC584680MwU;
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
        c21616519il.LIZJ(new InterfaceC20731416Am() { // from class: X.16FL
            @Override // X.InterfaceC20731416Am
            public final void LIZ(float f3, float f4) {
                C16FG nestedHeader;
                C16FG nestedHeader2;
                C16FJ c16fj = this.LIZ;
                c16fj.LLIZLLLIL = c16fj.LLJJJJJIL.LIZIZ(c16fj.getNestedScrollY());
                C16FG nestedHeader3 = this.LIZ.getNestedHeader();
                boolean z = true;
                if (nestedHeader3 != null) {
                    nestedHeader3.LIZ(this.LIZ.getNestedScrollY(), true);
                }
                C16FJ c16fj2 = this.LIZ;
                InterfaceC19382710sL interfaceC19382710sL = c16fj2.LLJJIJI;
                if (interfaceC19382710sL != null) {
                    interfaceC19382710sL.LIZ(c16fj2.getNestedScrollY(), this.LIZ.LLIZLLLIL, true);
                }
                C16FJ c16fj3 = this.LIZ;
                if (c16fj3.getNestedScrollY() >= 0) {
                    C16FJ c16fj4 = this.LIZ;
                    if (c16fj4.LLIZ && (nestedHeader2 = c16fj4.getNestedHeader()) != null) {
                        nestedHeader2.onHiddenChanged(true);
                    }
                    z = false;
                } else {
                    C16FJ c16fj5 = this.LIZ;
                    if (!c16fj5.LLIZ && (nestedHeader = c16fj5.getNestedHeader()) != null) {
                        nestedHeader.onHiddenChanged(false);
                    }
                }
                c16fj3.LLIZ = z;
                if (this.LIZ.getNestedScrollY() >= (-this.LIZ.getHeaderHeight())) {
                    this.LIZ.LLILZIL = false;
                }
            }
        });
        c21616519il.LIZIZ(new InterfaceC1427630nFp() { // from class: X.16FM
            @Override // X.InterfaceC1427630nFp
            public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z, float f3, float f4) {
                C16FJ c16fj = this.LIZ;
                c16fj.LLIZLLLIL = c16fj.LLJJJJJIL.LIZIZ(c16fj.getNestedScrollY());
            }
        });
        this.LLJLIL = c21616519il;
        this.LLJLLL = -1;
        if (getChildCount() <= 1) {
            this.LLILLJJLI = new C1317550kOH();
            this.LLILLL = new C1318260kPQ(this);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LiveMessageSpringLayout, 0, 0);
            this.LLJJJIL = typedArrayObtainStyledAttributes.getInt(R$styleable.LiveMessageSpringLayout_live_scrollMode, 0) == 1 ? EnumC584680MwU.REFRESH : enumC584680MwU;
            int i = typedArrayObtainStyledAttributes.getInt(R$styleable.LiveMessageSpringLayout_live_overScrollMode, 3);
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        enumC19356910oB = EnumC19356910oB.ONLY_BOTTOM;
                    }
                } else {
                    enumC19356910oB = EnumC19356910oB.ONLY_TOP;
                }
            }
            this.LLJJJ = enumC19356910oB;
            this.LLJJIII = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LiveMessageSpringLayout_live_forceHandleEventMode, false);
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Spring layout just have one child view");
    }

    public final void LJI(boolean z, boolean z2) {
        boolean z3;
        if (this.LLJZIJLIL == z) {
            return;
        }
        this.LLJZIJLIL = z;
        int i = 1;
        if (z) {
            if (!this.LLL) {
                InterfaceC1112920f4E interfaceC1112920f4E = this.LLJLILLLLZIIL;
                Boolean boolValueOf = null;
                if (interfaceC1112920f4E != null) {
                    C1111930f2d c1111930f2d = (C1111930f2d) interfaceC1112920f4E;
                    if (c1111930f2d.LLZZLLIL) {
                        z3 = false;
                    } else {
                        C1112000f2k c1112000f2k = c1111930f2d.LLJLLL;
                        if (!c1112000f2k.LIZ) {
                            if (!c1112000f2k.LIZIZ()) {
                                c1112000f2k.LIZ = false;
                                InterfaceC1112820f44 interfaceC1112820f44 = c1112000f2k.LJI;
                                if (interfaceC1112820f44 != null) {
                                    ((C1111930f2d) interfaceC1112820f44).LJLLI(new C1113010f4N(C13BV.INSTANCE, c1112000f2k.LIZIZ(), c1112000f2k.LIZ()));
                                }
                            }
                            LifecycleOwner lifecycleOwner = c1112000f2k.LJII;
                            if (lifecycleOwner != null) {
                                C500260Jjc.LJJJJJ(lifecycleOwner, null, new C1113000f4M(c1112000f2k, null), 3);
                            }
                        }
                        Iterator it2 = ((ArrayList) c1111930f2d.LL.LJ).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC1112020f2m) it2.next()).LJJIIJZLJL();
                        }
                        c1111930f2d.LLZZLLIL = true;
                        ((InterfaceC1112050f2p) c1111930f2d.mView).LJFF();
                        z3 = true;
                    }
                    boolValueOf = Boolean.valueOf(z3);
                }
                if (C500260Jjc.LJJIFFI(boolValueOf)) {
                    this.LLJZIJLIL = false;
                    return;
                }
                this.LLL = true;
                C16FG c16fg = this.LLILZLL;
                if (c16fg != null) {
                    c16fg.LIZIZ(true);
                    return;
                }
                return;
            }
            return;
        }
        if (this.LLL) {
            this.LLL = false;
            C16FG c16fg2 = this.LLILZLL;
            if (c16fg2 != null) {
                c16fg2.LIZIZ(false);
            }
            LIZ();
            if (this.LLJJIJIL && z2) {
                RecyclerView recyclerView = this.LL;
                if (recyclerView != null) {
                    HandlerHook.viewPost(recyclerView, new ARunnableS6S0111000_31(this, 0));
                    return;
                }
                return;
            }
            if (this.LLJILLL) {
                return;
            }
            if (getNestedScrollY() < 0) {
                i = -1;
            }
            LIZIZ(i, false, Float.valueOf(0.0f), false);
        }
    }

    public final boolean LJII(int i, int i2) {
        View nestedChild = getNestedChild();
        if (nestedChild != null) {
            if (LIZLLL() && Math.abs(i2) > Math.abs(i)) {
                return true;
            }
            float f = i2;
            if (f > 0.0f) {
                int i3 = C19357010oC.LIZ[this.LLJJJ.ordinal()];
                if ((i3 != 1 && i3 != 2) || nestedChild.canScrollVertically(1) || getNestedScrollY() + i2 <= 0) {
                    return false;
                }
                return true;
            }
            if (f < -0.0f) {
                int i4 = C19357010oC.LIZ[this.LLJJJ.ordinal()];
                if ((i4 == 1 || i4 == 3) && !nestedChild.canScrollVertically(-1) && getNestedScrollY() + i2 < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.LLILLL.LIZIZ(f, f2);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
        this.LLILLJJLI.LIZIZ(i);
        this.LLJJ = false;
        if (i == 0) {
            LJ();
        }
        stopNestedScroll(i);
    }

    @Override // X.InterfaceC20097013kG
    public final boolean startNestedScroll(int i, int i2) {
        return this.LLILLL.LJIIJ(i, i2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LLILLL.LIZ(f, f2, z);
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

    public final void LIZIZ(int i, boolean z, Float f, boolean z2) {
        float yVelocity;
        LIZ();
        if (i != 0) {
            VelocityTracker velocityTracker = this.LLJJI;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LLJJJJ);
            }
            if (f != null) {
                yVelocity = f.floatValue();
            } else {
                VelocityTracker velocityTracker2 = this.LLJJI;
                if (velocityTracker2 != null) {
                    yVelocity = velocityTracker2.getYVelocity(this.LLJIJIL);
                } else {
                    yVelocity = 0.0f;
                }
                if (i >= 0 ? yVelocity < 0.0f : yVelocity > 0.0f) {
                    yVelocity = -yVelocity;
                }
            }
            C21616519il c21616519il = this.LLJLIL;
            if (i < 0 && this.LLJJJIL == EnumC584680MwU.REFRESH && z && ((getNestedScrollY() < (-getHeaderHeight()) || this.LLL) && !this.LLILZIL)) {
                c21616519il.LJJ.LIZIZ(this.LLJL);
                c21616519il.LJJ.LJIIIIZZ = 0.0f;
                if (!this.LLL) {
                    LJI(true, false);
                }
                this.LLILZIL = true;
            } else {
                int nestedScrollY = getNestedScrollY();
                int i2 = this.LLJLLL;
                if (1 <= i2 && i2 <= nestedScrollY && z) {
                    c21616519il.LJJ.LIZIZ(this.LLJL);
                    c21616519il.LJJ.LJIIIIZZ = this.LLJLLL;
                    if (!this.LLJZ) {
                        setHoverAtBottom(true);
                    }
                } else if (!z2) {
                    c21616519il.LJJ.LJIIIIZZ = getHeaderHeight();
                    c21616519il.LJJ.LIZIZ(10000.0f);
                } else {
                    c21616519il.LJJ.LIZIZ(this.LLJL);
                    c21616519il.LJJ.LJIIIIZZ = 0.0f;
                    LJI(true, false);
                }
            }
            c21616519il.LIZ = yVelocity / 2.0f;
            getScrollY();
            c21616519il.LJIIIZ();
        }
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
        this.LLILLJJLI.LIZ(i, i2);
        startNestedScroll(2, i2);
        if (!this.LLJJIII) {
            this.LLJJ = true;
        }
        if (i2 == 0 && this.LLJJ) {
            LIZ();
        }
    }

    @Override // X.InterfaceC1318370kPb
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        getNestedScrollY();
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.LLILLL.LJ(i, i2, i3, i4, iArr);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int headerHeight = getHeaderHeight();
        Object obj = this.LLILZLL;
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    @Override // X.InterfaceC1318370kPb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNestedPreScroll(android.view.View r3, int r4, int r5, int[] r6, int r7) {
        /*
            r2 = this;
            boolean r0 = r2.LLJJ
            if (r0 == 0) goto L3c
            boolean r0 = r2.LLJJIII
            if (r0 != 0) goto L3c
            int r0 = r2.getNestedScrollY()
            if (r0 == 0) goto L39
            int r0 = r2.getNestedScrollY()
            if (r0 >= 0) goto L3d
            int r0 = r2.getNestedScrollY()
            int r0 = r0 + r5
            if (r0 < 0) goto L20
            int r0 = r2.getNestedScrollY()
        L1f:
            int r5 = -r0
        L20:
            int r0 = r2.getNestedScrollY()
            r1 = 1
            if (r0 <= 0) goto L32
            boolean r0 = r3.canScrollVertically(r1)
            if (r0 == 0) goto L32
            int r0 = r2.getNestedScrollY()
            int r5 = -r0
        L32:
            r6[r1] = r5
            if (r7 != 0) goto L39
            r2.LJFF(r5)
        L39:
            r2.getNestedScrollY()
        L3c:
            return
        L3d:
            int r0 = r2.getNestedScrollY()
            int r0 = r0 + r5
            if (r0 > 0) goto L20
            int r0 = r2.getNestedScrollY()
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16FJ.onNestedPreScroll(android.view.View, int, int, int[], int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.LLILZ);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, i5, this.LLILZ);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        if (this.LLJJ && !this.LLJJIII && i4 != 0 && getNestedScrollY() == 0) {
            if (i4 >= 0 ? this.LLJJJ != EnumC19356910oB.ONLY_BOTTOM : this.LLJJJ != EnumC19356910oB.ONLY_TOP) {
                if (this.LLJJJ != EnumC19356910oB.ALWAYS) {
                    return;
                }
            }
            if (i5 == 0) {
                LJFF(i4);
                return;
            }
            boolean z = true;
            if (i5 != 1 || i2 == 0) {
                return;
            }
            if (i4 < 0) {
                i6 = -1;
            } else {
                i6 = 1;
            }
            if (!this.LLL && !this.LLJZ) {
                z = false;
            }
            LIZIZ(i6, z, null, false);
        }
    }
}
