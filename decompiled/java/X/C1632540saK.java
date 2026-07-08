package X;

/* JADX INFO: renamed from: X.0saK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632540saK {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C1632540saK() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1632540saK)) {
            return false;
        }
        C1632540saK c1632540saK = (C1632540saK) obj;
        return this.LIZ == c1632540saK.LIZ && this.LIZIZ == c1632540saK.LIZIZ;
    }

    public /* synthetic */ C1632540saK(int i) {
        this(true, false);
    }

    public C1632540saK(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }

    public static C1632540saK LIZ(C1632540saK c1632540saK, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = c1632540saK.LIZ;
        }
        if ((i & 2) != 0) {
            z2 = c1632540saK.LIZIZ;
        }
        c1632540saK.getClass();
        return new C1632540saK(z, z2);
    }
}
