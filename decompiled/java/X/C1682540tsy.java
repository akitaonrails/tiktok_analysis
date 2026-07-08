package X;

/* JADX INFO: renamed from: X.0tsy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682540tsy implements InterfaceC1672820tdI {
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final int hashCode() {
        return (((((this.LIZIZ * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Insets(left=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", top=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", right=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", bottom=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZ(InterfaceC1690500u5o interfaceC1690500u5o) {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZLLL(InterfaceC1690500u5o interfaceC1690500u5o) {
        return this.LJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1682540tsy)) {
            return false;
        }
        C1682540tsy c1682540tsy = (C1682540tsy) obj;
        if (this.LIZIZ == c1682540tsy.LIZIZ && this.LIZJ == c1682540tsy.LIZJ && this.LIZLLL == c1682540tsy.LIZLLL && this.LJ == c1682540tsy.LJ) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZIZ(InterfaceC1690500u5o interfaceC1690500u5o, EnumC1671200tag enumC1671200tag) {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZJ(InterfaceC1690500u5o interfaceC1690500u5o, EnumC1671200tag enumC1671200tag) {
        return this.LIZIZ;
    }

    public C1682540tsy(int i, int i2, int i3, int i4) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
    }
}
