package X;

/* JADX INFO: renamed from: X.0cUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1014190cUz {
    public final String LIZ;
    public final String LIZIZ;
    public final Boolean LIZJ;

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        Boolean bool = this.LIZJ;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public C1014190cUz(String str, String str2, Boolean bool) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = bool;
    }
}
