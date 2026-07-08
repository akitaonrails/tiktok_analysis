package X;

/* JADX INFO: renamed from: X.0iW6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245520iW6 {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public C1245520iW6() {
        this(0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1245520iW6)) {
            return false;
        }
        C1245520iW6 c1245520iW6 = (C1245520iW6) obj;
        return this.LIZ == c1245520iW6.LIZ && this.LIZIZ == c1245520iW6.LIZIZ && this.LIZJ == c1245520iW6.LIZJ;
    }

    public /* synthetic */ C1245520iW6(int i, int i2) {
        this(false, (i2 & 2) != 0 ? -1 : i, (i2 & 4) == 0 ? 0 : -1);
    }

    public C1245520iW6(boolean z, int i, int i2) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
