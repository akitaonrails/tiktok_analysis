package X;

import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityNetworkService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Wew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828600Wew extends C09AY implements Function1<String, Map<String, ? extends String>> {
    public C828600Wew() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<String, ? extends String> invoke(String str) {
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C828420Wee c828420WeeLJ = C828590Wev.LIZIZ.LJ(str);
        if (c828420WeeLJ != null) {
            Object obj = c828420WeeLJ.LJFF.get("hybrid_info");
            Object obj2 = null;
            if (C19719512Dh.LJII(obj)) {
                map = (Map) obj;
            } else {
                map = null;
            }
            Object obj3 = c828420WeeLJ.LJFF.get("hybrid_channel");
            if (obj3 == null) {
                if (map != null) {
                    obj3 = map.get("hybrid_channel");
                } else {
                    obj3 = null;
                }
            }
            Object obj4 = c828420WeeLJ.LJFF.get("origin_url");
            if (obj4 == null) {
                if (map != null) {
                    obj2 = map.get("origin_url");
                }
            } else {
                obj2 = obj4;
            }
            if (obj3 != null) {
                linkedHashMap.put("hybrid_channel", obj3);
            }
            if (obj2 != null) {
                linkedHashMap.put("origin_url", obj2);
            }
            ((SparkSecurityNetworkService) SparkSecurityServiceCenter.INSTANCE.protocol()).handleWillSendNetworkRequestWithEvent(c828420WeeLJ);
        }
        return linkedHashMap;
    }
}
