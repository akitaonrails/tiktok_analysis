package X;

import com.bytedance.android.livesdkapi.host.IHostAction;
import java.util.Map;

/* JADX INFO: renamed from: X.0Izd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C484710Izd {
    public static String LIZ() {
        Map map;
        Object feature = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getFeature("ttm_live", "live_toolbar_tips_filter_feature", 2);
        Object obj = (!(feature instanceof Map) || (map = (Map) feature) == null) ? null : map.get("toolbar_tips_guide");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }
}
