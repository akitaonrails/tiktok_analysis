package X;

import Y.AAListenerS334S0100000_24;
import Y.AUListenerS154S0300000_24;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: renamed from: X.0rrF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1604590rrF extends AbstractC1604610rrH {
    public final C1604600rrG LIZJ;
    public final InterfaceC1685420txc<EnumC1604570rrD, String, Boolean, Boolean, String, Unit> LIZLLL;
    public final Function1<Float, Unit> LJ;
    public final Function0<Unit> LJFF;
    public final Function1<Boolean, Boolean> LJI;
    public final Function1<Boolean, Unit> LJII;
    public final Function0<Boolean> LJIIIIZZ;
    public final Function0<C1594870rbZ> LJIIIZ;
    public final Context LJIIJ;
    public C054G LJIIJJI;
    public boolean LJIIL;
    public float LJIILIIL;
    public long LJIILJJIL;
    public EnumC1604570rrD LJIILL;
    public final C01GW LJIILLIIL;
    public EnumC1604570rrD LJIIZILJ;

    @Override // X.AbstractC1604610rrH
    public final void LIZLLL() {
        if (this.LJIIZILJ == EnumC1604570rrD.EXCEEDED_REDIRECTION) {
            LJIIIIZZ(this, EnumC1604570rrD.OPENED, "auto", false, true, false, false, null, 116);
        } else {
            LJIIIZ();
        }
    }

    @Override // X.AbstractC1604610rrH
    public final boolean LIZ() {
        return this.LJIIZILJ != EnumC1604570rrD.CLOSED;
    }

    @Override // X.AbstractC1604610rrH
    public final void LIZJ() {
        LJIIIIZZ(this, EnumC1604570rrD.CLOSED, "auto", false, false, false, false, null, 124);
        LIZLLL();
    }

    public final void LJIIIZ() {
        EnumC1604570rrD enumC1604570rrD = this.LJIIZILJ;
        if (enumC1604570rrD == EnumC1604570rrD.EXCEEDED_REDIRECTION) {
            return;
        }
        Number numberValueOf = C1604580rrE.LIZ[enumC1604570rrD.ordinal()] == 1 ? 0 : Float.valueOf(this.LIZJ.LIZ());
        AAListenerS334S0100000_24 aAListenerS334S0100000_24 = new AAListenerS334S0100000_24(this, 6);
        ViewPropertyAnimator viewPropertyAnimatorTranslationY = this.LIZ.animate().translationY(numberValueOf.floatValue());
        viewPropertyAnimatorTranslationY.setDuration(this.LIZJ.LJII);
        viewPropertyAnimatorTranslationY.setInterpolator(C1619980sG4.LIZLLL());
        viewPropertyAnimatorTranslationY.setUpdateListener(new AUListenerS154S0300000_24(aAListenerS334S0100000_24, viewPropertyAnimatorTranslationY, this, 2));
        viewPropertyAnimatorTranslationY.start();
    }

    public final void LJIIJ() {
        if (((Boolean) this.LJIILLIIL.getValue()).booleanValue()) {
            new C0ZDN(this.LJIIJ).LIZ(0);
        }
    }

    public final void LJII() {
        C859270XnJ c859270XnJ = new C859270XnJ(this, AnimationUtils.currentAnimationTimeMillis(), null);
        if (this.LJIIJJI == null) {
            C1DFH c1dfh = C0PEM.LIZ;
            this.LJIIJJI = C2296808zG.LIZ(C2107308Nj.LIZ);
        }
        C054G c054g = this.LJIIJJI;
        if (c054g != null) {
            C23250099c.LIZLLL(c054g, null, null, c859270XnJ, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if (r1 != 3) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // X.AbstractC1604610rrH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1604590rrF.LIZIZ(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0254  */
    @Override // X.AbstractC1604610rrH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(android.view.MotionEvent r26) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1604590rrF.LJ(android.view.MotionEvent):boolean");
    }

    @Override // X.AbstractC1604610rrH
    public final boolean LJFF(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return true;
        }
        float y = motionEvent.getY();
        if (motionEvent.getAction() != 0 || y < 0.0f || y >= C14LC.LJIILL) {
            return true;
        }
        return false;
    }

    public final void LJI(MotionEvent motionEvent) {
        EnumC1604570rrD enumC1604570rrD = this.LJIILL;
        EnumC1604570rrD enumC1604570rrD2 = EnumC1604570rrD.OPENED;
        if (enumC1604570rrD == enumC1604570rrD2 && this.LJIIZILJ == enumC1604570rrD2) {
            LJIIIZ();
        }
        if (motionEvent.getAction() != 3 && this.LIZ.getMaxMoveDistance() < this.LIZIZ) {
            LJIIIIZZ(this, EnumC1604570rrD.CLOSED, "pull_down", false, false, false, false, null, 124);
        }
    }

    public C1604590rrF(C1604620rrI c1604620rrI, C1604600rrG c1604600rrG, C1620990sHh c1620990sHh, AwS390S0200000_24 awS390S0200000_24, AwS568S0100000_24 awS568S0100000_24, AwS603S0100000_24 awS603S0100000_24, AwS603S0100000_24 awS603S0100000_242, AwS568S0100000_24 awS568S0100000_242, AwS568S0100000_24 awS568S0100000_243) {
        super(c1604620rrI);
        this.LIZJ = c1604600rrG;
        this.LIZLLL = c1620990sHh;
        this.LJ = awS390S0200000_24;
        this.LJFF = awS568S0100000_24;
        this.LJI = awS603S0100000_24;
        this.LJII = awS603S0100000_242;
        this.LJIIIIZZ = awS568S0100000_242;
        this.LJIIIZ = awS568S0100000_243;
        this.LJIIJ = c1604620rrI.getContext();
        this.LJIILIIL = c1604600rrG.LIZ();
        EnumC1604570rrD enumC1604570rrD = EnumC1604570rrD.CLOSED;
        this.LJIILL = enumC1604570rrD;
        this.LJIILLIIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3389));
        this.LJIIZILJ = enumC1604570rrD;
    }

    public static void LJIIIIZZ(C1604590rrF c1604590rrF, EnumC1604570rrD enumC1604570rrD, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i) {
        String str3 = str2;
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        if ((i & 32) != 0) {
            z4 = false;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        if (enumC1604570rrD != c1604590rrF.LJIIZILJ) {
            c1604590rrF.LJIIZILJ = enumC1604570rrD;
            if (!z3) {
                if (z) {
                    InterfaceC1685420txc<EnumC1604570rrD, String, Boolean, Boolean, String, Unit> interfaceC1685420txc = c1604590rrF.LIZLLL;
                    if (interfaceC1685420txc != null) {
                        interfaceC1685420txc.invoke(enumC1604570rrD, str, Boolean.valueOf(z2), Boolean.TRUE, str3);
                    }
                    c1604590rrF.LJIIIZ();
                    return;
                }
                InterfaceC1685420txc<EnumC1604570rrD, String, Boolean, Boolean, String, Unit> interfaceC1685420txc2 = c1604590rrF.LIZLLL;
                if (interfaceC1685420txc2 != null) {
                    interfaceC1685420txc2.invoke(enumC1604570rrD, str, Boolean.valueOf(z2), Boolean.FALSE, str3);
                }
                if (c1604590rrF.LJIIZILJ != EnumC1604570rrD.CLOSED) {
                    return;
                }
                C1604620rrI c1604620rrI = c1604590rrF.LIZ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1604620rrI);
                c1604620rrI.setTranslationY(0.0f);
                Function1<Float, Unit> function1 = c1604590rrF.LJ;
                if (function1 != null) {
                    function1.invoke(Float.valueOf(c1604590rrF.LIZ.getTranslationY()));
                }
                Function1<Boolean, Unit> function12 = c1604590rrF.LJII;
                if (function12 == null) {
                    return;
                }
                function12.invoke(Boolean.valueOf(c1604590rrF.LIZ()));
                return;
            }
            InterfaceC1685420txc<EnumC1604570rrD, String, Boolean, Boolean, String, Unit> interfaceC1685420txc3 = c1604590rrF.LIZLLL;
            if (interfaceC1685420txc3 == null) {
                return;
            }
            interfaceC1685420txc3.invoke(enumC1604570rrD, str, Boolean.valueOf(z2), Boolean.TRUE, str3);
            return;
        }
        if (!z4) {
            return;
        }
        if (!z3) {
            if (z) {
                InterfaceC1685420txc<EnumC1604570rrD, String, Boolean, Boolean, String, Unit> interfaceC1685420txc4 = c1604590rrF.LIZLLL;
                if (interfaceC1685420txc4 == null) {
                    return;
                }
                interfaceC1685420txc4.invoke(enumC1604570rrD, str, Boolean.valueOf(z2), Boolean.TRUE, str3);
                return;
            }
            InterfaceC1685420txc<EnumC1604570rrD, String, Boolean, Boolean, String, Unit> interfaceC1685420txc5 = c1604590rrF.LIZLLL;
            if (interfaceC1685420txc5 == null) {
                return;
            }
            interfaceC1685420txc5.invoke(enumC1604570rrD, str, Boolean.valueOf(z2), Boolean.FALSE, str3);
            return;
        }
        InterfaceC1685420txc<EnumC1604570rrD, String, Boolean, Boolean, String, Unit> interfaceC1685420txc6 = c1604590rrF.LIZLLL;
        if (interfaceC1685420txc6 == null) {
            return;
        }
        interfaceC1685420txc6.invoke(enumC1604570rrD, str, Boolean.valueOf(z2), Boolean.TRUE, str3);
    }
}
