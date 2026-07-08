package X;

/* JADX INFO: renamed from: X.0dlx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1063150dlx {
    public final int LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public C1063150dlx() {
        this(0, null, null, null, false, 31);
    }

    public C1063150dlx(int i, String str, Integer num, String str2, boolean z, int i2) {
        i = (i2 & 1) != 0 ? 0 : i;
        str = (i2 & 2) != 0 ? null : str;
        num = (i2 & 4) != 0 ? null : num;
        str2 = (i2 & 8) != 0 ? null : str2;
        z = (i2 & 16) != 0 ? false : z;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = num;
        this.LIZLLL = str2;
        this.LJ = z;
    }
}
