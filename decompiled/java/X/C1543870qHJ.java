package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxBackgroundRuntime;
import com.lynx.tasm.LynxView;
import java.util.Map;
import kotlin.jvm.internal.AwS232S0300000_23;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qHJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543870qHJ {
    public final Object LIZ;
    public final C789070UxN LIZIZ = C1543410qGZ.LJIIL;

    public C1543870qHJ(Object obj) {
        this.LIZ = obj;
    }

    public final void LIZ(String str, ReadableMap readableMap, Callback callback, String str2) {
        LynxView lynxView;
        String templateUrl;
        EnumC1544180qHo enumC1544180qHoLIZ;
        C1544610qIV c1544610qIV;
        C1545130qJL c1545130qJL;
        String string;
        String string2;
        if (this.LIZ instanceof C1543190qGD) {
            C1543910qHN c1543910qHN = new C1543910qHN((C1543190qGD) this.LIZ);
            c1543910qHN.LJ = "lynx";
            c1543910qHN.LJFF = str;
            c1543910qHN.LJIIIIZZ = readableMap;
            c1543910qHN.LJIJ = EnumC1543740qH6.Lynx;
            c1543910qHN.LJJIJL = str2;
            C1543190qGD c1543190qGD = (C1543190qGD) this.LIZ;
            InterfaceC1544190qHp interfaceC1544190qHp = c1543190qGD.LJ;
            if ((interfaceC1544190qHp == null || (templateUrl = interfaceC1544190qHp.getUrl()) == null) && ((lynxView = c1543190qGD.LJFF) == null || (templateUrl = lynxView.getTemplateUrl()) == null)) {
                LynxBackgroundRuntime lynxBackgroundRuntime = c1543190qGD.LJI;
                if (lynxBackgroundRuntime != null) {
                    templateUrl = lynxBackgroundRuntime.LJI;
                } else {
                    templateUrl = null;
                }
            }
            if (templateUrl == null) {
                templateUrl = "";
            }
            c1543910qHN.LJI = templateUrl;
            if (readableMap != null) {
                c1543910qHN.LJIIL = readableMap.getLong("__timestamp", System.currentTimeMillis());
                try {
                    ReadableMap map = readableMap.getMap("data");
                    if (map == null || !map.hasKey("_jsb_secure_token")) {
                        string2 = readableMap.getString("_jsb_secure_token", "");
                    } else {
                        string2 = readableMap.getMap("data").getString("_jsb_secure_token", "");
                    }
                    c1543910qHN.LIZIZ = string2;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c1543910qHN.LIZIZ = "";
                    c1543910qHN.LJJIFFI.LIZ(e.getMessage(), "jsb_secure_token_getter_error");
                }
                try {
                    ReadableMap map2 = readableMap.getMap("data");
                    if (map2 == null || !map2.hasKey("threadType")) {
                        string = readableMap.getString("threadType", "");
                    } else {
                        string = readableMap.getMap("data").getString("threadType", "");
                    }
                    if (string.length() > 0) {
                        c1543910qHN.LJIL = C1544290qHz.LIZ(string);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    c1543910qHN.LJJIFFI.LIZ(e2.getMessage(), "jsb_thread_type_getter_error");
                }
                if (c1543910qHN.LJIL == null) {
                    C1543410qGZ c1543410qGZ = ((C1543190qGD) this.LIZ).LIZ;
                    if (c1543410qGZ != null && (c1544610qIV = c1543410qGZ.LJ) != null && (c1545130qJL = (C1545130qJL) c1544610qIV.LIZIZ(C1545130qJL.class)) != null) {
                        enumC1544180qHoLIZ = c1545130qJL.LIZ(c1543910qHN.LJFF);
                    } else {
                        enumC1544180qHoLIZ = null;
                    }
                    c1543910qHN.LJIL = enumC1544180qHoLIZ;
                }
            }
            c1543910qHN.LJJIZ = ((C1543190qGD) this.LIZ).LJIILL;
            if (((C1543190qGD) this.LIZ).LJIIL.LIZLLL) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Bridge is released. bridgeName = ");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
                LIZIZ(C1543260qGK.LIZ(-13, "Bridge is released, please check it with container's owner.", null), c1543910qHN, (C1543190qGD) this.LIZ, false, callback);
                return;
            }
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Bridge is alive. bridgeName = ");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            InterfaceC1297560js2 interfaceC1297560js22 = C1543410qGZ.LJIIIZ;
            C1543190qGD c1543190qGD2 = (C1543190qGD) this.LIZ;
            c1543190qGD2.LIZLLL.LJ(c1543190qGD2, c1543910qHN);
            this.LIZIZ.LIZ(c1543910qHN, new AwS232S0300000_23(this, c1543910qHN, callback, 12));
        }
    }

    public static void LIZIZ(C1543440qGc c1543440qGc, C1543910qHN c1543910qHN, C1543190qGD c1543190qGD, boolean z, Callback callback) {
        JavaOnlyMap javaOnlyMap;
        Boolean bool;
        if (!C1544000qHW.LJIIJ) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBridgeResult,result:");
            sbLIZ.append(c1543440qGc);
            sbLIZ.append(",call:");
            sbLIZ.append(c1543910qHN);
            C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
        }
        if (c1543910qHN != null) {
            c1543190qGD.LIZLLL.LIZIZ(c1543440qGc, c1543910qHN, c1543190qGD);
        }
        try {
            Object obj = c1543440qGc.LIZ;
            if (obj instanceof JavaOnlyMap) {
                javaOnlyMap = (JavaOnlyMap) obj;
            } else if (obj instanceof JSONObject) {
                C1297550js1.LIZ.getClass();
                javaOnlyMap = C1297550js1.LIZIZ((JSONObject) obj);
            } else if (obj instanceof Map) {
                javaOnlyMap = JavaOnlyMap.from((Map) obj);
            } else {
                javaOnlyMap = new JavaOnlyMap();
            }
            if (c1543910qHN != null) {
                bool = c1543910qHN.LIZJ;
            } else {
                bool = null;
            }
            javaOnlyMap.put("_jsb_secure_token_checked", bool);
            if (c1543910qHN != null) {
                c1543910qHN.LJJIJIIJI = javaOnlyMap;
                c1543910qHN.LJJIJIIJIL = z;
                c1543190qGD.LIZLLL.LIZJ(c1543910qHN, c1543440qGc);
            }
            if (callback != null) {
                callback.invoke(javaOnlyMap);
            }
            if (c1543910qHN != null) {
                c1543190qGD.LIZLLL.LIZLLL(c1543190qGD, c1543910qHN);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
