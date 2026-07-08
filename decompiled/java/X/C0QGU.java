package X;

import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinTaskControlService;

/* JADX INFO: renamed from: X.0QGU, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QGU {
    public static C0QGW LIZ() {
        if (!C14TF.LIZIZ.LJIILL().LJIILIIL()) {
            return C0QGW.NONE;
        }
        if (!((Boolean) C1108504Vf.LIZ.getValue()).booleanValue()) {
            ISearchCoinTaskControlService.LIZ.getClass();
            ISearchCoinTaskControlService iSearchCoinTaskControlServiceLIZ = C0QBD.LIZ();
            if (iSearchCoinTaskControlServiceLIZ != null && iSearchCoinTaskControlServiceLIZ.LIZ()) {
                return C0QGW.NONE;
            }
        }
        return (((Number) C0QGV.LIZ.getValue()).intValue() != 2 || C0QGV.LIZIZ()) ? C0QGW.ROUND : C0QGW.CUSTOM;
    }
}
