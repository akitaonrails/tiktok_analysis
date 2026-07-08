package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0giF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176170giF {
    public static final Pair<Boolean, EnumC1176180giG> LIZ(PoiMapDetailPageVM poiMapDetailPageVM) {
        List<PoiGeneralCard> listPoiList;
        int iHashCode;
        C1176200giI c1176200giI = poiMapDetailPageVM.LLJILJILJ;
        c1176200giI.getClass();
        PoiMapDetailResponse poiMapDetailResponse = c1176200giI.LJFF;
        EnumC1176180giG enumC1176180giGLIZIZ = LIZIZ(poiMapDetailResponse);
        PoiMapDetailResponse poiMapDetailResponseLIZ = poiMapDetailPageVM.LLJILJILJ.LIZ();
        if (poiMapDetailResponseLIZ != null) {
            listPoiList = poiMapDetailResponseLIZ.poiList();
        } else {
            listPoiList = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkErrorType ");
        boolean z = false;
        if (poiMapDetailResponse != null) {
            iHashCode = poiMapDetailResponse.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        sbLIZ.append(" errorType = ");
        sbLIZ.append(enumC1176180giGLIZIZ);
        sbLIZ.append(", resp = ");
        sbLIZ.append(poiMapDetailResponse);
        sbLIZ.append(", poiList = ");
        sbLIZ.append(listPoiList);
        C2188811AlT.LIZIZ(sbLIZ);
        if (enumC1176180giGLIZIZ == EnumC1176180giG.FAR_FROM_HOTEL || (enumC1176180giGLIZIZ != null && (listPoiList == null || listPoiList.isEmpty()))) {
            z = true;
        }
        return new Pair<>(Boolean.valueOf(z), enumC1176180giGLIZIZ);
    }

    public static final EnumC1176180giG LIZIZ(PoiMapDetailResponse poiMapDetailResponse) {
        C1948707kD.LIZ().getApplicationContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (poiMapDetailResponse == null) {
                    return EnumC1176180giG.SOMETHING_WRONG;
                }
                Integer bizCode = poiMapDetailResponse.getBizCode();
                if (bizCode != null && bizCode.intValue() == 3001) {
                    return EnumC1176180giG.FAR_FROM_HOTEL;
                }
                if (poiMapDetailResponse.status_code != 0) {
                    return EnumC1176180giG.SOMETHING_WRONG;
                }
                List<PoiGeneralCard> listPoiList = poiMapDetailResponse.poiList();
                if (listPoiList != null && !listPoiList.isEmpty()) {
                    return null;
                }
                return EnumC1176180giG.EMPTY;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return EnumC1176180giG.NO_INTERNET;
    }
}
