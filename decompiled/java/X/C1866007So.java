package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.07So, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1866007So implements C07T8 {
    @Override // X.C07T8
    public final long LIZJ() {
        return 100L;
    }

    @Override // X.C07T8
    public String getEventName() {
        return "prop_click";
    }

    @Override // X.C07T8
    public List<String> LIZLLL() {
        return C1697810uHb.LJIIJJI("shoot_way", "creation_id", "enter_from", "prop_id", "tab_name", "tab_key", "impr_position", "is_auto_applied", "effect_source", "is_default_prop");
    }

    @Override // X.C07T8
    public final C13BV LJFF() {
        return C13BV.INSTANCE;
    }

    public static void LJI(Map map) {
        C1866707Sv c1866707Sv = C1866507St.LIZIZ;
        String str = (String) map.get("prop_id");
        if (str == null) {
            str = "";
        }
        String str2 = (String) map.get("enter_from");
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) map.get("tab_name");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = (String) map.get("tab_key");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = (String) map.get("impr_position");
        if (str5 == null) {
            str5 = "";
        }
        String str6 = (String) map.get("resource_id");
        if (str6 == null) {
            str6 = "";
        }
        String str7 = (String) map.get("effect_source");
        if (str7 == null) {
            str7 = "";
        }
        String str8 = (String) map.get("is_default_prop");
        if (str8 == null) {
            str8 = "";
        }
        String str9 = (String) map.get("is_auto_applied");
        if (str9 == null) {
            str9 = "";
        }
        c1866707Sv.LIZ(new C1867007Sy(str, str2, str3, str4, str5, str6, str7, str8, str9, (String) null, 1536));
    }

    @Override // X.C07T8
    public void LIZ(Map<String, String> map) {
        LJI(map);
        C1866507St.LIZIZ.LIZLLL++;
    }

    @Override // X.C07T8
    public final String LIZIZ(Map<String, String> map) {
        String str = map.get("prop_id");
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.C07T8
    public void LJ(Map<String, String> map) {
        String str;
        C07T3.LIZIZ(getEventName(), map);
        String eventName = getEventName();
        if (C07T3.LIZJ(map) && ((str = map.get("resource_id")) == null || str.length() == 0)) {
            C01CY.LIZJ(eventName, map, Collections.singletonList("resource_id"), null, "resource_id should not be empty");
        }
        String eventName2 = getEventName();
        if (C1866507St.LJI && !C1866507St.LJFF && !C1866507St.LIZ.LJ) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1867107Sz c1867107Sz = C1866507St.LIZ.LIZ;
            linkedHashMap.put("shoot_way", c1867107Sz.LIZ);
            linkedHashMap.put("from_prop_id", c1867107Sz.LIZLLL);
            if (c1867107Sz.LJ.length() > 0) {
                linkedHashMap.put("from_prop_resource_id", c1867107Sz.LJ);
            }
            C07T3.LIZ(eventName2, "shoot", map, linkedHashMap);
        }
    }
}
