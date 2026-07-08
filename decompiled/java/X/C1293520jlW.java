package X;

/* JADX INFO: renamed from: X.0jlW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293520jlW implements InterfaceC1292590jk1 {
    public final String LIZ;
    public final EnumC994260byq LIZIZ;
    public final C1292960jkc LIZJ;
    public final C1292960jkc LIZLLL;
    public final C1292960jkc LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Trim Path: {start: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", end: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", offset: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1292590jk1
    public final InterfaceC1291780jii LIZ(C1291430ji9 c1291430ji9, AbstractC1292630jk5 abstractC1292630jk5) {
        return new C1293500jlU(abstractC1292630jk5, this);
    }

    public C1293520jlW(String str, EnumC994260byq enumC994260byq, C1292960jkc c1292960jkc, C1292960jkc c1292960jkc2, C1292960jkc c1292960jkc3) {
        this.LIZ = str;
        this.LIZIZ = enumC994260byq;
        this.LIZJ = c1292960jkc;
        this.LIZLLL = c1292960jkc2;
        this.LJ = c1292960jkc3;
    }
}
