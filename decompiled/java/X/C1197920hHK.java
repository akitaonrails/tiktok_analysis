package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.videopublish.videounderstand.api.IPoiRecommendService;
import com.ss.android.ugc.aweme.poi.videopublish.videounderstand.data.PoiVideoUnderstandResponse;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0hHK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1197920hHK {
    public static final C1197920hHK LIZ = new C1197920hHK();

    public static String LIZ() {
        InterfaceC1207490hWl interfaceC1207490hWl = (InterfaceC1207490hWl) PluggableExtentionKt.pluggableSpi$default(ILocationService.class, false, false, false, 14, null);
        return (interfaceC1207490hWl == null || !interfaceC1207490hWl.LJII(0, C1BWL.LIZ())) ? CardStruct.IStatusCode.DEFAULT : "1";
    }

    public static String LIZIZ() {
        Pair<String, PoiVideoUnderstandResponse> pair;
        IPoiRecommendService iPoiRecommendService = (IPoiRecommendService) PluggableExtentionKt.pluggableSpi$default(IPoiRecommendService.class, false, false, false, 14, null);
        if (iPoiRecommendService == null || (pair = iPoiRecommendService.LIZ()) == null) {
            pair = new Pair<>(null, null);
        }
        String first = pair.getFirst();
        PoiVideoUnderstandResponse second = pair.getSecond();
        return first == null ? "not_returned" : (second == null || !second.isSuccess()) ? "not_recognized" : "normal";
    }
}
