package X;

/* JADX INFO: renamed from: X.0i3Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227740i3Q {
    public static final /* synthetic */ int LJFF = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public boolean LIZLLL;
    public long LJ;

    public C1227740i3Q(String str, String str2, String str3, int i) {
        boolean z;
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
        this.LJ = 0L;
    }
}
