package X;

import com.bytedance.crash.monitor.k;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VcW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801620VcW {
    public static void LIZ(File file) {
        boolean z;
        C802790VeP c802790VeP = k.LIZ;
        if (c802790VeP == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(file.getAbsolutePath());
        sbLIZ.append("/");
        sbLIZ.append("sdk_info");
        sbLIZ.append(".json");
        C801720Vcg c801720Vcg = new C801720Vcg(C2188811AlT.LIZIZ(sbLIZ));
        c801720Vcg.LJIIIZ();
        ConcurrentHashMap<Integer, String> concurrentHashMap = c802790VeP.LIZJ.LIZIZ;
        boolean z2 = true;
        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
            c801720Vcg.LJII("sdk_info");
            c801720Vcg.LJIIIZ();
            z = true;
            for (Integer num : concurrentHashMap.keySet()) {
                if (z) {
                    z = false;
                } else {
                    c801720Vcg.LJIIIIZZ();
                }
                c801720Vcg.LJII(String.valueOf(num));
                c801720Vcg.LJIIJJI(String.valueOf(concurrentHashMap.get(num)));
            }
            c801720Vcg.LJIIJ();
        } else {
            z = true;
        }
        C802410Vdn c802410Vdn = c802790VeP.LIZJ;
        c802410Vdn.getClass();
        JSONObject jSONObject = new JSONObject(c802410Vdn.LIZJ);
        if (jSONObject.length() > 0) {
            if (!z) {
                c801720Vcg.LJIIIIZZ();
            }
            c801720Vcg.LJII("inner_sdk");
            c801720Vcg.LJIIIZ();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    String string = JSONObjectProtectorUtils.getString(jSONObject, next);
                    if (z2) {
                        z2 = false;
                    } else {
                        c801720Vcg.LJIIIIZZ();
                    }
                    c801720Vcg.LJII(next);
                    c801720Vcg.LJIIJJI(string);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            c801720Vcg.LJIIJ();
        }
        c801720Vcg.LJIIJ();
        c801720Vcg.LJI();
    }

    public static void LIZIZ(JSONObject jSONObject) {
        C802790VeP c802790VeP = k.LIZ;
        if (c802790VeP == null) {
            return;
        }
        ConcurrentHashMap<Integer, String> concurrentHashMap = c802790VeP.LIZJ.LIZIZ;
        JSONObject jSONObject2 = new JSONObject();
        if (concurrentHashMap != null) {
            try {
                if (concurrentHashMap.size() > 0) {
                    for (Integer num : concurrentHashMap.keySet()) {
                        jSONObject2.put(String.valueOf(num), concurrentHashMap.get(num));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C802410Vdn c802410Vdn = c802790VeP.LIZJ;
        c802410Vdn.getClass();
        JSONObject jSONObject3 = new JSONObject(c802410Vdn.LIZJ);
        try {
            if (!C0VJO.LJI(jSONObject2)) {
                jSONObject.put("sdk_info", jSONObject2);
            }
            if (!C0VJO.LJI(jSONObject3)) {
                jSONObject.put("inner_sdk", jSONObject3);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static void LIZJ(JSONObject jSONObject, File file) {
        String strLJFF = C2112008Pe.LJFF(new C0VSJ(file, "sdk_info.json"));
        if (strLJFF != null) {
            try {
                C0VJO.LIZLLL(jSONObject, new JSONObject(strLJFF));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
