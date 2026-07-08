package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.NearbyTag;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.tag.IPoiTagService;
import com.ss.android.ugc.aweme.poi.tag.NearbyPoiTagTrigger;
import com.ss.android.ugc.aweme.poi.tag.NearbyPoiTagTriggerV2;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RjY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704060RjY implements IPoiTagService {
    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public final VideoTagCategoryProtocol getPoiTagTrigger() {
        return new NearbyPoiTagTrigger();
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public final VideoTagCategoryProtocol getPoiTagTriggerV2() {
        return new NearbyPoiTagTriggerV2();
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public final C03D6 getPoiTagView(Context context) {
        return new C03D5(context, null);
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public final boolean isPoiTagShow(String str, Aweme aweme) {
        NearbyTag nearbyTag;
        String str2;
        if (!Intrinsics.LJFF(str, "homepage_nearby")) {
            return false;
        }
        C1367960lha.LIZ.getClass();
        if (C1367960lha.LIZ().shouldShowCustomFeedSingleAnchor(aweme) || C1367960lha.LIZ().shouldShowOldFeedSingleAnchor(aweme)) {
            return false;
        }
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AnchorCommonStruct next = it2.next();
                if (next.getType() == EnumC1430380nKG.POI.getTYPE()) {
                    if (next != null) {
                        return false;
                    }
                }
            }
        }
        PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
        if (poiDataStruct == null || (nearbyTag = poiDataStruct.nearbyTag) == null || (str2 = nearbyTag.text) == null || str2.length() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public final void appendPoiTagParamsIfHave(String str, HashMap<String, String> map, Aweme aweme) {
        String str2;
        NearbyTag nearbyTag;
        if (aweme != null && isPoiTagShow(str, aweme)) {
            PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
            if (poiDataStruct == null || (nearbyTag = poiDataStruct.nearbyTag) == null || (str2 = nearbyTag.text) == null) {
                str2 = "";
            }
            map.put("region_label_text", str2);
        }
    }
}
