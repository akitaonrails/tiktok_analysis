package X;

/* JADX INFO: renamed from: X.0WC7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WC7 extends C0WC9 {
    public final long LIZ;
    public final AbstractC818550W9d LIZIZ;
    public final C0WCG LIZJ;

    public final int hashCode() {
        long j = this.LIZ;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.LIZIZ.hashCode()) * 1000003) ^ this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PersistedEvent{id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", transportContext=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", event=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0WC9
    public final C0WCG LIZ() {
        return this.LIZJ;
    }

    @Override // X.C0WC9
    public final long LIZIZ() {
        return this.LIZ;
    }

    @Override // X.C0WC9
    public final AbstractC818550W9d LIZJ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0WC9)) {
            return false;
        }
        C0WC9 c0wc9 = (C0WC9) obj;
        if (this.LIZ == c0wc9.LIZIZ() && this.LIZIZ.equals(c0wc9.LIZJ()) && this.LIZJ.equals(c0wc9.LIZ())) {
            return true;
        }
        return false;
    }

    public C0WC7(long j, AbstractC818550W9d abstractC818550W9d, C0WCG c0wcg) {
        this.LIZ = j;
        if (abstractC818550W9d != null) {
            this.LIZIZ = abstractC818550W9d;
            if (c0wcg != null) {
                this.LIZJ = c0wcg;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }
}
