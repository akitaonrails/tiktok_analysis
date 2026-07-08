package X;

/* JADX INFO: renamed from: X.0Cps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325780Cps {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final EnumC325770Cpr LJFF;

    public C325780Cps(int i, EnumC325770Cpr enumC325770Cpr, int i2) {
        int i3;
        if ((i2 & 1) != 0) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = 0;
        }
        i = (i2 & 4) != 0 ? Integer.MAX_VALUE : i;
        enumC325770Cpr = (i2 & 64) != 0 ? EnumC325770Cpr.UNSPECIFIED : enumC325770Cpr;
        this.LIZ = i3;
        this.LIZIZ = 0;
        this.LIZJ = i;
        this.LIZLLL = 0;
        this.LJ = null;
        this.LJFF = enumC325770Cpr;
    }
}
