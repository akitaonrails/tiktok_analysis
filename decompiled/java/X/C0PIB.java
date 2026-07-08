package X;

/* JADX INFO: renamed from: X.0PIB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PIB {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C0PIB() {
        this(false, 3);
    }

    public /* synthetic */ C0PIB(boolean z, int i) {
        this((i & 1) != 0 ? false : z, false);
    }

    public C0PIB(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }

    public static C0PIB LIZ(C0PIB c0pib, boolean z, int i) {
        boolean z2;
        if ((i & 1) != 0) {
            z2 = c0pib.LIZ;
        } else {
            z2 = false;
        }
        if ((i & 2) != 0) {
            z = c0pib.LIZIZ;
        }
        c0pib.getClass();
        return new C0PIB(z2, z);
    }
}
