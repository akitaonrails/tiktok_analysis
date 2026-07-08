package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAwemePictureInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;

/* JADX INFO: renamed from: X.0h01, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187190h01 {
    public static final int LIZ(PoiListApi.PoiMergedListItem poiMergedListItem) {
        PoiDataStruct poiDataStruct;
        PoiAwemePictureInfo poiAwemePictureInfo;
        Integer num;
        Aweme aweme = poiMergedListItem.getAweme();
        if (aweme != null && (poiDataStruct = aweme.getPoiDataStruct()) != null && (poiAwemePictureInfo = poiDataStruct.poiAwemePictureInfo) != null && (num = poiAwemePictureInfo.coverStyle) != null) {
            return num.intValue();
        }
        return 0;
    }
}
