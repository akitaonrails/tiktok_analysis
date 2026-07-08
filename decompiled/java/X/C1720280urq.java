package X;

import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0urq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720280urq {
    public static void LIZIZ(InterfaceC1720700usW interfaceC1720700usW, String str, String str2, Map<String, ? extends Object> map) {
        String string;
        C1716280ulO c1716280ulOXK = interfaceC1720700usW.xK();
        if (c1716280ulOXK != null) {
            String strQw = interfaceC1720700usW.Qw();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("event_type", "show");
            linkedHashMap.put("button_id", str);
            linkedHashMap.put("card_id", str2);
            linkedHashMap.put("show_type", "button_in_card");
            String str3 = c1716280ulOXK.LJI.get("track_btm_id");
            if (str3 != null) {
                for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str3, PageFinder.via(strQw), null, 4, null).entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (value == null || (string = value.toString()) == null) {
                        string = "";
                    }
                    linkedHashMap.put(key, string);
                }
            }
            c1716280ulOXK.LIZJ("pipo_button_show", C2097608Jq.LJIIL(C2097608Jq.LJIIL(c1716280ulOXK.LJI, linkedHashMap), C1716280ulO.LIZ(map)));
        }
    }

    public static void LIZ(InterfaceC1720700usW interfaceC1720700usW, String str, Long l, Long l2, Long l3) {
        C1716280ulO c1716280ulOXK = interfaceC1720700usW.xK();
        if (c1716280ulOXK != null) {
            Boolean boolValueOf = Boolean.valueOf(!((ArrayList) c1716280ulOXK.LJIIIZ).contains(str));
            if (str == null) {
                str = "";
            }
            C1716280ulO.LIZLLL(c1716280ulOXK, "update_card", l, boolValueOf, l2, l, l3, C2097908Jt.LIZJ(new Pair("card_id", str)), false, 128);
        }
    }

    public static void LIZJ(InterfaceC1720700usW interfaceC1720700usW, InterfaceC1720550usH interfaceC1720550usH, long j, long j2, long j3, Long l) {
        String str;
        Object obj;
        C1716280ulO c1716280ulOXK = interfaceC1720700usW.xK();
        if (c1716280ulOXK == null) {
            return;
        }
        String strLLJJIJIL = interfaceC1720550usH.LLJJIJIL();
        String str2 = "1";
        if (strLLJJIJIL != null && interfaceC1720550usH.LLILZLL().LIZLLL) {
            interfaceC1720550usH.LLILZLL();
            Map<String, Object> mapLLL = interfaceC1720550usH.LLL();
            boolean z = !((ArrayList) c1716280ulOXK.LJIIIIZZ).contains(strLLJJIJIL);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("event_type", "show");
            linkedHashMap.put("module_id", strLLJJIJIL);
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_first_render", obj);
            c1716280ulOXK.LIZJ("pipo_module_show", C2097608Jq.LJIIL(C2097608Jq.LJIIL(linkedHashMap, c1716280ulOXK.LJI), C1716280ulO.LIZ(mapLLL)));
            if (z) {
                ((ArrayList) c1716280ulOXK.LJIIIIZZ).add(strLLJJIJIL);
            }
        }
        String id = interfaceC1720550usH.getId();
        String type = interfaceC1720550usH.getType();
        C1720510usD c1720510usDLLILZLL = interfaceC1720550usH.LLILZLL();
        boolean z2 = !((ArrayList) c1716280ulOXK.LJIIIZ).contains(id);
        Long lValueOf = Long.valueOf(j);
        Boolean boolValueOf = Boolean.valueOf(z2);
        Long lValueOf2 = Long.valueOf(j2);
        Long lValueOf3 = Long.valueOf(j3);
        if (id == null) {
            str = "";
        } else {
            str = id;
        }
        C1716280ulO.LIZLLL(c1716280ulOXK, "card_show", lValueOf, boolValueOf, lValueOf2, lValueOf3, l, C2097908Jt.LIZJ(new Pair("card_id", str)), false, 128);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("event_type", "show");
        linkedHashMap2.put("card_id", id);
        linkedHashMap2.put("card_type", type);
        linkedHashMap2.put("duration", String.valueOf(j));
        if (!z2) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap2.put("is_first_render", str2);
        c1716280ulOXK.LIZJ("pipo_card_show", C2097608Jq.LJIIL(C2097608Jq.LJIIL(linkedHashMap2, c1716280ulOXK.LJI), C1716280ulO.LIZ(c1720510usDLLILZLL.LIZ)));
        if (z2) {
            ((ArrayList) c1716280ulOXK.LJIIIZ).add(id);
        }
    }

    public static void LIZLLL(InterfaceC1720700usW interfaceC1720700usW, String str, String str2, Long l, Boolean bool, Boolean bool2, String str3) {
        String str4;
        String str5;
        C1716280ulO c1716280ulOXK = interfaceC1720700usW.xK();
        if (c1716280ulOXK != null) {
            Boolean bool3 = Boolean.TRUE;
            String string = null;
            if (Intrinsics.LJFF(bool, bool3)) {
                str4 = "success";
            } else if (Intrinsics.LJFF(bool2, bool3)) {
                str4 = "blank";
            } else {
                str4 = null;
            }
            boolean z = !((ArrayList) c1716280ulOXK.LJIIIZ).contains(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("event_type", "show");
            linkedHashMap.put("card_id", str);
            linkedHashMap.put("url", str2);
            linkedHashMap.put("card_type", "webview");
            if (l != null) {
                string = l.toString();
            }
            linkedHashMap.put("duration", string);
            linkedHashMap.put("load_result", str4);
            linkedHashMap.put("load_error_code", str3);
            if (z) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_first_render", str5);
            c1716280ulOXK.LIZJ("rd_pipo_webview_card_load", C2097608Jq.LJIIL(linkedHashMap, c1716280ulOXK.LJI));
            if (z) {
                ((ArrayList) c1716280ulOXK.LJIIIZ).add(str);
            }
        }
    }
}
