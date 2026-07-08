package X;

/* JADX INFO: renamed from: X.111h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194335111h {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final float LIZJ;

    public C194335111h() {
        this(0);
    }

    public /* synthetic */ C194335111h(int i) {
        this(false, false, 0.0f);
    }

    public C194335111h(boolean z, boolean z2, float f) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = f;
    }

    public static C194335111h LIZ(C194335111h c194335111h, boolean z, float f, int i) {
        boolean z2;
        if ((i & 1) != 0) {
            z = c194335111h.LIZ;
        }
        if ((i & 2) != 0) {
            z2 = c194335111h.LIZIZ;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            f = c194335111h.LIZJ;
        }
        c194335111h.getClass();
        return new C194335111h(z, z2, f);
    }
}
