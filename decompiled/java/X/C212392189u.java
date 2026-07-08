package X;

import android.util.LruCache;

/* JADX INFO: renamed from: X.189u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212392189u {
    public final String LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(new C212393189v(this));

    public final LruCache<String, C212394189w> LIZ() {
        return (LruCache) this.LJFF.getValue();
    }

    public final String LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ecom_cache_");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C212392189u(String str, int i, boolean z, int i2, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = i2;
        this.LJ = z2;
    }
}
