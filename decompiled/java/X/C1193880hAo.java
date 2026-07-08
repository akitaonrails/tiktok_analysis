package X;

import com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService;
import com.ss.android.ugc.aweme.services.publish.MobParam;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hAo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193880hAo implements IPoiVideoPublishService {
    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final boolean enableReadLocationMetaData() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final PoiData getPoiData(Function1<? super Class<? extends Object>, ? extends Object> function1) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final boolean hitDraftPreloadPoiRecommendExp() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final boolean hitPreloadPoiRecommendExp() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final void requestVideoUnderstand(String str, Long l, String str2, String str3) {
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final void startExtractFrame(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final void trackReadMetaDataDuration(long j) {
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final void trackReadMetaDataSuccessRate(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final Pair<PoiData, PoiMobParam> getPoiDataAndMobParams(Function1<? super Class<? extends Object>, ? extends Object> function1) {
        return new Pair<>(null, null);
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final Map<String, Object> preloadPoiRecommend(MobParam mobParam, List<MediaLocationMetaDataModel> list) {
        return C2097608Jq.LJ();
    }
}
