package X;

/* JADX INFO: renamed from: X.0OLG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OLG {
    public final boolean LIZ;
    public final int LIZIZ;

    public /* synthetic */ C0OLG() {
        this(false, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OLG)) {
            return false;
        }
        C0OLG c0olg = (C0OLG) obj;
        return this.LIZ == c0olg.LIZ && this.LIZIZ == c0olg.LIZIZ;
    }

    public C0OLG(boolean z, int i) {
        this.LIZ = z;
        this.LIZIZ = i;
    }
}
