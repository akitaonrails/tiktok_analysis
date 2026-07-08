package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeResponse;
import java.util.List;

/* JADX INFO: renamed from: X.0gfq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174680gfq {
    public static EnumC1174670gfp LIZ(PoiMapModeResponse poiMapModeResponse) {
        if (poiMapModeResponse == null) {
            return EnumC1174670gfp.NO_INTERNET;
        }
        List<PoiDiscoveryCard> poiList = poiMapModeResponse.getPoiList();
        C1948707kD.LIZ().getApplicationContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (poiMapModeResponse.status_code != 0) {
                    return EnumC1174670gfp.SOMETHING_WRONG;
                }
                if (poiList != null && !poiList.isEmpty()) {
                    return null;
                }
                Integer bizCode = poiMapModeResponse.getBizCode();
                if (bizCode != null) {
                    if (bizCode.intValue() == 0) {
                        return EnumC1174670gfp.SOMETHING_WRONG;
                    }
                    if (bizCode.intValue() == 2) {
                        return EnumC1174670gfp.RETURN_TO;
                    }
                }
                return EnumC1174670gfp.SEE_MORE;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return EnumC1174670gfp.NO_INTERNET;
    }
}
