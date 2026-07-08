package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.crash.Npth;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01CY, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01CY {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("unknown", "null");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(409));

    static {
        new BPEAHandler(Looper.getMainLooper());
    }

    public static final void LIZIZ(HashMap map, Map map2) {
        String str = (String) map2.get("is_default_prop");
        if (!Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT) && str != null && str.length() != 0) {
            map.put("is_default_prop", CardStruct.IStatusCode.DEFAULT);
        }
    }

    public static final void LIZ(String str, List list, Map map) {
        boolean z;
        boolean z2;
        String str2;
        String str3;
        if (list.isEmpty()) {
            return;
        }
        Object objLJJJJZI = C13LP.LJJJJZI(list);
        if (map.containsKey(objLJJJJZI) && (str3 = (String) map.get(objLJJJJZI)) != null && str3.length() != 0 && !LIZ.contains(str3)) {
            z = true;
        } else {
            z = false;
        }
        int size = list.size();
        for (int i = 1; i < size; i++) {
            Object obj = ListProtector.get(list, i);
            if (map.containsKey(obj) && (str2 = (String) map.get(obj)) != null && str2.length() != 0 && !LIZ.contains(str2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("These keys should all exist or not: ");
                sbLIZ.append(list);
                LIZJ(str, map, list, null, C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
    }

    public static final void LIZJ(String str, Map map, List list, Map map2, String str2) {
        boolean z;
        String str3;
        Object obj;
        if (!((Keva) LIZIZ.getValue()).getBoolean("need_report_event_bug", true)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null && !map.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z || list == null || list.isEmpty()) {
            str3 = "";
        } else {
            Iterator it2 = list.iterator();
            str3 = "";
            while (it2.hasNext()) {
                String str4 = (String) it2.next();
                String str5 = (String) map.get(str4);
                if (str5 == null) {
                    str5 = "";
                }
                str3 = str3 + str4 + ": " + str5 + '\n';
                linkedHashMap.put(str4, str5);
                if (map2 != null) {
                    String str6 = "expected_" + str4;
                    Object obj2 = map2.get(str4);
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    linkedHashMap.put(str6, obj2);
                }
            }
        }
        if (!linkedHashMap.containsKey("shoot_way") && map != null && map.containsKey("shoot_way")) {
            String str7 = (String) map.get("shoot_way");
            if (str7 == null) {
                str7 = "";
            }
            str3 = str3 + "shoot_way: " + str7 + '\n';
            linkedHashMap.put("shoot_way", str7);
        }
        for (Object obj3 : C1697810uHb.LJIIJJI("enter_from", "enter_method")) {
            if (!linkedHashMap.containsKey(obj3)) {
                if (map == null || (obj = map.get(obj3)) == null) {
                    obj = "";
                }
                linkedHashMap.put(obj3, obj);
            }
        }
        if (str3.length() != 0) {
            StringBuilder sb = new StringBuilder("Params Info:\n");
            sb.append(str3);
            sb.append('\n');
        }
        final String str8 = "ET Bug. event name: " + str + ", err msg: " + str2;
        linkedHashMap.put("is_offline", String.valueOf(false));
        Npth.reportBizException("CreationEventRuleException2", new RuntimeException(str8) { // from class: X.01CZ
        }, str8, linkedHashMap);
    }
}
