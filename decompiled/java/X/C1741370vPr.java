package X;

import com.bytedance.scene.Scene;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0vPr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741370vPr {
    public static final C1741370vPr LIZ = new C1741370vPr();

    public static void LIZ(C1741370vPr c1741370vPr, String str, String str2, C1741260vPg c1741260vPg, int i) {
        LinkedHashMap linkedHashMap;
        boolean z;
        if ((i & 8) != 0) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = null;
        }
        if ((i & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        c1741370vPr.getClass();
        C1767950w6j c1767950w6j = C1767950w6j.LIZ;
        linkedHashMap.put(Scene.SCENE_SERVICE, str);
        linkedHashMap.put("error_msg", str2);
        linkedHashMap.put("last_status", c1741260vPg.LIZ.toString());
        linkedHashMap.put("current_status", c1741260vPg.LIZIZ.toString());
        linkedHashMap.put("current_desc", c1741260vPg.LIZJ.LIZ.getValue());
        c1767950w6j.getClass();
        C1767950w6j.LJIJ("rd_tiktokec_mall_status_exception", linkedHashMap);
        if (z) {
            C1767580w68.LIZ.getClass();
            if (((Boolean) C07ER.LIZ.getValue()).booleanValue()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[mall_status] scene:");
                sbLIZ.append(str);
                sbLIZ.append(", msg:");
                sbLIZ.append(str2);
                Throwable th = new Throwable(C2188811AlT.LIZIZ(sbLIZ));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
                }
                C1767580w68.LIZIZ(str2, th, new LinkedHashMap(linkedHashMap2));
            }
        }
        C0NOF.LIZ.getClass();
    }
}
