package X;

import Y.AAListenerS343S0100000_33;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19eY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21590419eY extends LinearLayout implements InterfaceC1318530kPr {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public static final C1085640eME<Rect> LLJZ;
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public boolean LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public boolean LLJILJILJ;
    public ObjectAnimator LLJILLL;
    public InterfaceC679410Qkt LLJJ;
    public InterfaceC21590819ec LLJJI;
    public View.OnClickListener LLJJIII;
    public final C21590619ea LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public boolean LLJJJ;
    public final C01GW LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public Function1<? super Boolean, Unit> LLJJL;
    public Function1<? super Boolean, Unit> LLJJLIIIJLLLLLLLZ;
    public final AAListenerS343S0100000_33 LLJL;
    public final AAListenerS343S0100000_33 LLJLIL;
    public final boolean LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C21590419eY.class, "mTouchScrollingChild", "getMTouchScrollingChild()Z", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217371BqR};
        LLJZ = new C1085640eME<>(12);
    }

    public final void LIZJ() {
        this.LLJILJILJ = false;
        setMTouchScrollingChild(false);
        this.LLJJJ = false;
        this.LLJIJIL = 0.0f;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC1318530kPr
    public final void onNestedScrollAccepted(View view, View view2, int i) {
    }

    private final boolean getMAnimating() {
        return this.LLJJJJ || this.LLJJJJJIL;
    }

    private final View getMCommentBgContainer() {
        return (View) this.LLJJIJIL.getValue();
    }

    private final float getMMaximumVelocity() {
        return ((Number) this.LLILZ.getValue()).floatValue();
    }

    private final float getMMinimumVelocity() {
        return ((Number) this.LLILLL.getValue()).floatValue();
    }

    private final ViewGroup getMPlaceholder() {
        return (ViewGroup) this.LLJJIJIIJIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getMTouchScrollingChild() {
        C21590619ea c21590619ea = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        return ((Boolean) c21590619ea.LL).booleanValue();
    }

    private final int getMTouchSlop() {
        return ((Number) this.LLILLJJLI.getValue()).intValue();
    }

    private final VelocityTracker getMVelocityTracker() {
        return (VelocityTracker) this.LLILZIL.getValue();
    }

    public final C1338610kwF getMScrollingChild() {
        return (C1338610kwF) this.LLJJJIL.getValue();
    }

    public final ViewConfiguration getMViewConfiguration() {
        return (ViewConfiguration) this.LL.getValue();
    }

    public final boolean getHaveBangs() {
        return this.LLJLILLLLZIIL;
    }

    public final int getHeightOffset() {
        return this.LLJLLIL;
    }

    public final InterfaceC679410Qkt getMOnShowHeightChangeListener() {
        return this.LLJJ;
    }

    public final int getNotchHeight() {
        return this.LLJLL;
    }

    public final View.OnClickListener getOnCancelListener() {
        return this.LLJJIII;
    }

    public final InterfaceC21590819ec getOnDialogListener() {
        return this.LLJJI;
    }

    private final void setMTouchScrollingChild(boolean z) {
        setValue(this, LLJLLL[0], Boolean.valueOf(z));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.LLILZLL = getMAnimating();
        }
        if (this.LLILZLL && !getMAnimating() && motionEvent.getActionMasked() == 2) {
            motionEvent.setAction(0);
            this.LLILZLL = false;
        }
        if (getVisibility() == 8) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            LIZJ();
            this.LLIZ = motionEvent.getX();
            float y = motionEvent.getY();
            this.LLIZLLLIL = y;
            this.LLJ = y;
            this.LLJI = motionEvent.getRawY();
            getMVelocityTracker().clear();
            getMVelocityTracker().addMovement(motionEvent);
            this.LLJJJ = LIZIZ(motionEvent, getMPlaceholder());
            setMTouchScrollingChild(LIZIZ(motionEvent, getMScrollingChild()));
        }
        if (getMAnimating()) {
            return true;
        }
        if (getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 3) {
            LIZJ();
        }
        if (motionEvent.getActionMasked() == 1) {
            LIZJ();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                if (this.LLJJJ) {
                    return false;
                }
                float y2 = this.LLJ - motionEvent.getY();
                if (!getMTouchScrollingChild() && (this.LLJILJILJ || Math.abs(y2) > getMTouchSlop())) {
                    this.LLJILJILJ = true;
                    return true;
                }
            }
        } else if (this.LLJJJ) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStopNestedScroll: ");
        sbLIZ.append(getTranslationY());
        sbLIZ.append("  ");
        float f = 2;
        boolean z2 = true;
        if (getTranslationY() * f < this.LLJILJIL) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (getTranslationY() * f >= this.LLJILJIL) {
            z2 = false;
        }
        LIZ(z2, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (getMAnimating()) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    onStopNestedScroll(this);
                    LIZJ();
                }
            } else if (!getMTouchScrollingChild()) {
                getMVelocityTracker().addMovement(motionEvent);
                float x = this.LLIZ - motionEvent.getX();
                float y = this.LLIZLLLIL - motionEvent.getY();
                if (this.LLJILJILJ || Math.abs(y) > getMTouchSlop()) {
                    this.LLJILJILJ = true;
                    onNestedPreScroll(getMScrollingChild(), (int) x, (int) y, new int[]{0, 0});
                    Function1<? super Boolean, Unit> function1 = this.LLJJLIIIJLLLLLLLZ;
                    if (function1 != null) {
                        function1.invoke(Boolean.TRUE);
                    }
                }
                this.LLJIJIL = motionEvent.getRawY() - this.LLJI;
                this.LLJI = motionEvent.getRawY();
                return true;
            }
            return true;
        }
        VelocityTracker mVelocityTracker = getMVelocityTracker();
        mVelocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, getMMaximumVelocity());
        if (Math.abs(mVelocityTracker.getYVelocity()) > getMMinimumVelocity() && !getMAnimating()) {
            if (this.LLJIJIL < 0.0f) {
                z = true;
            } else {
                z = false;
            }
            LIZ(z, false);
        } else {
            onStopNestedScroll(this);
        }
        LIZJ();
        return true;
    }

    public final void setHeightOffset(int i) {
        this.LLJLLIL = i;
    }

    public final void setMIsFocus(boolean z) {
        if (this.LLJJJJLIIL ^ z) {
            setFocusable(z);
            setFocusableInTouchMode(z);
            if (z) {
                requestFocus();
            } else {
                clearFocus();
            }
            this.LLJJJJLIIL = z;
        }
    }

    public final void setMOnShowHeightChangeListener(InterfaceC679410Qkt interfaceC679410Qkt) {
        this.LLJJ = interfaceC679410Qkt;
    }

    public final void setNotchHeight(int i) {
        this.LLJLL = i;
    }

    public final void setOnCancelListener(View.OnClickListener onClickListener) {
        this.LLJJIII = onClickListener;
    }

    public final void setOnDialogListener(InterfaceC21590819ec interfaceC21590819ec) {
        this.LLJJI = interfaceC21590819ec;
    }

    public final void setPreScrollChangeListener(Function1<? super Boolean, Unit> function1) {
        this.LLJJLIIIJLLLLLLLZ = function1;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        InterfaceC679410Qkt interfaceC679410Qkt = this.LLJJ;
        if (interfaceC679410Qkt != null) {
            float f2 = this.LLJILJIL;
            interfaceC679410Qkt.LLJLL(f2 - f, f2);
        }
    }

    public final void setVisibleChangedListener(Function1<? super Boolean, Unit> function1) {
        this.LLJJL = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.19ea] */
    public C21590419eY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        boolean z = false;
        this.LL = C452501pT.LIZIZ(new AwS577S0100000_33(context, 4097));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4103));
        this.LLILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4100));
        this.LLILZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4099));
        this.LLILZIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(608));
        final Boolean bool = Boolean.FALSE;
        this.LLJJIJI = new C0NTU<Boolean>(bool) { // from class: X.19ea
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                if (((Boolean) obj).booleanValue() ^ ((Boolean) obj2).booleanValue()) {
                    C21590419eY c21590419eY = this;
                    c21590419eY.getMScrollingChild().computeVerticalScrollExtent();
                    this.getMScrollingChild().computeVerticalScrollRange();
                    c21590419eY.getClass();
                }
            }
        };
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4101));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4098));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4102));
        this.LLJL = new AAListenerS343S0100000_33(this, 17);
        this.LLJLIL = new AAListenerS343S0100000_33(this, 16);
        setMIsFocus(true);
        setOnKeyListener(new View.OnKeyListener() { // from class: X.19eZ
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                C21590419eY c21590419eY = this.LL;
                if ((!c21590419eY.LLJJJJJIL && (c21590419eY.LLJJJJ || c21590419eY.getTranslationY() >= c21590419eY.LLJILJIL)) || i != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    this.LL.LIZ(false, true);
                }
                return true;
            }
        });
        if (C2077408Bw.LIZIZ(getContext()) && C14LC.LJIILL == 0) {
            z = true;
        }
        this.LLJLILLLLZIIL = z;
        this.LLJLL = C14LC.LIZLLL(context);
        this.LLJLLIL = C341940Daq.LIZ(8.0d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        if (getVisibility() == 8) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(boolean r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21590419eY.LIZ(boolean, boolean):void");
    }

    public final boolean LIZIZ(MotionEvent motionEvent, View view) {
        if (view.getVisibility() != 0) {
            return false;
        }
        C1085640eME<Rect> c1085640eME = LLJZ;
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
            LLJZ.LIZ(rectLIZIZ);
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLJILJIL = getMeasuredHeight() - getMPlaceholder().getMeasuredHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        boolean z;
        if ((view instanceof InterfaceC1354050lL9) && ((InterfaceC1354050lL9) view).computeVerticalScrollOffset() != 0) {
            return false;
        }
        if (getTranslationY() * 2 < this.LLJILJIL) {
            z = true;
        } else {
            z = false;
        }
        LIZ(z, false);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((view2 instanceof InterfaceC1338650kwJ) && (i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        float translationY = getTranslationY();
        float f = 0.0f;
        if (translationY > 0.0f) {
            float f2 = translationY - i2;
            if (f2 >= 0.0f) {
                f = f2;
            }
            float f3 = this.LLJILJIL;
            if (f > f3) {
                f = f3;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationY(f);
            if (getMTouchScrollingChild()) {
                iArr[1] = iArr[1] + i2;
                return;
            }
            return;
        }
        int iComputeVerticalScrollOffset = 0;
        if (translationY != 0.0f) {
            return;
        }
        if (view instanceof InterfaceC1354050lL9) {
            iComputeVerticalScrollOffset = ((InterfaceC1354050lL9) view).computeVerticalScrollOffset();
        }
        if (i2 >= 0) {
            return;
        }
        if (iComputeVerticalScrollOffset != 0 && getMTouchScrollingChild()) {
            return;
        }
        float f4 = translationY - i2;
        float f5 = this.LLJILJIL;
        if (f4 > f5) {
            f4 = f5;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setTranslationY(f4);
    }
}
