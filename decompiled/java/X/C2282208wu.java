package X;

import android.net.Uri;
import android.util.LruCache;
import com.bytedance.hybrid.spark.roma.IRomaOfflineService;
import com.bytedance.hybrid.spark.roma.RomaGlobalConfig;
import com.bytedance.hybrid.spark.roma.config.ShortLinkConfig;
import com.bytedance.hybrid.spark.roma.internal.IDebugService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08wu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2282208wu {
    public static Long LIZIZ;
    public static final C2282208wu LIZ = new C2282208wu();
    public static final LruCache<String, InterfaceC1546060qKq> LIZJ = new LruCache<>(20);

    public static final void LJ(C2282508wx c2282508wx) {
        C2282708wz c2282708wz = c2282508wx.LIZLLL;
        if (c2282708wz == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", c2282708wz.getType().getValue());
        String message = c2282708wz.getMessage();
        if (message == null) {
            message = "";
        }
        jSONObject.put("detail", message);
        jSONObject.put("page_name", c2282508wx.LIZIZ);
        jSONObject.put("short_link", c2282508wx.LIZ);
        jSONObject.put("long_link", c2282508wx.LIZJ);
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onError: ");
        sbLIZ.append(jSONObject);
        c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "RomaSDK");
        C1550300qRg.LIZIZ.LJII("roma_sdk_error", jSONObject);
        IRomaOfflineService.LIZ.getClass();
        IRomaOfflineService value = C2282808x0.LIZIZ.getValue();
        if (value != null) {
            C1924607gK.LIZ.getClass();
            Map<String, InterfaceC2217451BqZ<InterfaceC1921807fs>> map = C1924607gK.LIZIZ;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, InterfaceC2217451BqZ<InterfaceC1921807fs>> entry : map.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), ((Function0) entry.getValue()).invoke()));
            }
            C2097608Jq.LJIILLIIL(arrayList);
            C786410Ut5.J3(jSONObject);
            value.LIZ();
        }
    }

    public static Map LJIIIIZZ(Uri uri) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : UriProtector.getQueryParameterNames(uri)) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            linkedHashMap.put(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        return linkedHashMap;
    }

    public static Uri LIZ(Uri uri, Map map) {
        Map mapLJIIL = C2097608Jq.LJIIL(LJIIIIZZ(uri), map);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (Map.Entry entry : ((LinkedHashMap) mapLJIIL).entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build();
    }

    public static final <T> T LIZLLL(C2282508wx c2282508wx, Function0<? extends T> function0) throws JSONException {
        T tInvoke;
        C2282708wz c2282708wz;
        try {
            tInvoke = function0.invoke();
            C189200o6.m2constructorimpl(tInvoke);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            tInvoke = (T) new C098200Yq(th);
            C189200o6.m2constructorimpl(tInvoke);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(tInvoke);
        if (thM5exceptionOrNullimpl != null) {
            if (thM5exceptionOrNullimpl instanceof C2282708wz) {
                c2282708wz = (C2282708wz) thM5exceptionOrNullimpl;
            } else {
                EnumC2282608wy enumC2282608wy = EnumC2282608wy.UNKNOWN;
                String message = thM5exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                c2282708wz = new C2282708wz(enumC2282608wy, message);
            }
            c2282508wx.LIZLLL = c2282708wz;
            LJ(c2282508wx);
            LJFF(c2282508wx, false);
        }
        if (C189200o6.m7isFailureimpl(tInvoke)) {
            return null;
        }
        return tInvoke;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void LJFF(C2282508wx c2282508wx, boolean z) throws JSONException {
        String str;
        Integer numValueOf;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_name", c2282508wx.LIZIZ);
        jSONObject.put("short_link", c2282508wx.LIZ);
        jSONObject.put("long_link", c2282508wx.LIZJ);
        jSONObject.put("is_success", z);
        C1550300qRg c1550300qRg = C1550300qRg.LIZIZ;
        Long lLJI = c1550300qRg.LJI();
        if (lLJI != null) {
            long jLongValue = lLJI.longValue();
            jSONObject.put("boot_time", jLongValue);
            Long l = LIZIZ;
            if (l == null) {
                jSONObject.put("last_call", -1);
            } else {
                jSONObject.put("last_call", jLongValue - l.longValue());
            }
            LIZIZ = Long.valueOf(jLongValue);
        }
        C2282708wz c2282708wz = c2282508wx.LIZLLL;
        if (c2282708wz != null) {
            jSONObject.put("error_type", c2282708wz.getType().getValue());
            String message = c2282708wz.getMessage();
            if (message == null) {
                message = "";
            }
            jSONObject.put("error_detail", message);
        }
        if (c2282508wx.LJIIJJI != 0) {
            jSONObject.put("duration", System.currentTimeMillis() - c2282508wx.LJIIJJI);
        }
        long j = c2282508wx.LJIIL;
        if (j != 0) {
            long j2 = c2282508wx.LJIILIIL;
            if (j2 != 0) {
                jSONObject.put("get_config_duration", j2 - j);
            }
        }
        long j3 = c2282508wx.LJIILJJIL;
        if (j3 != 0) {
            long j4 = c2282508wx.LJIILL;
            if (j4 != 0) {
                jSONObject.put("condition_duration", j4 - j3);
            }
        }
        long j5 = c2282508wx.LJIILLIIL;
        if (j5 != 0) {
            long j6 = c2282508wx.LJIIZILJ;
            if (j6 != 0) {
                jSONObject.put("assemble_scheme_duration", j6 - j5);
            }
        }
        int i = 1;
        if (!c2282508wx.LJI.isEmpty()) {
            jSONObject.put("extra_params", new JSONArray((Collection) c2282508wx.LJI).toString());
        }
        if (!c2282508wx.LJII.isEmpty()) {
            jSONObject.put("extra_url_params", new JSONArray((Collection) c2282508wx.LJII).toString());
        }
        if (!c2282508wx.LJIIIIZZ.isEmpty()) {
            jSONObject.put("whitelisted_params", new JSONArray((Collection) c2282508wx.LJIIIIZZ).toString());
        }
        if (!c2282508wx.LJIIIZ.isEmpty()) {
            jSONObject.put("short_link_query_param_value_lengths", C786410Ut5.J3(new JSONObject(c2282508wx.LJIIIZ)));
        }
        if (!c2282508wx.LJIIJ.isEmpty()) {
            jSONObject.put("filled_slot_param_value_lengths", C786410Ut5.J3(new JSONObject(c2282508wx.LJIIJ)));
        }
        ShortLinkConfig shortLinkConfig = c2282508wx.LJFF;
        String str2 = null;
        if (shortLinkConfig != null) {
            str2 = shortLinkConfig.LIZ;
        }
        if (str2 != null && str2.length() != 0) {
            jSONObject.put("source", str2);
        }
        ShortLinkConfig shortLinkConfig2 = c2282508wx.LJFF;
        if (shortLinkConfig2 != null && (numValueOf = Integer.valueOf(shortLinkConfig2.editVersion)) != null && numValueOf.intValue() != 0) {
            jSONObject.put("edit_version", numValueOf.intValue());
            ShortLinkConfig shortLinkConfig3 = c2282508wx.LJFF;
            if (shortLinkConfig3 != null) {
                i = shortLinkConfig3.variantVersion;
            }
            jSONObject.put("variant_version", i);
        }
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try open roma short link, detail=");
        sbLIZ.append(jSONObject);
        c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.I, "RomaSDK");
        c1550300qRg.LJII("roma_sdk_pv", jSONObject);
        ShortLinkConfig shortLinkConfig4 = c2282508wx.LJFF;
        if (shortLinkConfig4 == null || (str = shortLinkConfig4.LIZ) == null) {
            str = "";
        }
        if (!u.LJJIIJZLJL(str, "ppe", false) && !u.LJJIIJZLJL(str, "boe", false)) {
            jSONObject.put("env_type", "");
            jSONObject.put("env_channel", "");
        } else {
            jSONObject.put("env_type", c1550300qRg.LJIIL().name());
            jSONObject.put("env_channel", str);
        }
        try {
            IDebugService iDebugService = (IDebugService) ServiceManager.get().getService(IDebugService.class);
            if (iDebugService != null) {
                String.valueOf(c2282508wx.hashCode());
                iDebugService.LIZ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static Map LJII(Map map, Map map2) {
        if (map == null) {
            map = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), Integer.valueOf(((String) entry2.getValue()).length()));
        }
        return linkedHashMap2;
    }

    public static void LJIIIZ(Map map, Map map2) throws C2282708wz {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map2.entrySet()) {
            if (((ShortLinkConfig.ParamsDesc) entry.getValue()).required == 1 && !map.containsKey(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            return;
        }
        EnumC2282608wy enumC2282608wy = EnumC2282608wy.PARAMS;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Missing required params: ");
        sbLIZ.append(C13LP.LJJLIIIJ(linkedHashMap.keySet(), ", ", null, null, 0, null, null, 62));
        throw new C2282708wz(enumC2282608wy, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final String LJI(boolean z, String str, C2282508wx c2282508wx) {
        boolean z2;
        Uri.Builder builderBuildUpon;
        Object string;
        Object obj = null;
        if (z) {
            string = null;
        } else {
            try {
                C1550300qRg.LIZIZ.getClass();
                RomaGlobalConfig romaGlobalConfigLIZIZ = C1550300qRg.LIZIZ();
                String str2 = romaGlobalConfigLIZIZ.fallbackScheme;
                if (str2 != null && !a0.LJJJIL(str2)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    builderBuildUpon = UriProtector.parse(str).buildUpon();
                } else {
                    builderBuildUpon = UriProtector.parse(romaGlobalConfigLIZIZ.fallbackScheme).buildUpon();
                    builderBuildUpon.appendQueryParameter("roma_short_link", str);
                }
                builderBuildUpon.appendQueryParameter("spark_page_session", String.valueOf(c2282508wx.hashCode()));
                string = builderBuildUpon.build().toString();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                string = new C098200Yq(th);
                C189200o6.m2constructorimpl(string);
            }
        }
        C189200o6.m2constructorimpl(string);
        if (!C189200o6.m7isFailureimpl(string)) {
            obj = string;
        }
        return (String) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        return r6.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f5, code lost:
    
        throw new X.C2282708wz(X.EnumC2282608wy.SYNTAX, "Invalid scheme template!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r10, java.util.Map r11, java.util.Map r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2282208wu.LIZIZ(java.lang.String, java.util.Map, java.util.Map, boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(java.lang.String r17, boolean r18, boolean r19, java.util.Map r20, java.lang.String r21, com.bytedance.hybrid.spark.roma.config.ShortLinkConfig r22) {
        /*
            Method dump skipped, instruction units count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2282208wu.LIZJ(java.lang.String, boolean, boolean, java.util.Map, java.lang.String, com.bytedance.hybrid.spark.roma.config.ShortLinkConfig):java.lang.String");
    }
}
