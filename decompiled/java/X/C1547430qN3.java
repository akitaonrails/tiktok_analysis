package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.forest.Forest;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings;
import com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel;
import com.ss.android.ugc.aweme.minis.viewmodel.SingleLiveEvent;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.AFwS308S0000000_23;
import kotlin.jvm.internal.AwS70S2100000_23;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qN3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547430qN3 {
    public static WeakReference<InterfaceC1877250yx1> LIZIZ;
    public static WeakReference<InterfaceC1547420qN2> LIZJ;
    public static final C1546510qLZ LJIIIIZZ;
    public static final C1547430qN3 LIZ = new C1547430qN3();
    public static final C1547490qN9 LIZLLL = new InterfaceC1877240yx0() { // from class: X.0qN9
        @Override // X.InterfaceC1877240yx0
        public final InterfaceC1877250yx1 LIZ() {
            C1547430qN3.LIZ.getClass();
            WeakReference<InterfaceC1877250yx1> weakReference = C1547430qN3.LIZIZ;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }
    };
    public static final C1323430kXl LJ = new AbstractC1539020q9U() { // from class: X.0kXl
        @Override // X.InterfaceC1539090q9b
        public final void LIZ(InterfaceC1541990qEH interfaceC1541990qEH) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AbsKitViewPreDestroyCallback, onPreDestroy, kitView:");
            sbLIZ.append(interfaceC1541990qEH);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    };
    public static final C1554500qYS LJFF = new C1554500qYS(7);
    public static final C1554490qYR LJI = new C1554490qYR(3);
    public static final C1547440qN4 LJII = new C1543000qFu() { // from class: X.0qN4
        @Override // X.C1543000qFu
        public final Map<Class<?>, C1544630qIX<?>> LJII() {
            int i = C2187451AjH.LIZ;
            return null;
        }

        @Override // X.C1543000qFu
        public final Map<Class<?>, C1544620qIW<?>> LJIIIIZZ() {
            int i = C2187451AjH.LIZ;
            HashMap map = new HashMap();
            map.put(InterfaceC1877240yx0.class, new C1544620qIW(C1547430qN3.LIZLLL));
            return map;
        }
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0qN9] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0kXl] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0qN4] */
    static {
        C1546510qLZ c1546510qLZ = new C1546510qLZ();
        c1546510qLZ.LIZ = true;
        MinisConfigSettings.HotLoad hotLoad = MinisConfigSettings.LIZ().hotLoad;
        c1546510qLZ.LIZLLL = hotLoad != null ? hotLoad.count : 2;
        c1546510qLZ.LJFF = "minis";
        c1546510qLZ.LIZIZ = true;
        c1546510qLZ.LJII = MinisConfigSettings.LIZ().hotLoad != null ? Long.valueOf(r0.duration) : 300L;
        c1546510qLZ.LJIIIIZZ = true;
        c1546510qLZ.LJIIIZ = AFwS308S0000000_23.get$arr$(24);
        c1546510qLZ.LJIILL = AFwS263S0000000_23.get$arr$(54);
        c1546510qLZ.LJIIJ = AFwS263S0000000_23.get$arr$(55);
        c1546510qLZ.LJIIJJI = AFwS308S0000000_23.get$arr$(25);
        LJIIIIZZ = c1546510qLZ;
    }

    public static InterfaceC1547420qN2 LJIIL() {
        WeakReference<InterfaceC1547420qN2> weakReference = LIZJ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void LJJ() {
        int i = C2187451AjH.LIZ;
        C1546500qLY c1546500qLY = C1546560qLe.LIZ;
        C1546510qLZ c1546510qLZ = LJIIIIZZ;
        c1546500qLY.getClass();
        C1546500qLY.LJIIIIZZ(c1546510qLZ.LJFF);
    }

    public static String LJI(String str) throws JSONException {
        Uri.Builder builderBuildUpon = UriProtector.parse("https://connect.tiktok-minis.com/libs/vConsole.html").buildUpon();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("platform", "Android");
        C844470XAv.LIZ.getClass();
        jSONObject.put("appVersion", C844470XAv.LJFF());
        return LJ(builderBuildUpon.appendQueryParameter("ttmg_app_info", C786410Ut5.J3(jSONObject)).build().toString(), str, "00000000");
    }

    public static void LJIIJ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        String strLJIJI;
        SparkContext sparkContext;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null) {
            strLJIJI = sparkContext.LJIJI();
            if (strLJIJI != null) {
                C1546560qLe.LIZ.getClass();
                C1546500qLY.LIZIZ(strLJIJI, "minis");
            }
        } else {
            strLJIJI = null;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forceRemoveFromSparkViewCache, schemaUrl:");
        sbLIZ.append(strLJIJI);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static NetworkResponse LJIIJJI(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        SparkContext sparkContext;
        new NetworkResponse(null, null, false, null, false, null, null);
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null) {
            return (NetworkResponse) sparkContext.LJFF(NetworkResponse.class);
        }
        return null;
    }

    public static C1533900q1E LJIILIIL(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        SparkContext sparkContext;
        C1533840q18 c1533840q18;
        C1533900q1E c1533900q1E = null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null && (c1533840q18 = (C1533840q18) sparkContext.LJFF(C1533840q18.class)) != null) {
            c1533900q1E = c1533840q18.LIZ;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("geckoResStatics, getPageResourceGroup, resourceGroup:");
        sbLIZ.append(c1533900q1E);
        C2188811AlT.LIZIZ(sbLIZ);
        return c1533900q1E;
    }

    public static C2190031AnR LJIILJJIL(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        SparkContext sparkContext;
        C2190031AnR c2190031AnR = null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
            if (sparkContext != null) {
                LIZ.getClass();
                c2190031AnR = (C2190031AnR) sparkContext.LJFF(C2190031AnR.class);
            }
        } else {
            sparkContext = null;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getSparkViewSource, sparkViewSource:");
        sbLIZ.append(c2190031AnR);
        sbLIZ.append(", sparkContext:");
        sbLIZ.append(sparkContext);
        C2188811AlT.LIZIZ(sbLIZ);
        return c2190031AnR;
    }

    public static void LJIJI(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        SparkContext sparkContext;
        String strLJIJI;
        SparkSchemaParam sparkSchemaParamLJJJI = null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
        } else {
            sparkContext = null;
        }
        NetworkResponse networkResponseLJIIJJI = LJIIJJI(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processAfterUseCached, sparkView:");
        sbLIZ.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        sbLIZ.append(", bindNetworkResponse:");
        sbLIZ.append(networkResponseLJIIJJI);
        sbLIZ.append(", sparkContext url:");
        if (sparkContext != null) {
            strLJIJI = sparkContext.LJIJI();
        } else {
            strLJIJI = null;
        }
        sbLIZ.append(strLJIJI);
        C2188811AlT.LIZIZ(sbLIZ);
        if (networkResponseLJIIJJI != null) {
            LIZ.getClass();
            new NetworkResponse(null, null, false, null, false, null, null);
            if (sparkContext != null) {
                sparkContext.LJJ(NetworkResponse.class, networkResponseLJIIJJI);
            }
        }
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            if (sparkContext != null) {
                C1529880puk c1529880puk = SparkContext.Companion;
                sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
            }
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJIIJIL(sparkContext, sparkSchemaParamLJJJI);
        }
    }

    public static void LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, MinisViewModel minisViewModel) {
        String str;
        MinisMetaResp minisMetaResp;
        MinisMetaResp minisMetaResp2;
        NetworkResponse<MinisMetaResp> networkResponseLJIIJJI = LJIIJJI(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindCacheDataToMinisViewModel, cached bind data, bindNetworkResponse:");
        sbLIZ.append(networkResponseLJIIJJI);
        sbLIZ.append(", clientKey:");
        String str2 = null;
        if (networkResponseLJIIJJI != null && (minisMetaResp2 = networkResponseLJIIJJI.data) != null) {
            str = minisMetaResp2.clientKey;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", minisUrl:");
        if (networkResponseLJIIJJI != null && (minisMetaResp = networkResponseLJIIJJI.data) != null) {
            str2 = minisMetaResp.minisUrl;
        }
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (networkResponseLJIIJJI != null && minisViewModel != null) {
            minisViewModel.AQ2(networkResponseLJIIJJI);
        }
    }

    public static void LIZIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, C2196391Axh c2196391Axh) {
        Integer numValueOf;
        int i;
        int i2;
        C1533900q1E c1533900q1ELJIILIIL = LJIILIIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        boolean z = false;
        if (c2196391Axh != null) {
            if (c1533900q1ELJIILIIL != null) {
                i = c1533900q1ELJIILIIL.LJIILIIL;
            } else {
                i = 0;
            }
            c2196391Axh.setHitCacheCount(i);
            if (c1533900q1ELJIILIIL != null) {
                i2 = c1533900q1ELJIILIIL.LJ;
            } else {
                i2 = 0;
            }
            c2196391Axh.setTotalCacheCount(i2);
            if (c2196391Axh.getHitCacheCount() > 0) {
                z = true;
            }
            c2196391Axh.setHasResourceCache(z);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("geckoResStatics, bindGeckoPerfStatics, successfulFetchCount:");
        Integer numValueOf2 = null;
        if (c1533900q1ELJIILIIL != null) {
            numValueOf = Integer.valueOf(c1533900q1ELJIILIIL.LJIILIIL);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", fetchCount:");
        if (c1533900q1ELJIILIIL != null) {
            numValueOf2 = Integer.valueOf(c1533900q1ELJIILIIL.LJ);
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(", webviewLoadStageInfo:");
        sbLIZ.append(c2196391Axh);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, C2190031AnR c2190031AnR) {
        SparkContext sparkContext;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
        } else {
            sparkContext = null;
        }
        if (sparkContext != null) {
            sparkContext.LJJ(C2190031AnR.class, c2190031AnR);
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindSparkViewSource, sparkViewSource:");
        sbLIZ.append(c2190031AnR);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static SparkContext LIZLLL(String str, C1547450qN5 c1547450qN5) {
        Forest forest;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(str);
        sparkContext.LJJJJL(C2429209fW.LIZ().appendDataFlowId(sparkContext.bundle, "402685961"));
        sparkContext.LJJJJL(C2429209fW.LIZ().appendDataFlowId(sparkContext.bundle, "402653198"));
        sparkContext.bizCert = new ThirdPartyBizCert(402653198);
        sparkContext.LJJJJZI(LJFF);
        sparkContext.LJJJJZ(LJI);
        sparkContext.LJJ(AbstractC1539020q9U.class, LJ);
        JSONArray jSONArray = C1533710q0v.LIZ;
        IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(sparkContext, false);
        if (iResourceServiceXLIZIZ != null && (forest = iResourceServiceXLIZIZ.getForest()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("minis-");
            sbLIZ.append(sparkContext.containerId);
            C1533900q1E c1533900q1E = new C1533900q1E(forest, C2188811AlT.LIZIZ(sbLIZ), false, 4);
            c1533900q1E.LJIILL = true;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("geckoResStatics, buildSparkContext, ResourceGroup, group:");
            sbLIZ2.append(c1533900q1E);
            sbLIZ2.append(", sparkContext:");
            sbLIZ2.append(sparkContext);
            C2188811AlT.LIZIZ(sbLIZ2);
            sparkContext.autoReleaseResourceGroup = false;
            sparkContext.LJJ(C1533840q18.class, new C1533840q18(c1533900q1E));
        }
        if (c1547450qN5 != null) {
            sparkContext.LJJ(InterfaceC1541510qDV.class, c1547450qN5);
        }
        int i2 = C2187451AjH.LIZ;
        sparkContext.LJJ(C1543000qFu.class, LJII);
        return sparkContext;
    }

    public static SparkContext LJII(String str, C1547450qN5 c1547450qN5) {
        Forest forest;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(str);
        sparkContext.LJJJJL(C2429209fW.LIZ().appendDataFlowId(sparkContext.bundle, "402685961"));
        sparkContext.LJJJJL(C2429209fW.LIZ().appendDataFlowId(sparkContext.bundle, "402653198"));
        sparkContext.bizCert = new ThirdPartyBizCert(402653198);
        sparkContext.LJJJJZI(new C1554500qYS(6));
        sparkContext.LJJJJZ(LJI);
        sparkContext.LJJ(AbstractC1539020q9U.class, LJ);
        sparkContext.disableSeclinkExplicit = true;
        JSONArray jSONArray = C1533710q0v.LIZ;
        IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(sparkContext, false);
        if (iResourceServiceXLIZIZ != null && (forest = iResourceServiceXLIZIZ.getForest()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("minis-");
            sbLIZ.append(sparkContext.containerId);
            C1533900q1E c1533900q1E = new C1533900q1E(forest, C2188811AlT.LIZIZ(sbLIZ), false, 4);
            c1533900q1E.LJIILL = true;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("geckoResStatics, buildSparkContext, ResourceGroup, group:");
            sbLIZ2.append(c1533900q1E);
            sbLIZ2.append(", sparkContext:");
            sbLIZ2.append(sparkContext);
            C2188811AlT.LIZIZ(sbLIZ2);
            sparkContext.autoReleaseResourceGroup = false;
            sparkContext.LJJ(C1533840q18.class, new C1533840q18(c1533900q1E));
        }
        if (c1547450qN5 != null) {
            sparkContext.LJJ(InterfaceC1541510qDV.class, c1547450qN5);
        }
        int i2 = C2187451AjH.LIZ;
        sparkContext.LJJ(C1543000qFu.class, LJII);
        return sparkContext;
    }

    public static void LJIILLIIL(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, Map map) {
        SparkContext sparkContext;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
        } else {
            sparkContext = null;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("injectRuntimeGlobalProps, sparkView:");
        sbLIZ.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        sbLIZ.append(", sparkContext:");
        sbLIZ.append(sparkContext);
        sbLIZ.append(", globalPropsMap:");
        sbLIZ.append(map);
        C2188811AlT.LIZIZ(sbLIZ);
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.U0(map);
        }
    }

    public static boolean LJIIZILJ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, MinisViewModel minisViewModel) {
        boolean z;
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent;
        NetworkResponse<MinisMetaResp> networkResponseLJIIJJI = LJIIJJI(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        if (networkResponseLJIIJJI != null && minisViewModel != null && (singleLiveEvent = minisViewModel.LLILLJJLI) != null && singleLiveEvent.getValue() == networkResponseLJIIJJI) {
            z = true;
        } else {
            z = false;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSameWithCachedInstance, result:");
        sbLIZ.append(z);
        sbLIZ.append(", bindNetworkResponse:");
        sbLIZ.append(networkResponseLJIIJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        return z;
    }

    public static void LJIJ(String str, C1547470qN7 c1547470qN7) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_vconsole");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String strLJI = LJI(strLIZIZ);
        C1097680efe c1097680efe = new C1097680efe();
        c1097680efe.LJIIZILJ = true;
        c1097680efe.LIZ = "minis";
        c1097680efe.LJIJ = 1;
        c1097680efe.LJIJI = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        c1097680efe.LJIIIIZZ = AFwS308S0000000_23.get$arr$(23);
        c1097680efe.LJIJJ = new AwS70S2100000_23(strLJI, strLIZIZ, c1547470qN7, 1);
        c1097680efe.LJ = false;
        c1097680efe.LJJ = false;
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
        C1537060q6K.LJIIJJI(c1537060q6K, strLIZIZ, "minis", LJII(strLJI, c1547470qN7), new C1537070q6L() { // from class: X.0Un3
            @Override // X.C1537070q6L
            public final void LIZ(String str2, C1537080q6M c1537080q6M) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("preloadVConsoleView, onFetchFailed, schema:");
                sbLIZ2.append(str2);
                C1720106oR.LIZ("minis-SparkViewManager", C2188811AlT.LIZIZ(sbLIZ2));
            }

            @Override // X.C1537070q6L
            public final void LIZIZ(String str2, String str3, InterfaceC1105930esx interfaceC1105930esx) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("preloadVConsoleView, onFetchSuccess, schema:");
                sbLIZ2.append(str2);
                C1720106oR.LIZ("minis-SparkViewManager", C2188811AlT.LIZIZ(sbLIZ2));
            }

            @Override // X.C1537070q6L
            public final void LIZJ(String str2, String str3, C1537080q6M c1537080q6M) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("preloadVConsoleView, onPreloadFailed, schema:");
                sbLIZ2.append(str2);
                C1720106oR.LIZ("minis-SparkViewManager", C2188811AlT.LIZIZ(sbLIZ2));
            }

            @Override // X.C1537070q6L
            public final void LIZLLL(String str2, String str3, InterfaceC1105930esx interfaceC1105930esx) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("preloadVConsoleView, onPreloadSuccess, schema:");
                sbLIZ2.append(str2);
                C1720106oR.LIZ("minis-SparkViewManager", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }, false, null, 48);
    }

    public static String LJ(String str, String str2, String str3) {
        boolean z;
        Uri.Builder builderAppendQueryParameter;
        Uri.Builder builderAppendQueryParameter2 = UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", str).appendQueryParameter("use_spark", "1").appendQueryParameter("use_mutable_context", "1").appendQueryParameter("spark_perf_biz", "minis").appendQueryParameter("minis_client_key", str2).appendQueryParameter("clean_cookie_when_account_change", "1").appendQueryParameter("auto_play_bgm", "1").appendQueryParameter("force_release_context_when_destroyed_for_sparkFragment", CardStruct.IStatusCode.DEFAULT);
        if (str3 != null && str3.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            builderAppendQueryParameter = builderAppendQueryParameter2.appendQueryParameter("container_bg_color_light", "FFFFFF").appendQueryParameter("container_bg_color_dark", "000000");
        } else {
            builderAppendQueryParameter = builderAppendQueryParameter2.appendQueryParameter("container_bg_color_light", str3).appendQueryParameter("container_bg_color", str3);
        }
        String string = builderAppendQueryParameter.toString();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buildSparkUrl, targetUrl:");
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        return string;
    }

    public static void LJIIIIZZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, NetworkResponse networkResponse, C1153280g7K c1153280g7K) {
        if (networkResponse != null) {
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
                if (sparkContext != null) {
                    sparkContext.LJJ(NetworkResponse.class, networkResponse);
                }
            } else {
                return;
            }
        } else if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null) {
            return;
        }
        SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
        if (sparkContext2 != null) {
            sparkContext2.LJJ(C1153280g7K.class, c1153280g7K);
        }
    }

    public static SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJIILL(Context context, String str, C1547470qN7 c1547470qN7) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_vconsole");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String strLJI = LJI(strLIZIZ);
        InterfaceC1105930esx interfaceC1105930esxLIZJ = C1546560qLe.LIZ.LIZJ(context, strLJI, "minis");
        if (interfaceC1105930esxLIZJ != null && (interfaceC1105930esxLIZJ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB)) {
            return (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) interfaceC1105930esxLIZJ;
        }
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        InterfaceC1540940qCa interfaceC1540940qCaLJ = C1537060q6K.LJ(context, strLIZIZ, "minis", null, 24);
        if (!(interfaceC1540940qCaLJ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) interfaceC1540940qCaLJ) == null) {
            SparkContext sparkContextLJII = LJII(strLJI, c1547470qN7);
            C1541950qED.LIZJ.getClass();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContextLJII).LIZ(false);
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
            return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
        }
        return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
    }

    public static final void LJIJJLI(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, String str, String str2) throws JSONException {
        String strLJ = LJ(str, str2, "");
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reload, minisUrl:");
        sbLIZ.append(str);
        sbLIZ.append(", sparkUrl:");
        sbLIZ.append(strLJ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1533900q1E c1533900q1ELJIILIIL = LJIILIIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        if (c1533900q1ELJIILIIL != null) {
            c1533900q1ELJIILIIL.LIZLLL = false;
            c1533900q1ELJIILIIL.LJ = 0;
            c1533900q1ELJIILIIL.LJFF = 0;
            c1533900q1ELJIILIIL.LJI = 0;
            c1533900q1ELJIILIIL.LJII = 0;
            c1533900q1ELJIILIIL.LJIIIIZZ = 0;
            c1533900q1ELJIILIIL.LJIIIZ = 0;
            c1533900q1ELJIILIIL.LJIIJ = 0;
            c1533900q1ELJIILIIL.LJIIJJI = 0;
            c1533900q1ELJIILIIL.LJIIL = 0;
            c1533900q1ELJIILIIL.LJIILIIL = 0;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("geckoResStatics, reload, resourceGroup:");
        sbLIZ2.append(c1533900q1ELJIILIIL);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJLIJ(null, strLJ, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIL(java.lang.String r5, com.ss.android.ugc.aweme.minis.common.SchemaParserData r6, X.EnumC1386450mBP r7) {
        /*
            if (r5 == 0) goto L7d
            int r0 = r5.length()
            if (r0 == 0) goto L7d
            java.lang.String r4 = ", schemaUrl:"
            java.lang.String r3 = "minis"
            if (r7 == 0) goto L2e
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "removeFromCacheIfNonProdStage, minisLoadError:"
            r1.append(r0)
            r1.append(r7)
            r1.append(r4)
            r1.append(r5)
            X.C2188811AlT.LIZIZ(r1)
            X.0qLY r0 = X.C1546560qLe.LIZ
            r0.getClass()
            X.C1546500qLY.LIZIZ(r5, r3)
            return
        L2e:
            if (r6 == 0) goto L7b
            boolean r2 = r6.isFromTokenAppLink
            if (r2 == 0) goto L53
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "removeFromCacheIfNonProdStage, isFromTokenAppLink:"
            r1.append(r0)
            r1.append(r2)
            r1.append(r4)
            r1.append(r5)
            X.C2188811AlT.LIZIZ(r1)
            X.0qLY r0 = X.C1546560qLe.LIZ
            r0.getClass()
            X.C1546500qLY.LIZIZ(r5, r3)
        L53:
            if (r6 == 0) goto L7b
            X.1Arl r2 = r6.minisStage
        L57:
            X.1Arl r0 = X.EnumC2192711Arl.MINIS_STAGE_PROD
            if (r2 == r0) goto L7a
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "removeFromCacheIfNonProdStage, minisStage:"
            r1.append(r0)
            r1.append(r2)
            r1.append(r4)
            r1.append(r5)
            X.C2188811AlT.LIZIZ(r1)
            X.0qLY r0 = X.C1546560qLe.LIZ
            r0.getClass()
            X.C1546500qLY.LIZIZ(r5, r3)
        L7a:
            return
        L7b:
            r2 = 0
            goto L57
        L7d:
            int r0 = X.C2187451AjH.LIZ
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1547430qN3.LJIL(java.lang.String, com.ss.android.ugc.aweme.minis.common.SchemaParserData, X.0mBP):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, MinisViewModel minisViewModel, SchemaParserData schemaParserData, EnumC1386450mBP enumC1386450mBP, C1153280g7K c1153280g7K) {
        InterfaceC1541990qEH kitView;
        String strLJIJI;
        NetworkResponse networkResponse;
        int iHashCode;
        String str;
        MinisMetaResp minisMetaResp;
        MinisMetaResp minisMetaResp2;
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent;
        NetworkResponse<MinisMetaResp> value;
        SparkContext sparkContext;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroySparkView, sparkView:");
        sbLIZ.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        sbLIZ.append(", webKitView:");
        String str2 = null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
        } else {
            kitView = null;
        }
        sbLIZ.append(kitView);
        C2188811AlT.LIZIZ(sbLIZ);
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null) {
            strLJIJI = sparkContext.LJIJI();
        } else {
            strLJIJI = null;
        }
        if (minisViewModel != null && (singleLiveEvent = minisViewModel.LLILLJJLI) != null && (value = singleLiveEvent.getValue()) != null) {
            networkResponse = (NetworkResponse) C571330Max.LIZ(value);
        } else {
            networkResponse = null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("destroySparkView, clone minis data, sparkView:");
        sbLIZ2.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        sbLIZ2.append(", instance:");
        if (networkResponse != null) {
            iHashCode = networkResponse.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ2.append(iHashCode);
        sbLIZ2.append(", minisUrl:");
        if (networkResponse != null && (minisMetaResp2 = (MinisMetaResp) networkResponse.data) != null) {
            str = minisMetaResp2.minisUrl;
        } else {
            str = null;
        }
        sbLIZ2.append(str);
        sbLIZ2.append(", clientKey:");
        if (networkResponse != null && (minisMetaResp = (MinisMetaResp) networkResponse.data) != null) {
            str2 = minisMetaResp.clientKey;
        }
        sbLIZ2.append(str2);
        sbLIZ2.append(", schema url:");
        sbLIZ2.append(strLJIJI);
        sbLIZ2.append(", MinisScreenProtectionReuseConfig:");
        sbLIZ2.append(c1153280g7K);
        C2188811AlT.LIZIZ(sbLIZ2);
        LJIIIIZZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, networkResponse, c1153280g7K);
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        LJIL(strLJIJI, schemaParserData, enumC1386450mBP);
    }

    public static void LJIJJ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, String str, String str2, MinisViewModel minisViewModel, C2196211AxP c2196211AxP) {
        SparkContext sparkContext;
        SparkContext sparkContext2;
        c2196211AxP.getClass();
        SparkContext sparkContext3 = null;
        if (C2196211AxP.LIZLLL(minisViewModel, str)) {
            C1533720q0w c1533720q0w = C1533720q0w.LIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                sparkContext3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
            }
            C1533720q0w.LJ(c1533720q0w, str, sparkContext3);
            return;
        }
        C1533720q0w c1533720q0w2 = C1533720q0w.LIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
        } else {
            sparkContext = null;
        }
        if (C1533720q0w.LJ(c1533720q0w2, str, sparkContext) != null) {
            return;
        }
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sparkContext3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
        }
        C1533510q0b c1533510q0bLIZLLL = C1533720q0w.LIZLLL(str2, sparkContext3, false);
        if (c1533510q0bLIZLLL == null || sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) == null) {
            return;
        }
        sparkContext2.mainDocumentGeckoInfo = new C1533760q10(c1533510q0bLIZLLL.LIZ, c1533510q0bLIZLLL.LIZIZ, UUID.randomUUID().toString());
    }
}
