package X;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.forest.Forest;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q70, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1537480q70 implements InterfaceC1532890pzb {
    public static final int CONTAINER_TYPE_HYBRIDKIT = 0;
    public AbstractC1539000q9S absSendEventListener;
    public long autoDestroyDelayTimeInMillSeconds;
    public HashMap<String, Object> autoHideLoadingEventExtraInfo;
    public boolean autoReleaseResourceGroup;
    public String bid;
    public String bidFrom;
    public volatile C1538210q8B codeCacheInfo;
    public boolean coldStartEngine;
    public String containerId;
    public int containerType;
    public InterfaceC497601wk coroutineScope;
    public Integer disableHideLoadingByJS;
    public final C1537170q6V dslPrefetchConfig;
    public boolean enableAutoHideLoadingScript;
    public C740870T4j eventCachePool;
    public Integer fmpValueForAutoHideLoadingScript;
    public C1532950pzh forestX;
    public boolean hasTraversePlugin;
    public final C01GW hybridContextProps$delegate;
    public C1542120qEU hybridKitError;
    public InterfaceC1531560pxS hybridParams;
    public String initData;
    public final AtomicReference<Map<String, Object>> initDataRes;
    public AnonymousClass0957<? extends Map<String, ? extends Object>> initDataUrlDeferred;
    public Uri innerUri;
    public boolean isNewAuthChecker;
    public boolean jsbOptimize;
    public boolean jsbOptimizeV2;
    public LifecycleOwner lifecycleOwner;
    public Lifecycle.State lifecycleState;
    public C1538590q8n liteLynxConfig;
    public Map<String, String> lynxBuilderViewConfig;
    public String lynxPrefetchBid;
    public Object lynxSSRRuntime;
    public Map<String, String> lynxViewConfig;
    public C1312970kGt lynxViewGroupWrapper;
    public C1533760q10 mainDocumentGeckoInfo;
    public final Function1<Context, InterfaceC1540940qCa> performanceViewInvoke;
    public C1533020pzo resourceGroup;
    public String resourcePath;
    public volatile boolean resourcePreloadTriggered;
    public C1537510q73 runtimeInfo;
    public InterfaceC1631620sYq<? super InterfaceC1541990qEH, ? super String, Object, Unit> sendEventListener;
    public String ssrCacheKey;
    public boolean startLynxJsRuntimeLater;
    public Set<String> subBids;
    public JSONObject templateResData;
    public EnumC1542040qEM uiType;
    public Uri uri;
    public String url;
    public boolean useGenericFetcher;
    public int useLynxPrefetchVersion;
    public boolean usePreload;
    public boolean useReuse;
    public String vaid;
    public static final C1529830puf Companion = new C1529830puf();
    public static final int CONTAINER_TYPE_SPARK = 1;
    public static final Map<String, C1537480q70> hybridContextMap = new LinkedHashMap();

    public int LJ() {
        return 0;
    }

    public boolean LJIIIIZZ() {
        return false;
    }

    public String LJIIJJI() {
        return "unknown";
    }

    public double LJIILL() {
        return 0.0d;
    }

    public void LJIJJLI() {
    }

    public void LJIL(String str) {
    }

    @Override // X.InterfaceC1532890pzb
    public Map<String, String> LIZ() {
        Uri uriLJ = this.innerUri;
        if (uriLJ == null) {
            uriLJ = C1946007jm.LJ(LJII());
            this.innerUri = uriLJ;
        }
        return C1945807jk.LIZ(uriLJ);
    }

    public C1532950pzh LJI() {
        C1532950pzh c1532950pzh = this.forestX;
        if (c1532950pzh != null) {
            return c1532950pzh;
        }
        C1532950pzh c1532950pzh2 = (C1532950pzh) LJFF(C1532950pzh.class);
        this.forestX = c1532950pzh2;
        return c1532950pzh2;
    }

    public String LJII() {
        Object obj;
        HybridSchemaParam hybridSchemaParamLIZJ;
        InterfaceC1531560pxS interfaceC1531560pxS = this.hybridParams;
        if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null) {
            String url = hybridSchemaParamLIZJ.getUrl();
            if (!(!a0.LJJJIL(url))) {
                url = null;
            }
            if (url == null) {
                url = hybridSchemaParamLIZJ.getSurl();
                if (!(!a0.LJJJIL(url))) {
                    url = null;
                }
            }
            if (url != null) {
                return url;
            }
        }
        try {
            String strLJIJI = LJIJI();
            boolean zLJJIIJZLJL = u.LJJIIJZLJL(strLJIJI, "http", false);
            String strLIZJ = strLJIJI;
            if (!zLJJIIJZLJL) {
                String strLIZJ2 = C1946007jm.LIZJ(LJIJ(), "url");
                strLIZJ = strLIZJ2;
                if (strLIZJ2 == null) {
                    String strLIZJ3 = C1946007jm.LIZJ(LJIJ(), "surl");
                    strLIZJ = strLIZJ3;
                    if (strLIZJ3 == null) {
                        strLIZJ = C1946007jm.LIZJ(LJIJ(), "res_url");
                    }
                }
            }
            C189200o6.m2constructorimpl(strLIZJ);
            obj = strLIZJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        return (String) (C189200o6.m7isFailureimpl(obj) ? null : obj);
    }

    public final C1514810pWR LJIIIZ() {
        return (C1514810pWR) this.hybridContextProps$delegate.getValue();
    }

    public final Map<String, Object> LJIIJ() {
        C1535850q4N c1535850q4N = C1535630q41.LJII;
        if ((c1535850q4N == null || c1535850q4N.LIZ) ? false : true) {
            return null;
        }
        Map<String, Object> map = this.initDataRes.get();
        if (map != null) {
            return map;
        }
        AnonymousClass0957<? extends Map<String, ? extends Object>> anonymousClass0957 = this.initDataUrlDeferred;
        if (anonymousClass0957 != null) {
            if (!(anonymousClass0957.isCancelled())) {
                C1535850q4N c1535850q4N2 = C1535630q41.LJII;
                long j = c1535850q4N2 != null ? c1535850q4N2.LIZIZ : 2000L;
                try {
                    ((Number) C23250099c.LJ(C23271099x.INSTANCE, new C1384805bS(j, this, null))).intValue();
                } catch (C094W e) {
                    TryCatchGuardChecker.doCheck(e);
                    AnonymousClass0957<? extends Map<String, ? extends Object>> anonymousClass09572 = this.initDataUrlDeferred;
                    if (anonymousClass09572 != null) {
                        anonymousClass09572.LIZIZ(null);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(j);
                    sbLIZ.append(" ms");
                    C1514680pWE.LIZ(this.containerId, "init_data_url", "resourceLoad", "", LJIJI(), this.bid, C2188811AlT.LIZIZ(sbLIZ), "timeout");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    AnonymousClass0957<? extends Map<String, ? extends Object>> anonymousClass09573 = this.initDataUrlDeferred;
                    if (anonymousClass09573 != null) {
                        anonymousClass09573.LIZIZ(null);
                    }
                    C1514680pWE.LIZ(this.containerId, "init_data_url", "resourceLoad", "", LJIJI(), this.bid, th.toString(), "timeout");
                }
                return this.initDataRes.get();
            }
        }
        return null;
    }

    public final Uri LJIJ() {
        Uri uri = this.uri;
        if (uri != null) {
            return uri;
        }
        Uri uriLJ = C1946007jm.LJ(LJIJI());
        this.uri = uriLJ;
        return uriLJ;
    }

    public final String LJIJI() {
        LJIL(this.url);
        return this.url;
    }

    public final InterfaceC1541990qEH LJIJJ() {
        C1529870puj c1529870puj = C1529870puj.LIZ;
        String str = this.containerId;
        c1529870puj.getClass();
        return C1529870puj.LJFF(str);
    }

    public final void LJJIFFI() {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1537410q6t c1537410q6tLIZIZ = C1161970gLL.LIZIZ();
        C1529830puf c1529830puf = Companion;
        String str = this.containerId;
        c1529830puf.getClass();
        c1537410q6tLIZIZ.LJ(C1529830puf.LIZ(str), true);
    }

    public final void LJJIIZI() {
        C740870T4j c740870T4j;
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        HybridSchemaParam hybridSchemaParamLIZJ;
        InterfaceC1531560pxS interfaceC1531560pxS = this.hybridParams;
        if ((interfaceC1531560pxS == null || (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) == null || !hybridSchemaParamLIZJ.getDisableEventCache()) && (c740870T4j = this.eventCachePool) != null) {
            for (Pair<String, Object> pair : c740870T4j.LIZ) {
                String first = pair.getFirst();
                Object second = pair.getSecond();
                if (second == null) {
                    InterfaceC1541990qEH interfaceC1541990qEHLJIJJ2 = LJIJJ();
                    if (interfaceC1541990qEHLJIJJ2 != null) {
                        interfaceC1541990qEHLJIJJ2.X0(first, null);
                    }
                } else if (second instanceof List) {
                    InterfaceC1541990qEH interfaceC1541990qEHLJIJJ3 = LJIJJ();
                    if (interfaceC1541990qEHLJIJJ3 != null) {
                        interfaceC1541990qEHLJIJJ3.X0(first, (List) second);
                    }
                } else if (second instanceof JSONObject) {
                    InterfaceC1541990qEH interfaceC1541990qEHLJIJJ4 = LJIJJ();
                    if (interfaceC1541990qEHLJIJJ4 != null) {
                        interfaceC1541990qEHLJIJJ4.LIZ(first, (JSONObject) second);
                    }
                } else if ((second instanceof Map) && (interfaceC1541990qEHLJIJJ = LJIJJ()) != null) {
                    interfaceC1541990qEHLJIJJ.Y0(first, (Map) second);
                }
            }
            c740870T4j.LIZ.clear();
        }
    }

    public boolean LJJIJIIJI() {
        InterfaceC1531560pxS interfaceC1531560pxS;
        return a0.LJJIIZI(this.url, "use_forest=1", true) || ((interfaceC1531560pxS = this.hybridParams) != null && interfaceC1531560pxS.LIZIZ());
    }

    public final int hashCode() {
        return this.containerId.hashCode();
    }

    public C1537480q70() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('-');
        sbLIZ.append(UUID.randomUUID());
        this.containerId = C2188811AlT.LIZIZ(sbLIZ);
        this.containerType = CONTAINER_TYPE_HYBRIDKIT;
        this.performanceViewInvoke = new C1537500q72();
        this.bid = "hybridkit_default_bid";
        this.vaid = "";
        this.runtimeInfo = new C1537510q73();
        this.templateResData = new JSONObject();
        this.bidFrom = "hybridkit_default_bid";
        this.lynxPrefetchBid = "hybridkit_default_bid";
        this.resourcePath = "";
        this.uiType = EnumC1542040qEM.VIEW;
        this.autoReleaseResourceGroup = true;
        this.autoHideLoadingEventExtraInfo = new HashMap<>();
        this.dslPrefetchConfig = new C1537170q6V();
        this.url = "";
        this.initDataRes = new AtomicReference<>(null);
        this.subBids = Collections.synchronizedSet(new LinkedHashSet());
        this.autoDestroyDelayTimeInMillSeconds = 200L;
        this.lifecycleState = Lifecycle.State.INITIALIZED;
        this.hybridContextProps$delegate = C452501pT.LIZIZ(new C1522260piS(this));
    }

    public final void LJJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('-');
        sbLIZ.append(UUID.randomUUID());
        this.containerId = C2188811AlT.LIZIZ(sbLIZ);
        LJIIIZ().LIZJ(EnumC1521110pgb.CONTAINER_ID.getKey(), this.containerId);
    }

    public Function1<Context, InterfaceC1540940qCa> LJIIL() {
        return this.performanceViewInvoke;
    }

    public final Set<String> LJIILLIIL() {
        return this.subBids;
    }

    @Override // X.InterfaceC1532890pzb
    public final String getGroupId() {
        return this.containerId;
    }

    public final void LIZIZ(String str) {
        if (str != null) {
            this.subBids.add(str);
        }
    }

    public final boolean LIZJ(String str) {
        C1533020pzo c1533020pzo = this.resourceGroup;
        if (c1533020pzo == null) {
            return false;
        }
        this.resourceGroup = null;
        this.codeCacheInfo = null;
        WeakReference weakReference = new WeakReference(this);
        C086F c086f = C086F.LIZ;
        C1537530q75 c1537530q75 = new C1537530q75(c1533020pzo, str, weakReference);
        c086f.getClass();
        C086F.LJI(c1537530q75);
        return true;
    }

    public final <T> T LIZLLL(Class<T> cls) {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1537410q6t c1537410q6tLIZIZ = C1161970gLL.LIZIZ();
        C1529830puf c1529830puf = Companion;
        String str = this.containerId;
        c1529830puf.getClass();
        InterfaceC1537420q6u interfaceC1537420q6u = (InterfaceC1537420q6u) ((ConcurrentHashMap) c1537410q6tLIZIZ.LIZJ).get(C1529830puf.LIZ(str));
        if (interfaceC1537420q6u != null) {
            return (T) interfaceC1537420q6u.LJ(cls);
        }
        return null;
    }

    public final <T> T LJFF(Class<T> cls) {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1537410q6t c1537410q6tLIZIZ = C1161970gLL.LIZIZ();
        C1529830puf c1529830puf = Companion;
        String str = this.containerId;
        c1529830puf.getClass();
        return (T) c1537410q6tLIZIZ.LIZLLL(cls, C1529830puf.LIZ(str));
    }

    public EnumC1540340qBc LJIIZILJ(Context context) {
        HybridSchemaParam hybridSchemaParamLIZJ;
        String forceThemeStyle;
        EnumC1540340qBc enumC1540340qBc;
        InterfaceC1531560pxS interfaceC1531560pxS = this.hybridParams;
        if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null && (forceThemeStyle = hybridSchemaParamLIZJ.getForceThemeStyle()) != null) {
            if (u.LJIJI(forceThemeStyle, "dark", true)) {
                enumC1540340qBc = EnumC1540340qBc.DARK;
            } else if (u.LJIJI(forceThemeStyle, "light", true)) {
                enumC1540340qBc = EnumC1540340qBc.LIGHT;
            }
            if (enumC1540340qBc != null) {
                return enumC1540340qBc;
            }
        }
        return EnumC1540340qBc.LIGHT;
    }

    public final void LJJII(String str) {
        if (str != null) {
            this.subBids.remove(str);
        }
    }

    public final <T> void LJJIII(Class<T> cls) {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1537410q6t c1537410q6tLIZIZ = C1161970gLL.LIZIZ();
        C1529830puf c1529830puf = Companion;
        String str = this.containerId;
        c1529830puf.getClass();
        InterfaceC1537420q6u interfaceC1537420q6u = (InterfaceC1537420q6u) ((ConcurrentHashMap) c1537410q6tLIZIZ.LIZJ).get(C1529830puf.LIZ(str));
        if (interfaceC1537420q6u != null) {
            interfaceC1537420q6u.LIZ(cls);
        }
    }

    public final void LJJIIZ(String str) {
        int iLJJIZ;
        String strSubstring;
        String strSubstring2;
        this.url = str;
        C1537170q6V c1537170q6V = this.dslPrefetchConfig;
        if (c1537170q6V.LIZ == 0 && C1535630q41.LJJIIJ) {
            int iLJJJ = a0.LJJJ(str, "prefetch_dsl_name", 0, false, 6);
            if (iLJJJ != -1) {
                int i = iLJJJ + 17;
                if (i <= str.length()) {
                    if (str.charAt(i) == '=') {
                        int i2 = iLJJJ + 18;
                        int iLJJIZ2 = a0.LJJIZ(str, '&', i2, false, 4);
                        if (iLJJIZ2 == -1) {
                            strSubstring2 = str.substring(i2);
                        } else {
                            strSubstring2 = str.substring(i2, iLJJIZ2);
                        }
                        c1537170q6V.LIZIZ = a0.LJJLIIIJ(strSubstring2, new char[]{','}, false, 0, 6);
                        c1537170q6V.LIZ = 1;
                        return;
                    }
                    int i3 = iLJJJ + 20;
                    if (i3 >= str.length()) {
                        return;
                    }
                    Integer numValueOf = Integer.valueOf(a0.LJJJ(str, "%26", i3, false, 4));
                    if (numValueOf.intValue() != -1) {
                        iLJJIZ = numValueOf.intValue();
                    } else {
                        iLJJIZ = a0.LJJIZ(str, '&', i3, false, 4);
                    }
                    if (iLJJIZ == -1) {
                        strSubstring = str.substring(i3);
                    } else {
                        strSubstring = str.substring(i3, iLJJIZ);
                    }
                    c1537170q6V.LIZIZ = a0.LJJLIIIJ(strSubstring, new char[]{','}, false, 0, 6);
                    c1537170q6V.LIZ = 1;
                    return;
                }
                return;
            }
            c1537170q6V.LIZ = -1;
        }
    }

    public final void LJJIJ(long j) throws JSONException {
        JSONObject jSONObject = this.templateResData;
        if (jSONObject.length() == 0) {
            jSONObject.put("container_init_cost", j);
            return;
        }
        if ((jSONObject.length() != 1 || jSONObject.optLong("container_init_cost") != 0) && jSONObject.length() <= 1) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("container_init_cost", j);
        this.templateResData = jSONObject2;
    }

    public final void LJJIJIIJIL(AbstractC1538740q92 abstractC1538740q92) {
        LJJ(AbstractC1538740q92.class, abstractC1538740q92);
    }

    public final void LJJIJIL(String str) {
        C1514810pWR c1514810pWRLJIIIZ = LJIIIZ();
        c1514810pWRLJIIIZ.getClass();
        C1491570oux c1491570oux = C1491570oux.LIZ;
        String str2 = c1514810pWRLJIIIZ.LIZ;
        EnumC1491500ouq enumC1491500ouq = EnumC1491500ouq.EXTEND;
        c1491570oux.getClass();
        C1491570oux.LJIJJ(str2, str, enumC1491500ouq);
        if (C1491570oux.LIZIZ) {
            C1491570oux.LJIIL(EnumC1491590ouz.SetPropertiesFinalState, str, Boolean.FALSE);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1537480q70) {
            return Intrinsics.LJFF(((C1537480q70) obj).containerId, this.containerId);
        }
        return false;
    }

    @Override // X.InterfaceC679950Qll
    public String get(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(LJIJ(), str);
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            Uri uriLJ = this.innerUri;
            if (uriLJ == null) {
                uriLJ = C1946007jm.LJ(LJII());
                this.innerUri = uriLJ;
            }
            return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, str);
        }
        return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
    }

    public C1533020pzo LJIILIIL(boolean z, Forest forest) {
        String accessKey;
        HybridSchemaParam hybridSchemaParamLIZJ;
        C1533560q0g config;
        C1533570q0h c1533570q0h;
        C1533020pzo c1533020pzo = this.resourceGroup;
        if (c1533020pzo != null) {
            C1532950pzh c1532950pzhLJI = LJI();
            if (c1532950pzhLJI == null) {
                c1532950pzhLJI = c1533020pzo.LJIIIIZZ;
            }
            c1533020pzo.LJIIIIZZ = c1532950pzhLJI;
            return c1533020pzo;
        }
        if (!z && !C1535630q41.LJJIII) {
            return null;
        }
        C1532950pzh c1532950pzhLJI2 = LJI();
        if (c1532950pzhLJI2 == null) {
            C1532680pzG.LIZ.getClass();
            c1532950pzhLJI2 = C1532680pzG.LJJ;
        }
        String strLJIIJJI = LJIIJJI();
        InterfaceC1531560pxS interfaceC1531560pxS = this.hybridParams;
        if (interfaceC1531560pxS == null || (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) == null || (((accessKey = hybridSchemaParamLIZJ.getAccessKey()) == null && (accessKey = hybridSchemaParamLIZJ.getAccessKeyBp()) == null && (forest == null || (config = forest.getConfig()) == null || (c1533570q0h = config.LIZIZ) == null || (accessKey = c1533570q0h.LIZ) == null)) || !(!a0.LJJJIL(accessKey)))) {
            accessKey = null;
        }
        C1533020pzo c1533020pzo2 = new C1533020pzo(c1532950pzhLJI2, strLJIIJJI, accessKey, this.containerId, z, 8);
        this.resourceGroup = c1533020pzo2;
        return c1533020pzo2;
    }

    public final <T> void LJJ(Class<T> cls, T t) {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1537410q6t c1537410q6tLIZIZ = C1161970gLL.LIZIZ();
        C1529830puf c1529830puf = Companion;
        String str = this.containerId;
        c1529830puf.getClass();
        String strLIZ = C1529830puf.LIZ(str);
        if (((ConcurrentHashMap) c1537410q6tLIZIZ.LIZJ).get(strLIZ) == null) {
            ((ConcurrentHashMap) c1537410q6tLIZIZ.LIZJ).put(strLIZ, new C1537440q6w());
        }
        InterfaceC1537420q6u interfaceC1537420q6u = (InterfaceC1537420q6u) ((ConcurrentHashMap) c1537410q6tLIZIZ.LIZJ).get(strLIZ);
        if (interfaceC1537420q6u != null) {
            interfaceC1537420q6u.LIZLLL(cls, t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void LJJIIJ(Class<T> cls, T t) {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1537410q6t c1537410q6tLIZIZ = C1161970gLL.LIZIZ();
        C1529830puf c1529830puf = Companion;
        String str = this.containerId;
        c1529830puf.getClass();
        InterfaceC1537420q6u interfaceC1537420q6u = (InterfaceC1537420q6u) ((ConcurrentHashMap) c1537410q6tLIZIZ.LIZJ).get(C1529830puf.LIZ(str));
        if (interfaceC1537420q6u != 0) {
            Object objLIZIZ = interfaceC1537420q6u.LIZIZ(cls);
            if ((objLIZIZ instanceof InterfaceC1537460q6y) && (t instanceof InterfaceC1537460q6y)) {
                Object obj = null;
                if (Intrinsics.LJFF(objLIZIZ, t)) {
                    interfaceC1537420q6u.LIZ(cls);
                    Object next = ((InterfaceC1537460q6y) objLIZIZ).next();
                    if (next != null) {
                        obj = next;
                    }
                    interfaceC1537420q6u.LIZLLL(cls, obj);
                    return;
                }
                InterfaceC1537460q6y interfaceC1537460q6y = (InterfaceC1537460q6y) objLIZIZ;
                Object next2 = ((InterfaceC1537460q6y) objLIZIZ).next();
                if (!(next2 instanceof InterfaceC1537460q6y)) {
                    return;
                }
                InterfaceC1537460q6y interfaceC1537460q6y2 = (InterfaceC1537460q6y) next2;
                InterfaceC1537460q6y interfaceC1537460q6y3 = interfaceC1537460q6y;
                while (interfaceC1537460q6y2 != null) {
                    if (Intrinsics.LJFF(interfaceC1537460q6y2, t)) {
                        if (interfaceC1537460q6y3 == 0) {
                            return;
                        }
                        Object next3 = interfaceC1537460q6y2.next();
                        if (next3 != null) {
                            obj = next3;
                        }
                        interfaceC1537460q6y3.LJIJ(obj);
                        return;
                    }
                    Object next4 = interfaceC1537460q6y2.next();
                    if (!(next4 instanceof InterfaceC1537460q6y)) {
                        return;
                    }
                    interfaceC1537460q6y3 = interfaceC1537460q6y2;
                    interfaceC1537460q6y2 = (InterfaceC1537460q6y) next4;
                }
                return;
            }
            interfaceC1537420q6u.LIZ(cls);
        }
    }

    public final void LJJIIJZLJL(Object obj, String str) {
        HybridSchemaParam hybridSchemaParamLIZJ;
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ = LJIJJ();
        if (interfaceC1541990qEHLJIJJ != null && interfaceC1541990qEHLJIJJ.Z0()) {
            if (obj == null) {
                interfaceC1541990qEHLJIJJ.X0(str, null);
                return;
            }
            if (obj instanceof List) {
                interfaceC1541990qEHLJIJJ.X0(str, (List) obj);
                return;
            } else if (obj instanceof JSONObject) {
                interfaceC1541990qEHLJIJJ.LIZ(str, (JSONObject) obj);
                return;
            } else {
                if (!(obj instanceof Map)) {
                    return;
                }
                interfaceC1541990qEHLJIJJ.Y0(str, (Map) obj);
                return;
            }
        }
        InterfaceC1531560pxS interfaceC1531560pxS = this.hybridParams;
        if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null && hybridSchemaParamLIZJ.getDisableEventCache()) {
            return;
        }
        C740870T4j c740870T4j = this.eventCachePool;
        if (c740870T4j == null) {
            synchronized (this) {
                try {
                    c740870T4j = this.eventCachePool;
                    if (c740870T4j == null) {
                        c740870T4j = new C740870T4j();
                        this.eventCachePool = c740870T4j;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        c740870T4j.LIZ.add(new Pair<>(str, obj));
    }

    public static /* synthetic */ C1533020pzo LJIILJJIL(C1537480q70 c1537480q70, boolean z, Forest forest, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            forest = null;
        }
        return c1537480q70.LJIILIIL(z, forest);
    }
}
