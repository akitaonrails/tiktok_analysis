package X;

import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0nIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429430nIj {
    public static final C1429430nIj LIZ = new C1429430nIj();

    public static void LIZ(List list, VideoPublishEditModel videoPublishEditModel) {
        String str;
        if (videoPublishEditModel.getPoiData() != null) {
            PoiData poiData = videoPublishEditModel.getPoiData();
            if (poiData != null) {
                str = poiData.ugcPoiCreateDetail;
            } else {
                str = null;
            }
            if (!C1533950q1J.LJ(str)) {
                C1367960lha.LIZ.getClass();
                CreateAnchorInfo createAnchorInfoLJZ = C1367960lha.LIZ().LJZ(videoPublishEditModel.getPoiData());
                if (createAnchorInfoLJZ == null) {
                    return;
                }
                ((ArrayList) list).add(createAnchorInfoLJZ);
            }
        }
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, LinkedHashMap linkedHashMap) {
        PoiData poiData;
        String str;
        String str2;
        if (videoPublishEditModel.getPoiData() != null && (poiData = videoPublishEditModel.getPoiData()) != null && (str = poiData.ugcPoiCreateDetail) != null && str.length() != 0) {
            PoiData poiData2 = videoPublishEditModel.getPoiData();
            if (poiData2 == null || (str2 = poiData2.ugcPoiCreateDetail) == null) {
                str2 = "";
            }
            linkedHashMap.put("ugc_poi_create_info", str2);
        }
    }
}
