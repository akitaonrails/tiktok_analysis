package X;

/* JADX INFO: renamed from: X.0iTQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1243860iTQ {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C1243860iTQ() {
        this(false, false);
    }

    public C1243860iTQ(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }

    public static C1243860iTQ LIZ(C1243860iTQ c1243860iTQ, boolean z, int i) {
        boolean z2;
        if ((i & 1) != 0) {
            z2 = c1243860iTQ.LIZ;
        } else {
            z2 = false;
        }
        if ((i & 2) != 0) {
            z = c1243860iTQ.LIZIZ;
        }
        return new C1243860iTQ(z2, z);
    }
}
