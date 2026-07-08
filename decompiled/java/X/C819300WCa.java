package X;

/* JADX INFO: renamed from: X.0WCa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819300WCa extends AbstractC819400WCk {
    public final EnumC819320WCc LIZ;
    public final long LIZIZ;

    public final int hashCode() {
        int iHashCode = (this.LIZ.hashCode() ^ 1000003) * 1000003;
        long j = this.LIZIZ;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackendResponse{status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nextRequestWaitMillis=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC819400WCk
    public final long LIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC819400WCk
    public final EnumC819320WCc LIZIZ() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC819400WCk)) {
            return false;
        }
        AbstractC819400WCk abstractC819400WCk = (AbstractC819400WCk) obj;
        if (this.LIZ.equals(abstractC819400WCk.LIZIZ()) && this.LIZIZ == abstractC819400WCk.LIZ()) {
            return true;
        }
        return false;
    }

    public C819300WCa(EnumC819320WCc enumC819320WCc, long j) {
        if (enumC819320WCc != null) {
            this.LIZ = enumC819320WCc;
            this.LIZIZ = j;
            return;
        }
        throw new NullPointerException("Null status");
    }
}
