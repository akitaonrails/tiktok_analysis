package X;

import android.util.LruCache;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.forest.model.GeckoSource;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.TemplateBundle;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.tiktok.forestx.RequestParamsX;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0q5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536650q5f {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final String str, final C1537480q70 c1537480q70, final HybridSchemaParam hybridSchemaParam, int i) {
        C1530570pvr.LJFF(c1537480q70, EnumC1537150q6T.OPT_RESOURCE_PRELOAD, 1);
        final C1533020pzo c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(c1537480q70, false, null, 3);
        if (c1533020pzoLJIILJJIL != null) {
            C1538590q8n c1538590q8n = c1537480q70.liteLynxConfig;
            if (c1538590q8n != null && (c1538590q8n.LJFF || c1538590q8n.LJII || c1538590q8n.LJI)) {
                return;
            }
            LruCache<String, C1536930q67> lruCache = C1536910q65.LIZ;
            if (((CopyOnWriteArrayList) C1536910q65.LIZLLL).contains(C01CL.LIZ(c1537480q70.LJIJI()))) {
                return;
            }
            BPEAThread bPEAThread = new BPEAThread(new Runnable() { // from class: X.0q5e
                public final void LIZ() {
                    RequestParamsX requestParamsX;
                    String strLIZJ;
                    HybridSchemaParam hybridSchemaParam2 = hybridSchemaParam;
                    if ((hybridSchemaParam2 != null ? hybridSchemaParam2.getEngineType() : null) == EnumC1067640dtC.LYNX || (c1537480q70.hybridParams instanceof C1537910q7h)) {
                        requestParamsX = new RequestParamsX(EnumC1533980q1M.LYNX_TEMPLATE, byte[].class);
                        HybridSchemaParam hybridSchemaParam3 = hybridSchemaParam;
                        if (C1535630q41.LJIJ) {
                            requestParamsX.allowRedirectInternally = false;
                        }
                        if (LynxEnv.inst().isNativeLibraryLoaded() && (C1535630q41.LJIJI || (hybridSchemaParam3 != null && hybridSchemaParam3.getEnableForestPreDecode()))) {
                            requestParamsX.consumeType = TemplateBundle.class;
                            C1537890q7f.LIZ.getClass();
                            requestParamsX.resourceSupplier = new C1535870q4P(true, false);
                        }
                    } else {
                        requestParamsX = new RequestParamsX(EnumC1533980q1M.WEB_MAIN_DOCUMENT, byte[].class);
                    }
                    C1537480q70 c1537480q702 = c1537480q70;
                    String str2 = str;
                    requestParamsX.customParams = C2097608Jq.LJIIJ(new Pair("rl_container_uuid", c1537480q702.containerId), new Pair("hybrid_channel", "com.bytedance.lynx.hybrid.resource.Preloader.preloadTemplate"));
                    requestParamsX.source = "ContainerPreload";
                    requestParamsX.groupId = c1537480q702.containerId;
                    C1529870puj.LIZ.getClass();
                    C1529870puj.LIZ(c1537480q702);
                    C1533510q0b c1533510q0bLJ = C1533720q0w.LJ(C1533720q0w.LIZ, str2, null);
                    if (c1533510q0bLJ != null) {
                        requestParamsX.accessKey = c1533510q0bLJ.LIZ;
                        requestParamsX.channel = c1533510q0bLJ.LIZIZ;
                        requestParamsX.bundle = c1533510q0bLJ.LIZJ;
                        requestParamsX.setGeckoSource(EnumC1507260pKG.SPARK_MANIFEST);
                    }
                    HybridSchemaParam hybridSchemaParam4 = hybridSchemaParam;
                    if (hybridSchemaParam4 == null) {
                        JSONArray jSONArray = C1533710q0v.LIZ;
                        strLIZJ = C1533710q0v.LIZLLL(null, requestParamsX, str);
                    } else {
                        JSONArray jSONArray2 = C1533710q0v.LIZ;
                        C1533710q0v.LJIIIZ(requestParamsX, hybridSchemaParam4);
                        strLIZJ = C1533710q0v.LIZJ(hybridSchemaParam, str, true);
                    }
                    LruCache<String, C1536930q67> lruCache2 = C1536910q65.LIZ;
                    if (((CopyOnWriteArrayList) C1536910q65.LIZLLL).contains(C01CL.LIZ(c1537480q70.LJIJI()))) {
                        return;
                    }
                    c1533020pzoLJIILJJIL.LIZJ(strLIZJ, requestParamsX, null);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("Preloader@afe9.preloadTemplate$1$3");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("Preloader@afe9.preloadTemplate$1$3");
                }
            });
            ThreadMethodProxy.setPriority(bPEAThread, i);
            bPEAThread.start();
            return;
        }
        c1537480q70.resourcePreloadTriggered = true;
        try {
            BPEAThread bPEAThread2 = new BPEAThread(new Runnable() { // from class: X.0pvl
                public final void LIZ() {
                    RequestParams requestParams;
                    String strLIZJ;
                    InterfaceC1531560pxS interfaceC1531560pxS;
                    HybridSchemaParam hybridSchemaParam2 = hybridSchemaParam;
                    if ((hybridSchemaParam2 != null ? hybridSchemaParam2.getEngineType() : null) == EnumC1067640dtC.LYNX || (c1537480q70.hybridParams instanceof C1537910q7h)) {
                        requestParams = new RequestParams(EnumC1533980q1M.LYNX_TEMPLATE);
                        if (C1535630q41.LJIJ) {
                            requestParams.allowRedirectInternally = false;
                        }
                        if (C1535630q41.LJIJI) {
                            requestParams.consumeType = TemplateBundle.class;
                        }
                        requestParams.loadToMemory = true;
                    } else {
                        requestParams = new RequestParams(EnumC1533980q1M.WEB_MAIN_DOCUMENT);
                    }
                    C1537480q70 c1537480q702 = c1537480q70;
                    String str2 = str;
                    requestParams.enableMemoryCache = Boolean.TRUE;
                    requestParams.needLocalFile = Boolean.FALSE;
                    requestParams.customParams.put("rl_container_uuid", c1537480q702.containerId);
                    requestParams.customParams.put("hybrid_channel", "com.bytedance.lynx.hybrid.resource.Preloader.preloadTemplate");
                    requestParams.source = "ContainerPreload";
                    C1529870puj.LIZ.getClass();
                    C1529870puj.LIZ(c1537480q702);
                    C1533510q0b c1533510q0bLJ = C1533720q0w.LJ(C1533720q0w.LIZ, str2, null);
                    if (c1533510q0bLJ != null) {
                        requestParams.accessKey = c1533510q0bLJ.LIZ;
                        requestParams.channel = c1533510q0bLJ.LIZIZ;
                        requestParams.bundle = c1533510q0bLJ.LIZJ;
                        requestParams.geckoSource = GeckoSource.SPARK_MANIFEST;
                    }
                    HybridSchemaParam hybridSchemaParamLIZJ = hybridSchemaParam;
                    boolean z = !(hybridSchemaParamLIZJ == null && ((interfaceC1531560pxS = c1537480q70.hybridParams) == null || (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) == null)) && hybridSchemaParamLIZJ.getParallelFetchResource() == 2;
                    HybridSchemaParam hybridSchemaParam3 = hybridSchemaParam;
                    if (hybridSchemaParam3 == null) {
                        JSONArray jSONArray = C1533710q0v.LIZ;
                        strLIZJ = C1533710q0v.LIZLLL(null, requestParams, str);
                    } else {
                        JSONArray jSONArray2 = C1533710q0v.LIZ;
                        C1533710q0v.LJIIIIZZ(requestParams, hybridSchemaParam3);
                        strLIZJ = C1533710q0v.LIZJ(hybridSchemaParam, str, true);
                    }
                    JSONArray jSONArray3 = C1533710q0v.LIZ;
                    IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(c1537480q70, false);
                    if (iResourceServiceXLIZIZ != null) {
                        iResourceServiceXLIZIZ.preloadContainer(strLIZJ, requestParams, c1537480q70, z);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("Preloader@afe9.preloadTemplate$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("Preloader@afe9.preloadTemplate$2");
                }
            });
            ThreadMethodProxy.setPriority(bPEAThread2, i);
            bPEAThread2.start();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error happened in preload thread start:");
            sbLIZ.append(e.getMessage());
            sbLIZ.append(" containerId:");
            sbLIZ.append(c1537480q70.containerId);
            c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "HybridKit");
        }
    }
}
