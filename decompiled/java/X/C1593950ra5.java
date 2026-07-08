package X;

/* JADX INFO: renamed from: X.0ra5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593950ra5 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1593950ra5(String str, String str2, int i) {
        String str3;
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        this(str, str2, str3, (i & 8) == 0 ? null : "");
    }

    public C1593950ra5(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
