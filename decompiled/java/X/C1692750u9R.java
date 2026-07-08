package X;

/* JADX INFO: renamed from: X.0u9R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692750u9R {
    public String LIZ;
    public C1693430uAX LIZIZ;
    public InterfaceC594710NUf LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public int LJFF;
    public int LJI;
    public InterfaceC1690500u5o LJIIIIZZ;
    public C1695170uDL LJIIIZ;
    public boolean LJIIJ;
    public long LJIIJJI;
    public C1692730u9P LJIIL;
    public InterfaceC1692630u9F LJIILIIL;
    public EnumC1671200tag LJIILJJIL;
    public long LJII = C1691840u7y.LIZ;
    public long LJIILL = C1682400tsk.LIZJ(0, 0);
    public int LJIILLIIL = -1;
    public int LJIIZILJ = -1;

    public final void LIZJ() {
        this.LJIIIZ = null;
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        this.LJIILLIIL = -1;
        this.LJIIZILJ = -1;
        this.LJIILL = C1682400tsk.LIZJ(0, 0);
        long j = 0;
        this.LJIIJJI = (j & 4294967295L) | (j << 32);
        this.LJIIJ = false;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ParagraphLayoutCache(paragraph=");
        sbLIZ.append(this.LJIIIZ != null ? "<paragraph>" : "null");
        sbLIZ.append(", lastDensity=");
        long j = this.LJII;
        int i = C1691840u7y.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("InlineDensity(density=");
        sbLIZ2.append(Float.intBitsToFloat((int) (j >> 32)));
        sbLIZ2.append(", fontScale=");
        sbLIZ2.append(Float.intBitsToFloat((int) (j & 4294967295L)));
        sbLIZ2.append(')');
        sbLIZ.append((Object) C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZLLL(InterfaceC1690500u5o interfaceC1690500u5o) {
        long jFloatToRawIntBits;
        InterfaceC1690500u5o interfaceC1690500u5o2 = this.LJIIIIZZ;
        if (interfaceC1690500u5o != null) {
            int i = C1691840u7y.LIZIZ;
            float density = interfaceC1690500u5o.getDensity();
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(interfaceC1690500u5o.LJJ())) & 4294967295L) | (Float.floatToRawIntBits(density) << 32);
        } else {
            jFloatToRawIntBits = C1691840u7y.LIZ;
        }
        if (interfaceC1690500u5o2 == null) {
            this.LJIIIIZZ = interfaceC1690500u5o;
            this.LJII = jFloatToRawIntBits;
        } else {
            if (interfaceC1690500u5o != null && this.LJII == jFloatToRawIntBits) {
                return;
            }
            this.LJIIIIZZ = interfaceC1690500u5o;
            this.LJII = jFloatToRawIntBits;
            LIZJ();
        }
    }

    public final InterfaceC1692630u9F LJ(EnumC1671200tag enumC1671200tag) {
        InterfaceC1692630u9F c1695120uDG = this.LJIILIIL;
        if (c1695120uDG == null || enumC1671200tag != this.LJIILJJIL || c1695120uDG.LIZ()) {
            this.LJIILJJIL = enumC1671200tag;
            String str = this.LIZ;
            C1693430uAX c1693430uAXLIZ = C1693460uAa.LIZ(this.LIZIZ, enumC1671200tag);
            C13BV c13bv = C13BV.INSTANCE;
            c1695120uDG = new C1695120uDG(c1693430uAXLIZ, this.LIZJ, this.LJIIIIZZ, str, c13bv, c13bv);
        }
        this.LJIILIIL = c1695120uDG;
        return c1695120uDG;
    }

    public final int LIZ(int i, EnumC1671200tag enumC1671200tag) {
        int i2 = this.LJIILLIIL;
        int i3 = this.LJIIZILJ;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jLIZ = C1682390tsj.LIZ(0, i, 0, Integer.MAX_VALUE);
        if (this.LJI > 1) {
            jLIZ = LJFF(this, jLIZ, enumC1671200tag);
        }
        int iLIZ = C1691570u7X.LIZ(LIZIZ(jLIZ, enumC1671200tag).getHeight());
        int iLJIIIZ = C1682380tsi.LJIIIZ(jLIZ);
        if (iLIZ < iLJIIIZ) {
            iLIZ = iLJIIIZ;
        }
        this.LJIILLIIL = i;
        this.LJIIZILJ = iLIZ;
        return iLIZ;
    }

    public final C1695170uDL LIZIZ(long j, EnumC1671200tag enumC1671200tag) {
        InterfaceC1692630u9F interfaceC1692630u9FLJ = LJ(enumC1671200tag);
        long jLIZ = C1691790u7t.LIZ(this.LJ, this.LIZLLL, interfaceC1692630u9FLJ.LIZJ(), j);
        boolean z = this.LJ;
        int i = this.LIZLLL;
        int i2 = this.LJFF;
        if ((!z && C1691790u7t.LIZIZ(i)) || i2 < 1) {
            i2 = 1;
        }
        return new C1695170uDL((C1695120uDG) interfaceC1692630u9FLJ, i2, this.LIZLLL, jLIZ);
    }

    public static long LJFF(C1692750u9R c1692750u9R, long j, EnumC1671200tag enumC1671200tag) {
        C1693430uAX c1693430uAX = c1692750u9R.LIZIZ;
        c1692750u9R.getClass();
        C1692730u9P c1692730u9PLIZ = C1692740u9Q.LIZ(c1692750u9R.LJIIL, enumC1671200tag, c1693430uAX, c1692750u9R.LJIIIIZZ, c1692750u9R.LIZJ);
        c1692750u9R.LJIIL = c1692730u9PLIZ;
        return c1692730u9PLIZ.LIZ(c1692750u9R.LJI, j);
    }

    public C1692750u9R(String str, C1693430uAX c1693430uAX, InterfaceC594710NUf interfaceC594710NUf, int i, boolean z, int i2, int i3) {
        this.LIZ = str;
        this.LIZIZ = c1693430uAX;
        this.LIZJ = interfaceC594710NUf;
        this.LIZLLL = i;
        this.LJ = z;
        this.LJFF = i2;
        this.LJI = i3;
        long j = 0;
        this.LJIIJJI = (j & 4294967295L) | (j << 32);
    }
}
