package X;

import Y.ARunnableS103S0100000_3;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.hybridkit.experiment.EnableJsbEventNotStickySettings;
import com.ss.android.ugc.aweme.hybridkit.experiment.JsbNoUrlConfigSettings;
import com.ss.android.ugc.aweme.hybridkit.experiment.JsbNonIdlInterceptorAllowlistSettings;
import com.ss.android.ugc.aweme.settings.BDXBridgeNumberTypeOpSettings;
import com.ss.android.ugc.aweme.settings.JsbAuthConfigOptimizeSettings;
import com.ss.android.ugc.aweme.settings.JsbCancelCallbackSettings;
import com.ss.android.ugc.aweme.settings.JsbSdkErrorBlockJsbListSettings;
import com.ss.android.ugc.aweme.settings.JsbSecureAuthConfigSettings;
import com.ss.android.ugc.aweme.settings.SparkLynxBridgeThreadDispatcherSettings;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qHX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544010qHX {
    public static final C1544010qHX LIZ = new C1544010qHX();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final C2232408os LIZJ = new C2232408os(C2126108Up.LIZ);
    public static final C2232408os LIZLLL = new C2232408os(C2126108Up.LIZIZ);
    public static final C2232408os LJ = new C2232408os(C2126108Up.LIZJ);
    public static final C2232408os LJFF = new C2232408os(C2126108Up.LJ);
    public static final C2232408os LJI = new C2232408os(C2126108Up.LJFF);

    public static void LIZ() {
        boolean zLIZ;
        ISparkHostApi iSparkHostApi;
        List<String> listLJJJJZ;
        Set setLLIIJI;
        Boolean boolValueOf;
        C1535740q4C c1535740q4CLLILII;
        ISparkHostApi iSparkHostApi2;
        C1535740q4C c1535740q4CLLILII2;
        final C1543410qGZ c1543410qGZ = new C1543410qGZ();
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        final C1544740qIi c1544740qIi = new C1544740qIi(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, String.valueOf(c2213981Bky.getAppId()), String.valueOf(c2213981Bky.getVersionCode()), String.valueOf(c2213981Bky.getUpdateVersionCode()), c2213981Bky.getChannel());
        final List listSingletonList = Collections.singletonList("https://mon.isnssdk.com/monitor/appmonitor/v2/settings");
        final List listSingletonList2 = Collections.singletonList("https://mon.isnssdk.com/monitor/collect/");
        C1543410qGZ.LJIIIZ = new InterfaceC1297560js2() { // from class: X.0qHe
            @Override // X.InterfaceC1297560js2
            public final void LIZ() {
                C1543410qGZ c1543410qGZ2 = c1543410qGZ;
                Context applicationContext = C2213981Bky.LIZIZ.getApplicationContext();
                C1544740qIi c1544740qIi2 = c1544740qIi;
                List<String> list = listSingletonList2;
                List<String> list2 = listSingletonList;
                c1543410qGZ2.getClass();
                if (C1543550qGn.LIZIZ.compareAndSet(false, true)) {
                    C1543550qGn.LIZJ = new C1544720qIg(applicationContext, c1544740qIi2, list, list2);
                }
                InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
                C1543410qGZ.LJIIJ = false;
            }
        };
        C1542870qFh.LIZ(C1542800qFa.LIZ);
        C1543410qGZ.LJIIJ = false;
        ISparkHostApi iSparkHostApi3 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi3 != null && (c1535740q4CLLILII = iSparkHostApi3.LLILII()) != null && c1535740q4CLLILII.LIZIZ != null && (iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null)) != null && (c1535740q4CLLILII2 = iSparkHostApi2.LLILII()) != null && c1535740q4CLLILII2.LJFF) {
            C1542900qFk.LIZLLL = false;
        }
        AtomicBoolean atomicBoolean = C1544000qHW.LIZ;
        if (C1253204vK.LIZ() && Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("BDXBridgeWebviewMemoryLeak") && (boolValueOf = Boolean.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("BDXBridgeWebviewMemoryLeak", true))) != null) {
            zLIZ = boolValueOf.booleanValue();
        } else {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("BDXBridgeWebviewMemoryLeak", true);
        }
        C1544000qHW.LIZIZ = zLIZ;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        BDXBridgeNumberTypeOpSettings.BDXBridgeNumberTypeOpModel bDXBridgeNumberTypeOpModel = BDXBridgeNumberTypeOpSettings.LIZ;
        BDXBridgeNumberTypeOpSettings.BDXBridgeNumberTypeOpModel bDXBridgeNumberTypeOpModel2 = (BDXBridgeNumberTypeOpSettings.BDXBridgeNumberTypeOpModel) settingsManagerLIZLLL.LJIIIIZZ("BDXBridgeNumberTypeOp", BDXBridgeNumberTypeOpSettings.BDXBridgeNumberTypeOpModel.class, bDXBridgeNumberTypeOpModel);
        if (bDXBridgeNumberTypeOpModel2 == null) {
            bDXBridgeNumberTypeOpModel2 = bDXBridgeNumberTypeOpModel;
        }
        C1544000qHW.LIZLLL = bDXBridgeNumberTypeOpModel2.BDXBridgeDisableLongToDouble;
        BDXBridgeNumberTypeOpSettings.BDXBridgeNumberTypeOpModel bDXBridgeNumberTypeOpModel3 = (BDXBridgeNumberTypeOpSettings.BDXBridgeNumberTypeOpModel) SettingsManager.LIZLLL().LJIIIIZZ("BDXBridgeNumberTypeOp", BDXBridgeNumberTypeOpSettings.BDXBridgeNumberTypeOpModel.class, bDXBridgeNumberTypeOpModel);
        if (bDXBridgeNumberTypeOpModel3 != null) {
            bDXBridgeNumberTypeOpModel = bDXBridgeNumberTypeOpModel3;
        }
        C1544000qHW.LJ = bDXBridgeNumberTypeOpModel.BDXBridgeNewInputNumberTypeChange;
        SettingsManager.LIZLLL().getClass();
        C1544000qHW.LJII = SettingsManager.LIZ("enable_jsb_callback_monitor", false);
        SettingsManager.LIZLLL().getClass();
        C1544000qHW.LJI = SettingsManager.LIZ("xbridge_iframe_callback_config", false);
        SettingsManager.LIZLLL().getClass();
        C1544000qHW.LJIIIIZZ = SettingsManager.LIZ("xbridge_check_schema_config", false);
        SettingsManager.LIZLLL().getClass();
        C1544000qHW.LJFF = SettingsManager.LIZ("xbridge_send_event_config", false);
        C1544000qHW.LIZJ = ((Boolean) C0B6E.LIZ.getValue()).booleanValue();
        SettingsManager.LIZLLL().getClass();
        C1544000qHW.LJIIIZ = SettingsManager.LIZ("BDXBridgeCustomAuthEnable", true);
        SettingsManager.LIZLLL().getClass();
        C1544000qHW.LJIIJ = SettingsManager.LIZ("jsb_result_to_string_optimization", false);
        SettingsManager.LIZLLL().getClass();
        C1544000qHW.LJIIJJI = SettingsManager.LIZ("optimize_jsb_call_tostring", false);
        SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
        JsbNoUrlConfigSettings.JsbNoUrlConfigModel jsbNoUrlConfigModel = JsbNoUrlConfigSettings.LIZ;
        JsbNoUrlConfigSettings.JsbNoUrlConfigModel jsbNoUrlConfigModel2 = (JsbNoUrlConfigSettings.JsbNoUrlConfigModel) settingsManagerLIZLLL2.LJIIIIZZ("jsb_no_url_config", JsbNoUrlConfigSettings.JsbNoUrlConfigModel.class, jsbNoUrlConfigModel);
        if (jsbNoUrlConfigModel2 != null) {
            jsbNoUrlConfigModel = jsbNoUrlConfigModel2;
        }
        C1544000qHW.LJIIL = jsbNoUrlConfigModel.bdxBridgeDisableBridgeCanNoURL;
        C15442062u.LJIIIZ(C1544000qHW.LJIILIIL, jsbNoUrlConfigModel.bdxBridgeBridgeCanNoURLRuntimeNameSet);
        SettingsManager settingsManagerLIZLLL3 = SettingsManager.LIZLLL();
        JsbNonIdlInterceptorAllowlistSettings.JsbNonIdlInterceptorAllowlistModel jsbNonIdlInterceptorAllowlistModel = JsbNonIdlInterceptorAllowlistSettings.LIZ;
        JsbNonIdlInterceptorAllowlistSettings.JsbNonIdlInterceptorAllowlistModel jsbNonIdlInterceptorAllowlistModel2 = (JsbNonIdlInterceptorAllowlistSettings.JsbNonIdlInterceptorAllowlistModel) settingsManagerLIZLLL3.LJIIIIZZ("jsb_non_idl_interceptor_allowlist", JsbNonIdlInterceptorAllowlistSettings.JsbNonIdlInterceptorAllowlistModel.class, jsbNonIdlInterceptorAllowlistModel);
        if (jsbNonIdlInterceptorAllowlistModel2 != null) {
            jsbNonIdlInterceptorAllowlistModel = jsbNonIdlInterceptorAllowlistModel2;
        }
        C1544000qHW.LJIILJJIL = new C1543610qGt(jsbNonIdlInterceptorAllowlistModel.enable, jsbNonIdlInterceptorAllowlistModel.allowList);
        if (EnableJsbEventNotStickySettings.LIZ().enable) {
            boolean z = EnableJsbEventNotStickySettings.LIZ().enable;
            long j = EnableJsbEventNotStickySettings.LIZ().eventEffectiveDuration;
            C1548820qPI.LJ = z;
            if (j > 0) {
                C1548820qPI.LIZ = j;
            }
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        JsbAuthConfigOptimizeSettings.JsbAuthConfigOptimizeModel jsbAuthConfigOptimizeModel = JsbAuthConfigOptimizeSettings.LIZ;
        JsbAuthConfigOptimizeSettings.JsbAuthConfigOptimizeModel jsbAuthConfigOptimizeModel2 = (JsbAuthConfigOptimizeSettings.JsbAuthConfigOptimizeModel) c0c64LJIILLIIL.LJJIIJ(true, "jsb_auth_config_optimize", 31744, JsbAuthConfigOptimizeSettings.JsbAuthConfigOptimizeModel.class, jsbAuthConfigOptimizeModel, 2);
        if (jsbAuthConfigOptimizeModel2 != null) {
            jsbAuthConfigOptimizeModel = jsbAuthConfigOptimizeModel2;
        }
        C1544000qHW.LJIILL = jsbAuthConfigOptimizeModel.enable;
        SettingsManager.LIZLLL().getClass();
        C1544000qHW.LJIJ = SettingsManager.LIZ("bdx_bridge_business_call_handler_release_all_jsb", true);
        SettingsManager settingsManagerLIZLLL4 = SettingsManager.LIZLLL();
        JsbCancelCallbackSettings.JsbCancelCallbackModel jsbCancelCallbackModel = JsbCancelCallbackSettings.LIZ;
        JsbCancelCallbackSettings.JsbCancelCallbackModel jsbCancelCallbackModel2 = (JsbCancelCallbackSettings.JsbCancelCallbackModel) settingsManagerLIZLLL4.LJIIIIZZ("jsb_cancelcallback", JsbCancelCallbackSettings.JsbCancelCallbackModel.class, jsbCancelCallbackModel);
        if (jsbCancelCallbackModel2 != null) {
            jsbCancelCallbackModel = jsbCancelCallbackModel2;
        }
        C1543600qGs c1543600qGs = C1543410qGZ.LJIJJLI;
        c1543600qGs.LIZ = jsbCancelCallbackModel.enable;
        c1543600qGs.LIZIZ = jsbCancelCallbackModel.urlList;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("bdxbridge_public_methods_init", true) || (iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null)) == null || (listLJJJJZ = iSparkHostApi.LJJJJZ()) == null || (setLLIIJI = C13LP.LLIIJI(listLJJJJZ)) == null) {
            return;
        }
        Iterator it2 = setLLIIJI.iterator();
        while (it2.hasNext()) {
            C1542900qFk.LIZJ.add((String) it2.next());
        }
        Iterator it3 = Collections.singleton("sendEcpMessage").iterator();
        while (it3.hasNext()) {
            C1542900qFk.LIZJ.add((String) it3.next());
        }
    }

    public static void LIZIZ() {
        boolean zLIZ;
        Boolean boolValueOf;
        InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
        if (C1253204vK.LIZ() && Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("bdxbridge_log_control") && (boolValueOf = Boolean.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("bdxbridge_log_control", false))) != null) {
            zLIZ = boolValueOf.booleanValue();
        } else {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("bdxbridge_log_control", false);
        }
        C1543410qGZ.LJIILJJIL = zLIZ;
    }

    public static void LIZJ() {
        JsbSdkErrorBlockJsbListSettings.JsbSdkErrorBlockJsbListModel jsbSdkErrorBlockJsbListModel;
        ArrayList<String> arrayList = C1543410qGZ.LJIJJ;
        if (!C1253204vK.LIZ() || !Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("jsb_sdk_error_block_jsb_list") || (jsbSdkErrorBlockJsbListModel = (JsbSdkErrorBlockJsbListSettings.JsbSdkErrorBlockJsbListModel) GsonProtectorUtils.fromJson(C08JS.LIZIZ(), Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("jsb_sdk_error_block_jsb_list", ""), JsbSdkErrorBlockJsbListSettings.JsbSdkErrorBlockJsbListModel.class)) == null) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            JsbSdkErrorBlockJsbListSettings.JsbSdkErrorBlockJsbListModel jsbSdkErrorBlockJsbListModel2 = JsbSdkErrorBlockJsbListSettings.LIZ;
            jsbSdkErrorBlockJsbListModel = (JsbSdkErrorBlockJsbListSettings.JsbSdkErrorBlockJsbListModel) settingsManagerLIZLLL.LJIIIIZZ("jsb_sdk_error_block_jsb_list", JsbSdkErrorBlockJsbListSettings.JsbSdkErrorBlockJsbListModel.class, jsbSdkErrorBlockJsbListModel2);
            if (jsbSdkErrorBlockJsbListModel == null) {
                jsbSdkErrorBlockJsbListModel = jsbSdkErrorBlockJsbListModel2;
            }
        }
        arrayList.addAll(jsbSdkErrorBlockJsbListModel.methods);
    }

    public static void LIZLLL() {
        JsbSecureAuthConfigSettings.JsbSecureAuthConfigModel jsbSecureAuthConfigModel;
        InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
        if (!C1253204vK.LIZ() || !Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("jsb_secure_auth_config") || ((jsbSecureAuthConfigModel = (JsbSecureAuthConfigSettings.JsbSecureAuthConfigModel) C08JS.LIZ(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("jsb_secure_auth_config", "{}"), JsbSecureAuthConfigSettings.JsbSecureAuthConfigModel.class)) == null && (jsbSecureAuthConfigModel = JsbSecureAuthConfigSettings.LIZ) == null)) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            JsbSecureAuthConfigSettings.JsbSecureAuthConfigModel jsbSecureAuthConfigModel2 = JsbSecureAuthConfigSettings.LIZ;
            jsbSecureAuthConfigModel = (JsbSecureAuthConfigSettings.JsbSecureAuthConfigModel) settingsManagerLIZLLL.LJIIIIZZ("jsb_secure_auth_config", JsbSecureAuthConfigSettings.JsbSecureAuthConfigModel.class, jsbSecureAuthConfigModel2);
            if (jsbSecureAuthConfigModel == null) {
                jsbSecureAuthConfigModel = jsbSecureAuthConfigModel2;
            }
        }
        C1544240qHu c1544240qHu = new C1544240qHu();
        c1544240qHu.LIZ = jsbSecureAuthConfigModel.enable;
        c1544240qHu.LIZIZ = jsbSecureAuthConfigModel.secureFallbackMethodList;
        ArrayList<C1544220qHs> arrayList = new ArrayList<>();
        int i = 0;
        for (JsbSecureAuthConfigSettings.JsbSecurePublicKeyModel jsbSecurePublicKeyModel : jsbSecureAuthConfigModel.securePublicKeyList) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            JsbSecureAuthConfigSettings.JsbSecurePublicKeyModel jsbSecurePublicKeyModel2 = jsbSecurePublicKeyModel;
            String str = jsbSecurePublicKeyModel2.publicKey;
            C1544010qHX c1544010qHX = LIZ;
            int i3 = jsbSecurePublicKeyModel2.status;
            c1544010qHX.getClass();
            arrayList.add(new C1544220qHs(str, i3 == 0 ? C0THY.USING : C0THY.DEPRECATED));
            i = i2;
        }
        c1544240qHu.LIZJ = arrayList;
        c1544240qHu.LIZLLL = jsbSecureAuthConfigModel.secureAes128cbcKey;
        c1544240qHu.LJ = jsbSecureAuthConfigModel.secureMethodAes128cbcIv;
        C1543230qGH.LIZ = c1544240qHu;
    }

    public static void LJFF(Function1 function1) {
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS103S0100000_3(function1, 35));
    }

    public static void LJ(Function1 function1, EnumC1544120qHi enumC1544120qHi) {
        int iOrdinal = enumC1544120qHi.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal != 7) {
                                    C817503Hh c817503Hh = C817503Hh.LL;
                                    C1DFH c1dfh = C0PEM.LIZ;
                                    C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C2144708aj(function1, null), 2);
                                    return;
                                }
                                C786410Ut5.LJL(LIZIZ, new ARunnableS103S0100000_3(function1, 34));
                                return;
                            }
                            C23250099c.LIZLLL(C817503Hh.LL, LJI, null, new C2144608ai(function1, null), 2);
                            return;
                        }
                        C23250099c.LIZLLL(C817503Hh.LL, LJFF, null, new C2144508ah(function1, null), 2);
                        return;
                    }
                    C23250099c.LIZLLL(C817503Hh.LL, LJ, null, new C2144408ag(function1, null), 2);
                    return;
                }
                C23250099c.LIZLLL(C817503Hh.LL, LIZLLL, null, new C2144308af(function1, null), 2);
                return;
            }
            C23250099c.LIZLLL(C817503Hh.LL, LIZJ, null, new C2144208ae(function1, null), 2);
            return;
        }
        function1.invoke(Boolean.FALSE);
    }

    public static void LJI(C1543910qHN c1543910qHN, SparkLynxBridgeThreadDispatcherSettings.SparkLynxBridgeThreadDispatcherModel sparkLynxBridgeThreadDispatcherModel, Function1 function1) {
        List<String> list;
        if (c1543910qHN.LIZ.LIZJ(c1543910qHN)) {
            if (sparkLynxBridgeThreadDispatcherModel.allowList.containsKey(c1543910qHN.LIZ.LIZ()) && (list = sparkLynxBridgeThreadDispatcherModel.allowList.get(c1543910qHN.LIZ.LIZ())) != null && list.contains(c1543910qHN.LJFF)) {
                c1543910qHN.LJIJJLI = "LYNX_THREAD";
                function1.invoke(Boolean.FALSE);
                return;
            } else {
                c1543910qHN.LJIJJLI = "MAIN_THREAD";
                LJFF(function1);
                return;
            }
        }
        List<String> list2 = sparkLynxBridgeThreadDispatcherModel.allowList.get("host");
        if (list2 != null && list2.contains(c1543910qHN.LJFF)) {
            c1543910qHN.LJIJJLI = "LYNX_THREAD";
            function1.invoke(Boolean.FALSE);
        } else {
            c1543910qHN.LJIJJLI = "MAIN_THREAD";
            LJFF(function1);
        }
    }
}
