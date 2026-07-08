package X;

/* JADX INFO: renamed from: X.128Q, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C128Q {
    public final C0FHM LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C128Q() {
        this(false, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C128Q(boolean z, int i) {
        C0FHM c0fhm;
        if ((i & 1) != 0) {
            c0fhm = C0FHM.GONE;
        } else {
            c0fhm = null;
        }
        this(c0fhm, false, (i & 4) != 0 ? false : z);
    }

    public C128Q(C0FHM c0fhm, boolean z, boolean z2) {
        this.LIZ = c0fhm;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }

    public static C128Q LIZ(C128Q c128q, C0FHM c0fhm, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            c0fhm = c128q.LIZ;
        }
        if ((i & 2) != 0) {
            z = c128q.LIZIZ;
        }
        if ((i & 4) != 0) {
            z2 = c128q.LIZJ;
        }
        c128q.getClass();
        return new C128Q(c0fhm, z, z2);
    }
}
