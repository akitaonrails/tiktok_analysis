package X;

/* JADX INFO: renamed from: X.13p4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20126813p4 extends AbstractC20127613pC {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final AbstractC20127913pF LIZLLL;
    public final EnumC20125913ov LJ;

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC20127913pF abstractC20127913pF = this.LIZLLL;
        int iHashCode4 = (iHashCode3 ^ (abstractC20127913pF == null ? 0 : abstractC20127913pF.hashCode())) * 1000003;
        EnumC20125913ov enumC20125913ov = this.LJ;
        return iHashCode4 ^ (enumC20125913ov != null ? enumC20125913ov.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InstallationResponse{uri=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", refreshToken=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", authToken=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", responseCode=");
        sbLIZ.append(this.LJ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC20127613pC
    public final AbstractC20127913pF LIZ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC20127613pC
    public final String LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC20127613pC
    public final String LIZJ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC20127613pC
    public final EnumC20125913ov LIZLLL() {
        return this.LJ;
    }

    @Override // X.AbstractC20127613pC
    public final String LJ() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC20127613pC)) {
            return false;
        }
        AbstractC20127613pC abstractC20127613pC = (AbstractC20127613pC) obj;
        String str = this.LIZ;
        if (str == null) {
            if (abstractC20127613pC.LJ() != null) {
                return false;
            }
        } else if (!str.equals(abstractC20127613pC.LJ())) {
            return false;
        }
        String str2 = this.LIZIZ;
        if (str2 == null) {
            if (abstractC20127613pC.LIZIZ() != null) {
                return false;
            }
        } else if (!str2.equals(abstractC20127613pC.LIZIZ())) {
            return false;
        }
        String str3 = this.LIZJ;
        if (str3 == null) {
            if (abstractC20127613pC.LIZJ() != null) {
                return false;
            }
        } else if (!str3.equals(abstractC20127613pC.LIZJ())) {
            return false;
        }
        AbstractC20127913pF abstractC20127913pF = this.LIZLLL;
        if (abstractC20127913pF == null) {
            if (abstractC20127613pC.LIZ() != null) {
                return false;
            }
        } else if (!abstractC20127913pF.equals(abstractC20127613pC.LIZ())) {
            return false;
        }
        EnumC20125913ov enumC20125913ov = this.LJ;
        if (enumC20125913ov == null) {
            if (abstractC20127613pC.LIZLLL() == null) {
                return true;
            }
            return false;
        }
        if (enumC20125913ov.equals(abstractC20127613pC.LIZLLL())) {
            return true;
        }
        return false;
    }

    public C20126813p4(String str, String str2, String str3, AbstractC20127913pF abstractC20127913pF, EnumC20125913ov enumC20125913ov) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = abstractC20127913pF;
        this.LJ = enumC20125913ov;
    }
}
