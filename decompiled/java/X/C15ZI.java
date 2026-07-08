package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS680S0100000_31;

/* JADX INFO: renamed from: X.15ZI, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15ZI extends C15ZP implements InterfaceC20541615Zm {
    public final InterfaceC20540415Za LIZJ;
    public C15ZU LIZLLL;
    public C15ZU LJ;
    public C15ZO LJFF;

    @Override // X.InterfaceC20541615Zm
    public final void LIZ() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C597490Nc3(this, null), 3);
    }

    @Override // X.InterfaceC20541615Zm
    public final void LIZIZ() {
        InterfaceC20540415Za interfaceC20540415Za = this.LIZJ;
        if (interfaceC20540415Za != null) {
            interfaceC20540415Za.LIZIZ();
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C15ZF(this, null), 3);
    }

    public final void LJI() {
        String strLIZ;
        InterfaceC20540415Za interfaceC20540415Za = this.LIZJ;
        if (interfaceC20540415Za == null || (strLIZ = interfaceC20540415Za.LIZ()) == null) {
            strLIZ = "";
        }
        C15ZO c15zo = new C15ZO(this, AFwS189S0000000_3.get$arr$(1762), strLIZ, new AwS680S0100000_31(this, 14));
        LJFF(c15zo.LJIIIIZZ, EnumC992810bwV.REMOVE_BY_BIZ);
        LIZJ(c15zo);
        this.LJFF = c15zo;
        LJII();
    }

    public final void LJII() {
        String strLIZ;
        String strLIZ2;
        InterfaceC20540415Za interfaceC20540415Za = this.LIZJ;
        String str = "";
        if (interfaceC20540415Za == null || (strLIZ = interfaceC20540415Za.LIZ()) == null) {
            strLIZ = "";
        }
        C15ZU c15zu = new C15ZU(this, "ScreenTimeDashboardForBackgroundStrategy", strLIZ);
        EnumC992810bwV enumC992810bwV = EnumC992810bwV.REMOVE_BY_BIZ;
        LJFF("ScreenTimeDashboardForBackgroundStrategy", enumC992810bwV);
        LIZJ(c15zu);
        this.LJ = c15zu;
        InterfaceC20540415Za interfaceC20540415Za2 = this.LIZJ;
        if (interfaceC20540415Za2 != null && (strLIZ2 = interfaceC20540415Za2.LIZ()) != null) {
            str = strLIZ2;
        }
        C15ZU c15zu2 = new C15ZU(this, "AppOpenTimesStrategy", str);
        LJFF("AppOpenTimesStrategy", enumC992810bwV);
        LIZJ(c15zu2);
        this.LIZLLL = c15zu2;
    }

    public final void LJIIIIZZ() {
        C15ZR c15zr;
        C15ZQ c15zq;
        C15ZR c15zr2;
        C15ZQ c15zq2;
        boolean zLJI = MethodIDManager.LJI(71899);
        C15ZU c15zu = this.LIZLLL;
        if (c15zu != null && (c15zr2 = C15ZR.LIZLLL) != null && (c15zq2 = c15zr2.LIZIZ) != null) {
            c15zq2.LIZ(c15zu, this);
        }
        C15ZU c15zu2 = this.LJ;
        if (c15zu2 != null && (c15zr = C15ZR.LIZLLL) != null && (c15zq = c15zr.LIZIZ) != null) {
            c15zq.LIZ(c15zu2, this);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public C15ZI(InterfaceC20540415Za interfaceC20540415Za) {
        super("ScreenTimeDashboard");
        this.LIZJ = interfaceC20540415Za;
        C20541515Zl.LIZ(this);
    }
}
