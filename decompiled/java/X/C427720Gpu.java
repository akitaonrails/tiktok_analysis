package X;

/* JADX INFO: renamed from: X.0Gpu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427720Gpu {
    public final String LIZ;
    public final String LIZIZ;
    public final C419910GdJ LIZJ;

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C419910GdJ c419910GdJ = this.LIZJ;
        return iHashCode2 + (c419910GdJ != null ? c419910GdJ.hashCode() : 0);
    }

    public C427720Gpu(String str, String str2, C419910GdJ c419910GdJ) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c419910GdJ;
    }
}
