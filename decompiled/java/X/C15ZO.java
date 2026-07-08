package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS161S1200000_31;
import kotlin.jvm.internal.AwS680S0100000_31;

/* JADX INFO: renamed from: X.15ZO, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15ZO extends C15ZY {
    public final Function0<Integer> LJII;
    public final String LJIIIIZZ;
    public final Function0<Integer> LJIIIZ;
    public final C15ZI LJIIJ;
    public long LJIIJJI;
    public final AwS161S1200000_31 LJIIL;

    @Override // X.C15ZW
    public final Function2<C20540515Zb, C15ZW, Unit> LIZ() {
        return this.LJIIL;
    }

    @Override // X.C15ZY
    public final long LIZLLL() {
        return this.LJIIJJI;
    }

    @Override // X.C15ZY
    public final Function0<Integer> LJ() {
        return this.LJIIIZ;
    }

    @Override // X.C15ZW
    public final boolean LIZIZ(C15ZP c15zp) {
        C15ZI c15zi;
        InterfaceC20540415Za interfaceC20540415Za;
        if ((c15zp instanceof C15ZI) && (c15zi = (C15ZI) c15zp) != null && (interfaceC20540415Za = c15zi.LIZJ) != null && interfaceC20540415Za.LIZLLL()) {
            return true;
        }
        return false;
    }

    @Override // X.C15ZY
    public final void LJFF(long j) {
        this.LJIIJJI = j;
    }

    public C15ZO(C15ZP c15zp, AFwS189S0000000_3 aFwS189S0000000_3, String str, AwS680S0100000_31 awS680S0100000_31) {
        C15ZI c15zi;
        super("ScreenTimeDashboardStrategy", str, -1);
        this.LJII = aFwS189S0000000_3;
        this.LJIIIIZZ = "ScreenTimeDashboardStrategy";
        this.LJIIIZ = aFwS189S0000000_3;
        if (c15zp instanceof C15ZI) {
            c15zi = (C15ZI) c15zp;
        } else {
            c15zi = null;
        }
        this.LJIIJ = c15zi;
        this.LJIIL = new AwS161S1200000_31(this, str, awS680S0100000_31, 1);
    }
}
