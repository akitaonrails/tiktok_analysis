package X;

/* JADX INFO: renamed from: X.0IN3, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IN3 {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final C0IN2 LIZJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0IN3(boolean z, boolean z2, int i) {
        C0IN2 c0in2;
        z2 = (i & 4) != 0 ? true : z2;
        if ((i & 8) != 0) {
            c0in2 = C0IN2.RECTANGLE;
        } else {
            c0in2 = null;
        }
        this(z, z2, c0in2);
    }

    public C0IN3(boolean z, boolean z2, C0IN2 c0in2) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = c0in2;
    }
}
