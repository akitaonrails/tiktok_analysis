package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi;
import java.util.List;

/* JADX INFO: renamed from: X.0gkm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177740gkm {
    public static EnumC1177750gkn LIZ(PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponse) {
        if (poiRevisitCardListResponse == null) {
            return EnumC1177750gkn.NO_INTERNET;
        }
        List<PoiRevisitApi.PoiRevisitCardModel> list = poiRevisitCardListResponse.poiCardList;
        C1948707kD.LIZ().getApplicationContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (poiRevisitCardListResponse.status_code == 0 && list != null && !list.isEmpty()) {
                    return null;
                }
                return EnumC1177750gkn.SOMETHING_WRONG;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return EnumC1177750gkn.NO_INTERNET;
    }
}
