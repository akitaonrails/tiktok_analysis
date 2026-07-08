package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vUQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1744200vUQ {
    public final Map<String, Object> LIZ;
    public final Map<String, Object> LIZIZ;
    public final String LIZJ;
    public long LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public final void LIZ(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.LIZIZ);
        Object obj = linkedHashMap.get("page_name");
        Object obj2 = "";
        if (obj == null) {
            obj = "";
        }
        linkedHashMap.put("previous_page", obj);
        linkedHashMap.put("page_name", "select_region");
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("sub_page_name", str2);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("button_name", str);
        linkedHashMap.put("if_auto_location", Integer.valueOf(this.LJ ? 1 : 0));
        Object obj3 = linkedHashMap.get("location");
        Object obj4 = obj3;
        if (obj3 == null) {
            obj4 = "unKnown";
        }
        linkedHashMap.put("location", obj4);
        Object objRemove = linkedHashMap.remove("page_info");
        if (objRemove == null) {
            objRemove = "";
        }
        linkedHashMap.put("fill_type", objRemove);
        Object obj5 = linkedHashMap.get("entrance_info");
        if (obj5 != null) {
            obj2 = obj5;
        }
        linkedHashMap.put("entrance_info", obj2);
        C1018703yb.LIZIZ("tiktokec_button_click", linkedHashMap);
    }

    public final Unit LIZIZ(int i, String str, String str2) {
        if (str2 != null && !a0.LJJJIL(str2)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.LIZIZ);
            Object objRemove = linkedHashMap.remove("page_info");
            Object obj = "";
            if (objRemove == null) {
                objRemove = "";
            }
            linkedHashMap.put("fill_type", objRemove);
            linkedHashMap.put("previous_page", this.LIZJ);
            linkedHashMap.put("page_name", "select_region");
            linkedHashMap.put("sub_page_name", str2);
            linkedHashMap.put("if_auto_location", Integer.valueOf(this.LJ ? 1 : 0));
            if (Intrinsics.LJFF(str, "Select Zipcode")) {
                linkedHashMap.put("option_cnt", Integer.valueOf(i));
            }
            Object obj2 = linkedHashMap.get("location");
            Object obj3 = obj2;
            if (obj2 == null) {
                obj3 = "unKnown";
            }
            linkedHashMap.put("location", obj3);
            Object obj4 = linkedHashMap.get("entrance_info");
            if (obj4 != null) {
                obj = obj4;
            }
            linkedHashMap.put("entrance_info", obj);
            C1018703yb.LIZIZ("tiktokec_enter_page", linkedHashMap);
            return Unit.LIZ;
        }
        return null;
    }

    public final void LIZJ(String str, String str2, boolean z) {
        Object obj;
        Object obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZIZ);
        Map<String, Object> map = this.LIZIZ;
        Object obj3 = "";
        if (map == null || (obj = ((LinkedHashMap) map).get("entrance_info")) == null) {
            obj = "";
        }
        linkedHashMap.put("entrance_info", obj);
        linkedHashMap.put("previous_page", this.LIZJ);
        linkedHashMap.put("page_name", "select_region");
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("sub_page_name", str);
        linkedHashMap.put("quit_type", str2);
        linkedHashMap.put("is_load_data", Integer.valueOf(z ? 1 : 0));
        if (this.LIZLLL != -1) {
            linkedHashMap.put("stay_time", Long.valueOf(SystemClock.elapsedRealtime() - this.LIZLLL));
        }
        linkedHashMap.put("if_auto_location", Integer.valueOf(this.LJ ? 1 : 0));
        if (this.LJ) {
            linkedHashMap.put("if_updated", Integer.valueOf(this.LJFF ? 1 : 0));
        }
        Map<String, Object> map2 = this.LIZIZ;
        if (map2 != null && (obj2 = ((LinkedHashMap) map2).get("page_info")) != null) {
            obj3 = obj2;
        }
        linkedHashMap.put("fill_type", obj3);
        C1018703yb.LIZIZ("tiktokec_stay_page", linkedHashMap);
    }

    public C1744200vUQ(String str, String str2, String str3, String str4, Integer num, boolean z, Map<String, ? extends Object> map, Integer num2) {
        this.LIZ = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZIZ = linkedHashMap;
        this.LIZJ = "shipping_address";
        this.LIZLLL = -1L;
        str4 = str4 == null ? "shipping_address" : str4;
        this.LIZJ = str4;
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("previous_page", str4);
        linkedHashMap.put("page_name", str4);
        linkedHashMap.put("location", str2);
        linkedHashMap.put("is_fullscreen", C893803eS.LIZ(z));
        if (str != null) {
            linkedHashMap.put("page_info", str);
        }
        if (str3 != null) {
            linkedHashMap.put("entrance_info", str3);
        }
        if (num != null) {
            linkedHashMap.put("is_with_delivery_info", Integer.valueOf(num.intValue()));
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (num2 != null) {
            linkedHashMap.put("is_change_address_after_pay", Integer.valueOf(num2.intValue()));
        }
    }
}
