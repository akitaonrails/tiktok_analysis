package X;

/* JADX INFO: renamed from: X.0uT9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1704970uT9 {
    public static final C1704970uT9 LIZLLL = new C1704970uT9("1", (String) null, 6);
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1704970uT9() {
        String str = null;
        this(str, str, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1704970uT9(String str, String str2, int i) {
        String str3;
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        this(str, str3, (i & 4) != 0 ? "" : str2);
    }

    public C1704970uT9(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
