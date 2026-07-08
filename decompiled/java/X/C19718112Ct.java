package X;

/* JADX INFO: renamed from: X.12Ct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19718112Ct {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public C19718112Ct() {
        this(false, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C19718112Ct(boolean z, int i) {
        boolean z2;
        z = (i & 4) != 0 ? false : z;
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(false, false, z, z2);
    }

    public C19718112Ct(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
    }

    public static C19718112Ct LIZ(C19718112Ct c19718112Ct, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = c19718112Ct.LIZ;
        }
        if ((i & 2) != 0) {
            z2 = c19718112Ct.LIZIZ;
        }
        if ((i & 4) != 0) {
            z3 = c19718112Ct.LIZJ;
        }
        if ((i & 8) != 0) {
            z4 = c19718112Ct.LIZLLL;
        }
        c19718112Ct.getClass();
        return new C19718112Ct(z, z2, z3, z4);
    }
}
