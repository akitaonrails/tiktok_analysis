package X;

/* JADX INFO: renamed from: X.0bNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C971360bNu {
    public String LIZ;
    public int LIZIZ;
    public String LIZJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C971360bNu() {
        String str = null;
        this(str, 0, str, 15);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("text: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(". ");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C971360bNu(String str, int i, String str2, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) == 0 ? null : "");
    }

    public C971360bNu(String str, int i, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
    }
}
