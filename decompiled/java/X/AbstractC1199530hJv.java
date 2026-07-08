package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: renamed from: X.0hJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1199530hJv {
    public static PoiSearchApi.PoiSearchResultWrapper LIZ(PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper) {
        boolean z;
        List<PoiData> list;
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(LSPassThroughRecordSizeConfig.DEFAULT);
        if (poiSearchResultWrapper != null && poiSearchResultWrapper.LJIILIIL()) {
            PoiSearchApi.PoiSearchResult poiSearchResult = poiSearchResultWrapper.poiSearchResult;
            if (poiSearchResult != null && (list = poiSearchResult.poiList) != null && (!list.isEmpty())) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = poiSearchResultWrapper.LLILZIL;
            if (z && z2) {
                C1199520hJu.LIZ.getClass();
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                Keva keva = (Keva) C1199520hJu.LIZIZ.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("poi_search_result_");
                sbLIZ.append(curUserId);
                keva.storeString(C2188811AlT.LIZIZ(sbLIZ), GsonProtectorUtils.toJson(C1199520hJu.LIZJ, poiSearchResultWrapper));
                return poiSearchResultWrapper;
            }
            return (PoiSearchApi.PoiSearchResultWrapper) aFwS256S0000000_18.invoke(poiSearchResultWrapper);
        }
        return (PoiSearchApi.PoiSearchResultWrapper) aFwS256S0000000_18.invoke(poiSearchResultWrapper);
    }
}
