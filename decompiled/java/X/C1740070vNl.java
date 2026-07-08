package X;

import com.ss.android.ugc.aweme.ecommerce.ug.datamerge.manager.CacheDataResult;

/* JADX INFO: renamed from: X.0vNl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1740070vNl {
    public final CacheDataResult LIZ;
    public final Boolean LIZIZ;
    public final InterfaceC1541990qEH LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Long LJFF;
    public final String LJI;

    public C1740070vNl() {
        this(null, null, null, null, null, null, null, 127);
    }

    public C1740070vNl(CacheDataResult cacheDataResult, Boolean bool, InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2, Long l, String str3, int i) {
        cacheDataResult = (i & 1) != 0 ? null : cacheDataResult;
        bool = (i & 2) != 0 ? null : bool;
        interfaceC1541990qEH = (i & 4) != 0 ? null : interfaceC1541990qEH;
        str = (i & 8) != 0 ? null : str;
        str2 = (i & 16) != 0 ? null : str2;
        l = (i & 32) != 0 ? null : l;
        str3 = (i & 64) != 0 ? null : str3;
        this.LIZ = cacheDataResult;
        this.LIZIZ = bool;
        this.LIZJ = interfaceC1541990qEH;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = l;
        this.LJI = str3;
    }
}
