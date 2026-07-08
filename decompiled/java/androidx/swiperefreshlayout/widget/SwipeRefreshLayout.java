package androidx.swiperefreshlayout.widget;

import X.AnimationAnimationListenerC2189531Amd;
import X.C1317550kOH;
import X.C1318260kPQ;
import X.C14K9;
import X.C1602160rnK;
import X.C20745316Fv;
import X.C21582219dE;
import X.C21582319dF;
import X.C21582419dG;
import X.C21582519dH;
import X.C21582619dI;
import X.C21582719dJ;
import X.C21582819dK;
import X.C446980Hfs;
import X.InterfaceC1318530kPr;
import X.InterfaceC1338650kwJ;
import X.InterfaceC1572870r25;
import X.InterfaceC21582919dL;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
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
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes34.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC1318530kPr, InterfaceC1338650kwJ {
    public static final int[] LLJZIJLIL = {R.attr.enabled};
    public View LL;
    public InterfaceC1572870r25 LLILLJJLI;
    public boolean LLILLL;
    public final int LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public final C1317550kOH LLIZ;
    public final C1318260kPQ LLIZLLLIL;
    public final int[] LLJ;
    public final int[] LLJI;
    public boolean LLJIJIL;
    public final int LLJILJIL;
    public int LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public boolean LLJJI;
    public int LLJJIII;
    public final DecelerateInterpolator LLJJIJI;
    public C20745316Fv LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public final int LLJJJIL;
    public final int LLJJJJ;
    public int LLJJJJJIL;
    public C21582219dE LLJJJJLIIL;
    public C21582719dJ LLJJL;
    public C21582819dK LLJJLIIIJLLLLLLLZ;
    public C21582519dH LLJL;
    public C21582519dH LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;
    public final AnimationAnimationListenerC2189531Amd LLJLLIL;
    public final C21582419dG LLJLLL;
    public final C21582619dI LLJZ;

    public void setOnChildScrollUpCallback(InterfaceC21582919dL interfaceC21582919dL) {
    }

    public final boolean LIZ() {
        View view = this.LL;
        return view instanceof ListView ? ((AbsListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void LIZIZ() {
        if (this.LL == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.LLJJIJIIJIL)) {
                    this.LL = childAt;
                    return;
                }
            }
        }
    }

    public final void LJFF() {
        this.LLJJIJIIJIL.clearAnimation();
        this.LLJJJJLIIL.stop();
        C20745316Fv c20745316Fv = this.LLJJIJIIJIL;
        int visibility = c20745316Fv.getVisibility();
        c20745316Fv.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c20745316Fv);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.LLJJJIL - this.LLJILJILJ);
        this.LLJILJILJ = this.LLJJIJIIJIL.getTop();
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1317550kOH c1317550kOH = this.LLIZ;
        return c1317550kOH.LIZIZ | c1317550kOH.LIZ;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.LLIZLLLIL.LJIIIIZZ(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LLIZLLLIL.LIZLLL;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.LLIZLLLIL.LJIIJJI(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJFF();
    }

    public int getProgressCircleDiameter() {
        return this.LLJLL;
    }

    public int getProgressViewEndOffset() {
        return this.LLJJJJ;
    }

    public int getProgressViewStartOffset() {
        return this.LLJJJIL;
    }

    private void setColorViewAlpha(int i) {
        this.LLJJIJIIJIL.getBackground().setAlpha(i);
        this.LLJJJJLIIL.setAlpha(i);
    }

    public final void LIZJ(float f) {
        if (f > this.LLILZIL) {
            LJI(true, true);
            return;
        }
        this.LLILLL = false;
        C21582219dE c21582219dE = this.LLJJJJLIIL;
        C21582319dF c21582319dF = c21582219dE.LL;
        c21582319dF.LJ = 0.0f;
        c21582319dF.LJFF = 0.0f;
        c21582219dE.invalidateSelf();
        AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd = new AnimationAnimationListenerC2189531Amd(this, 1);
        this.LLJJJ = this.LLJILJILJ;
        reset();
        setDuration(200L);
        setInterpolator(this.LLJJIJI);
        C20745316Fv c20745316Fv = this.LLJJIJIIJIL;
        c20745316Fv.LL = animationAnimationListenerC2189531Amd;
        c20745316Fv.clearAnimation();
        this.LLJJIJIIJIL.startAnimation(this.LLJZ);
        C21582219dE c21582219dE2 = this.LLJJJJLIIL;
        C21582319dF c21582319dF2 = c21582219dE2.LL;
        if (c21582319dF2.LJIILIIL) {
            c21582319dF2.LJIILIIL = false;
        }
        c21582219dE2.invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [X.19dH, android.view.animation.Animation] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.19dH, android.view.animation.Animation] */
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
    public final void LIZLLL(float f) {
        C21582519dH c21582519dH;
        C21582519dH c21582519dH2;
        C21582219dE c21582219dE = this.LLJJJJLIIL;
        C21582319dF c21582319dF = c21582219dE.LL;
        if (!c21582319dF.LJIILIIL) {
            c21582319dF.LJIILIIL = true;
        }
        c21582219dE.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.LLILZIL));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.LLILZIL;
        int i = this.LLJJJJJIL;
        if (i <= 0) {
            i = this.LLJJJJ;
        }
        float f2 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.LLJJJIL + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        if (this.LLJJIJIIJIL.getVisibility() != 0) {
            C20745316Fv c20745316Fv = this.LLJJIJIIJIL;
            int visibility = c20745316Fv.getVisibility();
            c20745316Fv.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c20745316Fv);
        }
        C20745316Fv c20745316Fv2 = this.LLJJIJIIJIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20745316Fv2);
        c20745316Fv2.setScaleX(1.0f);
        C20745316Fv c20745316Fv3 = this.LLJJIJIIJIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20745316Fv3);
        c20745316Fv3.setScaleY(1.0f);
        if (f < this.LLILZIL) {
            final int i3 = 76;
            if (this.LLJJJJLIIL.LL.LJIJI > 76 && ((c21582519dH2 = this.LLJL) == null || !c21582519dH2.hasStarted() || c21582519dH2.hasEnded())) {
                final int i4 = this.LLJJJJLIIL.LL.LJIJI;
                ?? r1 = new Animation() { // from class: X.19dH
                    @Override // android.view.animation.Animation
                    public final void applyTransformation(float f3, Transformation transformation) {
                        this.LLILLL.LLJJJJLIIL.setAlpha((int) (i4 + ((i3 - r2) * f3)));
                    }
                };
                r1.setDuration(300L);
                C20745316Fv c20745316Fv4 = this.LLJJIJIIJIL;
                c20745316Fv4.LL = null;
                c20745316Fv4.clearAnimation();
                this.LLJJIJIIJIL.startAnimation(r1);
                this.LLJL = r1;
            }
        } else {
            final int i5 = 255;
            if (this.LLJJJJLIIL.LL.LJIJI < 255 && ((c21582519dH = this.LLJLIL) == null || !c21582519dH.hasStarted() || c21582519dH.hasEnded())) {
                final int i6 = this.LLJJJJLIIL.LL.LJIJI;
                ?? r12 = new Animation() { // from class: X.19dH
                    @Override // android.view.animation.Animation
                    public final void applyTransformation(float f3, Transformation transformation) {
                        this.LLILLL.LLJJJJLIIL.setAlpha((int) (i6 + ((i5 - r2) * f3)));
                    }
                };
                r12.setDuration(300L);
                C20745316Fv c20745316Fv5 = this.LLJJIJIIJIL;
                c20745316Fv5.LL = null;
                c20745316Fv5.clearAnimation();
                this.LLJJIJIIJIL.startAnimation(r12);
                this.LLJLIL = r12;
            }
        }
        C21582219dE c21582219dE2 = this.LLJJJJLIIL;
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        C21582319dF c21582319dF2 = c21582219dE2.LL;
        c21582319dF2.LJ = 0.0f;
        c21582319dF2.LJFF = fMin2;
        c21582219dE2.invalidateSelf();
        C21582219dE c21582219dE3 = this.LLJJJJLIIL;
        float fMin3 = Math.min(1.0f, fMax);
        C21582319dF c21582319dF3 = c21582219dE3.LL;
        if (fMin3 != c21582319dF3.LJIILL) {
            c21582319dF3.LJIILL = fMin3;
        }
        c21582219dE3.invalidateSelf();
        C21582219dE c21582219dE4 = this.LLJJJJLIIL;
        c21582219dE4.LL.LJI = (((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f;
        c21582219dE4.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.LLJILJILJ);
    }

    public final void LJ(float f) {
        setTargetOffsetTopAndBottom((this.LLJJJ + ((int) ((this.LLJJJIL - r1) * f))) - this.LLJJIJIIJIL.getTop());
    }

    public final void LJII(float f) {
        float f2 = this.LLJJ;
        float f3 = f - f2;
        int i = this.LLILZ;
        if (f3 > i && !this.LLJJI) {
            this.LLJILLL = f2 + i;
            this.LLJJI = true;
            this.LLJJJJLIIL.setAlpha(76);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r4.LIZIZ()
            int r2 = r5.getActionMasked()
            boolean r0 = r4.isEnabled()
            r3 = 0
            if (r0 == 0) goto L7e
            boolean r0 = r4.LIZ()
            if (r0 != 0) goto L7e
            boolean r0 = r4.LLILLL
            if (r0 != 0) goto L7e
            boolean r0 = r4.LLJIJIL
            if (r0 != 0) goto L7e
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
            int r0 = r4.LLJJIII
            if (r1 != r0) goto L40
            if (r2 != 0) goto L3a
            r3 = 1
        L3a:
            int r0 = r5.getPointerId(r3)
            r4.LLJJIII = r0
        L40:
            boolean r0 = r4.LLJJI
            return r0
        L43:
            int r0 = r4.LLJJIII
            if (r0 != r1) goto L48
            return r3
        L48:
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L4f
            return r3
        L4f:
            float r0 = r5.getY(r0)
            r4.LJII(r0)
            goto L40
        L57:
            r4.LLJJI = r3
            r4.LLJJIII = r1
            goto L40
        L5c:
            int r1 = r4.LLJJJIL
            X.16Fv r0 = r4.LLJJIJIIJIL
            int r0 = r0.getTop()
            int r1 = r1 - r0
            r4.setTargetOffsetTopAndBottom(r1)
            int r0 = r5.getPointerId(r3)
            r4.LLJJIII = r0
            r4.LLJJI = r3
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L77
            return r3
        L77:
            float r0 = r5.getY(r0)
            r4.LLJJ = r0
            goto L40
        L7e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.LLIZ.LIZIZ(0);
        this.LLJIJIL = false;
        float f = this.LLILZLL;
        if (f > 0.0f) {
            LIZJ(f);
            this.LLILZLL = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (!isEnabled() || LIZ() || this.LLILLL || this.LLJIJIL) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        return false;
                    }
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.LLJJIII) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                this.LLJJIII = motionEvent.getPointerId(i);
                            }
                        }
                    } else {
                        int actionIndex2 = motionEvent.getActionIndex();
                        if (actionIndex2 < 0) {
                            return false;
                        }
                        this.LLJJIII = motionEvent.getPointerId(actionIndex2);
                        return true;
                    }
                } else {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.LLJJIII);
                    if (iFindPointerIndex < 0) {
                        return false;
                    }
                    float y = motionEvent.getY(iFindPointerIndex);
                    LJII(y);
                    if (this.LLJJI) {
                        float f = (y - this.LLJILLL) * 0.5f;
                        if (f <= 0.0f) {
                            return false;
                        }
                        LIZLLL(f);
                        return true;
                    }
                }
                return true;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(this.LLJJIII);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            if (this.LLJJI) {
                float y2 = (motionEvent.getY(iFindPointerIndex2) - this.LLJILLL) * 0.5f;
                this.LLJJI = false;
                LIZJ(y2);
            }
            this.LLJJIII = -1;
            return false;
        }
        this.LLJJIII = motionEvent.getPointerId(0);
        this.LLJJI = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view = this.LL;
        if (view != null && !C14K9.LJIILL(view)) {
            return;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        C20745316Fv c20745316Fv = this.LLJJIJIIJIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20745316Fv);
        c20745316Fv.setScaleX(f);
        C20745316Fv c20745316Fv2 = this.LLJJIJIIJIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20745316Fv2);
        c20745316Fv2.setScaleY(f);
    }

    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        LIZIZ();
        C21582219dE c21582219dE = this.LLJJJJLIIL;
        C21582319dF c21582319dF = c21582219dE.LL;
        c21582319dF.LJIIIIZZ = iArr;
        c21582319dF.LIZ(0);
        c21582219dE.LL.LIZ(0);
        c21582219dE.invalidateSelf();
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
        this.LLILZIL = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            LJFF();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LLIZLLLIL.LJIIIZ(z);
    }

    public void setOnRefreshListener(InterfaceC1572870r25 interfaceC1572870r25) {
        this.LLILLJJLI = interfaceC1572870r25;
    }

    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.LLJJIJIIJIL.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C446980Hfs.LIZ(getContext(), i));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.19dJ, android.view.animation.Animation] */
    public void setRefreshing(boolean z) {
        if (z && this.LLILLL != z) {
            this.LLILLL = z;
            setTargetOffsetTopAndBottom((this.LLJJJJ + this.LLJJJIL) - this.LLJILJILJ);
            this.LLJLILLLLZIIL = false;
            AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd = this.LLJLLIL;
            C20745316Fv c20745316Fv = this.LLJJIJIIJIL;
            int visibility = c20745316Fv.getVisibility();
            c20745316Fv.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c20745316Fv);
            this.LLJJJJLIIL.setAlpha(255);
            ?? r2 = new Animation() { // from class: X.19dJ
                @Override // android.view.animation.Animation
                public final void applyTransformation(float f, Transformation transformation) {
                    this.LL.setAnimationProgress(f);
                }
            };
            this.LLJJL = r2;
            r2.setDuration(this.LLJILJIL);
            if (animationAnimationListenerC2189531Amd != null) {
                this.LLJJIJIIJIL.LL = animationAnimationListenerC2189531Amd;
            }
            this.LLJJIJIIJIL.clearAnimation();
            this.LLJJIJIIJIL.startAnimation(this.LLJJL);
            return;
        }
        LJI(z, false);
    }

    public void setSize(int i) {
        if (i != 0 && i != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i == 0) {
            this.LLJLL = (int) (displayMetrics.density * 56.0f);
        } else {
            this.LLJLL = (int) (displayMetrics.density * 40.0f);
        }
        this.LLJJIJIIJIL.setImageDrawable(null);
        this.LLJJJJLIIL.LIZJ(i);
        this.LLJJIJIIJIL.setImageDrawable(this.LLJJJJLIIL);
    }

    public void setSlingshotDistance(int i) {
        this.LLJJJJJIL = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.LLJJIJIIJIL.bringToFront();
        this.LLJJIJIIJIL.offsetTopAndBottom(i);
        this.LLJILJILJ = this.LLJJIJIIJIL.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.LLIZLLLIL.LJIIJ(i, 0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.19dG] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.19dI] */
    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = -1.0f;
        this.LLJ = new int[2];
        this.LLJI = new int[2];
        this.LLJJIII = -1;
        this.LLJJIJIL = -1;
        this.LLJLLIL = new AnimationAnimationListenerC2189531Amd(this, 0);
        this.LLJLLL = new Animation() { // from class: X.19dG
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                this.LL.getClass();
                SwipeRefreshLayout swipeRefreshLayout = this.LL;
                int iAbs = swipeRefreshLayout.LLJJJJ - Math.abs(swipeRefreshLayout.LLJJJIL);
                SwipeRefreshLayout swipeRefreshLayout2 = this.LL;
                this.LL.setTargetOffsetTopAndBottom((swipeRefreshLayout2.LLJJJ + ((int) ((iAbs - r1) * f))) - swipeRefreshLayout2.LLJJIJIIJIL.getTop());
                C21582219dE c21582219dE = this.LL.LLJJJJLIIL;
                float f2 = 1.0f - f;
                C21582319dF c21582319dF = c21582219dE.LL;
                if (f2 != c21582319dF.LJIILL) {
                    c21582319dF.LJIILL = f2;
                }
                c21582219dE.invalidateSelf();
            }
        };
        this.LLJZ = new Animation() { // from class: X.19dI
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                this.LL.LJ(f);
            }
        };
        this.LLILZ = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLJILJIL = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.LLJJIJI = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.LLJLL = (int) (displayMetrics.density * 40.0f);
        this.LLJJIJIIJIL = new C20745316Fv(getContext());
        C21582219dE c21582219dE = new C21582219dE(getContext());
        this.LLJJJJLIIL = c21582219dE;
        c21582219dE.LIZJ(1);
        this.LLJJIJIIJIL.setImageDrawable(this.LLJJJJLIIL);
        C20745316Fv c20745316Fv = this.LLJJIJIIJIL;
        int visibility = c20745316Fv.getVisibility();
        c20745316Fv.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c20745316Fv);
        addView(this.LLJJIJIIJIL);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.LLJJJJ = i;
        this.LLILZIL = i;
        this.LLIZ = new C1317550kOH();
        this.LLIZLLLIL = new C1318260kPQ(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.LLJLL;
        this.LLJILJILJ = i2;
        this.LLJJJIL = i2;
        LJ(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LLJZIJLIL);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void LJI(boolean z, boolean z2) {
        if (this.LLILLL != z) {
            this.LLJLILLLLZIIL = z2;
            LIZIZ();
            this.LLILLL = z;
            if (z) {
                int i = this.LLJILJILJ;
                AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd = this.LLJLLIL;
                this.LLJJJ = i;
                reset();
                setDuration(200L);
                setInterpolator(this.LLJJIJI);
                if (animationAnimationListenerC2189531Amd != null) {
                    this.LLJJIJIIJIL.LL = animationAnimationListenerC2189531Amd;
                }
                this.LLJJIJIIJIL.clearAnimation();
                this.LLJJIJIIJIL.startAnimation(this.LLJLLL);
                return;
            }
            AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd2 = this.LLJLLIL;
            C21582819dK c21582819dK = new C21582819dK(this);
            this.LLJJLIIIJLLLLLLLZ = c21582819dK;
            c21582819dK.setDuration(150L);
            C20745316Fv c20745316Fv = this.LLJJIJIIJIL;
            c20745316Fv.LL = animationAnimationListenerC2189531Amd2;
            c20745316Fv.clearAnimation();
            this.LLJJIJIIJIL.startAnimation(this.LLJJLIIIJLLLLLLLZ);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.LLIZLLLIL.LIZIZ(f, f2);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.LLJJIJIL;
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
        super.onMeasure(i, i2);
        if (this.LL == null) {
            LIZIZ();
        }
        View view = this.LL;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.LLJJIJIIJIL.measure(View.MeasureSpec.makeMeasureSpec(this.LLJLL, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LLJLL, 1073741824));
        this.LLJJIJIL = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.LLJJIJIIJIL) {
                this.LLJJIJIL = i3;
                return;
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LLIZLLLIL.LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC1318530kPr
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.LLIZ.LIZ(i, 0);
        startNestedScroll(i & 2);
        this.LLILZLL = 0.0f;
        this.LLJIJIL = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if (isEnabled() && !this.LLILLL && (i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.LLIZLLLIL.LIZJ(i, i2, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.LLILZLL;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.LLILZLL = 0.0f;
                } else {
                    this.LLILZLL = f - f2;
                    iArr[1] = i2;
                }
                LIZLLL(this.LLILZLL);
            }
        }
        int[] iArr2 = this.LLJ;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.LLIZLLLIL.LJ(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.LL == null) {
            LIZIZ();
        }
        View view = this.LL;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.LLJJIJIIJIL.getMeasuredWidth();
        int measuredHeight2 = this.LLJJIJIIJIL.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.LLJILJILJ;
        this.LLJJIJIIJIL.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.LLJI);
        if (i4 + this.LLJI[1] < 0 && !LIZ()) {
            float fAbs = this.LLILZLL + Math.abs(r6);
            this.LLILZLL = fAbs;
            LIZLLL(fAbs);
        }
    }
}
