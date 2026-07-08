package X;

/* JADX INFO: renamed from: X.0jlH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293370jlH implements InterfaceC1292590jk1 {
    public final String LIZ;
    public final int LIZIZ;
    public final C1293070jkn LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShapePath{name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1292590jk1
    public final InterfaceC1291780jii LIZ(C1291430ji9 c1291430ji9, AbstractC1292630jk5 abstractC1292630jk5) {
        return new C1293380jlI(c1291430ji9, abstractC1292630jk5, this);
    }

    public C1293370jlH(String str, int i, C1293070jkn c1293070jkn) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = c1293070jkn;
    }
}
