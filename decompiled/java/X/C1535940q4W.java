package X;

/* JADX INFO: renamed from: X.0q4W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535940q4W {
    public final boolean LIZ;
    public boolean LIZIZ;
    public long LIZJ;
    public final long LIZLLL;
    public EnumC1533170q03 LJ;
    public int LJFF;
    public C08AB LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1535940q4W)) {
            return false;
        }
        C1535940q4W c1535940q4W = (C1535940q4W) obj;
        return this.LIZ == c1535940q4W.LIZ && this.LIZIZ == c1535940q4W.LIZIZ && this.LIZJ == c1535940q4W.LIZJ && this.LIZLLL == c1535940q4W.LIZLLL && this.LJ == c1535940q4W.LJ && this.LJFF == c1535940q4W.LJFF;
    }

    public final int hashCode() {
        return (((((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheConfig(isSharable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", retryOnFailure=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", maxFreshTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", maxWaitingTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", cacheRemovalStrategy=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", maxCacheCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1535940q4W(boolean z, boolean z2, long j, long j2, EnumC1533170q03 enumC1533170q03) {
        this(z, z2, j, j2, enumC1533170q03, 8);
    }

    public C1535940q4W(boolean z, boolean z2, long j, long j2, EnumC1533170q03 enumC1533170q03, int i) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = enumC1533170q03;
        this.LJFF = i;
    }
}
