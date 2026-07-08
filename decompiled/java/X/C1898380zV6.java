package X;

import com.bytedance.touchpoint.core.pendant.ad.AdFeedTimerPendantManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0zV6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898380zV6 {
    public static AdFeedTimerPendantManager LIZ(String str) {
        if (str != null && str.length() != 0) {
            Map<String, AdFeedTimerPendantManager> map = AdFeedTimerPendantManager.LLJJL;
            AdFeedTimerPendantManager adFeedTimerPendantManager = (AdFeedTimerPendantManager) ((LinkedHashMap) map).get(str);
            if (adFeedTimerPendantManager != null) {
                return adFeedTimerPendantManager;
            }
            AdFeedTimerPendantManager adFeedTimerPendantManager2 = new AdFeedTimerPendantManager();
            map.put(str, adFeedTimerPendantManager2);
            return adFeedTimerPendantManager2;
        }
        return null;
    }
}
