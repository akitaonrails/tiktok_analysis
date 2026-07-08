package X;

/* JADX INFO: renamed from: X.13p6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20127013p6 extends AbstractC20127913pF {
    public final String LIZ;
    public final long LIZIZ;
    public final EnumC20126113ox LIZJ;

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.LIZIZ;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        EnumC20126113ox enumC20126113ox = this.LIZJ;
        return i ^ (enumC20126113ox != null ? enumC20126113ox.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TokenResult{token=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tokenExpirationTimestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", responseCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC20127913pF
    public final EnumC20126113ox LIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC20127913pF
    public final String LIZIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC20127913pF
    public final long LIZJ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC20127913pF)) {
            return false;
        }
        AbstractC20127913pF abstractC20127913pF = (AbstractC20127913pF) obj;
        String str = this.LIZ;
        if (str == null) {
            if (abstractC20127913pF.LIZIZ() != null) {
                return false;
            }
        } else if (!str.equals(abstractC20127913pF.LIZIZ())) {
            return false;
        }
        if (this.LIZIZ == abstractC20127913pF.LIZJ()) {
            EnumC20126113ox enumC20126113ox = this.LIZJ;
            if (enumC20126113ox == null) {
                if (abstractC20127913pF.LIZ() == null) {
                    return true;
                }
                return false;
            }
            if (enumC20126113ox.equals(abstractC20127913pF.LIZ())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C20127013p6(String str, long j, EnumC20126113ox enumC20126113ox) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = enumC20126113ox;
    }
}
