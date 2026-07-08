package X;

import com.ss.android.ugc.aweme.offline.ttmock.ITtmockService;

/* JADX INFO: renamed from: X.14Lj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20250114Lj {
    public static final C01GW LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C20250214Lk());
        LIZ = c01gwLIZIZ;
        ITtmockService iTtmockService = (ITtmockService) c01gwLIZIZ.getValue();
        LIZIZ = iTtmockService != null ? iTtmockService.getCarrierRegion() : null;
        ITtmockService iTtmockService2 = (ITtmockService) c01gwLIZIZ.getValue();
        LIZJ = iTtmockService2 != null ? iTtmockService2.getSysRegion() : null;
        ITtmockService iTtmockService3 = (ITtmockService) c01gwLIZIZ.getValue();
        LIZLLL = iTtmockService3 != null ? iTtmockService3.getMccRegion() : null;
        ITtmockService iTtmockService4 = (ITtmockService) c01gwLIZIZ.getValue();
        LJ = iTtmockService4 != null ? iTtmockService4.getOpRegion() : null;
    }
}
