package X;

/* JADX INFO: renamed from: X.0Yiz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882070Yiz {
    public C595660NXw LIZ;
    public C429270GsP LIZIZ;
    public String LIZJ;
    public C894700Z8a LIZLLL;

    public C882070Yiz() {
        this(null, 15);
    }

    public final int hashCode() {
        C595660NXw c595660NXw = this.LIZ;
        int iHashCode = (c595660NXw == null ? 0 : c595660NXw.hashCode()) * 31;
        C429270GsP c429270GsP = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c429270GsP == null ? 0 : c429270GsP.hashCode())) * 31;
        String str = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C894700Z8a c894700Z8a = this.LIZLLL;
        return iHashCode3 + (c894700Z8a != null ? c894700Z8a.hashCode() : 0);
    }

    public C882070Yiz(C595660NXw c595660NXw, int i) {
        this.LIZ = (i & 1) != 0 ? null : c595660NXw;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
    }
}
