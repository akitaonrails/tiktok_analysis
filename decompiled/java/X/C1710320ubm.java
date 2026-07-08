package X;

/* JADX INFO: renamed from: X.0ubm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710320ubm {
    public final String LIZ;
    public final EnumC1710490uc3 LIZIZ;
    public final String LIZJ;
    public final Boolean LIZLLL;
    public final String LJ;
    public C1710830ucb LJFF;

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C1710830ucb c1710830ucb = this.LJFF;
        return iHashCode4 + (c1710830ucb != null ? c1710830ucb.hashCode() : 0);
    }

    public C1710320ubm(String str, EnumC1710490uc3 enumC1710490uc3, String str2, Boolean bool, String str3, int i) {
        str2 = (i & 4) != 0 ? null : str2;
        bool = (i & 8) != 0 ? null : bool;
        str3 = (i & 16) != 0 ? null : str3;
        this.LIZ = str;
        this.LIZIZ = enumC1710490uc3;
        this.LIZJ = str2;
        this.LIZLLL = bool;
        this.LJ = str3;
        this.LJFF = null;
    }
}
