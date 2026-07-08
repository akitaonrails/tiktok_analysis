package X;

import java.util.List;

/* JADX INFO: renamed from: X.0u7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691770u7r {
    public C1692220u8a LIZ;
    public InterfaceC594710NUf LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public List<C1692270u8f<C1680210tpD>> LJI;
    public InterfaceC1691630u7d LJII;
    public C1692730u9P LJIIIIZZ;
    public InterfaceC1690500u5o LJIIJ;
    public C1693430uAX LJIIJJI;
    public C1692210u8Z LJIIL;
    public EnumC1671200tag LJIILIIL;
    public C1692150u8T LJIILJJIL;
    public C1691780u7s LJIIZILJ;
    public long LJIIIZ = C1691840u7y.LIZ;
    public int LJIILL = -1;
    public int LJIILLIIL = -1;

    public final void LIZJ(InterfaceC1690500u5o interfaceC1690500u5o) {
        long jFloatToRawIntBits;
        InterfaceC1690500u5o interfaceC1690500u5o2 = this.LJIIJ;
        if (interfaceC1690500u5o != null) {
            int i = C1691840u7y.LIZIZ;
            float density = interfaceC1690500u5o.getDensity();
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(interfaceC1690500u5o.LJJ())) & 4294967295L) | (Float.floatToRawIntBits(density) << 32);
        } else {
            jFloatToRawIntBits = C1691840u7y.LIZ;
        }
        if (interfaceC1690500u5o2 == null) {
            this.LJIIJ = interfaceC1690500u5o;
            this.LJIIIZ = jFloatToRawIntBits;
        } else {
            if (interfaceC1690500u5o != null && this.LJIIIZ == jFloatToRawIntBits) {
                return;
            }
            this.LJIIJ = interfaceC1690500u5o;
            this.LJIIIZ = jFloatToRawIntBits;
            this.LJIIL = null;
            this.LJIILJJIL = null;
            this.LJIILLIIL = -1;
            this.LJIILL = -1;
            this.LJIIZILJ = null;
        }
    }

    public final C1692210u8Z LIZLLL(EnumC1671200tag enumC1671200tag) {
        C1692210u8Z c1692210u8Z = this.LJIIL;
        if (c1692210u8Z == null || enumC1671200tag != this.LJIILIIL || c1692210u8Z.LIZ()) {
            this.LJIILIIL = enumC1671200tag;
            C1692220u8a c1692220u8a = this.LIZ;
            C1693430uAX c1693430uAXLIZ = C1693460uAa.LIZ(this.LJIIJJI, enumC1671200tag);
            InterfaceC1690500u5o interfaceC1690500u5o = this.LJIIJ;
            InterfaceC594710NUf interfaceC594710NUf = this.LIZIZ;
            List list = this.LJI;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            c1692210u8Z = new C1692210u8Z(c1692220u8a, c1693430uAXLIZ, list, interfaceC1690500u5o, interfaceC594710NUf);
        }
        this.LJIIL = c1692210u8Z;
        return c1692210u8Z;
    }

    public final void LJ(C1693430uAX c1693430uAX) {
        boolean zLIZLLL = c1693430uAX.LIZLLL(this.LJIIJJI);
        this.LJIIJJI = c1693430uAX;
        if (!zLIZLLL) {
            this.LJIIL = null;
            this.LJIILJJIL = null;
            this.LJIILLIIL = -1;
            this.LJIILL = -1;
        }
    }

    public final int LIZ(int i, EnumC1671200tag enumC1671200tag) {
        int i2 = this.LJIILL;
        int i3 = this.LJIILLIIL;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jLIZ = C1682390tsj.LIZ(0, i, 0, Integer.MAX_VALUE);
        if (this.LJFF > 1) {
            jLIZ = LJI(jLIZ, enumC1671200tag);
        }
        int iLIZ = C1691570u7X.LIZ(LIZIZ(jLIZ, enumC1671200tag).LJ);
        int iLJIIIZ = C1682380tsi.LJIIIZ(jLIZ);
        if (iLIZ < iLJIIIZ) {
            iLIZ = iLJIIIZ;
        }
        this.LJIILL = i;
        this.LJIILLIIL = iLIZ;
        return iLIZ;
    }

    public final C1692200u8Y LIZIZ(long j, EnumC1671200tag enumC1671200tag) {
        C1692210u8Z c1692210u8ZLIZLLL = LIZLLL(enumC1671200tag);
        long jLIZ = C1691790u7t.LIZ(this.LIZLLL, this.LIZJ, c1692210u8ZLIZLLL.LIZJ(), j);
        boolean z = this.LIZLLL;
        int i = this.LIZJ;
        int i2 = this.LJ;
        int i3 = 1;
        if (z || !C1691790u7t.LIZIZ(i)) {
            if (i2 < 1) {
                i2 = 1;
            }
            i3 = i2;
        }
        return new C1692200u8Y(c1692210u8ZLIZLLL, jLIZ, i3, this.LIZJ);
    }

    public final long LJI(long j, EnumC1671200tag enumC1671200tag) {
        C1692730u9P c1692730u9PLIZ = C1692740u9Q.LIZ(this.LJIIIIZZ, enumC1671200tag, this.LJIIJJI, this.LJIIJ, this.LIZIZ);
        this.LJIIIIZZ = c1692730u9PLIZ;
        return c1692730u9PLIZ.LIZ(this.LJFF, j);
    }

    public final C1692150u8T LJFF(EnumC1671200tag enumC1671200tag, long j, C1692200u8Y c1692200u8Y) {
        float fMin = Math.min(c1692200u8Y.LIZ.LIZJ(), c1692200u8Y.LIZLLL);
        C1692220u8a c1692220u8a = this.LIZ;
        C1693430uAX c1693430uAX = this.LJIIJJI;
        List list = this.LJI;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        return new C1692150u8T(new C1683230tu5(c1692220u8a, c1693430uAX, list, this.LJ, this.LIZLLL, this.LIZJ, this.LJIIJ, enumC1671200tag, this.LIZIZ, j), c1692200u8Y, C1682390tsj.LIZLLL(j, (((long) C1691570u7X.LIZ(fMin)) << 32) | (((long) C1691570u7X.LIZ(c1692200u8Y.LJ)) & 4294967295L)));
    }

    public C1691770u7r(C1692220u8a c1692220u8a, C1693430uAX c1693430uAX, InterfaceC594710NUf interfaceC594710NUf, int i, boolean z, int i2, int i3, List list, InterfaceC1691630u7d interfaceC1691630u7d) {
        this.LIZ = c1692220u8a;
        this.LIZIZ = interfaceC594710NUf;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = list;
        this.LJII = interfaceC1691630u7d;
        this.LJIIJJI = c1693430uAX;
    }
}
