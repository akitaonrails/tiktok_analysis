package X;

/* JADX INFO: renamed from: X.0ntu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452480ntu {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    public C1452480ntu(boolean z, boolean z2, int i) {
        String strLIZIZ;
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        if ((i & 4) != 0) {
            strLIZIZ = C1453840nw6.LIZIZ();
        } else {
            strLIZIZ = null;
        }
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = strLIZIZ;
    }
}
