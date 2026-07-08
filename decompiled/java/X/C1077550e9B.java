package X;

import Y.ARunnableS116S0100000_16;
import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.wishlist.WishListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.i18n.xbridge.compliance.bridge.route.PnsWebApIInterface;
import com.ss.android.ugc.aweme.poi.thirdparty.ThirdPartyBlurDisclaimerPopup;
import com.ss.android.ugc.aweme.spark.ISparkAdShareLoadFinishHandler;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.spark.SparkHostApiImpl;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS103S0110000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0e9B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077550e9B extends AbstractC1542200qEc {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1537870q7d
    public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        if (2 - this.$t != 0) {
            super.LJJZZIII(interfaceC1541990qEH, str);
        } else {
            LJJZZIII$0(this, interfaceC1541990qEH, str);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        switch (this.$t) {
            case 4:
                LJLI$0(this, interfaceC1541990qEH, str, str2);
                break;
            case 5:
                LJLI$1(this, interfaceC1541990qEH, str, str2);
                break;
            default:
                super.LJLI(interfaceC1541990qEH, str, str2);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 0:
                LJLIIIL$0(this, interfaceC1541990qEH);
                break;
            case 1:
                LJLIIIL$1(this, interfaceC1541990qEH);
                break;
            case 2:
            case 3:
            case 5:
            default:
                super.LJLIIIL(interfaceC1541990qEH);
                break;
            case 4:
                LJLIIIL$2(this, interfaceC1541990qEH);
                break;
            case 6:
                LJLIIIL$3(this, interfaceC1541990qEH);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        switch (this.$t) {
            case 0:
                LJLIIL$0(this, interfaceC1541990qEH, str);
                break;
            case 1:
                LJLIIL$1(this, interfaceC1541990qEH, str);
                break;
            case 2:
                LJLIIL$2(this, interfaceC1541990qEH, str);
                break;
            case 3:
            default:
                super.LJLIIL(interfaceC1541990qEH, str);
                break;
            case 4:
                LJLIIL$3(this, interfaceC1541990qEH, str);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJJLL(EnumC1067640dtC enumC1067640dtC) {
        if (3 - this.$t != 0) {
            super.LJLJJLL(enumC1067640dtC);
        } else {
            LJLJJLL$0(this, enumC1067640dtC);
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLJLLL(SparkContext sparkContext) {
        if (this.$t != 0) {
            super.LJLJLLL(sparkContext);
        } else {
            LJLJLLL$0(this, sparkContext);
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLL(SparkContext sparkContext) {
        if (3 - this.$t != 0) {
            super.LJLL(sparkContext);
        } else {
            LJLL$0(this, sparkContext);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void onDestroy() {
        if (this.$t != 0) {
            super.onDestroy();
        } else {
            onDestroy$0(this);
        }
    }

    public static final void onDestroy$0(C1077550e9B c1077550e9B) {
        C01GW<C1075480e5q> c01gw = C1075480e5q.LIZIZ;
        ConcurrentHashMap<String, C1075520e5u> concurrentHashMap = C1075530e5v.LIZIZ().LIZ;
        String name = InterfaceC1075390e5h.class.getName();
        C1075520e5u c1075520e5u = concurrentHashMap.get("crossPlatform");
        if (c1075520e5u != null && c1075520e5u.LIZ.containsKey(name)) {
            c1075520e5u.LIZ.remove(name).onUnRegister();
        }
    }

    public C1077550e9B(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJLIIIL$0(C1077550e9B c1077550e9B, InterfaceC1541990qEH interfaceC1541990qEH) {
        ISparkAdShareLoadFinishHandler iSparkAdShareLoadFinishHandler = (ISparkAdShareLoadFinishHandler) PluggableExtentionKt.pluggableSpi$default(ISparkAdShareLoadFinishHandler.class, false, false, false, 14, null);
        if (iSparkAdShareLoadFinishHandler != null) {
            iSparkAdShareLoadFinishHandler.LLFZ((SparkContext) c1077550e9B.l0, interfaceC1541990qEH);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJLIIIL$1(C1077550e9B c1077550e9B, InterfaceC1541990qEH interfaceC1541990qEH) {
        WebView webView;
        if ((interfaceC1541990qEH instanceof WebKitView) && (webView = (WebView) interfaceC1541990qEH) != null) {
            C1544770qIl.LIZ(webView, new AbstractC1544900qIy() { // from class: X.0X7N
                @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                public final String LJ() {
                    return ";(function(){\n                const ori_back = history.back;\n                history.back = function(){ ori_go.call(history, -1); }; \n                const ori_go = history.go; \n                history.go = function(delta){ \n                    try{\n                        if('webkit' in window){\n                            window.webkit.messageHandlers[\"pns_webapi_channel\"].postMessage({methodName:\"historyGo\", params: {delta:delta}});\n                        }else if(typeof pns_webapi_channel !== 'undefined'){\n                           pns_webapi_channel.historyGo(delta);\n                        }\n                    }\n                    catch(e){\n                        ori_go.call(history, delta);\n                    } \n                 }; \n            })();";
                }

                @Override // X.AbstractC1544900qIy
                public final String LJI() {
                    return "_jsmanage_pns_webapi_goback";
                }

                @Override // X.InterfaceC1544830qIr
                public final JSInjectConfig LIZ() {
                    return new JSInjectConfig("_jsmanage_pns_webapi_goback", "custom_manual", 2, C1697810uHb.LJIIJJI("inapp.tiktokv.com/falcon/webcast_mt/page/subscription/discord_auth/", "inapp.tiktokv.com/falcon/webcast_mt/page/fans_level/discord_auth/"), C13BV.INSTANCE, "https://lf16-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/tt/webview/js_manage/tiktok_webview_js_inject_manage/assets/js/pns_webapi_goback.js", null, null, null, true, 448, null);
                }
            });
        }
    }

    public static final void LJLIIIL$2(C1077550e9B c1077550e9B, InterfaceC1541990qEH interfaceC1541990qEH) {
        boolean zLIZIZ;
        if (!((WishListFragment) c1077550e9B.l0).LLJIJIL) {
            interfaceC1541990qEH.X0("favoritePageShow", C13BV.INSTANCE);
            WishListFragment wishListFragment = (WishListFragment) c1077550e9B.l0;
            View viewE1 = interfaceC1541990qEH.e1();
            if (viewE1 != null && viewE1.getContext() != null) {
                try {
                    zLIZIZ = C036E.LIZ.LIZIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    zLIZIZ = false;
                }
            } else {
                zLIZIZ = false;
            }
            wishListFragment.getClass();
            C1018703yb.LIZLLL("ads_wishlist_tab_load", new AwS103S0110000_16(wishListFragment, zLIZIZ, 6));
        }
    }

    public static final void LJLIIIL$3(C1077550e9B c1077550e9B, InterfaceC1541990qEH interfaceC1541990qEH) {
        View viewLJII = null;
        if (interfaceC1541990qEH instanceof WebKitView) {
            if (((WebKitView) interfaceC1541990qEH).canGoBack()) {
                TuxNavBar tuxNavBar = ((C1047070dM1) c1077550e9B.l0).LJI;
                if (tuxNavBar != null) {
                    viewLJII = tuxNavBar.LJII("close_all_btn");
                }
                C12ES.LJIILL(0, viewLJII);
                return;
            }
            TuxNavBar tuxNavBar2 = ((C1047070dM1) c1077550e9B.l0).LJI;
            if (tuxNavBar2 != null) {
                viewLJII = tuxNavBar2.LJII("close_all_btn");
            }
            C12ES.LJIILL(8, viewLJII);
            return;
        }
        TuxNavBar tuxNavBar3 = ((C1047070dM1) c1077550e9B.l0).LJI;
        if (tuxNavBar3 != null) {
            viewLJII = tuxNavBar3.LJII("close_all_btn");
        }
        C12ES.LJIILL(8, viewLJII);
    }

    public static final void LJLJJLL$0(C1077550e9B c1077550e9B, EnumC1067640dtC enumC1067640dtC) {
        Map map;
        Map map2;
        Object obj;
        SparkContext sparkContext = (SparkContext) c1077550e9B.l0;
        C1529870puj c1529870puj = C1529870puj.LIZ;
        String str = sparkContext.containerId;
        c1529870puj.getClass();
        InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(str);
        if (interfaceC1541990qEHLJFF == null) {
            return;
        }
        Object obj2 = sparkContext.runtimeInfo.get((Object) "queryItems");
        Map map3 = null;
        if (obj2 instanceof Map) {
            map = (Map) obj2;
        } else {
            map = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if ((key instanceof String) && value != null) {
                    linkedHashMap.put(key, value);
                }
            }
        }
        Object obj3 = sparkContext.extraRuntimeInfo.get((Object) "initialData");
        if (obj3 == null) {
            obj3 = sparkContext.runtimeInfo.get((Object) "initialData");
        }
        if ((obj3 instanceof Map) && (map2 = (Map) obj3) != null) {
            if (map != null) {
                obj = map.get("initialData");
            } else {
                obj = null;
            }
            if (obj instanceof Map) {
                map3 = (Map) obj;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (map3 != null) {
                for (Map.Entry entry2 : map3.entrySet()) {
                    Object key2 = entry2.getKey();
                    Object value2 = entry2.getValue();
                    if ((key2 instanceof String) && value2 != null) {
                        linkedHashMap2.put(key2, value2);
                    }
                }
            }
            for (Map.Entry entry3 : map2.entrySet()) {
                Object key3 = entry3.getKey();
                Object value3 = entry3.getValue();
                if ((key3 instanceof String) && value3 != null) {
                    linkedHashMap2.put(key3, value3);
                }
            }
            linkedHashMap.put("initialData", linkedHashMap2);
            interfaceC1541990qEHLJFF.U0(C2097908Jt.LIZJ(new Pair("queryItems", linkedHashMap)));
        }
    }

    public static final void LJLJLLL$0(C1077550e9B c1077550e9B, SparkContext sparkContext) {
        AbstractC1968807nS abstractC1968807nS;
        ISparkHostApi iSparkHostApi;
        SparkHostApiImpl sparkHostApiImplLJZL;
        if (sparkContext != null) {
            InterfaceC1541990qEH interfaceC1541990qEHLJIJJ = sparkContext.LJIJJ();
            if ((interfaceC1541990qEHLJIJJ instanceof WebKitView) && (abstractC1968807nS = (AbstractC1968807nS) sparkContext.LJFF(AbstractC1968807nS.class)) != null && (iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null)) != null && (sparkHostApiImplLJZL = iSparkHostApi.LJZL()) != null) {
                sparkHostApiImplLJZL.LLLJ(abstractC1968807nS, (WebKitView) interfaceC1541990qEHLJIJJ);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void LJLL$0(C1077550e9B c1077550e9B, SparkContext sparkContext) {
        Aweme aweme;
        Object obj;
        String str;
        Object obj2;
        Activity activityLIZIZ;
        String str2;
        C1537510q73 c1537510q73;
        C1537510q73 c1537510q732;
        C19EG c19egLIZIZ = null;
        if (sparkContext != null) {
            aweme = (Aweme) sparkContext.LJFF(Aweme.class);
        } else {
            aweme = null;
        }
        C1064540doC c1064540doC = new C1064540doC(aweme);
        if (sparkContext != null && (c1537510q732 = sparkContext.runtimeInfo) != null) {
            obj = c1537510q732.get((Object) "ad_dislike_close_path");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        switch (str.hashCode()) {
            case -1678958759:
                if (str.equals("close_button")) {
                    c1064540doC.LJJIIZ("close_button");
                }
                break;
            case 3015911:
                if (str.equals("back")) {
                    c1064540doC.LJJIIZ("android_system_back");
                }
                break;
            case 93819220:
                if (str.equals("blank")) {
                    c1064540doC.LJJIIZ("blank");
                }
                break;
            case 109526449:
                if (str.equals("slide")) {
                    c1064540doC.LJJIIZ("slide_down");
                }
                break;
        }
        if (sparkContext != null && (c1537510q73 = sparkContext.runtimeInfo) != null) {
            obj2 = c1537510q73.get((Object) "ad_dislike_toast_text");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof String) && (str2 = (String) obj2) != null) {
            str3 = str2;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ);
        }
        if (str3.length() > 0 && c19egLIZIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
            c1389890mGx.LJIIJ(str3);
            c1389890mGx.LJIIJJI();
        }
        C1440005kM.LIZ(new C1210880hcE("homepage_hot", "FUNCTION_FROM_DEFAULT", "not_interested", aweme));
    }

    public static final void LJJZZIII$0(C1077550e9B c1077550e9B, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C1022620cia.LJ("AnolePlayableComponent", "onLoadFailed");
        C786410Ut5.LJJZZIII(((C1013880cUU) c1077550e9B.l0).LJIIJJI(), new ARunnableS116S0100000_16((C1013880cUU) c1077550e9B.l0, 150));
    }

    public static final void LJLIIL$0(C1077550e9B c1077550e9B, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        AbstractC1968807nS abstractC1968807nS;
        ISparkHostApi iSparkHostApi;
        SparkHostApiImpl sparkHostApiImplLJZL;
        if ((interfaceC1541990qEH instanceof WebKitView) && (abstractC1968807nS = (AbstractC1968807nS) ((SparkContext) c1077550e9B.l0).LJFF(AbstractC1968807nS.class)) != null && (iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null)) != null && (sparkHostApiImplLJZL = iSparkHostApi.LJZL()) != null) {
            sparkHostApiImplLJZL.LLLF(abstractC1968807nS, new AwS595S0100000_16(interfaceC1541990qEH, 95));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJLIIL$1(C1077550e9B c1077550e9B, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C1ET2 c1et2;
        InterfaceC1059280dfi interfaceC1059280dfi;
        C1051990dTx c1051990dTx = SparkThirdContext.Companion;
        String str2 = ((SparkThirdContext) c1077550e9B.l0).containerId;
        c1051990dTx.getClass();
        SparkThirdContext sparkThirdContextLIZ = C1052290dUR.LIZ(str2);
        if (sparkThirdContextLIZ != null && (interfaceC1059280dfi = sparkThirdContextLIZ.container) != null) {
            interfaceC1059280dfi.refresh();
        }
        if ((interfaceC1541990qEH instanceof WebKitView) && (c1et2 = (C1ET2) interfaceC1541990qEH) != null) {
            c1et2.getSettings().setJavaScriptEnabled(true);
            c1et2.addJavascriptInterface(new PnsWebApIInterface(c1et2.getContext()), "pns_webapi_channel");
        }
    }

    public static final void LJLIIL$2(C1077550e9B c1077550e9B, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C1022620cia.LJ("AnolePlayableComponent", "onLoadStart");
        C786410Ut5.LJJZZIII(((C1013880cUU) c1077550e9B.l0).LJIIJJI(), new ARunnableS116S0100000_16((C1013880cUU) c1077550e9B.l0, 151));
    }

    public static final void LJLIIL$3(C1077550e9B c1077550e9B, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        WishListFragment wishListFragment = (WishListFragment) c1077550e9B.l0;
        wishListFragment.LLJIJIL = false;
        wishListFragment.LLJI = System.currentTimeMillis();
    }

    public static final void LJLI$0(C1077550e9B c1077550e9B, InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        WishListFragment wishListFragment = (WishListFragment) c1077550e9B.l0;
        wishListFragment.LLJIJIL = true;
        C1018703yb.LIZLLL("ads_wishlist_tab_load", new AwS103S0110000_16(wishListFragment, false, 6));
    }

    public static final void LJLI$1(C1077550e9B c1077550e9B, InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Spark onLoadFailed reason: ");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        ((ThirdPartyBlurDisclaimerPopup) c1077550e9B.l0).dismiss();
    }
}
