package X;

/* JADX INFO: renamed from: X.0tv3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683830tv3 implements InterfaceC1672820tdI {
    public final int LIZIZ;
    public final String LIZJ;
    public final C05P0 LIZLLL = C20028913Yh.LJI(C20244914Jj.LJ);
    public final C05P0 LJ = C20028913Yh.LJI(Boolean.TRUE);

    public final C20244914Jj LJ() {
        return (C20244914Jj) this.LIZLLL.getValue();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('(');
        sbLIZ.append(LJ().LIZ);
        sbLIZ.append(", ");
        sbLIZ.append(LJ().LIZIZ);
        sbLIZ.append(", ");
        sbLIZ.append(LJ().LIZJ);
        sbLIZ.append(", ");
        sbLIZ.append(LJ().LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZ(InterfaceC1690500u5o interfaceC1690500u5o) {
        return LJ().LIZIZ;
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZLLL(InterfaceC1690500u5o interfaceC1690500u5o) {
        return LJ().LIZLLL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1683830tv3) && this.LIZIZ == ((C1683830tv3) obj).LIZIZ) {
            return true;
        }
        return false;
    }

    public C1683830tv3(int i, String str) {
        this.LIZIZ = i;
        this.LIZJ = str;
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZIZ(InterfaceC1690500u5o interfaceC1690500u5o, EnumC1671200tag enumC1671200tag) {
        return LJ().LIZJ;
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZJ(InterfaceC1690500u5o interfaceC1690500u5o, EnumC1671200tag enumC1671200tag) {
        return LJ().LIZ;
    }

    public final void LJFF(C20246014Ju c20246014Ju, int i) {
        if (i == 0 || (i & this.LIZIZ) != 0) {
            ((C13FE) this.LIZLLL).setValue(c20246014Ju.LIZ(this.LIZIZ));
            boolean zLJIIIIZZ = c20246014Ju.LJIIIIZZ(this.LIZIZ);
            ((C13FE) this.LJ).setValue(Boolean.valueOf(zLJIIIIZZ));
        }
    }
}
