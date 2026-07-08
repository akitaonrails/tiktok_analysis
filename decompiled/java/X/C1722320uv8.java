package X;

import android.os.Build;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uv8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1722320uv8 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        String strLIZ = null;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        strLIZ = C746250TPb.LIZ((Inet4Address) inetAddressNextElement, CertProviderManagerKt.findCert("bpea-BNPL_IP_address", 1476427778));
                        return strLIZ;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strLIZ;
        }
    }

    public static String LIZLLL() {
        try {
            String property = System.getProperty("http.agent");
            if (property == null) {
                property = "";
            }
            StringBuilder sb = new StringBuilder();
            int length = property.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if (Intrinsics.LJI(cCharAt, 31) <= 0 || Intrinsics.LJI(cCharAt, 127) >= 0) {
                    sb.append(C786410Ut5.j4("\\u%04x", Arrays.copyOf(new Object[]{Character.valueOf(cCharAt)}, 1)));
                } else {
                    sb.append(cCharAt);
                }
            }
            return sb.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            return "";
        }
    }

    public static String LIZIZ() {
        try {
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(Collections.list(((NetworkInterface) it2.next()).getInetAddresses()), arrayList);
            }
            return (String) C09RB.LJIIL(new C08LY(C09RB.LJIIIZ(new C08LY(C09RB.LJIIIZ(new C1939607ik(arrayList), AFwS245S0000000_12.get$arr$(108)), AFwS231S0000000_3.get$arr$(118)), new C020N(6)), new C020N(7)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return "";
        }
    }

    public static JSONObject LIZJ(String str, Map map) {
        Object c098200Yq;
        String methodName;
        String str2;
        boolean z;
        String strLIZ;
        Object obj = null;
        try {
            JSONObject jSONObject = new JSONObject();
            C1723470uwz versionInfo = C1717770unn.LIZJ().getVersionInfo();
            jSONObject.put("device_platform", "android");
            jSONObject.put("os", "android");
            jSONObject.put("device_fingerprint_id", (Object) null);
            jSONObject.put("app_version", versionInfo.LIZ);
            jSONObject.put("gp_device_fingerprint_id", (Object) null);
            String strValueOf = String.valueOf(C1717770unn.LIZJ().getAppId());
            jSONObject.put("app_id", strValueOf);
            jSONObject.put("aid", strValueOf);
            jSONObject.put("app_name", C1717770unn.LIZJ().getAppName());
            jSONObject.put("app_region", C1717770unn.LJIIIIZZ().getRegion());
            String strLIZ2 = C1716300ulQ.LIZ();
            jSONObject.put("did", strLIZ2);
            jSONObject.put("device_id", strLIZ2);
            String currentRegionCode = C1717770unn.LJIIIIZZ().getCurrentRegionCode();
            jSONObject.put("current_region", currentRegionCode);
            jSONObject.put("country_or_region", currentRegionCode);
            jSONObject.put("user_agent", LIZLLL());
            String strLIZIZ = LIZIZ();
            String str3 = "0.0.0.0";
            if (strLIZIZ == null) {
                str2 = "0.0.0.0";
            } else {
                str2 = strLIZIZ;
            }
            jSONObject.put("ip_address", str2);
            if (strLIZIZ != null) {
                str3 = strLIZIZ;
            }
            jSONObject.put("ip", str3);
            jSONObject.put("true_ip", String.valueOf(strLIZIZ));
            String str4 = Build.MODEL;
            jSONObject.put("device_type", str4);
            jSONObject.put("timezone_name", TimeZone.getDefault().getID());
            jSONObject.put("uid", C1717770unn.LIZ().getUid());
            jSONObject.put("channel", C1717770unn.LIZJ().getChannel());
            jSONObject.put("pipo_product_code", str);
            String iid = C1717770unn.LJIIIZ().getIid();
            jSONObject.put("iid", iid);
            jSONObject.put("install_id", iid);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("android");
            sbLIZ.append(Build.VERSION.RELEASE);
            jSONObject.put("os_version", C2188811AlT.LIZIZ(sbLIZ));
            jSONObject.put("screen_height", C12ES.LJIIIIZZ(C1717770unn.LIZJ().getApplicationContext()));
            jSONObject.put("screen_width", C12ES.LJIIJ(C1717770unn.LIZJ().getApplicationContext()));
            jSONObject.put("app_language", C1717770unn.LIZLLL().getAppLanguage());
            jSONObject.put("sys_language", C786410Ut5.t2(Locale.getDefault()));
            jSONObject.put("sys_region", C1717770unn.LJIIIIZZ().getSysRegion());
            jSONObject.put("terminal_country", C1717770unn.LJIIIIZZ().getRegion());
            jSONObject.put("version_name", versionInfo.LIZ);
            jSONObject.put("version_code", String.valueOf(versionInfo.LIZIZ));
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LJ("pipo_riskinfo_locale_option", 0) != 1) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                jSONObject.put("locale", C786410Ut5.t2(Locale.getDefault()));
            } else {
                jSONObject.put("locale", C1717770unn.LIZLLL().getCurrentLocaleStr(C1717770unn.LIZJ().getApplicationContext()));
            }
            jSONObject.put("platform", "android");
            jSONObject.put("carrier_region", C1717770unn.LJIIIIZZ().getSimCountry());
            jSONObject.put("build_board", Build.BOARD);
            String str5 = Build.BRAND;
            jSONObject.put("build_brand", str5);
            jSONObject.put("device_brand", str5);
            jSONObject.put("build_cpu_abi", Build.CPU_ABI);
            jSONObject.put("build_device", Build.DEVICE);
            jSONObject.put("build_manufacturer", Build.MANUFACTURER);
            jSONObject.put("build_model", str4);
            jSONObject.put("build_product", Build.PRODUCT);
            jSONObject.put("is_root", C1717770unn.LIZJ().LJIILLIIL());
            jSONObject.put("uuid", UUID.randomUUID());
            try {
                strLIZ = C20144613rw.LIZ(C1717770unn.LIZJ().getApplicationContext().getContentResolver(), TokenCert.Companion.with("bpea-pipo_riskinfo_android_id"));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                strLIZ = "";
            }
            jSONObject.put("android_id", strLIZ);
            jSONObject.put("priority_region", C1717770unn.LJIIIIZZ().getCurrentRegionCode());
            jSONObject.put("eth_ip", String.valueOf(LIZ()));
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                c098200Yq = th.getMessage();
                if (c098200Yq == null) {
                    StackTraceElement stackTraceElement = th.getStackTrace()[0];
                    if (stackTraceElement != null) {
                        methodName = stackTraceElement.getMethodName();
                    } else {
                        methodName = null;
                    }
                    c098200Yq = String.valueOf(methodName);
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            if (obj == null) {
                obj = "get_exception";
            }
            C1717770unn.LJIIIZ().onEventV3("rd_pipo_on_boarding", C2097608Jq.LJIIIIZZ(new Pair("step", "get_risk_common"), new Pair("error_msg", obj)));
            return new JSONObject();
        }
    }
}
