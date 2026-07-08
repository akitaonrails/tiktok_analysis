package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.monitorV2.lynx.jsb.LynxViewMonitorModule;
import com.bytedance.crash.Npth;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.sdk.xbridge.protocol.impl.communication.lynx.RavenModule;
import com.bytedance.sdk.xbridge.protocol.impl.lynx.LynxRuntimeBridgeDelegateModule;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxBackgroundRuntime;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.TemplateData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1540540qBw implements InterfaceC1540590qC1 {
    public final C1537480q70 LIZ;
    public final Context LIZIZ;
    public final Map<String, Object> LIZJ;
    public LynxBackgroundRuntime LIZLLL;
    public final C1529800puc LJ;
    public final HybridSchemaParam LJFF;
    public final String LJI;
    public final C1543410qGZ LJII = new C1543410qGZ();
    public final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);

    public final void LIZIZ() {
        LynxBackgroundRuntime lynxBackgroundRuntime = this.LIZLLL;
        if (lynxBackgroundRuntime != null) {
            lynxBackgroundRuntime.LIZ();
        }
        this.LJII.LJII();
        C586180Myu.LIZ.remove(this.LIZ.containerId);
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1161970gLL.LIZIZ().LJ(this.LIZ.containerId, true);
    }

    public final void LIZJ() {
        String group;
        String strLIZIZ;
        C1299310jur c1299310jur = new C1299310jur();
        C1299370jux c1299370jux = C1299370jux.LIZ;
        HybridSchemaParam hybridSchemaParam = this.LJFF;
        if (hybridSchemaParam == null || (group = hybridSchemaParam.getGroup()) == null) {
            group = "default_lynx_group";
        }
        HybridSchemaParam hybridSchemaParam2 = this.LJFF;
        boolean enableCanvas = hybridSchemaParam2 != null ? hybridSchemaParam2.getEnableCanvas() : false;
        HybridSchemaParam hybridSchemaParam3 = this.LJFF;
        boolean enableDynamicV8 = hybridSchemaParam3 != null ? hybridSchemaParam3.getEnableDynamicV8() : false;
        HybridSchemaParam hybridSchemaParam4 = this.LJFF;
        Boolean enableCanvasOptimization = hybridSchemaParam4 != null ? hybridSchemaParam4.getEnableCanvasOptimization() : null;
        HybridSchemaParam hybridSchemaParam5 = this.LJFF;
        boolean enableStorageGroup = hybridSchemaParam5 != null ? hybridSchemaParam5.getEnableStorageGroup() : false;
        HybridSchemaParam hybridSchemaParam6 = this.LJFF;
        c1299310jur.LIZJ = C1299370jux.LIZJ(c1299370jux, true, group, enableCanvas, enableDynamicV8, enableCanvasOptimization, enableStorageGroup, hybridSchemaParam6 != null ? hybridSchemaParam6.getForceSingleGroup() : false);
        HashMap map = new HashMap();
        Map<String, Object> map2 = this.LIZJ;
        if (map2 != null) {
            map.putAll(map2);
        }
        C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
        C1326430kcb.LIZ().LIZJ(this.LIZIZ, this.LIZ);
        if (C08RQ.LIZJ(this.LIZ.containerId).containsKey("ab_params")) {
            C1326430kcb.LIZ().LIZLLL(this.LIZ.containerId);
        }
        map.putAll(C1326430kcb.LIZ().LIZIZ(this.LIZ.containerId));
        c1299310jur.LJFF = TemplateData.LJII(map);
        Context context = this.LIZIZ;
        final C1543410qGZ c1543410qGZ = this.LJII;
        C1537480q70 c1537480q70 = this.LIZ;
        final String str = c1537480q70.containerId;
        C1165930gRj c1165930gRj = (C1165930gRj) c1537480q70.LJFF(C1165930gRj.class);
        c1543410qGZ.getClass();
        ConcurrentHashMap<Integer, C1543410qGZ> concurrentHashMap = C1543560qGo.LIZ;
        C1543550qGn c1543550qGn = c1543410qGZ.LIZ;
        C1543190qGD c1543190qGD = c1543550qGn.LIZ;
        c1543190qGD.LIZ = c1543410qGZ;
        c1543190qGD.LJIIZILJ = true;
        c1543190qGD.LJIILJJIL = EnumC1063300dmC.LYNX;
        c1543190qGD.LIZIZ(new C1543460qGe(c1543190qGD));
        Iterator it2 = ((ArrayList) c1543550qGn.LIZ.LJIIJ).iterator();
        while (it2.hasNext()) {
            ((AbstractC1543580qGq) it2.next()).LJIIIIZZ();
        }
        C1543190qGD c1543190qGD2 = c1543550qGn.LIZ;
        c1299310jur.LIZJ("runtimeBridge", LynxRuntimeBridgeDelegateModule.class, c1543190qGD2);
        c1299310jur.LIZJ("raven", RavenModule.class, c1543190qGD2);
        C1543190qGD c1543190qGD3 = c1543550qGn.LIZ;
        c1543190qGD3.LJIILLIIL = c1165930gRj;
        c1543190qGD3.LJIIIZ = str;
        c1543410qGZ.LJ.LJ(C1543190qGD.class, c1543410qGZ.LIZ.LIZ);
        c1543410qGZ.LJ.LIZLLL = str;
        c1543410qGZ.LJ.LJFF(c1543410qGZ);
        C1544610qIV c1544610qIV = c1543410qGZ.LJ;
        InterfaceC1544650qIZ interfaceC1544650qIZ = new InterfaceC1544650qIZ() { // from class: X.0qBx
            @Override // X.InterfaceC1544650qIZ
            public final void LIZ(String str2, JSONObject jSONObject) {
                c1543410qGZ.LJIIIZ(str2, jSONObject);
            }
        };
        if (c1544610qIV.LJ == null) {
            c1544610qIV.LJ = interfaceC1544650qIZ;
        }
        c1544610qIV.LIZ(InterfaceC1063720dms.class, new InterfaceC1063720dms() { // from class: X.0qFb
            /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
            @Override // X.InterfaceC1063720dms
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.lang.String r3, java.util.Map<java.lang.String, ? extends java.lang.Object> r4) {
                /*
                    r2 = this;
                    X.0qGZ r1 = r1
                    if (r4 == 0) goto Lf
                    X.0qHC r0 = X.C1543800qHC.LIZ
                    r0.getClass()
                    org.json.JSONObject r0 = X.C1543800qHC.LIZJ(r4)
                    if (r0 != 0) goto L14
                Lf:
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                L14:
                    r1.LJIIIZ(r3, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1542810qFb.LIZ(java.lang.String, java.util.Map):void");
            }
        });
        c1543410qGZ.LJ.LIZ(InterfaceC1887690zDr.class, new InterfaceC1887690zDr() { // from class: X.0qBz
            @Override // X.InterfaceC1887690zDr
            public final String LIZ() {
                return str;
            }
        });
        C1543420qGa c1543420qGa = c1543410qGZ.LIZ.LIZ.LJIIL;
        c1543420qGa.LIZIZ(c1543410qGZ.LJ);
        c1543420qGa.LIZJ = c1543410qGZ.LIZIZ;
        C1543200qGE c1543200qGE = c1543410qGZ.LIZ.LIZ.LIZIZ;
        if (c1543200qGE != null) {
            c1543200qGE.LIZ = c1543420qGa;
        }
        C1544610qIV c1544610qIV2 = this.LJII.LJ;
        c1544610qIV2.LJ(C1537480q70.class, this.LIZ);
        C1543000qFu c1543000qFu = (C1543000qFu) this.LIZ.LJFF(C1543000qFu.class);
        if (c1543000qFu != null) {
            C1543030qFx c1543030qFxLJ = c1543000qFu.LJ();
            if (c1543030qFxLJ != null && (strLIZIZ = c1543030qFxLJ.LIZIZ()) != null && strLIZIZ.length() != 0) {
                C1543410qGZ c1543410qGZ2 = this.LJII;
                C1543190qGD c1543190qGD4 = c1543410qGZ2.LIZ.LIZ;
                C1543390qGX c1543390qGX = new C1543390qGX(strLIZIZ);
                c1543390qGX.LIZIZ = c1543410qGZ2.LJ;
                c1543190qGD4.LJIILIIL = c1543390qGX;
                Iterator it3 = C13BV.INSTANCE.iterator();
                while (it3.hasNext()) {
                    C1543410qGZ.LIZLLL(this.LJII, (Class) it3.next());
                }
            }
            Iterator<Class<? extends InterfaceC1063710dmr>> it4 = c1543000qFu.LJFF().iterator();
            while (it4.hasNext()) {
                C1543490qGh.LIZIZ(it4.next(), EnumC1063300dmC.ALL, 4);
            }
            Iterator it5 = C13BV.INSTANCE.iterator();
            while (it5.hasNext()) {
                this.LJII.LIZ((InterfaceC1543170qGB) it5.next());
            }
            Iterator<Class<? extends InterfaceC1063710dmr>> it6 = c1543000qFu.LJI().iterator();
            while (it6.hasNext()) {
                this.LJII.LJFF(it6.next(), EnumC1063300dmC.ALL);
            }
            Map<Class<?>, C1544630qIX<?>> mapLJII = c1543000qFu.LJII();
            if (mapLJII != null) {
                c1544610qIV2.LIZ.putAll(mapLJII);
            }
            Map<Class<?>, C1544620qIW<?>> mapLJIIIIZZ = c1543000qFu.LJIIIIZZ();
            if (mapLJIIIIZZ != null) {
                c1544610qIV2.LIZ.putAll(mapLJIIIIZZ);
            }
        }
        if (c1544610qIV2.LIZIZ(C1059860dge.class) == null) {
            C1059860dge c1059860dge = new C1059860dge();
            c1059860dge.LIZLLL(Context.class, context);
            c1059860dge.LIZIZ(InterfaceC1878020yyG.class, new InterfaceC1878020yyG() { // from class: X.0qBy
                @Override // X.InterfaceC1878020yyG
                public final void getNameSpace() {
                }
            });
            c1059860dge.LIZIZ(InterfaceC1548390qOb.class, new InterfaceC1548390qOb() { // from class: X.0qFc
                @Override // X.InterfaceC1548390qOb
                public final void H4(InterfaceC1107590evd interfaceC1107590evd, String str2) {
                    JSONObject jSONObject;
                    if (interfaceC1107590evd != null) {
                        C1872780ypo.LIZ.getClass();
                        jSONObject = C1872780ypo.LIZIZ(interfaceC1107590evd);
                    } else {
                        jSONObject = new JSONObject();
                    }
                    this.LL.LJII.LJIIIZ(str2, jSONObject);
                }
            });
            c1059860dge.LIZIZ(InterfaceC1052500dUm.class, new InterfaceC1052500dUm() { // from class: X.0pv3
                @Override // X.InterfaceC1052500dUm
                public final String LIZ() {
                    return this.LIZ.LIZ.containerId;
                }
            });
            c1544610qIV2.LIZ(C1059860dge.class, c1059860dge);
        }
        Activity activityLIZ = C715020S2y.LIZ(context);
        if (activityLIZ != null) {
            c1544610qIV2.LJI(activityLIZ);
        }
        c1299310jur.LIZJ("hybridMonitor", LynxViewMonitorModule.class, new C1521690phX(this.LIZ.containerId));
        this.LJ.LIZIZ(c1299310jur);
        LynxBackgroundRuntime lynxBackgroundRuntime = new LynxBackgroundRuntime(this.LIZIZ, c1299310jur, false);
        this.LIZLLL = lynxBackgroundRuntime;
        this.LJII.LIZ.LIZ.LJI = lynxBackgroundRuntime;
        AbstractC1298860ju8 abstractC1298860ju8 = new AbstractC1298860ju8() { // from class: X.0pua
            @Override // X.AbstractC1298860ju8
            public final void LIZLLL(String str2) {
                this.LL.LJ.LJIIIIZZ(str2);
            }

            @Override // X.AbstractC1298860ju8
            public final void LJFF(LynxError lynxError) {
                if (lynxError != null) {
                    lynxError.LIZIZ();
                    C1529800puc c1529800puc = this.LL.LJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("lynx_runtime_engine_error: error_code:");
                    sbLIZ.append(lynxError.LIZIZ());
                    sbLIZ.append(", error_message: ");
                    sbLIZ.append(lynxError.LIZJ());
                    c1529800puc.LIZLLL(new C1529820pue(0, C2188811AlT.LIZIZ(sbLIZ), C2097608Jq.LJI(new Pair("lynx_error_code", Integer.valueOf(lynxError.LIZIZ())))));
                }
            }

            @Override // X.AbstractC1298860ju8
            public final void LJ(String str2, String str3, int i) {
                this.LL.LJ.LIZ(i, str2, str3);
            }
        };
        if (!lynxBackgroundRuntime.LIZLLL.contains(abstractC1298860ju8)) {
            lynxBackgroundRuntime.LIZLLL.add(abstractC1298860ju8);
        }
        this.LIZ.LJJ(LynxBackgroundRuntime.class, this.LIZLLL);
        this.LJ.LJ(this);
    }

    public final void LIZLLL() {
        C23250099c.LIZLLL(C1064790dob.LIZ(this.LIZIZ, null), C0PEM.LIZJ, null, new C1529770puZ(this, null), 2);
    }

    @Override // X.InterfaceC1540590qC1
    public final void LIZ(String str, JSONObject jSONObject) {
        this.LJII.LJIIIZ(str, jSONObject);
    }

    public C1540540qBw(SparkContext sparkContext, Context context, C1529790pub c1529790pub, Map map) {
        C1529800puc c1529800puc;
        String scriptUrl;
        HybridSchemaParam hybridSchemaParamLIZJ;
        this.LIZ = sparkContext;
        this.LIZIZ = context;
        this.LIZJ = map;
        if (c1529790pub == null) {
            c1529800puc = new C1529800puc(C13BV.INSTANCE);
        } else {
            c1529800puc = new C1529800puc(Collections.singletonList(c1529790pub));
        }
        c1529800puc.LIZIZ = new C1529810pud(this);
        this.LJ = c1529800puc;
        c1529800puc.LJFF();
        InterfaceC1531560pxS interfaceC1531560pxS = sparkContext.hybridParams;
        if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null) {
            this.LJFF = hybridSchemaParamLIZJ;
        } else {
            c1529800puc.LIZLLL(new C1529820pue(-100, "hybridContext.hybridParams is null, please check it", null));
        }
        HybridSchemaParam hybridSchemaParam = this.LJFF;
        if (hybridSchemaParam != null) {
            scriptUrl = hybridSchemaParam.getScriptUrl();
        } else {
            scriptUrl = null;
        }
        Npth.addTag("runtime_script_url", scriptUrl);
        C1529870puj c1529870puj = C1529870puj.LIZ;
        C1537480q70 c1537480q70 = this.LIZ;
        c1529870puj.getClass();
        C1529870puj.LIZ(c1537480q70);
        HybridSchemaParam hybridSchemaParam2 = this.LJFF;
        String scriptUrl2 = (hybridSchemaParam2 == null || (scriptUrl2 = hybridSchemaParam2.getScriptUrl()) == null) ? "" : scriptUrl2;
        this.LJI = scriptUrl2;
        if (scriptUrl2.length() == 0) {
            C1490740otc.LIZIZ(C1490740otc.LIZ, "The Lynx script url is empty. Please check it.", null, "SPARK_LYNX_JS_RUNTIME", 2);
            if (c1529790pub != null) {
                c1529790pub.LIZLLL(new C1529820pue(-1, "The Lynx script url is empty. Please check it.", null));
            }
        } else {
            try {
                LIZJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1529800puc c1529800puc2 = this.LJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unknown error, error_message: ");
                sbLIZ.append(th.getMessage());
                sbLIZ.append(", stack: ");
                sbLIZ.append(C13LQ.LJJJ(th.getStackTrace(), "\n", null, null, null, 62));
                c1529800puc2.LIZLLL(new C1529820pue(-4, C2188811AlT.LIZIZ(sbLIZ), null));
            }
        }
        C586180Myu.LIZ.put(this.LIZ.containerId, new WeakReference<>(this));
    }
}
