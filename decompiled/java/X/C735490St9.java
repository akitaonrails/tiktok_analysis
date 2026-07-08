package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiAnchorData;
import com.ss.android.ugc.aweme.poi.anchor.api.IPoiAnchorServiceTemporary;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0St9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735490St9 {
    @InterfaceC1294060jmO
    public static PoiAnchorData LIZ(Aweme aweme, String str) {
        AnchorCommonStruct next;
        IPoiAnchorServiceTemporary iPoiAnchorServiceTemporary = (IPoiAnchorServiceTemporary) ServiceManager.get().getService(IPoiAnchorServiceTemporary.class);
        PoiAnchorData poiAnchorDataCopy = null;
        if (iPoiAnchorServiceTemporary.LIZIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("legacy_");
            sbLIZ.append(str);
            C735500StA c735500StALIZ = iPoiAnchorServiceTemporary.LIZ(aweme, C2188811AlT.LIZIZ(sbLIZ));
            if (c735500StALIZ != null) {
                String str2 = c735500StALIZ.LIZ;
                if (str2 == null) {
                    str2 = "";
                }
                poiAnchorDataCopy = new PoiAnchorData(str2, c735500StALIZ.LIZIZ, null, null, null, null, null, null, null, null, null, c735500StALIZ.LIZJ, null, null);
            }
            return poiAnchorDataCopy;
        }
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    AnchorCommonStruct anchorCommonStruct = next;
                    if (anchorCommonStruct.getType() == 45 && anchorCommonStruct.getExtra().length() > 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct2 = next;
            if (anchorCommonStruct2 != null) {
                try {
                    PoiAnchorData poiAnchorData = (PoiAnchorData) C08JS.LIZIZ().LJII(anchorCommonStruct2.getExtra(), PoiAnchorData.class);
                    poiAnchorDataCopy = poiAnchorData.copy(poiAnchorData.poiId, anchorCommonStruct2.getKeyword(), poiAnchorData.poiCity, anchorCommonStruct2.getDescription(), 0, poiAnchorData.poiCityCode, poiAnchorData.videoCount, poiAnchorData.poiRegionCode, poiAnchorData.poiInfoSource, aweme.getAid(), anchorCommonStruct2.getIcon(), poiAnchorData.collectInfo, poiAnchorData.favCnt, poiAnchorData.isTtKeyCategory);
                    return poiAnchorDataCopy;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return poiAnchorDataCopy;
    }
}
