package X;

import Y.ALAdapterS12S0100000_16;
import Y.AUListenerS265S0100000_16;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.ad.experiment.LandingPageNavBarAnimationConfigExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0d6E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037280d6E {
    public static final /* synthetic */ int LJIL = 0;
    public final ViewGroup LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final SparkContext LJ;
    public final Function1<Boolean, Unit> LJFF;
    public final Function1<Float, Unit> LJI;
    public final Function0<Integer> LJII;
    public boolean LJIIIIZZ;
    public float LJIIIZ;
    public Animator LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public float LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public Boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;

    static {
        new C1037290d6F();
    }

    public final int LIZ() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (this.LIZIZ) {
            ViewGroup.LayoutParams layoutParams = this.LIZ.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return 0;
            }
            return marginLayoutParams2.topMargin;
        }
        ViewGroup.LayoutParams layoutParams2 = this.LIZ.getLayoutParams();
        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
            return 0;
        }
        return marginLayoutParams.bottomMargin;
    }

    public final int LIZIZ() {
        return this.LJII.invoke().intValue();
    }

    public final int LIZJ() {
        if (this.LIZJ) {
            return 0;
        }
        return (int) C12ES.LIZJ(((Number) LandingPageNavBarAnimationConfigExp.LIZJ.getValue()).intValue(), this.LIZ.getContext());
    }

    public final void LJII() {
        Animator animator = this.LJIIJ;
        if ((animator == null || !animator.isRunning()) && !this.LJIJJ) {
            LJIIIIZZ(LIZIZ(), 0);
        }
    }

    public final void LJFF(MotionEvent motionEvent) {
        boolean z;
        Animator animator;
        boolean z2;
        boolean z3;
        boolean z4;
        if ((this.LIZIZ && !C2522409uY.LIZ) || this.LIZ.getVisibility() == 8) {
            return;
        }
        if (this.LIZJ) {
            this.LJIIJJI = false;
            return;
        }
        if (motionEvent != null) {
            Integer numValueOf = Integer.valueOf(motionEvent.getAction());
            boolean z5 = true;
            if (numValueOf != null) {
                if (numValueOf.intValue() == 0) {
                    this.LJIILIIL = motionEvent.getRawY();
                    this.LJIIJJI = false;
                    this.LJIILLIIL = true;
                    return;
                }
                if (numValueOf.intValue() != 1 && numValueOf.intValue() != 3) {
                    return;
                }
                if (Math.abs(motionEvent.getRawY() - this.LJIILIIL) < 10.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (((Number) LandingPageNavBarAnimationConfigExp.LIZIZ.getValue()).intValue() == 2 && (((animator = this.LJIIJ) == null || !animator.isRunning()) && !z)) {
                    this.LJIJI = null;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("move ");
                    sbLIZ.append(this.LJIJ);
                    sbLIZ.append(" move > Threshold ");
                    if (Math.abs(this.LJIJ) > LIZJ()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sbLIZ.append(z2);
                    sbLIZ.append(" barViewMargin ");
                    sbLIZ.append(LIZ());
                    sbLIZ.append(" hide ");
                    if (LIZ() == LIZIZ()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    sbLIZ.append(z3);
                    sbLIZ.append(" isRealShow ");
                    sbLIZ.append(this.LJIJJLI);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (this.LJIJ > LIZJ() && LIZ() != LIZIZ()) {
                        LJIIIIZZ(LIZ(), LIZIZ());
                    } else {
                        int i = this.LJIJ;
                        if (i > 0 && i < LIZJ() && !this.LJIJJLI && LIZ() != LIZIZ()) {
                            LJIIIIZZ(LIZ(), LIZIZ());
                        } else {
                            int i2 = this.LJIJ;
                            if (i2 > 0 && i2 < LIZJ() && this.LJIJJLI && LIZ() != 0) {
                                LJIIIIZZ(LIZ(), 0);
                            } else {
                                int i3 = this.LJIJ;
                                if (i3 < 0 && (-i3) > LIZJ() && LIZ() != 0) {
                                    LJIIIIZZ(LIZ(), 0);
                                } else {
                                    int i4 = this.LJIJ;
                                    if (i4 < 0 && (-i4) < LIZJ() && this.LJIJJLI && LIZ() != 0) {
                                        LJIIIIZZ(LIZ(), 0);
                                    } else {
                                        int i5 = this.LJIJ;
                                        if (i5 < 0 && (-i5) < LIZJ() && !this.LJIJJLI && LIZ() != LIZIZ()) {
                                            LJIIIIZZ(LIZ(), LIZIZ());
                                        } else {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("move ");
                                            sbLIZ2.append(this.LJIJ);
                                            sbLIZ2.append(" move > Threshold ");
                                            if (Math.abs(this.LJIJ) > LIZJ()) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            sbLIZ2.append(z4);
                                            sbLIZ2.append(" barViewMargin ");
                                            sbLIZ2.append(LIZ());
                                            sbLIZ2.append(" hide ");
                                            if (LIZ() != LIZIZ()) {
                                                z5 = false;
                                            }
                                            sbLIZ2.append(z5);
                                            sbLIZ2.append(" isRealShow ");
                                            sbLIZ2.append(this.LJIJJLI);
                                            sbLIZ2.append(" -------- bad case?");
                                            C2188811AlT.LIZIZ(sbLIZ2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.LJIILLIIL = false;
                this.LJIIZILJ = -1;
                this.LJIJ = -1;
            }
        }
    }

    public final void LJI(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SparkContext sparkContext;
        InterfaceC1036110d4L interfaceC1036110d4L;
        SparkContext sparkContext2;
        InterfaceC1036110d4L interfaceC1036110d4L2;
        Function1<Float, Unit> function1;
        ViewGroup.LayoutParams layoutParams = this.LIZ.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (this.LIZIZ) {
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = i;
            }
            C01GW c01gw = LandingPageNavBarAnimationConfigExp.LIZLLL;
            if (((Number) c01gw.getValue()).intValue() == 0) {
                float f = 1.0f;
                float fLIZJ = 1.0f - (i / C12ES.LIZJ(-18.0f, this.LIZ.getContext()));
                if (fLIZJ < 0.01d) {
                    fLIZJ = 0.0f;
                }
                if (fLIZJ <= 0.99d) {
                    f = fLIZJ;
                }
                this.LJIIIZ = f;
                if (((Number) c01gw.getValue()).intValue() == 0 && (function1 = this.LJI) != null) {
                    function1.invoke(Float.valueOf(f));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("-----------------alphaColorReset ");
                sbLIZ.append(this.LJIIIZ);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        } else if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = i;
        }
        C786410Ut5.X5(marginLayoutParams, this.LIZ);
        if (i == 0) {
            if (this.LIZIZ && !this.LJIJJ && (sparkContext2 = this.LJ) != null && (interfaceC1036110d4L2 = (InterfaceC1036110d4L) sparkContext2.LJFF(InterfaceC1036110d4L.class)) != null) {
                interfaceC1036110d4L2.LJJJJI(0, this.LJIILLIIL ? 1 : 0);
            }
            this.LJIJJ = true;
        }
        if (i == LIZIZ()) {
            if (this.LIZIZ && this.LJIJJ && (sparkContext = this.LJ) != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext.LJFF(InterfaceC1036110d4L.class)) != null) {
                interfaceC1036110d4L.LJJJJI(1, this.LJIILLIIL ? 1 : 0);
            }
            this.LJIJJ = false;
        }
    }

    public final void LIZLLL(int i, int i2) {
        boolean z;
        boolean z2;
        Animator animator = this.LJIIJ;
        if ((animator != null && animator.isRunning()) || this.LJIIJJI) {
            return;
        }
        if (this.LJIIZILJ == -1 && this.LJIILLIIL) {
            this.LJIIZILJ = i2;
        }
        int i3 = i - this.LJIIZILJ;
        if (Math.abs(i3) > LIZJ() && i3 > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("delta ");
            sbLIZ.append(i3);
            sbLIZ.append(' ');
            sbLIZ.append(i);
            sbLIZ.append(' ');
            sbLIZ.append(i2);
            sbLIZ.append(" isShowing ");
            sbLIZ.append(this.LJIIIIZZ);
            sbLIZ.append(" animator?.isRunning ");
            Animator animator2 = this.LJIIJ;
            if (animator2 != null && animator2.isRunning()) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ.append(z2);
            sbLIZ.append(" animatedInOneTouch ");
            sbLIZ.append(this.LJIIJJI);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LJIILL = false;
            if (this.LJIILJJIL) {
                return;
            }
            this.LJIILJJIL = true;
            this.LJIIIIZZ = false;
            Function1<Boolean, Unit> function1 = this.LJFF;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            this.LJIIJJI = true;
            LJIIIIZZ(0, LIZIZ());
            return;
        }
        if (Math.abs(i3) <= LIZJ() || i3 >= 0) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("delta ");
        sbLIZ2.append(i3);
        sbLIZ2.append(' ');
        sbLIZ2.append(i);
        sbLIZ2.append(' ');
        sbLIZ2.append(i2);
        sbLIZ2.append(" isShowing ");
        sbLIZ2.append(this.LJIIIIZZ);
        sbLIZ2.append(" animator?.isRunning ");
        Animator animator3 = this.LJIIJ;
        if (animator3 != null && animator3.isRunning()) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ2.append(z);
        sbLIZ2.append(" animatedInOneTouch ");
        sbLIZ2.append(this.LJIIJJI);
        C2188811AlT.LIZIZ(sbLIZ2);
        this.LJIILJJIL = false;
        if (this.LJIILL) {
            return;
        }
        this.LJIILL = true;
        this.LJIIIIZZ = true;
        Function1<Boolean, Unit> function12 = this.LJFF;
        if (function12 != null) {
            function12.invoke(Boolean.TRUE);
        }
        this.LJIIJJI = true;
        LJIIIIZZ(LIZIZ(), 0);
    }

    public final void LJ(int i, int i2) {
        boolean z;
        int i3;
        int iLIZIZ;
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delta ");
        int i4 = i - i2;
        sbLIZ.append(i4);
        sbLIZ.append(' ');
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(i2);
        sbLIZ.append(" isShowing ");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(" animator?.isRunning ");
        Animator animator = this.LJIIJ;
        boolean z3 = true;
        int iLIZIZ2 = 0;
        if (animator != null && animator.isRunning()) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" animatedInOneTouch ");
        sbLIZ.append(this.LJIIJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        if ((this.LIZIZ && !C2522409uY.LIZ) || this.LIZ.getVisibility() == 8) {
            return;
        }
        if (this.LIZJ) {
            LIZLLL(i, i2);
            return;
        }
        int iIntValue = ((Number) LandingPageNavBarAnimationConfigExp.LIZIZ.getValue()).intValue();
        if (iIntValue != 0) {
            if (iIntValue == 2) {
                Animator animator2 = this.LJIIJ;
                if ((animator2 != null && animator2.isRunning()) || !this.LJIILLIIL) {
                    return;
                }
                if (this.LJIJ == -1) {
                    this.LJIJ = 0;
                    if (LIZ() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.LJIJJLI = z2;
                }
                if (i4 > 0) {
                    if (Intrinsics.LJFF(this.LJIJI, Boolean.FALSE)) {
                        this.LJIJI = Boolean.TRUE;
                        return;
                    }
                } else {
                    if (i4 < 0) {
                        if (Intrinsics.LJFF(this.LJIJI, Boolean.TRUE)) {
                            this.LJIJI = Boolean.FALSE;
                            return;
                        }
                    } else if (i4 <= 0) {
                    }
                    z3 = false;
                }
                this.LJIJI = Boolean.valueOf(z3);
                int i5 = (this.LJIJ + i) - i2;
                this.LJIJ = i5;
                if (Math.abs(i5) <= Math.abs(LIZIZ())) {
                    if (this.LJIJJ) {
                        if (i5 > 0) {
                            iLIZIZ = -Math.abs(i5);
                            LJI(iLIZIZ);
                        }
                    } else if (i5 < 0) {
                        iLIZIZ = LIZIZ() + Math.abs(i5);
                        LJI(iLIZIZ);
                    }
                }
                if (Math.abs(i5) <= (-LIZIZ()) || LIZ() == LIZIZ() || LIZ() == 0) {
                    return;
                }
                if (this.LJIJJ) {
                    if (i5 <= 0) {
                        return;
                    }
                } else if (i5 >= 0) {
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("if (isShow) -getScrollDistance() else 0 ");
                if (this.LJIJJ) {
                    i3 = -LIZIZ();
                } else {
                    i3 = 0;
                }
                sbLIZ2.append(i3);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (this.LJIJJ) {
                    iLIZIZ2 = LIZIZ();
                }
                LJI(iLIZIZ2);
                return;
            }
            return;
        }
        LIZLLL(i, i2);
    }

    public final void LJIIIIZZ(int i, int i2) {
        if (!this.LIZLLL) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS265S0100000_16(this, 56));
        valueAnimatorOfInt.addListener(new ALAdapterS12S0100000_16(this, 20));
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(C1619980sG4.LJIIJJI());
        valueAnimatorOfInt.setTarget(this.LIZ);
        valueAnimatorOfInt.start();
        this.LJIIJ = valueAnimatorOfInt;
    }

    public C1037280d6E(ViewGroup viewGroup, boolean z, boolean z2, boolean z3, SparkContext sparkContext, Function1 function1, Function0 function0, int i) {
        sparkContext = (i & 16) != 0 ? null : sparkContext;
        function1 = (i & 64) != 0 ? null : function1;
        this.LIZ = viewGroup;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = sparkContext;
        this.LJFF = null;
        this.LJI = function1;
        this.LJII = function0;
        this.LJIIIIZZ = true;
        this.LJIIIZ = 1.0f;
        this.LJIIZILJ = -1;
        this.LJIJ = -1;
        this.LJIJJ = true;
        this.LJIJJLI = true;
        new BPEAHandler(Looper.getMainLooper());
    }
}
