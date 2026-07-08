package X;

/* JADX INFO: renamed from: X.0I2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460110I2n {
    public final String LIZ;
    public final C460090I2l LIZIZ;
    public final C460090I2l LIZJ;
    public final boolean LIZLLL;

    public C460110I2n(String str, C460090I2l c460090I2l, int i) {
        boolean z;
        c460090I2l = (i & 4) != 0 ? null : c460090I2l;
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = str;
        this.LIZIZ = null;
        this.LIZJ = c460090I2l;
        this.LIZLLL = z;
    }
}
