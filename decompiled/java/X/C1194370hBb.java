package X;

import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.poi.detail.ai.PoiAiSummaryListSharedVM;
import com.ss.android.ugc.aweme.poi.detail.amusement.PoiAmusementListSharedVM;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.viewmodel.PoiHeaderTopVideosSharedViewModel;
import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel;
import com.ss.android.ugc.aweme.poi.detail.videolist.limited.PoiLimitedVideoListVM;
import com.ss.android.ugc.aweme.poi.recommendfeature.detail.vm.PoiRecommendFeatureDetailSharedViewModel;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0hBb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194370hBb implements IDetailPageShareVMService {
    public static final C1194370hBb LIZ = new C1194370hBb();

    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        HashMap<String, InterfaceC1186204kW> map = new HashMap<>();
        map.put("POI_VIDEO_LIST_ENTRANCE", new InterfaceC1186204kW() { // from class: X.0hBX
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("poi_video_list:id=");
                sbLIZ.append(c2189821An6.getPagePoiId());
                sbLIZ.append(":fragmentid=");
                sbLIZ.append(c2189821An6.getExtra().get("fragment_id"));
                return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), PoiVideoListSharedViewModel.class);
            }
        });
        map.put("POI_LIMITED_VIDEO_LIST_ENTRANCE", new InterfaceC1186204kW() { // from class: X.0hBY
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("poi_video_list:id=");
                sbLIZ.append(c2189821An6.getPagePoiId());
                sbLIZ.append(":fragmentid=");
                sbLIZ.append(c2189821An6.getExtra().get("fragment_id"));
                return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), PoiLimitedVideoListVM.class);
            }
        });
        map.put("POI_AMUSEMENT_ENTRANCE", new InterfaceC1186204kW() { // from class: X.0hBW
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("poi_amusement_list:id=");
                sbLIZ.append(c2189821An6.getPagePoiId());
                sbLIZ.append(":fragmentid=");
                sbLIZ.append(c2189821An6.getExtra().get("fragment_id"));
                return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), PoiAmusementListSharedVM.class);
            }
        });
        map.put("POI_AI_SUMMARY_ENTRANCE", new InterfaceC1186204kW() { // from class: X.0hBZ
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("poi_ai_summary:id=");
                sbLIZ.append(c2189821An6.getPagePoiId());
                sbLIZ.append(":fragmentid=");
                sbLIZ.append(c2189821An6.getExtra().get("fragment_id"));
                return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), PoiAiSummaryListSharedVM.class);
            }
        });
        map.put("POI_POST_PAGE_ENTRANCE", new InterfaceC1186204kW() { // from class: X.0hBa
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("poi_post_page:id=");
                sbLIZ.append(c2189821An6.getPagePoiId());
                sbLIZ.append(":fragmentid=");
                sbLIZ.append(c2189821An6.getExtra().get("fragment_id"));
                return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), PoiPostPageShareVM.class);
            }
        });
        map.put("POI_LIMITED_POST_PAGE_ENTRANCE", new InterfaceC1186204kW() { // from class: X.0hBc
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("poi_limited_post_page:id=");
                sbLIZ.append(c2189821An6.getPagePoiId());
                sbLIZ.append(":fragmentid=");
                sbLIZ.append(c2189821An6.getExtra().get("fragment_id"));
                return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), PoiPostPageShareVM.class);
            }
        });
        map.put("POI_HEADER_TOP_VIDEOS_ENTRANCE", new InterfaceC1186204kW() { // from class: X.0hBd
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("poi_header_top_videos:id=");
                sbLIZ.append(c2189821An6.getPagePoiId());
                sbLIZ.append(":fragmentid=");
                sbLIZ.append(c2189821An6.getExtra().get("fragment_id"));
                return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), PoiHeaderTopVideosSharedViewModel.class);
            }
        });
        map.put("POI_TOP_VIDEOS_PAGE_ENTRANCE", new InterfaceC1186204kW() { // from class: X.0hBe
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("poi_top_videos_page:id=");
                sbLIZ.append(c2189821An6.getPagePoiId());
                sbLIZ.append(":fragmentid=");
                sbLIZ.append(c2189821An6.getExtra().get("fragment_id"));
                return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), PoiHeaderTopVideosSharedViewModel.class);
            }
        });
        map.put("POI_RECOMMEND_FEATURE_DETAIL_ENTRANCE", new InterfaceC1186204kW() { // from class: X.0hBf
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                String pagePoiId = c2189821An6.getPagePoiId();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("poi_recommend_feature_detail:id=");
                if (pagePoiId == null) {
                    pagePoiId = "";
                }
                sbLIZ.append(pagePoiId);
                return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), PoiRecommendFeatureDetailSharedViewModel.class);
            }
        });
        return map;
    }
}
