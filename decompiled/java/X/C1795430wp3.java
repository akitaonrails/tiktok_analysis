package X;

import Y.ARunnableS82S0200000_13;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.data.api.IRechargeApi;
import com.bytedance.android.livesdk.livesetting.other.LivePipoMonitorHostSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveIAPRefactorQuerySetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveIapRefactorPrecheck;
import com.bytedance.android.livesdk.livesetting.wallet.LiveMPHostSettingV2;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletGoogleECLStatusUploadSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletIAPOptimizationExperimentParams;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.globalpayment.payment.common.lib.model.setting.IAPSettingConfiguration;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS216S0000000_27;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wp3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1795430wp3 {
    public static final C1795430wp3 LIZ = new C1795430wp3();
    public static final C1795930wpr LIZIZ;
    public static final C1792190wjp LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static final C01GW LJFF;

    public final synchronized void LIZ() {
        if (LIZLLL) {
            return;
        }
        DeviceRegisterManager.addOnDeviceConfigUpdateListener(LIZIZ);
        LIZLLL = true;
    }

    public final synchronized void LIZJ() {
        if (LJ && C1793920wmc.LIZ().hasInitEd()) {
            return;
        }
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        if (C2093608Ic.LJ(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId)) {
            LIZ();
        } else {
            LIZIZ(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0wpr] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0wjp] */
    static {
        if (C464660IKa.LIZ()) {
            ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).registerPageEventCallback(new C1AU9() { // from class: X.0wl1
                @Override // X.C1AU9
                public final void LIZ() {
                }

                @Override // X.C1AU9
                public final void LIZIZ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.C1AU9
                public final void LIZJ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.C1AU9
                public final void LIZLLL(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.C1AU9
                public final void LJ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.C1AU9
                public final void LJFF(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.C1AU9
                public final void LJIJ(boolean z) {
                    if (!z) {
                        C1793920wmc.LIZ().onAppResume();
                    }
                }
            });
        } else {
            ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).registerLifeCycleCallback(new C1AGV() { // from class: X.0wl0
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                }

                @Override // X.C1AGV
                public final void LJIJ(boolean z) {
                    if (!z) {
                        C1793920wmc.LIZ().onAppResume();
                    }
                }
            });
        }
        ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).registerAppEnterForeBackgroundCallback(new InterfaceC19562711gH() { // from class: X.0wpp
            @Override // X.InterfaceC19562711gH
            public final void LLLLIILLL(Context context) {
            }

            @Override // X.InterfaceC19562711gH
            public final void LLF(Context context) {
                String simpleName;
                Activity activityLIZ;
                IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
                if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                    simpleName = activityLIZ.getClass().getSimpleName();
                } else {
                    simpleName = null;
                }
                iWalletService.trackingAppResumeFromBackground(simpleName);
            }
        });
        LIZIZ = new InterfaceC2210981Bg8() { // from class: X.0wpr
            @Override // X.InterfaceC2210981Bg8
            public final void LIZIZ(String str, String str2) {
            }

            @Override // X.InterfaceC2210981Bg8
            public final void LIZ(boolean z) throws JSONException {
                String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
                if (!C2093608Ic.LJ(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId)) {
                    C1795430wp3 c1795430wp3 = C1795430wp3.LIZ;
                    C1795430wp3.LIZIZ(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId);
                }
            }

            @Override // X.InterfaceC2210981Bg8
            public final void LIZJ(boolean z) throws JSONException {
                LIZ(z);
            }
        };
        LIZJ = new InterfaceC1794730wnv() { // from class: X.0wjp
            @Override // X.InterfaceC1794730wnv
            public final void LIZ() {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LIZLLL(boolean z) {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LJ(C1792840wks c1792840wks, List list) {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LJI(C1792840wks c1792840wks, C1793950wmf c1793950wmf) {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LJIIIIZZ(C1792840wks c1792840wks, List list) {
            }

            @Override // X.InterfaceC1794730wnv
            public final void LJIIIZ(C1792840wks c1792840wks, C1793950wmf c1793950wmf) {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LJIIJ(EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks, List list) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [X.0wkk] */
            @Override // X.InterfaceC1794730wnv
            public final void LIZJ(EnumC1791830wjF enumC1791830wjF, final String str) {
                if (enumC1791830wjF == EnumC1791830wjF.GOOGLE) {
                    C1795430wp3 c1795430wp3 = C1795430wp3.LIZ;
                    if (LiveWalletGoogleECLStatusUploadSetting.INSTANCE.getValue()) {
                        ((InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class)).LJIIL(new InterfaceC1792130wjj() { // from class: X.0wkk
                            @Override // X.InterfaceC1792130wjj
                            public final void LIZ(C1792150wjl c1792150wjl) {
                                EnumC1792020wjY enumC1792020wjY;
                                String str2 = "";
                                if (c1792150wjl.LIZ) {
                                    C480460Ism.LIZ().getClass();
                                    IRechargeApi iRechargeApi = (IRechargeApi) C480460Ism.LIZLLL(IRechargeApi.class);
                                    String str3 = str;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    iRechargeApi.uploadECLEligibilityStatus(str3, c1792150wjl.LIZIZ).LJIILIIL(new C0UO0()).LJJLJ();
                                }
                                C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                                boolean z = c1792150wjl.LIZ;
                                boolean z2 = c1792150wjl.LIZIZ;
                                C0KQW c0kqw = c1792150wjl.LIZJ;
                                String str4 = null;
                                if (c0kqw != null) {
                                    enumC1792020wjY = c0kqw.LIZ;
                                } else {
                                    enumC1792020wjY = null;
                                }
                                String strValueOf = String.valueOf(enumC1792020wjY);
                                C0KQW c0kqw2 = c1792150wjl.LIZJ;
                                if (c0kqw2 != null) {
                                    str4 = c0kqw2.LIZIZ;
                                }
                                String str5 = str;
                                c1803800x2Y.getClass();
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_googleplay_ecl_eligibility_result");
                                c474500IjALIZ.LJJII(Boolean.valueOf(z), "result");
                                c474500IjALIZ.LJJII(Boolean.valueOf(z2), "is_available");
                                c474500IjALIZ.LJJII(strValueOf, "error_code");
                                c474500IjALIZ.LJJII(str4, "message");
                                if (str5 != null) {
                                    str2 = str5;
                                }
                                c474500IjALIZ.LJJII(str2, "app_store_front");
                                c474500IjALIZ.LIZ();
                            }
                        });
                    }
                }
            }

            @Override // X.InterfaceC1794730wnv
            public final void LJII(EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks) {
                boolean z;
                C1795430wp3 c1795430wp3 = C1795430wp3.LIZ;
                if (c1792840wks != null && c1792840wks.LIZIZ()) {
                    z = true;
                } else {
                    z = false;
                }
                C1795430wp3.LJ = z;
            }
        };
        LJFF = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(281));
    }

    public static boolean LIZIZ(String str) throws JSONException {
        String str2;
        boolean z;
        InterfaceC1795200wog interfaceC1795200wog;
        InterfaceC1078660eAy interfaceC1078660eAy;
        InterfaceC1796300wqS interfaceC1796300wqS;
        C844640XBm c844640XBm;
        Application application;
        boolean z2 = false;
        if (C2093608Ic.LJ(str)) {
            return false;
        }
        String iapKey = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getIapKey();
        String strLIZ = C1152550g69.LIZ();
        HashMap map = new HashMap();
        map.put("iapKey", iapKey);
        map.put("mpHost", strLIZ);
        C844640XBm c844640XBm2 = new C844640XBm();
        c844640XBm2.LIZ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId();
        c844640XBm2.LJFF = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appName();
        c844640XBm2.LIZIZ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getVersionCodeInt();
        c844640XBm2.LIZLLL = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getUpdateVersionCode();
        c844640XBm2.LIZJ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getShortVersionCode();
        c844640XBm2.LJ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getChannel();
        c844640XBm2.LJI = true;
        C1795880wpm c1795880wpm = new C1795880wpm();
        c1795880wpm.LIZJ = C1152550g69.LIZ();
        c1795880wpm.LIZLLL = LiveMPHostSettingV2.INSTANCE.getValue();
        c1795880wpm.LIZ = iapKey;
        c1795880wpm.LJ = new InterfaceC1795200wog() { // from class: X.0wpq
            @Override // X.InterfaceC1795200wog
            public final String getCurUserId() {
                return String.valueOf(UserService.getInstance().user().getCurrentUserId());
            }
        };
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isBoe()) {
            str2 = "10202010Wm7uNj";
        } else {
            str2 = "05816USpPkJiyBnttk";
        }
        c1795880wpm.LIZIZ = str2;
        if (C1796440wqg.LIZIZ()) {
            c1795880wpm.LJI = true;
            c1795880wpm.LJFF = false;
            map.put("pay_method", "amazon");
        } else {
            c1795880wpm.LJI = false;
            c1795880wpm.LJFF = true;
            map.put("pay_method", "GP");
        }
        C1796590wqv.LIZ("ttlive_pipo_init", map);
        C1152610g6F c1152610g6F = new C1152610g6F();
        c1795880wpm.LJII = c1152610g6F;
        IAPSettingConfiguration iAPSettingConfiguration = c1152610g6F.LIZJ;
        if (iAPSettingConfiguration != null) {
            c1795880wpm.LIZJ = iAPSettingConfiguration.iapHost;
        }
        C1795650wpP c1795650wpP = new C1795650wpP(c1795880wpm);
        Context contextN3 = C786410Ut5.N3(C497740JfY.LJII());
        if (contextN3 instanceof Application) {
            C1795760wpa c1795760wpa = new C1795760wpa((Application) contextN3, c844640XBm2);
            c1795760wpa.LIZJ = str;
            c1795760wpa.LJII = new InterfaceC1796300wqS() { // from class: X.0wpX
                @Override // X.InterfaceC1796300wqS
                public final void onEventV3(String str3, JSONObject jSONObject) {
                    C1795430wp3 c1795430wp3 = C1795430wp3.LIZ;
                    HashMap map2 = new HashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map2.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
                    }
                    C474500IjA c474500IjALIZJ = C0IJT.LIZJ(str3);
                    c474500IjALIZJ.LJJIIZI(map2);
                    c474500IjALIZJ.LIZ();
                }
            };
            c1795760wpa.LJIIIIZZ = (C1796250wqN) LJFF.getValue();
            c1795760wpa.LIZLLL = LivePipoMonitorHostSetting.INSTANCE.getValue();
            c1795760wpa.LJI = c1795650wpP;
            c1795760wpa.LJ = new InterfaceC1078660eAy() { // from class: X.0eAx
                @Override // X.InterfaceC1078660eAy
                public final Map<String, ?> LIZ() {
                    return LiveWalletIAPOptimizationExperimentParams.INSTANCE.getValue();
                }
            };
            c1795760wpa.LJIIIZ = new InterfaceC1790340wgq() { // from class: X.0pYm
                @Override // X.InterfaceC1790340wgq
                public final Object LIZ(Class cls, String str3) {
                    return ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getHostRetrofitWithApiHost(str3).LIZ(cls);
                }
            };
            if (!TextUtils.isEmpty(c1795760wpa.LIZJ)) {
                if (TextUtils.isEmpty(c1795760wpa.LJFF)) {
                    c1795760wpa.LJFF = "en";
                }
                C1795500wpA c1795500wpA = new C1795500wpA(c1795760wpa);
                C1793920wmc.LIZ().addIapObserver(LIZJ);
                C1795210woh c1795210woh = (C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ();
                if (c1795210woh.LIZ == null) {
                    c1795210woh.LIZ = c1795500wpA;
                }
                C1795500wpA c1795500wpA2 = c1795210woh.LIZ;
                if (c1795500wpA2.LIZ == null && (application = c1795500wpA.LIZ) != null) {
                    c1795500wpA2.LIZ = application;
                }
                if (c1795500wpA2.LIZIZ == null && (c844640XBm = c1795500wpA.LIZIZ) != null) {
                    c1795500wpA2.LIZIZ = c844640XBm;
                }
                if (TextUtils.isEmpty(c1795500wpA2.LIZJ) && !TextUtils.isEmpty(c1795500wpA.LIZJ)) {
                    c1795500wpA2.LIZJ = c1795500wpA.LIZJ;
                }
                if (TextUtils.isEmpty(c1795500wpA2.LIZLLL) && !TextUtils.isEmpty(c1795500wpA.LIZLLL)) {
                    c1795500wpA2.LIZLLL = c1795500wpA.LIZLLL;
                }
                if (TextUtils.isEmpty(c1795500wpA2.LJ) && !TextUtils.isEmpty(c1795500wpA.LJ)) {
                    c1795500wpA2.LJ = c1795500wpA.LJ;
                }
                C1795650wpP c1795650wpP2 = c1795500wpA2.LJFF;
                if (c1795650wpP2 == null) {
                    c1795500wpA2.LJFF = c1795500wpA.LJFF;
                } else {
                    C1795650wpP c1795650wpP3 = c1795500wpA.LJFF;
                    if (c1795650wpP3 != null) {
                        if (TextUtils.isEmpty(c1795650wpP2.LIZ) && !TextUtils.isEmpty(c1795650wpP3.LIZ)) {
                            c1795650wpP2.LIZ = c1795650wpP3.LIZ;
                        }
                        if (TextUtils.isEmpty(c1795650wpP2.LJI) && !TextUtils.isEmpty(c1795650wpP3.LJI)) {
                            c1795650wpP2.LJI = c1795650wpP3.LJI;
                        }
                        if (TextUtils.isEmpty(c1795650wpP2.LJII) && !TextUtils.isEmpty(c1795650wpP3.LJII)) {
                            c1795650wpP2.LJII = c1795650wpP3.LJII;
                        }
                        if (c1795650wpP2.LIZIZ == 0) {
                            long j = c1795650wpP3.LIZIZ;
                            if (j != 0) {
                                c1795650wpP2.LIZIZ = j;
                            }
                        }
                        if (TextUtils.isEmpty(c1795650wpP2.LIZJ) && !TextUtils.isEmpty(c1795650wpP3.LIZJ)) {
                            c1795650wpP2.LIZJ = c1795650wpP3.LIZJ;
                        }
                        if (c1795650wpP2.LIZLLL == null && (interfaceC1795200wog = c1795650wpP3.LIZLLL) != null) {
                            c1795650wpP2.LIZLLL = interfaceC1795200wog;
                        }
                        if (!c1795650wpP2.LJ && c1795650wpP3.LJ) {
                            c1795650wpP2.LJ = true;
                        }
                        if (!c1795650wpP2.LJFF && c1795650wpP3.LJFF) {
                            c1795650wpP2.LJFF = true;
                        }
                    }
                }
                if (c1795500wpA2.LJI == null && (interfaceC1796300wqS = c1795500wpA.LJI) != null) {
                    c1795500wpA2.LJI = interfaceC1796300wqS;
                }
                if (c1795500wpA2.LJIIIIZZ == null && (interfaceC1078660eAy = c1795500wpA.LJIIIIZZ) != null) {
                    c1795500wpA2.LJIIIIZZ = interfaceC1078660eAy;
                }
                if (c1795500wpA2.LJIIIZ == null) {
                    c1795500wpA2.LJIIIZ = c1795500wpA.LJIIIZ;
                }
                C1794240wn8 c1794240wn8 = (C1794240wn8) C1794240wn8.LJIIIIZZ();
                c1794240wn8.LJII();
                C1795500wpA c1795500wpA3 = ((C1795210woh) c1794240wn8.LIZ()).LIZ;
                if (c1795500wpA3 != null) {
                    if (c1795500wpA3.LJI != null) {
                        InterfaceC1796370wqZ interfaceC1796370wqZLIZIZ = c1794240wn8.LIZIZ();
                        InterfaceC1796300wqS interfaceC1796300wqS2 = c1795500wpA3.LJI;
                        C1796060wq4 c1796060wq4 = (C1796060wq4) interfaceC1796370wqZLIZIZ;
                        if (interfaceC1796300wqS2 != null) {
                            c1796060wq4.LIZ = interfaceC1796300wqS2;
                        } else {
                            c1796060wq4.getClass();
                        }
                    }
                    if (c1795500wpA3.LJII != null) {
                        InterfaceC1794350wnJ interfaceC1794350wnJLJ = c1794240wn8.LJ();
                        InterfaceC1794320wnG interfaceC1794320wnG = c1795500wpA3.LJII;
                        C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
                        if (interfaceC1794320wnG != null) {
                            c1794310wnF.LIZ = interfaceC1794320wnG;
                        } else {
                            c1794310wnF.getClass();
                        }
                    }
                }
                PaymentServiceManager.get().getIapExternalService().init();
                JSONObject jSONObjectKF = ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).KF();
                ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJII().getClass();
                if (jSONObjectKF != null) {
                    Application application2 = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LIZ;
                    JSONObject jSONObjectOptJSONObject = jSONObjectKF.optJSONObject("sdk_key_pipo_pay");
                    if (jSONObjectOptJSONObject != null) {
                        ARunnableS82S0200000_13 aRunnableS82S0200000_13 = new ARunnableS82S0200000_13((Context) application2, jSONObjectOptJSONObject, 92);
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            RunnableC823120WQs.LIZIZ(aRunnableS82S0200000_13);
                        } else {
                            aRunnableS82S0200000_13.run();
                        }
                    }
                }
                LJ = true;
                z = true;
            } else {
                throw new IllegalArgumentException("did is null,please set did by com.bytedance.globalpayment.payment.common.lib.configuration.Configuration.Builder.withDid!");
            }
        } else {
            z = false;
        }
        if (!LiveIAPRefactorQuerySetting.INSTANCE.getValue() && !LiveIapRefactorPrecheck.INSTANCE.getValue()) {
            return z;
        }
        try {
            InterfaceC1789300wfA.LIZ.LIZJ(C786410Ut5.N3(C497740JfY.LJII()));
            C1543490qGh.LIZIZ(C1791400wiY.class, null, 6);
            C1543490qGh.LIZIZ(C1791350wiT.class, null, 6);
            C1543490qGh.LIZIZ(C1791340wiS.class, null, 6);
            C1543490qGh.LIZIZ(C1791410wiZ.class, null, 6);
            z2 = true;
            return true;
        } catch (ExceptionInInitializerError e) {
            TryCatchGuardChecker.doCheck(e);
            return z2;
        }
    }
}
