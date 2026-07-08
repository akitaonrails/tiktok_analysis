package X;

import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Model;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Tab;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gi3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176050gi3 {
    public static boolean LIZ(PoiNearbyV2Model poiNearbyV2Model) {
        List<PoiNearbyV2Tab> tabList;
        if (!Intrinsics.LJFF(poiNearbyV2Model.isShowTab(), Boolean.TRUE)) {
            return false;
        }
        String currentTabKey = poiNearbyV2Model.getCurrentTabKey();
        if ((currentTabKey == null || currentTabKey.length() == 0) && (tabList = poiNearbyV2Model.getTabList()) != null && tabList.size() == 1) {
            List<PoiNearbyV2Tab> tabList2 = poiNearbyV2Model.getTabList();
            if (!(tabList2 instanceof Collection) || !tabList2.isEmpty()) {
                Iterator<PoiNearbyV2Tab> it2 = tabList2.iterator();
                while (it2.hasNext()) {
                    String tabName = it2.next().getTabName();
                    if (tabName == null || tabName.length() == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
