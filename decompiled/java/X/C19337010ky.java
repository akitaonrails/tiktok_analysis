package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.10ky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19337010ky extends AbstractC1542100qES {
    public final int $t;
    public Object l0;

    public static final void LJLIIL$0(C19337010ky c19337010ky, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        switch (this.$t) {
            case 0:
                LJL$0(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            case 1:
                LJL$1(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            default:
                super.LJL(interfaceC1541990qEH, str, c1542120qEU);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) throws Throwable {
        switch (this.$t) {
            case 0:
                LJLIIIL$0(this, interfaceC1541990qEH);
                break;
            case 1:
                LJLIIIL$1(this, interfaceC1541990qEH);
                break;
            default:
                super.LJLIIIL(interfaceC1541990qEH);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        switch (this.$t) {
            case 0:
                LJLIIL$0(this, interfaceC1541990qEH, str);
                break;
            case 1:
                LJLIIL$1(this, interfaceC1541990qEH, str);
                break;
            default:
                super.LJLIIL(interfaceC1541990qEH, str);
                break;
        }
    }

    public C19337010ky(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJLIIIL$0(C19337010ky c19337010ky, InterfaceC1541990qEH interfaceC1541990qEH) throws Throwable {
        DialogC1897810zUB dialogC1897810zUB = (DialogC1897810zUB) c19337010ky.l0;
        if (!dialogC1897810zUB.LLIZLLLIL) {
            dialogC1897810zUB.LLJJ = true;
            if (dialogC1897810zUB.LLJILJILJ) {
                if (dialogC1897810zUB.LLILZLL) {
                    dialogC1897810zUB.LJJLJ();
                    return;
                }
                InterfaceC1897910zUL interfaceC1897910zUL = dialogC1897810zUB.LLILZIL.LJ;
                if (interfaceC1897910zUL == null) {
                    return;
                }
                interfaceC1897910zUL.LJIJJLI();
            }
        }
    }

    public static final void LJLIIIL$1(C19337010ky c19337010ky, InterfaceC1541990qEH interfaceC1541990qEH) throws Throwable {
        DialogC1895510zQT dialogC1895510zQT = (DialogC1895510zQT) c19337010ky.l0;
        if (!dialogC1895510zQT.LLIZ) {
            dialogC1895510zQT.LLJI = System.currentTimeMillis();
            DialogC1895510zQT dialogC1895510zQT2 = (DialogC1895510zQT) c19337010ky.l0;
            if (dialogC1895510zQT2.LLILZLL) {
                dialogC1895510zQT2.LJJLIIIJLLLLLLLZ();
                return;
            }
            if (dialogC1895510zQT2.LLJIJIL) {
                C01U6.LIZIZ(new AwS572S0100000_28(dialogC1895510zQT2, 1077));
                ((DialogC1895510zQT) c19337010ky.l0).LJJLIIIJLLLLLLLZ();
            } else {
                InterfaceC1895520zQU interfaceC1895520zQU = dialogC1895510zQT2.LLILZIL.LJ;
                if (interfaceC1895520zQU == null) {
                    return;
                }
                interfaceC1895520zQU.LJIJJLI();
            }
        }
    }

    public static final void LJLIIL$1(C19337010ky c19337010ky, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        DialogC1895510zQT dialogC1895510zQT = (DialogC1895510zQT) c19337010ky.l0;
        dialogC1895510zQT.getClass();
        try {
            C01U6.LIZIZ(new AwS572S0100000_28(dialogC1895510zQT, 1076));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LJL$0(C19337010ky c19337010ky, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        DialogC1897810zUB dialogC1897810zUB = (DialogC1897810zUB) c19337010ky.l0;
        dialogC1897810zUB.LLIZLLLIL = true;
        InterfaceC1897910zUL interfaceC1897910zUL = dialogC1897810zUB.LLILZIL.LJ;
        if (interfaceC1897910zUL != null) {
            interfaceC1897910zUL.LJIL(c1542120qEU.LIZIZ);
        }
        DialogC1897810zUB dialogC1897810zUB2 = (DialogC1897810zUB) c19337010ky.l0;
        dialogC1897810zUB2.dismiss();
        C785410UrT.LIZ(dialogC1897810zUB2);
    }

    public static final void LJL$1(C19337010ky c19337010ky, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        DialogC1895510zQT dialogC1895510zQT = (DialogC1895510zQT) c19337010ky.l0;
        dialogC1895510zQT.LLIZ = true;
        InterfaceC1895520zQU interfaceC1895520zQU = dialogC1895510zQT.LLILZIL.LJ;
        if (interfaceC1895520zQU != null) {
            interfaceC1895520zQU.LIZIZ();
        }
        DialogC1895510zQT dialogC1895510zQT2 = (DialogC1895510zQT) c19337010ky.l0;
        dialogC1895510zQT2.dismiss();
        C785410UrT.LIZ(dialogC1895510zQT2);
    }
}
