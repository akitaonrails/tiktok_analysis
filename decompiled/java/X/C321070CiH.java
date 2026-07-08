package X;

/* JADX INFO: renamed from: X.0CiH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321070CiH {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final Integer LJI;

    public C321070CiH() {
        this(0);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31;
        String str = this.LJ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJFF) * 31;
        Integer num = this.LJI;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public /* synthetic */ C321070CiH(int i) {
        this(0, "", "", 0, -1, "", null);
    }

    public C321070CiH(int i, String str, String str2, int i2, int i3, String str3, Integer num) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i2;
        this.LJ = str3;
        this.LJFF = i3;
        this.LJI = num;
    }
}
