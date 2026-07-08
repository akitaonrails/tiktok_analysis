package X;

import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.monitor.k;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.AbstractSequentialList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vcd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801690Vcd {
    public static void LIZ(File file) {
        Map mapLJJI;
        C802790VeP c802790VeP = k.LIZ;
        if (c802790VeP == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(file.getAbsolutePath());
        sbLIZ.append("/tags.txt");
        if (new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).exists()) {
            return;
        }
        C802410Vdn c802410Vdn = c802790VeP.LIZJ;
        if (c802410Vdn.LJIIZILJ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(file.getAbsolutePath());
            sbLIZ2.append("/tags.txt");
            NativeBridge.LJIILJJIL(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2)).getAbsolutePath());
            return;
        }
        if (C802400Vdm.LIZ != null) {
            return;
        }
        if (NativeBridge.LJJIJIIJIL() && c802410Vdn.LJIIZILJ) {
            mapLJJI = NativeBridge.LJJI();
        } else {
            mapLJJI = c802410Vdn.LIZ;
        }
        if (mapLJJI.size() != 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(file.getAbsolutePath());
            sbLIZ3.append("/");
            sbLIZ3.append("filters");
            sbLIZ3.append(".json");
            C801720Vcg c801720Vcg = new C801720Vcg(C2188811AlT.LIZIZ(sbLIZ3));
            c801720Vcg.LJIIIZ();
            c801720Vcg.LJII("filters");
            c801720Vcg.LJIIIZ();
            boolean z = true;
            for (Map.Entry entry : mapLJJI.entrySet()) {
                if (z) {
                    z = false;
                } else {
                    c801720Vcg.LJIIIIZZ();
                }
                c801720Vcg.LJII((String) entry.getKey());
                c801720Vcg.LJIIJJI((String) entry.getValue());
            }
            c801720Vcg.LJIIJ();
            c801720Vcg.LJIIJ();
            c801720Vcg.LJI();
        }
    }

    public static void LIZIZ(File file) {
        C802790VeP c802790VeP = k.LIZ;
        if (c802790VeP == null) {
            return;
        }
        C802410Vdn c802410Vdn = c802790VeP.LIZJ;
        c802410Vdn.getClass();
        HashMap map = new HashMap();
        for (Object obj : ((ConcurrentHashMap) c802410Vdn.LJIILIIL).keySet()) {
            JSONArray jSONArray = new JSONArray();
            AbstractSequentialList abstractSequentialList = (AbstractSequentialList) ((ConcurrentHashMap) c802410Vdn.LJIILIIL).get(obj);
            if (abstractSequentialList != null) {
                synchronized (abstractSequentialList) {
                    try {
                        Iterator it2 = abstractSequentialList.iterator();
                        while (it2.hasNext()) {
                            jSONArray.put((String) it2.next());
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            map.put(obj, jSONArray);
        }
        if (map.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(file.getAbsolutePath());
            sbLIZ.append("/");
            sbLIZ.append("custom_crash_reason");
            sbLIZ.append(".json");
            C08SE.LJIIIZ(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)), jSONObject);
        } catch (Throwable th) {
        }
    }
}
