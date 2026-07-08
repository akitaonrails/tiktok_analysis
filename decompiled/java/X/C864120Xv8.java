package X;

/* JADX INFO: renamed from: X.0Xv8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C864120Xv8 {
    public final boolean LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public C864120Xv8(int i) {
        boolean z;
        long j;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            j = 300;
        } else {
            j = 0;
        }
        long j2 = (i & 4) != 0 ? 1209600000L : 0L;
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
