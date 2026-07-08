package X;

import Y.ARunnableS123S0100000_23;
import com.bytedance.android.monitorV2.debug.MonitorDebugTool;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pfj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520570pfj {
    public static final Method LIZ;

    static {
        try {
            LIZ = Class.forName("com.ss.android.common.lib.AppLogNewUtils").getMethod("onEventV3", String.class, JSONObject.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    public static void LIZ(C1520220pfA c1520220pfA, String str) {
        String strOptString;
        JSONObject jSONObjectLIZIZ;
        JSONObject jSONObjectLIZIZ2;
        String str2;
        if (!EnumC1521240pgo.teaReport.not() && Intrinsics.LJFF(c1520220pfA.LIZ, "jsbPv") && c1520220pfA.LJII != null) {
            JSONObject jSONObjectLIZIZ3 = c1520220pfA.LJFF.LIZIZ();
            String strLJIIJ = C1520640pfq.LJIIJ("container_type", jSONObjectLIZIZ3);
            if (Intrinsics.LJFF(strLJIIJ, "lynx")) {
                strOptString = jSONObjectLIZIZ3.optString("lynx_version", null);
            } else if (Intrinsics.LJFF(strLJIIJ, "web")) {
                strOptString = jSONObjectLIZIZ3.optString("web_version", null);
            } else {
                strOptString = null;
            }
            C1491800ovK c1491800ovK = c1520220pfA.LJII;
            if (c1491800ovK != null) {
                jSONObjectLIZIZ = c1491800ovK.LIZIZ();
            } else {
                jSONObjectLIZIZ = null;
            }
            AbstractC1520150pf3 abstractC1520150pf3 = c1520220pfA.LJIILIIL;
            if (abstractC1520150pf3 != null) {
                jSONObjectLIZIZ2 = abstractC1520150pf3.LIZIZ();
            } else {
                jSONObjectLIZIZ2 = null;
            }
            C1520380pfQ.LIZ.getClass();
            HybridSettingInitConfig hybridSettingInitConfigLJ = C1520380pfQ.LIZJ().LJ();
            if (hybridSettingInitConfigLJ == null) {
                str2 = "";
            } else {
                str2 = hybridSettingInitConfigLJ.LIZ;
            }
            String strLJIIIZ = C1520640pfq.LJIIIZ("url", "", jSONObjectLIZIZ3);
            String strLJIIIZ2 = C1520640pfq.LJIIIZ("container_name", "other", jSONObjectLIZIZ);
            String strLJIIIZ3 = C1520640pfq.LJIIIZ("schema", null, jSONObjectLIZIZ);
            String strLJIIIZ4 = C1520640pfq.LJIIIZ("container_version", null, jSONObjectLIZIZ);
            JSONObject jSONObjectLIZJ = C1520640pfq.LIZJ(null, jSONObjectLIZIZ2);
            C1520640pfq.LIZLLL(jSONObjectLIZJ, "url", strLJIIIZ);
            C1520640pfq.LIZLLL(jSONObjectLIZJ, "engine_version", strOptString);
            C1520640pfq.LIZLLL(jSONObjectLIZJ, "engine_type", strLJIIJ);
            C1520640pfq.LIZLLL(jSONObjectLIZJ, "schema", strLJIIIZ3);
            C1520640pfq.LIZLLL(jSONObjectLIZJ, "container_version", strLJIIIZ4);
            C1520640pfq.LIZLLL(jSONObjectLIZJ, "container_name", strLJIIIZ2);
            C1520640pfq.LIZLLL(jSONObjectLIZJ, "bid", str);
            C1520640pfq.LIZLLL(jSONObjectLIZJ, "origin_appid", str2);
            LIZJ("bd_hybrid_monitor_jsb_pv", jSONObjectLIZJ);
            if (!EnumC1521240pgo.eventStream.not()) {
                C824310WVh.LIZIZ(new ARunnableS123S0100000_23(c1520220pfA, 104));
            }
        }
    }

    public static final void LIZJ(String str, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("bid");
        if (strOptString.length() <= 0) {
            strOptString = null;
        }
        if (strOptString == null) {
            strOptString = jSONObject.optString("common_bid");
        }
        C119800cu.LIZJ();
        Set set = (Set) ((LinkedHashMap) C119800cu.LIZLLL).get(str);
        if (set != null && (!(set instanceof Collection) || !set.isEmpty())) {
            Iterator it2 = set.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                int i = -1;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i2 < strOptString.length()) {
                        if (i3 < str2.length() && (str2.charAt(i3) == '?' || str2.charAt(i3) == strOptString.charAt(i2))) {
                            i2++;
                            i3++;
                        } else if (i3 < str2.length() && str2.charAt(i3) == '*') {
                            i4 = i2;
                            i = i3;
                            i3++;
                        } else if (i != -1) {
                            i3 = i + 1;
                            i4++;
                            i2 = i4;
                        }
                    } else {
                        while (i3 < str2.length() && str2.charAt(i3) == '*') {
                            i3++;
                        }
                        if (i3 == str2.length()) {
                            C119800cu.LIZJ();
                            if (C119800cu.LJ) {
                                C1520380pfQ.LIZ.getClass();
                                InterfaceC1514780pWO interfaceC1514780pWO = C1520380pfQ.LJIIIZ;
                                if (interfaceC1514780pWO != null && interfaceC1514780pWO.LIZIZ()) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        }
        Method method = LIZ;
        if (method != null) {
            try {
                if (EnumC1520990pgP.ENABLE_PRIVACY_TO_THIRD_PARTY_URL.isEnabled()) {
                    String strOptString2 = jSONObject.optString("common_engine_type");
                    if (u.LJIJI("web", strOptString2, true) || u.LJIJI("webview", strOptString2, true)) {
                        String strOptString3 = jSONObject.optString("common_url");
                        String strOptString4 = jSONObject.optString("common_bid");
                        if (!a0.LJJJIL(strOptString3)) {
                            C1520380pfQ.LIZ.getClass();
                            if (C1520380pfQ.LJI(strOptString3) && !u.LJIJI("tt_hybrid_commerce", strOptString4, true)) {
                                String strOptString5 = jSONObject.optString("common_schema");
                                C08HX c08hx = C08HX.LIZ;
                                jSONObject.putOpt("common_url", c08hx.LJII(strOptString3));
                                jSONObject.putOpt("common_schema", c08hx.LJII(strOptString5));
                            }
                        }
                    }
                }
                method.invoke(null, str, jSONObject);
                if (MonitorDebugTool.isDebuggable()) {
                    C1520360pfO c1520360pfO = new C1520360pfO(str);
                    c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
                    c1520360pfO.LJ = jSONObject;
                    C1520490pfb.LIZ(c1520360pfO.LIZ());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1520960pgM.LIZIZ(th);
            }
        }
    }

    public static void LIZIZ(C1520220pfA c1520220pfA, String str, boolean z) {
        JSONObject jSONObjectLIZIZ;
        JSONObject jSONObjectLIZIZ2;
        String strOptString;
        String strOptString2;
        String strOptString3;
        String strOptString4;
        String str2;
        if (!EnumC1521240pgo.teaReport.not() && c1520220pfA.LJII != null && Intrinsics.LJFF("navigationStart", c1520220pfA.LIZ)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObjectLIZIZ3 = c1520220pfA.LJFF.LIZIZ();
            C1491800ovK c1491800ovK = c1520220pfA.LJII;
            String strOptString5 = null;
            if (c1491800ovK != null) {
                jSONObjectLIZIZ = c1491800ovK.LIZIZ();
            } else {
                jSONObjectLIZIZ = null;
            }
            AbstractC1520150pf3 abstractC1520150pf3 = c1520220pfA.LJIILIIL;
            if (abstractC1520150pf3 != null) {
                jSONObjectLIZIZ2 = abstractC1520150pf3.LIZIZ();
            } else {
                jSONObjectLIZIZ2 = null;
            }
            String string = JSONObjectProtectorUtils.getString(jSONObjectLIZIZ3, "container_type");
            C1520380pfQ.LIZ.getClass();
            HybridSettingInitConfig hybridSettingInitConfigLJ = C1520380pfQ.LIZJ().LJ();
            if (Intrinsics.LJFF("lynx", string)) {
                strOptString = jSONObjectLIZIZ3.optString("lynx_version", null);
            } else if (Intrinsics.LJFF("web", string)) {
                strOptString = jSONObjectLIZIZ3.optString("web_version", null);
            } else {
                strOptString = null;
            }
            C12868051u.LJI(jSONObject, "url", JSONObjectProtectorUtils.getString(jSONObjectLIZIZ3, "url"));
            C12868051u.LJI(jSONObject, "engine_version", strOptString);
            C12868051u.LJI(jSONObject, "engine_type", string);
            C12868051u.LJI(jSONObject, "native_page", jSONObjectLIZIZ3.optString("native_page", null));
            if (jSONObjectLIZIZ2 != null) {
                strOptString2 = jSONObjectLIZIZ2.optString("native_view", null);
            } else {
                strOptString2 = null;
            }
            C12868051u.LJI(jSONObject, "native_view", strOptString2);
            C12868051u.LJI(jSONObject, "sdk_version", jSONObjectLIZIZ3.optString("sdk_version", null));
            if (jSONObjectLIZIZ != null) {
                strOptString3 = jSONObjectLIZIZ.optString("container_name", "other");
            } else {
                strOptString3 = null;
            }
            C12868051u.LJI(jSONObject, "container_name", strOptString3);
            if (jSONObjectLIZIZ != null) {
                strOptString4 = jSONObjectLIZIZ.optString("schema", null);
            } else {
                strOptString4 = null;
            }
            C12868051u.LJI(jSONObject, "schema", strOptString4);
            if (jSONObjectLIZIZ != null) {
                strOptString5 = jSONObjectLIZIZ.optString("container_version", null);
            }
            C12868051u.LJI(jSONObject, "container_version", strOptString5);
            C12868051u.LJI(jSONObject, "bid", str);
            C12868051u.LJI(jSONObject, "is_hybrid_sample", Integer.valueOf(z ? 1 : 0));
            if (hybridSettingInitConfigLJ != null) {
                str2 = hybridSettingInitConfigLJ.LIZ;
            } else {
                str2 = "";
            }
            C12868051u.LJI(jSONObject, "origin_appid", str2);
            LIZJ("bd_hybrid_monitor_pv", jSONObject);
        }
    }
}
