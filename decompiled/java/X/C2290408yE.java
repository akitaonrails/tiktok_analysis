package X;

/* JADX INFO: renamed from: X.08yE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2290408yE {
    public String LIZ;
    public String LIZIZ;
    public C2290008yA LIZJ;
    public C2207811Bb1 LIZLLL;

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C2290008yA c2290008yA = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (c2290008yA == null ? 0 : c2290008yA.hashCode())) * 31;
        C2207811Bb1 c2207811Bb1 = this.LIZLLL;
        return iHashCode3 + (c2207811Bb1 != null ? c2207811Bb1.hashCode() : 0);
    }

    public C2290408yE(String str, String str2, C2290008yA c2290008yA, C2207811Bb1 c2207811Bb1) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c2290008yA;
        this.LIZLLL = c2207811Bb1;
    }
}
