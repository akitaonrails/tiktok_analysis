package X;

/* JADX INFO: renamed from: X.10RH, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10RH {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public C10RH(int i, String str, String str2, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        str2 = (i2 & 2) != 0 ? "" : str2;
        i = (i2 & 4) != 0 ? 0 : i;
        z = (i2 & 16) != 0 ? C10RL.LIZ() : z;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = null;
        this.LJ = z;
    }
}
