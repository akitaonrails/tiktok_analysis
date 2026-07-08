package X;

import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.forest.model.GeckoSource;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.lynx.hybrid.ssr.ILynxSSRDebugger;
import com.bytedance.lynx.hybrid.ssr.SSRMeta;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qAO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539580qAO {
    public static HandlerThread LJIJI;
    public final C1537480q70 LIZ;
    public LynxView LIZIZ;
    public IResourceServiceX LIZJ;
    public AbstractC1537870q7d LIZLLL;
    public C1539810qAl LJ;
    public String LJFF;
    public EnumC1539690qAZ LJI;
    public EnumC1539740qAe LJII;
    public final HashMap<String, Long> LJIIIIZZ;
    public final long LJIIIZ;
    public List<? extends InterfaceC1539930qAx> LJIIJ;
    public C1539650qAV LJIIJJI;
    public C09AY LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public byte[] LJIILL;
    public BPEAHandler LJIILLIIL;
    public Map<String, ? extends Object> LJIIZILJ;
    public Map<String, ? extends Object> LJIJ;

    static {
        new C1539630qAT();
    }

    public final void LJII() {
        SSRMeta sSRMeta;
        LynxView lynxView = this.LIZIZ;
        if (lynxView == null) {
            return;
        }
        LynxViewMonitor.Companion.getClass();
        LynxViewMonitor lynxViewMonitor = LynxViewMonitor.INSTANCE;
        lynxViewMonitor.addContext(lynxView, "ssr_mode", Integer.valueOf(this.LJI.getRenderState()));
        lynxViewMonitor.addContext(lynxView, "hydration_from", this.LJII.toString());
        C1539650qAV c1539650qAV = this.LJIIJJI;
        if (c1539650qAV != null) {
            lynxView.removeLynxViewClient(c1539650qAV);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ssr_mode", this.LJI.getRenderState());
        jSONObject.put("hydration_from", this.LJII.toString());
        C1539810qAl c1539810qAl = this.LJ;
        jSONObject.put("hydration_url", (c1539810qAl == null || (sSRMeta = c1539810qAl.LIZIZ) == null) ? null : sSRMeta.hydrateUrl);
        for (Map.Entry<String, Long> entry : this.LJIIIIZZ.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue().longValue());
        }
        C1520200pf8 c1520200pf8 = C1520200pf8.LIZ;
        C1520360pfO c1520360pfO = new C1520360pfO("bd_hybrid_monitor_spark_ssr_tracing");
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
        c1520360pfO.LJIIIIZZ = this.LIZ.containerId;
        C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
        c1520200pf8.getClass();
        C1520200pf8.LIZ(c1520350pfNLIZ);
        this.LJIIJ = C13LP.LJLILLLLZI(new InterfaceC1539930qAx() { // from class: X.0qAq
            @Override // X.InterfaceC1539930qAx
            public final void LIZ(EnumC1539690qAZ enumC1539690qAZ) {
            }
        }, this.LJIIJ);
    }

    public static boolean LIZLLL(Object obj) {
        if (obj != null) {
            if (obj instanceof String) {
                if (!a0.LJJJIL((CharSequence) obj)) {
                    return true;
                }
                return false;
            }
            if (obj instanceof Collection) {
                if (!((Collection) obj).isEmpty()) {
                    return true;
                }
                return false;
            }
            if (!(obj instanceof Map) || !((Map) obj).isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LIZ(Function1<? super C1539910qAv, Unit> function1) {
        C1530570pvr.LIZJ(this.LIZ, new EnumC1537220q6a[]{EnumC1537220q6a.SLSR_FETCH_TEMPLATE_START}, null);
        EnumC1539690qAZ enumC1539690qAZ = EnumC1539690qAZ.DEBUG_SSR_BUNDLE_NULL;
        this.LJI = enumC1539690qAZ;
        C1539810qAl c1539810qAl = this.LJ;
        if (c1539810qAl != null) {
            if (this.LJIILJJIL && this.LJIILL.length != 0) {
                LIZIZ(this.LJIILL, c1539810qAl.LIZLLL, c1539810qAl.LIZ);
                return;
            }
            if (c1539810qAl.LIZIZ.hydrateUrl.length() > 0) {
                String str = c1539810qAl.LIZIZ.hydrateUrl;
                C1539660qAW c1539660qAW = new C1539660qAW(this, c1539810qAl, function1);
                if (this.LIZIZ != null) {
                    ILynxSSRDebugger iLynxSSRDebugger = (ILynxSSRDebugger) PluggableExtentionKt.pluggableSpi$default(ILynxSSRDebugger.class, false, false, false, 14, null);
                    if (iLynxSSRDebugger != null) {
                        iLynxSSRDebugger.LJFF();
                    }
                    ILynxSSRDebugger iLynxSSRDebugger2 = (ILynxSSRDebugger) PluggableExtentionKt.pluggableSpi$default(ILynxSSRDebugger.class, false, false, false, 14, null);
                    if (iLynxSSRDebugger2 != null) {
                        iLynxSSRDebugger2.LIZ();
                    }
                    ILynxSSRDebugger iLynxSSRDebugger3 = (ILynxSSRDebugger) PluggableExtentionKt.pluggableSpi$default(ILynxSSRDebugger.class, false, false, false, 14, null);
                    if (iLynxSSRDebugger3 != null) {
                        iLynxSSRDebugger3.LJIIIZ();
                    }
                    C1533720q0w.LIZ.getClass();
                    C1533510q0b c1533510q0bLIZLLL = C1533720q0w.LIZLLL(str, null, true);
                    if (c1533510q0bLIZLLL == null) {
                        this.LJI = EnumC1539690qAZ.DEBUG_LOAD_CDN_CONTENT;
                        LJ(null, str, c1539660qAW);
                        return;
                    }
                    boolean z = this.LIZ.hybridParams instanceof C1537910q7h;
                    C1539600qAQ c1539600qAQ = new C1539600qAQ(this, str, System.currentTimeMillis(), c1533510q0bLIZLLL, c1539660qAW);
                    IResourceServiceX iResourceServiceX = this.LIZJ;
                    if (iResourceServiceX != null) {
                        RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_SSR_TEMPLATE);
                        requestParams.accessKey = c1533510q0bLIZLLL.LIZ;
                        requestParams.channel = c1533510q0bLIZLLL.LIZIZ;
                        requestParams.bundle = "spark-manifest.json";
                        requestParams.waitGeckoUpdate = false;
                        requestParams.disableCdn = true;
                        requestParams.allowIOOnMainThread = true;
                        requestParams.loadToMemory = true;
                        requestParams.needLocalFile = Boolean.FALSE;
                        iResourceServiceX.fetchResourceAsyncIfNeed("", requestParams, c1539600qAQ);
                    }
                    if (this.LIZJ != null) {
                        return;
                    }
                    this.LJI = EnumC1539690qAZ.DEBUG_RESOURCE_NULL;
                    c1539660qAW.invoke(null, "resource service is null");
                    return;
                }
                return;
            }
            LJI(EnumC1539690qAZ.HYDRATION_FAILED, 225, "Hydration URL is empty when hydration.");
            function1.invoke(new C1539910qAv(EnumC1539700qAa.HYDRATE_FAILED, "hydration url is empty"));
            return;
        }
        this.LJI = enumC1539690qAZ;
        LJI(EnumC1539690qAZ.HYDRATION_FAILED, 225, "SSR bundle is null when hydratation.");
        function1.invoke(new C1539910qAv(EnumC1539700qAa.HYDRATE_FAILED, "ssr bundle is null"));
    }

    public static Map LJFF(Map map, Map map2) {
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : C15442062u.LJIIIZ(map.keySet(), map2.keySet())) {
            Object objLJFF = map.get(obj);
            Object obj2 = map2.get(obj);
            if ((objLJFF instanceof Map) && (obj2 instanceof Map)) {
                objLJFF = LJFF((Map) objLJFF, (Map) obj2);
            } else if (!LIZLLL(objLJFF) && (LIZLLL(obj2) || objLJFF == null)) {
                objLJFF = obj2;
            }
            linkedHashMap.put(obj, objLJFF);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[PHI: r1
      0x0032: PHI (r1v1 android.os.Looper) = (r1v0 android.os.Looper), (r1v3 android.os.Looper) binds: [B:6:0x0009, B:21:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.lang.String r4, kotlin.jvm.functions.Function0<kotlin.Unit> r5) {
        /*
            r3 = this;
            com.lynx.tasm.LynxView r2 = r3.LIZIZ
            if (r2 != 0) goto L5
            return
        L5:
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto L32
            android.os.HandlerThread r0 = X.C1539580qAO.LJIJI
            if (r0 != 0) goto L28
            monitor-enter(r3)
            android.os.HandlerThread r0 = X.C1539580qAO.LJIJI     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L27
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = "spark_ssr_thread"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L21
            X.C1539580qAO.LJIJI = r1     // Catch: java.lang.Throwable -> L21
            r1.start()     // Catch: java.lang.Throwable -> L21
            goto L27
        L21:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r3)
            throw r0
        L27:
            monitor-exit(r3)
        L28:
            android.os.HandlerThread r0 = X.C1539580qAO.LJIJI
            if (r0 == 0) goto L39
            android.os.Looper r1 = X.C786410Ut5.W2(r0)
            if (r1 == 0) goto L39
        L32:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = new com.bytedance.bpea.transmit.delegate.BPEAHandler
            r0.<init>(r1)
            r3.LJIILLIIL = r0
        L39:
            X.0qAU r1 = new X.0qAU
            r1.<init>(r3, r4, r2, r5)
            r0 = 0
            r3.LJIIIZ(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1539580qAO.LJIIIIZZ(java.lang.String, kotlin.jvm.functions.Function0):void");
    }

    public final void LJIIIZ(final Function0 function0, boolean z) {
        Looper looper;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runTask, executeLooper: ");
        BPEAHandler bPEAHandler = this.LJIILLIIL;
        if (bPEAHandler != null) {
            looper = bPEAHandler.getLooper();
        } else {
            looper = null;
        }
        sbLIZ.append(looper);
        sbLIZ.append(", myLooper: ");
        sbLIZ.append(Looper.myLooper());
        C2188811AlT.LIZIZ(sbLIZ);
        BPEAHandler bPEAHandler2 = this.LJIILLIIL;
        if (bPEAHandler2 != null) {
            if (Intrinsics.LJFF(bPEAHandler2.getLooper(), Looper.myLooper()) && !z) {
                function0.invoke();
            } else {
                C786410Ut5.LJJZZIII(bPEAHandler2, new Runnable() { // from class: X.0GUq
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LynxSSRRuntime@978e.sam$java_lang_Runnable$0");
                        try {
                            function0.invoke();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LynxSSRRuntime@978e.sam$java_lang_Runnable$0");
                    }
                });
            }
        }
    }

    public final void LIZIZ(byte[] bArr, TemplateData templateData, String str) {
        ILynxSSRDebugger iLynxSSRDebugger = (ILynxSSRDebugger) PluggableExtentionKt.pluggableSpi$default(ILynxSSRDebugger.class, false, false, false, 14, null);
        if (iLynxSSRDebugger != null) {
            iLynxSSRDebugger.LJII();
        }
        InterfaceC1539510qAH.LIZ.getClass();
        InterfaceC1539510qAH interfaceC1539510qAH = C1535760q4E.LIZIZ;
        if (interfaceC1539510qAH != null && interfaceC1539510qAH.LIZLLL() && !this.LJIILIIL) {
            this.LJIIL = new C1539890qAt(this, bArr, str, templateData);
        } else {
            LJIIIZ(new C1539900qAu(this, bArr, str, templateData), false);
        }
    }

    public final void LIZJ(byte[] bArr, TemplateData templateData, String str) {
        TemplateData templateData2;
        Map<String, Object> mapLJIJI;
        Map<String, Object> map;
        C1537910q7h c1537910q7h;
        C1537910q7h c1537910q7h2;
        LynxView lynxView = this.LIZIZ;
        if (lynxView != null) {
            C1530570pvr.LIZJ(this.LIZ, new EnumC1537220q6a[]{EnumC1537220q6a.SLSR_HYDRATE_START}, null);
            this.LJIIIIZZ.put("hydration_cost", Long.valueOf(System.currentTimeMillis() - this.LJIIIZ));
            InterfaceC1531560pxS interfaceC1531560pxS = this.LIZ.hybridParams;
            if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h2 = (C1537910q7h) interfaceC1531560pxS) != null) {
                templateData2 = c1537910q7h2.LJIJJ;
            } else {
                templateData2 = null;
            }
            templateData.LJIJJLI(templateData2);
            InterfaceC1531560pxS interfaceC1531560pxS2 = this.LIZ.hybridParams;
            if ((interfaceC1531560pxS2 instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS2) != null) {
                mapLJIJI = c1537910q7h.LJIJI();
            } else {
                mapLJIJI = null;
            }
            C1539810qAl c1539810qAl = this.LJ;
            if (c1539810qAl != null) {
                map = c1539810qAl.LJ;
            } else {
                map = null;
            }
            Map<String, Object> mapLJFF = LJFF(mapLJIJI, map);
            if (mapLJFF != null) {
                lynxView.updateGlobalProps(mapLJFF);
            }
            lynxView.ssrHydrate(bArr, str, templateData);
            LJI(EnumC1539690qAZ.HYDRATION_SUCCESS, 0, null);
        }
    }

    public final void LJ(C1533510q0b c1533510q0b, String str, Function2<? super byte[], ? super String, Unit> function2) {
        if (this.LIZIZ == null) {
            return;
        }
        RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_SSR_TEMPLATE);
        requestParams.loadToMemory = true;
        requestParams.needLocalFile = Boolean.FALSE;
        requestParams.customParams.put("rl_container_uuid", this.LIZ.containerId);
        boolean z = C1535630q41.LJJIIZ;
        requestParams.enableProcessChain = z;
        requestParams.checkGeckoFileAvailable = !z;
        requestParams.allowIOOnMainThread = true;
        requestParams.geckoSource = GeckoSource.SPARK_MANIFEST;
        requestParams.disableGeckoRemoteSettings = true;
        if (c1533510q0b != null) {
            requestParams.accessKey = c1533510q0b.LIZ;
            requestParams.channel = c1533510q0b.LIZIZ;
            requestParams.bundle = c1533510q0b.LIZJ;
            requestParams.bundle = new Regex("(template\\.\\w+)\\.js").replace(c1533510q0b.LIZJ, "template.js");
        }
        if (!Intrinsics.LJFF(str, "") && !PatternProtector.compile("^(http|https)://[a-zA-Z0-9\\-\\._]+(:[a-zA-Z0-9\\-\\._]+)?(/[a-zA-Z0-9\\-\\._]*)*(\\?[a-zA-Z0-9\\-\\._&=]*)?(#[a-zA-Z0-9\\-\\._]*)?$").matcher(str).matches()) {
            LJI(EnumC1539690qAZ.HYDRATION_FAILED, 225, "SSR hydration URL is invalid, origin param: " + str);
            if (function2 != null) {
                function2.invoke(null, "invalid hydrate URL");
                return;
            }
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LJI = EnumC1539690qAZ.DEBUG_BEGIN_FETCH_RESOURCE;
        IResourceServiceX iResourceServiceX = this.LIZJ;
        if (iResourceServiceX != null) {
            iResourceServiceX.fetchResourceAsyncIfNeed(str, requestParams, new C1539610qAR(this, jCurrentTimeMillis, function2));
        }
        if (this.LIZJ == null) {
            this.LJI = EnumC1539690qAZ.DEBUG_RESOURCE_SERVICE_NULL;
            if (function2 != null) {
                function2.invoke(null, "resource service is null");
            }
        }
    }

    public final void LJI(EnumC1539690qAZ enumC1539690qAZ, int i, String str) {
        SSRMeta sSRMeta;
        LynxView lynxView = this.LIZIZ;
        if (lynxView == null) {
            return;
        }
        this.LJFF = str;
        this.LJI = enumC1539690qAZ;
        C1530570pvr.LJFF(this.LIZ, EnumC1537150q6T.SLSR_RENDER_MODE, Integer.valueOf(enumC1539690qAZ.getRenderState()));
        if (C1533950q1J.LJ(str)) {
            C1530570pvr.LJFF(this.LIZ, EnumC1537150q6T.SLSR_RENDER_ERR_MSG, str);
        }
        Iterator it2 = ((ArrayList) this.LJIIJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1539930qAx) it2.next()).LIZ(this.LJI);
        }
        if (i != 0) {
            String str2 = this.LIZ.containerId;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Lynx SSR Downloaded, metaInfo: ");
            C1539810qAl c1539810qAl = this.LJ;
            if (c1539810qAl != null) {
                sSRMeta = c1539810qAl.LIZIZ;
            } else {
                sSRMeta = null;
            }
            sbLIZ.append(sSRMeta);
            sbLIZ.append(", Downgrading Reason: ");
            sbLIZ.append(str);
            C1520080pew.LJ(lynxView, str2, new C1520180pf6(i, C2188811AlT.LIZIZ(sbLIZ)));
        }
    }

    public C1539580qAO(C1537480q70 c1537480q70, LynxView lynxView, IResourceServiceX iResourceServiceX, AbstractC1537870q7d abstractC1537870q7d) {
        this.LIZ = c1537480q70;
        this.LIZIZ = lynxView;
        this.LIZJ = iResourceServiceX;
        this.LIZLLL = abstractC1537870q7d;
        c1537480q70.LJJ(C1539580qAO.class, this);
        this.LJI = EnumC1539690qAZ.NOT_RENDER;
        this.LJII = EnumC1539740qAe.UNKNOWN;
        this.LJIIIIZZ = new HashMap<>();
        this.LJIIIZ = System.currentTimeMillis();
        this.LJIIJ = new ArrayList();
        this.LJIIL = new C1539850qAp();
        this.LJIILL = new byte[0];
    }
}
