package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.crash.Npth;
import com.bytedance.forest.Forest;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.JSModuleManager;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q7N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537710q7N extends LynxView implements InterfaceC1541990qEH {
    public static final C01GW<Map<String, List<String>>> LLJJL = C452501pT.LIZIZ(new C598120Nd4());
    public static final boolean LLJJLIIIJLLLLLLLZ;
    public static final boolean LLJL;
    public static final boolean LLJLIL;
    public C1537480q70 LL;
    public boolean LLILLJJLI;
    public String LLILLL;
    public final C1537910q7h LLILZ;
    public InterfaceC1538820q9A LLILZIL;
    public AbstractC1537870q7d LLILZLL;
    public final IResourceServiceX LLIZ;
    public final C1537860q7c LLIZLLLIL;
    public EnumC1538460q8a LLJ;
    public final Map<String, TemplateData> LLJI;
    public Map<String, TemplateData> LLJIJIL;
    public final C1537550q77 LLJILJIL;
    public final C1538200q8A LLJILJILJ;
    public Method LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public final boolean LLJJIII;
    public CoroutineContext LLJJIJI;
    public C1539580qAO LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public C1533790q13 LLJJJ;
    public boolean LLJJJIL;
    public C1536580q5Y LLJJJJ;
    public boolean LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    @Override // X.InterfaceC1541990qEH
    public final void LJIJJLI() {
        Collection<TemplateData> collectionValues;
        this.LLJJJ = null;
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadSuccess: processors in loadingQueue = ");
        Map<String, TemplateData> map = this.LLJIJIL;
        sbLIZ.append(map != null ? map.keySet() : null);
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "LynxKitView", 2);
        setLoadStatus(EnumC1538460q8a.SUCCESS);
        Map<String, TemplateData> map2 = this.LLJIJIL;
        if (map2 != null && (collectionValues = map2.values()) != null) {
            for (TemplateData templateData : collectionValues) {
                templateData.LJ = true;
                super.updateData(templateData);
            }
        }
        this.LLJIJIL = null;
    }

    @Override // X.InterfaceC1541990qEH
    public final boolean Z0() {
        return true;
    }

    @Override // X.InterfaceC1541990qEH
    public final View e1() {
        return this;
    }

    static {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        try {
            Object objLIZIZ = C1535630q41.LIZIZ("unregister_lynx_monitor");
            c098200Yq = objLIZIZ instanceof Boolean ? (Boolean) objLIZIZ : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        LLJJLIIIJLLLLLLLZ = bool != null ? bool.booleanValue() : false;
        try {
            Object objLIZIZ2 = C1535630q41.LIZIZ("unify_monitor_url");
            c098200Yq2 = objLIZIZ2 instanceof Boolean ? (Boolean) objLIZIZ2 : null;
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        Boolean bool2 = (Boolean) c098200Yq2;
        LLJL = bool2 != null ? bool2.booleanValue() : false;
        try {
            Object objLIZIZ3 = C1535630q41.LIZIZ("kitview_enable_pre_decode");
            c098200Yq3 = objLIZIZ3 instanceof Boolean ? (Boolean) objLIZIZ3 : null;
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        Boolean bool3 = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq3) ? null : c098200Yq3);
        LLJLIL = bool3 != null ? bool3.booleanValue() : true;
    }

    private final SharedPreferences getSparkDebugSharedPref() {
        return (SharedPreferences) this.LLJJJJLIIL.getValue();
    }

    public final void LJIIZILJ() {
        Iterator it2 = ((LinkedHashMap) this.LLJI).values().iterator();
        while (it2.hasNext()) {
            ((TemplateData) it2.next()).LJIILL();
        }
        ((LinkedHashMap) this.LLJI).clear();
    }

    public final void LJJIFFI() {
        HybridSchemaParam hybridSchemaParamLIZJ;
        if (this.LLJJJJJIL) {
            return;
        }
        String str = getHybridContext().containerId;
        String strLJIJI = getHybridContext().LJIJI();
        String str2 = getHybridContext().bid;
        InterfaceC1531560pxS interfaceC1531560pxS = getHybridContext().hybridParams;
        C1520080pew.LJFF(str, "lynx_predecode", "fetch", null, strLJIJI, str2, (interfaceC1531560pxS == null || (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) == null) ? null : hybridSchemaParamLIZJ.getSparkPerfBiz(), "succeed", 8);
        this.LLJJJJJIL = true;
    }

    @Override // X.InterfaceC1541990qEH
    public Object getAndRemoveForestResponse() {
        C1533790q13 c1533790q13 = this.LLJJJ;
        this.LLJJJ = null;
        return c1533790q13;
    }

    @Override // X.InterfaceC1541990qEH
    public Map<String, Object> getGlobalProps() {
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null) {
            return c1537910q7h.LJIJI();
        }
        return null;
    }

    @Override // X.InterfaceC1541990qEH
    public String getSchema() {
        String str = this.LLILLL;
        return str == null ? "" : str;
    }

    public final InterfaceC497601wk getScope() {
        return (InterfaceC497601wk) this.LLJJIJIL.getValue();
    }

    @Override // X.InterfaceC1541990qEH
    public final void load() {
        load(this.LLILLL);
    }

    @Override // X.InterfaceC1541990qEH
    public final void onHide() {
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h == null || !c1537910q7h.LJJIJ) {
            LJJIJ("viewDisappeared", null);
        } else {
            C1743710vTd.LIZIZ(getHybridContext());
        }
        onEnterBackground();
    }

    @Override // X.InterfaceC1541990qEH
    public final void onShow() {
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h == null || !c1537910q7h.LJJIJ) {
            LJJIJ("viewAppeared", null);
        } else {
            C1743710vTd.LIZJ(getHybridContext());
        }
        onEnterForeground();
    }

    public final void LJJIJIIJI() {
        C1530580pvs c1530580pvs = (C1530580pvs) getHybridContext().LJFF(C1530580pvs.class);
        if (c1530580pvs == null) {
            c1530580pvs = new C1530580pvs();
            getHybridContext().LJJ(C1530580pvs.class, c1530580pvs);
        }
        C1530580pvs.LIZ(c1530580pvs, getContext(), this.LLILLL, getHybridContext());
    }

    @Override // X.InterfaceC1541990qEH
    public final void a1() {
        AbstractC1537870q7d abstractC1537870q7d;
        if (getHybridContext().lifecycleState != Lifecycle.State.DESTROYED) {
            return;
        }
        InterfaceC1538820q9A interfaceC1538820q9A = this.LLILZIL;
        if (interfaceC1538820q9A != null) {
            interfaceC1538820q9A.onDestroy();
        }
        if (this.LLJJ && (abstractC1537870q7d = this.LLILZLL) != null) {
            abstractC1537870q7d.LJJJZ();
        }
        AbstractC1537870q7d abstractC1537870q7d2 = this.LLILZLL;
        if (abstractC1537870q7d2 != null) {
            abstractC1537870q7d2.onDestroy();
        }
        AbstractC1537870q7d abstractC1537870q7d3 = this.LLILZLL;
        if (abstractC1537870q7d3 != null) {
            abstractC1537870q7d3.LJJZ(this);
        }
        C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
        C1326430kcb.LIZ().LIZIZ.remove(getHybridContext().containerId);
        C1529870puj c1529870puj = C1529870puj.LIZ;
        String str = getHybridContext().containerId;
        c1529870puj.getClass();
        C1529870puj.LJI(this, str);
        if (LLJJLIIIJLLLLLLLZ) {
            C1490740otc.LIZIZ(C1490740otc.LIZ, "LynxKitView unregisterLynxMonitor", EnumC1490770otf.D, null, 4);
            LynxViewMonitor.Companion.getClass();
            LynxViewMonitor.INSTANCE.unregisterLynxViewMonitor(this);
        }
    }

    @Override // com.lynx.tasm.LynxView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJJJ = null;
        try {
            if (((Boolean) C09P3.LJ.getValue()).booleanValue()) {
                C09PF.LIZ(this, this.LLILLL);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC1541990qEH
    public final void reload() throws JSONException {
        Map<String, Object> mapLJIJI;
        getHybridContext().LJJIJ(System.currentTimeMillis());
        C1537860q7c c1537860q7c = this.LLIZLLLIL;
        if (c1537860q7c != null) {
            String str = this.LLILLL;
            if (str == null) {
                str = "";
            }
            c1537860q7c.LJLIIL(this, str);
        }
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null && (mapLJIJI = c1537910q7h.LJIJI()) != null) {
            updateData(mapLJIJI, (String) null);
        }
        String str2 = this.LLILLL;
        if (str2 != null) {
            load(str2);
        }
    }

    @Override // X.InterfaceC1541990qEH
    public final boolean T0() {
        return this.LLJJJIL;
    }

    public final C1533790q13 getForestResponse() {
        return this.LLJJJ;
    }

    public final boolean getHasMarkPredecodeStatus() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1541990qEH
    public C1537480q70 getHybridContext() {
        return this.LL;
    }

    public final C1536580q5Y getI18nResponse() {
        return this.LLJJJJ;
    }

    public final C1537910q7h getInitParams() {
        return this.LLILZ;
    }

    public final C1539580qAO getLynxSSRRuntime() {
        return this.LLJJIJIIJIL;
    }

    public final String getRawUrl() {
        return this.LLILLL;
    }

    public final void LJIJI(String str) {
        TemplateData templateData;
        C1067460dsu c1067460dsuLJIIJ;
        this.LLILLL = str;
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h == null || (c1067460dsuLJIIJ = c1537910q7h.LJIIJ()) == null || (templateData = c1067460dsuLJIIJ.LIZ) == null) {
            C1537910q7h c1537910q7h2 = this.LLILZ;
            if (c1537910q7h2 != null) {
                templateData = c1537910q7h2.LJIJJ;
            } else {
                templateData = null;
            }
        }
        C1530570pvr.LIZIZ(getHybridContext(), "spark_get_init_data_url_start");
        Map<String, Object> mapLJIIJ = getHybridContext().LJIIJ();
        if (mapLJIIJ != null) {
            C1520080pew.LJFF(getHybridContext().containerId, "init_data_url", "mergeInitData", null, getHybridContext().LJIJI(), getHybridContext().bid, null, "createView", 72);
            if (templateData != null) {
                templateData.LJIILIIL("initDataRes", mapLJIIJ);
            }
            U0(C2097908Jt.LIZJ(new Pair("hasInitDataRes", Boolean.TRUE)));
        }
        C1530570pvr.LIZIZ(getHybridContext(), "spark_get_init_data_url_end");
        C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.SPARK_LOAD_ENGINE_INNER}, null);
        if (templateData == null) {
            templateData = new TemplateData();
        }
        C1538200q8A c1538200q8A = this.LLJILJILJ;
        if (c1538200q8A != null && c1538200q8A.LJIIIIZZ == null && c1538200q8A.LIZJ != null) {
            c1538200q8A.LJIIIIZZ = Long.valueOf(C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.RENDER_START}, Long.valueOf(System.currentTimeMillis())) - c1538200q8A.LIZJ.longValue());
        }
        String strLIZJ = C1529760puY.LIZJ(str);
        C1529760puY.LIZIZ(null, null);
        C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_ENGINE_LOAD_START}, Long.valueOf(System.currentTimeMillis()));
        renderTemplateUrl(strLIZJ, templateData);
        C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_ENGINE_LOAD_END}, Long.valueOf(System.currentTimeMillis()));
        C1537860q7c c1537860q7c = this.LLIZLLLIL;
        if (c1537860q7c != null) {
            c1537860q7c.LJLIIIL(this);
        }
    }

    public final void LJJII(Map<String, ? extends Object> map) {
        Iterable iterable;
        String strLJJLIIIJ;
        Object aBParamsValue;
        Map map2;
        Map<String, Object> globalProps = getGlobalProps();
        Object obj = null;
        if (globalProps != null) {
            obj = globalProps.get("abParams");
        }
        if (!(obj instanceof Map) || (map2 = (Map) obj) == null || map2.isEmpty()) {
            Object obj2 = map.get("abParams");
            if ((obj2 instanceof List) && (iterable = (Iterable) obj2) != null && (strLJJLIIIJ = C13LP.LJJLIIIJ(iterable, ",", null, null, 0, null, null, 62)) != null) {
                C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
                C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
                if (c1538050q7v != null && (aBParamsValue = c1538050q7v.getABParamsValue(strLJJLIIIJ)) != null && globalProps != null) {
                    globalProps.put("abParams", aBParamsValue);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ(java.util.Map<java.lang.String, ? extends java.lang.Object> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "spark_i18nx"
            java.lang.Object r1 = r8.get(r0)
            boolean r0 = r1 instanceof java.util.Map
            r6 = 0
            if (r0 == 0) goto L96
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L96
            com.bytedance.lynx.hybrid.i18n.SparkI18nManager r0 = com.bytedance.lynx.hybrid.i18n.SparkI18nManager.LIZ
            r0.getClass()
            com.bytedance.lynx.hybrid.i18n.SparkI18nManager$Meta r5 = com.bytedance.lynx.hybrid.i18n.SparkI18nManager.LJIIIIZZ(r1)
            if (r5 == 0) goto L96
            X.0q70 r3 = r7.getHybridContext()
            r0 = 1
            X.0q6a[] r2 = new X.EnumC1537220q6a[r0]
            X.0q6a r0 = X.EnumC1537220q6a.I18N_PRELOAD_START
            r4 = 0
            r2[r4] = r0
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.C1530570pvr.LIZJ(r3, r2, r0)
            X.0otc r3 = X.C1490740otc.LIZ
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "i18n"
            r0 = 2
            X.C1490740otc.LIZIZ(r3, r2, r6, r1, r0)
            java.util.Map r1 = r7.getGlobalProps()
            if (r1 != 0) goto L47
            java.util.Map r1 = X.C2097608Jq.LJ()
        L47:
            java.lang.String r0 = "appLocale"
            java.lang.Object r3 = r1.get(r0)
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L55
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L59
        L55:
            java.lang.String r3 = com.bytedance.lynx.hybrid.i18n.SparkI18nManager.LIZ()
        L59:
            X.0q70 r0 = r7.getHybridContext()
            java.lang.String r0 = r0.LJII()
            if (r0 == 0) goto L82
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Throwable -> L6b
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L6b
            goto L77
        L6b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L77:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L7e
            r6 = r1
        L7e:
            android.net.Uri r6 = (android.net.Uri) r6
            if (r6 != 0) goto L84
        L82:
            android.net.Uri r6 = android.net.Uri.EMPTY
        L84:
            com.bytedance.lynx.hybrid.i18n.SparkI18nManager r2 = com.bytedance.lynx.hybrid.i18n.SparkI18nManager.LIZ
            X.0qC3 r1 = new X.0qC3
            r1.<init>(r5, r3, r4, r6)
            X.0q6Z r0 = new X.0q6Z
            r0.<init>()
            r2.getClass()
            com.bytedance.lynx.hybrid.i18n.SparkI18nManager.LIZLLL(r1, r0)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1537710q7N.LJJIIJ(java.util.Map):void");
    }

    @Override // X.InterfaceC1541990qEH
    public final void LLD(boolean z) {
        C1537910q7h c1537910q7h;
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        InterfaceC1530230pvJ interfaceC1530230pvJ;
        HybridSchemaParam hybridSchemaParam;
        Forest forest;
        Forest forest2;
        String str;
        Object next;
        getHybridContext().lifecycleState = Lifecycle.State.DESTROYED;
        InterfaceC1538820q9A interfaceC1538820q9A = null;
        this.LLJJJ = null;
        CoroutineContext coroutineContext = this.LLJJIJI;
        if (coroutineContext != null) {
            C23118094a.LIZJ(coroutineContext, null);
        }
        C1539580qAO c1539580qAO = this.LLJJIJIIJIL;
        if (c1539580qAO != null) {
            c1539580qAO.LJII();
        }
        this.LLJJ = z;
        C1537910q7h c1537910q7h2 = this.LLILZ;
        if (c1537910q7h2 != null && c1537910q7h2.LJJIJ) {
            C1743710vTd.LIZ(getHybridContext());
        }
        InterfaceC1539090q9b interfaceC1539090q9b = (AbstractC1539020q9U) getHybridContext().LJFF(AbstractC1539020q9U.class);
        if (interfaceC1539090q9b != null) {
            while (true) {
                interfaceC1539090q9b.LIZ(this);
                if ((interfaceC1539090q9b instanceof InterfaceC1537460q6y) && ((next = ((InterfaceC1537460q6y) interfaceC1539090q9b).next()) == null || !(next instanceof InterfaceC1539090q9b) || (interfaceC1539090q9b = (InterfaceC1539090q9b) next) == null)) {
                    break;
                }
            }
        }
        C1537910q7h c1537910q7h3 = this.LLILZ;
        if (c1537910q7h3 != null && (str = c1537910q7h3.LJIILJJIL) != null) {
            C1299370jux.LIZ.getClass();
            C1299370jux.LIZLLL(str);
        }
        C1537910q7h c1537910q7h4 = this.LLILZ;
        if (c1537910q7h4 != null && (hybridSchemaParam = c1537910q7h4.LJJIIJ) != null && hybridSchemaParam.getLockResource()) {
            String str2 = getHybridContext().containerId;
            if (C1529760puY.LIZ().remove(str2) != null) {
                JSONArray jSONArray = C1533710q0v.LIZ;
                IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(getHybridContext(), false);
                if (iResourceServiceXLIZIZ != null && (forest2 = iResourceServiceXLIZIZ.getForest()) != null) {
                    forest2.closeSession(str2);
                }
            } else if (hybridSchemaParam.getSessionId() != null && C1529760puY.LIZ().containsKey(hybridSchemaParam.getSessionId())) {
                List list = (List) C1529760puY.LIZ().get(hybridSchemaParam.getSessionId());
                if (list != null) {
                    list.remove(str2);
                }
                List list2 = (List) C1529760puY.LIZ().get(hybridSchemaParam.getSessionId());
                if (list2 != null && list2.isEmpty()) {
                    JSONArray jSONArray2 = C1533710q0v.LIZ;
                    IResourceServiceX iResourceServiceXLIZIZ2 = C1533710q0v.LIZIZ(getHybridContext(), false);
                    if (iResourceServiceXLIZIZ2 != null && (forest = iResourceServiceXLIZIZ2.getForest()) != null) {
                        forest.closeSession(hybridSchemaParam.getSessionId());
                    }
                    C1529760puY.LIZ().remove(hybridSchemaParam.getSessionId());
                }
            }
        }
        C1521690phX c1521690phX = (C1521690phX) getHybridContext().LJFF(C1521690phX.class);
        if (c1521690phX != null && (interfaceC1530230pvJ = c1521690phX.LIZLLL) != null) {
            interfaceC1530230pvJ.n5();
        }
        getHybridContext().LJJIII(C1521690phX.class);
        getHybridContext().LJJIII(C1530580pvs.class);
        getHybridContext().LJJIII(C1532310pyf.class);
        getHybridContext().LJJIII(TemplateBundle.class);
        this.LLJILLL = null;
        C1537910q7h c1537910q7h5 = this.LLILZ;
        if (c1537910q7h5 != null) {
            interfaceC1538820q9A = c1537910q7h5.LJJIII;
        }
        this.LLILZIL = interfaceC1538820q9A;
        this.LLILZLL = this.LLIZLLLIL;
        super.destroy();
        JSONArray jSONArray3 = C1533710q0v.LIZ;
        C1533710q0v.LJIILIIL(getHybridContext());
        this.LLJJJIL = true;
        if (C1535880q4Q.LIZLLL && (c1537910q7h = this.LLILZ) != null && (copyOnWriteArrayList = c1537910q7h.LJJJIL) != null) {
            copyOnWriteArrayList.clear();
        }
    }

    @Override // X.InterfaceC1541990qEH
    public final void U0(Map<String, ? extends Object> map) {
        Object c098200Yq;
        try {
            updateGlobalProps(map);
            C1537910q7h c1537910q7h = this.LLILZ;
            if (c1537910q7h != null) {
                c1537910q7h.LIZLLL(map);
            }
            LIZ("globalPropsUpdated", null);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateGlobalPropsByIncrement failed, error = ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "LynxKit");
        }
    }

    @Override // X.InterfaceC1541990qEH
    public final void V0(String str) {
        resetData(TemplateData.LJIIIIZZ(str));
    }

    @Override // X.InterfaceC1541990qEH
    public final void W0(Context context) {
        InterfaceC1538820q9A interfaceC1538820q9A;
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null && (interfaceC1538820q9A = c1537910q7h.LJJIII) != null) {
            interfaceC1538820q9A.LJII(context);
        }
        C1537910q7h c1537910q7h2 = this.LLILZ;
        if (c1537910q7h2 != null && c1537910q7h2.LJJIIZI) {
            startLynxRuntime();
            C1537910q7h c1537910q7h3 = this.LLILZ;
            if (c1537910q7h3 != null) {
                c1537910q7h3.LJJIIZI = false;
            }
        }
    }

    @Override // X.InterfaceC1541990qEH
    public final void b1(Map<String, ? extends Object> map) {
        resetData(TemplateData.LJII(map));
    }

    @Override // X.InterfaceC1541990qEH
    public final void d1(String str) {
        updateData(str, (String) null);
    }

    @Override // com.lynx.tasm.LynxView, X.C1310660kDA, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.LLILLJJLI && getWidth() > 0 && getHeight() > 0) {
            this.LLILLJJLI = false;
            C1530570pvr.LIZIZ(getHybridContext(), "first_draw");
        }
        super.dispatchDraw(canvas);
        if (this.LLJJI) {
            C1539580qAO c1539580qAO = this.LLJJIJIIJIL;
            if (c1539580qAO != null) {
                c1539580qAO.LJIILIIL = true;
                c1539580qAO.LJIIIZ(new C1539030q9V(c1539580qAO), true);
            }
            this.LLJJI = false;
        }
    }

    @Override // X.InterfaceC1541990qEH
    public final void f1(SparkSchemaParam sparkSchemaParam) {
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null) {
            c1537910q7h.LJJIIJ = sparkSchemaParam;
        }
        C1530580pvs c1530580pvs = (C1530580pvs) getHybridContext().LJFF(C1530580pvs.class);
        if (c1530580pvs == null) {
            c1530580pvs = new C1530580pvs();
            getHybridContext().LJJ(C1530580pvs.class, c1530580pvs);
        }
        C1530580pvs.LIZ(c1530580pvs, getContext(), this.LLILLL, getHybridContext());
        if (!this.LLJJIII) {
            boolean z = C1536390q5F.LIZ;
            C1536390q5F.LJFF(getHybridContext());
        }
    }

    @Override // X.InterfaceC1541990qEH
    public final void load(String str) {
        String strApplyGlobalLoadUrl;
        Uri uriLIZ;
        C1539580qAO c1539580qAOLIZIZ;
        Uri uriLIZ2;
        C1537480q70 hybridContext;
        String string;
        String str2 = "";
        long jLIZJ = C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.LOAD_START, EnumC1537220q6a.SPARK_LOAD_PAGE_START}, Long.valueOf(System.currentTimeMillis()));
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
        if (c1538050q7v == null || (strApplyGlobalLoadUrl = c1538050q7v.applyGlobalLoadUrl(str)) == null) {
            strApplyGlobalLoadUrl = str;
        }
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null) {
            c1537910q7h.LJI(UriProtector.parse(str));
        }
        C1537910q7h c1537910q7h2 = this.LLILZ;
        if (c1537910q7h2 != null) {
            uriLIZ = c1537910q7h2.LIZ();
        } else {
            uriLIZ = null;
        }
        try {
            String strLIZ = AnonymousClass0187.LIZ(uriLIZ, getHybridContext().LJIIJJI());
            if (uriLIZ == null || (string = uriLIZ.toString()) == null) {
                string = "";
            }
            putParamsForReportingEvents(C2097608Jq.LJIIIIZZ(new Pair("page_id", strLIZ), new Pair("schema", string)));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1537910q7h c1537910q7h3 = this.LLILZ;
            if (c1537910q7h3 != null) {
                uriLIZ2 = c1537910q7h3.LIZ();
            } else {
                uriLIZ2 = null;
            }
            linkedHashMap.put("last_lynx_url", String.valueOf(uriLIZ2));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C1529870puj.LIZ.getClass();
            Iterator it2 = ((LinkedHashMap) C1529870puj.LIZLLL()).entrySet().iterator();
            while (it2.hasNext()) {
                InterfaceC1541990qEH interfaceC1541990qEH = (InterfaceC1541990qEH) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (interfaceC1541990qEH != null && (hybridContext = interfaceC1541990qEH.getHybridContext()) != null) {
                    arrayList.add(hybridContext.LJIJI());
                    arrayList2.add(hybridContext.LJIIJJI());
                }
            }
            linkedHashMap.put("recent_lynx_url_list", arrayList.toString());
            linkedHashMap.put("lynx_instance_num", String.valueOf(arrayList.size()));
            linkedHashMap.put("lynx_version", LynxEnv.inst().getLynxVersion());
            Npth.addTags(linkedHashMap);
            C1520970pgN c1520970pgN = C1520970pgN.LIZ;
            String strLJIJI = getHybridContext().LJIJI();
            EnumC1520910pgH enumC1520910pgH = EnumC1520910pgH.LYNX;
            c1520970pgN.getClass();
            C1520970pgN.LIZIZ(strLJIJI, enumC1520910pgH, arrayList2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1490740otc.LIZIZ(C1490740otc.LIZ, String.valueOf(th2.getMessage()), EnumC1490770otf.E, null, 4);
        }
        C1537860q7c c1537860q7c = this.LLIZLLLIL;
        if (c1537860q7c != null) {
            c1537860q7c.LJLIIL(this, strApplyGlobalLoadUrl);
        }
        if (TextUtils.isEmpty(strApplyGlobalLoadUrl)) {
            String str3 = getHybridContext().containerId;
            String str4 = getHybridContext().vaid;
            if (str4 != null) {
                str2 = str4;
            }
            getHybridContext();
            C1520080pew.LJ(this, str3, new C1520180pf6(201, "url cannot be empty", str2));
            new AndroidRuntimeException("url cannot be empty");
            C1537860q7c c1537860q7c2 = this.LLIZLLLIL;
            if (c1537860q7c2 != null) {
                C1542120qEU c1542120qEU = new C1542120qEU();
                c1542120qEU.LIZ = 201;
                c1542120qEU.LIZIZ = "url cannot be empty";
                c1537860q7c2.LJL(this, strApplyGlobalLoadUrl, c1542120qEU);
            }
        }
        getHybridContext().LJFF(C1538200q8A.class);
        JSModuleManager jSModuleManager = (JSModuleManager) getHybridContext().LJFF(JSModuleManager.class);
        if (jSModuleManager != null) {
            C1531420pxE.LIZ(this, jSModuleManager);
        }
        if (this.LLJJIJIIJIL == null) {
            Object obj = getHybridContext().lynxSSRRuntime;
            if (!(obj instanceof C1539580qAO) || (c1539580qAOLIZIZ = (C1539580qAO) obj) == null) {
                C1537480q70 hybridContext2 = getHybridContext();
                getContext();
                c1539580qAOLIZIZ = C1539630qAT.LIZIZ(hybridContext2, this, this.LLIZ, this.LLIZLLLIL);
            }
            this.LLJJIJIIJIL = c1539580qAOLIZIZ;
        }
        C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_TEMPLATE_START}, Long.valueOf(System.currentTimeMillis()));
        C1530570pvr.LJ(getHybridContext(), "spark_main_res_state", 1);
        C1539580qAO c1539580qAO = this.LLJJIJIIJIL;
        if (c1539580qAO != null) {
            c1539580qAO.LJIIIIZZ(strApplyGlobalLoadUrl, new C1538440q8Y(this, strApplyGlobalLoadUrl, jLIZJ));
            return;
        }
        C1533020pzo c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(getHybridContext(), false, null, 3);
        if (c1533020pzoLJIILJJIL != null) {
            LJJ(strApplyGlobalLoadUrl, jLIZJ, c1533020pzoLJIILJJIL);
            return;
        }
        IResourceServiceX iResourceServiceX = this.LLIZ;
        if (iResourceServiceX != null) {
            LJIJJ(strApplyGlobalLoadUrl, jLIZJ, iResourceServiceX);
        } else {
            LJIJI(strApplyGlobalLoadUrl);
        }
    }

    public final void setForestResponse(C1533790q13 c1533790q13) {
        this.LLJJJ = c1533790q13;
    }

    public final void setHasMarkPredecodeStatus(boolean z) {
        this.LLJJJJJIL = z;
    }

    public void setHybridContext(C1537480q70 c1537480q70) {
        this.LL = c1537480q70;
    }

    public final void setI18nResponse(C1536580q5Y c1536580q5Y) {
        this.LLJJJJ = c1536580q5Y;
    }

    public final void setLoadStatus(EnumC1538460q8a enumC1538460q8a) {
        this.LLJ = enumC1538460q8a;
        if (enumC1538460q8a == EnumC1538460q8a.LOADING) {
            LJIIZILJ();
        }
    }

    public final void setLynxSSRRuntime(C1539580qAO c1539580qAO) {
        this.LLJJIJIIJIL = c1539580qAO;
    }

    public final void setRawUrl(String str) {
        this.LLILLL = str;
    }

    @Override // com.lynx.tasm.LynxView
    public final void updateData(TemplateData templateData) {
        int i;
        AnonymousClass0957<TemplateData> anonymousClass0957;
        if (templateData == null) {
            return;
        }
        super.updateData(templateData);
        C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.LYNX_TRIGGER_UPDATE_DATA}, null);
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null && c1537910q7h.LJJI && (i = C1538470q8b.LIZ[this.LLJ.ordinal()]) != 1) {
            if (i != 2) {
                C1537910q7h c1537910q7h2 = this.LLILZ;
                if (c1537910q7h2 != null && c1537910q7h2.LJJIFFI) {
                    return;
                }
            } else {
                C1537910q7h c1537910q7h3 = this.LLILZ;
                if (c1537910q7h3 == null || (anonymousClass0957 = c1537910q7h3.LJJ) == null || !anonymousClass0957.isActive()) {
                    return;
                }
            }
            LJIILLIIL(templateData, this.LLJI);
            if (!templateData.LJ) {
                return;
            }
            templateData.LJIILL();
        }
    }

    @Override // com.lynx.tasm.LynxView, X.InterfaceC1541990qEH
    public final void updateData(Map<String, ? extends Object> map) {
        updateData(map, (String) null);
    }

    public static final void LJIILLIIL(TemplateData templateData, Map map) {
        if (templateData != null) {
            String str = templateData.LIZJ;
            Object obj = map.get(str);
            Object obj2 = obj;
            if (obj == null) {
                TemplateData templateDataLJII = TemplateData.LJII(C2097608Jq.LJ());
                templateDataLJII.LIZJ = str;
                map.put(str, templateDataLJII);
                obj2 = templateDataLJII;
            }
            ((TemplateData) obj2).LJIJJLI(templateData);
        }
    }

    public static void LJJIIJZLJL(C1537710q7N c1537710q7N, String str) {
        C432140Gx2 c432140Gx2;
        String str2;
        HybridSchemaParam hybridSchemaParamLIZJ;
        EnumC432150Gx3 enumC432150Gx3 = EnumC432150Gx3.RIGHT_BOTTOM;
        c1537710q7N.getClass();
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZIZ().LIZ && c1537710q7N.getSparkDebugSharedPref().getBoolean("enable_spark_debug_label", true)) {
            InterfaceC1531560pxS interfaceC1531560pxS = c1537710q7N.getHybridContext().hybridParams;
            if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null && hybridSchemaParamLIZJ.getHideDebugLabel()) {
                return;
            }
            if (c1537710q7N.getForeground() == null) {
                c1537710q7N.setForeground(new C432140Gx2(0));
            }
            if (enumC432150Gx3 == EnumC432150Gx3.LEFT_BOTTOM) {
                if (c1537710q7N.getHybridContext().useReuse) {
                    str2 = "Reuse-";
                } else if (c1537710q7N.getHybridContext().usePreload) {
                    str2 = "Preload-";
                } else {
                    str2 = "";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(" Spark-Lynx(");
                sbLIZ.append(LynxEnv.inst().getLynxVersion());
                sbLIZ.append(')');
                StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ));
                C1539580qAO c1539580qAO = c1537710q7N.LLJJIJIIJIL;
                if (c1539580qAO != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("-SSR (");
                    sbLIZ2.append(c1539580qAO.LJI);
                    sbLIZ2.append(") (");
                    sbLIZ2.append(c1539580qAO.LJII);
                    sbLIZ2.append(')');
                    sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (str.length() > 0) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append('-');
                    sbLIZ3.append(str);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                }
                str = sb.toString();
            }
            Drawable foreground = c1537710q7N.getForeground();
            if (!(foreground instanceof C432140Gx2) || (c432140Gx2 = (C432140Gx2) foreground) == null) {
                return;
            }
            c432140Gx2.LIZLLL.put(enumC432150Gx3, str);
            c432140Gx2.invalidateSelf();
        }
    }

    @Override // X.InterfaceC1541990qEH
    public final void LIZ(String str, JSONObject jSONObject) {
        InterfaceC1538820q9A interfaceC1538820q9A;
        C1538110q81.LIZIZ(this, str, jSONObject);
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null && (interfaceC1538820q9A = c1537910q7h.LJJIII) != null) {
            interfaceC1538820q9A.sendEvent(str, jSONObject);
        }
    }

    public final void LJIJ(final String str, final byte[] bArr) {
        Map<String, Object> mapLJIJI;
        Long l;
        C1537860q7c c1537860q7c = this.LLIZLLLIL;
        if (c1537860q7c != null) {
            c1537860q7c.LJLJJL(str, bArr);
        }
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null) {
            mapLJIJI = c1537910q7h.LJIJI();
        } else {
            mapLJIJI = null;
        }
        setGlobalProps(TemplateData.LJII(mapLJIJI));
        this.LLILLL = str;
        final long jLIZJ = C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.LOAD_START}, Long.valueOf(System.currentTimeMillis()));
        C1538200q8A c1538200q8A = this.LLJILJILJ;
        if (c1538200q8A != null && c1538200q8A.LJIIIIZZ == null && (l = c1538200q8A.LIZJ) != null) {
            c1538200q8A.LJIIIIZZ = Long.valueOf(jLIZJ - l.longValue());
        }
        boolean z = C1536390q5F.LIZ;
        C1536390q5F.LJIIIIZZ(getHybridContext(), new Runnable() { // from class: X.0q7S
            public final void LIZ() {
                C1067460dsu c1067460dsuLJIIJ;
                String str2;
                C1537910q7h c1537910q7h2;
                TemplateData templateDataLJIIIIZZ;
                C1067460dsu c1067460dsuLJIIJ2;
                long jLIZJ2 = C1530570pvr.LIZJ(this.LL.getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.I18N_FETCH_CACHE_END}, Long.valueOf(System.currentTimeMillis()));
                boolean z2 = C1536390q5F.LIZ;
                C1536390q5F.LJI(this.LL.getHybridContext(), jLIZJ2 - jLIZJ);
                C1537910q7h c1537910q7h3 = this.LL.LLILZ;
                AnonymousClass0957<TemplateData> anonymousClass0957 = c1537910q7h3 != null ? c1537910q7h3.LJJ : null;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                JSONObject jSONObject = HybridSettings.INSTANCE.get("hybrid_merge_init_data");
                if (jSONObject == null || jSONObject.optBoolean("enable", true)) {
                    C1537910q7h c1537910q7h4 = this.LL.LLILZ;
                    C1537710q7N.LJIILLIIL(c1537910q7h4 != null ? c1537910q7h4.LJIJJ : null, linkedHashMap);
                    String str3 = this.LL.getHybridContext().initData;
                    if (str3 != null) {
                        TemplateData templateDataLJIIIIZZ2 = TemplateData.LJIIIIZZ(str3);
                        C1537710q7N.LJIILLIIL(templateDataLJIIIIZZ2, linkedHashMap);
                        templateDataLJIIIIZZ2.LJIILL();
                    }
                    C1537910q7h c1537910q7h5 = this.LL.LLILZ;
                    C1537710q7N.LJIILLIIL((c1537910q7h5 == null || (c1067460dsuLJIIJ = c1537910q7h5.LJIIJ()) == null) ? null : c1067460dsuLJIIJ.LIZ, linkedHashMap);
                } else {
                    C1537910q7h c1537910q7h6 = this.LL.LLILZ;
                    if ((c1537910q7h6 != null && (c1067460dsuLJIIJ2 = c1537910q7h6.LJIIJ()) != null && (templateDataLJIIIIZZ = c1067460dsuLJIIJ2.LIZ) != null) || (((str2 = this.LL.getHybridContext().initData) != null && (templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(str2)) != null) || ((c1537910q7h2 = this.LL.LLILZ) != null && (templateDataLJIIIIZZ = c1537910q7h2.LJIJJ) != null))) {
                        C1537710q7N.LJIILLIIL(templateDataLJIIIIZZ, linkedHashMap);
                    }
                }
                C1530570pvr.LIZIZ(this.LL.getHybridContext(), "spark_get_init_data_url_start");
                Map<String, Object> mapLJIIJ = this.LL.getHybridContext().LJIIJ();
                if (mapLJIIJ != null) {
                    C1537710q7N c1537710q7N = this.LL;
                    C1520080pew.LJFF(c1537710q7N.getHybridContext().containerId, "init_data_url", "mergeInitData", null, c1537710q7N.getHybridContext().LJIJI(), c1537710q7N.getHybridContext().bid, null, "createView", 72);
                    C1537710q7N.LJIILLIIL(TemplateData.LJII(C2097908Jt.LIZJ(new Pair("initDataRes", mapLJIIJ))), linkedHashMap);
                    c1537710q7N.U0(C2097908Jt.LIZJ(new Pair("hasInitDataRes", Boolean.TRUE)));
                }
                C1530570pvr.LIZIZ(this.LL.getHybridContext(), "spark_get_init_data_url_end");
                C1530570pvr.LIZJ(this.LL.getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.SPARK_LOAD_ENGINE_INNER}, null);
                if (anonymousClass0957 == null || anonymousClass0957.isCancelled()) {
                    this.LL.LJJIIZ(bArr, linkedHashMap, str, jLIZJ2);
                    this.LL.LJIIZILJ();
                } else if (anonymousClass0957.isCompleted()) {
                    C23250099c.LIZLLL(this.LL.getScope(), C0PEM.LIZIZ, null, new C598020Ncu(this.LL, linkedHashMap, anonymousClass0957, bArr, str, jLIZJ2, null), 2);
                } else {
                    this.LL.LJJIIZ(bArr, linkedHashMap, str, jLIZJ2);
                    C23250099c.LIZLLL(this.LL.getScope(), null, null, new C598010Nct(anonymousClass0957, this.LL, linkedHashMap, null), 3);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LynxKitView@5201.load$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LynxKitView@5201.load$2");
            }
        });
    }

    public final void LJJIJ(String str, List<? extends Object> list) {
        Object c098200Yq;
        try {
            if (this.LLJILLL == null) {
                this.LLJILLL = LynxView.class.getDeclaredMethod("triggerEventBus", String.class, List.class);
            }
            Method method = this.LLJILLL;
            if (method != null) {
                method.setAccessible(true);
            }
            Method method2 = this.LLJILLL;
            if (method2 != null) {
                c098200Yq = method2.invoke(this, str, list);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C1490740otc.LIZ.LIZ("triggerEventBus failed, please make sure lynx version is NOT less than 2.4", EnumC1490770otf.E, "HybridKit");
        }
    }

    @Override // X.InterfaceC1541990qEH
    public final void X0(String str, List<? extends Object> list) {
        JavaOnlyArray javaOnlyArray;
        C1538110q81.LIZ(this, str, list);
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null && c1537910q7h.LJJIJ) {
            if (list != null) {
                javaOnlyArray = JavaOnlyArray.from(list);
            } else {
                javaOnlyArray = new JavaOnlyArray();
            }
            sendGlobalEvent(str, javaOnlyArray);
            return;
        }
        LJJIJ(str, list);
    }

    @Override // X.InterfaceC1541990qEH
    public final void Y0(String str, Map<String, ? extends Object> map) {
        InterfaceC1538820q9A interfaceC1538820q9A;
        C1538110q81.LIZJ(this, str, map);
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null && (interfaceC1538820q9A = c1537910q7h.LJJIII) != null) {
            interfaceC1538820q9A.LIZ();
        }
    }

    @Override // X.InterfaceC1541990qEH
    public final void c1(String str, Map<String, ? extends Object> map) {
        TemplateData templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(str);
        Set<Map.Entry> setEntrySet = ((LinkedHashMap) map).entrySet();
        if (setEntrySet != null) {
            for (Map.Entry entry : setEntrySet) {
                templateDataLJIIIIZZ.LJIILIIL((String) entry.getKey(), entry.getValue());
            }
        }
        templateDataLJIIIIZZ.LJ = true;
        updateData(templateDataLJIIIIZZ);
    }

    @Override // com.lynx.tasm.LynxView
    public final void updateData(String str, String str2) {
        TemplateData templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(str);
        templateDataLJIIIIZZ.LIZJ = str2;
        templateDataLJIIIIZZ.LJ = true;
        updateData(templateDataLJIIIIZZ);
    }

    @Override // com.lynx.tasm.LynxView
    public final void updateData(Map<String, ?> map, String str) {
        TemplateData templateDataLJII = TemplateData.LJII(map);
        templateDataLJII.LIZJ = str;
        templateDataLJII.LJ = true;
        updateData(templateDataLJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[PHI: r10
      0x0080: PHI (r10v2 com.lynx.tasm.TemplateBundle) = (r10v0 com.lynx.tasm.TemplateBundle), (r10v5 com.lynx.tasm.TemplateBundle) binds: [B:22:0x0070, B:26:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.lynx.tasm.TemplateBundle LJJIIZI(X.C1532310pyf r8, X.C1537710q7N r9, com.lynx.tasm.TemplateBundle r10) {
        /*
            boolean r0 = X.C1535630q41.LJIL
            if (r0 == 0) goto L52
            r4 = 0
            r3 = 0
            if (r8 == 0) goto Lac
            X.0q4a r2 = X.C1535980q4a.LIZ
            X.0pzJ r1 = r8.LIZ
            X.0pyT r0 = r8.LJII
            r2.getClass()
            java.lang.String r5 = "LynxKitView"
            X.0q4j r7 = X.C1535980q4a.LIZ(r5, r1, r0, r4)
            r6 = 1
            if (r7 == 0) goto L53
            boolean r0 = r7.isSuccess()
            if (r0 != r6) goto L53
            X.0q70 r4 = r9.getHybridContext()
            X.0q8B r2 = new X.0q8B
            X.0q70 r0 = r9.getHybridContext()
            r2.<init>(r0, r3)
            X.0q4o r0 = r7.LIZ
            java.lang.String r1 = r0.LIZIZ()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r2.LIZIZ
            if (r0 == 0) goto L3a
            r0.put(r1, r7)
        L3a:
            r4.codeCacheInfo = r2
            X.0q70 r2 = r9.getHybridContext()
            X.0q6T r1 = X.EnumC1537150q6T.OPT_LYNX_CODE_CACHE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            X.C1530570pvr.LJFF(r2, r1, r0)
            X.0q4o r0 = r7.LIZ
            java.lang.String r0 = r0.LIZIZ()
            r9.setEnableUserCodeCache(r6, r0)
        L52:
            return r10
        L53:
            X.0q7h r0 = r9.LLILZ
            if (r0 == 0) goto La3
            com.bytedance.lynx.hybrid.param.HybridSchemaParam r0 = r0.LJJIIJ
            if (r0 == 0) goto La3
            int r0 = r0.getEnableCodeCache()
            if (r0 != r6) goto La3
        L61:
            X.0q70 r2 = r9.getHybridContext()
            X.0q8B r1 = new X.0q8B
            X.0q70 r0 = r9.getHybridContext()
            r1.<init>(r0, r6)
            r2.codeCacheInfo = r1
            if (r10 != 0) goto L80
            java.lang.Class<com.lynx.tasm.TemplateBundle> r0 = com.lynx.tasm.TemplateBundle.class
            X.0pyj r0 = r8.LJIIL(r0)
            if (r0 == 0) goto La1
            Type r10 = r0.LIZ
            com.lynx.tasm.TemplateBundle r10 = (com.lynx.tasm.TemplateBundle) r10
            if (r10 == 0) goto L87
        L80:
            X.0pzJ r1 = r8.LIZ
            X.0pyT r0 = r8.LJII
            X.C1535980q4a.LIZLLL(r5, r1, r0, r10)
        L87:
            X.0q70 r0 = r9.getHybridContext()
            X.0q8B r0 = r0.codeCacheInfo
            if (r0 == 0) goto L9d
            X.0q70 r2 = r9.getHybridContext()
            X.0q6T r1 = X.EnumC1537150q6T.OPT_LYNX_CODE_CACHE
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C1530570pvr.LJFF(r2, r1, r0)
        L9d:
            r9.setEnableUserCodeCache(r3, r4)
            return r10
        La1:
            r10 = r4
            goto L87
        La3:
            if (r7 == 0) goto L87
            boolean r0 = r7.LIZIZ()
            if (r0 != r6) goto L87
            goto L61
        Lac:
            X.0q70 r2 = r9.getHybridContext()
            X.0q6T r1 = X.EnumC1537150q6T.OPT_LYNX_CODE_CACHE
            r0 = -2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C1530570pvr.LJFF(r2, r1, r0)
            r9.setEnableUserCodeCache(r3, r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1537710q7N.LJJIIZI(X.0pyf, X.0q7N, com.lynx.tasm.TemplateBundle):com.lynx.tasm.TemplateBundle");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(java.lang.String r12, long r13, com.bytedance.lynx.hybrid.service.IResourceServiceX r15) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1537710q7N.LJIJJ(java.lang.String, long, com.bytedance.lynx.hybrid.service.IResourceServiceX):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105 A[PHI: r7
      0x0105: PHI (r7v1 boolean) = (r7v0 boolean), (r7v3 boolean), (r7v3 boolean) binds: [B:55:0x0101, B:8:0x000e, B:10:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(java.lang.String r13, long r14, X.C1533020pzo r16) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1537710q7N.LJJ(java.lang.String, long, X.0pzo):void");
    }

    @Override // com.lynx.tasm.LynxView
    public final void renderSSR(byte[] bArr, String str, TemplateData templateData) {
        super.renderSSR(bArr, str, templateData);
        this.LLJJI = true;
    }

    public final void LJIL(String str, C1533790q13 c1533790q13, int i, String str2) {
        String strLIZIZ;
        C1533490q0Z c1533490q0Z;
        String str3;
        C1533810q15 c1533810q15;
        if (c1533790q13 == null || (c1533810q15 = c1533790q13.LIZLLL) == null || (strLIZIZ = c1533810q15.toString()) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cannot get response from url: ");
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append(", ");
        sbLIZ2.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        C1530570pvr.LJFF(getHybridContext(), EnumC1537150q6T.RESOURCE_LOAD_FAIL_DETAIL, strLIZIZ2);
        String str4 = getHybridContext().containerId;
        String str5 = getHybridContext().vaid;
        if (str5 == null) {
            str5 = "";
        }
        getHybridContext();
        C1520080pew.LJ(this, str4, new C1520180pf6(i, strLIZIZ2, str5));
        C1490740otc.LIZ.LIZ(strLIZIZ2, EnumC1490770otf.E, "LynxKit");
        C1537860q7c c1537860q7c = this.LLIZLLLIL;
        if (c1537860q7c != null) {
            if (c1533790q13 != null && (c1533490q0Z = c1533790q13.LIZ) != null && (str3 = c1533490q0Z.LJJJJIZL) != null) {
                str = str3;
            }
            C1542120qEU c1542120qEU = new C1542120qEU();
            c1542120qEU.LIZ = Integer.valueOf(i);
            c1542120qEU.LIZIZ = strLIZIZ2;
            c1542120qEU.LIZLLL = strLIZIZ;
            c1537860q7c.LJL(this, str, c1542120qEU);
        }
        C1537860q7c c1537860q7c2 = this.LLIZLLLIL;
        if (c1537860q7c2 != null) {
            c1537860q7c2.LJLIIIL(this);
        }
    }

    public final void LJJI(String str, C1532310pyf c1532310pyf, int i, String str2) {
        String strLIZIZ;
        C1532710pzJ c1532710pzJ;
        C1532720pzK c1532720pzK;
        String str3;
        C1532480pyw c1532480pyw;
        C1530570pvr.LJ(getHybridContext(), "spark_main_res_state", 1);
        if (c1532310pyf == null || (c1532480pyw = c1532310pyf.LIZJ) == null || (strLIZIZ = c1532480pyw.LIZJ()) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cannot get response from url: ");
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append(", ");
        sbLIZ2.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        C1530570pvr.LJFF(getHybridContext(), EnumC1537150q6T.RESOURCE_LOAD_FAIL_DETAIL, strLIZIZ2);
        C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_TEMPLATE_END}, null);
        String str4 = getHybridContext().containerId;
        String str5 = getHybridContext().vaid;
        if (str5 == null) {
            str5 = "";
        }
        getHybridContext();
        C1520080pew.LJ(this, str4, new C1520180pf6(i, strLIZIZ2, str5));
        C1490740otc.LIZ.LIZ(strLIZIZ2, EnumC1490770otf.E, "LynxKit");
        C1537860q7c c1537860q7c = this.LLIZLLLIL;
        if (c1537860q7c != null) {
            if (c1532310pyf != null && (c1532710pzJ = c1532310pyf.LIZ) != null && (c1532720pzK = c1532710pzJ.LJJIII) != null && (str3 = c1532720pzK.LIZ) != null) {
                str = str3;
            }
            C1542120qEU c1542120qEU = new C1542120qEU();
            c1542120qEU.LIZ = Integer.valueOf(i);
            c1542120qEU.LIZIZ = strLIZIZ2;
            c1542120qEU.LIZLLL = strLIZIZ;
            c1537860q7c.LJL(this, str, c1542120qEU);
        }
        C1537860q7c c1537860q7c2 = this.LLIZLLLIL;
        if (c1537860q7c2 != null) {
            c1537860q7c2.LJLIIIL(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> LJJIII(com.lynx.tasm.TemplateBundle r4, byte[] r5, java.nio.ByteBuffer r6, java.lang.String r7) throws java.lang.Throwable {
        /*
            r3 = this;
            X.0q7h r0 = r3.LLILZ
            r2 = 0
            if (r0 == 0) goto Lb
            com.lynx.tasm.TemplateBundle r0 = r0.LJIILLIIL()
            if (r0 != 0) goto L38
        Lb:
            X.0q7h r1 = r3.LLILZ
            if (r1 == 0) goto L38
            if (r4 != 0) goto L35
            if (r5 == 0) goto L24
            X.0q7I r0 = new X.0q7I
            r0.<init>()
            r0.LIZ = r7
            X.0q7J r0 = r0.LIZ()
            com.lynx.tasm.TemplateBundle r4 = com.lynx.tasm.TemplateBundle.LIZIZ(r5, r0)
            if (r4 != 0) goto L35
        L24:
            if (r6 == 0) goto L47
            X.0q7I r0 = new X.0q7I
            r0.<init>()
            r0.LIZ = r7
            X.0q7J r0 = r0.LIZ()
            com.lynx.tasm.TemplateBundle r4 = com.lynx.tasm.TemplateBundle.LIZ(r6, r0)
        L35:
            r1.LJJIII(r4)
        L38:
            X.0q7h r0 = r3.LLILZ
            if (r0 == 0) goto L46
            com.lynx.tasm.TemplateBundle r0 = r0.LJIILLIIL()
            if (r0 == 0) goto L46
            java.util.Map r2 = r0.LIZJ()
        L46:
            return r2
        L47:
            r4 = r2
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1537710q7N.LJJIII(com.lynx.tasm.TemplateBundle, byte[], java.nio.ByteBuffer, java.lang.String):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(byte[] r25, java.util.Map<java.lang.String, com.lynx.tasm.TemplateData> r26, java.lang.String r27, long r28) {
        /*
            Method dump skipped, instruction units count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1537710q7N.LJJIIZ(byte[], java.util.Map, java.lang.String, long):void");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.0q7c, X.0q7d] */
    public C1537710q7N(Context context, C1537480q70 c1537480q70, C1309760kBi c1309760kBi, C1537910q7h c1537910q7h, final C1537790q7V c1537790q7V) {
        C1539580qAO c1539580qAOLIZIZ;
        String str;
        InterfaceC1538820q9A interfaceC1538820q9A;
        AbstractC1311330kEF abstractC1311330kEF;
        Map<Class<?>, ? extends Object> map;
        InterfaceC1530230pvJ interfaceC1530230pvJ;
        List<String> listLJJLIIIJILLIZJL;
        boolean zContainsKey;
        super(context, c1309760kBi);
        this.LL = c1537480q70;
        this.LLILLJJLI = true;
        this.LLJ = EnumC1538460q8a.INIT;
        this.LLJI = new LinkedHashMap();
        C1538200q8A c1538200q8A = (C1538200q8A) getHybridContext().LJFF(C1538200q8A.class);
        this.LLJILJILJ = c1538200q8A;
        this.LLJJ = true;
        this.LLJJIJIL = C452501pT.LIZ(EnumC452301pR.NONE, new C1611406Sq(this));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new C1538760q94(context));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("last_lynx_url", getHybridContext().LJIJI());
        Npth.addTags(linkedHashMap);
        C1520970pgN c1520970pgN = C1520970pgN.LIZ;
        String strLJIJI = getHybridContext().LJIJI();
        EnumC1520910pgH enumC1520910pgH = EnumC1520910pgH.LYNX;
        c1520970pgN.getClass();
        C1520970pgN.LIZIZ(strLJIJI, enumC1520910pgH, null);
        if (c1538200q8A != null) {
            c1538200q8A.LJFF = Long.valueOf(System.currentTimeMillis());
        }
        this.LLJILJIL = (C1537550q77) getHybridContext().LJFF(C1537550q77.class);
        JSONArray jSONArray = C1533710q0v.LIZ;
        IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(getHybridContext(), false);
        this.LLIZ = iResourceServiceXLIZIZ;
        boolean z = C1536390q5F.LIZ;
        this.LLJJIII = C1536390q5F.LJFF(getHybridContext());
        this.LLILZ = c1537910q7h;
        this.LLILLL = String.valueOf(c1537910q7h.LIZ());
        ?? r2 = new AbstractC1537870q7d(c1537790q7V) { // from class: X.0q7c
            public final AbstractC1537870q7d LL;

            @Override // X.AbstractC1537870q7d
            public final void LJJJZ() {
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJJJZ();
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLILLLLZI() {
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJLILLLLZI();
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLJJI() {
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJLJJI();
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void onDestroy() {
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.onDestroy();
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJJJJL(Map<String, ? extends Object> map2) {
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJJJJL(map2);
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJJZ(InterfaceC1541990qEH interfaceC1541990qEH) {
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJJZ(interfaceC1541990qEH);
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJLIIIL(interfaceC1541990qEH);
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJLJI(interfaceC1541990qEH);
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLJJLL(EnumC1067640dtC enumC1067640dtC) {
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJLJJLL(enumC1067640dtC);
                }
            }

            {
                super((Object) null);
                this.LL = c1537790q7V;
            }

            @Override // X.AbstractC1537870q7d
            public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str2) {
                this.LLILLJJLI.setLoadStatus(EnumC1538460q8a.FAIL);
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJJZZIII(interfaceC1541990qEH, str2);
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str2) {
                this.LLILLJJLI.setLoadStatus(EnumC1538460q8a.LOADING);
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJLIIL(interfaceC1541990qEH, str2);
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLJJL(String str2, byte[] bArr) {
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJLJJL(str2, bArr);
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str2, C1542120qEU c1542120qEU) {
                this.LLILLJJLI.setLoadStatus(EnumC1538460q8a.FAIL);
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJL(interfaceC1541990qEH, str2, c1542120qEU);
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str2, String str3) {
                this.LLILLJJLI.setLoadStatus(EnumC1538460q8a.FAIL);
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJLI(interfaceC1541990qEH, str2, str3);
                }
            }
        };
        this.LLIZLLLIL = r2;
        Object obj = getHybridContext().lynxSSRRuntime;
        if (!(obj instanceof C1539580qAO) || (c1539580qAOLIZIZ = (C1539580qAO) obj) == null) {
            C1537480q70 hybridContext = getHybridContext();
            getContext();
            c1539580qAOLIZIZ = C1539630qAT.LIZIZ(hybridContext, this, iResourceServiceXLIZIZ, r2);
        }
        this.LLJJIJIIJIL = c1539580qAOLIZIZ;
        if (c1539580qAOLIZIZ != null) {
            c1539580qAOLIZIZ.LIZIZ = this;
            c1539580qAOLIZIZ.LIZJ = iResourceServiceXLIZIZ;
            c1539580qAOLIZIZ.LIZLLL = r2;
        }
        C1536590q5Z c1536590q5Z = new C1536590q5Z(this, c1537910q7h, iResourceServiceXLIZIZ);
        c1536590q5Z.LLILZIL = r2;
        c1536590q5Z.LLILZLL = getHybridContext();
        addLynxViewClient(c1536590q5Z);
        String strLJIILIIL = c1537910q7h.LJIILIIL();
        if (strLJIILIIL != null && strLJIILIIL.length() != 0 && strLJIILIIL != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJIILIIL, new String[]{","}, 0, 6)) != null) {
            for (String str2 : listLJJLIIIJILLIZJL) {
                synchronized (C1300980jxY.class) {
                    zContainsKey = ((HashMap) C1300980jxY.LIZ).containsKey(str2);
                }
                if (!zContainsKey) {
                    C1300980jxY.LIZIZ(str2, C1202420hOa.LIZ().getAssets());
                }
            }
        }
        C1530570pvr.LJ(getHybridContext(), "spark_main_res_state", -1);
        C1521690phX c1521690phX = (C1521690phX) getHybridContext().LJFF(C1521690phX.class);
        if (c1521690phX != null) {
            C1520380pfQ.LIZ.getClass();
            if (C1520380pfQ.LJIILJJIL) {
                c1521690phX.LIZIZ = new WeakReference<>(this);
            } else {
                c1521690phX.LIZJ = this;
            }
        }
        C1521690phX c1521690phX2 = (C1521690phX) getHybridContext().LJFF(C1521690phX.class);
        if (c1521690phX2 != null && (interfaceC1530230pvJ = c1521690phX2.LIZLLL) != null) {
            interfaceC1530230pvJ.o5(this);
        }
        getHybridContext().LJIIIZ().LIZIZ(this, "lynx");
        LynxViewMonitor.Companion.getClass();
        LynxViewMonitor lynxViewMonitor = LynxViewMonitor.INSTANCE;
        lynxViewMonitor.addContext((LynxView) this, "ui_type", getHybridContext().uiType.getType());
        if (getHybridContext().coldStartEngine) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        lynxViewMonitor.addContext((LynxView) this, "is_cold_start", str);
        lynxViewMonitor.addContext((LynxView) this, "from_new_lynx_resource_interface", getHybridContext().useGenericFetcher ? "1" : CardStruct.IStatusCode.DEFAULT);
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        InterfaceC1311300kEC interfaceC1311300kEC = C1161970gLL.LIZIZ().LJ;
        if ((interfaceC1311300kEC instanceof C1311190kE1) && (abstractC1311330kEF = ((C1311190kE1) interfaceC1311300kEC).LJI) != null && (map = abstractC1311330kEF.LIZ) != null) {
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                Class<?> cls = (Class) entry.getKey();
                Object value = entry.getValue();
                try {
                    C1289410jet c1289410jetLIZ = C1289420jeu.LIZ(this);
                    if (c1289410jetLIZ != null) {
                        c1289410jetLIZ.LIZ(cls, value);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1490740otc.LIZ.LIZ("Krypton Player require Lynx >= 2.10", EnumC1490770otf.E, "LynxKitView");
                }
            }
        }
        if (this.LLJJIJIIJIL == null) {
            LJJIJIIJI();
        }
        C1529870puj.LIZ.getClass();
        C1529870puj.LIZIZ(this);
        C1537910q7h c1537910q7h2 = this.LLILZ;
        if (c1537910q7h2 != null && (interfaceC1538820q9A = c1537910q7h2.LJJIII) != null) {
            interfaceC1538820q9A.LJI(context, this, this.LLJILJIL);
            interfaceC1538820q9A.LJ();
        }
        getHybridContext().LJJIIZI();
    }
}
