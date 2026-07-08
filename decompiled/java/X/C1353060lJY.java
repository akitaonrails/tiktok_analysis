package X;

import Y.AAListenerS332S0100000_21;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.services.IAIPhotoCommentService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lJY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1353060lJY extends FrameLayout implements InterfaceC1318530kPr, InterfaceC1353160lJi {
    public static final C1353080lJa LLLLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLJI;
    public static final C1085640eME<Rect> LLLLL;
    public int LL;
    public InterfaceC1350190lEv LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public boolean LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public boolean LLJJJ;
    public ObjectAnimator LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public InterfaceC679410Qkt LLJJL;
    public InterfaceC1350210lEx LLJJLIIIJLLLLLLLZ;
    public InterfaceC1353150lJh LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C1353110lJd LLJLL;
    public boolean LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public InterfaceC1353130lJf LLL;
    public final C01GW LLLF;
    public View LLLFF;
    public final C01GW LLLFFI;
    public InterfaceC1258040iqI LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public final C01GW LLLIIIIL;
    public final List<View> LLLIIIL;
    public final List<Integer> LLLIIL;
    public RecyclerView LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public String LLLJ;
    public boolean LLLJIL;
    public boolean LLLJL;
    public boolean LLLL;
    public final Set<InterfaceC1350270lF3> LLLLII;
    public Function1<? super Boolean, Unit> LLLLIIIILLL;
    public final AAListenerS332S0100000_21 LLLLIIL;
    public final AAListenerS332S0100000_21 LLLLIILL;
    public final boolean LLLLIILLL;
    public int LLLLIL;
    public boolean LLLLILI;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C1353060lJY.class, "mTouchScrollingChild", "getMTouchScrollingChild()Z", 0);
        C13LE.LIZ.getClass();
        LLLLJI = new InterfaceC2217461Bqa[]{c2217371BqR};
        LLLLJ = new C1353080lJa();
        LLLLL = new C1085640eME<>(12);
    }

    @Override // X.InterfaceC1353160lJi
    public final void LIZIZ() {
    }

    public final void LJIIJJI() {
        this.LLJJJ = false;
        setMTouchScrollingChild(false);
        this.LLLI = false;
        this.LLLII = false;
        this.LLJJ = 0.0f;
        this.LLLILZLLLI = false;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC1318530kPr
    public final void onNestedScrollAccepted(View view, View view2, int i) {
    }

    private final int getBottomTabHeightInPx() {
        return ((Number) this.LLJLIL.getValue()).intValue();
    }

    private final C1066370dr9 getHandleView() {
        return (C1066370dr9) this.LLLIIIIL.getValue();
    }

    private final View getImmersiveTitleBar() {
        return (View) this.LLJZ.getValue();
    }

    private final boolean getMAnimating() {
        return this.LLLILZ || this.LLLIZZ;
    }

    private final View getMCommentBgContainer() {
        return (View) this.LLLF.getValue();
    }

    private final View getMCommentListContainer() {
        return (View) this.LLLFFI.getValue();
    }

    private final float getMMaximumVelocity() {
        return ((Number) this.LLILZLL.getValue()).floatValue();
    }

    private final float getMMinimumVelocity() {
        return ((Number) this.LLILZIL.getValue()).floatValue();
    }

    private final View getMPlaceholder() {
        return (View) this.LLJLLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getMTouchScrollingChild() {
        C1353110lJd c1353110lJd = this.LLJLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLJI;
        return ((Boolean) c1353110lJd.LL).booleanValue();
    }

    private final int getMTouchSlop() {
        return ((Number) this.LLILZ.getValue()).intValue();
    }

    private final VelocityTracker getMVelocityTracker() {
        return (VelocityTracker) this.LLIZ.getValue();
    }

    private final LinearLayout getNestedLinearLayout() {
        return (LinearLayout) this.LLJZIJLIL.getValue();
    }

    private final RecyclerView getRecyclerView() {
        if (this.LLLIILIL == null) {
            this.LLLIILIL = (RecyclerView) findViewById(R.id.t0h);
        }
        return this.LLLIILIL;
    }

    private final int getStatusBarHeight() {
        return ((Number) this.LLJLILLLLZIIL.getValue()).intValue();
    }

    private final float getSwipeDownTransitionYRatio() {
        C01GW c01gw = C276120Ary.LIZ;
        return (((Number) c01gw.getValue()).intValue() == 1 || ((Number) c01gw.getValue()).intValue() == 2) ? 1.5f : 2.0f;
    }

    private final float getSwipeRightSpeedLimit() {
        if (((Number) C276120Ary.LIZ.getValue()).intValue() == 1) {
            return 550.0f;
        }
        return getMMinimumVelocity();
    }

    public final boolean LJIIIIZZ() {
        if (!this.LLLIZZ) {
            if (this.LLLILZ) {
                return false;
            }
            if (LJI()) {
                if (getTranslationX() >= this.LLJJIJI) {
                    return false;
                }
            } else if (getTranslationY() >= this.LLJJIII) {
                return false;
            }
        }
        return !C0BJM.LIZ() || getVisibility() == 0;
    }

    public final void LJIIJ() {
        InterfaceC679410Qkt interfaceC679410Qkt = this.LLJJL;
        if (interfaceC679410Qkt != null) {
            interfaceC679410Qkt.LLJLL(Math.max(0.0f, this.LLJJIII - getTranslationY()), this.LLJJIII);
        }
    }

    public final View getCommentContainer() {
        if (this.LLLFF == null) {
            this.LLLFF = findViewById(R.id.i4h);
        }
        return this.LLLFF;
    }

    public final ViewConfiguration getMViewConfiguration() {
        return (ViewConfiguration) this.LLILLL.getValue();
    }

    public final RecyclerView getScrollingChild() {
        RecyclerView recyclerView;
        InterfaceC1258040iqI interfaceC1258040iqI = this.LLLFZ;
        View viewLJJLIIIJILLIZJL = interfaceC1258040iqI != null ? interfaceC1258040iqI.LJJLIIIJILLIZJL() : null;
        return (!(viewLJJLIIIJILLIZJL instanceof RecyclerView) || (recyclerView = (RecyclerView) viewLJJLIIIJILLIZJL) == null) ? getRecyclerView() : recyclerView;
    }

    public final boolean LJI() {
        return getNestedLinearLayout().getOrientation() == 0;
    }

    public final View getPlaceHolderView() {
        return getMPlaceholder();
    }

    public final boolean getBackFromVideo() {
        return this.LLJJJJ;
    }

    public final boolean getEasterEggShowing() {
        return this.LLJJJJJIL;
    }

    public final boolean getEnableSwipeDown() {
        return this.LLJJJJLIIL;
    }

    public final boolean getHaveBangs() {
        return this.LLLLIILLL;
    }

    public final int getNotchHeight() {
        return this.LLLLIL;
    }

    public final InterfaceC679410Qkt getOnShowHeightChangeListener() {
        return this.LLJJL;
    }

    public final InterfaceC1350210lEx getOnShowWidthChangeListener() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final List<View> getRequireInterceptChildList() {
        return this.LLLIIIL;
    }

    public final InterfaceC1258040iqI getScrollableContainer() {
        return this.LLLFZ;
    }

    public final boolean getStoryCommentMode() {
        return this.LLJLLIL;
    }

    private final void setMTouchScrollingChild(boolean z) {
        setValue(this, LLLLJI[0], Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1353160lJi
    public final void LIZ(InterfaceC1353150lJh interfaceC1353150lJh) {
        this.LLJL = interfaceC1353150lJh;
    }

    public final void LJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hide comment page ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        IAIPhotoCommentService iAIPhotoCommentService = (IAIPhotoCommentService) PluggableExtentionKt.pluggableSpi$default(IAIPhotoCommentService.class, false, false, false, 14, null);
        if (iAIPhotoCommentService != null && iAIPhotoCommentService.LIZJ()) {
            iAIPhotoCommentService.LIZ();
        } else if (!this.LLJJJJ) {
            C1349590lDx.LJIILIIL = SystemClock.elapsedRealtime();
            LIZJ(str, false, true);
        } else {
            this.LLJJJJ = false;
        }
    }

    public final void LJFF(boolean z) {
        ObjectAnimator objectAnimator;
        if (z && LJIIIIZZ()) {
            LJIIIZ(new C1350070lEj(EnumC1349980lEa.HIDE_START));
        }
        ObjectAnimator objectAnimator2 = this.LLJJJIL;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.LLJJJIL) != null) {
            objectAnimator.cancel();
        }
        C786410Ut5.z(this, 8);
        if (LJI()) {
            float f = this.LLJJIJI;
            if (f > 0.0f) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setTranslationX(f);
            }
        } else if (this.LLJJIII > 0.0f) {
            C786410Ut5.Ad(this, this.LLJJIII);
        }
        LJIIJJI();
        setStateInternal(1);
    }

    public final void LJIIIZ(C1350070lEj c1350070lEj) {
        Iterator<InterfaceC1350270lF3> it2 = this.LLLLII.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(c1350070lEj);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (LJIIIIZZ() && keyEvent != null && keyEvent.getKeyCode() == 4 && this.LLLJIL) {
            this.LLLJL = true;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.LLIZLLLIL = getMAnimating();
        }
        if (this.LLIZLLLIL && !getMAnimating() && motionEvent.getActionMasked() == 2) {
            motionEvent.setAction(0);
            this.LLIZLLLIL = false;
        }
        if (getVisibility() == 8) {
            return false;
        }
        if (this.LLJLLIL && LJII(motionEvent, getMPlaceholder())) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0R7C c0r7cLLJJJJ = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLJJJJ();
        getContext();
        if (c0r7cLLJJJJ.LIZJ()) {
            if (LJI()) {
                this.LLJJIII = getMeasuredHeight();
                this.LLJJIJI = getMeasuredWidth() - getMPlaceholder().getMeasuredWidth();
            } else {
                this.LLJJIII = getMeasuredHeight() - getMPlaceholder().getMeasuredHeight();
                float measuredWidth = getMeasuredWidth();
                this.LLJJIJI = measuredWidth;
                this.LLJJIJIIJIL = this.LLJJIII / measuredWidth;
            }
            if (this.LLJJIJIL < 0.0f) {
                float f = this.LLJJIII;
                if (f > 0.0f) {
                    this.LLJJIJIL = f;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x;
        float x2;
        boolean zCanScrollHorizontally;
        boolean zLJII;
        Boolean boolValueOf;
        if (this.LLJJJJLIIL && !this.LLJLLIL && !this.LLJJJJJIL) {
            Boolean boolValueOf2 = null;
            if (motionEvent.getActionMasked() == 0) {
                LJIIJJI();
                float x3 = motionEvent.getX();
                this.LLJ = x3;
                this.LLJIJIL = x3;
                float y = motionEvent.getY();
                this.LLJI = y;
                this.LLJILJIL = y;
                this.LLJILJILJ = motionEvent.getRawY();
                this.LLJILLL = motionEvent.getRawX();
                motionEvent.getRawX();
                motionEvent.getRawY();
                getMVelocityTracker().clear();
                getMVelocityTracker().addMovement(motionEvent);
                this.LLLI = LJII(motionEvent, getMPlaceholder());
                Iterator it2 = ((ArrayList) this.LLLIIIL).iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    if (LJII(motionEvent, (View) it2.next())) {
                        z = true;
                    }
                }
                Iterator it3 = ((ArrayList) this.LLLIIL).iterator();
                while (it3.hasNext()) {
                    if (LJII(motionEvent, findViewById(((Number) it3.next()).intValue()))) {
                        z = true;
                    }
                }
                this.LLLII = z;
                if (C1343170l3b.LIZ) {
                    if (!LJII(motionEvent, getImmersiveTitleBar()) && LJII(motionEvent, getScrollingChild())) {
                        zLJII = true;
                    } else {
                        zLJII = false;
                    }
                } else {
                    zLJII = LJII(motionEvent, getScrollingChild());
                }
                setMTouchScrollingChild(zLJII);
                InterfaceC1353130lJf interfaceC1353130lJf = this.LLL;
                if (interfaceC1353130lJf != null) {
                    RecyclerView scrollingChild = getScrollingChild();
                    if (scrollingChild != null) {
                        boolValueOf = Boolean.valueOf(scrollingChild.canScrollVertically(-1));
                    } else {
                        boolValueOf = null;
                    }
                    if (interfaceC1353130lJf.LIZIZ(motionEvent, boolValueOf)) {
                        InterfaceC1353130lJf interfaceC1353130lJf2 = this.LLL;
                        if (interfaceC1353130lJf2 != null) {
                            interfaceC1353130lJf2.LIZ(motionEvent);
                        }
                        this.LLLLILI = true;
                    }
                }
            }
            if (getMAnimating()) {
                return true;
            }
            if (getVisibility() != 0) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            if (motionEvent.getActionMasked() == 3) {
                LJIIJJI();
            }
            if (motionEvent.getActionMasked() == 1) {
                LJIIJJI();
            }
            if (this.LLLII) {
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 2) {
                    float y2 = motionEvent.getY() - this.LLJILJIL;
                    if (C426750GoL.LIZLLL(getContext())) {
                        x = this.LLJIJIL;
                        x2 = motionEvent.getX();
                    } else {
                        x = motionEvent.getX();
                        x2 = this.LLJIJIL;
                    }
                    float f = x - x2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onInterceptTouchEvent move diffx ");
                    sbLIZ.append(f);
                    sbLIZ.append(" diffy");
                    sbLIZ.append(y2);
                    sbLIZ.append(" mTouchPlaceholderChild ");
                    sbLIZ.append(this.LLLI);
                    C2188811AlT.LIZIZ(sbLIZ);
                    Object obj = this.LLJL;
                    if (obj != null) {
                        View view = (View) obj;
                        if (f > 0.0f) {
                            zCanScrollHorizontally = view.canScrollHorizontally(-1);
                        } else {
                            zCanScrollHorizontally = view.canScrollHorizontally(1);
                        }
                        if (zCanScrollHorizontally) {
                            return false;
                        }
                    }
                    if (f > 0.0f) {
                        C01GW c01gw = C276120Ary.LIZ;
                        if (((Number) c01gw.getValue()).intValue() != 1 ? Math.abs(f) > Math.abs(y2) : ((double) Math.abs(f)) * 0.5d > Math.abs(y2)) {
                            if (Math.abs(f) > getMTouchSlop() && this.LLLILZJ && (((Number) c01gw.getValue()).intValue() == 1 || this.LLLILZLLLI)) {
                                this.LLLIIII = true;
                                return true;
                            }
                        }
                    }
                    InterfaceC1353130lJf interfaceC1353130lJf3 = this.LLL;
                    if (interfaceC1353130lJf3 != null) {
                        RecyclerView scrollingChild2 = getScrollingChild();
                        if (scrollingChild2 != null) {
                            boolValueOf2 = Boolean.valueOf(scrollingChild2.canScrollVertically(-1));
                        }
                        if (interfaceC1353130lJf3.LIZIZ(motionEvent, boolValueOf2) && y2 > 0.0f && Math.abs(y2) > getMTouchSlop() && !this.LLLIIII) {
                            return true;
                        }
                    }
                    this.LLLIIII = false;
                    if (this.LLLI) {
                        return false;
                    }
                    float y3 = this.LLJILJIL - motionEvent.getY();
                    if (!getMTouchScrollingChild() && (this.LLJJJ || Math.abs(y3) > getMTouchSlop())) {
                        this.LLJJJ = true;
                        return true;
                    }
                    if (getMTouchScrollingChild() && this.LLLIL && Math.abs(y3) > getMTouchSlop()) {
                        return true;
                    }
                }
            } else {
                if (this.LLLI) {
                    return false;
                }
                if (C426750GoL.LIZLLL(getContext())) {
                    if (motionEvent.getX() > ((double) this.LLJJIJI) * 0.9d) {
                        this.LLLILZLLLI = true;
                    }
                } else if (motionEvent.getX() < ((double) this.LLJJIJI) * 0.1d) {
                    this.LLLILZLLLI = true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.LLJJJJLIIL && !this.LLJLLIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onStopNestedScroll touchback ");
            sbLIZ.append(this.LLLIIII);
            sbLIZ.append(", threshold height ");
            sbLIZ.append(this.LLJJIII / 2);
            sbLIZ.append("  tra:");
            sbLIZ.append(getTranslationY());
            C2188811AlT.LIZIZ(sbLIZ);
            float swipeDownTransitionYRatio = getSwipeDownTransitionYRatio();
            boolean z = true;
            if (this.LLLIIII) {
                if (getTranslationY() * swipeDownTransitionYRatio >= this.LLJJIII) {
                    z = false;
                }
                LIZJ("slide_right", z, false);
            } else {
                if (getTranslationY() * swipeDownTransitionYRatio >= this.LLJJIII) {
                    z = false;
                }
                LIZJ("slide_down", z, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x02b1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1353060lJY.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setBackFromVideo(boolean z) {
        this.LLJJJJ = z;
    }

    public final void setCommentContainer(View view) {
        this.LLLFF = view;
    }

    public final void setEasterEggShowing(boolean z) {
        this.LLJJJJJIL = z;
    }

    public final void setEnableSwipeDown(boolean z) {
        this.LLJJJJLIIL = z;
    }

    public final void setEnableSwipeRightToClose(boolean z) {
        this.LLLILZJ = z;
    }

    public final void setGrabTouchDelegate(InterfaceC1353130lJf interfaceC1353130lJf) {
        if (interfaceC1353130lJf != null) {
            this.LLL = interfaceC1353130lJf;
        }
    }

    public final void setMIsFocus(boolean z) {
        if (this.LLLL ^ z) {
            setFocusable(z);
            setFocusableInTouchMode(z);
            if (z) {
                requestFocus();
            } else {
                clearFocus();
            }
            this.LLLL = z;
        }
    }

    public final void setNotchHeight(int i) {
        this.LLLLIL = i;
    }

    public final void setOnScrollStateChangedListener(InterfaceC1350190lEv interfaceC1350190lEv) {
        this.LLILLJJLI = interfaceC1350190lEv;
    }

    public final void setOnShowHeightChangeListener(InterfaceC679410Qkt interfaceC679410Qkt) {
        this.LLJJL = interfaceC679410Qkt;
    }

    public final void setOnShowWidthChangeListener(InterfaceC1350210lEx interfaceC1350210lEx) {
        this.LLJJLIIIJLLLLLLLZ = interfaceC1350210lEx;
    }

    public final void setOrientation(int i) {
        getNestedLinearLayout().setOrientation(i);
    }

    public final void setPreScrollChangeListener(Function1<? super Boolean, Unit> function1) {
        this.LLLLIIIILLL = function1;
    }

    public final void setScrollableContainer(InterfaceC1258040iqI interfaceC1258040iqI) {
        this.LLLFZ = interfaceC1258040iqI;
    }

    public final void setShowKeyboard(boolean z) {
        this.LLLJIL = z;
        setMIsFocus(!z);
    }

    public final void setStateInternal(int i) {
        int i2 = this.LL;
        if (i2 == i) {
            return;
        }
        InterfaceC1350190lEv interfaceC1350190lEv = this.LLILLJJLI;
        if (interfaceC1350190lEv != null) {
            interfaceC1350190lEv.LIZ(i2, i);
        }
        this.LL = i;
    }

    public final void setStoryCommentMode(boolean z) {
        if (z) {
            this.LLJLLIL = z;
            C786410Ut5.I7(null, getMPlaceholder());
            C786410Ut5.R7(getNestedLinearLayout(), null);
            return;
        }
        this.LLJLLIL = false;
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        InterfaceC1350210lEx interfaceC1350210lEx = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1350210lEx != null) {
            interfaceC1350210lEx.LIZ(Math.max(0.0f, this.LLJJIJI - f), this.LLJJIJI);
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        InterfaceC679410Qkt interfaceC679410Qkt = this.LLJJL;
        if (interfaceC679410Qkt != null) {
            interfaceC679410Qkt.LLJLL(Math.max(0.0f, this.LLJJIII - f), this.LLJJIII);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0lJd] */
    public C1353060lJY(final Context context, AttributeSet attributeSet) {
        float fLIZ;
        super(context, attributeSet, 0);
        boolean z = false;
        this.LL = 1;
        this.LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(context, 1292));
        this.LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1291));
        this.LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1289));
        this.LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1288));
        this.LLIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(469));
        this.LLJJIJIL = -1.0f;
        C497820Jfg.LIZ(context);
        this.LLJJJJLIIL = true;
        this.LLJLIL = C452501pT.LIZIZ(new AwS548S0100000_4(context, 451));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 155));
        final Boolean bool = Boolean.FALSE;
        this.LLJLL = new C0NTU<Boolean>(bool) { // from class: X.0lJd
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                int iComputeVerticalScrollExtent;
                int iComputeVerticalScrollRange;
                if (((Boolean) obj).booleanValue() ^ ((Boolean) obj2).booleanValue()) {
                    C1353060lJY c1353060lJY = this;
                    boolean z2 = false;
                    if (c1353060lJY.getScrollingChild() != null) {
                        RecyclerView scrollingChild = this.getScrollingChild();
                        if (scrollingChild != null) {
                            iComputeVerticalScrollExtent = scrollingChild.computeVerticalScrollExtent();
                        } else {
                            iComputeVerticalScrollExtent = 0;
                        }
                        RecyclerView scrollingChild2 = this.getScrollingChild();
                        if (scrollingChild2 != null) {
                            iComputeVerticalScrollRange = scrollingChild2.computeVerticalScrollRange();
                        } else {
                            iComputeVerticalScrollRange = 0;
                        }
                        if (iComputeVerticalScrollExtent >= iComputeVerticalScrollRange) {
                            z2 = true;
                        }
                    }
                    c1353060lJY.LLLIL = z2;
                }
            }
        };
        this.LLJLLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1290));
        this.LLJZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1285));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1293));
        this.LLLF = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1286));
        this.LLLFFI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1287));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1284));
        this.LLLIIIL = new ArrayList();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.id.fgq));
        if (C2279851ELn.LIZIZ() || ((Number) C1179704jT.LIZ.getValue()).intValue() > 0) {
            arrayList.add(Integer.valueOf(R.id.hi4));
            arrayList.add(Integer.valueOf(R.id.g8_));
        }
        this.LLLIIL = arrayList;
        this.LLLJ = "";
        this.LLLLII = new LinkedHashSet();
        this.LLLLIIL = new AAListenerS332S0100000_21(this, 7);
        this.LLLLIILL = new AAListenerS332S0100000_21(this, 6);
        setMIsFocus(true);
        setOnKeyListener(new View.OnKeyListener() { // from class: X.0lJb
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                ISearchService iSearchService;
                if (!this.LL.getEnableSwipeDown() || (((iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null)) != null && iSearchService.LLLLLLIL(context)) || !this.LL.LJIIIIZZ() || i != 4 || this.LL.LLLJL)) {
                    C1353060lJY c1353060lJY = this.LL;
                    boolean z2 = c1353060lJY.LLLJL;
                    c1353060lJY.LLLJL = false;
                    return z2;
                }
                if (keyEvent.getAction() == 1) {
                    this.LL.LJ("back_pressed");
                }
                return true;
            }
        });
        if (C0SXF.LJIL(context)) {
            if (C426750GoL.LIZLLL(getContext())) {
                fLIZ = -C339190DRl.LIZ(365.0f);
            } else {
                fLIZ = C339190DRl.LIZ(365.0f);
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationX(fLIZ);
        }
        if (C2077408Bw.LIZIZ(getContext()) && C14LC.LJIILL == 0) {
            z = true;
        }
        this.LLLLIILLL = z;
        this.LLLLIL = C14LC.LIZLLL(context);
    }

    public final boolean LJII(MotionEvent motionEvent, View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        C1085640eME<Rect> c1085640eME = LLLLL;
        Rect rectLIZIZ = c1085640eME.LIZIZ();
        if (rectLIZIZ == null) {
            rectLIZIZ = new Rect();
        }
        C1292450jjn.LIZ(rectLIZIZ, view, this);
        try {
            boolean zContains = rectLIZIZ.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            rectLIZIZ.setEmpty();
            c1085640eME.LIZ(rectLIZIZ);
            return zContains;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            rectLIZIZ.setEmpty();
            LLLLL.LIZ(rectLIZIZ);
            throw th;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (LJI()) {
            this.LLJJIII = getMeasuredHeight();
            this.LLJJIJI = getMeasuredWidth() - getMPlaceholder().getMeasuredWidth();
        } else {
            this.LLJJIII = getMeasuredHeight() - getMPlaceholder().getMeasuredHeight();
            float measuredWidth = getMeasuredWidth();
            this.LLJJIJI = measuredWidth;
            this.LLJJIJIIJIL = this.LLJJIII / measuredWidth;
        }
        if (this.LLJJIJIL < 0.0f) {
            float f = this.LLJJIII;
            if (f > 0.0f) {
                this.LLJJIJIL = f;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1353060lJY.LIZJ(java.lang.String, boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        boolean z;
        if (!this.LLJJJJLIIL || this.LLJLLIL || ((view instanceof InterfaceC1354050lL9) && ((InterfaceC1354050lL9) view).computeVerticalScrollOffset() != 0)) {
            return false;
        }
        if (f2 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        LIZJ("slide_down", z, false);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStartNestedScroll nestedScrollAxes ");
        sbLIZ.append(view);
        sbLIZ.append(' ');
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        Iterator<View> it2 = this.LLLIIIL.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            if (it2.next().getId() == view.getId()) {
                z = false;
            }
        }
        Iterator<Integer> it3 = this.LLLIIL.iterator();
        while (it3.hasNext()) {
            if (it3.next().intValue() == view.getId()) {
                z = false;
            }
        }
        if (!this.LLJLLIL && (view2 instanceof InterfaceC1338650kwJ) && (i & 2) != 0 && z) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (this.LLJJJJLIIL && !this.LLJLLIL) {
            float translationY = getTranslationY();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onNestedPreScroll dx:");
            sbLIZ.append(i);
            sbLIZ.append("  dy:");
            sbLIZ.append(i2);
            sbLIZ.append("  translationY:");
            sbLIZ.append(translationY);
            C2188811AlT.LIZIZ(sbLIZ);
            setStateInternal(2);
            int iComputeVerticalScrollOffset = 0;
            float f = 0.0f;
            if (this.LLLIIII) {
                if (translationY > 0.0f) {
                    float f2 = translationY - i;
                    if (f2 >= 0.0f) {
                        f = f2;
                    }
                    float f3 = this.LLJJIII;
                    if (f > f3) {
                        f = f3;
                    }
                    C786410Ut5.Ad(this, f);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onNestedPreScroll mTouchBack translationY:");
                    sbLIZ2.append(getTranslationY());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    if (getMTouchScrollingChild() && !this.LLLIL) {
                        iArr[1] = iArr[1] + i;
                        return;
                    }
                    return;
                }
                if (translationY != 0.0f) {
                    return;
                }
                if (view instanceof InterfaceC1354050lL9) {
                    iComputeVerticalScrollOffset = ((InterfaceC1354050lL9) view).computeVerticalScrollOffset();
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onNestedPreScroll ty=0 dy:");
                sbLIZ3.append(i2);
                sbLIZ3.append(" offsetY:");
                sbLIZ3.append(iComputeVerticalScrollOffset);
                sbLIZ3.append(" mTouchScrollingChild:");
                sbLIZ3.append(getMTouchScrollingChild());
                sbLIZ3.append("mHeight:");
                sbLIZ3.append(this.LLJJIII);
                C2188811AlT.LIZIZ(sbLIZ3);
                if (i >= 0) {
                    return;
                }
                float f4 = translationY - i;
                if (f4 >= 0.0f) {
                    f = f4;
                }
                C786410Ut5.Ad(this, f);
                return;
            }
            if (translationY > 0.0f) {
                float f5 = translationY - i2;
                if (f5 >= 0.0f) {
                    f = f5;
                }
                float f6 = this.LLJJIII;
                if (f > f6) {
                    f = f6;
                }
                C786410Ut5.Ad(this, f);
                if (getMTouchScrollingChild() && !this.LLLIL) {
                    iArr[1] = iArr[1] + i2;
                    return;
                }
                return;
            }
            if (translationY == 0.0f) {
                if (view instanceof InterfaceC1354050lL9) {
                    iComputeVerticalScrollOffset = ((InterfaceC1354050lL9) view).computeVerticalScrollOffset();
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("onNestedPreScroll ty=0 dy:");
                sbLIZ4.append(i2);
                sbLIZ4.append(" offsetY:");
                sbLIZ4.append(iComputeVerticalScrollOffset);
                sbLIZ4.append(" mTouchScrollingChild:");
                sbLIZ4.append(getMTouchScrollingChild());
                sbLIZ4.append("  mHeight:");
                sbLIZ4.append(this.LLJJIII);
                C2188811AlT.LIZIZ(sbLIZ4);
                if (i2 < 0) {
                    if (iComputeVerticalScrollOffset == 0 || !getMTouchScrollingChild()) {
                        float f7 = translationY - i2;
                        float f8 = this.LLJJIII;
                        if (f7 > f8) {
                            f7 = f8;
                        }
                        C786410Ut5.Ad(this, f7);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNestedScroll dyConsumed ");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
