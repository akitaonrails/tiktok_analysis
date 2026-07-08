package X;

import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.CachePoweredTexts;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.PoweredTextItem;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.RequestContent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0mh0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406040mh0 {
    public static RequestContent LIZ = new RequestContent(0);
    public static Map<Integer, ? extends List<PoweredTextItem>> LIZIZ = C2097608Jq.LJ();

    public static void LIZ(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), C13LP.LLIIII(((CachePoweredTexts) entry.getValue()).poweredTextList));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateResponse snapshot=");
        sbLIZ.append(linkedHashMap);
        C1454340nwu.LIZ("AIRewriteRequestHelper", C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ = linkedHashMap;
    }
}
