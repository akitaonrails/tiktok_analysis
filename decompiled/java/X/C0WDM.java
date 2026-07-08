package X;

/* JADX INFO: renamed from: X.0WDM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WDM extends AbstractC1293880jm6 {
    public final long LIZ;

    public final int hashCode() {
        long j = this.LIZ;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogResponse{nextRequestWaitMillis=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1293880jm6
    public final long LIZIZ() {
        return this.LIZ;
    }

    public C0WDM(long j) {
        this.LIZ = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC1293880jm6) && this.LIZ == ((AbstractC1293880jm6) obj).LIZIZ()) {
            return true;
        }
        return false;
    }
}
