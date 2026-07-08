package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0zXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899940zXc {
    public static final C1899940zXc LIZ = new C1899940zXc();

    public static Map LIZ(Map map) {
        if (map != null && !map.isEmpty()) {
            C13DA c13da = new C13DA();
            for (Map.Entry entry : map.entrySet()) {
                c13da.put(entry.getKey(), entry.getValue().toString());
            }
            return c13da.build();
        }
        return C2097608Jq.LJ();
    }

    public static void LIZIZ(C1899950zXd c1899950zXd) {
        String str;
        EnumC1899960zXe enumC1899960zXe = c1899950zXd.LJI;
        if (enumC1899960zXe == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - c1899950zXd.LJIIJ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordResult popupIdentifier=");
        sbLIZ.append(c1899950zXd.LIZIZ);
        sbLIZ.append(" pageIdentifier=");
        sbLIZ.append(c1899950zXd.LIZJ);
        sbLIZ.append(" reason=");
        sbLIZ.append(enumC1899960zXe.getValue());
        sbLIZ.append(" totalDurationMs=");
        sbLIZ.append(jCurrentTimeMillis);
        C2188811AlT.LIZIZ(sbLIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Scene.SCENE_SERVICE, c1899950zXd.LIZ.getValue());
        linkedHashMap.put("popup_id", c1899950zXd.LIZIZ);
        linkedHashMap.put("page_id", c1899950zXd.LIZJ);
        linkedHashMap.put("schema", c1899950zXd.LIZLLL);
        if (c1899950zXd.LJFF) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("show_immediately", str);
        linkedHashMap.put("end_reason", enumC1899960zXe.getValue());
        linkedHashMap.put("total_duration", String.valueOf(jCurrentTimeMillis));
        C1899940zXc c1899940zXc = LIZ;
        Map<String, Object> map = c1899950zXd.LJ;
        c1899940zXc.getClass();
        linkedHashMap.putAll(LIZ(map));
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("incentive_popup_load_end", linkedHashMap);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("recordResult mobEvent sent popupIdentifier=");
        sbLIZ2.append(c1899950zXd.LIZIZ);
        sbLIZ2.append(" endReason=");
        sbLIZ2.append(enumC1899960zXe.getValue());
        C2188811AlT.LIZIZ(sbLIZ2);
        InterfaceC1900020zXk.LIZ.getClass();
        InterfaceC1900020zXk interfaceC1900020zXk = (InterfaceC1900020zXk) PluggableExtentionKt.pluggableSpi$default(InterfaceC1900020zXk.class, false, false, false, 14, null);
        if (interfaceC1900020zXk != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key != null && value != null) {
                    arrayList.add(new Pair(key, value));
                }
            }
            C2097608Jq.LJIILLIIL(arrayList);
            enumC1899960zXe.getValue();
            System.currentTimeMillis();
            interfaceC1900020zXk.LIZ();
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("recordResult debug record appended popupIdentifier=");
        sbLIZ3.append(c1899950zXd.LIZIZ);
        sbLIZ3.append(" endReason=");
        sbLIZ3.append(enumC1899960zXe.getValue());
        C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static void LIZJ(C1899950zXd c1899950zXd) {
        boolean z;
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordStart popupIdentifier=");
        sbLIZ.append(c1899950zXd.LIZIZ);
        sbLIZ.append(" pageIdentifier=");
        sbLIZ.append(c1899950zXd.LIZJ);
        sbLIZ.append(" hasLogExtra=");
        if (c1899950zXd.LJ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Scene.SCENE_SERVICE, c1899950zXd.LIZ.getValue());
        linkedHashMap.put("popup_id", c1899950zXd.LIZIZ);
        linkedHashMap.put("page_id", c1899950zXd.LIZJ);
        linkedHashMap.put("schema", c1899950zXd.LIZLLL);
        if (c1899950zXd.LJFF) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("show_immediately", str);
        C1899940zXc c1899940zXc = LIZ;
        Map<String, Object> map = c1899950zXd.LJ;
        c1899940zXc.getClass();
        linkedHashMap.putAll(LIZ(map));
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("incentive_popup_load_start", linkedHashMap);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("recordStart mobEvent sent popupIdentifier=");
        sbLIZ2.append(c1899950zXd.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
