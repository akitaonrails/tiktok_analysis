package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONObject;
import webcast.data.oec_msg.MsgMeta;
import webcast.data.oec_msg.OecLiveShoppingMessageV2;

/* JADX INFO: renamed from: X.17v3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21183117v3 {
    public static final EnumC21180817ug LIZLLL(int i) {
        switch (i) {
            case 1001:
                return EnumC21180817ug.MESSAGE_PIN;
            case 1002:
            default:
                return null;
            case 1003:
                return EnumC21180817ug.MESSAGE_REFRESH_GLOBAL;
            case 1004:
                return EnumC21180817ug.MESSAGE_REFRESH_PART;
            case 1005:
                return EnumC21180817ug.MESSAGE_FORCE_GLOBAL;
        }
    }

    public static final void LIZ(Map<String, ? super String> map, C1563990qnl c1563990qnl) {
        if (c1563990qnl == null) {
            return;
        }
        try {
            if (!C07J3.LIZ()) {
                return;
            }
            map.put("trigger_source", c1563990qnl.LIZ);
            map.put("chain_id", c1563990qnl.LIZIZ);
            for (Map.Entry<String, String> entry : c1563990qnl.LIZJ.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!map.containsKey(key)) {
                    map.put(key, value);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("chain_id", c1563990qnl.LIZIZ);
            linkedHashMap.put("trigger_source", c1563990qnl.LIZ);
            String str = map.get("card_type");
            if (str != null) {
                linkedHashMap.put("card_type", str);
            }
            String str2 = map.get("sub_scene");
            if (str2 != null) {
                linkedHashMap.put("sub_scene", str2);
            }
            String str3 = map.get("reason");
            if (str3 != null) {
                linkedHashMap.put("reason", str3);
            }
            CharSequence charSequence = map.get("step_extra");
            if (charSequence instanceof Map) {
                linkedHashMap.putAll((Map) charSequence);
            } else if ((charSequence instanceof String) && charSequence.length() > 0) {
                try {
                    Map map2 = (Map) C08JS.LIZIZ().LJIIIIZZ((String) charSequence, new TypeToken<Map<String, ? extends Object>>() { // from class: X.17v4
                    }.getType());
                    if (map2 != null) {
                        linkedHashMap.putAll(map2);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    linkedHashMap.put("legacy_extra", charSequence);
                }
            }
            map.put("step_extra", C08JS.LIZIZ().LJIILL(linkedHashMap));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final C1563990qnl LIZIZ(ECommerceMessage eCommerceMessage, EnumC21180817ug enumC21180817ug, Map<String, ? extends Object> map) {
        Object c098200Yq;
        OecLiveShoppingMessageV2 oecLiveShoppingMessageV2;
        MsgMeta msgMeta;
        CommonMessageData commonMessageData;
        String value = enumC21180817ug.getValue();
        try {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            do {
                sb.append(C13LN.LJLLLLLL("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", AbstractC19994813Le.Default));
                i++;
            } while (i < 22);
            c098200Yq = sb.toString();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = u.LJJIFFI(UUID.randomUUID().toString(), "-", "", false);
        }
        C1563990qnl c1563990qnl = new C1563990qnl(value, (String) c098200Yq);
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value2 = entry.getValue();
            if (value2 != null) {
                c1563990qnl.LIZJ.put(key, value2.toString());
            }
        }
        if ((eCommerceMessage instanceof AbstractC1136060ffY) && eCommerceMessage != null && (commonMessageData = eCommerceMessage.baseMessage) != null) {
            c1563990qnl.LIZJ.put("message_id", String.valueOf(commonMessageData.messageId));
        }
        if (eCommerceMessage != null && (oecLiveShoppingMessageV2 = eCommerceMessage.oecLiveShoppingMessageV2) != null && (msgMeta = oecLiveShoppingMessageV2.msgMeta) != null) {
            Map<String, String> map2 = c1563990qnl.LIZJ;
            C110400bO.LIZ.getClass();
            map2.put("msg_received_ms", String.valueOf(C110400bO.LJ()));
            List<String> list = msgMeta.reasons;
            if (list != null && (!list.isEmpty())) {
                c1563990qnl.LIZJ.put("reasons", GsonProtectorUtils.toJson(C08JS.LIZIZ(), list));
            }
        }
        return c1563990qnl;
    }

    public static final String LIZJ(C1563990qnl c1563990qnl, String str, String str2) {
        Object c098200Yq;
        Map<String, String> map;
        String str3;
        List list;
        Map<String, String> map2;
        String str4;
        Map<String, String> map3;
        String str5;
        Map<String, String> map4;
        String str6;
        Object obj = null;
        if (!C07J3.LIZ()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (c1563990qnl != null && (map4 = c1563990qnl.LIZJ) != null && (str6 = map4.get("message_id")) != null) {
                jSONObject.put("msg_id", str6);
            }
            if (c1563990qnl != null && (map3 = c1563990qnl.LIZJ) != null && (str5 = map3.get("msg_received_ms")) != null) {
                jSONObject.put("msg_received_ms", str5);
            }
            if (c1563990qnl != null && (map2 = c1563990qnl.LIZJ) != null && (str4 = map2.get("has_pop_card_container")) != null) {
                jSONObject.put("has_pop_card_container", Boolean.parseBoolean(str4));
            }
            if (c1563990qnl != null && (map = c1563990qnl.LIZJ) != null && (str3 = map.get("reasons")) != null && (list = (List) C08JS.LIZIZ().LJIIIIZZ(str3, new TypeToken<List<? extends String>>() { // from class: X.17v5
            }.getType())) != null) {
                jSONObject.put("reasons", new JSONArray((Collection) list));
            }
            if (str2 != null) {
                jSONObject.put("comp_refresh", str2);
            }
            jSONObject.put("live_bag_product_num", C21197617xO.LIZ);
            if (str != null) {
                jSONObject.put("pop_msg_ctx_str", str);
            }
            c098200Yq = C786410Ut5.J3(jSONObject);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }
}
