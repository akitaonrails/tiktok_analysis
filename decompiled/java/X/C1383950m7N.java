package X;

/* JADX INFO: renamed from: X.0m7N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383950m7N {
    public final long LIZ;
    public final long LIZIZ;
    public boolean LIZJ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1383950m7N)) {
            return false;
        }
        C1383950m7N c1383950m7N = (C1383950m7N) obj;
        return this.LIZ == c1383950m7N.LIZ && this.LIZIZ == c1383950m7N.LIZIZ && this.LIZJ == c1383950m7N.LIZJ;
    }

    public C1383950m7N(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
