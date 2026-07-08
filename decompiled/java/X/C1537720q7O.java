package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.crash.Npth;
import com.bytedance.forest.Forest;
import com.bytedance.hybrid.common.autoservice.SparkAioDevtool;
import com.bytedance.lynx.hybrid.lite.LiteLynxKitViewLifecycleObserver;
import com.bytedance.lynx.hybrid.lite.autoservice.ILiteLynxApi;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
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
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q7O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537720q7O extends LynxView implements InterfaceC1541990qEH, InterfaceC647710Par, InterfaceC1105930esx {
    public static final boolean LLLII;
    public static final boolean LLLIIII;
    public static final boolean LLLIIIIL;
    public C1537480q70 LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public long LLILZ;
    public C1537910q7h LLILZIL;
    public InterfaceC1538820q9A LLILZLL;
    public AbstractC1537870q7d LLIZ;
    public IResourceServiceX LLIZLLLIL;
    public C1537550q77 LLJ;
    public C1538200q8A LLJI;
    public AbstractC1537870q7d LLJIJIL;
    public String LLJILJIL;
    public boolean LLJILJILJ;
    public Method LLJILLL;
    public EnumC1538460q8a LLJJ;
    public final Map<String, TemplateData> LLJJI;
    public Map<String, TemplateData> LLJJIII;
    public ViewGroup LLJJIJI;
    public EnumC1538160q86 LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public C1537480q70 LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public final Map<String, Object> LLJJJJJIL;
    public C1539580qAO LLJJJJLIIL;
    public LiteLynxKitViewLifecycleObserver LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public volatile AtomicBoolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public CoroutineContext LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C1538900q9I LLJZIJLIL;
    public C1533790q13 LLL;
    public final C01GW LLLF;
    public final C1538810q99 LLLFF;
    public final ViewTreeObserverOnPreDrawListenerC1538800q98 LLLFFI;
    public C1537480q70 LLLFZ;
    public volatile AtomicInteger LLLI;

    @Override // X.InterfaceC1540940qCa
    public final synchronized void LIZJ() {
        this.LLLI = new AtomicInteger(1);
    }

    @Override // X.InterfaceC1540940qCa
    public final View LJII() {
        return this;
    }

    @Override // X.InterfaceC1541990qEH
    public final boolean Z0() {
        return true;
    }

    @Override // X.InterfaceC1541990qEH
    public final void c1(String str, Map<String, ? extends Object> map) {
    }

    @Override // com.lynx.tasm.LynxView
    public final void destroy() {
        LLD(true);
    }

    @Override // X.InterfaceC1541990qEH
    public final View e1() {
        return this;
    }

    @Override // X.InterfaceC1540940qCa
    public InterfaceC1541990qEH getKitView() {
        return this;
    }

    @Override // X.InterfaceC647710Par
    public LynxView getLynxView() {
        return this;
    }

    @Override // X.InterfaceC1540940qCa
    public final void release() {
        LLD(true);
    }

    @Override // com.lynx.tasm.LynxView
    public final void reloadAndInit() {
        this.LLJJJJ = true;
        super.reloadAndInit();
    }

    static {
        Object c098200Yq;
        Object c098200Yq2;
        HybridSettings hybridSettings = HybridSettings.INSTANCE;
        JSONObject jSONObject = hybridSettings.get("invoke_resource_loader_callback_when_resue");
        LLLII = jSONObject != null ? jSONObject.optBoolean("enable", true) : true;
        try {
            JSONObject config = hybridSettings.getConfig("self_adaptive_height_on_view_pre_draw");
            c098200Yq = config != null ? Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config, "enable")) : null;
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
        LLLIIII = bool != null ? bool.booleanValue() : true;
        try {
            JSONObject config2 = HybridSettings.INSTANCE.getConfig("fix_spark_lite_loading_bug");
            c098200Yq2 = config2 != null ? Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config2, "enable")) : null;
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Boolean bool2 = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
        LLLIIIIL = bool2 != null ? bool2.booleanValue() : true;
    }

    private final Map<String, List<String>> getSessionId2Containers() {
        return (Map) this.LLJZ.getValue();
    }

    private final SharedPreferences getSparkDebugSharedPref() {
        return (SharedPreferences) this.LLLF.getValue();
    }

    @Override // X.InterfaceC1105930esx
    public final boolean LIZIZ() {
        return this.LLJJ == EnumC1538460q8a.SUCCESS;
    }

    @Override // X.InterfaceC1540940qCa
    public final void LIZLLL() {
        int i;
        boolean z;
        AtomicInteger atomicInteger = this.LLLI;
        if (atomicInteger == null) {
            C086F c086f = C086F.LIZ;
            Runnable runnable = new Runnable() { // from class: X.0P8a
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiteLynxKitView@73dd.onViewDecached$status$1$1");
                    try {
                        if (this.LL.getParent() == null) {
                            this.LL.LLD(true);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiteLynxKitView@73dd.onViewDecached$status$1$1");
                }
            };
            c086f.getClass();
            C086F.LJII(runnable);
            return;
        }
        do {
            i = atomicInteger.get();
            z = i >= 2;
        } while (!atomicInteger.compareAndSet(i, 0));
        this.LLLI = null;
        if (z) {
            return;
        }
        C086F c086f2 = C086F.LIZ;
        Runnable runnable2 = new Runnable() { // from class: X.0P8Z
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiteLynxKitView@73dd.onViewDecached$1");
                try {
                    if (this.LL.getParent() == null) {
                        this.LL.LLD(true);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiteLynxKitView@73dd.onViewDecached$1");
            }
        };
        c086f2.getClass();
        C086F.LJII(runnable2);
    }

    @Override // X.InterfaceC1540940qCa
    public final boolean LJFF() {
        AtomicInteger atomicInteger = this.LLLI;
        return atomicInteger != null && atomicInteger.compareAndSet(1, 3);
    }

    @Override // X.InterfaceC1540940qCa
    public final void LJI() {
        C1041450dCx.LIZJ(this.LLJJIJI);
    }

    public final void LJIIZILJ() {
        Iterator it2 = ((LinkedHashMap) this.LLJJI).values().iterator();
        while (it2.hasNext()) {
            ((TemplateData) it2.next()).LJIILL();
        }
        ((LinkedHashMap) this.LLJJI).clear();
    }

    public final void LJIJ() {
        ViewGroup viewGroupLJJLJ;
        if (this.LLJJIJI == null) {
            this.LLJJIJI = new FrameLayout(getContext());
        }
        ViewGroup viewGroup = this.LLJJIJI;
        if (viewGroup == null || viewGroup.getParent() != null) {
            return;
        }
        InterfaceC1538610q8p interfaceC1538610q8p = (InterfaceC1538610q8p) getHybridContext().LJFF(InterfaceC1538610q8p.class);
        if (interfaceC1538610q8p != null) {
            getContext();
            getHybridContext();
            viewGroupLJJLJ = interfaceC1538610q8p.LJJLJ();
        } else {
            viewGroupLJJLJ = null;
        }
        int i = LLLIIIIL ? -1 : 0;
        if (viewGroupLJJLJ != null) {
            viewGroupLJJLJ.addView(viewGroup, i, new FrameLayout.LayoutParams(-1, -1));
        }
        if (interfaceC1538610q8p != null) {
            interfaceC1538610q8p.LJJIIJ(getContext(), getHybridContext());
        }
    }

    @Override // X.InterfaceC1541990qEH
    public final void LJIJJLI() {
        Collection<TemplateData> collectionValues;
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZIZ().LIZ) {
            SparkAioDevtool.INSTANCE.checkLatest(this.LLJZIJLIL);
        }
        this.LLL = null;
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadSuccess: processors in loadingQueue = ");
        Map<String, TemplateData> map = this.LLJJIII;
        sbLIZ.append(map != null ? map.keySet() : null);
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "LynxKitView", 2);
        C086F c086f = C086F.LIZ;
        Runnable runnable = new Runnable() { // from class: X.0q8V
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiteLynxKitView@73dd.onLoadSuccess$1");
                try {
                    this.LL.setStatus(EnumC1538460q8a.SUCCESS);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiteLynxKitView@73dd.onLoadSuccess$1");
            }
        };
        c086f.getClass();
        C086F.LJII(runnable);
        Map<String, TemplateData> map2 = this.LLJJIII;
        if (map2 != null && (collectionValues = map2.values()) != null) {
            for (TemplateData templateData : collectionValues) {
                templateData.LJ = true;
                super.updateData(templateData);
            }
        }
        this.LLJJIII = null;
    }

    public final void LJJII() {
        HybridSchemaParam hybridSchemaParamLIZJ;
        if (this.LLJJJIL) {
            return;
        }
        String str = getHybridContext().containerId;
        String strLJIJI = getHybridContext().LJIJI();
        String str2 = getHybridContext().bid;
        InterfaceC1531560pxS interfaceC1531560pxS = getHybridContext().hybridParams;
        C1520080pew.LJFF(str, "lynx_predecode", "fetch", null, strLJIJI, str2, (interfaceC1531560pxS == null || (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) == null) ? null : hybridSchemaParamLIZJ.getSparkPerfBiz(), "succeed", 8);
        this.LLJJJIL = true;
    }

    public final void LJJIIZI() {
        String str = this.LLJILJIL;
        if (str != null) {
            C1530580pvs c1530580pvs = (C1530580pvs) getHybridContext().LJFF(C1530580pvs.class);
            if (c1530580pvs == null) {
                c1530580pvs = new C1530580pvs();
                getHybridContext().LJJ(C1530580pvs.class, c1530580pvs);
            }
            Context context = getContext();
            C1537480q70 navigateHybridContext = getNavigateHybridContext();
            if (navigateHybridContext == null) {
                navigateHybridContext = getHybridContext();
            }
            C1530580pvs.LIZ(c1530580pvs, context, str, navigateHybridContext);
        }
    }

    public final void LJJIZ() {
        HybridSchemaParam hybridSchemaParam;
        C1537910q7h c1537910q7h = this.LLILZIL;
        if (c1537910q7h != null) {
            if (c1537910q7h.LJJIIZI || ((hybridSchemaParam = c1537910q7h.LJJIIJ) != null && hybridSchemaParam.getEnablePendingJsTask())) {
                startLynxRuntime();
                C1537910q7h c1537910q7h2 = this.LLILZIL;
                if (c1537910q7h2 != null) {
                    c1537910q7h2.LJJIIZI = false;
                    HybridSchemaParam hybridSchemaParam2 = c1537910q7h2.LJJIIJ;
                    if (hybridSchemaParam2 != null) {
                        hybridSchemaParam2.setEnablePendingJsTask(false);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1541990qEH
    public Object getAndRemoveForestResponse() {
        C1533790q13 c1533790q13 = this.LLL;
        this.LLL = null;
        return c1533790q13;
    }

    @Override // X.InterfaceC1541990qEH
    public Map<String, Object> getGlobalProps() {
        C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
        return C1326430kcb.LIZ().LIZIZ(getHybridContext().containerId);
    }

    public final InterfaceC497601wk getScope() {
        return (InterfaceC497601wk) this.LLJLLL.getValue();
    }

    @Override // X.InterfaceC1541990qEH
    public final void load() {
        String str = this.LLJILJIL;
        if (str != null) {
            load(str);
        }
    }

    @Override // X.InterfaceC1541990qEH
    public final void onHide() {
        C1537910q7h c1537910q7h = this.LLILZIL;
        if (c1537910q7h == null || !c1537910q7h.LJJIJ) {
            LJJIJLIJ("viewDisappeared", null);
        } else {
            C1743710vTd.LIZIZ(getHybridContext());
        }
        onEnterBackground();
    }

    @Override // X.InterfaceC1541990qEH
    public final void onShow() {
        C1537910q7h c1537910q7h = this.LLILZIL;
        if (c1537910q7h == null || !c1537910q7h.LJJIJ) {
            LJJIJLIJ("viewAppeared", null);
        } else {
            C1743710vTd.LIZJ(getHybridContext());
        }
        onEnterForeground();
    }

    @Override // X.InterfaceC1540940qCa
    public final C1537480q70 LJIILJJIL() {
        return getHybridContext();
    }

    @Override // X.InterfaceC1541990qEH
    public final void a1() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AbstractC1537870q7d abstractC1537870q7d;
        if (getHybridContext().lifecycleState != Lifecycle.State.DESTROYED) {
            return;
        }
        this.LLL = null;
        InterfaceC1538820q9A interfaceC1538820q9A = this.LLILZLL;
        if (interfaceC1538820q9A != null) {
            interfaceC1538820q9A.onDestroy();
        }
        if (this.LLJILJILJ && (abstractC1537870q7d = this.LLIZ) != null) {
            abstractC1537870q7d.LJJJZ();
        }
        AbstractC1537870q7d abstractC1537870q7d2 = this.LLIZ;
        if (abstractC1537870q7d2 != null) {
            abstractC1537870q7d2.onDestroy();
        }
        AbstractC1537870q7d abstractC1537870q7d3 = this.LLIZ;
        if (abstractC1537870q7d3 != null) {
            abstractC1537870q7d3.LJJZ(this);
        }
        C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
        C1326430kcb.LIZ().LIZIZ.remove(getHybridContext().containerId);
        C1529870puj c1529870puj = C1529870puj.LIZ;
        String str = getHybridContext().containerId;
        c1529870puj.getClass();
        C1529870puj.LJI(this, str);
        LynxViewMonitor.Companion.getClass();
        LynxViewMonitor.INSTANCE.unregisterLynxViewMonitor(this);
        C1529830puf c1529830puf = C1537480q70.Companion;
        String str2 = getHybridContext().containerId;
        c1529830puf.getClass();
        C1529830puf.LIZLLL(str2);
        String strLIZ = C1529860pui.LIZ(getHybridContext().containerId);
        if (strLIZ != null) {
            C1529830puf.LIZLLL(strLIZ);
        }
        LiteLynxKitViewLifecycleObserver liteLynxKitViewLifecycleObserver = this.LLJJL;
        if (liteLynxKitViewLifecycleObserver == null || (lifecycleOwner = getHybridContext().lifecycleOwner) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(liteLynxKitViewLifecycleObserver);
    }

    @Override // X.InterfaceC1540940qCa
    public Context getHybridViewContext() {
        return getContext();
    }

    @Override // X.InterfaceC1540940qCa
    public C1537480q70 getPerformanceViewHybridContext() {
        return getHybridContext();
    }

    @Override // com.lynx.tasm.LynxView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            if (((Boolean) C09P3.LJ.getValue()).booleanValue()) {
                C09PF.LIZ(this, this.LLJILJIL);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.lynx.tasm.LynxView
    public final void processRender() {
        super.processRender();
        if (this.LLJJIJIL) {
            return;
        }
        this.LLJJIJIL = true;
    }

    @Override // X.InterfaceC1541990qEH
    public final void reload() throws Throwable {
        getHybridContext().LJJIJ(System.currentTimeMillis());
        AbstractC1537870q7d abstractC1537870q7d = this.LLJIJIL;
        if (abstractC1537870q7d != null) {
            String str = this.LLJILJIL;
            if (str == null) {
                str = "";
            }
            abstractC1537870q7d.LJLIIL(this, str);
        }
        C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
        LJJJ(C1326430kcb.LIZ().LIZIZ(getHybridContext().containerId));
        String str2 = this.LLJILJIL;
        if (str2 != null) {
            load(str2);
        }
    }

    @Override // X.InterfaceC1540940qCa
    public final EnumC1538460q8a LJ() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1540940qCa
    public final void LJIIIIZZ() {
        load();
    }

    @Override // X.InterfaceC1540940qCa
    public final boolean LJIIJ() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC1540940qCa
    public final void LJIIJJI() {
        onHide();
    }

    @Override // X.InterfaceC1540940qCa
    public final void LJIIL() {
        onShow();
    }

    @Override // X.InterfaceC1541990qEH
    public final boolean T0() {
        return this.LLJLIL;
    }

    public final C1533790q13 getForestResponse() {
        return this.LLL;
    }

    public final boolean getHasDestroyed() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC1541990qEH
    public C1537480q70 getHybridContext() {
        return this.LL;
    }

    public boolean getKeepAlive() {
        return this.LLILLL;
    }

    public final AbstractC1537870q7d getLynxKitLifeCycle() {
        return this.LLJIJIL;
    }

    public final C1539580qAO getLynxSSRRuntime() {
        return this.LLJJJJLIIL;
    }

    public final C1537480q70 getNavigateHybridContext() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1540940qCa
    public int getOptimization() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1541990qEH
    public String getSchema() {
        return this.LLJILJIL;
    }

    public final EnumC1538160q86 getTemplateFrom() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC1540940qCa
    public long getViewCreatedTime() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1540940qCa
    public final void LJIILIIL(C1537480q70 c1537480q70) {
        if (c1537480q70 == null) {
            return;
        }
        this.LLJJJ = c1537480q70;
        InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
        if (interfaceC1531560pxS != null && interfaceC1531560pxS.LIZJ() != null) {
            LJJIIZI();
        }
        C1537540q76.LIZLLL(c1537480q70).LIZ = Long.valueOf(System.currentTimeMillis());
        C1530570pvr.LIZIZ(c1537480q70, "spark_consume_pre_result");
        setStatus(this.LLJJ);
        AbstractC1538740q92 abstractC1538740q92 = (AbstractC1538740q92) c1537480q70.LJFF(AbstractC1538740q92.class);
        if (abstractC1538740q92 != null) {
            do {
                abstractC1538740q92.LJLIIL(this, c1537480q70.LJIJI());
                abstractC1538740q92.LJLJJLL(EnumC1067640dtC.LYNX);
                abstractC1538740q92.LJLIIIL(this);
                abstractC1538740q92 = abstractC1538740q92.LL;
            } while (abstractC1538740q92 != null);
        }
        InterfaceC1531560pxS interfaceC1531560pxS2 = c1537480q70.hybridParams;
        if (interfaceC1531560pxS2 != null) {
            interfaceC1531560pxS2.LJI(UriProtector.parse(c1537480q70.LJIJI()));
        }
        this.LLJILJIL = c1537480q70.LJIJI();
        String str = getHybridContext().containerId;
        String str2 = c1537480q70.containerId;
        if (str != null && str2 != null) {
            Map<String, String> map = C1529860pui.LIZ;
            C1537480q70.Companion.getClass();
            map.put(C1529830puf.LIZ(str), C1529830puf.LIZ(str2));
        }
        C1529830puf c1529830puf = C1537480q70.Companion;
        String str3 = c1537480q70.containerId;
        c1529830puf.getClass();
        C1529830puf.LIZJ(c1537480q70, str3);
        c1537480q70.LJIJJLI();
        C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
        C1326430kcb.LIZ().LIZJ(getContext(), c1537480q70);
        U0(C1326430kcb.LIZ().LIZIZ(c1537480q70.containerId));
        if (this.LLJJ == EnumC1538460q8a.SUCCESS) {
            LIZ("hybridViewCacheUsed", null);
        }
        if (c1537480q70.startLynxJsRuntimeLater) {
            LJJIZ();
        }
    }

    public final Object LJIJI(String str) {
        return ((LinkedHashMap) this.LLJJJJJIL).get(str);
    }

    public final void LJJIII(Long l) throws JSONException {
        long jLongValue;
        C1537810q7X c1537810q7XLIZLLL = C1537540q76.LIZLLL(getHybridContext());
        if (l == null && (l = c1537810q7XLIZLLL.LJIJJLI) == null) {
            jLongValue = C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.START_LOAD}, Long.valueOf(System.currentTimeMillis()));
        } else {
            jLongValue = l.longValue();
        }
        long jLIZJ = C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_ENGINE_LOAD_END, EnumC1537220q6a.LOAD_ENGINE_END}, Long.valueOf(System.currentTimeMillis()));
        C1538200q8A c1538200q8A = this.LLJI;
        if (c1538200q8A != null) {
            c1538200q8A.LJIIIZ = Long.valueOf(jLIZJ - jLongValue);
        }
        c1537810q7XLIZLLL.LJJ = Long.valueOf(jLIZJ);
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZIZ().LIZ) {
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lite lynx view load finish, cost = ");
            sbLIZ.append(c1537810q7XLIZLLL);
            c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.D, "LiteLynxView");
        }
        String str = this.LLJILJIL;
        if (EnumC1520990pgP.SparkPerfMonitorOpt.not()) {
            String str2 = getHybridContext().containerId;
            C1520360pfO c1520360pfO = new C1520360pfO("lite_lynx_timeline");
            c1520360pfO.LIZIZ = getHybridContext().bid;
            c1520360pfO.LIZ = str;
            C1537780q7U c1537780q7U = new C1537780q7U(c1537810q7XLIZLLL);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("total", c1537780q7U.LIZ);
            jSONObject.put("init2StartRender", c1537780q7U.LIZIZ);
            jSONObject.put("renderCost", c1537780q7U.LIZJ);
            jSONObject.put("prepareTemplateCost", c1537780q7U.LIZLLL);
            jSONObject.put("prepareJSBCost", c1537780q7U.LJFF);
            jSONObject.put("preparePluginExecuteCost", c1537780q7U.LJI);
            jSONObject.put("prepareFontCost", c1537780q7U.LJII);
            jSONObject.put("sparkContainerCost", c1537780q7U.LJIIIIZZ);
            jSONObject.put("lynxCost", c1537780q7U.LJIIIZ);
            jSONObject.put("lynxViewInitCost", c1537780q7U.LJIIJ);
            jSONObject.put("prepareInitDataCost", c1537780q7U.LJIIL);
            jSONObject.put("prepareComponentCost", c1537780q7U.LJIILIIL);
            jSONObject.put("prepareGlobalPropsCost", c1537780q7U.LJIILJJIL);
            jSONObject.put("prepareComponentEnd2PrepareTemplateStart", c1537780q7U.LJIILL);
            jSONObject.put("prepareExtraInfoCost", c1537780q7U.LJ);
            jSONObject.put("customInitCost", c1537780q7U.LJIIJJI);
            jSONObject.put("pluginInfos", c1537780q7U.LJIILLIIL);
            c1520360pfO.LIZLLL = jSONObject;
            c1520360pfO.LIZIZ(0);
            c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
            C1520080pew.LIZ(str2, c1520360pfO.LIZ());
        }
        try {
            C1530570pvr.LJ(getHybridContext(), "lite_lynx_plugin_info_str", C1058250de3.LIZLLL(c1537810q7XLIZLLL.LJJIFFI));
            C189200o6.m2constructorimpl(Long.valueOf(C1530570pvr.LIZIZ(getHybridContext(), "lite_lynx_timeline_finished")));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LJJIIJ(Map<String, ? extends Object> map) {
        Iterable iterable;
        String strLJJLIIIJ;
        Object aBParamsValue;
        Object obj;
        Map<String, Object> globalProps = getGlobalProps();
        if (globalProps != null && globalProps.containsKey("abParams")) {
            return;
        }
        LruCache<String, C1536930q67> lruCache = C1536910q65.LIZ;
        C1536930q67 c1536930q67LIZIZ = C1536910q65.LIZIZ(getHybridContext().LJIJI());
        if (c1536930q67LIZIZ == null) {
            c1536930q67LIZIZ = C1536910q65.LIZ(getHybridContext().LJIJI());
        }
        if (c1536930q67LIZIZ != null && (obj = c1536930q67LIZIZ.LIZLLL) != null) {
            C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
            C1326430kcb.LIZ().LJ(getHybridContext().containerId, C2097908Jt.LIZJ(new Pair("abParams", obj)));
            return;
        }
        Object obj2 = map.get("abParams");
        if (!(obj2 instanceof List) || (iterable = (Iterable) obj2) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(iterable, ",", null, null, 0, null, null, 62)) == null) {
            return;
        }
        C01GW<C1537410q6t> c01gw2 = C1537410q6t.LJIIIZ;
        C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
        if (c1538050q7v == null || (aBParamsValue = c1538050q7v.getABParamsValue(strLJJLIIIJ)) == null) {
            return;
        }
        C01GW<C1538070q7x> c01gw3 = C1538070q7x.LJ;
        C1326430kcb.LIZ().LJ(getHybridContext().containerId, C2097908Jt.LIZJ(new Pair("abParams", aBParamsValue)));
    }

    public final void LJJIJIIJI(List<String> list) {
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            this.LLJJJJJIL.remove(it2.next());
        }
    }

    public final void LJJJ(Map<String, ? extends Object> map) {
        if (map != null) {
            C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
            C1326430kcb.LIZ().LJ(getHybridContext().containerId, map);
            if (this.LLJLL) {
                TemplateData templateData = new TemplateData();
                templateData.LJIJJ(map);
                updateGlobalProps(templateData);
            }
        }
    }

    public final void LJJJI(final EnumC1538160q86 enumC1538160q86) {
        if (enumC1538160q86 == EnumC1538160q86.TEMPLATE_BUNDLE_PRE_DECODE) {
            C1530570pvr.LJFF(getHybridContext(), EnumC1537150q6T.OPT_PRE_DECODE, 1);
        }
        this.LLJJIJIIJIL = enumC1538160q86;
        C086F c086f = C086F.LIZ;
        Runnable runnable = new Runnable() { // from class: X.0q8U
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiteLynxKitView@73dd.updateTemplateFrom$1");
                try {
                    C1537720q7O c1537720q7O = this.LL;
                    enumC1538160q86.getFrom();
                    C1537720q7O.LJJIIZ(c1537720q7O, 2);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiteLynxKitView@73dd.updateTemplateFrom$1");
            }
        };
        c086f.getClass();
        C086F.LJII(runnable);
    }

    @Override // X.InterfaceC1541990qEH
    public final void LLD(boolean z) {
        InterfaceC1538820q9A interfaceC1538820q9A;
        C1537910q7h c1537910q7h;
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        InterfaceC1530230pvJ interfaceC1530230pvJ;
        HybridSchemaParam hybridSchemaParam;
        Forest forest;
        Forest forest2;
        String str;
        Object next;
        int i;
        if (this.LLJLIL) {
            return;
        }
        AtomicInteger atomicInteger = this.LLLI;
        if (atomicInteger != null) {
            do {
                i = atomicInteger.get();
                if (i <= 1) {
                    if (i == 1) {
                        return;
                    } else {
                        this.LLLI = null;
                    }
                }
            } while (!atomicInteger.compareAndSet(i, 1));
            setOptimization(4);
            getHybridContext().LIZJ("reuse");
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            C1541030qCj.LIZIZ(this, C1161970gLL.LIZIZ().LIZJ());
            return;
        }
        getHybridContext().lifecycleState = Lifecycle.State.DESTROYED;
        try {
            C786410Ut5.D3(getViewTreeObserver(), this.LLLFFI);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1539580qAO c1539580qAO = this.LLJJJJLIIL;
        if (c1539580qAO != null) {
            c1539580qAO.LJII();
        }
        this.LLJLILLLLZIIL.set(true);
        this.LLL = null;
        CoroutineContext coroutineContext = this.LLJLLIL;
        if (coroutineContext != null) {
            C23118094a.LIZJ(coroutineContext, null);
        }
        this.LLJILJILJ = z;
        getHybridContext().lifecycleOwner = null;
        C1537910q7h c1537910q7h2 = this.LLILZIL;
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
        C1537910q7h c1537910q7h3 = this.LLILZIL;
        if (c1537910q7h3 != null && (str = c1537910q7h3.LJIILJJIL) != null) {
            C1299370jux.LIZ.getClass();
            C1299370jux.LIZLLL(str);
        }
        C1537910q7h c1537910q7h4 = this.LLILZIL;
        if (c1537910q7h4 != null && (hybridSchemaParam = c1537910q7h4.LJJIIJ) != null && hybridSchemaParam.getLockResource()) {
            String str2 = getHybridContext().containerId;
            if (getSessionId2Containers().remove(str2) != null) {
                JSONArray jSONArray = C1533710q0v.LIZ;
                IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(getHybridContext(), false);
                if (iResourceServiceXLIZIZ != null && (forest2 = iResourceServiceXLIZIZ.getForest()) != null) {
                    forest2.closeSession(str2);
                }
            } else if (hybridSchemaParam.getSessionId() != null && getSessionId2Containers().containsKey(hybridSchemaParam.getSessionId())) {
                List<String> list = getSessionId2Containers().get(hybridSchemaParam.getSessionId());
                if (list != null) {
                    list.remove(str2);
                }
                List<String> list2 = getSessionId2Containers().get(hybridSchemaParam.getSessionId());
                if (list2 != null && list2.isEmpty()) {
                    JSONArray jSONArray2 = C1533710q0v.LIZ;
                    IResourceServiceX iResourceServiceXLIZIZ2 = C1533710q0v.LIZIZ(getHybridContext(), false);
                    if (iResourceServiceXLIZIZ2 != null && (forest = iResourceServiceXLIZIZ2.getForest()) != null) {
                        forest.closeSession(hybridSchemaParam.getSessionId());
                    }
                    getSessionId2Containers().remove(hybridSchemaParam.getSessionId());
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
        this.LLJILLL = null;
        C1537910q7h c1537910q7h5 = this.LLILZIL;
        if (c1537910q7h5 != null) {
            interfaceC1538820q9A = c1537910q7h5.LJJIII;
        } else {
            interfaceC1538820q9A = null;
        }
        this.LLILZLL = interfaceC1538820q9A;
        this.LLIZ = this.LLJIJIL;
        C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.END}, Long.valueOf(System.currentTimeMillis()));
        super.destroy();
        JSONArray jSONArray3 = C1533710q0v.LIZ;
        C1533710q0v.LJIILIIL(getHybridContext());
        this.LLJLIL = true;
        if (z) {
            C1537910q7h c1537910q7h6 = this.LLILZIL;
            if (c1537910q7h6 != null) {
                c1537910q7h6.LJJIFFI(null);
            }
            C1537910q7h c1537910q7h7 = this.LLILZIL;
            if (c1537910q7h7 != null) {
                c1537910q7h7.LJJII(null);
            }
        }
        if (C1535880q4Q.LIZLLL && (c1537910q7h = this.LLILZIL) != null && (copyOnWriteArrayList = c1537910q7h.LJJJIL) != null) {
            copyOnWriteArrayList.clear();
        }
    }

    @Override // X.InterfaceC1541990qEH
    public final void U0(Map<String, ? extends Object> map) {
        Object c098200Yq;
        try {
            LJJJ(map);
            C1538590q8n c1538590q8n = getHybridContext().liteLynxConfig;
            if (c1538590q8n != null && c1538590q8n.LJIIIZ) {
                LIZ("globalPropsUpdated", null);
            }
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
        C1537910q7h c1537910q7h = this.LLILZIL;
        if (c1537910q7h != null && (interfaceC1538820q9A = c1537910q7h.LJJIII) != null) {
            interfaceC1538820q9A.LJII(context);
        }
        C1537480q70 c1537480q70 = this.LLLFZ;
        if (c1537480q70 != null && c1537480q70.startLynxJsRuntimeLater) {
            return;
        }
        LJJIZ();
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
        if (this.LLJL && getWidth() > 0 && getHeight() > 0) {
            this.LLJL = false;
            C1530570pvr.LIZIZ(getHybridContext(), "first_draw");
        }
        super.dispatchDraw(canvas);
        if (this.LLJJJJ) {
            AbstractC1537870q7d abstractC1537870q7d = this.LLJIJIL;
            if (abstractC1537870q7d != null) {
                abstractC1537870q7d.LJJZZI();
            }
            this.LLJJJJ = false;
        }
        if (this.LLJJLIIIJLLLLLLLZ) {
            C1539580qAO c1539580qAO = this.LLJJJJLIIL;
            if (c1539580qAO != null) {
                c1539580qAO.LJIILIIL = true;
                c1539580qAO.LJIIIZ(new C1539030q9V(c1539580qAO), true);
            }
            this.LLJJLIIIJLLLLLLLZ = false;
        }
    }

    @Override // X.InterfaceC1541990qEH
    public final void f1(SparkSchemaParam sparkSchemaParam) {
        LJJIIZI();
    }

    @Override // X.InterfaceC1541990qEH
    public final void load(String str) throws Throwable {
        boolean z;
        Uri uriLIZ;
        String string;
        String strApplyGlobalLoadUrl;
        String str2 = str;
        String str3 = "";
        C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.SPARK_LOAD_PAGE_START}, null);
        this.LLJJJIL = false;
        C1538590q8n c1538590q8n = getHybridContext().liteLynxConfig;
        if (c1538590q8n != null && c1538590q8n.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        C1537810q7X c1537810q7XLIZLLL = C1537540q76.LIZLLL(getHybridContext());
        C1538200q8A c1538200q8A = (C1538200q8A) getHybridContext().LJFF(C1538200q8A.class);
        this.LLJI = c1538200q8A;
        if (c1538200q8A == null) {
            this.LLJI = new C1538200q8A();
        }
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
        if (c1538050q7v != null && (strApplyGlobalLoadUrl = c1538050q7v.applyGlobalLoadUrl(str2)) != null) {
            str2 = strApplyGlobalLoadUrl;
        }
        C1537910q7h c1537910q7h = this.LLILZIL;
        if (c1537910q7h != null) {
            c1537910q7h.LJI(UriProtector.parse(str2));
        }
        C1537910q7h c1537910q7h2 = this.LLILZIL;
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
        C23250099c.LIZIZ(C817503Hh.LL, null, null, new C1522570pix(this, null), 3);
        AbstractC1537870q7d abstractC1537870q7d = this.LLJIJIL;
        if (abstractC1537870q7d != null) {
            abstractC1537870q7d.LJLIIL(this, str2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(str2)) {
            String str4 = getHybridContext().containerId;
            String str5 = getHybridContext().vaid;
            if (str5 != null) {
                str3 = str5;
            }
            getHybridContext();
            C1520080pew.LJ(this, str4, new C1520180pf6(201, "url cannot be empty", str3));
            new AndroidRuntimeException("url cannot be empty");
            AbstractC1537870q7d abstractC1537870q7d2 = this.LLJIJIL;
            if (abstractC1537870q7d2 != null) {
                C1542120qEU c1542120qEU = new C1542120qEU();
                c1542120qEU.LIZ = 201;
                c1542120qEU.LIZIZ = "url cannot be empty";
                abstractC1537870q7d2.LJL(this, str2, c1542120qEU);
            }
        }
        JSModuleManager jSModuleManager = (JSModuleManager) getHybridContext().LJFF(JSModuleManager.class);
        if (jSModuleManager != null) {
            C1531420pxE.LIZ(this, jSModuleManager);
        }
        C1537830q7Z c1537830q7Z = (C1537830q7Z) getHybridContext().hybridParams;
        if (this.LLJJJJLIIL == null && c1537830q7Z.LJJIL != null) {
            C1537480q70 hybridContext = getHybridContext();
            getContext();
            this.LLJJJJLIIL = C1539630qAT.LIZIZ(hybridContext, this, this.LLIZLLLIL, this.LLJIJIL);
        }
        c1537810q7XLIZLLL.LJIILL = Long.valueOf(C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_TEMPLATE_START}, Long.valueOf(System.currentTimeMillis())));
        C1530570pvr.LJ(getHybridContext(), "spark_main_res_state", 1);
        C1539580qAO c1539580qAO = this.LLJJJJLIIL;
        if (c1539580qAO != null) {
            c1539580qAO.LJIIJ = C13LP.LJLILLLLZI(new InterfaceC1539930qAx() { // from class: X.0q8v
                @Override // X.InterfaceC1539930qAx
                public final void LIZ(EnumC1539690qAZ enumC1539690qAZ) {
                    C086F c086f = C086F.LIZ;
                    final C1537720q7O c1537720q7O = this.LIZ;
                    Runnable runnable = new Runnable() { // from class: X.0Pe5
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LiteLynxKitView@73dd.load$6$1$onUpdateRenderState$1");
                            try {
                                C1537720q7O.LJJIIZ(c1537720q7O, 3);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LiteLynxKitView@73dd.load$6$1$onUpdateRenderState$1");
                        }
                    };
                    c086f.getClass();
                    C086F.LJII(runnable);
                }
            }, c1539580qAO.LJIIJ);
            C1539580qAO c1539580qAO2 = this.LLJJJJLIIL;
            if (c1539580qAO2 != null) {
                LJJJI(EnumC1538160q86.TEMPLATE_SSR);
                c1539580qAO2.LJIIIIZZ(str2, new C1538730q91(this, c1537830q7Z, c1537810q7XLIZLLL, z2, str2, jCurrentTimeMillis));
                return;
            }
        }
        LJJIJIIJIL(c1537830q7Z, c1537810q7XLIZLLL, z2, str2, jCurrentTimeMillis);
        C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.SPARK_LOAD_PAGE_END}, null);
    }

    @Override // com.lynx.tasm.LynxView
    public final void loadTemplate(C1309930kBz c1309930kBz) {
        this.LLJJJJ = true;
        super.loadTemplate(c1309930kBz);
    }

    @Override // com.lynx.tasm.LynxView
    public final void reloadTemplate(TemplateData templateData) {
        this.LLJJJJ = true;
        super.reloadTemplate(templateData);
    }

    @Override // com.lynx.tasm.LynxView
    public void setEnableUIFlush(boolean z) {
        super.setEnableUIFlush(z);
        this.LLJJIJIL = z;
    }

    public final void setForestResponse(C1533790q13 c1533790q13) {
        this.LLL = c1533790q13;
    }

    public void setHybridContext(C1537480q70 c1537480q70) {
        this.LL = c1537480q70;
    }

    @Override // X.InterfaceC1540940qCa
    public void setKeepAlive(boolean z) {
        this.LLILLL = z;
    }

    public final void setLynxKitLifeCycle(AbstractC1537870q7d abstractC1537870q7d) {
        this.LLJIJIL = abstractC1537870q7d;
    }

    public final void setLynxSSRRuntime(C1539580qAO c1539580qAO) {
        this.LLJJJJLIIL = c1539580qAO;
    }

    @Override // X.InterfaceC1540940qCa
    public void setOptimization(int i) {
        this.LLILLJJLI = i;
    }

    public final void setRawUrl(String str) {
        this.LLJILJIL = str;
    }

    public final void setStatus(EnumC1538460q8a enumC1538460q8a) {
        this.LLJJ = enumC1538460q8a;
        if (enumC1538460q8a == EnumC1538460q8a.LOADING) {
            LJIIZILJ();
        }
        final InterfaceC1538610q8p interfaceC1538610q8p = (InterfaceC1538610q8p) getHybridContext().LJFF(InterfaceC1538610q8p.class);
        if (interfaceC1538610q8p != null) {
            int i = C1538450q8Z.LIZ[this.LLJJ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C1538590q8n c1538590q8n = getHybridContext().liteLynxConfig;
                        if (c1538590q8n != null && c1538590q8n.LJ) {
                            return;
                        }
                        C086F c086f = C086F.LIZ;
                        Runnable runnable = new Runnable() { // from class: X.0q7z
                            public final void LIZ() {
                                this.LL.LJIJ();
                                ViewGroup viewGroup = this.LL.LLJJIJI;
                                if (viewGroup != null) {
                                    C786410Ut5.LJLZ(0, viewGroup);
                                }
                                View viewLJJJJLI = interfaceC1538610q8p.LJJJJLI(this.LL);
                                if (viewLJJJJLI != null) {
                                    C1537720q7O c1537720q7O = this.LL;
                                    ViewGroup viewGroup2 = c1537720q7O.LLJJIJI;
                                    if (viewGroup2 != null) {
                                        C786410Ut5.LJJJJI(viewGroup2);
                                    }
                                    C1041450dCx.LIZJ(viewLJJJJLI);
                                    ViewGroup viewGroup3 = c1537720q7O.LLJJIJI;
                                    if (viewGroup3 != null) {
                                        viewGroup3.addView(viewLJJJJLI, new FrameLayout.LayoutParams(-1, -1));
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("LiteLynxKitView@73dd.setStatus$2");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("LiteLynxKitView@73dd.setStatus$2");
                            }
                        };
                        c086f.getClass();
                        C086F.LJII(runnable);
                        return;
                    }
                    return;
                }
                LJIJ();
                ViewGroup viewGroup = this.LLJJIJI;
                if (viewGroup != null) {
                    C786410Ut5.LJJJJI(viewGroup);
                }
                ViewGroup viewGroup2 = this.LLJJIJI;
                if (viewGroup2 == null) {
                    return;
                }
                C786410Ut5.LJLZ(8, viewGroup2);
                return;
            }
            C1538590q8n c1538590q8n2 = getHybridContext().liteLynxConfig;
            if (c1538590q8n2 != null && c1538590q8n2.LIZLLL) {
                return;
            }
            C23250099c.LIZLLL(getScope(), null, null, new C1537770q7T(this, interfaceC1538610q8p, null), 3);
        }
    }

    public void setViewCreatedTime(long j) {
        this.LLILZ = j;
    }

    @Override // com.lynx.tasm.LynxView
    public final void updateData(TemplateData templateData) {
        AnonymousClass0957<TemplateData> anonymousClass0957;
        if (templateData == null) {
            return;
        }
        this.LLJJJJ = true;
        super.updateData(templateData);
        C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.LYNX_TRIGGER_UPDATE_DATA}, null);
        C1537910q7h c1537910q7h = this.LLILZIL;
        if (c1537910q7h != null && c1537910q7h.LJJI) {
            int i = C1538450q8Z.LIZ[this.LLJJ.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    C1537910q7h c1537910q7h2 = this.LLILZIL;
                    if (c1537910q7h2 != null && c1537910q7h2.LJJIFFI) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                C1537910q7h c1537910q7h3 = this.LLILZIL;
                if (c1537910q7h3 == null || (anonymousClass0957 = c1537910q7h3.LJJ) == null || !anonymousClass0957.isActive()) {
                    return;
                }
            }
            LJIILLIIL(templateData, this.LLJJI);
            if (!templateData.LJ) {
                return;
            }
            templateData.LJIILL();
        }
    }

    @Override // com.lynx.tasm.LynxView
    public final void updateGlobalProps(TemplateData templateData) {
        this.LLJJJJ = true;
        super.updateGlobalProps(templateData);
    }

    @Override // com.lynx.tasm.LynxView
    public final void updateMetaData(C1300050jw3 c1300050jw3) {
        this.LLJJJJ = true;
        super.updateMetaData(c1300050jw3);
    }

    @Override // com.lynx.tasm.LynxView
    public final void updateData(String str) {
        this.LLJJJJ = true;
        super.updateData(str);
    }

    @Override // com.lynx.tasm.LynxView
    public final void updateGlobalProps(Map<String, Object> map) {
        this.LLJJJJ = true;
        super.updateGlobalProps(map);
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

    public static /* synthetic */ void LJJIIZ(C1537720q7O c1537720q7O, int i) {
        int i2 = i & 2;
        c1537720q7O.getClass();
    }

    @Override // X.InterfaceC1541990qEH
    public final void LIZ(String str, JSONObject jSONObject) {
        InterfaceC1538820q9A interfaceC1538820q9A;
        C1538110q81.LIZIZ(this, str, jSONObject);
        C1537910q7h c1537910q7h = this.LLILZIL;
        if (c1537910q7h != null && (interfaceC1538820q9A = c1537910q7h.LJJIII) != null) {
            interfaceC1538820q9A.sendEvent(str, jSONObject);
        }
    }

    @Override // X.InterfaceC1540940qCa
    public final void LJIIIZ(Context context, C1537480q70 c1537480q70) {
        this.LLLFZ = c1537480q70;
        W0(context);
        LJJIIZ(this, 3);
    }

    public final void LJIJJ(final String str, final byte[] bArr) throws JSONException {
        final TemplateBundle templateBundleLJIILLIIL;
        String string = null;
        if (this.LLJLILLLLZIIL.get()) {
            String str2 = getHybridContext().containerId;
            Object obj = getHybridContext().runtimeInfo.get((Object) "originUrl");
            if (obj != null) {
                string = obj.toString();
            }
            C1520080pew.LIZJ("load_lynx_after_destroy", str2, string, new JSONObject());
            return;
        }
        AbstractC1537870q7d abstractC1537870q7d = this.LLJIJIL;
        if (abstractC1537870q7d != null) {
            abstractC1537870q7d.LJLJJL(str, bArr);
        }
        C824310WVh.LIZJ(new RunnableC1537490q71(getHybridContext()));
        try {
            this.LLJILJIL = str;
            C1537910q7h c1537910q7h = this.LLILZIL;
            if (c1537910q7h != null) {
                templateBundleLJIILLIIL = c1537910q7h.LJIILLIIL();
            } else {
                templateBundleLJIILLIIL = null;
            }
            this.LLJLL = true;
            C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
            LJJJ(C1326430kcb.LIZ().LIZIZ(getHybridContext().containerId));
            C1538200q8A c1538200q8A = this.LLJI;
            if (c1538200q8A != null && c1538200q8A.LJIIIIZZ == null && c1538200q8A.LIZJ != null) {
                c1538200q8A.LJIIIIZZ = Long.valueOf(C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.LOAD_START}, Long.valueOf(System.currentTimeMillis())) - c1538200q8A.LIZJ.longValue());
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z = C1536390q5F.LIZ;
            C1536390q5F.LJIIIIZZ(getHybridContext(), new Runnable() { // from class: X.0q7R
                public final void LIZ() throws JSONException {
                    C1067460dsu c1067460dsuLJIIJ;
                    String str3;
                    C1537910q7h c1537910q7h2;
                    TemplateData templateDataLJIIIIZZ;
                    C1067460dsu c1067460dsuLJIIJ2;
                    boolean z2 = C1536390q5F.LIZ;
                    C1536390q5F.LJI(this.LL.getHybridContext(), System.currentTimeMillis() - jCurrentTimeMillis);
                    C1537810q7X c1537810q7XLIZLLL = C1537540q76.LIZLLL(this.LL.getHybridContext());
                    long jLIZJ = C1530570pvr.LIZJ(this.LL.getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.LOAD_ENGINE_AND_TEMPLATE_DATA_START, EnumC1537220q6a.START_LOAD}, Long.valueOf(System.currentTimeMillis()));
                    C1537910q7h c1537910q7h3 = this.LL.LLILZIL;
                    AnonymousClass0957<TemplateData> anonymousClass0957 = c1537910q7h3 != null ? c1537910q7h3.LJJ : null;
                    c1537810q7XLIZLLL.LJIJJLI = Long.valueOf(jLIZJ);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    JSONObject jSONObject = HybridSettings.INSTANCE.get("hybrid_merge_init_data");
                    if (jSONObject == null || jSONObject.optBoolean("enable", true)) {
                        C1537910q7h c1537910q7h4 = this.LL.LLILZIL;
                        C1537720q7O.LJIILLIIL(c1537910q7h4 != null ? c1537910q7h4.LJIJJ : null, linkedHashMap);
                        String str4 = this.LL.getHybridContext().initData;
                        if (str4 != null) {
                            TemplateData templateDataLJIIIIZZ2 = TemplateData.LJIIIIZZ(str4);
                            C1537720q7O.LJIILLIIL(templateDataLJIIIIZZ2, linkedHashMap);
                            templateDataLJIIIIZZ2.LJIILL();
                        }
                        C1537910q7h c1537910q7h5 = this.LL.LLILZIL;
                        C1537720q7O.LJIILLIIL((c1537910q7h5 == null || (c1067460dsuLJIIJ = c1537910q7h5.LJIIJ()) == null) ? null : c1067460dsuLJIIJ.LIZ, linkedHashMap);
                    } else {
                        C1537910q7h c1537910q7h6 = this.LL.LLILZIL;
                        if ((c1537910q7h6 != null && (c1067460dsuLJIIJ2 = c1537910q7h6.LJIIJ()) != null && (templateDataLJIIIIZZ = c1067460dsuLJIIJ2.LIZ) != null) || (((str3 = this.LL.getHybridContext().initData) != null && (templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(str3)) != null) || ((c1537910q7h2 = this.LL.LLILZIL) != null && (templateDataLJIIIIZZ = c1537910q7h2.LJIJJ) != null))) {
                            C1537720q7O.LJIILLIIL(templateDataLJIIIIZZ, linkedHashMap);
                        }
                    }
                    C1530570pvr.LIZIZ(this.LL.getHybridContext(), "spark_get_init_data_url_start");
                    Map<String, Object> mapLJIIJ = this.LL.getHybridContext().LJIIJ();
                    if (mapLJIIJ != null) {
                        C1537720q7O c1537720q7O = this.LL;
                        C1520080pew.LJFF(c1537720q7O.getHybridContext().containerId, "init_data_url", "mergeInitData", null, c1537720q7O.getHybridContext().LJIJI(), c1537720q7O.getHybridContext().bid, null, "createView", 72);
                        C1537720q7O.LJIILLIIL(TemplateData.LJII(C2097908Jt.LIZJ(new Pair("initDataRes", mapLJIIJ))), linkedHashMap);
                        c1537720q7O.U0(C2097908Jt.LIZJ(new Pair("hasInitDataRes", Boolean.TRUE)));
                    }
                    C1530570pvr.LIZIZ(this.LL.getHybridContext(), "spark_get_init_data_url_end");
                    C1530570pvr.LIZJ(this.LL.getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.SPARK_LOAD_ENGINE_INNER}, null);
                    if (anonymousClass0957 == null || anonymousClass0957.isCancelled()) {
                        this.LL.LJJIJIL(bArr, templateBundleLJIILLIIL, linkedHashMap, str, jLIZJ);
                        this.LL.LJIIZILJ();
                    } else if (anonymousClass0957.isCompleted()) {
                        C23250099c.LIZLLL(this.LL.getScope(), C0PEM.LIZIZ, null, new C598280NdK(this.LL, linkedHashMap, anonymousClass0957, bArr, templateBundleLJIILLIIL, str, jLIZJ, null), 2);
                    } else {
                        this.LL.LJJIJIL(bArr, templateBundleLJIILLIIL, linkedHashMap, str, jLIZJ);
                        C23250099c.LIZLLL(this.LL.getScope(), null, null, new C598270NdJ(anonymousClass0957, this.LL, linkedHashMap, null), 3);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiteLynxKitView@73dd.load$8");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiteLynxKitView@73dd.load$8");
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C01GW<C1537410q6t> c01gw2 = C1537410q6t.LJIIIZ;
            if (!C1161970gLL.LIZIZ().LIZ) {
                String str3 = getHybridContext().containerId;
                Object obj2 = getHybridContext().runtimeInfo.get((Object) "originUrl");
                if (obj2 != null) {
                    string = obj2.toString();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_msg", th.getMessage());
                jSONObject.put("error_type", th.getClass().getCanonicalName());
                C1520080pew.LIZJ("load_lynx_exception", str3, string, jSONObject);
                return;
            }
            throw th;
        }
    }

    public final void LJJIJ(String str, TemplateData templateData) throws Throwable {
        C1537910q7h c1537910q7h;
        List<String> list;
        C1537830q7Z c1537830q7Z;
        String strLJIJI = getHybridContext().LJIJI();
        getHybridContext().LJJIIZ(str);
        InterfaceC1531560pxS interfaceC1531560pxS = getHybridContext().hybridParams;
        if (interfaceC1531560pxS != null) {
            interfaceC1531560pxS.LJI(UriProtector.parse(str));
        }
        if (!Intrinsics.LJFF(C01CL.LIZ(strLJIJI), C01CL.LIZ(str))) {
            InterfaceC1531560pxS interfaceC1531560pxS2 = getHybridContext().hybridParams;
            if ((interfaceC1531560pxS2 instanceof C1537830q7Z) && (c1537830q7Z = (C1537830q7Z) interfaceC1531560pxS2) != null) {
                c1537830q7Z.LJJIIJ = C1545470qJt.LIZ(str, null, null, getHybridContext().containerId);
                c1537830q7Z.LJJJJZ = null;
                c1537830q7Z.LJJJJZI = null;
                c1537830q7Z.LJJJJLI = null;
                c1537830q7Z.LJJJJLL = null;
            }
            getHybridContext().LJJIII(byte[].class);
            getHybridContext().LJJIII(TemplateBundle.class);
            C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
            C1538070q7x c1538070q7xLIZ = C1326430kcb.LIZ();
            String str2 = getHybridContext().containerId;
            List listSingletonList = Collections.singletonList("abParams");
            if (listSingletonList != null) {
                c1538070q7xLIZ.getClass();
                for (Object obj : listSingletonList) {
                    C2281408wm<String, Object> c2281408wm = c1538070q7xLIZ.LIZIZ.get(str2);
                    if (c2281408wm != null) {
                        c2281408wm.remove(obj);
                    }
                }
            }
            if (c1538070q7xLIZ.LIZJ.get(str2) == null) {
                c1538070q7xLIZ.LIZJ.put(str2, new ArrayList());
            }
            if (listSingletonList != null && (list = c1538070q7xLIZ.LIZJ.get(str2)) != null) {
                list.addAll(listSingletonList);
            }
        }
        getHybridContext().LJJIJ(System.currentTimeMillis());
        AbstractC1537870q7d abstractC1537870q7d = this.LLJIJIL;
        if (abstractC1537870q7d != null) {
            String str3 = this.LLJILJIL;
            if (str3 == null) {
                str3 = "";
            }
            abstractC1537870q7d.LJLIIL(this, str3);
        }
        C01GW<C1538070q7x> c01gw2 = C1538070q7x.LJ;
        U0(C1326430kcb.LIZ().LIZIZ(getHybridContext().containerId));
        if (templateData != null && (c1537910q7h = this.LLILZIL) != null) {
            c1537910q7h.LJIJJ = templateData;
        }
        C1539580qAO c1539580qAO = this.LLJJJJLIIL;
        if (c1539580qAO != null) {
            c1539580qAO.LJII();
        }
        C1537480q70 hybridContext = getHybridContext();
        getContext();
        this.LLJJJJLIIL = C1539630qAT.LIZIZ(hybridContext, this, this.LLIZLLLIL, this.LLJIJIL);
        load(str);
    }

    public final void LJJIJLIJ(String str, List<? extends Object> list) {
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

    public final void LJJIL(Object obj, String str) {
        this.LLJJJJJIL.put(str, obj);
    }

    @Override // X.InterfaceC1541990qEH
    public final void X0(String str, List<? extends Object> list) {
        JavaOnlyArray javaOnlyArray;
        C1538110q81.LIZ(this, str, list);
        C1537910q7h c1537910q7h = this.LLILZIL;
        if (c1537910q7h != null && c1537910q7h.LJJIJ) {
            if (list != null) {
                javaOnlyArray = JavaOnlyArray.from(list);
            } else {
                javaOnlyArray = new JavaOnlyArray();
            }
            sendGlobalEvent(str, javaOnlyArray);
            return;
        }
        LJJIJLIJ(str, list);
    }

    @Override // X.InterfaceC1541990qEH
    public final void Y0(String str, Map<String, ? extends Object> map) {
        InterfaceC1538820q9A interfaceC1538820q9A;
        C1538110q81.LIZJ(this, str, map);
        C1537910q7h c1537910q7h = this.LLILZIL;
        if (c1537910q7h != null && (interfaceC1538820q9A = c1537910q7h.LJJIII) != null) {
            interfaceC1538820q9A.LIZ();
        }
    }

    @Override // com.lynx.tasm.LynxView
    public final void reloadTemplate(TemplateData templateData, TemplateData templateData2) {
        this.LLJJJJ = true;
        super.reloadTemplate(templateData, templateData2);
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
    public static final com.lynx.tasm.TemplateBundle LJJIJL(X.C1532310pyf r8, X.C1537720q7O r9, com.lynx.tasm.TemplateBundle r10) {
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
            X.0q7h r0 = r9.LLILZIL
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
        throw new UnsupportedOperationException("Method not decompiled: X.C1537720q7O.LJJIJL(X.0pyf, X.0q7O, com.lynx.tasm.TemplateBundle):com.lynx.tasm.TemplateBundle");
    }

    @Override // com.lynx.tasm.LynxView
    public final void renderSSR(byte[] bArr, String str, TemplateData templateData) {
        super.renderSSR(bArr, str, templateData);
        this.LLJJLIIIJLLLLLLLZ = true;
    }

    public final void LJJI(String str, C1533790q13 c1533790q13, int i, String str2) {
        String strLIZIZ;
        C1533810q15 c1533810q15;
        C1530570pvr.LJ(getHybridContext(), "spark_main_res_state", 1);
        if (c1533790q13 == null || (c1533810q15 = c1533790q13.LIZLLL) == null || (strLIZIZ = c1533810q15.toString()) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("can not get response from ");
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append(", ");
        sbLIZ2.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        C1530570pvr.LJFF(getHybridContext(), EnumC1537150q6T.RESOURCE_LOAD_FAIL_DETAIL, strLIZIZ2);
        String str3 = getHybridContext().containerId;
        String str4 = getHybridContext().vaid;
        if (str4 == null) {
            str4 = "";
        }
        getHybridContext();
        C1520080pew.LJ(this, str3, new C1520180pf6(i, strLIZIZ2, str4));
        C1490740otc.LIZ.LIZ(strLIZIZ2, EnumC1490770otf.E, "LynxKit");
        AbstractC1537870q7d abstractC1537870q7d = this.LLJIJIL;
        if (abstractC1537870q7d != null) {
            C1542120qEU c1542120qEU = new C1542120qEU();
            c1542120qEU.LIZ = Integer.valueOf(i);
            c1542120qEU.LIZIZ = strLIZIZ2;
            c1542120qEU.LIZLLL = strLIZIZ;
            abstractC1537870q7d.LJL(this, str, c1542120qEU);
        }
        AbstractC1537870q7d abstractC1537870q7d2 = this.LLJIJIL;
        if (abstractC1537870q7d2 != null) {
            abstractC1537870q7d2.LJLIIIL(this);
        }
    }

    public final void LJJIFFI(String str, C1532310pyf c1532310pyf, int i, String str2) {
        String strLIZIZ;
        C1532480pyw c1532480pyw;
        if (c1532310pyf == null || (c1532480pyw = c1532310pyf.LIZJ) == null || (strLIZIZ = c1532480pyw.LIZJ()) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("can not get response from ");
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append(", ");
        sbLIZ2.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        C1530570pvr.LJFF(getHybridContext(), EnumC1537150q6T.RESOURCE_LOAD_FAIL_DETAIL, strLIZIZ2);
        String str3 = getHybridContext().containerId;
        String str4 = getHybridContext().vaid;
        if (str4 == null) {
            str4 = "";
        }
        getHybridContext();
        C1520080pew.LJ(this, str3, new C1520180pf6(i, strLIZIZ2, str4));
        C1490740otc.LIZ.LIZ(strLIZIZ2, EnumC1490770otf.E, "LynxKit");
        AbstractC1537870q7d abstractC1537870q7d = this.LLJIJIL;
        if (abstractC1537870q7d != null) {
            C1542120qEU c1542120qEU = new C1542120qEU();
            c1542120qEU.LIZ = Integer.valueOf(i);
            c1542120qEU.LIZIZ = strLIZIZ2;
            c1542120qEU.LIZLLL = strLIZIZ;
            abstractC1537870q7d.LJL(this, str, c1542120qEU);
        }
        AbstractC1537870q7d abstractC1537870q7d2 = this.LLJIJIL;
        if (abstractC1537870q7d2 != null) {
            abstractC1537870q7d2.LJLIIIL(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.0q99] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0q98] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0q9I] */
    public C1537720q7O(Context context, C1537480q70 c1537480q70, C1309760kBi c1309760kBi, C1537910q7h c1537910q7h, final C1537790q7V c1537790q7V) {
        String str;
        int i;
        C1539580qAO c1539580qAOLIZIZ;
        AbstractC1311330kEF abstractC1311330kEF;
        Map<Class<?>, ? extends Object> map;
        String strLJIILIIL;
        List<String> listLJJLIIIJILLIZJL;
        boolean zContainsKey;
        InterfaceC1530230pvJ interfaceC1530230pvJ;
        Integer containerBgColor;
        C1537480q70 hybridContext;
        super(context, c1309760kBi);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LL = c1537480q70;
        this.LLILLJJLI = 0;
        this.LLILLL = false;
        this.LLILZ = jCurrentTimeMillis;
        this.LLJILJILJ = true;
        this.LLJJ = EnumC1538460q8a.INIT;
        this.LLJJI = new LinkedHashMap();
        this.LLJJIJIL = true;
        this.LLJJJJJIL = new LinkedHashMap();
        this.LLJL = true;
        this.LLJLILLLLZIIL = new AtomicBoolean(false);
        this.LLJLLL = C452501pT.LIZ(EnumC452301pR.NONE, new C1611506Sr(this));
        this.LLJZ = C452501pT.LIZIZ(new C1194304lp());
        this.LLJZIJLIL = new InterfaceC1539450qAB() { // from class: X.0q9I
            {
                new AtomicBoolean(false);
            }
        };
        this.LLLF = C452501pT.LIZIZ(new C1538770q95(context));
        this.LLLFF = new LynxViewClient() { // from class: X.0q99
            @Override // com.lynx.tasm.LynxViewClient
            public final void LJIIJ() {
                InterfaceC1538940q9M interfaceC1538940q9M = (InterfaceC1538940q9M) this.LL.getHybridContext().LJFF(InterfaceC1538940q9M.class);
                if (interfaceC1538940q9M != null) {
                    interfaceC1538940q9M.LJJ();
                }
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJIJ() {
                InterfaceC1538940q9M interfaceC1538940q9M = (InterfaceC1538940q9M) this.LL.getHybridContext().LJFF(InterfaceC1538940q9M.class);
                if (interfaceC1538940q9M != null) {
                    interfaceC1538940q9M.LIZIZ();
                }
            }
        };
        this.LLLFFI = new ViewTreeObserver.OnPreDrawListener() { // from class: X.0q98
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                InterfaceC1538940q9M interfaceC1538940q9M = (InterfaceC1538940q9M) this.LL.getHybridContext().LJFF(InterfaceC1538940q9M.class);
                if (interfaceC1538940q9M == null) {
                    return true;
                }
                interfaceC1538940q9M.LIZ();
                return true;
            }
        };
        C1537810q7X c1537810q7XLIZLLL = C1537540q76.LIZLLL(getHybridContext());
        c1537810q7XLIZLLL.LJIILIIL = Long.valueOf(C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_COMPONENT_START}, Long.valueOf(System.currentTimeMillis())));
        C1537550q77 c1537550q77 = (C1537550q77) getHybridContext().LJFF(C1537550q77.class);
        if (c1537550q77 == null) {
            getHybridContext();
            c1537550q77 = new C1537550q77();
            getHybridContext().LJJ(C1537550q77.class, this.LLJ);
        }
        this.LLJ = c1537550q77;
        getHybridContext();
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
        lynxViewMonitor.addContext((LynxView) this, "optimization_code", C1542210qEd.LIZJ(Integer.valueOf(getOptimization())));
        C1529870puj.LIZ.getClass();
        String str2 = getHybridContext().containerId;
        InterfaceC1531560pxS interfaceC1531560pxS = getHybridContext().hybridParams;
        EnumC1067640dtC type = interfaceC1531560pxS != null ? interfaceC1531560pxS.getType() : null;
        if (type == null) {
            i = -1;
        } else {
            i = C1067770dtP.LIZ[type.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                C1529870puj.LJ.put(str2, new WeakReference<>(this));
            }
        } else {
            C1529870puj.LIZLLL.put(str2, new WeakReference<>(this));
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("last_lynx_url", getHybridContext().LJIJI());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
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
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C086F c086f = C086F.LIZ;
        Runnable runnable = new Runnable() { // from class: X.0q82
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                LifecycleOwner lifecycleOwner;
                Lifecycle lifecycle;
                C1C7U.LIZ("LiteLynxKitView@73dd.processSession$2");
                try {
                    this.LL.LLJJL = new LiteLynxKitViewLifecycleObserver(new WeakReference(this.LL));
                    C1537720q7O c1537720q7O = this.LL;
                    LiteLynxKitViewLifecycleObserver liteLynxKitViewLifecycleObserver = c1537720q7O.LLJJL;
                    if (liteLynxKitViewLifecycleObserver != null && (lifecycleOwner = c1537720q7O.getHybridContext().lifecycleOwner) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                        lifecycle.addObserver(liteLynxKitViewLifecycleObserver);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiteLynxKitView@73dd.processSession$2");
            }
        };
        c086f.getClass();
        C086F.LJII(runnable);
        LJJIIZ(this, 3);
        C587540N2q.LIZ.getClass();
        ILiteLynxApi iLiteLynxApi = (ILiteLynxApi) C587540N2q.LIZ(ILiteLynxApi.class);
        if (iLiteLynxApi != null && (containerBgColor = iLiteLynxApi.getContainerBgColor(getContext(), getHybridContext())) != null) {
            setBackgroundColor(containerBgColor.intValue());
        }
        getHybridContext();
        this.LLILZIL = c1537910q7h;
        this.LLJILJIL = String.valueOf(c1537910q7h.LIZ());
        JSONArray jSONArray = C1533710q0v.LIZ;
        this.LLIZLLLIL = C1533710q0v.LIZIZ(getHybridContext(), false);
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
        this.LLJIJIL = new AbstractC1537870q7d(c1537790q7V) { // from class: X.0q8D
            public final AbstractC1537870q7d LL;
            public boolean LLILLJJLI;

            @Override // X.AbstractC1537870q7d
            public final void LJJJZ() {
                AbstractC1538740q92 abstractC1538740q92 = (AbstractC1538740q92) this.LLILLL.getHybridContext().LJFF(AbstractC1538740q92.class);
                if (abstractC1538740q92 != null) {
                    do {
                        abstractC1538740q92.LJJJZ();
                        abstractC1538740q92.onDestroy();
                        Object next = abstractC1538740q92.next();
                        if (next == null || !(next instanceof AbstractC1538740q92)) {
                            break;
                        } else {
                            abstractC1538740q92 = (AbstractC1538740q92) next;
                        }
                    } while (abstractC1538740q92 != null);
                }
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJJJZ();
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJJZZI() {
                AbstractC1538740q92 abstractC1538740q92 = (AbstractC1538740q92) this.LLILLL.getHybridContext().LJFF(AbstractC1538740q92.class);
                if (abstractC1538740q92 != null) {
                    do {
                        abstractC1538740q92.LJJZZI();
                        Object next = abstractC1538740q92.next();
                        if (next == null || !(next instanceof AbstractC1538740q92)) {
                            break;
                        } else {
                            abstractC1538740q92 = (AbstractC1538740q92) next;
                        }
                    } while (abstractC1538740q92 != null);
                }
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJJZZI();
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLILLLLZI() {
                AbstractC1538740q92 abstractC1538740q92 = (AbstractC1538740q92) this.LLILLL.getHybridContext().LJFF(AbstractC1538740q92.class);
                if (abstractC1538740q92 != null) {
                    do {
                        abstractC1538740q92.LJLILLLLZI();
                        Object next = abstractC1538740q92.next();
                        if (next == null || !(next instanceof AbstractC1538740q92)) {
                            break;
                        } else {
                            abstractC1538740q92 = (AbstractC1538740q92) next;
                        }
                    } while (abstractC1538740q92 != null);
                }
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJLILLLLZI();
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLJJI() {
                AbstractC1538740q92 abstractC1538740q92 = (AbstractC1538740q92) this.LLILLL.getHybridContext().LJFF(AbstractC1538740q92.class);
                if (abstractC1538740q92 != null) {
                    do {
                        abstractC1538740q92.LJLJJI();
                        Object next = abstractC1538740q92.next();
                        if (next == null || !(next instanceof AbstractC1538740q92)) {
                            break;
                        } else {
                            abstractC1538740q92 = (AbstractC1538740q92) next;
                        }
                    } while (abstractC1538740q92 != null);
                }
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJLJJI();
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void onDestroy() {
                AbstractC1538740q92 abstractC1538740q92 = (AbstractC1538740q92) this.LLILLL.getHybridContext().LJFF(AbstractC1538740q92.class);
                if (abstractC1538740q92 != null) {
                    do {
                        abstractC1538740q92.onDestroy();
                        Object next = abstractC1538740q92.next();
                        if (next == null || !(next instanceof AbstractC1538740q92)) {
                            break;
                        } else {
                            abstractC1538740q92 = (AbstractC1538740q92) next;
                        }
                    } while (abstractC1538740q92 != null);
                }
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.onDestroy();
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJJZ(InterfaceC1541990qEH interfaceC1541990qEH2) {
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJJZ(interfaceC1541990qEH2);
                }
                AbstractC1538740q92 abstractC1538740q92 = (AbstractC1538740q92) this.LLILLL.getHybridContext().LJFF(AbstractC1538740q92.class);
                if (abstractC1538740q92 != null) {
                    do {
                        abstractC1538740q92.LJJZ(interfaceC1541990qEH2);
                        Object next = abstractC1538740q92.next();
                        if (next != null && (next instanceof AbstractC1538740q92)) {
                            abstractC1538740q92 = (AbstractC1538740q92) next;
                        } else {
                            return;
                        }
                    } while (abstractC1538740q92 != null);
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH2) throws JSONException {
                if (!this.LLILLJJLI) {
                    LJLJL("success", null);
                }
                AbstractC1538740q92 abstractC1538740q92 = (AbstractC1538740q92) this.LLILLL.getHybridContext().LJFF(AbstractC1538740q92.class);
                if (abstractC1538740q92 != null) {
                    do {
                        abstractC1538740q92.LJLIIIL(interfaceC1541990qEH2);
                        abstractC1538740q92 = abstractC1538740q92.LL;
                    } while (abstractC1538740q92 != null);
                }
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJLIIIL(interfaceC1541990qEH2);
                }
                InterfaceC1538950q9N interfaceC1538950q9N = (InterfaceC1538950q9N) this.LLILLL.getHybridContext().LJFF(InterfaceC1538950q9N.class);
                if (interfaceC1538950q9N != null) {
                    interfaceC1538950q9N.LJJIZ();
                }
                C1490740otc c1490740otc = C1490740otc.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LynxView load finish, url: ");
                sbLIZ.append(interfaceC1541990qEH2.getSchema());
                c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.I, "LiteLynxView");
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH2) {
                AbstractC1538740q92 abstractC1538740q92 = (AbstractC1538740q92) this.LLILLL.getHybridContext().LJFF(AbstractC1538740q92.class);
                if (abstractC1538740q92 != null) {
                    do {
                        abstractC1538740q92.LJLJI(interfaceC1541990qEH2);
                        abstractC1538740q92 = abstractC1538740q92.LL;
                    } while (abstractC1538740q92 != null);
                }
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJLJI(interfaceC1541990qEH2);
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLJJLL(EnumC1067640dtC enumC1067640dtC) {
                AbstractC1538740q92 abstractC1538740q92 = (AbstractC1538740q92) this.LLILLL.getHybridContext().LJFF(AbstractC1538740q92.class);
                if (abstractC1538740q92 != null) {
                    do {
                        abstractC1538740q92.LJLJJLL(enumC1067640dtC);
                        Object next = abstractC1538740q92.next();
                        if (next == null || !(next instanceof AbstractC1538740q92)) {
                            break;
                        } else {
                            abstractC1538740q92 = (AbstractC1538740q92) next;
                        }
                    } while (abstractC1538740q92 != null);
                }
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
            public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH2, String str3) throws JSONException {
                this.LLILLJJLI = true;
                C086F c086f2 = C086F.LIZ;
                final C1537720q7O c1537720q7O = this.LLILLL;
                Runnable runnable2 = new Runnable() { // from class: X.0q8I
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LiteLynxKitView$KitLifecycle@aa5f.onLoadFailed$1");
                        try {
                            c1537720q7O.setStatus(EnumC1538460q8a.FAIL);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LiteLynxKitView$KitLifecycle@aa5f.onLoadFailed$1");
                    }
                };
                c086f2.getClass();
                C086F.LJII(runnable2);
                LJLJL("failure", null);
                AbstractC1538740q92 abstractC1538740q92 = (AbstractC1538740q92) this.LLILLL.getHybridContext().LJFF(AbstractC1538740q92.class);
                if (abstractC1538740q92 != null) {
                    do {
                        abstractC1538740q92.LJJZZIII(interfaceC1541990qEH2, str3);
                        abstractC1538740q92 = abstractC1538740q92.LL;
                    } while (abstractC1538740q92 != null);
                }
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJJZZIII(interfaceC1541990qEH2, str3);
                }
                C1490740otc c1490740otc = C1490740otc.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LynxView load failed, url: ");
                sbLIZ.append(str3);
                c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "LiteLynxView");
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH2, String str3) throws JSONException {
                this.LLILLJJLI = false;
                C086F c086f2 = C086F.LIZ;
                final C1537720q7O c1537720q7O = this.LLILLL;
                Runnable runnable2 = new Runnable() { // from class: X.0q8K
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LiteLynxKitView$KitLifecycle@aa5f.onLoadStart$1");
                        try {
                            c1537720q7O.setStatus(EnumC1538460q8a.LOADING);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LiteLynxKitView$KitLifecycle@aa5f.onLoadStart$1");
                    }
                };
                c086f2.getClass();
                C086F.LJII(runnable2);
                LJLJL("start", null);
                AbstractC1538740q92 abstractC1538740q92 = (AbstractC1538740q92) this.LLILLL.getHybridContext().LJFF(AbstractC1538740q92.class);
                if (abstractC1538740q92 != null) {
                    do {
                        abstractC1538740q92.LJLIIL(interfaceC1541990qEH2, str3);
                        abstractC1538740q92 = abstractC1538740q92.LL;
                    } while (abstractC1538740q92 != null);
                }
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJLIIL(interfaceC1541990qEH2, str3);
                }
                C1490740otc c1490740otc = C1490740otc.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LynxView load start, url: ");
                sbLIZ.append(str3);
                c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.I, "LiteLynxView");
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLJJL(String str3, byte[] bArr) {
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJLJJL(str3, bArr);
                }
                AbstractC1538740q92 abstractC1538740q92 = (AbstractC1538740q92) this.LLILLL.getHybridContext().LJFF(AbstractC1538740q92.class);
                if (abstractC1538740q92 != null) {
                    do {
                        abstractC1538740q92.LJLJJL(str3, bArr);
                        Object next = abstractC1538740q92.next();
                        if (next != null && (next instanceof AbstractC1538740q92)) {
                            abstractC1538740q92 = (AbstractC1538740q92) next;
                        } else {
                            return;
                        }
                    } while (abstractC1538740q92 != null);
                }
            }

            public final void LJLJL(String str3, String str4) throws JSONException {
                C1530570pvr.LJ(this.LLILLL.getHybridContext(), "spark_load_url_status", str3);
                C1530570pvr.LJ(this.LLILLL.getHybridContext(), "spark_load_url_fail_reason", str4);
                C1530570pvr.LJ(this.LLILLL.getHybridContext(), "spark_engine_type", "lynx");
                if (EnumC1520990pgP.SparkPerfMonitorOpt.not()) {
                    String str5 = this.LLILLL.getHybridContext().containerId;
                    C1520360pfO c1520360pfO = new C1520360pfO("hybrid_monitor_container_load_url");
                    c1520360pfO.LIZIZ = this.LLILLL.getHybridContext().bid;
                    c1520360pfO.LIZ = this.LLILLL.getHybridContext().LJIJI();
                    c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
                    jSONObject.put("fail_reason", str4);
                    jSONObject.put("engine_type", "lynx");
                    c1520360pfO.LIZLLL = jSONObject;
                    C1520080pew.LIZ(str5, c1520360pfO.LIZ());
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH2, String str3, C1542120qEU c1542120qEU) throws JSONException {
                this.LLILLJJLI = true;
                this.LLILLL.getHybridContext().hybridKitError = c1542120qEU;
                C086F c086f2 = C086F.LIZ;
                final C1537720q7O c1537720q7O = this.LLILLL;
                Runnable runnable2 = new Runnable() { // from class: X.0q8F
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LiteLynxKitView$KitLifecycle@aa5f.onLoadFailed$5");
                        try {
                            c1537720q7O.setStatus(EnumC1538460q8a.FAIL);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LiteLynxKitView$KitLifecycle@aa5f.onLoadFailed$5");
                    }
                };
                c086f2.getClass();
                C086F.LJII(runnable2);
                LJLJL("failure", c1542120qEU.LIZIZ);
                AbstractC1538740q92 abstractC1538740q92 = (AbstractC1538740q92) this.LLILLL.getHybridContext().LJFF(AbstractC1538740q92.class);
                if (abstractC1538740q92 != null) {
                    do {
                        abstractC1538740q92.LJL(interfaceC1541990qEH2, str3, c1542120qEU);
                        abstractC1538740q92 = abstractC1538740q92.LL;
                    } while (abstractC1538740q92 != null);
                }
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJL(interfaceC1541990qEH2, str3, c1542120qEU);
                }
                InterfaceC1538950q9N interfaceC1538950q9N = (InterfaceC1538950q9N) this.LLILLL.getHybridContext().LJFF(InterfaceC1538950q9N.class);
                if (interfaceC1538950q9N != null) {
                    interfaceC1538950q9N.LJJJ(c1542120qEU);
                }
                C1490740otc c1490740otc = C1490740otc.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LynxView load failed, url: ");
                sbLIZ.append(str3);
                sbLIZ.append(", reason: ");
                sbLIZ.append(c1542120qEU.LIZIZ);
                c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "LiteLynxView");
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH2, String str3, String str4) throws JSONException {
                this.LLILLJJLI = true;
                C086F c086f2 = C086F.LIZ;
                final C1537720q7O c1537720q7O = this.LLILLL;
                Runnable runnable2 = new Runnable() { // from class: X.0q8J
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LiteLynxKitView$KitLifecycle@aa5f.onLoadFailed$3");
                        try {
                            c1537720q7O.setStatus(EnumC1538460q8a.FAIL);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LiteLynxKitView$KitLifecycle@aa5f.onLoadFailed$3");
                    }
                };
                c086f2.getClass();
                C086F.LJII(runnable2);
                LJLJL("failure", str4);
                AbstractC1538740q92 abstractC1538740q92 = (AbstractC1538740q92) this.LLILLL.getHybridContext().LJFF(AbstractC1538740q92.class);
                if (abstractC1538740q92 != null) {
                    do {
                        abstractC1538740q92.LJLI(interfaceC1541990qEH2, str3, str4);
                        abstractC1538740q92 = abstractC1538740q92.LL;
                    } while (abstractC1538740q92 != null);
                }
                AbstractC1537870q7d abstractC1537870q7d = this.LL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJLI(interfaceC1541990qEH2, str3, str4);
                }
                C1490740otc c1490740otc = C1490740otc.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LynxView load failed, url: ");
                sbLIZ.append(str3);
                sbLIZ.append(", reason: ");
                sbLIZ.append(str4);
                c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "LiteLynxView");
            }
        };
        C1536590q5Z c1536590q5Z = new C1536590q5Z(this, this.LLILZIL, this.LLIZLLLIL);
        c1536590q5Z.LLILZIL = this.LLJIJIL;
        c1536590q5Z.LLILZLL = getHybridContext();
        addLynxViewClient(c1536590q5Z);
        addLynxViewClient(this.LLLFF);
        if (LLLIIII && Intrinsics.LJFF(C08RQ.LIZJ(getHybridContext().containerId).get("self_adaptive_height"), "1")) {
            C786410Ut5.y3(getViewTreeObserver(), this.LLLFFI);
        }
        Object obj = getHybridContext().lynxSSRRuntime;
        if (!(obj instanceof C1539580qAO) || (c1539580qAOLIZIZ = (C1539580qAO) obj) == null) {
            C1537480q70 hybridContext2 = getHybridContext();
            getContext();
            c1539580qAOLIZIZ = C1539630qAT.LIZIZ(hybridContext2, this, this.LLIZLLLIL, this.LLJIJIL);
        }
        this.LLJJJJLIIL = c1539580qAOLIZIZ;
        if (c1539580qAOLIZIZ != null) {
            c1539580qAOLIZIZ.LIZIZ = this;
            c1539580qAOLIZIZ.LIZJ = this.LLIZLLLIL;
            c1539580qAOLIZIZ.LIZLLL = this.LLJIJIL;
        }
        C1537810q7X c1537810q7XLIZLLL2 = C1537540q76.LIZLLL(getHybridContext());
        c1537810q7XLIZLLL2.LJII = Long.valueOf(C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_FONT_START}, Long.valueOf(System.currentTimeMillis())));
        C1537910q7h c1537910q7h2 = this.LLILZIL;
        if (c1537910q7h2 != null && (strLJIILIIL = c1537910q7h2.LJIILIIL()) != null && strLJIILIIL.length() != 0 && strLJIILIIL != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJIILIIL, new String[]{","}, 0, 6)) != null) {
            for (String str3 : listLJJLIIIJILLIZJL) {
                synchronized (C1300980jxY.class) {
                    zContainsKey = ((HashMap) C1300980jxY.LIZ).containsKey(str3);
                }
                if (!zContainsKey) {
                    C1300980jxY.LIZIZ(str3, C1202420hOa.LIZ().getAssets());
                }
            }
        }
        c1537810q7XLIZLLL2.LJIIIIZZ = Long.valueOf(C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_FONT_END}, Long.valueOf(System.currentTimeMillis())));
        boolean z = C1536390q5F.LIZ;
        C1536390q5F.LJFF(getHybridContext());
        if (this.LLJJJJLIIL == null) {
            LJJIIZI();
        }
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
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C1490740otc.LIZ.LIZ("Krypton Player require Lynx >= 2.10", EnumC1490770otf.E, "LynxKitView");
                }
            }
        }
        C1537810q7X c1537810q7XLIZLLL3 = C1537540q76.LIZLLL(getHybridContext());
        c1537810q7XLIZLLL3.LJIJI = Long.valueOf(C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_JSB_START}, Long.valueOf(System.currentTimeMillis())));
        InterfaceC1538820q9A interfaceC1538820q9A = c1537910q7h.LJJIII;
        if (interfaceC1538820q9A != null) {
            interfaceC1538820q9A.LJI(getContext(), this, this.LLJ);
            getContext();
            interfaceC1538820q9A.LJ();
        }
        c1537810q7XLIZLLL3.LJIJJ = Long.valueOf(C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_JSB_END}, Long.valueOf(System.currentTimeMillis())));
        getHybridContext().LJJIIZI();
        C1530570pvr.LJ(getHybridContext(), "spark_main_res_state", -1);
        c1537810q7XLIZLLL.LJIILJJIL = Long.valueOf(C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_COMPONENT_END, EnumC1537220q6a.SPARK_PREPARE_INNER_END}, Long.valueOf(System.currentTimeMillis())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, X.0q67] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(X.C1537830q7Z r17, X.C1537810q7X r18, boolean r19, java.lang.String r20, long r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1537720q7O.LJJIJIIJIL(X.0q7Z, X.0q7X, boolean, java.lang.String, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0103 A[LOOP:1: B:33:0x0103->B:113:?, LOOP_START, PHI: r1
      0x0103: PHI (r1v31 X.0q9Q) = (r1v30 X.0q9Q), (r1v33 X.0q9Q) binds: [B:32:0x0101, B:113:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIL(byte[] r12, com.lynx.tasm.TemplateBundle r13, java.util.Map<java.lang.String, com.lynx.tasm.TemplateData> r14, java.lang.String r15, long r16) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1537720q7O.LJJIJIL(byte[], com.lynx.tasm.TemplateBundle, java.util.Map, java.lang.String, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018b A[PHI: r12
      0x018b: PHI (r12v6 boolean) = (r12v5 boolean), (r12v8 boolean), (r12v8 boolean) binds: [B:82:0x0187, B:21:0x003e, B:23:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v34, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v39, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(X.C1537830q7Z r22, X.C1537810q7X r23, X.C1533790q13 r24, java.lang.String r25, long r26, com.lynx.tasm.TemplateBundle r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1537720q7O.LJIL(X.0q7Z, X.0q7X, X.0q13, java.lang.String, long, com.lynx.tasm.TemplateBundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[PHI: r8
      0x0037: PHI (r8v1 com.lynx.tasm.TemplateBundle) = (r8v0 com.lynx.tasm.TemplateBundle), (r8v4 com.lynx.tasm.TemplateBundle), (r8v5 com.lynx.tasm.TemplateBundle) binds: [B:8:0x000f, B:14:0x0035, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> LJJIIJZLJL(X.C1533790q13 r6, X.C1532310pyf r7, com.lynx.tasm.TemplateBundle r8, java.nio.ByteBuffer r9, byte[] r10, java.lang.String r11) throws java.lang.Throwable {
        /*
            r5 = this;
            X.0q7h r0 = r5.LLILZIL
            r2 = 0
            if (r0 == 0) goto Lb
            com.lynx.tasm.TemplateBundle r0 = r0.LJIILLIIL()
            if (r0 != 0) goto L7b
        Lb:
            X.0q7h r3 = r5.LLILZIL
            if (r3 == 0) goto L7b
            if (r8 != 0) goto L37
            if (r10 == 0) goto L24
            X.0q7I r0 = new X.0q7I
            r0.<init>()
            r0.LIZ = r11
            X.0q7J r0 = r0.LIZ()
            com.lynx.tasm.TemplateBundle r8 = com.lynx.tasm.TemplateBundle.LIZIZ(r10, r0)
            if (r8 != 0) goto L37
        L24:
            if (r9 == 0) goto L8a
            X.0q7I r0 = new X.0q7I
            r0.<init>()
            r0.LIZ = r11
            X.0q7J r0 = r0.LIZ()
            com.lynx.tasm.TemplateBundle r8 = com.lynx.tasm.TemplateBundle.LIZ(r9, r0)
            if (r8 == 0) goto L8a
        L37:
            android.util.LruCache<java.lang.String, X.0q67> r0 = X.C1536910q65.LIZ
            X.0q70 r0 = r5.getHybridContext()
            java.lang.String r0 = r0.LJIJI()
            X.0q67 r4 = new X.0q67
            r4.<init>(r8, r6, r7, r2)
            android.util.LruCache<java.lang.String, X.0q67> r1 = X.C1536910q65.LIZ
            java.lang.String r0 = X.C01CL.LIZ(r0)
            r1.put(r0, r4)
            X.0q7h r0 = r5.LLILZIL
            if (r0 == 0) goto L56
            r0.LJJIFFI(r10)
        L56:
            X.0q7h r0 = r5.LLILZIL
            if (r0 == 0) goto L5d
            r0.LJJII(r9)
        L5d:
            X.0q86 r0 = X.EnumC1538160q86.TEMPLATE_BUNDLE_PARSE_EXTRA
            r5.LJJJI(r0)
            if (r6 == 0) goto L6d
            X.0q70 r1 = r5.getHybridContext()
            java.lang.Class<X.0q13> r0 = X.C1533790q13.class
            r1.LJJ(r0, r6)
        L6d:
            if (r7 == 0) goto L78
            X.0q70 r1 = r5.getHybridContext()
            java.lang.Class<X.0pyf> r0 = X.C1532310pyf.class
            r1.LJJ(r0, r7)
        L78:
            r3.LJJIII(r8)
        L7b:
            X.0q7h r0 = r5.LLILZIL
            if (r0 == 0) goto L89
            com.lynx.tasm.TemplateBundle r0 = r0.LJIILLIIL()
            if (r0 == 0) goto L89
            java.util.Map r2 = r0.LIZJ()
        L89:
            return r2
        L8a:
            r8 = r2
            goto L78
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1537720q7O.LJJIIJZLJL(X.0q13, X.0pyf, com.lynx.tasm.TemplateBundle, java.nio.ByteBuffer, byte[], java.lang.String):java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e A[PHI: r1
      0x002e: PHI (r1v33 X.0q67) = (r1v0 X.0q67), (r1v35 X.0q67) binds: [B:4:0x001c, B:6:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v62, types: [T, com.lynx.tasm.TemplateBundle] */
    /* JADX WARN: Type inference failed for: r0v63, types: [T, X.0q13] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(com.lynx.tasm.TemplateBundle r20, X.C1537830q7Z r21, X.C1533790q13 r22, X.C1537810q7X r23, boolean r24, java.lang.String r25, long r26, X.C1536930q67 r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1537720q7O.LJJ(com.lynx.tasm.TemplateBundle, X.0q7Z, X.0q13, X.0q7X, boolean, java.lang.String, long, X.0q67):void");
    }
}
