package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;
import u4.q0;

/* JADX INFO: renamed from: X.19ho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21610619ho extends ViewGroup implements InterfaceC1318530kPr, InterfaceC1338650kwJ, InterfaceC1581880rGc {
    public static final int[] LLLII = {R.attr.enabled};
    public View LL;
    public InterfaceC1581920rGg LLILLJJLI;
    public InterfaceC1581910rGf LLILLL;
    public boolean LLILZ;
    public final int LLILZIL;
    public float LLILZLL;
    public boolean LLIZ;
    public float LLIZLLLIL;
    public final C1317550kOH LLJ;
    public final C1318260kPQ LLJI;
    public final int[] LLJIJIL;
    public final int[] LLJILJIL;
    public boolean LLJILJILJ;
    public final int LLJILLL;
    public int LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public boolean LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final DecelerateInterpolator LLJJJ;
    public C20745216Fu LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public float LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public C21610719hp LLJL;
    public C21611619hy LLJLIL;
    public C21611719hz LLJLILLLLZIIL;
    public C21611319hv LLJLL;
    public C21611319hv LLJLLIL;
    public C21611419hw LLJLLL;
    public boolean LLJZ;
    public int LLJZIJLIL;
    public boolean LLL;
    public InterfaceC20294814b4 LLLF;
    public final AnimationAnimationListenerC21611019hs LLLFF;
    public final C21611119ht LLLFFI;
    public final C21611519hx LLLFZ;
    public final C21611819i0 LLLI;

    public void setOnSwipeChangeListener(InterfaceC21611919i1 interfaceC21611919i1) {
    }

    private void LIZJ() {
        if (this.LL == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.LLJJJIL)) {
                    this.LL = childAt;
                    return;
                }
            }
        }
    }

    public final boolean LIZIZ() {
        InterfaceC20294814b4 interfaceC20294814b4 = this.LLLF;
        return interfaceC20294814b4 != null ? interfaceC20294814b4.LIZ() : this.LL.canScrollVertically(-1);
    }

    public final void LJII() {
        LIZIZ(true);
        this.LLJJJIL.clearAnimation();
        this.LLJL.stop();
        LJI(false);
        LIZ(this.LLJJJIL, 8);
        setColorViewAlpha(255);
        if (this.LLJJIJIL) {
            setAnimationProgress(0.0f);
        } else {
            LJIIIZ(this.LLJJL - this.LLJJ);
        }
        this.LLJJ = this.LLJJJIL.getTop();
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1317550kOH c1317550kOH = this.LLJ;
        return c1317550kOH.LIZIZ | c1317550kOH.LIZ;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.LLJI.LJIIIIZZ(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LLJI.LIZLLL;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.LLJI.LJIIJJI(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJII();
    }

    @Override // X.InterfaceC1581880rGc
    public final boolean LJJIIJZLJL() {
        return this.LLILZ;
    }

    public InterfaceC20294814b4 getOnChildScrollUpCallback() {
        return this.LLLF;
    }

    public int getProgressCircleDiameter() {
        return this.LLJZIJLIL;
    }

    public int getProgressViewEndOffset() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public int getProgressViewStartOffset() {
        return this.LLJJL;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.19hw, android.view.animation.Animation] */
    private void LIZLLL(float f) {
        AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd;
        if (f > this.LLILZLL) {
            LJIIIIZZ(true, true);
            return;
        }
        this.LLILZ = false;
        C21610719hp c21610719hp = this.LLJL;
        C21610819hq c21610819hq = c21610719hp.LLILLJJLI;
        c21610819hq.LJ = 0.0f;
        c21610819hq.LIZ();
        C21610819hq c21610819hq2 = c21610719hp.LLILLJJLI;
        c21610819hq2.LJFF = 0.0f;
        c21610819hq2.LIZ();
        if (!this.LLJJIJIL) {
            animationAnimationListenerC2189531Amd = new AnimationAnimationListenerC2189531Amd(this, 3);
        } else {
            animationAnimationListenerC2189531Amd = null;
        }
        int i = this.LLJJ;
        C21611819i0 c21611819i0 = this.LLLI;
        c21611819i0.getClass();
        AnimationAnimationListenerC2189521Amc animationAnimationListenerC2189521Amc = new AnimationAnimationListenerC2189521Amc(c21611819i0, animationAnimationListenerC2189531Amd, 0);
        LIZIZ(false);
        if (this.LLJJIJIL) {
            this.LLJJJJJIL = i;
            this.LLJJJJLIIL = this.LLJJJIL.getScaleX();
            ?? r2 = new Animation() { // from class: X.19hw
                @Override // android.view.animation.Animation
                public final void applyTransformation(float f2, Transformation transformation) {
                    C21610619ho c21610619ho = this.LL;
                    float f3 = c21610619ho.LLJJJJLIIL;
                    c21610619ho.setAnimationProgress(f3 + ((-f3) * f2));
                    this.LL.LJFF(f2);
                }
            };
            this.LLJLLL = r2;
            r2.setDuration(150L);
            C20745216Fu c20745216Fu = this.LLJJJIL;
            c20745216Fu.LL = animationAnimationListenerC2189521Amc;
            c20745216Fu.clearAnimation();
            this.LLJJJIL.startAnimation(this.LLJLLL);
        } else {
            this.LLJJJJJIL = i;
            reset();
            setDuration(200L);
            setInterpolator(this.LLJJJ);
            C20745216Fu c20745216Fu2 = this.LLJJJIL;
            c20745216Fu2.LL = animationAnimationListenerC2189521Amc;
            c20745216Fu2.clearAnimation();
            this.LLJJJIL.startAnimation(this.LLLFZ);
        }
        C21610819hq c21610819hq3 = this.LLJL.LLILLJJLI;
        if (!c21610819hq3.LJIILJJIL) {
            return;
        }
        c21610819hq3.LJIILJJIL = false;
        c21610819hq3.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.19hv, android.view.animation.Animation] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.19hv, android.view.animation.Animation] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void LJ(float f) {
        int i;
        C21611319hv c21611319hv;
        C21611319hv c21611319hv2;
        C21610819hq c21610819hq = this.LLJL.LLILLJJLI;
        if (!c21610819hq.LJIILJJIL) {
            c21610819hq.LJIILJJIL = true;
            c21610819hq.LIZ();
        }
        float fMin = Math.min(1.0f, Math.abs(f / this.LLILZLL));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.LLILZLL;
        if (this.LLL) {
            i = this.LLJJLIIIJLLLLLLLZ - this.LLJJL;
        } else {
            i = this.LLJJLIIIJLLLLLLLZ;
        }
        float f2 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.LLJJL + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        if (this.LLJJJIL.getVisibility() != 0) {
            LJI(true);
            LIZ(this.LLJJJIL, 0);
        }
        if (!this.LLJJIJIL) {
            C786410Ut5.Ob(this.LLJJJIL, 1.0f);
            C786410Ut5.pc(this.LLJJJIL, 1.0f);
        }
        if (this.LLJJIJIL) {
            setAnimationProgress(Math.min(1.0f, f / this.LLILZLL));
        }
        if (f < this.LLILZLL) {
            final int i3 = 76;
            if (this.LLJL.LLILLJJLI.LJIJJ > 76 && ((c21611319hv2 = this.LLJLL) == null || !c21611319hv2.hasStarted() || c21611319hv2.hasEnded())) {
                final int i4 = this.LLJL.LLILLJJLI.LJIJJ;
                ?? r1 = new Animation() { // from class: X.19hv
                    @Override // android.view.animation.Animation
                    public final void applyTransformation(float f3, Transformation transformation) {
                        C21610719hp c21610719hp = this.LLILLL.LLJL;
                        c21610719hp.LLILLJJLI.LJIJJ = (int) (i4 + ((i3 - r2) * f3));
                    }
                };
                r1.setDuration(300L);
                C20745216Fu c20745216Fu = this.LLJJJIL;
                c20745216Fu.LL = null;
                c20745216Fu.clearAnimation();
                this.LLJJJIL.startAnimation(r1);
                this.LLJLL = r1;
            }
        } else {
            final int i5 = 255;
            if (this.LLJL.LLILLJJLI.LJIJJ < 255 && ((c21611319hv = this.LLJLLIL) == null || !c21611319hv.hasStarted() || c21611319hv.hasEnded())) {
                final int i6 = this.LLJL.LLILLJJLI.LJIJJ;
                ?? r12 = new Animation() { // from class: X.19hv
                    @Override // android.view.animation.Animation
                    public final void applyTransformation(float f3, Transformation transformation) {
                        C21610719hp c21610719hp = this.LLILLL.LLJL;
                        c21610719hp.LLILLJJLI.LJIJJ = (int) (i6 + ((i5 - r2) * f3));
                    }
                };
                r12.setDuration(300L);
                C20745216Fu c20745216Fu2 = this.LLJJJIL;
                c20745216Fu2.LL = null;
                c20745216Fu2.clearAnimation();
                this.LLJJJIL.startAnimation(r12);
                this.LLJLLIL = r12;
            }
        }
        C21610719hp c21610719hp = this.LLJL;
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        C21610819hq c21610819hq2 = c21610719hp.LLILLJJLI;
        c21610819hq2.LJ = 0.0f;
        c21610819hq2.LIZ();
        C21610819hq c21610819hq3 = c21610719hp.LLILLJJLI;
        c21610819hq3.LJFF = fMin2;
        c21610819hq3.LIZ();
        C21610719hp c21610719hp2 = this.LLJL;
        float fMin3 = Math.min(1.0f, fMax);
        C21610819hq c21610819hq4 = c21610719hp2.LLILLJJLI;
        if (fMin3 != c21610819hq4.LJIILLIIL) {
            c21610819hq4.LJIILLIIL = fMin3;
            c21610819hq4.LIZ();
        }
        C21610819hq c21610819hq5 = this.LLJL.LLILLJJLI;
        c21610819hq5.LJI = (((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f;
        c21610819hq5.LIZ();
        LJIIIZ(i2 - this.LLJJ);
        LIZIZ(false);
    }

    private void LJIIJ(float f) {
        float f2 = this.LLJJIII;
        float f3 = f - f2;
        int i = this.LLILZIL;
        if (f3 > i && !this.LLJJIJI) {
            this.LLJJI = f2 + i;
            this.LLJJIJI = true;
            this.LLJL.LLILLJJLI.LJIJJ = 76;
        }
    }

    private void setColorViewAlpha(int i) {
        this.LLJJJIL.getBackground().setAlpha(i);
        this.LLJL.LLILLJJLI.LJIJJ = i;
    }

    public final void LJFF(float f) {
        LJIIIZ((this.LLJJJJJIL + ((int) ((this.LLJJL - r1) * f))) - this.LLJJJIL.getTop());
    }

    public final void LJI(boolean z) {
        if (this.LLILLL != null) {
            if (z) {
                if (this.LLJJJIL.getVisibility() != 0) {
                    this.LLILLL.onVisible();
                }
            } else {
                if (this.LLJJJIL.getVisibility() == 4) {
                    return;
                }
                this.LLILLL.onInvisible();
            }
        }
    }

    public final void LJIIIZ(int i) {
        this.LLJJJIL.bringToFront();
        this.LLJJJIL.offsetTopAndBottom(i);
        this.LLJJ = this.LLJJJIL.getTop();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r4.LIZJ()
            int r2 = r5.getActionMasked()
            boolean r0 = r4.isEnabled()
            r3 = 0
            if (r0 == 0) goto L84
            boolean r0 = r4.LIZIZ()
            if (r0 != 0) goto L84
            boolean r0 = r4.LLILZ
            if (r0 != 0) goto L84
            boolean r0 = r4.LLJILJILJ
            if (r0 != 0) goto L84
            if (r2 == 0) goto L5c
            r0 = 1
            r1 = -1
            if (r2 == r0) goto L57
            r0 = 2
            if (r2 == r0) goto L43
            r0 = 3
            if (r2 == r0) goto L57
            r0 = 6
            if (r2 != r0) goto L40
            int r2 = r5.getActionIndex()
            int r1 = r5.getPointerId(r2)
            int r0 = r4.LLJJIJIIJIL
            if (r1 != r0) goto L40
            if (r2 != 0) goto L3a
            r3 = 1
        L3a:
            int r0 = r5.getPointerId(r3)
            r4.LLJJIJIIJIL = r0
        L40:
            boolean r0 = r4.LLJJIJI
            return r0
        L43:
            int r0 = r4.LLJJIJIIJIL
            if (r0 != r1) goto L48
            return r3
        L48:
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L4f
            return r3
        L4f:
            float r0 = r5.getY(r0)
            r4.LJIIJ(r0)
            goto L40
        L57:
            r4.LLJJIJI = r3
            r4.LLJJIJIIJIL = r1
            goto L40
        L5c:
            int r1 = r4.LLJJL
            X.16Fu r0 = r4.LLJJJIL
            int r0 = r0.getTop()
            int r1 = r1 - r0
            r4.LJIIIZ(r1)
            int r0 = r5.getPointerId(r3)
            r4.LLJJIJIIJIL = r0
            r4.LLJJIJI = r3
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L7d
            float r0 = r5.getY()
            r4.LLJJIII = r0
            goto L40
        L7d:
            float r0 = r5.getY(r0)
            r4.LLJJIII = r0
            goto L40
        L84:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21610619ho.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.LLJ.LIZIZ(0);
        this.LLJILJILJ = false;
        float f = this.LLIZLLLIL;
        if (f > 0.0f) {
            LIZLLL(f);
            this.LLIZLLLIL = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (!isEnabled() || LIZIZ() || this.LLILZ || this.LLJILJILJ) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == this.LLJJIJIIJIL) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    this.LLJJIJIIJIL = motionEvent.getPointerId(i);
                                }
                            }
                        } else {
                            int actionIndex2 = motionEvent.getActionIndex();
                            if (actionIndex2 < 0) {
                                return false;
                            }
                            this.LLJJIJIIJIL = motionEvent.getPointerId(actionIndex2);
                            return true;
                        }
                    }
                } else {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.LLJJIJIIJIL);
                    if (iFindPointerIndex < 0) {
                        return false;
                    }
                    float y = motionEvent.getY(iFindPointerIndex);
                    LJIIJ(y);
                    if (this.LLJJIJI) {
                        float f = (y - this.LLJJI) * 0.5f;
                        if (f > 0.0f) {
                            LJ(f);
                            return true;
                        }
                        LJ(0.0f);
                        return false;
                    }
                }
                return true;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(this.LLJJIJIIJIL);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            if (this.LLJJIJI) {
                float y2 = (motionEvent.getY(iFindPointerIndex2) - this.LLJJI) * 0.5f;
                this.LLJJIJI = false;
                LIZLLL(y2);
            }
            this.LLJJIJIIJIL = -1;
            return false;
        }
        this.LLJJIJIIJIL = motionEvent.getPointerId(0);
        this.LLJJIJI = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        C786410Ut5.Ob(this.LLJJJIL, f);
        C786410Ut5.pc(this.LLJJJIL, f);
    }

    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        LIZJ();
        C21610719hp c21610719hp = this.LLJL;
        C21610819hq c21610819hq = c21610719hp.LLILLJJLI;
        c21610819hq.LJIIIZ = iArr;
        c21610819hq.LIZIZ(0);
        c21610719hp.LLILLJJLI.LIZIZ(0);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C446980Hfs.LIZ(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.LLILZLL = i;
    }

    public void setDoNotCatchException(boolean z) {
        this.LLIZ = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            LJII();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LLJI.LJIIIZ(z);
    }

    public void setOnChildScrollUpCallback(InterfaceC20294814b4 interfaceC20294814b4) {
        this.LLLF = interfaceC20294814b4;
    }

    @Override // X.InterfaceC1581880rGc
    public void setOnRefreshListener(InterfaceC1581920rGg interfaceC1581920rGg) {
        this.LLILLJJLI = interfaceC1581920rGg;
    }

    @Override // X.InterfaceC1581880rGc
    public void setOnVisibleListener(InterfaceC1581910rGf interfaceC1581910rGf) {
        this.LLILLL = interfaceC1581910rGf;
    }

    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.LLJJJIL.setBackgroundColor(i);
        this.LLJL.LLILLJJLI.LJIL = i;
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C446980Hfs.LIZ(getContext(), i));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.19hy, android.view.animation.Animation] */
    @Override // X.InterfaceC1581880rGc
    public void setRefreshing(boolean z) {
        int i;
        if (z && this.LLILZ != z) {
            this.LLILZ = z;
            if (!this.LLL) {
                i = this.LLJJLIIIJLLLLLLLZ + this.LLJJL;
            } else {
                i = this.LLJJLIIIJLLLLLLLZ;
            }
            LJIIIZ(i - this.LLJJ);
            this.LLJZ = false;
            AnimationAnimationListenerC21611019hs animationAnimationListenerC21611019hs = this.LLLFF;
            LJI(true);
            LIZ(this.LLJJJIL, 0);
            this.LLJL.LLILLJJLI.LJIJJ = 255;
            ?? r2 = new Animation() { // from class: X.19hy
                @Override // android.view.animation.Animation
                public final void applyTransformation(float f, Transformation transformation) {
                    this.LL.setAnimationProgress(f);
                }
            };
            this.LLJLIL = r2;
            r2.setDuration(this.LLJILLL);
            if (animationAnimationListenerC21611019hs != null) {
                this.LLJJJIL.LL = animationAnimationListenerC21611019hs;
            }
            this.LLJJJIL.clearAnimation();
            this.LLJJJIL.startAnimation(this.LLJLIL);
            return;
        }
        LJIIIIZZ(z, false);
    }

    public void setSize(int i) {
        if (i != 0 && i != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i == 0) {
            this.LLJZIJLIL = (int) (displayMetrics.density * 56.0f);
        } else {
            this.LLJZIJLIL = (int) (displayMetrics.density * 40.0f);
        }
        this.LLJJJIL.setImageDrawable(null);
        this.LLJL.LIZJ(i);
        this.LLJJJIL.setImageDrawable(this.LLJL);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.LLJI.LJIIJ(i, 0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.19hs] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.19ht] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.19hx] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.19i0] */
    public C21610619ho(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZLL = -1.0f;
        this.LLJIJIL = new int[2];
        this.LLJILJIL = new int[2];
        this.LLJJIJIIJIL = -1;
        this.LLJJJJ = -1;
        this.LLLFF = new Animation.AnimationListener() { // from class: X.19hs
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                InterfaceC1581920rGg interfaceC1581920rGg;
                C21610619ho c21610619ho = this.LIZ;
                if (c21610619ho.LLILZ) {
                    c21610619ho.LLLI.LIZIZ(false);
                    C21610719hp c21610719hp = this.LIZ.LLJL;
                    c21610719hp.LLILLJJLI.LJIJJ = 255;
                    c21610719hp.start();
                    C21610619ho c21610619ho2 = this.LIZ;
                    if (c21610619ho2.LLJZ && (interfaceC1581920rGg = c21610619ho2.LLILLJJLI) != null) {
                        interfaceC1581920rGg.LJFF();
                    }
                    C21610619ho c21610619ho3 = this.LIZ;
                    c21610619ho3.LLJJ = c21610619ho3.LLJJJIL.getTop();
                    return;
                }
                c21610619ho.LJII();
            }
        };
        this.LLLFFI = new Animation() { // from class: X.19ht
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                int iAbs;
                C21610619ho c21610619ho = this.LL;
                if (!c21610619ho.LLL) {
                    iAbs = c21610619ho.LLJJLIIIJLLLLLLLZ - Math.abs(c21610619ho.LLJJL);
                } else {
                    iAbs = c21610619ho.LLJJLIIIJLLLLLLLZ;
                }
                C21610619ho c21610619ho2 = this.LL;
                this.LL.LJIIIZ((c21610619ho2.LLJJJJJIL + ((int) ((iAbs - r1) * f))) - c21610619ho2.LLJJJIL.getTop());
                float f2 = 1.0f - f;
                C21610819hq c21610819hq = this.LL.LLJL.LLILLJJLI;
                if (f2 != c21610819hq.LJIILLIIL) {
                    c21610819hq.LJIILLIIL = f2;
                    c21610819hq.LIZ();
                }
            }
        };
        this.LLLFZ = new Animation() { // from class: X.19hx
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                this.LL.LJFF(f);
            }
        };
        this.LLLI = new AbstractC21610319hl() { // from class: X.19i0
            @Override // X.AbstractC21610319hl
            public final void LIZ() {
            }
        };
        this.LLILZIL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLJILLL = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.LLJJJ = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.LLJZIJLIL = (int) (displayMetrics.density * 40.0f);
        this.LLJJJIL = new C20745216Fu(getContext());
        C21610719hp c21610719hp = new C21610719hp(getContext(), this);
        this.LLJL = c21610719hp;
        c21610719hp.LLILLJJLI.LJIL = -328966;
        this.LLJJJIL.setImageDrawable(c21610719hp);
        LIZ(this.LLJJJIL, 8);
        addView(this.LLJJJIL);
        q0.LJIJJLI(this);
        int i = (int) (displayMetrics.density * 64.0f);
        this.LLJJLIIIJLLLLLLLZ = i;
        this.LLILZLL = i;
        this.LLJ = new C1317550kOH();
        this.LLJI = new C1318260kPQ(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.LLJZIJLIL;
        this.LLJJ = i2;
        this.LLJJL = i2;
        LJFF(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LLLII);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void LIZ(C20745216Fu c20745216Fu, int i) {
        int visibility = c20745216Fu.getVisibility();
        c20745216Fu.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c20745216Fu);
    }

    private void LJIIIIZZ(boolean z, boolean z2) {
        getClass();
        if (this.LLILZ != z) {
            this.LLJZ = z2;
            LIZJ();
            this.LLILZ = z;
            if (z) {
                int i = this.LLJJ;
                AnimationAnimationListenerC21611019hs animationAnimationListenerC21611019hs = this.LLLFF;
                LIZIZ(false);
                this.LLJJJJJIL = i;
                reset();
                setDuration(200L);
                setInterpolator(this.LLJJJ);
                if (animationAnimationListenerC21611019hs != null) {
                    this.LLJJJIL.LL = animationAnimationListenerC21611019hs;
                }
                this.LLJJJIL.clearAnimation();
                this.LLJJJIL.startAnimation(this.LLLFFI);
                return;
            }
            AnimationAnimationListenerC21611019hs animationAnimationListenerC21611019hs2 = this.LLLFF;
            C21611719hz c21611719hz = new C21611719hz(this);
            this.LLJLILLLLZIIL = c21611719hz;
            c21611719hz.setDuration(150L);
            C20745216Fu c20745216Fu = this.LLJJJIL;
            c20745216Fu.LL = animationAnimationListenerC21611019hs2;
            c20745216Fu.clearAnimation();
            this.LLJJJIL.startAnimation(this.LLJLILLLLZIIL);
        }
    }

    @Override // X.InterfaceC1581880rGc
    public final void LJJIIZ(int i, int i2) {
        this.LLJJIJIL = false;
        this.LLJJL = i;
        this.LLJJLIIIJLLLLLLLZ = i2;
        this.LLL = true;
        LJII();
        this.LLILZ = false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.LLJI.LIZIZ(f, f2);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.LLJJJJ;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        if (i2 >= i3) {
            return i2 + 1;
        }
        return i2;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean zLJI = MethodIDManager.LJI(71751);
        super.onMeasure(i, i2);
        if (this.LL == null) {
            LIZJ();
        }
        View view = this.LL;
        if (view == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        try {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            CrashlyticsWrapperService.LIZLLL().LIZJ(e);
            C1AF0.LJFF(e, "SwipeRefreshLayout");
            if (this.LLIZ) {
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                throw e;
            }
        }
        this.LLJJJIL.measure(View.MeasureSpec.makeMeasureSpec(this.LLJZIJLIL, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LLJZIJLIL, 1073741824));
        this.LLJJJJ = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= getChildCount()) {
                break;
            }
            if (getChildAt(i3) == this.LLJJJIL) {
                this.LLJJJJ = i3;
                break;
            }
            i3++;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LLJI.LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC1318530kPr
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.LLJ.LIZ(i, 0);
        startNestedScroll(i & 2);
        this.LLIZLLLIL = 0.0f;
        this.LLJILJILJ = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if (isEnabled() && !this.LLILZ && (i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.LLJI.LIZJ(i, i2, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.LLIZLLLIL;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.LLIZLLLIL = 0.0f;
                } else {
                    this.LLIZLLLIL = f - f2;
                    iArr[1] = i2;
                }
                LJ(this.LLIZLLLIL);
            }
        }
        if (this.LLL && i2 > 0 && this.LLIZLLLIL == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            LJI(false);
            LIZ(this.LLJJJIL, 8);
        }
        int[] iArr2 = this.LLJIJIL;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.LLJI.LJ(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Exception {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.LL == null) {
            LIZJ();
        }
        View view = this.LL;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        try {
            view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CrashlyticsWrapperService.LIZLLL().LIZJ(e);
            C1AF0.LJFF(e, "SwipeRefreshLayout");
            if (this.LLIZ) {
                throw e;
            }
        }
        int measuredWidth2 = this.LLJJJIL.getMeasuredWidth();
        int measuredHeight2 = this.LLJJJIL.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.LLJJ;
        this.LLJJJIL.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.LLJILJIL);
        if (i4 + this.LLJILJIL[1] < 0 && !LIZIZ()) {
            float fAbs = this.LLIZLLLIL + Math.abs(r6);
            this.LLIZLLLIL = fAbs;
            LJ(fAbs);
        }
    }
}
