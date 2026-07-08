package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.06sy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1748206sy {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Map map, C909290Zln c909290Zln) {
        if (c909290Zln == null) {
            return;
        }
        map.put("to_uid", String.valueOf(c909290Zln.getSingleChatFromUserId()));
        String trafficTypeForMob = c909290Zln.getTrafficTypeForMob();
        if (trafficTypeForMob != null) {
            map.put("traffic_type", trafficTypeForMob);
        }
    }

    public static void LIZIZ(C909290Zln c909290Zln, String str, String str2, String str3, boolean z) {
        String str4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ(linkedHashMap, c909290Zln);
        linkedHashMap.put("message_source", str);
        linkedHashMap.put("reason", str2);
        linkedHashMap.put("send_info", str3);
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_from_script", str4);
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("lead_card_dismiss", linkedHashMap);
    }

    public static void LIZJ(C909290Zln c909290Zln, String str, EnumC1750406tK enumC1750406tK, List list, List list2, Long l, boolean z) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ(linkedHashMap, c909290Zln);
        linkedHashMap.put("message_source", str);
        linkedHashMap.put("detect_result", enumC1750406tK.getValue());
        linkedHashMap.put("detect_lead_info", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
        linkedHashMap.put("auto_fill_info", C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62));
        if (l != null) {
            linkedHashMap.put("detect_duration", String.valueOf(l.longValue()));
        }
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_from_script", str2);
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("lead_intent_detect", linkedHashMap);
    }
}
