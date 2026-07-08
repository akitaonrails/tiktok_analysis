package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAwemePictureInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;

/* JADX INFO: renamed from: X.0h07, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187250h07 {
    public static final String LIZ(PoiListApi.PoiMergedListItem poiMergedListItem) {
        PoiDataStruct poiDataStruct;
        PoiAwemePictureInfo poiAwemePictureInfo;
        String str;
        Aweme aweme = poiMergedListItem.getAweme();
        if (aweme == null || (poiDataStruct = aweme.getPoiDataStruct()) == null || (poiAwemePictureInfo = poiDataStruct.poiAwemePictureInfo) == null || (str = poiAwemePictureInfo.picId) == null) {
            Aweme aweme2 = poiMergedListItem.getAweme();
            if (aweme2 != null) {
                return aweme2.getAid();
            }
            return null;
        }
        return str;
    }
}
