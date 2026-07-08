package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0spv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1642210spv implements InterfaceC1572020r0i {
    public final Function0<InterfaceC1644040sss> LIZ;
    public final Function0<InterfaceC1642220spw> LIZIZ;
    public final InterfaceC524950KiL LIZJ;
    public final Function0<Unit> LIZLLL;
    public final C11RK LJ = new C11RK();
    public final C11NJ LJFF = new C11NJ();
    public final C01GW LJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 997));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 996));
    public EnumC1642190spt LJIIIIZZ = EnumC1642190spt.LLILLL;
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 998));

    @Override // X.InterfaceC1572020r0i
    public final C19475711Hn LIZ() {
        C11RK c11rk = this.LJ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1572020r0i
    public final void LIZIZ() {
        LIZJ(EnumC1642190spt.LLILLJJLI);
    }

    @Override // X.InterfaceC1572020r0i
    public final void hide() {
        LIZJ(EnumC1642190spt.LLILLL);
    }

    public final void LIZJ(EnumC1642190spt enumC1642190spt) {
        InterfaceC1642220spw interfaceC1642220spw;
        EnumC1642190spt enumC1642190spt2 = this.LJIIIIZZ;
        if (enumC1642190spt2 == enumC1642190spt) {
            return;
        }
        int iOrdinal = enumC1642190spt.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    if (enumC1642190spt2 == EnumC1642190spt.LLILLJJLI) {
                        ((InterfaceC1644040sss) this.LJI.getValue()).hide();
                    }
                    if (enumC1642190spt2 == EnumC1642190spt.LL && (interfaceC1642220spw = (InterfaceC1642220spw) this.LJII.getValue()) != null) {
                        interfaceC1642220spw.hide();
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                ((InterfaceC1644040sss) this.LJI.getValue()).LJJ(false);
                if (enumC1642190spt2 == EnumC1642190spt.LL) {
                    InterfaceC1642220spw interfaceC1642220spw2 = (InterfaceC1642220spw) this.LJII.getValue();
                    if (interfaceC1642220spw2 != null) {
                        interfaceC1642220spw2.hide();
                    }
                    ((InterfaceC1644040sss) this.LJI.getValue()).q2();
                }
            }
        } else {
            InterfaceC1642220spw interfaceC1642220spw3 = (InterfaceC1642220spw) this.LJII.getValue();
            if (interfaceC1642220spw3 != null) {
                interfaceC1642220spw3.show();
            }
            if (enumC1642190spt2 == EnumC1642190spt.LLILLJJLI) {
                ((InterfaceC1644040sss) this.LJI.getValue()).hide();
            }
        }
        this.LJIIIIZZ = enumC1642190spt;
        EnumC1642190spt enumC1642190spt3 = EnumC1642190spt.LLILLL;
        if (enumC1642190spt2 == enumC1642190spt3) {
            InterfaceC524950KiL interfaceC524950KiL = this.LIZJ;
            if (interfaceC524950KiL != null) {
                interfaceC524950KiL.kF((InterfaceC362610EJn) this.LJIIIZ.getValue());
            }
            this.LJ.onNext(Boolean.TRUE);
            return;
        }
        if (enumC1642190spt != enumC1642190spt3) {
            return;
        }
        InterfaceC524950KiL interfaceC524950KiL2 = this.LIZJ;
        if (interfaceC524950KiL2 != null) {
            interfaceC524950KiL2.b8((InterfaceC362610EJn) this.LJIIIZ.getValue());
        }
        this.LJ.onNext(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1642210spv(Function0<? extends InterfaceC1644040sss> function0, Function0<? extends InterfaceC1642220spw> function02, InterfaceC524950KiL interfaceC524950KiL, Function0<Unit> function03) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = interfaceC524950KiL;
        this.LIZLLL = function03;
    }
}
