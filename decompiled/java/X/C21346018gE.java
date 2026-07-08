package X;

import Y.ARunnableS34S1200000_32;
import Y.ARunnableS65S0300000_32;
import Y.ARunnableS89S0200000_20;
import com.bytedance.amg.minigameruntime.api.IClientAdapterService;
import com.bytedance.amg.minigameruntime.api.JsEngineType;
import com.bytedance.amg.minigameruntime.common.platform_misc.JSBridgeCenterWrap;
import com.bytedance.amg.minigameruntime.common.platform_misc.JSBridgePublicJSMessageWrap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.JSModuleManager;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.worker.JsWorker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18gE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21346018gE implements InterfaceC1525090pn1 {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final C1304160k2g LIZ;
    public volatile JsWorker LJ;
    public volatile JSModuleManager LJFF;
    public final ConcurrentHashMap<String, AbstractC1304150k2f> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Function2<JSONObject, Integer, byte[]>> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C21346218gG> LIZLLL = new ConcurrentHashMap<>();
    public final Object LJI = new Object();
    public final AtomicBoolean LJII = new AtomicBoolean(false);

    @Override // X.InterfaceC1304090k2Z
    public final synchronized void onExit() {
        this.LJII.set(true);
        JsWorker jsWorker = this.LJ;
        this.LJ = null;
        if (jsWorker != null) {
            jsWorker.terminate();
        }
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onPause() {
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onResume() {
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onStart() {
        this.LJFF = new JSModuleManager(this.LIZ.LIZ());
        JSModuleManager jSModuleManager = this.LJFF;
        if (jSModuleManager != null) {
            jSModuleManager.LIZIZ("ttJSCore", JSBridgeCenterWrap.class, new C1531600pxW(this));
        }
        if (!JsWorker.isIsInitialised()) {
            JsWorker.initialize();
        }
        JsWorker.EngineType engineType = JsWorker.EngineType.V8;
        if (this.LIZ.LJII == JsEngineType.QUICKJS) {
            engineType = JsWorker.EngineType.QUICKJS;
        }
        C21320818cA c21320818cA = new C21320818cA();
        c21320818cA.LJFF = this.LJFF;
        c21320818cA.LIZIZ = "biz_minis";
        c21320818cA.LIZ = engineType;
        c21320818cA.LJ = true;
        c21320818cA.LIZJ = null;
        c21320818cA.LIZLLL = this.LIZ.LJI;
        c21320818cA.LJI = true;
        this.LJ = new JsWorker(new C21320918cB(c21320818cA));
        JsWorker jsWorker = this.LJ;
        if (jsWorker != null) {
            jsWorker.setupLoader("napi");
        }
        JsWorker jsWorker2 = this.LJ;
        if (jsWorker2 != null) {
            jsWorker2.setOnErrorCallback(new InterfaceC21345618gA() { // from class: X.18gH
                @Override // X.InterfaceC21345618gA
                public final void LIZ(String str) {
                }
            });
        }
        JsWorker jsWorker3 = this.LJ;
        if (jsWorker3 != null) {
            jsWorker3.evaluateJavaScript("globalThis.ttJSCore = NativeModules.get(\"ttJSCore\");", "AmgMiniGameCommon.js");
        }
        this.LJII.set(false);
    }

    public C21346018gE(C1304160k2g c1304160k2g) {
        this.LIZ = c1304160k2g;
    }

    @Override // X.InterfaceC1525090pn1
    public final void LJIILIIL(C1304430k37 c1304430k37) {
        this.LIZIZ.put(c1304430k37.LIZ, c1304430k37);
    }

    public final synchronized void LJLIIIL(Function0<Unit> function0) {
        if (this.LJII.get()) {
            return;
        }
        JsWorker jsWorker = this.LJ;
        if (jsWorker != null) {
            jsWorker.postOnJSRunner(new ARunnableS89S0200000_20(function0, this, 1));
        }
    }

    public static JavaOnlyMap LJJZZIII(JSONObject jSONObject, Map map) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("__msg__", jSONObject.toString());
        if (map != null && !map.isEmpty()) {
            JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
            for (Map.Entry entry : map.entrySet()) {
                javaOnlyMap2.putByteArray((String) entry.getKey(), (byte[]) entry.getValue());
            }
            javaOnlyMap.putMap("__buffers__", javaOnlyMap2);
        }
        return javaOnlyMap;
    }

    @Override // X.InterfaceC1525090pn1
    public final synchronized void LJJIII(Number number, C2220181Buy c2220181Buy) {
        LJLI(number, c2220181Buy.LIZ(), c2220181Buy.LIZ.LIZLLL);
    }

    @Override // X.InterfaceC1525090pn1
    public final synchronized void LJJLIIJ(Number number, C2220181Buy c2220181Buy) {
        LJL(number, c2220181Buy.LIZ());
    }

    @Override // X.InterfaceC1525090pn1
    public final void LJJLL(JSONObject jSONObject, Map map) {
        if (this.LIZ.LJIIIIZZ.emitEventLockFree) {
            LJJZZI(jSONObject, map);
        } else {
            synchronized (this) {
                LJJZZI(jSONObject, map);
            }
        }
    }

    public final void LJJZ(final String str, JSONObject jSONObject) {
        Object obj = jSONObject;
        if (this.LJII.get()) {
            return;
        }
        if (jSONObject == null) {
            obj = "";
        }
        final String string = obj.toString();
        IClientAdapterService iClientAdapterServiceLIZIZ = this.LIZ.LIZIZ();
        if (iClientAdapterServiceLIZIZ != null && iClientAdapterServiceLIZIZ.isRemoteDebugMode()) {
            IClientAdapterService iClientAdapterServiceLIZIZ2 = this.LIZ.LIZIZ();
            if (iClientAdapterServiceLIZIZ2 != null) {
                iClientAdapterServiceLIZIZ2.emitRemoteJSEvent(str, string);
                return;
            }
            return;
        }
        final JsWorker jsWorker = this.LJ;
        if (jsWorker == null || this.LJII.get()) {
            return;
        }
        jsWorker.postOnJSRunner(new Runnable() { // from class: X.18gF
            @Override // java.lang.Runnable
            public final void run() {
                JsWorker jsWorker2 = jsWorker;
                String str2 = str;
                String str3 = string;
                C1C7U.LIZ("JSBPlatformMisc@2226.emitJSAPIEventInternal$1L");
                JSBridgePublicJSMessageWrap jSBridgePublicJSMessageWrap = (JSBridgePublicJSMessageWrap) jsWorker2.getJavaScriptFunction(JSBridgePublicJSMessageWrap.class);
                if (jSBridgePublicJSMessageWrap != null) {
                    jSBridgePublicJSMessageWrap.subscribeHandler(str2, str3);
                }
                C1C7U.LIZIZ("JSBPlatformMisc@2226.emitJSAPIEventInternal$1L");
            }
        });
    }

    public final void LJJZZI(JSONObject jSONObject, Map map) {
        boolean z;
        if (map != null && !map.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            emitJSAPIEvent("innerRequestTaskStateChange", jSONObject);
            return;
        }
        if (this.LJII.get()) {
            return;
        }
        String string = jSONObject.toString();
        IClientAdapterService iClientAdapterServiceLIZIZ = this.LIZ.LIZIZ();
        if (iClientAdapterServiceLIZIZ != null && iClientAdapterServiceLIZIZ.isRemoteDebugMode()) {
            IClientAdapterService iClientAdapterServiceLIZIZ2 = this.LIZ.LIZIZ();
            if (iClientAdapterServiceLIZIZ2 != null) {
                iClientAdapterServiceLIZIZ2.emitRemoteJSEvent("innerRequestTaskStateChange", string);
                return;
            }
            return;
        }
        JavaOnlyMap javaOnlyMapLJJZZIII = LJJZZIII(jSONObject, map);
        JsWorker jsWorker = this.LJ;
        if (jsWorker == null || this.LJII.get()) {
            return;
        }
        jsWorker.postOnJSRunner(new ARunnableS34S1200000_32(jsWorker, javaOnlyMapLJJZZIII, 0));
    }

    public final synchronized void LJL(Number number, JSONObject jSONObject) {
        Object obj = jSONObject;
        if (this.LJII.get()) {
            return;
        }
        if (jSONObject == null) {
            obj = "";
        }
        String string = obj.toString();
        IClientAdapterService iClientAdapterServiceLIZIZ = this.LIZ.LIZIZ();
        if (iClientAdapterServiceLIZIZ != null && iClientAdapterServiceLIZIZ.isRemoteDebugMode()) {
            IClientAdapterService iClientAdapterServiceLIZIZ2 = this.LIZ.LIZIZ();
            if (iClientAdapterServiceLIZIZ2 != null) {
                iClientAdapterServiceLIZIZ2.emitRemoteJSCallBack(number, string);
            }
        } else {
            JsWorker jsWorker = this.LJ;
            if (jsWorker != null) {
                jsWorker.postOnJSRunner(new ARunnableS34S1200000_32(number, jsWorker, string, 1));
            }
        }
    }

    public final synchronized JSONObject LJLIL(int i, JSONObject jSONObject) {
        if (!jSONObject.has("name")) {
            return C2220181Buy.LIZJ.LIZ();
        }
        AbstractC1304150k2f abstractC1304150k2f = this.LIZIZ.get(jSONObject.optString("name"));
        if (abstractC1304150k2f != null) {
            return abstractC1304150k2f.LIZ(i, jSONObject);
        }
        return C2220181Buy.LIZJ.LIZ();
    }

    @Override // X.InterfaceC1525090pn1
    public final void emitJSAPIEvent(String str, JSONObject jSONObject) {
        if (this.LIZ.LJIIIIZZ.emitEventLockFree) {
            LJJZ(str, jSONObject);
        } else {
            synchronized (this) {
                LJJZ(str, jSONObject);
            }
        }
    }

    public final synchronized void LJLI(Number number, JSONObject jSONObject, Map<String, byte[]> map) {
        if (this.LJII.get()) {
            return;
        }
        String string = jSONObject.toString();
        IClientAdapterService iClientAdapterServiceLIZIZ = this.LIZ.LIZIZ();
        if (iClientAdapterServiceLIZIZ != null && iClientAdapterServiceLIZIZ.isRemoteDebugMode()) {
            IClientAdapterService iClientAdapterServiceLIZIZ2 = this.LIZ.LIZIZ();
            if (iClientAdapterServiceLIZIZ2 != null) {
                iClientAdapterServiceLIZIZ2.emitRemoteJSCallBack(number, string);
            }
        } else {
            JavaOnlyMap javaOnlyMapLJJZZIII = LJJZZIII(jSONObject, map);
            JsWorker jsWorker = this.LJ;
            if (jsWorker != null) {
                jsWorker.postOnJSRunner(new ARunnableS65S0300000_32(jsWorker, number, javaOnlyMapLJJZZIII, 0));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String LJLIIL(int r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.LJII     // Catch: java.lang.Throwable -> L60
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto Ld
            java.lang.String r0 = ""
            monitor-exit(r2)
            return r0
        Ld:
            if (r5 == 0) goto L25
            java.lang.String r0 = ""
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)     // Catch: org.json.JSONException -> L1d java.lang.Throwable -> L60
            if (r0 != 0) goto L25
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1d java.lang.Throwable -> L60
            r1.<init>(r5)     // Catch: org.json.JSONException -> L1d java.lang.Throwable -> L60
            goto L26
        L1d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = ""
            monitor-exit(r2)
            return r0
        L25:
            r1 = 0
        L26:
            if (r1 != 0) goto L2c
            java.lang.String r0 = ""
            monitor-exit(r2)
            return r0
        L2c:
            java.lang.String r0 = "getProperty"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L3e
            org.json.JSONObject r0 = r2.LJLIL(r3, r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = X.C786410Ut5.J3(r0)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r2)
            return r0
        L3e:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0k2f> r0 = r2.LIZIZ     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L60
            X.0k2f r0 = (X.AbstractC1304150k2f) r0     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L52
            org.json.JSONObject r0 = r0.LIZ(r3, r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = X.C786410Ut5.J3(r0)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r2)
            return r0
        L52:
            X.1Buy r0 = X.C2220181Buy.LIZJ     // Catch: java.lang.Throwable -> L60
            X.1Buy r0 = X.C2220181Buy.LIZJ     // Catch: java.lang.Throwable -> L60
            org.json.JSONObject r0 = r0.LIZ()     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = X.C786410Ut5.J3(r0)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r2)
            return r0
        L60:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21346018gE.LJLIIL(int, java.lang.String, java.lang.String):java.lang.String");
    }

    public final void LJLJI(Object obj, String str, InterfaceC1631620sYq interfaceC1631620sYq) {
        this.LIZLLL.put(str, new C21346218gG(obj, interfaceC1631620sYq));
    }

    public final synchronized JavaOnlyMap LJLILLLLZI(int i, String str, String str2, Map map) {
        JSONObject jSONObject;
        boolean z;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.LJII.get()) {
            javaOnlyMap.putString("__msg__", "");
            return javaOnlyMap;
        }
        try {
            if (!Intrinsics.LJFF(str2, "")) {
                jSONObject = new JSONObject(str2);
            } else {
                jSONObject = new JSONObject();
            }
            C21346218gG c21346218gG = this.LIZLLL.get(str);
            if (c21346218gG == null) {
                javaOnlyMap.putString("__msg__", C786410Ut5.J3(C2220181Buy.LIZJ.LIZ()));
                return javaOnlyMap;
            }
            C2220181Buy c2220181BuyInvoke = c21346218gG.LIZIZ.invoke(jSONObject, map, Integer.valueOf(i));
            javaOnlyMap.putString("__msg__", C786410Ut5.J3(c2220181BuyInvoke.LIZ()));
            Map<String, byte[]> map2 = c2220181BuyInvoke.LIZ.LIZLLL;
            if (map2 == null || map2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                for (Map.Entry<String, byte[]> entry : map2.entrySet()) {
                    javaOnlyMap2.putByteArray(entry.getKey(), entry.getValue());
                }
                javaOnlyMap.putMap("__buffers__", javaOnlyMap2);
            }
            return javaOnlyMap;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            javaOnlyMap.putString("__msg__", C786410Ut5.J3(C2220181Buy.LIZLLL.LIZ()));
            return javaOnlyMap;
        }
    }
}
