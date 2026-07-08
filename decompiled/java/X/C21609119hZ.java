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
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.Scroller;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;
import u4.q0;

/* JADX INFO: renamed from: X.19hZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21609119hZ extends ViewGroup implements InterfaceC1318530kPr, InterfaceC1338650kwJ, InterfaceC1581880rGc {
    public static final int[] LLLFZ = {R.attr.enabled};
    public final int LL;
    public final Scroller LLILLJJLI;
    public float LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public View LLILZLL;
    public InterfaceC1581920rGg LLIZ;
    public boolean LLIZLLLIL;
    public InterfaceC21610119hj LLJ;
    public float LLJI;
    public final int[] LLJIJIL;
    public final int[] LLJILJIL;
    public boolean LLJILJILJ;
    public final C1317550kOH LLJILLL;
    public final C1318260kPQ LLJJ;
    public final int LLJJI;
    public boolean LLJJIII;
    public int LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public boolean LLJJJ;
    public final DecelerateInterpolator LLJJJIL;
    public C418880Gbe LLJJJJ;
    public int LLJJJJJIL;
    public C21609719hf LLJJJJLIIL;
    public final int LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public C21609319hb LLJL;
    public C21609419hc LLJLIL;
    public boolean LLJLILLLLZIIL;
    public C21609919hh LLJLL;
    public int LLJLLIL;
    public boolean LLJLLL;
    public int LLJZ;
    public C21609319hb LLJZIJLIL;
    public final AnimationAnimationListenerC2189531Amd LLL;
    public final C21609219ha LLLF;
    public final C21610019hi LLLFF;
    public final C21610219hk LLLFFI;

    public void LIZLLL(Exception exc) {
    }

    public void setAnimationProgress(float f) {
    }

    public void setColorScheme(int... iArr) {
    }

    public void setOnChildScrollUpCallback(InterfaceC21610419hm interfaceC21610419hm) {
    }

    public void setOnOverScrollListener(InterfaceC21610519hn interfaceC21610519hn) {
    }

    public void setOnSwipeChangeListener(InterfaceC21611919i1 interfaceC21611919i1) {
    }

    @Override // X.InterfaceC1581880rGc
    public void setOnVisibleListener(InterfaceC1581910rGf interfaceC1581910rGf) {
    }

    public final void LIZ() {
        if (this.LLILZLL == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.LLJJJJ)) {
                    this.LLILZLL = childAt;
                    return;
                }
            }
        }
    }

    public final void LJ() {
        LIZIZ(true);
        this.LLJLIL.stop();
        setColorViewAlpha(255);
        if (this.LLJJJ) {
            setAnimationProgress(0.0f);
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LLILLJJLI.computeScrollOffset()) {
            scrollTo(this.LLILLJJLI.getCurrX(), this.LLILLJJLI.getCurrY());
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1317550kOH c1317550kOH = this.LLJILLL;
        return c1317550kOH.LIZIZ | c1317550kOH.LIZ;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.LLJJ.LJIIIIZZ(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LLJJ.LIZLLL;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.LLJJ.LJIIJJI(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJ();
    }

    @Override // X.InterfaceC1581880rGc
    public final boolean LJJIIJZLJL() {
        return this.LLILZ;
    }

    public int getProgressCircleDiameter() {
        return this.LLJZ;
    }

    public int getProgressViewEndOffset() {
        return this.LLJLLIL;
    }

    public int getProgressViewStartOffset() {
        return this.LLJJJJJIL;
    }

    private void setColorViewAlpha(int i) {
        this.LLJLIL.LLILLJJLI.LJIJJ = i;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [X.19hh, android.view.animation.Animation] */
    public final void LIZIZ(float f) {
        AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd;
        if (f > this.LLILLL) {
            LJFF(true, true);
            return;
        }
        this.LLILZ = false;
        C21609419hc c21609419hc = this.LLJLIL;
        C21609519hd c21609519hd = c21609419hc.LLILLJJLI;
        c21609519hd.LJ = 0.0f;
        c21609519hd.LIZ();
        C21609519hd c21609519hd2 = c21609419hc.LLILLJJLI;
        c21609519hd2.LJFF = 0.0f;
        c21609519hd2.LIZ();
        if (!this.LLJJJ) {
            animationAnimationListenerC2189531Amd = new AnimationAnimationListenerC2189531Amd(this, 5);
        } else {
            animationAnimationListenerC2189531Amd = null;
        }
        C21610219hk c21610219hk = this.LLLFFI;
        c21610219hk.getClass();
        AnimationAnimationListenerC2189521Amc animationAnimationListenerC2189521Amc = new AnimationAnimationListenerC2189521Amc(c21610219hk, animationAnimationListenerC2189531Amd, 0);
        LIZIZ(false);
        if (this.LLJJJ) {
            ?? r2 = new Animation() { // from class: X.19hh
                @Override // android.view.animation.Animation
                public final void applyTransformation(float f2, Transformation transformation) {
                    this.LL.getClass();
                    this.LL.getClass();
                    this.LL.setAnimationProgress(0.0f + ((-0.0f) * f2));
                    this.LL.getClass();
                }
            };
            this.LLJLL = r2;
            r2.setDuration(150L);
            animationAnimationListenerC2189521Amc.onAnimationEnd(this.LLJLL);
        } else {
            reset();
            setDuration(200L);
            setInterpolator(this.LLJJJIL);
            animationAnimationListenerC2189521Amc.onAnimationEnd(this.LLLF);
        }
        C21609519hd c21609519hd3 = this.LLJLIL.LLILLJJLI;
        if (c21609519hd3.LJIILJJIL) {
            c21609519hd3.LJIILJJIL = false;
            c21609519hd3.LIZ();
        }
        this.LLILLJJLI.startScroll(0, getScrollY(), 0, -getScrollY(), Math.abs(getScrollY() * 2));
        invalidate();
        this.LLJJJJ.LIZJ();
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [X.19hb, android.view.animation.Animation] */
    /* JADX WARN: Type inference failed for: r2v24, types: [X.19hb, android.view.animation.Animation] */
    public final void LIZJ(float f) {
        int i;
        C21609319hb c21609319hb;
        C21609319hb c21609319hb2;
        C21609519hd c21609519hd = this.LLJLIL.LLILLJJLI;
        if (!c21609519hd.LJIILJJIL) {
            c21609519hd.LJIILJJIL = true;
            c21609519hd.LIZ();
        }
        float f2 = f / this.LLILLL;
        float fMax = (((float) Math.max(((double) Math.min(1.0f, Math.abs(f2))) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.LLILLL;
        if (this.LLJLILLLLZIIL) {
            i = this.LLJLLIL - this.LLJJJJJIL;
        } else {
            i = this.LLJLLIL;
        }
        float f3 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f3 * 2.0f) / f3) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        if (this.LLJJJ) {
            setAnimationProgress(Math.min(1.0f, f / this.LLILLL));
        }
        if (f < this.LLILLL) {
            final int i2 = 76;
            if (this.LLJLIL.LLILLJJLI.LJIJJ > 76 && ((c21609319hb2 = this.LLJZIJLIL) == null || !c21609319hb2.hasStarted() || c21609319hb2.hasEnded())) {
                final int i3 = this.LLJLIL.LLILLJJLI.LJIJJ;
                ?? r2 = new Animation() { // from class: X.19hb
                    @Override // android.view.animation.Animation
                    public final void applyTransformation(float f4, Transformation transformation) {
                        C21609419hc c21609419hc = this.LLILLL.LLJLIL;
                        c21609419hc.LLILLJJLI.LJIJJ = (int) (i3 + ((i2 - r2) * f4));
                    }
                };
                r2.setDuration(300L);
                this.LLJZIJLIL = r2;
            }
        } else {
            final int i4 = 255;
            if (this.LLJLIL.LLILLJJLI.LJIJJ < 255 && ((c21609319hb = this.LLJL) == null || !c21609319hb.hasStarted() || c21609319hb.hasEnded())) {
                final int i5 = this.LLJLIL.LLILLJJLI.LJIJJ;
                ?? r22 = new Animation() { // from class: X.19hb
                    @Override // android.view.animation.Animation
                    public final void applyTransformation(float f4, Transformation transformation) {
                        C21609419hc c21609419hc = this.LLILLL.LLJLIL;
                        c21609419hc.LLILLJJLI.LJIJJ = (int) (i5 + ((i4 - r2) * f4));
                    }
                };
                r22.setDuration(300L);
                this.LLJL = r22;
            }
        }
        float fAtan = (float) Math.atan(f2);
        scrollTo(0, (int) ((-this.LLILLL) * fAtan));
        this.LLJJJJ.setProgress(Math.max(0.0f, Math.min(1.0f, fAtan - 0.5f)));
        C21609419hc c21609419hc = this.LLJLIL;
        float fMin = Math.min(0.8f, fMax * 0.8f);
        C21609519hd c21609519hd2 = c21609419hc.LLILLJJLI;
        c21609519hd2.LJ = 0.0f;
        c21609519hd2.LIZ();
        C21609519hd c21609519hd3 = c21609419hc.LLILLJJLI;
        c21609519hd3.LJFF = fMin;
        c21609519hd3.LIZ();
        C21609419hc c21609419hc2 = this.LLJLIL;
        float fMin2 = Math.min(1.0f, fMax);
        C21609519hd c21609519hd4 = c21609419hc2.LLILLJJLI;
        if (fMin2 != c21609519hd4.LJIILLIIL) {
            c21609519hd4.LJIILLIIL = fMin2;
            c21609519hd4.LIZ();
        }
        C21609519hd c21609519hd5 = this.LLJLIL.LLILLJJLI;
        c21609519hd5.LJI = (((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f;
        c21609519hd5.LIZ();
        LIZIZ(false);
        InterfaceC21610119hj interfaceC21610119hj = this.LLJ;
        if (interfaceC21610119hj != null && f > this.LLILLL && !this.LLIZLLLIL) {
            this.LLIZLLLIL = true;
            interfaceC21610119hj.Cu();
        }
    }

    public final void LJI(float f) {
        float f2 = this.LLJJIJIL;
        float f3 = f - f2;
        int i = this.LL;
        if (f3 > i && !this.LLJJIII) {
            this.LLJJIJIIJIL = f2 + i;
            this.LLJJIII = true;
            this.LLJLIL.LLILLJJLI.LJIJJ = 76;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r4.LIZ()
            int r2 = r5.getActionMasked()
            boolean r0 = r4.isEnabled()
            r3 = 0
            if (r0 == 0) goto L74
            android.view.View r0 = r4.LLILZLL
            r1 = -1
            boolean r0 = r0.canScrollVertically(r1)
            if (r0 != 0) goto L74
            boolean r0 = r4.LLILZ
            if (r0 != 0) goto L74
            boolean r0 = r4.LLJILJILJ
            if (r0 != 0) goto L74
            if (r2 == 0) goto L5e
            r0 = 1
            if (r2 == r0) goto L59
            r0 = 2
            if (r2 == r0) goto L45
            r0 = 3
            if (r2 == r0) goto L59
            r0 = 6
            if (r2 != r0) goto L42
            int r2 = r5.getActionIndex()
            int r1 = r5.getPointerId(r2)
            int r0 = r4.LLJJIJI
            if (r1 != r0) goto L42
            if (r2 != 0) goto L3c
            r3 = 1
        L3c:
            int r0 = r5.getPointerId(r3)
            r4.LLJJIJI = r0
        L42:
            boolean r0 = r4.LLJJIII
            return r0
        L45:
            int r0 = r4.LLJJIJI
            if (r0 != r1) goto L4a
            return r3
        L4a:
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L51
            return r3
        L51:
            float r0 = r5.getY(r0)
            r4.LJI(r0)
            goto L42
        L59:
            r4.LLJJIII = r3
            r4.LLJJIJI = r1
            goto L42
        L5e:
            int r0 = r5.getPointerId(r3)
            r4.LLJJIJI = r0
            r4.LLJJIII = r3
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L6d
            return r3
        L6d:
            float r0 = r5.getY(r0)
            r4.LLJJIJIL = r0
            goto L42
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21609119hZ.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.LLJILLL.LIZIZ(0);
        this.LLJILJILJ = false;
        float f = this.LLJI;
        if (f > 0.0f) {
            LIZIZ(f);
            this.LLJI = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (!isEnabled() || this.LLILZLL.canScrollVertically(-1) || this.LLILZ || this.LLJILJILJ) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == this.LLJJIJI) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    this.LLJJIJI = motionEvent.getPointerId(i);
                                }
                            }
                        } else {
                            int actionIndex2 = motionEvent.getActionIndex();
                            if (actionIndex2 < 0) {
                                return false;
                            }
                            this.LLJJIJI = motionEvent.getPointerId(actionIndex2);
                            return true;
                        }
                    }
                } else {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.LLJJIJI);
                    if (iFindPointerIndex < 0) {
                        return false;
                    }
                    float y = motionEvent.getY(iFindPointerIndex);
                    LJI(y);
                    if (this.LLJJIII) {
                        float f = (y - this.LLJJIJIIJIL) * 0.5f;
                        if (f > 0.0f) {
                            LIZJ(f);
                            return true;
                        }
                        LIZJ(0.0f);
                        return false;
                    }
                }
                return true;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(this.LLJJIJI);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            if (this.LLJJIII) {
                float y2 = (motionEvent.getY(iFindPointerIndex2) - this.LLJJIJIIJIL) * 0.5f;
                this.LLJJIII = false;
                LIZIZ(y2);
            }
            this.LLJJIJI = -1;
            return false;
        }
        this.LLJJIJI = motionEvent.getPointerId(0);
        this.LLJJIII = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setColorSchemeColors(int... iArr) {
        LIZ();
        C21609419hc c21609419hc = this.LLJLIL;
        C21609519hd c21609519hd = c21609419hc.LLILLJJLI;
        c21609519hd.LJIIIZ = iArr;
        c21609519hd.LIZIZ(0);
        c21609419hc.LLILLJJLI.LIZIZ(0);
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
        this.LLILLL = i;
    }

    public void setDoNotCatchException(boolean z) {
        this.LLILZIL = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            LJ();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LLJJ.LJIIIZ(z);
    }

    public void setOnPullAndRefreshListener(InterfaceC21610119hj interfaceC21610119hj) {
        this.LLJ = interfaceC21610119hj;
    }

    @Override // X.InterfaceC1581880rGc
    public void setOnRefreshListener(InterfaceC1581920rGg interfaceC1581920rGg) {
        this.LLIZ = interfaceC1581920rGg;
    }

    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.LLJLIL.LLILLJJLI.LJIL = i;
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C446980Hfs.LIZ(getContext(), i));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.19hf, android.view.animation.Animation] */
    @Override // X.InterfaceC1581880rGc
    public void setRefreshing(boolean z) {
        if (z && this.LLILZ != z) {
            this.LLILZ = z;
            this.LLJLLL = false;
            AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd = this.LLL;
            this.LLJLIL.LLILLJJLI.LJIJJ = 255;
            ?? r2 = new Animation() { // from class: X.19hf
                @Override // android.view.animation.Animation
                public final void applyTransformation(float f, Transformation transformation) {
                    C21609119hZ c21609119hZ = this.LL;
                    c21609119hZ.scrollTo(0, (int) (c21609119hZ.LLILLL * f));
                }
            };
            this.LLJJJJLIIL = r2;
            r2.setDuration(this.LLJJI);
            if (animationAnimationListenerC2189531Amd != null) {
                animationAnimationListenerC2189531Amd.onAnimationEnd(this.LLJJJJLIIL);
            }
            this.LLJJJJ.LIZIZ();
            LJII(this.LLILLJJLI, getScrollY(), (int) (-this.LLILLL));
            return;
        }
        LJFF(z, false);
    }

    public void setSize(int i) {
        if (i != 0 && i != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i == 0) {
            this.LLJZ = (int) (displayMetrics.density * 56.0f);
        } else {
            this.LLJZ = (int) (displayMetrics.density * 40.0f);
        }
        this.LLJLIL.LIZJ(i);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.LLJJ.LJIIJ(i, 0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.19ha] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.19hi] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.19hk] */
    public C21609119hZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = -1.0f;
        this.LLJIJIL = new int[2];
        this.LLJILJIL = new int[2];
        this.LLJJIJI = -1;
        this.LLL = new AnimationAnimationListenerC2189531Amd(this, 4);
        this.LLLF = new Animation() { // from class: X.19ha
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                C21609119hZ c21609119hZ = this.LL;
                if (!c21609119hZ.LLJLILLLLZIIL) {
                    Math.abs(c21609119hZ.LLJJJJJIL);
                }
                float f2 = 1.0f - f;
                C21609519hd c21609519hd = this.LL.LLJLIL.LLILLJJLI;
                if (f2 != c21609519hd.LJIILLIIL) {
                    c21609519hd.LJIILLIIL = f2;
                    c21609519hd.LIZ();
                }
            }
        };
        this.LLLFF = new Animation() { // from class: X.19hi
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                this.LL.getClass();
            }
        };
        this.LLLFFI = new AbstractC21610319hl() { // from class: X.19hk
            @Override // X.AbstractC21610319hl
            public final void LIZ() {
            }
        };
        this.LL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLILLJJLI = new Scroller(context, new AccelerateDecelerateInterpolator());
        this.LLJJI = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.LLJJJIL = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        this.LLJZ = (int) (40.0f * f);
        this.LLJJL = (int) (f * 56.0f);
        this.LLJJLIIIJLLLLLLLZ = (int) (f * 32.0f);
        C21609419hc c21609419hc = new C21609419hc(getContext(), this);
        this.LLJLIL = c21609419hc;
        c21609419hc.LLILLJJLI.LJIL = -328966;
        q0.LJIJJLI(this);
        int i = (int) (displayMetrics.density * 56.0f);
        this.LLJLLIL = i;
        this.LLILLL = i;
        this.LLJILLL = new C1317550kOH();
        this.LLJJ = new C1318260kPQ(this);
        setNestedScrollingEnabled(true);
        this.LLJJJJJIL = -this.LLJZ;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LLLFZ);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
        C418880Gbe c418880Gbe = new C418880Gbe(getContext(), null);
        this.LLJJJJ = c418880Gbe;
        addView(c418880Gbe);
    }

    public final void LJFF(boolean z, boolean z2) {
        getClass();
        if (this.LLILZ != z) {
            this.LLJLLL = z2;
            LIZ();
            this.LLILZ = z;
            if (z) {
                AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd = this.LLL;
                LIZIZ(false);
                reset();
                setDuration(200L);
                setInterpolator(this.LLJJJIL);
                this.LLJJJJ.setCycleBias(1);
                this.LLJJJJ.LIZIZ();
                this.LLILLJJLI.startScroll(0, getScrollY(), 0, (-getScrollY()) - this.LLJJL, Math.abs(((-getScrollY()) - this.LLJJL) * 2));
                invalidate();
                if (animationAnimationListenerC2189531Amd != null) {
                    animationAnimationListenerC2189531Amd.onAnimationEnd(this.LLLF);
                    return;
                }
                return;
            }
            this.LLILLJJLI.forceFinished(true);
            this.LLILLJJLI.startScroll(0, getScrollY(), 0, -getScrollY(), Math.abs(getScrollY() * 2));
            invalidate();
            this.LLJJJJ.LIZJ();
        }
    }

    @Override // X.InterfaceC1581880rGc
    public final void LJJIIZ(int i, int i2) {
        this.LLJLILLLLZIIL = true;
        this.LLJJJJJIL = i;
        this.LLJJJ = false;
        this.LLJLLIL = i2;
        LJ();
        this.LLILZ = false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.LLJJ.LIZIZ(f, f2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LLILZLL == null) {
            LIZ();
        }
        View view = this.LLILZLL;
        if (view == null) {
            return;
        }
        try {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            CrashlyticsWrapperService.LIZLLL().LIZJ(e);
            C1AF0.LJFF(e, "DoubleBallSwipeRefreshLayout");
            if (this.LLILZIL) {
                throw e;
            }
        }
        this.LLJJJJ.measure(View.MeasureSpec.makeMeasureSpec(this.LLJJLIIIJLLLLLLLZ, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LLJJLIIIJLLLLLLLZ, 1073741824));
    }

    public void LJII(Scroller scroller, int i, int i2) {
        scroller.startScroll(0, i, 0, i2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LLJJ.LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC1318530kPr
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.LLJILLL.LIZ(i, 0);
        startNestedScroll(i & 2);
        this.LLJI = 0.0f;
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
        return this.LLJJ.LIZJ(i, i2, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.LLJI;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.LLJI = 0.0f;
                } else {
                    this.LLJI = f - f2;
                    iArr[1] = i2;
                }
                LIZJ(this.LLJI);
            }
        }
        int[] iArr2 = this.LLJIJIL;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.LLJJ.LJ(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Exception {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.LLILZLL == null) {
            LIZ();
        }
        View view = this.LLILZLL;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        try {
            view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZLLL(e);
            CrashlyticsWrapperService.LIZLLL().LIZJ(e);
            C1AF0.LJFF(e, "DoubleBallSwipeRefreshLayout");
            if (this.LLILZIL) {
                throw e;
            }
        }
        int measuredWidth2 = this.LLJJJJ.getMeasuredWidth();
        int i5 = (measuredWidth - measuredWidth2) / 2;
        this.LLJJJJ.layout(i5, -((this.LLJJL + this.LLJJJJ.getMeasuredHeight()) / 2), measuredWidth2 + i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.LLJILJIL);
        if (i4 + this.LLJILJIL[1] < 0 && !this.LLILZLL.canScrollVertically(-1)) {
            float fAbs = this.LLJI + Math.abs(r6);
            this.LLJI = fAbs;
            LIZJ(fAbs);
        }
    }
}
