package X;

/* JADX INFO: renamed from: X.0VUJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VUJ {
    public static final C0VUJ LIZLLL = new C0VUJ(0, 0, 0);
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VUJ)) {
            return false;
        }
        C0VUJ c0vuj = (C0VUJ) obj;
        return this.LIZ == c0vuj.LIZ && this.LIZIZ == c0vuj.LIZIZ && this.LIZJ == c0vuj.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FastPagerStats(memoryUsed=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pageCacheOverflow=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", largestMemAlloc=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0VUJ(long j, long j2, long j3) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
    }
}
