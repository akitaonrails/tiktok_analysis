package X;

import com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailFilterVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams;
import com.ss.android.ugc.aweme.slash.cell.arc.Padding;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashClickConfig;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashTrackConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS302S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: renamed from: X.0ghJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175590ghJ {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.google.gson.n] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static final List<C1175980ghw> LIZ(List<PoiGeneralCard> list, boolean z, PoiMapDetailPageVM poiMapDetailPageVM, PoiMapDetailFilterVM poiMapDetailFilterVM, InterfaceC665370Q7z interfaceC665370Q7z) {
        ?? poiDetailTagStyleMap;
        ?? adClickId;
        String initialPoiEnterFrom;
        String initialPoiEnterMethod;
        String initialPoiFromGroupId;
        String initialPoiId;
        String pagePoiId;
        String strLIZ;
        ?? userCityStatus;
        String strLIZ2;
        Integer userCityStatus2;
        String str;
        String str2;
        ?? r5 = 0;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        ?? r12 = 0;
        int i = 0;
        for (PoiGeneralCard poiGeneralCard : list) {
            int i2 = i + 1;
            if (i >= 0) {
                PoiGeneralCard poiGeneralCard2 = poiGeneralCard;
                String strCellId = poiGeneralCard2.cellId();
                Padding padding = new Padding(8, 8, 8, 8);
                PoiMapDetailResponse poiMapDetailResponse = poiMapDetailPageVM.LLJILJILJ.LIZJ;
                if (poiMapDetailResponse != null) {
                    poiDetailTagStyleMap = poiMapDetailResponse.getPoiDetailTagStyleMap();
                } else {
                    poiDetailTagStyleMap = r5;
                }
                PoiCardCellData poiCardCellDataLIZ = C1175550ghF.LIZ(poiGeneralCard2, padding, poiDetailTagStyleMap, r12, "poi_map_mode_card_list_img", "poi_map_mode");
                Pair[] pairArr = new Pair[9];
                pairArr[r12] = new Pair("enter_from", "map_mode");
                pairArr[1] = new Pair("enter_method", "click_poi_card");
                PoiMapModeMobParams poiMapModeMobParams = poiMapDetailPageVM.LLILZLL;
                if (poiMapModeMobParams != null) {
                    adClickId = poiMapModeMobParams.getAdClickId();
                } else {
                    adClickId = r5;
                }
                String str3 = "";
                ?? r2 = adClickId;
                if (adClickId == 0) {
                    r2 = "";
                }
                pairArr[2] = new Pair("ad_click_id", r2);
                PoiMapModeMobParams poiMapModeMobParams2 = poiMapDetailPageVM.LLILZLL;
                if (poiMapModeMobParams2 == null || (initialPoiEnterFrom = poiMapModeMobParams2.getInitialPoiEnterFrom()) == null) {
                    initialPoiEnterFrom = "";
                }
                pairArr[3] = new Pair("initial_poi_enter_from", initialPoiEnterFrom);
                PoiMapModeMobParams poiMapModeMobParams3 = poiMapDetailPageVM.LLILZLL;
                if (poiMapModeMobParams3 == null || (initialPoiEnterMethod = poiMapModeMobParams3.getInitialPoiEnterMethod()) == null) {
                    initialPoiEnterMethod = "";
                }
                pairArr[4] = new Pair("initial_poi_enter_method", initialPoiEnterMethod);
                PoiMapModeMobParams poiMapModeMobParams4 = poiMapDetailPageVM.LLILZLL;
                if (poiMapModeMobParams4 == null || (initialPoiFromGroupId = poiMapModeMobParams4.getInitialPoiFromGroupId()) == null) {
                    initialPoiFromGroupId = "";
                }
                pairArr[5] = new Pair("initial_poi_from_group_id", initialPoiFromGroupId);
                PoiMapModeMobParams poiMapModeMobParams5 = poiMapDetailPageVM.LLILZLL;
                if (poiMapModeMobParams5 == null || (initialPoiId = poiMapModeMobParams5.getInitialPoiId()) == null) {
                    initialPoiId = "";
                }
                pairArr[6] = new Pair("initial_poi_id", initialPoiId);
                C1175680ghS c1175680ghS = poiMapDetailPageVM.LLILZIL;
                if (c1175680ghS == null || (pagePoiId = c1175680ghS.getPagePoiId()) == null) {
                    pagePoiId = "";
                }
                pairArr[7] = new Pair("from_poi_id", pagePoiId);
                pairArr[8] = new Pair("btm", "a4257.b8563");
                SlashClickConfig slashClickConfig = new SlashClickConfig(r5, C2097608Jq.LJIIIIZZ(pairArr));
                SlashTrackConfig[] slashTrackConfigArr = new SlashTrackConfig[2];
                Pair[] pairArr2 = new Pair[5];
                C1175660ghQ c1175660ghQXQ2 = poiMapDetailPageVM.xQ2();
                if (c1175660ghQXQ2 == null || (str2 = c1175660ghQXQ2.localServiceKeyCategory) == null || (strLIZ = C1175600ghK.LIZ(str2)) == null) {
                    strLIZ = "";
                }
                pairArr2[0] = new Pair("tab_code", strLIZ);
                PoiMapDetailResponse poiMapDetailResponse2 = poiMapDetailPageVM.LLJILJILJ.LIZJ;
                if (poiMapDetailResponse2 != null) {
                    userCityStatus = poiMapDetailResponse2.getUserCityStatus();
                } else {
                    userCityStatus = r5;
                }
                pairArr2[1] = new Pair("map_mode_type", C1175600ghK.LJIIJ(userCityStatus));
                String strWQ2 = poiMapDetailFilterVM.wQ2();
                if (strWQ2 == null) {
                    strWQ2 = "";
                }
                pairArr2[2] = new Pair("ttls_filter_type_list", strWQ2);
                pairArr2[3] = new Pair("ttls_poi_card_list_type", "horizontal");
                pairArr2[4] = new Pair("poi_card_list_index", String.valueOf(i));
                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr2);
                C1182410gsJ.LIZ(mapLJIIJ, interfaceC665370Q7z);
                slashTrackConfigArr[0] = new SlashTrackConfig("show_poi_card", mapLJIIJ, "cell_show");
                Pair[] pairArr3 = new Pair[5];
                C1175660ghQ c1175660ghQXQ22 = poiMapDetailPageVM.xQ2();
                if (c1175660ghQXQ22 == null || (str = c1175660ghQXQ22.localServiceKeyCategory) == null || (strLIZ2 = C1175600ghK.LIZ(str)) == null) {
                    strLIZ2 = "";
                }
                r12 = 0;
                pairArr3[0] = new Pair("tab_code", strLIZ2);
                PoiMapDetailResponse poiMapDetailResponse3 = poiMapDetailPageVM.LLJILJILJ.LIZJ;
                if (poiMapDetailResponse3 != null) {
                    userCityStatus2 = poiMapDetailResponse3.getUserCityStatus();
                } else {
                    userCityStatus2 = null;
                }
                pairArr3[1] = new Pair("map_mode_type", C1175600ghK.LJIIJ(userCityStatus2));
                String strWQ22 = poiMapDetailFilterVM.wQ2();
                if (strWQ22 != null) {
                    str3 = strWQ22;
                }
                pairArr3[2] = new Pair("ttls_filter_type_list", str3);
                pairArr3[3] = new Pair("ttls_poi_card_list_type", "horizontal");
                pairArr3[4] = new Pair("poi_card_list_index", String.valueOf(i));
                Map mapLJIIJ2 = C2097608Jq.LJIIJ(pairArr3);
                C1182410gsJ.LIZ(mapLJIIJ2, interfaceC665370Q7z);
                slashTrackConfigArr[1] = new SlashTrackConfig("click_poi_card", mapLJIIJ2, "cell_click");
                arrayList.add(new C1175980ghw(new SlashCellModel("cell", strCellId, r5, r5, r5, C1697810uHb.LJIIJJI(slashTrackConfigArr), slashClickConfig, r5, i, poiCardCellDataLIZ, new AwS384S0200000_18(poiMapDetailPageVM, interfaceC665370Q7z, 189)), new C1175580ghI(poiGeneralCard2.getLocation(), poiGeneralCard2.getAiSummary(), z), AFwS302S0000000_18.get$arr$(18), 8));
                i = i2;
                r5 = 0;
            } else {
                C1697810uHb.LJIJI();
                throw r5;
            }
        }
        return arrayList;
    }
}
