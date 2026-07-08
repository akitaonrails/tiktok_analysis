package X;

import com.ss.android.ugc.aweme.feed.model.banner.FcpTemplateAction;
import com.ss.android.ugc.aweme.feed.model.banner.FcpTemplateActionGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: renamed from: X.02x1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C754102x1 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(7));

    public static List LIZ() {
        return C1697810uHb.LJIIJJI(C2097608Jq.LJIIIIZZ(new Pair("key", "exposure_action"), new Pair("events", Collections.singletonList(C2097908Jt.LIZJ(new Pair("type", "ad_tag_show"))))), C2097608Jq.LJIIIIZZ(new Pair("key", "click_action"), new Pair("events", Collections.singletonList(C2097908Jt.LIZJ(new Pair("type", "ad_tag_click"))))));
    }

    public static Map LIZIZ(String str) {
        String str2;
        List list;
        String str3;
        List<Map> list2 = (List) ((Map) LIZ.getValue()).get(str);
        if (list2 == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map map : list2) {
            ArrayList arrayList = new ArrayList();
            Object obj = map.get("key");
            if (!(obj instanceof String) || (str2 = (String) obj) == null) {
                str2 = "";
            }
            Object obj2 = map.get("events");
            if (!(obj2 instanceof List) || (list = (List) obj2) == null) {
                list = C13BV.INSTANCE;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object obj3 = ((Map) it2.next()).get("type");
                if (obj3 instanceof String) {
                    str3 = (String) obj3;
                } else {
                    str3 = null;
                }
                arrayList.add(new FcpTemplateAction(str3, null, null));
            }
            linkedHashMap.put(str2, new FcpTemplateActionGroup(str2, null, arrayList));
        }
        return linkedHashMap;
    }
}
