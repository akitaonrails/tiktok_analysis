package X;

/* JADX INFO: renamed from: X.1DGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2253021DGi {
    public final String LIZ;
    public final C1660750tJp LIZIZ;
    public final C2253031DGj LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SensitiveApiEvent: type: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", context: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", action: ");
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2253021DGi(String str, C1660750tJp c1660750tJp, C2253031DGj c2253031DGj) {
        this.LIZ = str;
        this.LIZIZ = c1660750tJp;
        this.LIZJ = c2253031DGj;
    }
}
