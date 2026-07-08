package X;

/* JADX INFO: renamed from: X.0msy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1413460msy {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public String LJFF;
    public final boolean LJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1413460msy() {
        String str = null;
        this(127, str, str, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1413460msy(int i, String str, String str2, String str3) {
        String str4;
        String str5 = str2;
        String str6 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            str4 = "";
        } else {
            str4 = null;
        }
        this(false, str6, str4, (i & 4) != 0 ? "" : null, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str3 : "", false);
    }

    public C1413460msy(boolean z, String str, String str2, String str3, String str4, String str5, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = z2;
    }
}
