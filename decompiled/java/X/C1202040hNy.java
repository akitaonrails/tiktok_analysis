package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.services.publish.MobParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0hNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202040hNy {
    public static final C1202040hNy LIZ = new C1202040hNy();

    public static void LIZ(VideoPublishEditModel videoPublishEditModel) {
        try {
            IPoiService iPoiService = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
            if (iPoiService == null || !iPoiService.hitDraftPreloadPoiRecommendExp() || PublishExtensionModel.fromString(videoPublishEditModel.commerceData).poiData != null) {
                return;
            }
            MobParam mobParamLJII = C1428470nHB.LJII(videoPublishEditModel, "video_post_page", "", "");
            List<MediaLocationMetaDataModel> arrayList = videoPublishEditModel.creativeModel.mediaLocationMetaDataList;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            IPoiService iPoiService2 = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
            if (iPoiService2 != null) {
                iPoiService2.preloadPoiRecommend(mobParamLJII, arrayList);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
