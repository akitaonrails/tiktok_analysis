package X;

import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.15oa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20633415oa extends RelativeLayout {
    public InterfaceC20633715od LL;
    public C20632315oP LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final long LLILZLL;
    public final int LLIZ;
    public int LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public final int LLJILJILJ;
    public final C20633615oc LLJILLL;
    public final ARunnableS131S0100000_31 LLJJ;

    public final boolean LIZ() {
        return this.LLILLL && getRealCount() > 1;
    }

    public final void LIZIZ() {
        if (this.LLILZIL) {
            HandlerHook.viewRemoveCallbacks(this, this.LLJJ);
            this.LLILZIL = false;
        }
        HandlerHook.viewPostDelay(this, this.LLJJ, this.LLILZLL);
        this.LLILZIL = true;
    }

    public final int getCurrentPager() {
        int iLIZIZ;
        InterfaceC20633715od interfaceC20633715od = this.LL;
        if (interfaceC20633715od == null || (iLIZIZ = interfaceC20633715od.LIZIZ(this.LLIZLLLIL)) < 0) {
            return 0;
        }
        return iLIZIZ;
    }

    public final int getRealCount() {
        InterfaceC20633715od interfaceC20633715od = this.LL;
        if (interfaceC20633715od != null) {
            return interfaceC20633715od.LIZ();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (LIZ()) {
            LIZIZ();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (LIZ() && this.LLILZIL) {
            HandlerHook.viewRemoveCallbacks(this, this.LLJJ);
            this.LLILZIL = false;
        }
    }

    public final C20632315oP getViewPager() {
        return this.LLILLJJLI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C20632315oP c20632315oP;
        if (LIZ() && (c20632315oP = this.LLILLJJLI) != null && c20632315oP.LLJJIJI) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3 || action == 4) {
                    LIZIZ();
                }
            } else if (this.LLILZIL) {
                HandlerHook.viewRemoveCallbacks(this, this.LLJJ);
                this.LLILZIL = false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000e, code lost:
    
        if (r3 != 3) goto L10;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r3 = r5.getAction()
            if (r3 == 0) goto L65
            r2 = 0
            r1 = 1
            if (r3 == r1) goto L76
            r0 = 2
            if (r3 == r0) goto L15
            r0 = 3
            if (r3 == r0) goto L76
        L10:
            boolean r0 = super.onInterceptTouchEvent(r5)
            return r0
        L15:
            float r0 = r5.getRawX()
            r4.LLJIJIL = r0
            float r0 = r5.getRawY()
            r4.LLJILJIL = r0
            X.15oP r0 = r4.LLILLJJLI
            if (r0 == 0) goto L10
            boolean r0 = r0.LLJJIJI
            if (r0 != r1) goto L10
            float r1 = r4.LLJIJIL
            float r0 = r4.LLJ
            float r1 = r1 - r0
            float r3 = java.lang.Math.abs(r1)
            float r1 = r4.LLJILJIL
            float r0 = r4.LLJI
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            X.15oP r0 = r4.LLILLJJLI
            if (r0 == 0) goto L59
            int r0 = r0.getOrientation()
            if (r0 != 0) goto L59
            int r0 = r4.LLJILJILJ
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L51
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L51
        L50:
            r2 = 1
        L51:
            android.view.ViewParent r0 = r4.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            goto L10
        L59:
            int r0 = r4.LLJILJILJ
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L51
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L51
            goto L50
        L65:
            float r0 = r5.getRawX()
            r4.LLJIJIL = r0
            r4.LLJ = r0
            float r0 = r5.getRawY()
            r4.LLJILJIL = r0
            r4.LLJI = r0
            goto L10
        L76:
            float r1 = r4.LLJIJIL
            float r0 = r4.LLJ
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            int r0 = r4.LLJILJILJ
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L96
            float r1 = r4.LLJILJIL
            float r0 = r4.LLJI
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            int r0 = r4.LLJILJILJ
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L97
        L96:
            r2 = 1
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20633415oa.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.15oc] */
    public C20633415oa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = true;
        this.LLILZ = true;
        this.LLILZLL = 2500L;
        this.LLIZ = 1;
        this.LLJILLL = new AbstractC471570IeR() { // from class: X.15oc
            @Override // X.AbstractC471570IeR
            public final void LIZ() {
                C20633415oa c20633415oa = this.LIZ;
                int currentPager = c20633415oa.getCurrentPager() + c20633415oa.LLIZ;
                c20633415oa.LLIZLLLIL = currentPager;
                C20632315oP c20632315oP = c20633415oa.LLILLJJLI;
                if (c20632315oP != null) {
                    c20632315oP.LJ(currentPager, false);
                }
                if (c20633415oa.LIZ()) {
                    c20633415oa.LIZIZ();
                }
            }

            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i, int i2) {
                if (i > 1) {
                    LIZ();
                }
            }

            @Override // X.AbstractC471570IeR
            public final void LJ(int i, int i2) {
                LIZ();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZJ(int i, int i2, Object obj) {
                LIZ();
            }
        };
        this.LLJILJILJ = ViewConfiguration.get(context).getScaledTouchSlop() >> 1;
        this.LLILLJJLI = new C20632315oP(context);
        C20632315oP c20632315oP = this.LLILLJJLI;
        if (c20632315oP != null) {
            C786410Ut5.r6(c20632315oP, new ViewGroup.LayoutParams(-1, -1));
        }
        C20632315oP c20632315oP2 = this.LLILLJJLI;
        if (c20632315oP2 != null) {
            c20632315oP2.setPageTransformer(new C0HQZ());
        }
        C20632315oP c20632315oP3 = this.LLILLJJLI;
        if (c20632315oP3 != null) {
            c20632315oP3.LIZIZ(new AbstractC712240Rwk(this) { // from class: X.15ob
                public final WeakReference<C20633415oa> LL;

                {
                    this.LL = new WeakReference<>(this);
                }

                @Override // X.AbstractC712240Rwk
                public final void onPageScrollStateChanged(int i) {
                    C20633415oa c20633415oa = this.LL.get();
                    if (c20633415oa == null) {
                        return;
                    }
                    if (i == 1) {
                        int i2 = c20633415oa.LLIZLLLIL;
                        if (i2 == c20633415oa.LLIZ - 1) {
                            c20633415oa.LLILZ = false;
                            C20632315oP c20632315oP4 = c20633415oa.LLILLJJLI;
                            if (c20632315oP4 != null) {
                                c20632315oP4.LJ(c20633415oa.getRealCount() + c20633415oa.LLIZLLLIL, false);
                            }
                        } else {
                            int realCount = c20633415oa.getRealCount();
                            int i3 = c20633415oa.LLIZ;
                            if (i2 == realCount + i3) {
                                c20633415oa.LLILZ = false;
                                C20632315oP c20632315oP5 = c20633415oa.LLILLJJLI;
                                if (c20632315oP5 != null) {
                                    c20632315oP5.LJ(i3, false);
                                }
                            } else {
                                c20633415oa.LLILZ = true;
                            }
                        }
                    }
                    InterfaceC20633715od interfaceC20633715od = c20633415oa.LL;
                    if (interfaceC20633715od != null) {
                        interfaceC20633715od.onPageScrollStateChanged(i);
                    }
                }

                @Override // X.AbstractC712240Rwk
                public final void onPageSelected(int i) {
                    int iLIZIZ;
                    C20633415oa c20633415oa = this.LL.get();
                    if (c20633415oa == null) {
                        return;
                    }
                    if (c20633415oa.getRealCount() > 1) {
                        c20633415oa.LLIZLLLIL = i;
                    }
                    if (c20633415oa.LLILZ) {
                        InterfaceC20633715od interfaceC20633715od = c20633415oa.LL;
                        if (interfaceC20633715od != null) {
                            iLIZIZ = interfaceC20633715od.LIZIZ(i);
                        } else {
                            iLIZIZ = 0;
                        }
                        InterfaceC20633715od interfaceC20633715od2 = c20633415oa.LL;
                        if (interfaceC20633715od2 != null) {
                            interfaceC20633715od2.onPageSelected(iLIZIZ);
                        }
                    }
                }

                @Override // X.AbstractC712240Rwk
                public final void onPageScrolled(int i, float f, int i2) {
                    InterfaceC20633715od interfaceC20633715od;
                    InterfaceC20633715od interfaceC20633715od2;
                    C20633415oa c20633415oa = this.LL.get();
                    if (c20633415oa != null && (interfaceC20633715od2 = c20633415oa.LL) != null) {
                        interfaceC20633715od2.LIZIZ(i);
                    }
                    C20633415oa c20633415oa2 = this.LL.get();
                    if (c20633415oa2 != null && (interfaceC20633715od = c20633415oa2.LL) != null) {
                        interfaceC20633715od.LJIIJ();
                    }
                }
            });
        }
        this.LLJJ = new ARunnableS131S0100000_31(this, 37);
    }
}
