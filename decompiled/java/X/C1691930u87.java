package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u87, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691930u87 {
    public C1691550u7V LIZ;
    public final InterfaceC1675110tgz LIZIZ;
    public final InterfaceC1679450tnz LIZJ;
    public final C1694260uBs LIZLLL = new C1694260uBs();
    public C1692530u95 LJ;
    public final C05P0 LJFF;
    public final C05P0 LJI;
    public InterfaceC1692950u9l LJII;
    public final C05P0<C1691980u8C> LJIIIIZZ;
    public C1692220u8a LJIIIZ;
    public final C05P0 LJIIJ;
    public final C05P0 LJIIJJI;
    public final C05P0 LJIIL;
    public final C05P0 LJIILIIL;
    public final C05P0 LJIILJJIL;
    public boolean LJIILL;
    public final C05P0 LJIILLIIL;
    public final C1692550u97 LJIIZILJ;
    public final C05P0 LJIJ;
    public final C05P0 LJIJI;
    public Function1<? super C1686970u07, Unit> LJIJJ;
    public final AwS604S0100000_25 LJIJJLI;
    public final AwS604S0100000_25 LJIL;
    public final C1695150uDJ LJJ;
    public long LJJI;
    public final C05P0 LJJIFFI;
    public final C05P0 LJJII;

    public final EnumC1684410tvz LIZ() {
        return (EnumC1684410tvz) this.LJIIJ.getValue();
    }

    public final boolean LIZIZ() {
        return ((Boolean) this.LJFF.getValue()).booleanValue();
    }

    public final InterfaceC1692950u9l LIZJ() {
        InterfaceC1692950u9l interfaceC1692950u9l = this.LJII;
        if (interfaceC1692950u9l == null || !interfaceC1692950u9l.LIZLLL()) {
            return null;
        }
        return interfaceC1692950u9l;
    }

    public final C1691980u8C LIZLLL() {
        return (C1691980u8C) ((C13FE) this.LJIIIIZZ).getValue();
    }

    public final boolean LJ() {
        return (C1692280u8g.LIZJ(((C1692280u8g) ((C13FE) this.LJJIFFI).getValue()).LIZ) && C1692280u8g.LIZJ(((C1692280u8g) ((C13FE) this.LJJII).getValue()).LIZ)) ? false : true;
    }

    public final void LJFF(long j) {
        ((C13FE) this.LJJII).setValue(new C1692280u8g(j));
    }

    public final void LJI(long j) {
        ((C13FE) this.LJJIFFI).setValue(new C1692280u8g(j));
    }

    public C1691930u87(C1691550u7V c1691550u7V, InterfaceC1675110tgz interfaceC1675110tgz, InterfaceC1679450tnz interfaceC1679450tnz) {
        this.LIZ = c1691550u7V;
        this.LIZIZ = interfaceC1675110tgz;
        this.LIZJ = interfaceC1679450tnz;
        Boolean bool = Boolean.FALSE;
        this.LJFF = C20028913Yh.LJI(bool);
        this.LJI = C20028913Yh.LJI(new C1668650tWZ(0));
        this.LJIIIIZZ = C20028913Yh.LJI(null);
        this.LJIIJ = C20028913Yh.LJI(EnumC1684410tvz.None);
        this.LJIIJJI = C20028913Yh.LJI(bool);
        this.LJIIL = C20028913Yh.LJI(bool);
        this.LJIILIIL = C20028913Yh.LJI(bool);
        this.LJIILJJIL = C20028913Yh.LJI(bool);
        this.LJIILL = true;
        this.LJIILLIIL = C20028913Yh.LJI(Boolean.TRUE);
        this.LJIIZILJ = new C1692550u97(interfaceC1679450tnz);
        this.LJIJ = C20028913Yh.LJI(bool);
        this.LJIJI = C20028913Yh.LJI(bool);
        this.LJIJJ = AFwS266S0000000_25.get$arr$(584);
        this.LJIJJLI = new AwS604S0100000_25(this, 922);
        this.LJIL = new AwS604S0100000_25(this, 921);
        this.LJJ = C1695550uDx.LIZ();
        this.LJJI = C1685910tyP.LJIIJ;
        long j = C1692280u8g.LIZIZ;
        this.LJJIFFI = C20028913Yh.LJI(new C1692280u8g(j));
        this.LJJII = C20028913Yh.LJI(new C1692280u8g(j));
    }

    public final void LJII(C1692220u8a c1692220u8a, C1692220u8a c1692220u8a2, C1693430uAX c1693430uAX, boolean z, InterfaceC1690500u5o interfaceC1690500u5o, InterfaceC594710NUf interfaceC594710NUf, Function1<? super C1686970u07, Unit> function1, C1692570u99 c1692570u99, InterfaceC1686540tzQ interfaceC1686540tzQ, long j) {
        this.LJIJJ = function1;
        this.LJJI = j;
        C1692550u97 c1692550u97 = this.LJIIZILJ;
        c1692550u97.LIZIZ = c1692570u99;
        c1692550u97.LIZJ = interfaceC1686540tzQ;
        this.LJIIIZ = c1692220u8a;
        C1691550u7V c1691550u7V = this.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        if (!Intrinsics.LJFF(c1691550u7V.LIZ, c1692220u8a2) || !Intrinsics.LJFF(c1691550u7V.LIZIZ, c1693430uAX) || c1691550u7V.LJ != z || c1691550u7V.LJFF != 1 || c1691550u7V.LIZJ != Integer.MAX_VALUE || c1691550u7V.LIZLLL != 1 || !Intrinsics.LJFF(c1691550u7V.LJI, interfaceC1690500u5o) || !Intrinsics.LJFF(c1691550u7V.LJIIIIZZ, c13bv) || c1691550u7V.LJII != interfaceC594710NUf) {
            c1691550u7V = new C1691550u7V(c1692220u8a2, c1693430uAX, Integer.MAX_VALUE, 1, z, 1, interfaceC1690500u5o, interfaceC594710NUf, c13bv);
        }
        if (this.LIZ != c1691550u7V) {
            this.LJIILL = true;
        }
        this.LIZ = c1691550u7V;
    }
}
