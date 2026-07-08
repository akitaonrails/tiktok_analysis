package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.bytedance.crash.Npth;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.account.TTAccountInit;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XMc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847400XMc {
    public static volatile boolean LIZ = false;
    public static volatile boolean LIZIZ = true;
    public static Set<String> LIZJ = Collections.synchronizedSet(new HashSet());
    public static final List<C0XN8> LIZLLL = new ArrayList();
    public static boolean LJ = false;
    public static C0XN7 LJFF;
    public static C0XNG LJI;
    public static volatile C0XNF LJII;
    public static C0XNE LJIIIIZZ;

    public static Context LIZLLL() {
        C0XN7 c0xn7 = LJFF;
        if (c0xn7 == null) {
            return null;
        }
        return C848000XOk.LIZ();
    }

    public static void LJ() {
        ((C0XN4) LJFF).LIZ.getClass();
    }

    public static JSONObject LJFF() {
        if (LJFF == null) {
            return null;
        }
        try {
            TTAccountInit.LIZ();
            C847490XMl c847490XMlLIZ = C310970CGx.LIZ(C848000XOk.LIZ());
            Context context = c847490XMlLIZ.LIZ;
            if (c847490XMlLIZ.LIZIZ == null && context != null) {
                c847490XMlLIZ.LIZIZ = C810670Vr7.LIZJ(context, 0, "account_sdk_settings_sp");
            }
            SharedPreferences sharedPreferences = c847490XMlLIZ.LIZIZ;
            return new JSONObject(sharedPreferences != null ? sharedPreferences.getString("account_sdk_settings", "") : "");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return new JSONObject();
        }
    }

    public static String LJI() {
        C847470XMj c847470XMj;
        if (!LIZ || (c847470XMj = C0XMV.LLJJJIL.LLILZIL) == null) {
            return null;
        }
        return c847470XMj.LIZ;
    }

    public static boolean LJII() {
        C0XN7 c0xn7 = LJFF;
        if (c0xn7 == null) {
            return false;
        }
        return C0XO0.LIZLLL(C848000XOk.LIZ()).LLJZIJLIL;
    }

    public static void LJIIJJI() {
        C0XN7 c0xn7 = LJFF;
        if (c0xn7 != null) {
            if (C848000XOk.LIZ() != null) {
                C0XO0 c0xo0LIZLLL = C0XO0.LIZLLL(C848000XOk.LIZ());
                c0xo0LIZLLL.getClass();
                C0XGH c0xgh = new C0XGH(4);
                synchronized (c0xo0LIZLLL.LLLL) {
                    try {
                        Iterator<C0XN9> it2 = c0xo0LIZLLL.LLLL.iterator();
                        while (it2.hasNext()) {
                            it2.next().LJI(c0xgh);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }

    public static boolean LJIIIIZZ() {
        if (LIZLLL() == null) {
            return false;
        }
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(LIZLLL(), "connectivity"));
            if (networkInfoLJIJ != null) {
                return networkInfoLJIJ.isConnected();
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static void LIZ(Collection<String> collection) {
        if (LIZ) {
            C0XMX c0xmx = C0XMV.LLJJJIL.LLILZLL;
            if (c0xmx != null && ((ArrayList) collection).size() > 0) {
                c0xmx.LIZJ = true;
                ((CopyOnWriteArraySet) c0xmx.LIZIZ).addAll(collection);
                c0xmx.LIZ();
                return;
            }
            return;
        }
        Set<String> set = LIZJ;
        if (set == null) {
            return;
        }
        set.addAll(collection);
    }

    public static Map LIZJ(String str) throws JSONException {
        boolean z;
        Set<String> set;
        Map<String, String> map = null;
        C847530XMp c847530XMpLIZIZ = LIZIZ(str, null);
        if (c847530XMpLIZIZ != null) {
            map = c847530XMpLIZIZ.LIZ;
        }
        try {
            if (!TextUtils.isEmpty(str) && str.startsWith("http://") && map != null && !map.isEmpty()) {
                HeaderParamConfig headerParamConfigLJIIJJI = ComplianceServiceProvider.LJII().LJIIJJI();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    hashSet.add(entry.getKey());
                    if (headerParamConfigLJIIJJI != null && (set = headerParamConfigLJIIJJI.denyKeys) != null && set.contains(entry.getKey().toLowerCase(Locale.ROOT)) && !ComplianceServiceProvider.LJII().LJIIIZ(headerParamConfigLJIIJJI, str)) {
                        hashSet2.add(entry.getKey());
                    }
                }
                if (!hashSet2.isEmpty()) {
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        map.remove((String) it2.next());
                    }
                }
                if (!hashSet.isEmpty()) {
                    if (!hashSet2.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ComplianceServiceProvider.LJII().LJJIFFI(new C0X1N(z, null, str, null, hashSet, hashSet2, new HashSet(), new HashSet(), new HashSet(), new HashSet()));
                    return map;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0354 A[PHI: r4
      0x0354: PHI (r4v5 X.0XN6) = (r4v4 X.0XN6), (r4v6 X.0XN6) binds: [B:146:0x0347, B:148:0x034b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C847530XMp LIZIZ(java.lang.String r23, java.util.List r24) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C847400XMc.LIZIZ(java.lang.String, java.util.List):X.0XMp");
    }

    public static void LJIIIZ(String str, String str2) {
        if (LJII != null) {
            LJII.getClass();
            C0XFF.LIZ(str, str2);
        }
    }

    public static void LJIIJ(String str, JSONObject jSONObject) {
        C0XN7 c0xn7 = LJFF;
        if (c0xn7 != null) {
            c0xn7.getClass();
            TTAccountInit.LIZIZ.getClass();
            TTAccountInit.LIZIZ.getClass();
            new C837540WtM().LIZ(str, jSONObject);
        }
    }

    public static void LJIILL(C0XMY c0xmy, String str) {
        HashMap map = new HashMap();
        map.put(Scene.SCENE_SERVICE, str);
        HashMap map2 = new HashMap();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        LJ();
        sbLIZ.append("api-va.tiktokv.com");
        sbLIZ.append("/passport/account/info/v2/");
        LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ), map2, map, true, c0xmy);
    }

    /* JADX WARN: Code restructure failed: missing block: B:352:0x0639, code lost:
    
        r11 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r10.LIZIZ);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ed A[EDGE_INSN: B:429:0x01ed->B:94:0x01ed BREAK  A[LOOP:7: B:346:0x0620->B:431:0x0620], PHI: r5
      0x01ed: PHI (r5v9 org.json.JSONObject) = (r5v1 org.json.JSONObject), (r5v1 org.json.JSONObject), (r5v1 org.json.JSONObject), (r5v10 org.json.JSONObject) binds: [B:344:0x061a, B:429:0x01ed, B:354:0x0642, B:93:0x01eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ed A[PHI: r5
      0x01ed: PHI (r5v9 org.json.JSONObject) = (r5v1 org.json.JSONObject), (r5v1 org.json.JSONObject), (r5v1 org.json.JSONObject), (r5v10 org.json.JSONObject) binds: [B:344:0x061a, B:429:0x01ed, B:354:0x0642, B:93:0x01eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [X.08fh] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.08fh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(java.lang.String r20, X.C847530XMp r21, X.C2175508fh r22, java.util.List<X.C20667087t> r23) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C847400XMc.LJIIL(java.lang.String, X.0XMp, X.08fh, java.util.List):void");
    }

    public static void LJIILIIL(String str, Throwable th, String str2, Map map) {
        if (LJIIIIZZ != null) {
            TTAccountInit.LIZIZ.getClass();
            Npth.reportBizException(str, th, str2, (Map<String, String>) map, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0XMb] */
    public static void LJIILJJIL(String str, Map<String, String> map, Map<String, String> map2, boolean z, final InterfaceC847590XMv interfaceC847590XMv) {
        boolean zLJI = MethodIDManager.LJI(137823);
        if (LJFF != null) {
            boolean zLJI2 = MethodIDManager.LJI(137824);
            ((C0XH0) C0XH0.LIZLLL()).LIZJ(str, map, map2, z, new AbstractC846040XGw<C846060XGy>() { // from class: X.0XMb
                @Override // X.AbstractC846040XGw
                public final void LIZ(C0XGA c0xga) {
                    C846060XGy c846060XGy = (C846060XGy) c0xga;
                    C847380XMa c847380XMa = new C847380XMa(c846060XGy.LIZLLL, c846060XGy.LJ, c846060XGy.LJFF, c846060XGy.LJI, c846060XGy.LJIILJJIL);
                    InterfaceC847590XMv interfaceC847590XMv2 = interfaceC847590XMv;
                    if (interfaceC847590XMv2 != null) {
                        if (c846060XGy.LIZIZ) {
                            interfaceC847590XMv2.LIZ(c847380XMa);
                        } else {
                            interfaceC847590XMv2.LIZIZ(c847380XMa);
                        }
                    }
                }
            });
            if (zLJI2) {
                MethodIDManager.LJ();
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
