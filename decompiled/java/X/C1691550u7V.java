package X;

import java.util.List;

/* JADX INFO: renamed from: X.0u7V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691550u7V {
    public final C1692220u8a LIZ;
    public final C1693430uAX LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final InterfaceC1690500u5o LJI;
    public final InterfaceC594710NUf LJII;
    public final List<C1692270u8f<C1680210tpD>> LJIIIIZZ;
    public C1692210u8Z LJIIIZ;
    public EnumC1671200tag LJIIJ;

    public final void LIZ(EnumC1671200tag enumC1671200tag) {
        C1692210u8Z c1692210u8Z = this.LJIIIZ;
        if (c1692210u8Z == null || enumC1671200tag != this.LJIIJ || c1692210u8Z.LIZ()) {
            this.LJIIJ = enumC1671200tag;
            c1692210u8Z = new C1692210u8Z(this.LIZ, C1693460uAa.LIZ(this.LIZIZ, enumC1671200tag), this.LJIIIIZZ, this.LJI, this.LJII);
        }
        this.LJIIIZ = c1692210u8Z;
    }

    public C1691550u7V(C1692220u8a c1692220u8a, C1693430uAX c1693430uAX, boolean z, InterfaceC1690500u5o interfaceC1690500u5o, InterfaceC594710NUf interfaceC594710NUf) {
        this(c1692220u8a, c1693430uAX, Integer.MAX_VALUE, 1, z, 1, interfaceC1690500u5o, interfaceC594710NUf, C13BV.INSTANCE);
    }

    public C1691550u7V(C1692220u8a c1692220u8a, C1693430uAX c1693430uAX, int i, int i2, boolean z, int i3, InterfaceC1690500u5o interfaceC1690500u5o, InterfaceC594710NUf interfaceC594710NUf, List list) {
        this.LIZ = c1692220u8a;
        this.LIZIZ = c1693430uAX;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = z;
        this.LJFF = i3;
        this.LJI = interfaceC1690500u5o;
        this.LJII = interfaceC594710NUf;
        this.LJIIIIZZ = list;
        if (i <= 0) {
            C1691080u6k.LIZ("no maxLines");
        }
        if (i2 <= 0) {
            C1691080u6k.LIZ("no minLines");
        }
        if (i2 > i) {
            C1691080u6k.LIZ("minLines greater than maxLines");
        }
    }
}
