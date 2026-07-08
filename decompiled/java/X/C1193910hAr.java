package X;

import com.ss.android.ugc.aweme.poi.poidetail.IPoiDetailPageService;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0hAr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193910hAr implements IPoiDetailPageService {
    @Override // com.ss.android.ugc.aweme.poi.poidetail.IPoiDetailPageService
    public final Integer getPoiDetailFeedClickIndex(String str) {
        if (str != null) {
            return (Integer) ((LinkedHashMap) C1187240h06.LIZ).get(str);
        }
        return null;
    }
}
