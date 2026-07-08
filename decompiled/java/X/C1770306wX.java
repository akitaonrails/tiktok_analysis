package X;

/* JADX INFO: renamed from: X.06wX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1770306wX extends AbstractC1542200qEc {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        switch (this.$t) {
            case 0:
                LJL$0(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            case 1:
            case 2:
            default:
                super.LJL(interfaceC1541990qEH, str, c1542120qEU);
                break;
            case 3:
                LJL$1(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 0:
                LJLIIIL$0(this, interfaceC1541990qEH);
                break;
            case 1:
            default:
                super.LJLIIIL(interfaceC1541990qEH);
                break;
            case 2:
                LJLIIIL$1(this, interfaceC1541990qEH);
                break;
            case 3:
                LJLIIIL$2(this, interfaceC1541990qEH);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        switch (this.$t) {
            case 1:
                LJLIIL$0(this, interfaceC1541990qEH, str);
                break;
            case 2:
            default:
                super.LJLIIL(interfaceC1541990qEH, str);
                break;
            case 3:
                C1590806Ks.LIZ("SPWidget load start");
                break;
        }
    }

    public C1770306wX(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJLIIIL$0(C1770306wX c1770306wX, InterfaceC1541990qEH interfaceC1541990qEH) {
        C1576906Fj c1576906Fj = (C1576906Fj) c1770306wX.l0;
        if (!c1576906Fj.LJIIIIZZ) {
            C1576606Fg.LIZJ("open Fe panel callback Success ", null, c1576906Fj.LIZIZ, null);
            C06FF c06ff = C06FF.LL;
            C1576906Fj c1576906Fj2 = (C1576906Fj) c1770306wX.l0;
            C06FF.LIZJ(c06ff, c1576906Fj2.LIZIZ, 2, c1576906Fj2.LJFF.getValue(), ((C1576906Fj) c1770306wX.l0).LIZ.LIZ, Boolean.TRUE, null, null, 224);
        }
    }

    public static final void LJLIIIL$1(C1770306wX c1770306wX, InterfaceC1541990qEH interfaceC1541990qEH) {
        C1594706Mf c1594706Mf = (C1594706Mf) c1770306wX.l0;
        InterfaceC1594906Mh interfaceC1594906Mh = c1594706Mf.LIZIZ;
        if (interfaceC1594906Mh != null) {
            interfaceC1594906Mh.LIZ(c1594706Mf.LIZLLL);
        }
    }

    public static final void LJLIIIL$2(C1770306wX c1770306wX, InterfaceC1541990qEH interfaceC1541990qEH) {
        C1590806Ks.LIZ("SPWidget load successfully");
        C06HD c06hd = (C06HD) c1770306wX.l0;
        c06hd.getClass();
        C1590806Ks.LIZ("SPWidget startFallbackReplaceJob");
        c06hd.LLJJIJIIJIL = C23250099c.LIZLLL(c06hd.LLJJIII, c06hd.LIZLLL().LIZ, null, new C06HL(c06hd, null), 2);
    }

    public static final void LJLIIL$0(C1770306wX c1770306wX, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C06EK c06ek = (C06EK) c1770306wX.l0;
        c06ek.LJIIJ = interfaceC1541990qEH;
        if (c06ek.LJIIJJI) {
            C23250099c.LIZLLL(c06ek.LJIILIIL, null, null, new C06ER(c06ek, interfaceC1541990qEH, null), 3);
        }
    }

    public static final void LJL$0(C1770306wX c1770306wX, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        C1576906Fj c1576906Fj = (C1576906Fj) c1770306wX.l0;
        c1576906Fj.LJIIIIZZ = true;
        C1576606Fg.LIZJ("open Fe panel callback Fail ", null, c1576906Fj.LIZIZ, null);
        C06FF c06ff = C06FF.LL;
        C1576906Fj c1576906Fj2 = (C1576906Fj) c1770306wX.l0;
        C06FF.LIZJ(c06ff, c1576906Fj2.LIZIZ, 2, c1576906Fj2.LJFF.getValue(), ((C1576906Fj) c1770306wX.l0).LIZ.LIZ, Boolean.FALSE, c1542120qEU.LIZ, c1542120qEU.LIZIZ, 128);
    }

    public static final void LJL$1(C1770306wX c1770306wX, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        ((C06HD) c1770306wX.l0).LJIIIIZZ(false, false);
        boolean z = C1590806Ks.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SPWidget load failed ");
        sbLIZ.append(c1542120qEU.LIZ);
        sbLIZ.append(' ');
        sbLIZ.append(c1542120qEU.LIZIZ);
        C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
