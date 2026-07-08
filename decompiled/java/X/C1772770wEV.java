package X;

import Y.ARunnableS103S0100000_3;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.dependency.search.SearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wEV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772770wEV implements InterfaceC1773570wFn {
    public static final Set<Integer> LJIIJ = C13LQ.LJLIIL(new Integer[]{202, 203, 204, 205});
    public InterfaceC1541990qEH LIZ;
    public String LIZIZ;
    public EnumC1165000gQE LIZJ = EnumC1165000gQE.IDLE;
    public C443120HZe<? extends Object, Boolean, ? extends Map<Class<?>, ? extends C1544630qIX<?>>> LIZLLL;
    public int LJ;
    public AbstractC1772940wEm LJFF;
    public InterfaceC1774610wHT LJI;
    public Integer LJII;
    public boolean LJIIIIZZ;
    public C1772800wEY LJIIIZ;

    @Override // X.InterfaceC1773570wFn
    public final View getView() {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZ;
        if (interfaceC1541990qEH != null) {
            return interfaceC1541990qEH.e1();
        }
        return null;
    }

    @Override // X.InterfaceC1773570wFn
    public final void release() {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZ;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.LLD(true);
        }
        this.LIZ = null;
    }

    @Override // X.InterfaceC1773570wFn
    public final C1772800wEY LIZIZ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1773570wFn
    public final boolean LJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1773570wFn
    public final Integer getItemType() {
        return this.LJII;
    }

    @Override // X.InterfaceC1773570wFn
    public final View LIZ(String str) {
        LynxView lynxView;
        if (getView() == null) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("findViewByName, name=");
            sbLIZ.append(str);
            sbLIZ.append(", lynxview is null");
            C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZIZ();
        }
        View view = getView();
        if (!(view instanceof LynxView) || (lynxView = (LynxView) view) == null) {
            return null;
        }
        return lynxView.findViewByName(str);
    }

    @Override // X.InterfaceC1773570wFn
    public final void LIZJ(boolean z) {
        this.LJIIIIZZ = z;
    }

    @Override // X.InterfaceC1773570wFn
    public final void LIZLLL(C1772800wEY c1772800wEY) {
        LJIIIIZZ(true, c1772800wEY, null);
    }

    @Override // X.InterfaceC1773570wFn
    public final void LJFF(JSONObject jSONObject) {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZ;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.LIZ("ec_mix_mall_card_visible", jSONObject);
        }
    }

    public static void LJIIL(InterfaceC1541990qEH interfaceC1541990qEH, Map map) {
        C1544610qIV c1544610qIV;
        C1537480q70 hybridContext;
        C1075770e6J c1075770e6J;
        C1543410qGZ c1543410qGZLJIIJ;
        if (interfaceC1541990qEH != null && (hybridContext = interfaceC1541990qEH.getHybridContext()) != null && (c1075770e6J = (C1075770e6J) hybridContext.LJFF(C1075770e6J.class)) != null && (c1543410qGZLJIIJ = c1075770e6J.LJIIJ()) != null) {
            c1544610qIV = c1543410qGZLJIIJ.LJ;
        } else {
            c1544610qIV = null;
        }
        if ((c1544610qIV instanceof C1544610qIV) && map != null) {
            c1544610qIV.LIZ.putAll(map);
        }
    }

    public final void LJIIJJI(Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateData, enableResetData=");
        sbLIZ.append(z);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZLLL();
        if (this.LIZJ == EnumC1165000gQE.SUCCESS) {
            if (obj instanceof String) {
                if (z) {
                    InterfaceC1541990qEH interfaceC1541990qEH = this.LIZ;
                    if (interfaceC1541990qEH != null) {
                        interfaceC1541990qEH.V0((String) obj);
                    }
                } else {
                    InterfaceC1541990qEH interfaceC1541990qEH2 = this.LIZ;
                    if (interfaceC1541990qEH2 != null) {
                        interfaceC1541990qEH2.d1((String) obj);
                    }
                }
            } else if (obj instanceof Map) {
                if (z) {
                    InterfaceC1541990qEH interfaceC1541990qEH3 = this.LIZ;
                    if (interfaceC1541990qEH3 != null) {
                        Map<String, ? extends Object> mapLJ = (Map) obj;
                        if (mapLJ == null) {
                            mapLJ = C2097608Jq.LJ();
                        }
                        interfaceC1541990qEH3.b1(mapLJ);
                    }
                } else {
                    InterfaceC1541990qEH interfaceC1541990qEH4 = this.LIZ;
                    if (interfaceC1541990qEH4 != null) {
                        Map<String, ? extends Object> mapLJ2 = (Map) obj;
                        if (mapLJ2 == null) {
                            mapLJ2 = C2097608Jq.LJ();
                        }
                        interfaceC1541990qEH4.updateData(mapLJ2);
                    }
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("unsupported update data format, ");
                sbLIZ2.append(obj);
                C2188811AlT.LIZIZ(sbLIZ2);
                C599820Nfo.LIZIZ();
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("SparkLiteCardHolder, updateData, schema=");
        sbLIZ3.append(this.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ3);
        C599820Nfo.LIZLLL();
    }

    public static void LJIIIIZZ(boolean z, C1772800wEY c1772800wEY, Map map) {
        Map map2;
        Map map3;
        C1772820wEa c1772820wEa = c1772800wEY.LJIIJJI;
        c1772820wEa.LIZ = z ? 1 : 0;
        Unit unit = null;
        if (map != null) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Object obj = map.get("extra_timing");
                if ((obj instanceof Map) && (map3 = (Map) obj) != null) {
                    linkedHashMap.putAll(map3);
                }
                Object obj2 = map.get("setup_timing");
                if ((obj2 instanceof Map) && (map2 = (Map) obj2) != null) {
                    linkedHashMap.putAll(map2);
                }
                c1772820wEa.LJJIJ = new JSONObject(linkedHashMap);
                unit = Unit.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C189200o6.m2constructorimpl(unit);
        C1772760wEU.LIZ.getClass();
        C1772760wEU.LIZIZ(c1772820wEa);
    }

    public static void LJIIJ(boolean z, boolean z2, C1772800wEY c1772800wEY) {
        Map<String, Object> map;
        Map<String, Object> map2;
        Map<String, Object> map3;
        Map<String, Object> map4;
        Map<String, Object> map5;
        Map<String, Object> map6;
        Map<String, Object> map7;
        Map<String, Object> map8;
        Map<String, Object> map9;
        Map<String, Object> map10;
        String str = c1772800wEY.LJIILJJIL;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1221270899) {
                if (iHashCode != 1662702951) {
                    if (iHashCode == 1935117079 && str.equals("runtime_card")) {
                        if (z2) {
                            C1772750wET c1772750wET = c1772800wEY.LJIIJ;
                            if (c1772750wET != null && (map10 = c1772750wET.LLIIZ) != null) {
                                map10.put("t_runtime_card_load_start", Long.valueOf(System.currentTimeMillis()));
                                return;
                            }
                            return;
                        }
                        C1772750wET c1772750wET2 = c1772800wEY.LJIIJ;
                        if (c1772750wET2 == null || (map9 = c1772750wET2.LLIIZ) == null) {
                            return;
                        }
                        map9.put("t_runtime_card_load_end", Long.valueOf(System.currentTimeMillis()));
                        return;
                    }
                    return;
                }
                if (!str.equals("operation")) {
                    return;
                }
                if (z2) {
                    if (z) {
                        C1772750wET c1772750wET3 = c1772800wEY.LJIIJ;
                        if (c1772750wET3 == null || (map8 = c1772750wET3.LLIIZ) == null) {
                            return;
                        }
                        map8.put("t_operation_load_start", Long.valueOf(System.currentTimeMillis()));
                        return;
                    }
                    C1772750wET c1772750wET4 = c1772800wEY.LJIIJ;
                    if (c1772750wET4 == null || (map7 = c1772750wET4.LLIIZ) == null) {
                        return;
                    }
                    map7.put("t_operation_update_start", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                if (z) {
                    C1772750wET c1772750wET5 = c1772800wEY.LJIIJ;
                    if (c1772750wET5 == null || (map6 = c1772750wET5.LLIIZ) == null) {
                        return;
                    }
                    map6.put("t_operation_load_end", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                C1772750wET c1772750wET6 = c1772800wEY.LJIIJ;
                if (c1772750wET6 == null || (map5 = c1772750wET6.LLIIZ) == null) {
                    return;
                }
                map5.put("t_operation_update_end", Long.valueOf(System.currentTimeMillis()));
                return;
            }
            if (!str.equals("header")) {
                return;
            }
            if (z2) {
                if (z) {
                    C1772750wET c1772750wET7 = c1772800wEY.LJIIJ;
                    if (c1772750wET7 == null || (map4 = c1772750wET7.LLIIZ) == null) {
                        return;
                    }
                    map4.put("t_header_load_start", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                C1772750wET c1772750wET8 = c1772800wEY.LJIIJ;
                if (c1772750wET8 == null || (map3 = c1772750wET8.LLIIZ) == null) {
                    return;
                }
                map3.put("t_header_update_start", Long.valueOf(System.currentTimeMillis()));
                return;
            }
            if (z) {
                C1772750wET c1772750wET9 = c1772800wEY.LJIIJ;
                if (c1772750wET9 == null || (map2 = c1772750wET9.LLIIZ) == null) {
                    return;
                }
                map2.put("t_header_load_end", Long.valueOf(System.currentTimeMillis()));
                return;
            }
            C1772750wET c1772750wET10 = c1772800wEY.LJIIJ;
            if (c1772750wET10 == null || (map = c1772750wET10.LLIIZ) == null) {
                return;
            }
            map.put("t_header_update_end", Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void LJII(boolean z, EnumC1772960wEo enumC1772960wEo, C1772820wEa c1772820wEa, C1772750wET c1772750wET) {
        boolean z2;
        if (c1772820wEa == null || c1772750wET == null) {
            return;
        }
        if (enumC1772960wEo == EnumC1772960wEo.CACHE) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            long j = c1772820wEa.LJJIIJZLJL - c1772820wEa.LJJIIJ;
            if (j >= 0) {
                if (z2) {
                    c1772750wET.LLFFF += j;
                    return;
                } else {
                    c1772750wET.LLII += j;
                    return;
                }
            }
            return;
        }
        long j2 = c1772820wEa.LJIILLIIL - c1772820wEa.LJIILL;
        if (j2 < 0) {
            return;
        }
        if (z2) {
            c1772750wET.LLFII += j2;
            c1772750wET.LLI++;
        } else {
            c1772750wET.LLIIII += j2;
            c1772750wET.LLIIIJ++;
        }
    }

    public static final InterfaceC1541990qEH LJIIIZ(Context context, C1772800wEY c1772800wEY, C1537480q70 c1537480q70, View view) {
        boolean z;
        SparkContext sparkContext;
        HybridSchemaParam hybridSchemaParamLIZJ;
        AnonymousClass0317 anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin;
        IECommerceHostService iECommerceHostService;
        C928103jz c928103jzLIZIZ;
        Context context2;
        boolean z2;
        String name;
        boolean z3;
        String name2;
        C1537910q7h c1537910q7h;
        LifecycleCoroutineScope lifecycleScope;
        LifecycleOwner lifecycleOwnerLIZ;
        if (c1772800wEY.LIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C599820Nfo.LJ(C599820Nfo.LIZ);
            return null;
        }
        String str = c1772800wEY.LIZ;
        if (!(c1537480q70 instanceof SparkContext) || (sparkContext = (SparkContext) c1537480q70) == null) {
            sparkContext = new SparkContext();
        }
        sparkContext.LJJLIIJ(str);
        sparkContext.bid = "astro_behavior_lynx";
        C1538140q84 c1538140q84 = C1538140q84.LIZ;
        C1538590q8n c1538590q8n = new C1538590q8n();
        c1538590q8n.LIZLLL = true;
        c1538590q8n.LJ = true;
        c1538590q8n.LJFF = false;
        c1538590q8n.LJI = false;
        c1538590q8n.LIZ = true;
        C1538140q84.LIZIZ(c1538140q84, sparkContext, c1538590q8n, 4);
        if (C20161913uj.LIZIZ) {
            if (view != null && (lifecycleOwnerLIZ = C20161913uj.LIZ(view)) != null) {
                lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZ);
            } else {
                lifecycleScope = null;
            }
            sparkContext.coroutineScope = lifecycleScope;
        }
        InterfaceC1531560pxS interfaceC1531560pxS = sparkContext.hybridParams;
        if (interfaceC1531560pxS != null) {
            hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ();
        } else {
            hybridSchemaParamLIZJ = null;
        }
        C1326510kcj.LIZ.getClass();
        C1326510kcj.LIZ(sparkContext);
        InterfaceC1531560pxS interfaceC1531560pxS2 = sparkContext.hybridParams;
        if ((interfaceC1531560pxS2 instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS2) != null) {
            String str2 = c1772800wEY.LIZJ;
            if (str2 != null) {
                c1537910q7h.LJIILJJIL = str2;
            }
            c1537910q7h.LJJ(c1772800wEY.LJ);
        }
        if (hybridSchemaParamLIZJ == null) {
            return null;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin = SearchDependencyService.createISearchDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name3 = ISearchDependencyService.class.getName();
            if (anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ISearchDependencyService.class);
        }
        if (((ISearchDependencyService) anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin).enableMergeMain() && view != null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name4 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
            if (rootPageMonitor != null && (c928103jzLIZIZ = rootPageMonitor.LIZIZ(view)) != null && (context2 = c928103jzLIZIZ.LIZIZ) != null) {
                context = context2;
            }
        }
        return C1537820q7Y.LIZIZ(hybridSchemaParamLIZJ, sparkContext, context, null);
    }

    @Override // X.InterfaceC1773570wFn
    public final View LJI(Context context, C1772800wEY c1772800wEY, LynxViewClient lynxViewClient, AbstractC1772940wEm abstractC1772940wEm, InterfaceC1774610wHT interfaceC1774610wHT, View view) {
        IECommerceHostService iECommerceHostService;
        C1772800wEY c1772800wEYLIZ;
        boolean z;
        String str;
        String strLIZ;
        boolean z2;
        boolean z3;
        final C1772800wEY c1772800wEYLIZ2;
        final InterfaceC1541990qEH interfaceC1541990qEHLJIIIZ;
        C1537720q7O c1537720q7O;
        boolean z4;
        InterfaceC1531560pxS interfaceC1531560pxS;
        C1537910q7h c1537910q7h;
        View viewE1;
        LynxView lynxView;
        Double dLJIILL;
        Object objLIZLLL;
        Double d;
        boolean z5;
        C1537480q70 hybridContext;
        C1537480q70 hybridContext2;
        C1537480q70 hybridContext3;
        C1537480q70 hybridContext4;
        C1537910q7h c1537910q7h2;
        int iIntValue;
        boolean z6;
        String string;
        boolean z7;
        boolean z8;
        String name;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZ;
        this.LJII = c1772800wEY.LJIILL;
        this.LJIIIZ = c1772800wEY;
        View viewE12 = null;
        boolean z9 = false;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z8);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        String str2 = "";
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            if (C7879035x.LIZJ() || Intrinsics.LJFF(C7879035x.LIZIZ(), "local_test")) {
                try {
                    JSONObject jSONObject = new JSONObject(Keva.getRepo("mix_mall_mock_schema_store").getString("key_mix_mall_mock_schema", ""));
                    String str3 = c1772800wEY.LJIILJJIL;
                    if (str3 != null) {
                        String strOptString = jSONObject.optString(str3);
                        if (strOptString == null || strOptString.length() == 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (!z7) {
                            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("getMockSchemaInDebugContext, bffType=");
                            sbLIZ.append(c1772800wEY.LJIILJJIL);
                            sbLIZ.append(", mockSchema=");
                            sbLIZ.append(strOptString);
                            C2188811AlT.LIZIZ(sbLIZ);
                            c599820Nfo.getClass();
                            C599820Nfo.LIZLLL();
                            c1772800wEYLIZ = C1772800wEY.LIZ(c1772800wEY, strOptString);
                        }
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                c1772800wEYLIZ = c1772800wEY;
            } else {
                c1772800wEYLIZ = c1772800wEY;
            }
        } else {
            c1772800wEYLIZ = null;
        }
        if (c1772800wEYLIZ == null) {
            c1772800wEYLIZ = c1772800wEY;
        }
        this.LJFF = abstractC1772940wEm;
        C1772820wEa c1772820wEa = c1772800wEYLIZ.LJIIJJI;
        if (interfaceC1541990qEH == null) {
            z = true;
        } else {
            z = false;
        }
        c1772820wEa.LJIILJJIL = z;
        String str4 = c1772800wEYLIZ.LJIILJJIL;
        if (str4 != null) {
            c1772820wEa.LIZIZ = str4;
        }
        int i = C1772990wEr.LIZ[c1772800wEYLIZ.LJIILIIL.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                str = "other";
            } else {
                str = "first_fetch";
            }
        } else {
            str = "cache";
        }
        c1772820wEa.LJII = str;
        c1772820wEa.LJI = c1772800wEYLIZ.LJIIL;
        String str5 = this.LIZIZ;
        if (str5 == null) {
            str5 = c1772800wEYLIZ.LIZ;
        }
        C1957107lZ.LIZ.getClass();
        c1772820wEa.LIZJ = C1957107lZ.LIZIZ(str5);
        if (!((IHybridDataService) ServiceManager.get().getService(IHybridDataService.class)).LJII()) {
            strLIZ = ((IHybridDataService) ServiceManager.get().getService(IHybridDataService.class)).LIZIZ();
        } else {
            strLIZ = C1957107lZ.LIZ(str5);
        }
        c1772820wEa.LJ = strLIZ;
        Long lLJIIJJI = ((IHybridDataService) ServiceManager.get().getService(IHybridDataService.class)).LJIIJJI(strLIZ);
        if (lLJIIJJI != null && (string = lLJIIJJI.toString()) != null) {
            str2 = string;
        }
        c1772820wEa.LIZLLL = str2;
        c1772820wEa.LJFF = ((IHybridDataService) ServiceManager.get().getService(IHybridDataService.class)).LJ(strLIZ);
        if (interfaceC1541990qEH == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            Map<String, C1311220kE4> map = c1772800wEYLIZ.LJ;
            if (map != null && !map.containsKey("ecGlobalContext")) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("HybridCard render, checkParams, miss global context, schema=");
                sbLIZ2.append(this.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ2);
                C599820Nfo.LIZ.getClass();
                C599820Nfo.LIZIZ();
            }
        }
        Map<Class<?>, C1544630qIX<?>> map2 = c1772800wEYLIZ.LIZLLL;
        if (map2 != null && !map2.containsKey(InterfaceC606320NqI.class)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("HybridCard render, checkParams, miss bridge center, schema=");
            sbLIZ3.append(this.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ3);
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZIZ();
        }
        if (interfaceC1541990qEH == null) {
            c1772800wEYLIZ.LJIIJJI.LJIILL = System.currentTimeMillis();
            LJIIJ(true, true, c1772800wEYLIZ);
            String strLIZ2 = C1940207iq.LIZ(c1772800wEYLIZ.LJIILJJIL, c1772800wEYLIZ.LIZ, c1772800wEYLIZ.LJIIJJI);
            if (!Intrinsics.LJFF(c1772800wEYLIZ.LIZ, strLIZ2)) {
                c1772800wEYLIZ2 = C1772800wEY.LIZ(c1772800wEYLIZ, strLIZ2);
            } else {
                c1772800wEYLIZ2 = c1772800wEYLIZ;
            }
            c1772800wEYLIZ2.LJIIJJI.LJIL = System.currentTimeMillis();
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            InterfaceC1540940qCa interfaceC1540940qCaLJ = C1537060q6K.LJ(context, c1772800wEYLIZ2.LIZ, "ec_mmk_preload", null, 24);
            if (interfaceC1540940qCaLJ instanceof InterfaceC1541990qEH) {
                interfaceC1541990qEHLJIIIZ = (InterfaceC1541990qEH) interfaceC1540940qCaLJ;
            } else {
                interfaceC1541990qEHLJIIIZ = null;
            }
            if (interfaceC1541990qEHLJIIIZ == null) {
                interfaceC1541990qEHLJIIIZ = LJIIIZ(context, c1772800wEYLIZ2, null, view);
            }
            if (interfaceC1541990qEHLJIIIZ instanceof C1537720q7O) {
                c1537720q7O = (C1537720q7O) interfaceC1541990qEHLJIIIZ;
            } else {
                c1537720q7O = null;
            }
            if (c1537720q7O != null && c1537720q7O.getOptimization() == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                C1772750wET c1772750wET = c1772800wEYLIZ2.LJIIJ;
                if (c1772750wET != null) {
                    c1772750wET.LJLIIIL++;
                    String str6 = c1772800wEYLIZ2.LJIILJJIL;
                    if (str6 != null) {
                        Integer num = c1772750wET.LJLIL.get(str6);
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        c1772750wET.LJLIL.put(str6, Integer.valueOf(iIntValue + 1));
                    }
                }
                C1772820wEa c1772820wEa2 = c1772800wEYLIZ2.LJIIJJI;
                if (c1772820wEa2 != null) {
                    c1772820wEa2.LJIILIIL = true;
                }
                IHybridDataService iHybridDataService = (IHybridDataService) PluggableExtentionKt.pluggableSpi$default(IHybridDataService.class, false, false, false, 14, null);
                if (iHybridDataService != null) {
                    iHybridDataService.LJFF();
                }
            }
            c1772800wEYLIZ2.LJIIJJI.LJJ = System.currentTimeMillis();
            C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("obtainKitViewRuntime, cacheExist=");
            sbLIZ4.append(z4);
            sbLIZ4.append(" schema=");
            sbLIZ4.append(c1772800wEYLIZ2.LIZ);
            sbLIZ4.append(", refreshType = ");
            sbLIZ4.append(c1772800wEYLIZ2.LJIILIIL);
            C2188811AlT.LIZIZ(sbLIZ4);
            C599820Nfo.LJ(c599820Nfo2);
            if (interfaceC1541990qEHLJIIIZ != null && (hybridContext4 = interfaceC1541990qEHLJIIIZ.getHybridContext()) != null) {
                InterfaceC1531560pxS interfaceC1531560pxS2 = hybridContext4.hybridParams;
                if (interfaceC1531560pxS2 instanceof C1537910q7h) {
                    c1537910q7h2 = (C1537910q7h) interfaceC1531560pxS2;
                } else {
                    c1537910q7h2 = null;
                }
                if (c1537910q7h2 != null) {
                    C1772820wEa c1772820wEa3 = c1772800wEYLIZ2.LJIIJJI;
                    if (c1772820wEa3 != null) {
                        c1772820wEa3.LJIJJ = System.currentTimeMillis();
                    }
                    boolean zLJFF = Intrinsics.LJFF(((IHybridDataService) ServiceManager.get().getService(IHybridDataService.class)).LJIIL(), Boolean.TRUE);
                    Object obj = c1772800wEYLIZ2.LIZIZ;
                    if (obj instanceof String) {
                        if (zLJFF) {
                            c1537910q7h2.LJIJJ = TemplateData.LJIIIIZZ((String) obj);
                        } else {
                            c1537910q7h2.LJIJJLI(C1067320dsg.LIZIZ((String) obj));
                        }
                    } else if (obj instanceof Map) {
                        if (zLJFF) {
                            c1537910q7h2.LJIJJ = TemplateData.LJII((Map) obj);
                        } else {
                            c1537910q7h2.LJIJJLI(C1067320dsg.LIZ((Map) obj));
                        }
                    } else {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("SparkLiteProvider, get initData, unsupport data format, ");
                        sbLIZ5.append(obj);
                        C2188811AlT.LIZIZ(sbLIZ5);
                        C599820Nfo.LIZLLL();
                    }
                    C1772820wEa c1772820wEa4 = c1772800wEYLIZ2.LJIIJJI;
                    if (c1772820wEa4 != null) {
                        c1772820wEa4.LJIJJLI = System.currentTimeMillis();
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, Object> map3 = c1772800wEYLIZ2.LJFF;
                if (map3 != null) {
                    linkedHashMap.putAll(map3);
                }
                C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
                C1326430kcb.LIZ().LJ(hybridContext4.containerId, linkedHashMap);
            }
            this.LIZ = interfaceC1541990qEHLJIIIZ;
            this.LJI = interfaceC1774610wHT;
            final String str7 = c1772800wEYLIZ2.LIZ;
            this.LIZIZ = str7;
            if (interfaceC1541990qEHLJIIIZ != null && (hybridContext3 = interfaceC1541990qEHLJIIIZ.getHybridContext()) != null) {
                hybridContext3.LJJ(AbstractC1538740q92.class, new AbstractC1538740q92() { // from class: X.0wEc
                    @Override // X.AbstractC1537870q7d
                    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH2, String str8) {
                        AbstractC1772940wEm abstractC1772940wEm2 = this.LLILLJJLI.LJFF;
                        if (abstractC1772940wEm2 != null) {
                            abstractC1772940wEm2.LIZIZ(interfaceC1541990qEH2);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // X.AbstractC1537870q7d
                    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH2, String str8, C1542120qEU c1542120qEU) {
                        C1772810wEZ c1772810wEZ = new C1772810wEZ(this, interfaceC1541990qEH2, str8, c1542120qEU, this.LLILLJJLI, c1772800wEYLIZ2, interfaceC1541990qEHLJIIIZ);
                        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                            c1772810wEZ.invoke();
                        } else {
                            C786410Ut5.LJJZZIII((Handler) C1774060wGa.LIZ.getValue(), new ARunnableS103S0100000_3((Object) c1772810wEZ, 72));
                        }
                    }
                });
            }
            if (interfaceC1541990qEHLJIIIZ != null && (hybridContext2 = interfaceC1541990qEHLJIIIZ.getHybridContext()) != null) {
                interfaceC1531560pxS = hybridContext2.hybridParams;
            } else {
                interfaceC1531560pxS = null;
            }
            if (interfaceC1531560pxS instanceof C1537910q7h) {
                c1537910q7h = (C1537910q7h) interfaceC1531560pxS;
            } else {
                c1537910q7h = null;
            }
            if (c1537910q7h != null) {
                c1537910q7h.LJIIIIZZ(new LynxViewClient() { // from class: X.0wEW
                    @Override // com.lynx.tasm.LynxViewClient, X.AbstractC1298860ju8
                    public final void LJFF(LynxError lynxError) {
                    }

                    @Override // com.lynx.tasm.LynxViewClient
                    public final void LJIJJLI(LynxError lynxError) {
                    }

                    @Override // com.lynx.tasm.LynxViewClient
                    public final void LJIL(LynxError lynxError) {
                    }

                    @Override // com.lynx.tasm.LynxViewClient
                    public final void LJJ(LynxError lynxError) {
                    }

                    @Override // com.lynx.tasm.LynxViewClient
                    public final void LJIILJJIL() {
                        C599820Nfo c599820Nfo3 = C599820Nfo.LIZ;
                        this.LL.getClass();
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("lynx_callback, onLoadSuccess, ");
                        sbLIZ6.append(str7);
                        C2188811AlT.LIZIZ(sbLIZ6);
                        c599820Nfo3.getClass();
                        C599820Nfo.LIZLLL();
                        c1772800wEYLIZ2.LJIIJJI.LJIILLIIL = System.currentTimeMillis();
                        C1772770wEV c1772770wEV = this.LL;
                        C1772800wEY c1772800wEY2 = c1772800wEYLIZ2;
                        c1772770wEV.getClass();
                        C1772770wEV.LJIIJ(true, false, c1772800wEY2);
                        String str8 = c1772800wEYLIZ2.LJIILJJIL;
                        if (str8 != null && Intrinsics.LJFF(str8, "runtime_card")) {
                            c1772800wEYLIZ2.LJIIJJI.LJJIIZ = System.currentTimeMillis();
                            C1772770wEV c1772770wEV2 = this.LL;
                            C1772800wEY c1772800wEY3 = c1772800wEYLIZ2;
                            c1772770wEV2.getClass();
                            C1772770wEV.LJIIIIZZ(true, c1772800wEY3, null);
                        }
                        C1772770wEV c1772770wEV3 = this.LL;
                        c1772770wEV3.LIZJ = EnumC1165000gQE.SUCCESS;
                        AbstractC1772940wEm abstractC1772940wEm2 = c1772770wEV3.LJFF;
                        if (abstractC1772940wEm2 != null) {
                            abstractC1772940wEm2.LIZJ();
                        }
                        if (this.LL.LIZLLL != null) {
                            C599820Nfo.LJ(c599820Nfo3);
                            C1772770wEV c1772770wEV4 = this.LL;
                            InterfaceC1541990qEH interfaceC1541990qEH2 = interfaceC1541990qEHLJIIIZ;
                            C443120HZe<? extends Object, Boolean, ? extends Map<Class<?>, ? extends C1544630qIX<?>>> c443120HZe = c1772770wEV4.LIZLLL;
                            C1772770wEV.LJIIL(interfaceC1541990qEH2, c443120HZe != null ? c443120HZe.getThird() : null);
                            C1772770wEV c1772770wEV5 = this.LL;
                            C443120HZe<? extends Object, Boolean, ? extends Map<Class<?>, ? extends C1544630qIX<?>>> c443120HZe2 = c1772770wEV5.LIZLLL;
                            Object first = c443120HZe2 != null ? c443120HZe2.getFirst() : null;
                            C443120HZe<? extends Object, Boolean, ? extends Map<Class<?>, ? extends C1544630qIX<?>>> c443120HZe3 = this.LL.LIZLLL;
                            c1772770wEV5.LJIIJJI(first, c443120HZe3 != null ? c443120HZe3.getSecond().booleanValue() : false);
                            this.LL.LIZLLL = null;
                        }
                    }

                    @Override // com.lynx.tasm.LynxViewClient
                    public final void LJJIFFI() {
                        AbstractC1772940wEm abstractC1772940wEm2 = this.LL.LJFF;
                        if (abstractC1772940wEm2 != null) {
                            abstractC1772940wEm2.LIZLLL();
                        }
                    }

                    @Override // com.lynx.tasm.LynxViewClient
                    public final void onTimingSetup(Map<String, Object> map4) {
                        Map map5;
                        Long l;
                        Long l2;
                        Long l3;
                        Long l4;
                        Long l5;
                        Map map6;
                        Long l6;
                        Long l7;
                        super.onTimingSetup(map4);
                        C599820Nfo c599820Nfo3 = C599820Nfo.LIZ;
                        this.LL.getClass();
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("lynx_callback, onTimingSetup, url=");
                        sbLIZ6.append(str7);
                        C2188811AlT.LIZIZ(sbLIZ6);
                        c599820Nfo3.getClass();
                        C599820Nfo.LIZLLL();
                        C1772770wEV c1772770wEV = this.LL;
                        C1772820wEa c1772820wEa5 = c1772800wEYLIZ2.LJIIJJI;
                        c1772770wEV.getClass();
                        if (c1772820wEa5 != null && map4 != null) {
                            Object obj2 = map4.get("extra_timing");
                            if ((obj2 instanceof Map) && (map6 = (Map) obj2) != null) {
                                Object obj3 = map6.get("prepare_template_start");
                                if ((obj3 instanceof Long) && (l7 = (Long) obj3) != null) {
                                    c1772820wEa5.LJJI = l7.longValue();
                                }
                                Object obj4 = map6.get("prepare_template_end");
                                if ((obj4 instanceof Long) && (l6 = (Long) obj4) != null) {
                                    c1772820wEa5.LJJIFFI = l6.longValue();
                                }
                            }
                            Object obj5 = map4.get("setup_timing");
                            if ((obj5 instanceof Map) && (map5 = (Map) obj5) != null) {
                                Object obj6 = map5.get("load_template_start");
                                if ((obj6 instanceof Long) && (l5 = (Long) obj6) != null) {
                                    c1772820wEa5.LJJIIJ = l5.longValue();
                                }
                                Object obj7 = map5.get("load_template_end");
                                if ((obj7 instanceof Long) && (l4 = (Long) obj7) != null) {
                                    c1772820wEa5.LJJIIJZLJL = l4.longValue();
                                }
                                Object obj8 = map5.get("create_lynx_start");
                                if ((obj8 instanceof Long) && (l3 = (Long) obj8) != null) {
                                    c1772820wEa5.LJJII = l3.longValue();
                                }
                                Object obj9 = map5.get("create_lynx_end");
                                if ((obj9 instanceof Long) && (l2 = (Long) obj9) != null) {
                                    c1772820wEa5.LJJIII = l2.longValue();
                                }
                                Object obj10 = map5.get("draw_end");
                                if ((obj10 instanceof Long) && (l = (Long) obj10) != null) {
                                    c1772820wEa5.LJJIIZ = l.longValue();
                                }
                            }
                        }
                        C1772770wEV c1772770wEV2 = this.LL;
                        C1772800wEY c1772800wEY2 = c1772800wEYLIZ2;
                        EnumC1772960wEo enumC1772960wEo = c1772800wEY2.LJIILIIL;
                        C1772820wEa c1772820wEa6 = c1772800wEY2.LJIIJJI;
                        C1772750wET c1772750wET2 = c1772800wEY2.LJIIJ;
                        c1772770wEV2.getClass();
                        C1772770wEV.LJII(true, enumC1772960wEo, c1772820wEa6, c1772750wET2);
                        C1772770wEV c1772770wEV3 = this.LL;
                        C1772800wEY c1772800wEY3 = c1772800wEYLIZ2;
                        c1772770wEV3.getClass();
                        C1772770wEV.LJIIIIZZ(true, c1772800wEY3, map4);
                        AbstractC1772940wEm abstractC1772940wEm2 = this.LL.LJFF;
                        if (abstractC1772940wEm2 != null) {
                            abstractC1772940wEm2.LJ(map4);
                        }
                    }
                });
            }
            if (interfaceC1541990qEHLJIIIZ != null && (hybridContext = interfaceC1541990qEHLJIIIZ.getHybridContext()) != null) {
                hybridContext.LJJ(AbstractC1538980q9Q.class, new AbstractC1538980q9Q() { // from class: X.0wEb
                    @Override // X.AbstractC1538980q9Q
                    public final void LJJIJL() {
                    }

                    @Override // X.AbstractC1538980q9Q
                    public final void LJJJJL(String str8) {
                        int iIntValue2;
                        C1772800wEY c1772800wEY2 = c1772800wEYLIZ2;
                        C1772750wET c1772750wET2 = c1772800wEY2.LJIIJ;
                        if (c1772750wET2 != null) {
                            c1772750wET2.LJLJJI++;
                            String str9 = c1772800wEY2.LJIILJJIL;
                            if (str9 != null) {
                                Integer num2 = c1772750wET2.LJLJJLL.get(str9);
                                if (num2 != null) {
                                    iIntValue2 = num2.intValue();
                                } else {
                                    iIntValue2 = 0;
                                }
                                c1772750wET2.LJLJJLL.put(str9, Integer.valueOf(iIntValue2 + 1));
                            }
                        }
                        c1772800wEYLIZ2.LJIIJJI.LJIIL = true;
                        C599820Nfo c599820Nfo3 = C599820Nfo.LIZ;
                        this.getClass();
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("SparkLiteCardHolder, render hit pre decode, refreshType=");
                        sbLIZ6.append(c1772800wEYLIZ2.LJIILIIL);
                        sbLIZ6.append(", baseUrl = ");
                        sbLIZ6.append(str8);
                        C2188811AlT.LIZIZ(sbLIZ6);
                        c599820Nfo3.getClass();
                        C599820Nfo.LIZLLL();
                    }
                });
            }
            this.LJ = 0;
            this.LIZJ = EnumC1165000gQE.LOADING;
            LJIIL(interfaceC1541990qEHLJIIIZ, c1772800wEYLIZ2.LIZLLL);
            InterfaceC599750Nfh interfaceC599750Nfh = c1772800wEYLIZ2.LJIIIIZZ;
            if (interfaceC1541990qEHLJIIIZ != null) {
                viewE1 = interfaceC1541990qEHLJIIIZ.e1();
            } else {
                viewE1 = null;
            }
            if (viewE1 instanceof LynxView) {
                lynxView = (LynxView) viewE1;
            } else {
                lynxView = null;
            }
            C1772750wET c1772750wET2 = c1772800wEYLIZ2.LJIIJ;
            if (lynxView != null && (dLJIILL = ((IHybridDataService) ServiceManager.get().getService(IHybridDataService.class)).LJIILL()) != null) {
                double dDoubleValue = dLJIILL.doubleValue();
                if (interfaceC599750Nfh != null) {
                    objLIZLLL = interfaceC599750Nfh.LIZLLL("device_score", EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                } else {
                    objLIZLLL = null;
                }
                if (objLIZLLL instanceof Double) {
                    d = (Double) objLIZLLL;
                } else {
                    d = null;
                }
                if (d != null) {
                    double dDoubleValue2 = d.doubleValue();
                    if (dDoubleValue2 > 0.0d && dDoubleValue2 <= dDoubleValue) {
                        LynxViewMonitor.Companion.getClass();
                        LynxViewMonitor.INSTANCE.getLynxViewConfig(lynxView).LJ = C00BV.NONE;
                        if (c1772750wET2 != null && !c1772750wET2.LLIIIZ) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            c1772750wET2.LLIIIZ = true;
                        }
                    }
                }
            }
            if (interfaceC1541990qEHLJIIIZ != null) {
                interfaceC1541990qEHLJIIIZ.load();
            }
            C1772760wEU c1772760wEU = C1772760wEU.LIZ;
            C1772820wEa c1772820wEa5 = c1772800wEYLIZ2.LJIIJJI;
            c1772760wEU.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("type", c1772820wEa5.LIZIZ);
            linkedHashMap2.put("gecko_url", c1772820wEa5.LIZJ);
            if (c1772820wEa5.LJIILJJIL) {
                i2 = 1;
            }
            linkedHashMap2.put("is_first_load", Integer.valueOf(i2));
            linkedHashMap2.put("source", c1772820wEa5.LJII);
            linkedHashMap2.put("has_gecko", Integer.valueOf(c1772820wEa5.LJFF ? 1 : 0));
            linkedHashMap2.put("is_required", Integer.valueOf(c1772820wEa5.LJI ? 1 : 0));
            Map<String, ? extends Object> map4 = C1772760wEU.LIZIZ;
            if (map4 != null) {
                linkedHashMap2.putAll(map4);
            }
            linkedHashMap2.putAll(C2190491AoB.LIZ());
            C1018703yb.LJ("rd_mixmall_perf_card_bind", linkedHashMap2);
            if (interfaceC1541990qEHLJIIIZ != null) {
                viewE12 = interfaceC1541990qEHLJIIIZ.e1();
            }
        } else {
            C1772820wEa c1772820wEa6 = c1772800wEYLIZ.LJIIJJI;
            if (c1772820wEa6 != null) {
                c1772820wEa6.LJIILL = System.currentTimeMillis();
            }
            LJIIJ(false, true, c1772800wEYLIZ);
            if (this.LIZJ == EnumC1165000gQE.SUCCESS) {
                LJIIL(this.LIZ, c1772800wEYLIZ.LIZLLL);
                LJIIJJI(c1772800wEYLIZ.LIZIZ, c1772800wEYLIZ.LJII);
            } else {
                this.LIZLLL = new C443120HZe<>(c1772800wEYLIZ.LIZIZ, Boolean.valueOf(c1772800wEYLIZ.LJII), c1772800wEYLIZ.LIZLLL);
            }
            C1772820wEa c1772820wEa7 = c1772800wEYLIZ.LJIIJJI;
            if (c1772820wEa7 != null) {
                c1772820wEa7.LJIILLIIL = System.currentTimeMillis();
            }
            LJIIJ(false, false, c1772800wEYLIZ);
            LJII(false, c1772800wEYLIZ.LJIILIIL, c1772800wEYLIZ.LJIIJJI, c1772800wEYLIZ.LJIIJ);
            viewE12 = interfaceC1541990qEH.e1();
        }
        EnumC1772960wEo enumC1772960wEo = c1772800wEYLIZ.LJIILIIL;
        C1772820wEa c1772820wEa8 = c1772800wEYLIZ.LJIIJJI;
        C1772750wET c1772750wET3 = c1772800wEYLIZ.LJIIJ;
        if (c1772820wEa8 != null && c1772750wET3 != null) {
            if (enumC1772960wEo == EnumC1772960wEo.CACHE) {
                z9 = true;
            }
            long j = c1772820wEa8.LJIILLIIL - c1772820wEa8.LJIILL;
            if (j >= 0) {
                if (z9) {
                    c1772750wET3.LLFF += j;
                    c1772750wET3.LLFZ++;
                } else {
                    c1772750wET3.LLIFFJFJJ += j;
                    c1772750wET3.LLIIIILZ++;
                    return viewE12;
                }
            }
        }
        return viewE12;
    }
}
