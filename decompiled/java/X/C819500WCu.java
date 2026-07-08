package X;

/* JADX INFO: renamed from: X.0WCu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819500WCu extends AbstractC819510WCv {
    public final long LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final int LJFF;

    public final int hashCode() {
        long j = this.LIZIZ;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.LIZJ) * 1000003) ^ this.LIZLLL) * 1000003;
        long j2 = this.LJ;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EventStoreConfig{maxStorageSizeInBytes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", loadBatchSize=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", criticalSectionEnterTimeoutMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", eventCleanUpAge=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", maxBlobByteSizePerRow=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC819510WCv
    public final int LIZ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC819510WCv
    public final long LIZIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC819510WCv
    public final int LIZJ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC819510WCv
    public final int LIZLLL() {
        return this.LJFF;
    }

    @Override // X.AbstractC819510WCv
    public final long LJ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC819510WCv)) {
            return false;
        }
        AbstractC819510WCv abstractC819510WCv = (AbstractC819510WCv) obj;
        if (this.LIZIZ == abstractC819510WCv.LJ() && this.LIZJ == abstractC819510WCv.LIZJ() && this.LIZLLL == abstractC819510WCv.LIZ() && this.LJ == abstractC819510WCv.LIZIZ() && this.LJFF == abstractC819510WCv.LIZLLL()) {
            return true;
        }
        return false;
    }

    public C819500WCu(long j, int i, int i2, long j2, int i3) {
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = j2;
        this.LJFF = i3;
    }
}
