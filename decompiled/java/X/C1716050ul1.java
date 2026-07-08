package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0ul1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1716050ul1 {
    public final C1716060ul2 LIZ;

    public C1716050ul1(C1716060ul2 c1716060ul2) {
        this.LIZ = c1716060ul2;
    }

    public final void LIZJ(Map<String, String> map) {
        C1716060ul2 c1716060ul2 = this.LIZ;
        if (c1716060ul2 != null) {
            map.put("merchant_id", c1716060ul2.LIZ);
            map.put("merchant_user_id", c1716060ul2.LIZIZ);
            map.put("busi_type", c1716060ul2.LIZJ);
            map.put("enter_type", c1716060ul2.LIZLLL);
            map.put("page_id", c1716060ul2.LJ);
            map.put("previous_page_id", c1716060ul2.LJFF);
            map.put("source_id", c1716060ul2.LJI);
        }
        map.put("timestamp", String.valueOf(System.currentTimeMillis()));
        map.put("priority_region", C1717770unn.LJIIIIZZ().getCurrentRegionCode());
        String storeRegionUpperCase = C1717770unn.LJIIIIZZ().getStoreRegionUpperCase();
        if (storeRegionUpperCase == null) {
            storeRegionUpperCase = "";
        }
        map.put("country_code", storeRegionUpperCase);
    }

    public final void LIZ(String str, Function1 function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZJ(linkedHashMap);
        linkedHashMap.put("obj_id", str);
        function1.invoke(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), entry.getValue());
        }
        C1713870uhV.LIZ("fp_sdk_biometric_info_agreement_click", linkedHashMap2);
    }

    public final void LIZIZ(String str, Function1<? super Map<String, String>, Unit> function1) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZJ(linkedHashMap);
        if (function1 != null) {
            function1.invoke(linkedHashMap);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), entry.getValue());
        }
        C1713870uhV.LIZ(str, linkedHashMap2);
    }

    public static void LIZLLL(C1716050ul1 c1716050ul1, String str, String str2) {
        c1716050ul1.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c1716050ul1.LIZJ(linkedHashMap);
        linkedHashMap.put("popup_id", str);
        linkedHashMap.put("obj_id", str2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), entry.getValue());
        }
        C1713870uhV.LIZ("fp_sdk_bnpl_popup_click", linkedHashMap2);
    }

    public static void LJ(C1716050ul1 c1716050ul1, String str, String[] strArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c1716050ul1.LIZJ(linkedHashMap);
        StringBuilder sb = new StringBuilder("{");
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            int i2 = i + 1;
            sbLIZ.append(i2);
            sbLIZ.append(',');
            sbLIZ.append(strArr[i]);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            if (i2 < strArr.length) {
                sb.append("; ");
            }
            i = i2;
        }
        sb.append('}');
        linkedHashMap.put("obj_id", sb.toString());
        linkedHashMap.put("popup_id", str);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), entry.getValue());
        }
        C1713870uhV.LIZ("fp_sdk_bnpl_popup_show", linkedHashMap2);
    }
}
