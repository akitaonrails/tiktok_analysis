package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0q7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1538070q7x {
    public static final C01GW<C1538070q7x> LJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C1538920q9K());
    public static final Map<String, Function0<Object>> LJFF = C2097608Jq.LJIIIIZZ(new Pair("lynxSdkVersion", new C1538840q9C()), new Pair("screenWidth", new C1538310q8L()), new Pair("screenHeight", new C1538320q8M()), new Pair("statusBarHeight", new C1538270q8H()), new Pair("screenOrientation", new C1538390q8T()), new Pair("orientation", new C1538380q8S()), new Pair("deviceModel", new C1538780q96()), new Pair("os", new C1538860q9E()), new Pair("osVersion", new C1538790q97()), new Pair("language", new C1538850q9D()), new Pair("isPad", new C1538350q8P()), new Pair("isLowPowerMode", new C1538360q8Q()), new Pair("accessibleMode", new C1538370q8R()));
    public final C2281408wm<String, Object> LIZ = new C2281408wm<>();
    public final C2281408wm<String, C2281408wm<String, Object>> LIZIZ = new C2281408wm<>();
    public final C2281408wm<String, List<String>> LIZJ = new C2281408wm<>();
    public final C1538150q85 LIZLLL = new InterfaceC1541990qEH() { // from class: X.0q85
        public final C1537480q70 LL = new C1537480q70();

        @Override // X.InterfaceC1541990qEH
        public final void LJIJJLI() {
        }

        @Override // X.InterfaceC1541990qEH
        public final void LLD(boolean z) {
        }

        @Override // X.InterfaceC1541990qEH
        public final boolean T0() {
            return false;
        }

        @Override // X.InterfaceC1541990qEH
        public final void U0(Map<String, ? extends Object> map) {
        }

        @Override // X.InterfaceC1541990qEH
        public final void V0(String str) {
        }

        @Override // X.InterfaceC1541990qEH
        public final void W0(Context context) {
        }

        @Override // X.InterfaceC1541990qEH
        public final boolean Z0() {
            return true;
        }

        @Override // X.InterfaceC1541990qEH
        public final void a1() {
        }

        @Override // X.InterfaceC1541990qEH
        public final void b1(Map<String, ? extends Object> map) {
        }

        @Override // X.InterfaceC1541990qEH
        public final void c1(String str, Map<String, ? extends Object> map) {
        }

        @Override // X.InterfaceC1541990qEH
        public final void d1(String str) {
        }

        @Override // X.InterfaceC1541990qEH
        public final View e1() {
            return null;
        }

        @Override // X.InterfaceC1541990qEH
        public final void f1(SparkSchemaParam sparkSchemaParam) {
        }

        @Override // X.InterfaceC1541990qEH
        public final Object getAndRemoveForestResponse() {
            return null;
        }

        @Override // X.InterfaceC1541990qEH
        public final Map<String, Object> getGlobalProps() {
            return null;
        }

        @Override // X.InterfaceC1541990qEH
        public final String getSchema() {
            return null;
        }

        @Override // X.InterfaceC1541990qEH
        public final void load() {
        }

        @Override // X.InterfaceC1541990qEH
        public final void load(String str) {
        }

        @Override // X.InterfaceC1541990qEH
        public final void onHide() {
        }

        @Override // X.InterfaceC1541990qEH
        public final void onShow() {
        }

        @Override // X.InterfaceC1541990qEH
        public final void reload() {
        }

        @Override // X.InterfaceC1541990qEH
        public final void updateData(Map<String, ? extends Object> map) {
        }

        @Override // X.InterfaceC1541990qEH
        public final C1537480q70 getHybridContext() {
            return this.LL;
        }

        @Override // X.InterfaceC1541990qEH
        public final void LIZ(String str, JSONObject jSONObject) {
            C1538110q81.LIZIZ(this, str, jSONObject);
        }

        @Override // X.InterfaceC1541990qEH
        @InterfaceC1294060jmO
        public final void X0(String str, List<? extends Object> list) {
            C1538110q81.LIZ(this, str, list);
        }

        @Override // X.InterfaceC1541990qEH
        public final void Y0(String str, Map<String, ? extends Object> map) {
            C1538110q81.LIZJ(this, str, map);
        }
    };

    public final void LJFF() {
        Function0<Object> function0;
        Object objInvoke;
        for (Object obj : LJFF.keySet()) {
            if (this.LIZ.get(obj) == null && (function0 = LJFF.get(obj)) != null && (objInvoke = function0.invoke()) != null) {
                this.LIZ.put((String) obj, objInvoke);
            }
        }
    }

    public final C2281408wm LIZ(String str) {
        C2281408wm<String, Object> c2281408wm = this.LIZIZ.get(str);
        if (c2281408wm == null) {
            C2281408wm<String, Object> c2281408wm2 = new C2281408wm<>();
            this.LIZIZ.put(str, c2281408wm2);
            return c2281408wm2;
        }
        return c2281408wm;
    }

    public final Map<String, Object> LIZIZ(String str) {
        Map mapLJIIL = C2097608Jq.LJIIL(this.LIZ, LIZ(str));
        List<String> list = this.LIZJ.get(str);
        if (list != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) mapLJIIL).entrySet()) {
                if (!list.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return new LinkedHashMap(mapLJIIL);
    }

    public final void LIZLLL(String str) {
        Object aBParamsValue;
        String str2 = C08RQ.LIZJ(str).get("ab_params");
        if (str2 != null) {
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
            if (c1538050q7v != null && (aBParamsValue = c1538050q7v.getABParamsValue(str2)) != null) {
                LJ(str, C2097908Jt.LIZJ(new Pair("abParams", aBParamsValue)));
            }
        }
    }

    public final void LJII(Context context) {
        HashMap<String, Object> stableProps;
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
        if (c1538050q7v != null) {
            this.LIZ.putAll(c1538050q7v);
        }
        C1538050q7v c1538050q7v2 = C1161970gLL.LIZIZ().LIZLLL;
        if (c1538050q7v2 != null && (stableProps = c1538050q7v2.getStableProps(context)) != null) {
            this.LIZ.putAll(stableProps);
        }
        LJFF();
    }

    public final void LIZJ(Context context, C1537480q70 c1537480q70) {
        HashMap unstableProps$default;
        HashMap<String, Object> stableProps;
        String str = c1537480q70.containerId;
        Iterator<T> it2 = LJFF.keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (this.LIZ.get(it2.next()) == null) {
                C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
                C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
                if (c1538050q7v != null) {
                    this.LIZ.putAll(c1538050q7v);
                }
                C1538050q7v c1538050q7v2 = C1161970gLL.LIZIZ().LIZLLL;
                if (c1538050q7v2 != null && (stableProps = c1538050q7v2.getStableProps(context)) != null) {
                    this.LIZ.putAll(stableProps);
                }
                LJFF();
            }
        }
        C01GW<C1537410q6t> c01gw2 = C1537410q6t.LJIIIZ;
        C1538050q7v c1538050q7v3 = C1161970gLL.LIZIZ().LIZLLL;
        if (c1538050q7v3 != null && (unstableProps$default = C1538050q7v.getUnstableProps$default(c1538050q7v3, context, c1537480q70, false, 4, null)) != null) {
            LIZ(str).putAll(unstableProps$default);
        }
        C1537510q73 c1537510q73 = c1537480q70.runtimeInfo;
        if (c1537510q73.size() > 0) {
            LIZ(str).putAll(c1537510q73);
        }
        LJI(context, c1537480q70);
    }

    public final void LJ(String str, Map<String, ? extends Object> map) {
        LIZ(str).putAll(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ConcurrentHashMap LJI(Context context, C1537480q70 c1537480q70) {
        Uri uriLIZ;
        long jCurrentTimeMillis;
        Long l;
        String debugGlobalProps;
        HybridSchemaParam hybridSchemaParamLIZJ;
        HybridSchemaParam hybridSchemaParamLIZJ2;
        boolean zLJIIJ;
        String str;
        Long l2;
        HybridSchemaParam hybridSchemaParamLIZJ3;
        String preloadSettingsKeys;
        String preloadStorageKeys;
        boolean z;
        Object c098200Yq;
        LinkedHashMap linkedHashMap;
        boolean z2;
        InterfaceC1538960q9O nativeStorageVisitor;
        InterfaceC1870830ymf interfaceC1870830ymfLIZ;
        Object objLJIIIZ;
        HybridSchemaParam hybridSchemaParamLIZJ4;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C2281408wm c2281408wmLIZ = LIZ(c1537480q70.containerId);
        String str2 = "";
        boolean z3 = false;
        String debugGlobalProps2 = null;
        if (context != null) {
            InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
            if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ4 = interfaceC1531560pxS.LIZJ()) != null) {
                preloadStorageKeys = hybridSchemaParamLIZJ4.getPreloadStorageKeys();
            } else {
                preloadStorageKeys = null;
            }
            if (preloadStorageKeys != null && preloadStorageKeys.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    c098200Yq = a0.LJJLIIIJILLIZJL(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(URLDecoder.decode(preloadStorageKeys, "UTF-8"), e3.e, "", false), e3.f, "", false), " ", "", false), new String[]{","}, 0, 6);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                List<String> list = (List) c098200Yq;
                linkedHashMap = new LinkedHashMap();
                if (list != null && (!list.isEmpty())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    for (String str3 : list) {
                        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
                        C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
                        if (c1538050q7v != null && (nativeStorageVisitor = c1538050q7v.getNativeStorageVisitor()) != null && (interfaceC1870830ymfLIZ = nativeStorageVisitor.LIZ(context)) != null && (objLJIIIZ = interfaceC1870830ymfLIZ.LJIIIZ("", str3)) != null) {
                            linkedHashMap.put(str3, objLJIIIZ);
                        }
                    }
                }
            }
            concurrentHashMap.put("preloadStorageValues", linkedHashMap);
        }
        C01GW<C1537410q6t> c01gw2 = C1537410q6t.LJIIIZ;
        C1538050q7v c1538050q7v2 = C1161970gLL.LIZIZ().LIZLLL;
        if (c1538050q7v2 != null) {
            C1538150q85 c1538150q85 = this.LIZLLL;
            InterfaceC1531560pxS interfaceC1531560pxS2 = c1537480q70.hybridParams;
            if (interfaceC1531560pxS2 != null && (hybridSchemaParamLIZJ3 = interfaceC1531560pxS2.LIZJ()) != null && (preloadSettingsKeys = hybridSchemaParamLIZJ3.getPreloadSettingsKeys()) != null) {
                str2 = preloadSettingsKeys;
            }
            HashMap<String, Object> preloadSettingKeys = c1538050q7v2.getPreloadSettingKeys(c1538150q85, str2);
            if (preloadSettingKeys != null) {
                concurrentHashMap.putAll(preloadSettingKeys);
            }
        }
        concurrentHashMap.put("containerID", c1537480q70.containerId);
        InterfaceC1531560pxS interfaceC1531560pxS3 = c1537480q70.hybridParams;
        if (interfaceC1531560pxS3 != null) {
            uriLIZ = interfaceC1531560pxS3.LIZ();
        } else {
            uriLIZ = null;
        }
        concurrentHashMap.put("originUrl", String.valueOf(uriLIZ));
        concurrentHashMap.put("templateResData", c1537480q70.templateResData);
        Map<String, String> mapLIZJ = C08RQ.LIZJ(c1537480q70.containerId);
        C1537810q7X c1537810q7X = (C1537810q7X) c1537480q70.LJFF(C1537810q7X.class);
        if (c1537810q7X != null && (l2 = c1537810q7X.LIZ) != null) {
            jCurrentTimeMillis = l2.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        mapLIZJ.put("containerInitTime", String.valueOf(jCurrentTimeMillis));
        concurrentHashMap.put("queryItems", mapLIZJ);
        C1537810q7X c1537810q7X2 = (C1537810q7X) c1537480q70.LJFF(C1537810q7X.class);
        if (c1537810q7X2 != null) {
            l = c1537810q7X2.LIZ;
        } else {
            l = null;
        }
        concurrentHashMap.put("containerInitTime", String.valueOf(l));
        C1538590q8n c1538590q8n = c1537480q70.liteLynxConfig;
        if (c1538590q8n != null && c1538590q8n.LIZ) {
            z3 = true;
        }
        if (!z3) {
            if (context != null) {
                C1546210qL5.LIZ.getClass();
                zLJIIJ = C1546210qL5.LJIIJ(context);
            } else {
                zLJIIJ = 1;
            }
            if (zLJIIJ != 0) {
                str = "Portrait";
            } else {
                str = "Landscape";
            }
            concurrentHashMap.put("screenOrientation", str);
            concurrentHashMap.put("orientation", Integer.valueOf(!zLJIIJ));
        }
        if (C1161970gLL.LIZIZ().LIZ) {
            InterfaceC1531560pxS interfaceC1531560pxS4 = c1537480q70.hybridParams;
            if (interfaceC1531560pxS4 != null && (hybridSchemaParamLIZJ2 = interfaceC1531560pxS4.LIZJ()) != null) {
                debugGlobalProps = hybridSchemaParamLIZJ2.getDebugGlobalProps();
            } else {
                debugGlobalProps = null;
            }
            if (!TextUtils.isEmpty(debugGlobalProps)) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                InterfaceC1531560pxS interfaceC1531560pxS5 = c1537480q70.hybridParams;
                if (interfaceC1531560pxS5 != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS5.LIZJ()) != null) {
                    debugGlobalProps2 = hybridSchemaParamLIZJ.getDebugGlobalProps();
                }
                for (Map.Entry entry : ((Map) C1058250de3.LIZ(debugGlobalProps2, HashMap.class)).entrySet()) {
                    linkedHashMap2.put(entry.getKey().toString(), entry.getValue());
                }
                concurrentHashMap.putAll(linkedHashMap2);
            }
        }
        c2281408wmLIZ.putAll(concurrentHashMap);
        return concurrentHashMap;
    }
}
