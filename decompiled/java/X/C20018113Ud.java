package X;

/* JADX INFO: renamed from: X.13Ud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20018113Ud {
    public final int LIZ = C20017113Tt.LIZ().departureDisplayCountWithoutClick;
    public final long LIZIZ = ((long) C20017113Tt.LIZ().departureIntervalDay) * 86400000;
    public long LIZJ;
    public int LIZLLL;

    public final int LIZ() {
        if (this.LIZLLL == 0) {
            C20018013Uc c20018013Uc = C20018013Uc.LIZ;
            this.LIZLLL = C20018013Uc.LJII().getInt("key_non_click_count", 0);
        }
        return this.LIZLLL;
    }
}
