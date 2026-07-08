package X;

/* JADX INFO: renamed from: X.0dCV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041170dCV {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final C1035880d3y LJFF;

    public C1041170dCV() {
        this(0, 0, null, null, null, 63);
    }

    public C1041170dCV(int i, int i2, String str, String str2, C1035880d3y c1035880d3y, int i3) {
        i = (i3 & 1) != 0 ? 0 : i;
        i2 = (i3 & 2) != 0 ? 0 : i2;
        str = (i3 & 4) != 0 ? "" : str;
        str2 = (i3 & 8) != 0 ? "" : str2;
        String str3 = (i3 & 16) == 0 ? null : "";
        c1035880d3y = (i3 & 32) != 0 ? null : c1035880d3y;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = c1035880d3y;
    }
}
