package X;

/* JADX INFO: renamed from: X.0HaF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443490HaF {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public C443490HaF(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
