package X;

/* JADX INFO: renamed from: X.13p3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20126713p3 extends AbstractC20126913p5 {
    public final String LIZIZ;
    public final EnumC20127313p9 LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final long LJFF;
    public final long LJI;
    public final String LJII;

    @Override // X.AbstractC20126913p5
    public final C20126613p2 LJII() {
        return new C20126613p2(this);
    }

    public final int hashCode() {
        String str = this.LIZIZ;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.LIZJ.hashCode()) * 1000003;
        String str2 = this.LIZLLL;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.LJ;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.LJFF;
        int i = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.LJI;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.LJII;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PersistedInstallationEntry{firebaseInstallationId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", registrationStatus=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", authToken=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", refreshToken=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", expiresInSecs=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", tokenCreationEpochInSecs=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", fisError=");
        sbLIZ.append(this.LJII);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC20126913p5
    public final String LIZ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC20126913p5
    public final long LIZIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC20126913p5
    public final String LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC20126913p5
    public final String LIZLLL() {
        return this.LJII;
    }

    @Override // X.AbstractC20126913p5
    public final String LJ() {
        return this.LJ;
    }

    @Override // X.AbstractC20126913p5
    public final EnumC20127313p9 LJFF() {
        return this.LIZJ;
    }

    @Override // X.AbstractC20126913p5
    public final long LJI() {
        return this.LJI;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC20126913p5)) {
            return false;
        }
        AbstractC20126913p5 abstractC20126913p5 = (AbstractC20126913p5) obj;
        String str = this.LIZIZ;
        if (str == null) {
            if (abstractC20126913p5.LIZJ() != null) {
                return false;
            }
        } else if (!str.equals(abstractC20126913p5.LIZJ())) {
            return false;
        }
        if (this.LIZJ.equals(abstractC20126913p5.LJFF())) {
            String str2 = this.LIZLLL;
            if (str2 == null) {
                if (abstractC20126913p5.LIZ() != null) {
                    return false;
                }
            } else if (!str2.equals(abstractC20126913p5.LIZ())) {
                return false;
            }
            String str3 = this.LJ;
            if (str3 == null) {
                if (abstractC20126913p5.LJ() != null) {
                    return false;
                }
            } else if (!str3.equals(abstractC20126913p5.LJ())) {
                return false;
            }
            if (this.LJFF == abstractC20126913p5.LIZIZ() && this.LJI == abstractC20126913p5.LJI()) {
                String str4 = this.LJII;
                if (str4 == null) {
                    if (abstractC20126913p5.LIZLLL() == null) {
                        return true;
                    }
                    return false;
                }
                if (str4.equals(abstractC20126913p5.LIZLLL())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public C20126713p3(String str, EnumC20127313p9 enumC20127313p9, String str2, String str3, long j, long j2, String str4) {
        this.LIZIZ = str;
        this.LIZJ = enumC20127313p9;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = j;
        this.LJI = j2;
        this.LJII = str4;
    }
}
