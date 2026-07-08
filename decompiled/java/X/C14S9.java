package X;

import Y.ACListenerS61S0400000_30;
import android.view.View;
import com.ss.android.ugc.aweme.model.Action;
import com.ss.android.ugc.aweme.model.CommonLogParams;
import com.ss.android.ugc.aweme.model.EventItem;
import com.ss.android.ugc.aweme.model.EventName;
import com.ss.android.ugc.aweme.model.ViewObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14S9, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14S9 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, ViewObject viewObject, CommonLogParams commonLogParams, C01BK c01bk) {
        Map<String, EventItem> map = viewObject.events;
        if (map != null) {
            for (Map.Entry<String, EventItem> entry : map.entrySet()) {
                String key = entry.getKey();
                EventItem value = entry.getValue();
                EventName.Companion.getClass();
                EventName[] eventNameArrValues = EventName.values();
                int length = eventNameArrValues.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        EventName eventName = eventNameArrValues[i];
                        if (Intrinsics.LJFF(eventName.getValue(), key)) {
                            int i2 = C14SA.LIZ[eventName.ordinal()];
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    view.addOnAttachStateChangeListener(new C14SC(value, commonLogParams, c01bk));
                                }
                            } else {
                                C786410Ut5.I7(new ACListenerS61S0400000_30(view, value, commonLogParams, c01bk, 1), view);
                            }
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZIZ(View view, EventItem eventItem, CommonLogParams commonLogParams, C01BK c01bk) {
        Map<String, Object> map;
        Map<String, Object> map2;
        Map<String, Object> map3;
        Map<String, Object> map4;
        List<Action> list = eventItem.actions;
        if (list != null) {
            for (Action action : list) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, Object> map5 = action.params;
                if (map5 != null) {
                    for (Map.Entry<String, Object> entry : map5.entrySet()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                List<String> list2 = action.commonLog;
                if (list2 != null) {
                    for (String str : list2) {
                        switch (str.hashCode()) {
                            case -1378858263:
                                if (str.equals("btmLog") && commonLogParams != null && (map4 = commonLogParams.btmLog) != null) {
                                    for (Map.Entry<String, Object> entry2 : map4.entrySet()) {
                                        String key = entry2.getKey();
                                        Object value = entry2.getValue();
                                        if (!linkedHashMap.containsKey(key)) {
                                            linkedHashMap.put(key, value);
                                        }
                                    }
                                }
                                break;
                            case -332634445:
                                if (str.equals("baseLog") && commonLogParams != null && (map3 = commonLogParams.baseLog) != null) {
                                    for (Map.Entry<String, Object> entry3 : map3.entrySet()) {
                                        String key2 = entry3.getKey();
                                        Object value2 = entry3.getValue();
                                        if (!linkedHashMap.containsKey(key2)) {
                                            linkedHashMap.put(key2, value2);
                                        }
                                    }
                                }
                                break;
                            case 92637217:
                                if (str.equals("adLog") && commonLogParams != null && (map2 = commonLogParams.adLog) != null) {
                                    for (Map.Entry<String, Object> entry4 : map2.entrySet()) {
                                        String key3 = entry4.getKey();
                                        Object value3 = entry4.getValue();
                                        if (!linkedHashMap.containsKey(key3)) {
                                            linkedHashMap.put(key3, value3);
                                        }
                                    }
                                }
                                break;
                            case 553915924:
                                if (str.equals("cardLog") && commonLogParams != null && (map = commonLogParams.cardLog) != null) {
                                    for (Map.Entry<String, Object> entry5 : map.entrySet()) {
                                        String key4 = entry5.getKey();
                                        Object value4 = entry5.getValue();
                                        if (!linkedHashMap.containsKey(key4)) {
                                            linkedHashMap.put(key4, value4);
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }
                if (c01bk != null) {
                    Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry6 : setEntrySet) {
                        Object key5 = entry6.getKey();
                        Object value5 = entry6.getValue();
                        if (value5 != null) {
                            if (!(value5 instanceof String)) {
                                if (!(value5 instanceof Number) && !(value5 instanceof Boolean)) {
                                    if (value5 instanceof Map) {
                                        value5 = C786410Ut5.J3(new JSONObject((Map) value5));
                                    } else if (value5 instanceof Collection) {
                                        value5 = new JSONArray((Collection) value5).toString();
                                    } else if (value5 instanceof Object[]) {
                                        value5 = new JSONArray((Collection) C13LQ.LJJLL((Object[]) value5)).toString();
                                    } else {
                                        value5 = value5.toString();
                                    }
                                } else {
                                    value5 = value5.toString();
                                }
                            }
                            arrayList.add(new Pair(key5, value5));
                        }
                    }
                    c01bk.LIZ(view, action.copy(action.name, action.params, action.commonLog, action.once, C2097608Jq.LJIILLIIL(arrayList)));
                }
            }
        }
    }
}
