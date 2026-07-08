package X;

/* JADX INFO: renamed from: X.15ks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20610415ks {
    public final String LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public C20610415ks() {
        this(null, 0, false, false, 31);
    }

    public C20610415ks(String str, int i, boolean z, boolean z2, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        i = (i2 & 2) != 0 ? -1 : i;
        z = (i2 & 4) != 0 ? true : z;
        z2 = (i2 & 16) != 0 ? false : z2;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
