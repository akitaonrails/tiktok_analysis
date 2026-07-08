package X;

import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailFilterVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0giI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176200giI {
    public final PoiMapDetailPageVM LIZ;
    public final CopyOnWriteArrayList<PoiMapDetailResponse> LIZIZ = new CopyOnWriteArrayList<>();
    public PoiMapDetailResponse LIZJ;
    public C1176580giu LIZLLL;
    public Float LJ;
    public PoiMapDetailResponse LJFF;

    public final PoiMapDetailResponse LIZ() {
        PoiMapDetailResponse poiMapDetailResponseYQ2;
        List<PoiGeneralCard> listPoiList;
        List<PoiGeneralCard> listLIZ;
        PoiMapDetailResponse poiMapDetailResponse = this.LJFF;
        PoiMapDetailResponse poiMapDetailResponseCopy = poiMapDetailResponse != null ? poiMapDetailResponse.copy(poiMapDetailResponse.bizCode, poiMapDetailResponse.poiListV2, poiMapDetailResponse.userCityStatus, poiMapDetailResponse.mapWindow, poiMapDetailResponse.recallAreaGroup, poiMapDetailResponse.filterKeyCategoryList, poiMapDetailResponse.filterGroup, poiMapDetailResponse.poiListPanelTitle, poiMapDetailResponse.isDistanceSortValid, poiMapDetailResponse.isRatingSortValid, poiMapDetailResponse.poiDetailTagStyleMap, poiMapDetailResponse.currentPoiHotelShelfInfo, poiMapDetailResponse.LL, poiMapDetailResponse.LLILLJJLI, poiMapDetailResponse.LLILLL) : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (PoiMapDetailResponse poiMapDetailResponse2 : this.LIZIZ) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            List<PoiGeneralCard> listPoiList2 = poiMapDetailResponse2.poiList();
            if (listPoiList2 != null && (listLIZ = C1175540ghE.LIZ(listPoiList2, this.LIZLLL, this.LJ)) != null) {
                for (PoiGeneralCard poiGeneralCard : listLIZ) {
                    String poiId = poiGeneralCard.getPoiId();
                    if (poiId != null) {
                        linkedHashMap.put(poiId, poiGeneralCard);
                    }
                }
            }
            i = i2;
        }
        PoiMapDetailResponse poiMapDetailResponse3 = this.LJFF;
        if (poiMapDetailResponse3 != null && (listPoiList = poiMapDetailResponse3.poiList()) != null) {
            for (PoiGeneralCard poiGeneralCard2 : listPoiList) {
                String poiId2 = poiGeneralCard2.getPoiId();
                if (poiId2 != null) {
                    linkedHashMap.put(poiId2, poiGeneralCard2);
                }
            }
        }
        List<PoiGeneralCard> listLLIIII = C13LP.LLIIII(linkedHashMap.values());
        if (poiMapDetailResponseCopy != null) {
            poiMapDetailResponseCopy.setPoiListV2(listLLIIII);
        }
        PoiMapDetailFilterVM poiMapDetailFilterVM = this.LIZ.LLJI;
        return (poiMapDetailFilterVM == null || (poiMapDetailResponseYQ2 = poiMapDetailFilterVM.yQ2(poiMapDetailResponseCopy)) == null) ? poiMapDetailResponseCopy : poiMapDetailResponseYQ2;
    }

    public C1176200giI(PoiMapDetailPageVM poiMapDetailPageVM) {
        this.LIZ = poiMapDetailPageVM;
    }
}
