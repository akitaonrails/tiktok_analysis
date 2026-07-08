package X;

import Y.ACallableS246S0200000_16;
import Y.ARunnableS128S0100000_28;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.xbridge.base.runtime.depend.ActionSheetBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.DialogBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.IChooseMediaResultCallback;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostFrameworkDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostMediaDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostPermissionDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IReportADLogResultCallback;
import com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionGrantCallback;
import com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionsGrantCallback;
import com.bytedance.ies.xbridge.base.runtime.depend.ShowActionSheetListener;
import com.bytedance.ies.xbridge.base.runtime.depend.ToastBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.XIRetrofit;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.hybrid.governance.network.HybridTrafficColoringModel;
import com.bytedance.sdk.xbridge.runtime.depend.BackPressConfig;
import com.bytedance.sdk.xbridge.runtime.depend.HybridPermissionCert;
import com.bytedance.sdk.xbridge.runtime.depend.OnPermissionsGrantResult;
import com.bytedance.sdk.xbridge.runtime.depend.PopupConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.i18n.xbridge.depend.runtime.UpdateGeckoWhiteListSettings;
import com.ss.android.ugc.aweme.i18n.xbridge.depend.runtime.UpdateNonLazyResourceSwitch;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService;
import com.ss.android.ugc.aweme.qrcode.handler.IBridgeScanHandler;
import com.ss.android.ugc.aweme.qrcode.handler.IQRCodePermissionActivityStarter;
import com.ss.android.ugc.aweme.qrcode.view.BridgeScanHandlerImpl;
import com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivityStarter;
import com.ss.android.ugc.aweme.utils.permission.PermissionViewModel;
import com.ss.android.ugc.tiktok.security.IClientSecurityService;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS142S1100000_28;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ytI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1874940ytI {
    public static void LIZ() {
        if (C1871520ynm.LJIIL == null) {
            C1871520ynm c1871520ynm = new C1871520ynm();
            c1871520ynm.LIZ = new IHostFrameworkDepend() { // from class: X.0dgM
                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostFrameworkDepend
                public final String getContainerID(C1059860dge c1059860dge) {
                    Object c098200Yq;
                    boolean zBooleanValue;
                    InterfaceC1052500dUm interfaceC1052500dUm;
                    String strLIZ;
                    C1047290dMN sessionInfo;
                    String str = null;
                    try {
                        JSONObject config = HybridSettings.INSTANCE.getConfig("get_container_id_jsb_rollback");
                        if (config != null) {
                            c098200Yq = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config, "enable"));
                        } else {
                            c098200Yq = null;
                        }
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
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        InterfaceC1028200cra interfaceC1028200cra = (InterfaceC1028200cra) C1553710qXB.LIZIZ(c1059860dge, InterfaceC1028200cra.class);
                        if (interfaceC1028200cra != null && (sessionInfo = interfaceC1028200cra.getSessionInfo()) != null) {
                            return sessionInfo.LIZ;
                        }
                    } else if (c1059860dge != null && (interfaceC1052500dUm = (InterfaceC1052500dUm) c1059860dge.LIZ(InterfaceC1052500dUm.class)) != null && (strLIZ = interfaceC1052500dUm.LIZ()) != null) {
                        return strLIZ;
                    }
                    C1524340plo value = C1524340plo.LJI.getValue();
                    if (!((ArrayList) value.LIZIZ).isEmpty()) {
                        str = (String) C13LP.LJJLIIIJJI(value.LIZIZ);
                    }
                    if (str == null) {
                        return "";
                    }
                    return str;
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostFrameworkDepend
                public final void addObserverEvent(C1059860dge c1059860dge, String str, List<String> list, List<? extends JSONObject> list2) {
                    InterfaceC1028200cra interfaceC1028200cra = (InterfaceC1028200cra) C1553710qXB.LIZIZ(c1059860dge, InterfaceC1028200cra.class);
                    if (interfaceC1028200cra != null) {
                        interfaceC1028200cra.LIZ(str, list, list2);
                    }
                }
            };
            c1871520ynm.LJ = new IHostContextDepend() { // from class: X.0yyk
                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final String getCurrentTelcomCarrier() {
                    return "";
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final String getSkinName() {
                    return "light";
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final String getSkinType() {
                    return "light";
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final String getAppName() {
                    C844470XAv.LIZ.getClass();
                    String str = C844470XAv.LJ;
                    if (str == null) {
                        return null;
                    }
                    return str;
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final Application getApplication() {
                    C844470XAv.LIZ.getClass();
                    return (Application) C844470XAv.LIZ();
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final String getChannel() {
                    C844470XAv.LIZ.getClass();
                    return C844470XAv.LJIILL;
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final int getExactAppId() {
                    C844470XAv.LIZ.getClass();
                    return C844470XAv.LJIIJ;
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final String getFullLanguage() {
                    I18nManagerServiceApi i18nManagerServiceApiLIZ;
                    I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
                    if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
                        C844470XAv.LIZ.getClass();
                        String strLJIILJJIL = i18nManagerServiceApiLIZ.LJIILJJIL(C844470XAv.LIZ());
                        if (strLJIILJJIL != null) {
                            return strLJIILJJIL;
                        }
                    }
                    return "";
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final String getPackageName() {
                    C844470XAv.LIZ.getClass();
                    return C844470XAv.LIZ().getPackageName();
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final String getUpdateVersion() {
                    C844470XAv.LIZ.getClass();
                    return String.valueOf(C844470XAv.LIZLLL());
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final long getVersionCode() {
                    C844470XAv.LIZ.getClass();
                    return C844470XAv.LIZIZ();
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final String getVersionName() {
                    C844470XAv.LIZ.getClass();
                    return C844470XAv.LIZJ();
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final boolean isDebuggable() {
                    C844470XAv.LIZ.getClass();
                    return Intrinsics.LJFF(C844470XAv.LJIILL, "local_test");
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final Context getApplicationContext() {
                    return C786410Ut5.M3(getApplication());
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final String getBoeChannel() {
                    return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getBoeLane();
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final String getDeviceId() {
                    return DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final String getLanguage() {
                    return C838600Wv4.LIZ().toString();
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final String getPPEChannel() {
                    return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getPPELane();
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final boolean isBoeEnable() {
                    return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe();
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final boolean isPPEEnable() {
                    return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enablePpe();
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final boolean isTeenMode() {
                    return C10EU.LJIIIIZZ();
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final int getAppId() {
                    return 1233;
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
                public final List<C1168160gVK> getSettings(List<C1168200gVO> list) {
                    return C1553710qXB.LIZ(list);
                }
            };
            c1871520ynm.LJII = new C1878190yyX();
            c1871520ynm.LJI = new C1059690dgN() { // from class: X.0dgV
                @Override // X.C1059690dgN, com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend
                public final boolean openSchema(C1059860dge c1059860dge, String str, Map<String, ? extends Object> map, EnumC1059790dgX enumC1059790dgX, Context context) {
                    Map map2;
                    Map map3;
                    String str2;
                    Map map4;
                    PageFinder pageFinderVia;
                    Object obj = map.get("extra");
                    if ((obj instanceof Map) && (map2 = (Map) obj) != null) {
                        Object obj2 = map2.get("btm_params");
                        if ((obj2 instanceof Map) && (map3 = (Map) obj2) != null) {
                            Object obj3 = map3.get("btm");
                            if (!(obj3 instanceof String) || (str2 = (String) obj3) == null) {
                                str2 = "";
                            }
                            if (str2.length() != 0) {
                                Object obj4 = map3.get("bcm");
                                if (obj4 instanceof Map) {
                                    map4 = (Map) obj4;
                                } else {
                                    map4 = null;
                                }
                                BtmSDK btmSDK = BtmSDK.INSTANCE;
                                C21244318Bt c21244318Bt = new C21244318Bt();
                                c21244318Bt.LIZ = str2;
                                if (c1059860dge == null || (pageFinderVia = (PageFinder) c1059860dge.LIZ(PageFinder.class)) == null) {
                                    pageFinderVia = PageFinder.via(C1059780dgW.LIZ(c1059860dge));
                                }
                                c21244318Bt.LIZIZ = pageFinderVia;
                                BcmParams.Companion.getClass();
                                c21244318Bt.LIZJ = C212367188v.LIZJ(map4);
                                String strCreateJumpSourceBtmTokenForJSB = btmSDK.createJumpSourceBtmTokenForJSB(c21244318Bt);
                                if (strCreateJumpSourceBtmTokenForJSB != null && strCreateJumpSourceBtmTokenForJSB.length() != 0) {
                                    Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                                    builderBuildUpon.appendQueryParameter("source_btm_token", strCreateJumpSourceBtmTokenForJSB);
                                    str = builderBuildUpon.build().toString();
                                }
                            }
                        }
                    }
                    return super.openSchema(c1059860dge, str, map, enumC1059790dgX, context);
                }
            };
            c1871520ynm.LJIIIIZZ = new IHostNetworkDepend() { // from class: X.0pf1
                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend
                public final Map<String, Object> getAPIParams() {
                    HashMap map = new HashMap();
                    C0XDN.LIZJ(map, true);
                    return map;
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend
                public final boolean usePiperData(C1059860dge c1059860dge) {
                    String strLIZ;
                    C1537480q70 c1537480q70LIZIZ;
                    InterfaceC1531560pxS interfaceC1531560pxS;
                    HybridSchemaParam hybridSchemaParamLIZJ;
                    if (c1059860dge == null) {
                        return false;
                    }
                    InterfaceC1052500dUm interfaceC1052500dUm = (InterfaceC1052500dUm) c1059860dge.LIZ(InterfaceC1052500dUm.class);
                    InterfaceC1541990qEH interfaceC1541990qEHLJIJJ = null;
                    if (interfaceC1052500dUm != null) {
                        strLIZ = interfaceC1052500dUm.LIZ();
                    } else {
                        strLIZ = null;
                    }
                    SparkContext.Companion.getClass();
                    C1537480q70 c1537480q70LIZIZ2 = C1529880puk.LIZIZ(strLIZ);
                    if (c1537480q70LIZIZ2 != null) {
                        interfaceC1541990qEHLJIJJ = c1537480q70LIZIZ2.LJIJJ();
                    }
                    if (interfaceC1541990qEHLJIJJ instanceof LynxView) {
                        SettingsManager.LIZLLL().getClass();
                        if (SettingsManager.LIZ("xrequest_support_piperdata", false) && strLIZ != null && ((c1537480q70LIZIZ = C1529880puk.LIZIZ(strLIZ)) == null || (interfaceC1531560pxS = c1537480q70LIZIZ.hybridParams) == null || (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) == null || !hybridSchemaParamLIZJ.getEnableAirStrictMode() || hybridSchemaParamLIZJ.getAirStrictModeUsePiperdata())) {
                            C1063680dmo.LIZ = true;
                            return true;
                        }
                    }
                    return false;
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend
                public final XIRetrofit createRetrofit(String str, boolean z) {
                    C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str);
                    c1499850p8JCreateBuilder.LJIIIIZZ(0);
                    return new XIRetrofit(c1499850p8JCreateBuilder.build()) { // from class: X.0pGP
                        public final InterfaceC2661011f LIZ;

                        {
                            this.LIZ = interfaceC2661011f;
                        }

                        @Override // com.bytedance.ies.xbridge.base.runtime.depend.XIRetrofit
                        public final <T> T create(Class<T> cls) {
                            return (T) this.LIZ.create(cls);
                        }
                    };
                }
            };
            c1871520ynm.LJFF = new IHostStyleUIDepend() { // from class: X.0zD9
                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
                public final Boolean showActionSheet(ActionSheetBuilder actionSheetBuilder, ShowActionSheetListener showActionSheetListener) {
                    return null;
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
                public final Boolean showDialog(DialogBuilder dialogBuilder) {
                    C698190Ra5 c698190Ra5LJFF;
                    Activity activityLIZ = C1871830yoH.LIZ(dialogBuilder.context);
                    if (activityLIZ == null) {
                        return Boolean.FALSE;
                    }
                    boolean z = dialogBuilder.cancelOnTouchOutside;
                    String str = dialogBuilder.positiveBtnText;
                    C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
                    c1397580mTM.LJI(dialogBuilder.title);
                    c1397580mTM.LIZIZ(dialogBuilder.message);
                    try {
                        String str2 = dialogBuilder.icon;
                        if (str2 != null) {
                            if (!u.LJJIIJZLJL(str2, "tux://icon", false)) {
                                str2 = null;
                            }
                            if (str2 != null && (c698190Ra5LJFF = C2248361CzK.LJFF(activityLIZ, str2)) != null) {
                                C419910GdJ c419910GdJ = new C419910GdJ();
                                c419910GdJ.LIZ = c698190Ra5LJFF.LIZ;
                                c419910GdJ.LIZLLL = c698190Ra5LJFF.LIZIZ;
                                C1235760iGM.LIZIZ(c1397580mTM, c419910GdJ.LIZ(activityLIZ));
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                    C985403tE.LIZ(c1397580mTM, new AwS142S1100000_28(str, dialogBuilder, 6));
                    c1397580mTM.LJII = z;
                    c1397580mTM.LIZLLL(new AwS607S0100000_28(dialogBuilder, 264));
                    new C1397510mTF(c1397580mTM).LIZLLL();
                    return Boolean.TRUE;
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
                public final Boolean hideLoading(C1871140ynA c1871140ynA, C1059860dge c1059860dge) {
                    Context context;
                    String strLIZ;
                    InterfaceC1887270zDB interfaceC1887270zDB;
                    if (c1059860dge != null && (context = (Context) c1059860dge.LIZ(Context.class)) != null) {
                        Activity activityLIZ = C1871830yoH.LIZ(context);
                        InterfaceC1052500dUm interfaceC1052500dUm = (InterfaceC1052500dUm) c1059860dge.LIZ(InterfaceC1052500dUm.class);
                        if (interfaceC1052500dUm == null || (strLIZ = interfaceC1052500dUm.LIZ()) == null) {
                            strLIZ = "";
                        }
                        if (activityLIZ instanceof SparkActivity) {
                            SparkActivity sparkActivity = (SparkActivity) activityLIZ;
                            if (!sparkActivity.isFinishing()) {
                                boolean z = c1871140ynA.LIZ;
                                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sparkActivity.LLJILJIL.LLILLL;
                                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                                    if (z) {
                                        C786410Ut5.LJJJJIZL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJJJLIIL);
                                        C786410Ut5.LJZ(8, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJJJLIIL);
                                    } else {
                                        InterfaceC1542220qEe interfaceC1542220qEe = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJIJI;
                                        if (interfaceC1542220qEe != null) {
                                            interfaceC1542220qEe.hide();
                                        }
                                    }
                                }
                            }
                            return Boolean.TRUE;
                        }
                        SparkContext.Companion.getClass();
                        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(strLIZ);
                        if (c1537480q70LIZIZ != null && (interfaceC1887270zDB = (InterfaceC1887270zDB) c1537480q70LIZIZ.LJFF(InterfaceC1887270zDB.class)) != null) {
                            interfaceC1887270zDB.LIZIZ(c1871140ynA.LIZ);
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    }
                    return Boolean.FALSE;
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
                public final Boolean showLoading(C1871070yn3 c1871070yn3, C1059860dge c1059860dge) {
                    Context context;
                    String strLIZ;
                    InterfaceC1887270zDB interfaceC1887270zDB;
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
                    InterfaceC1542220qEe interfaceC1542220qEe;
                    if (c1059860dge != null && (context = (Context) c1059860dge.LIZ(Context.class)) != null) {
                        Activity activityLIZ = C1871830yoH.LIZ(context);
                        if (activityLIZ == null) {
                            return Boolean.FALSE;
                        }
                        InterfaceC1052500dUm interfaceC1052500dUm = (InterfaceC1052500dUm) c1059860dge.LIZ(InterfaceC1052500dUm.class);
                        if (interfaceC1052500dUm == null || (strLIZ = interfaceC1052500dUm.LIZ()) == null) {
                            strLIZ = "";
                        }
                        if (activityLIZ instanceof SparkActivity) {
                            if (!activityLIZ.isFinishing() && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = ((SparkActivity) activityLIZ).LLJILJIL.LLILLL) != null && (interfaceC1542220qEe = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJIJI) != null) {
                                interfaceC1542220qEe.show();
                            }
                            return Boolean.TRUE;
                        }
                        SparkContext.Companion.getClass();
                        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(strLIZ);
                        if (c1537480q70LIZIZ != null && (interfaceC1887270zDB = (InterfaceC1887270zDB) c1537480q70LIZIZ.LJFF(InterfaceC1887270zDB.class)) != null) {
                            interfaceC1887270zDB.LIZ();
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    }
                    return Boolean.FALSE;
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
                public final Boolean showToast(ToastBuilder toastBuilder, C1059860dge c1059860dge) {
                    String strLIZ;
                    String stringExtra;
                    SparkContext sparkContextLIZ;
                    View viewE1;
                    Integer numValueOf;
                    C1389890mGx c1389890mGx;
                    long jIntValue;
                    long jIntValue2;
                    InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
                    InterfaceC1052500dUm interfaceC1052500dUm;
                    Activity activityLIZ = C1871830yoH.LIZ(toastBuilder.context);
                    String str = "";
                    if (c1059860dge == null || (interfaceC1052500dUm = (InterfaceC1052500dUm) c1059860dge.LIZ(InterfaceC1052500dUm.class)) == null || (strLIZ = interfaceC1052500dUm.LIZ()) == null) {
                        strLIZ = "";
                    }
                    SparkContext.Companion.getClass();
                    InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(strLIZ);
                    if (activityLIZ == null) {
                        return Boolean.FALSE;
                    }
                    Integer numValueOf2 = null;
                    if (interfaceC1059280dfiLIZ instanceof InterfaceC1800900wxs) {
                        sparkContextLIZ = ((SparkPopup) interfaceC1059280dfiLIZ).LLJIJIL;
                    } else {
                        C905703gN.LIZ.getClass();
                        C1041990dDp c1041990dDp = C1041990dDp.LIZ;
                        try {
                            stringExtra = activityLIZ.getIntent().getStringExtra("SparkContextContainerId");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            stringExtra = null;
                        }
                        c1041990dDp.getClass();
                        sparkContextLIZ = C1041990dDp.LIZ(stringExtra);
                    }
                    if (sparkContextLIZ != null && (interfaceC1541990qEHLJIJJ = sparkContextLIZ.LJIJJ()) != null) {
                        viewE1 = interfaceC1541990qEHLJIJJ.e1();
                    } else {
                        viewE1 = null;
                    }
                    String str2 = toastBuilder.type;
                    Locale locale = Locale.ROOT;
                    if (Intrinsics.LJFF(str2, "ERROR".toLowerCase(locale))) {
                        numValueOf2 = Integer.valueOf(R.attr.zi);
                        numValueOf = Integer.valueOf(R.raw.icon_exclamation_mark_circle_fill);
                    } else if (Intrinsics.LJFF(str2, "SUCCESS".toLowerCase(locale))) {
                        numValueOf2 = Integer.valueOf(R.attr.zi);
                        numValueOf = Integer.valueOf(R.raw.icon_tick_circle_fill);
                    } else if (Intrinsics.LJFF(str2, "WARN".toLowerCase(locale))) {
                        numValueOf2 = Integer.valueOf(R.attr.zi);
                        numValueOf = Integer.valueOf(R.raw.icon_exclamation_mark_triangle_fill);
                    } else if (Intrinsics.LJFF(str2, "INFO".toLowerCase(locale))) {
                        numValueOf2 = Integer.valueOf(R.attr.zi);
                        numValueOf = Integer.valueOf(R.raw.icon_info_circle_fill);
                    } else {
                        numValueOf = null;
                    }
                    if (viewE1 != null) {
                        c1389890mGx = new C1389890mGx(viewE1);
                    } else {
                        c1389890mGx = new C1389890mGx(activityLIZ);
                    }
                    String str3 = toastBuilder.message;
                    if (str3 != null) {
                        str = str3;
                    }
                    c1389890mGx.LJIIJ(str);
                    Integer num = toastBuilder.duration;
                    if (num != null) {
                        jIntValue = num.intValue();
                    } else {
                        jIntValue = 3000;
                    }
                    c1389890mGx.LIZLLL(jIntValue);
                    c1389890mGx.LIZ(true);
                    if (numValueOf2 != null) {
                        numValueOf2.intValue();
                        c1389890mGx.LJII(numValueOf2.intValue());
                    }
                    if (numValueOf != null) {
                        numValueOf.intValue();
                        c1389890mGx.LJFF(numValueOf.intValue());
                    }
                    Integer num2 = toastBuilder.delay;
                    if (num2 != null) {
                        jIntValue2 = num2.intValue();
                    } else {
                        jIntValue2 = 0;
                    }
                    if (jIntValue2 > 0) {
                        C786410Ut5.LJLIIL(jIntValue2, new BPEAHandler(Looper.getMainLooper()), new ARunnableS128S0100000_28(c1389890mGx, 96));
                    } else {
                        c1389890mGx.LJIIJJI();
                    }
                    return Boolean.TRUE;
                }
            };
            c1871520ynm.LIZIZ = new IHostLogDepend() { // from class: X.0dnk
                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
                public final Unit customReportJSBInfo(C1064350dnt c1064350dnt) {
                    String str = c1064350dnt.LIZ;
                    C1520360pfO c1520360pfO = new C1520360pfO(c1064350dnt.LIZIZ);
                    c1520360pfO.LIZIZ = "hybridkit_default_bid";
                    c1520360pfO.LJIIIIZZ = str;
                    c1520360pfO.LIZLLL = c1064350dnt.LIZJ;
                    c1520360pfO.LJ = c1064350dnt.LIZLLL;
                    c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
                    C1520080pew.LIZ(str, c1520360pfO.LIZ());
                    return null;
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
                public final void putCommonParams(Map<String, String> map, boolean z) {
                    C0XDN.LIZJ(map, z);
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
                public final Unit reportJSBError(C1059860dge c1059860dge, Map<String, ? extends Object> map) {
                    C15O7.LIZJ(new ACallableS246S0200000_16(c1059860dge, map, 4));
                    return null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
                
                    if (r3 != null) goto L100;
                 */
                /* JADX WARN: Removed duplicated region for block: B:98:0x0111 A[EXC_TOP_SPLITTER, PHI: r4
                  0x0111: PHI (r4v2 android.webkit.WebView) = (r4v1 android.webkit.WebView), (r4v5 android.webkit.WebView) binds: [B:53:0x00dd, B:67:0x010a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final kotlin.Unit reportJSBFetchError(X.C1059860dge r13, java.util.Map<java.lang.String, ? extends java.lang.Object> r14) {
                    /*
                        Method dump skipped, instruction units count: 387
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1064260dnk.reportJSBFetchError(X.0dge, java.util.Map):kotlin.Unit");
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
                public final void onEventV3Map(C1059860dge c1059860dge, String str, Map<String, String> map) {
                    Map<String, String> mapLJ;
                    String str2;
                    String str3;
                    String string;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (map == null) {
                        mapLJ = C2097608Jq.LJ();
                    } else {
                        mapLJ = map;
                    }
                    linkedHashMap.putAll(mapLJ);
                    if (map == null || (str2 = map.get("btm")) == null) {
                        str2 = "";
                    }
                    if (map != null) {
                        str3 = map.get("btm_show_id");
                    } else {
                        str3 = null;
                    }
                    if (str2.length() > 0 && (str3 == null || str3.length() == 0)) {
                        for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str2, PageFinder.via(C1059780dgW.LIZ(c1059860dge)), null, 4, null).entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            if (value != null) {
                                string = value.toString();
                            } else {
                                string = null;
                            }
                            linkedHashMap.put(key, string);
                        }
                    }
                    C20684815ws.LJIILLIIL(str, linkedHashMap);
                }

                /* JADX WARN: Not initialized variable reg: 11, insn: 0x019d: INVOKE (r11 I:com.bytedance.ies.xbridge.base.runtime.depend.IReportADLogResultCallback), (r6 I:int), (r0 I:java.lang.String) INTERFACE call: com.bytedance.ies.xbridge.base.runtime.depend.IReportADLogResultCallback.onFailure(int, java.lang.String):void A[MD:(int, java.lang.String):void (m)] (LINE:83886493), block:B:58:0x0192 */
                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
                public final void handleReportADLog(C1059860dge c1059860dge, String str, C1064330dnr c1064330dnr, IReportADLogResultCallback iReportADLogResultCallback, EnumC1059790dgX enumC1059790dgX) throws JSONException {
                    IReportADLogResultCallback iReportADLogResultCallbackOnFailure;
                    boolean zOptBoolean;
                    Aweme aweme;
                    AwemeRawAd awemeRawAd;
                    C1019830ce5 c1019830ce5LIZ = C988850bq7.LIZ();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("label", c1064330dnr.LIZ);
                    jSONObject.put("tag", c1064330dnr.LIZIZ);
                    String str2 = c1064330dnr.LIZJ;
                    if (str2 != null) {
                        jSONObject.put("refer", str2);
                    }
                    String str3 = c1064330dnr.LIZLLL;
                    if (str3 != null) {
                        jSONObject.put("group_id", str3);
                    }
                    String str4 = c1064330dnr.LJ;
                    if (str4 != null) {
                        jSONObject.put("creative_id", str4);
                    }
                    String str5 = c1064330dnr.LJFF;
                    if (str5 != null) {
                        jSONObject.put("log_extra", str5);
                    }
                    InterfaceC1107590evd interfaceC1107590evd = c1064330dnr.LJI;
                    if (interfaceC1107590evd != null) {
                        C1872780ypo.LIZ.getClass();
                        jSONObject.put("extParams", C1872780ypo.LIZIZ(interfaceC1107590evd));
                    }
                    try {
                        String strOptString = jSONObject.optString("tag");
                        String strOptString2 = jSONObject.optString("label");
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extParams");
                        if (jSONObjectOptJSONObject != null) {
                            zOptBoolean = jSONObjectOptJSONObject.optBoolean("has_ad_info", false);
                        } else {
                            zOptBoolean = false;
                        }
                        jSONObject.optString("creative_id");
                        jSONObject.optString("creative_id");
                        if (zOptBoolean) {
                            String strOptString3 = jSONObject.optString("creative_id");
                            String strOptString4 = jSONObject.optString("log_extra");
                            String strOptString5 = jSONObject.optString("group_id");
                            if (TextUtils.isEmpty(strOptString3)) {
                                jSONObject.optString("creative_id");
                                iReportADLogResultCallback.onFailure(0, "empty creativeId");
                            } else {
                                C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                                c1020020ceOLIZ.LIZ = strOptString;
                                c1020020ceOLIZ.LIZIZ = strOptString2;
                                c1020020ceOLIZ.LIZJ = strOptString3;
                                c1020020ceOLIZ.LJIIIIZZ(strOptString4);
                                c1020020ceOLIZ.LIZLLL = strOptString5;
                                c1020020ceOLIZ.LJI(jSONObjectOptJSONObject);
                                c1020020ceOLIZ.LJIIJ((Context) C1553710qXB.LIZIZ(c1059860dge, Context.class));
                                C1022820ciu c1022820ciuLJ = C2184171Adz.LJ(strOptString, strOptString2, strOptString3, strOptString4, strOptString5);
                                if (jSONObjectOptJSONObject != null) {
                                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                    while (itKeys.hasNext()) {
                                        String next = itKeys.next();
                                        c1022820ciuLJ.LIZJ(jSONObjectOptJSONObject.opt(next), next);
                                    }
                                }
                                c1022820ciuLJ.LJIIIIZZ();
                                jSONObject.optString("creative_id");
                                iReportADLogResultCallback.onSuccess(new C1870890yml(), "");
                            }
                        } else if (strOptString.length() > 0 && strOptString2.length() > 0 && c1019830ce5LIZ != null) {
                            C1020020ceO c1020020ceOLIZ2 = C1020030ceP.LIZ();
                            c1020020ceOLIZ2.LIZ = strOptString;
                            c1020020ceOLIZ2.LIZIZ = strOptString2;
                            c1020020ceOLIZ2.LIZLLL(Long.valueOf(c1019830ce5LIZ.LIZ));
                            c1020020ceOLIZ2.LJIIIIZZ(c1019830ce5LIZ.LIZIZ);
                            c1020020ceOLIZ2.LJII(Long.valueOf(c1019830ce5LIZ.LIZJ));
                            c1020020ceOLIZ2.LJI(jSONObjectOptJSONObject);
                            c1020020ceOLIZ2.LJIIJ((Context) C1553710qXB.LIZIZ(c1059860dge, Context.class));
                            C1022820ciu c1022820ciuLJ2 = C2184171Adz.LJ(strOptString, strOptString2, String.valueOf(c1019830ce5LIZ.LIZ), c1019830ce5LIZ.LIZIZ, String.valueOf(c1019830ce5LIZ.LIZJ));
                            if (jSONObjectOptJSONObject != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    c1022820ciuLJ2.LIZJ(jSONObjectOptJSONObject.opt(next2), next2);
                                }
                            }
                            c1022820ciuLJ2.LJIIIIZZ();
                            if (Intrinsics.LJFF(strOptString, "draw_ad") && Intrinsics.LJFF(strOptString2, "click") && (aweme = c1019830ce5LIZ.LJIIL) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                                UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                                Long creativeId = awemeRawAd.getCreativeId();
                                String logExtra = awemeRawAd.getLogExtra();
                                new AwS630S0100000_16(c1019830ce5LIZ, 74);
                                C2201691BEx.LIZ("click", clickTrackUrlList, creativeId, logExtra);
                            }
                            jSONObject.optString("creative_id");
                            iReportADLogResultCallback.onSuccess(new C1870890yml(), "");
                        } else {
                            jSONObject.optString("creative_id");
                            iReportADLogResultCallback.onFailure(0, "empty_tag_or_label_or_adinfo");
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C2344809Gs.LIZ(e);
                        jSONObject.optString("creative_id");
                        iReportADLogResultCallbackOnFailure.onFailure(0, "unknown error");
                    }
                    C1440005kM.LIZ(new C0T4N(str, jSONObject));
                }
            };
            c1871520ynm.LIZJ = new IHostMediaDepend() { // from class: X.14Us
                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostMediaDepend
                public final void handleJsInvoke(Context context, C20275114Uz c20275114Uz, IChooseMediaResultCallback iChooseMediaResultCallback) {
                    EnumC20274814Uw enumC20274814Uw;
                    boolean z;
                    String[] strArr;
                    boolean z2;
                    boolean z3;
                    Activity activityLIZ = C1871830yoH.LIZ(context);
                    if (activityLIZ == null) {
                        iChooseMediaResultCallback.onFailure(0, "Context not provided");
                        return;
                    }
                    WeakReference weakReference = new WeakReference(activityLIZ);
                    C14V1 c14v1 = new C14V1(activityLIZ, iChooseMediaResultCallback, weakReference);
                    Activity activityLIZ2 = C0XS4.LIZ((Context) weakReference.get());
                    if (!C142C.LIZ(activityLIZ2, c14v1)) {
                        c14v1.LIZ(0, "Failed to find proper activity");
                        return;
                    }
                    WeakReference weakReference2 = new WeakReference(activityLIZ2);
                    String str = (String) ListProtector.get(c20275114Uz.LIZ, 0);
                    String str2 = c20275114Uz.LIZIZ;
                    EnumC20274814Uw.Companion.getClass();
                    if (str != null && str2 != null) {
                        Locale locale = Locale.ROOT;
                        if (Intrinsics.LJFF(str.toLowerCase(locale), "image") && Intrinsics.LJFF(str2.toLowerCase(locale), "camera")) {
                            enumC20274814Uw = EnumC20274814Uw.TAKE_PHOTO;
                        } else if (Intrinsics.LJFF(str.toLowerCase(locale), "image") && Intrinsics.LJFF(str2.toLowerCase(locale), "album")) {
                            enumC20274814Uw = EnumC20274814Uw.PICK_PHOTO_FROM_ALBUM;
                        } else if (Intrinsics.LJFF(str.toLowerCase(locale), "video") && Intrinsics.LJFF(str2.toLowerCase(locale), "camera")) {
                            enumC20274814Uw = EnumC20274814Uw.TAKE_VIDEO;
                        } else if (Intrinsics.LJFF(str.toLowerCase(locale), "video") && Intrinsics.LJFF(str2.toLowerCase(locale), "album")) {
                            enumC20274814Uw = EnumC20274814Uw.PICK_VIDEO_FROM_ALBUM;
                        } else {
                            enumC20274814Uw = EnumC20274814Uw.UNSUPPORTED;
                        }
                    } else {
                        enumC20274814Uw = EnumC20274814Uw.UNSUPPORTED;
                    }
                    if (enumC20274814Uw == EnumC20274814Uw.UNSUPPORTED) {
                        c14v1.LIZ(-3, "Invalid fileType and sourceType in params");
                        return;
                    }
                    int i = C14V2.LIZ[enumC20274814Uw.ordinal()];
                    String str3 = "android.permission.READ_MEDIA_VIDEO";
                    String str4 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED";
                    String str5 = "android.permission.WRITE_EXTERNAL_STORAGE";
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    return;
                                }
                                final C20274314Ur c20274314Ur = new C20274314Ur(weakReference2, c14v1);
                                c14v1.LL = c20274314Ur;
                                int i2 = c20275114Uz.LIZJ;
                                c20274314Ur.LIZJ = i2;
                                if (!c20275114Uz.LIZLLL && !c20275114Uz.LJIIL) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                c20274314Ur.LIZLLL = z2;
                                c20274314Ur.LJII = c20275114Uz.LJIILIIL;
                                c20274314Ur.LJFF = c20275114Uz.LJIIIZ;
                                int i3 = c20275114Uz.LJIIJJI;
                                int i4 = c20275114Uz.LJIIJ;
                                if (i3 * i4 != 0) {
                                    c20274314Ur.LJI = (i3 * 1.0f) / i4;
                                }
                                if (i2 <= 1 && !c20275114Uz.LJIILL) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                c20274314Ur.LJ = c20275114Uz.LJIIL;
                                c20274314Ur.LJIIIIZZ = c20275114Uz.LJIILJJIL;
                                int i5 = c20275114Uz.LJI;
                                if (i5 == 0) {
                                    i5 = 216;
                                }
                                C20274314Ur.LJIIJ = i5;
                                int i6 = c20275114Uz.LJII;
                                if (i6 == 0) {
                                    i6 = 384;
                                }
                                C20274314Ur.LJIIJJI = i6;
                                C20274314Ur.LJIIL = c20275114Uz.LJIIIIZZ;
                                C20274314Ur.LJIILIIL = c20275114Uz.LJIILLIIL;
                                if (z3) {
                                    final Activity activity = (Activity) weakReference2.get();
                                    int i7 = Build.VERSION.SDK_INT;
                                    if (i7 >= 33) {
                                        str5 = "android.permission.READ_MEDIA_IMAGES";
                                    }
                                    if (C838410Wul.LIZ(activity, str5) == 0) {
                                        c20274314Ur.LIZIZ(activity);
                                        return;
                                    }
                                    if (i7 >= 34 && C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                                        c20274314Ur.LIZIZ(activity);
                                        return;
                                    }
                                    TokenCert tokenCertWith = TokenCert.Companion.with("bpea-x_pick_photos_write_storage_permission");
                                    String[] strArr2 = new String[2];
                                    strArr2[0] = str5;
                                    if (i7 < 34) {
                                        str4 = null;
                                    }
                                    strArr2[1] = str4;
                                    C19771812Xk.LIZIZ(activity, tokenCertWith, (String[]) ((ArrayList) C13LQ.LJIJI(strArr2)).toArray(new String[0]), new InterfaceC19772112Xn() { // from class: X.14Ux
                                        @Override // X.InterfaceC19772112Xn
                                        public final void LIZ(int[] iArr, String[] strArr3) {
                                            if (iArr.length != 0) {
                                                if (iArr[0] == 0) {
                                                    c20274314Ur.LIZIZ(activity);
                                                    return;
                                                }
                                                if (Build.VERSION.SDK_INT >= 34 && iArr.length == 2 && C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                                                    c20274314Ur.LIZIZ(activity);
                                                    return;
                                                }
                                                if (c20274314Ur.LJIIIIZZ == 0) {
                                                    C1233040iBy c1233040iBy = new C1233040iBy(activity);
                                                    c1233040iBy.LIZJ(activity.getString(2131839204));
                                                    c1233040iBy.LIZLLL();
                                                }
                                                c20274314Ur.LIZIZ.LIZ(-6, "Storage permission denied");
                                            }
                                        }
                                    });
                                    return;
                                }
                                final Activity activity2 = (Activity) weakReference2.get();
                                int i8 = Build.VERSION.SDK_INT;
                                if (i8 >= 33) {
                                    str5 = "android.permission.READ_MEDIA_IMAGES";
                                }
                                if (C838410Wul.LIZ(activity2, str5) == 0) {
                                    C20274314Ur.LIZLLL(activity2);
                                    return;
                                }
                                if (i8 >= 34 && C838410Wul.LIZ(activity2, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                                    C20274314Ur.LIZLLL(activity2);
                                    return;
                                }
                                TokenCert tokenCertWith2 = TokenCert.Companion.with("bpea-x_pick_photos_write_storage_2_permission");
                                String[] strArr3 = new String[2];
                                strArr3[0] = str5;
                                if (i8 < 34) {
                                    str4 = null;
                                }
                                strArr3[1] = str4;
                                C19771812Xk.LIZIZ(activity2, tokenCertWith2, (String[]) ((ArrayList) C13LQ.LJIJI(strArr3)).toArray(new String[0]), new InterfaceC19772112Xn() { // from class: X.14V0
                                    @Override // X.InterfaceC19772112Xn
                                    public final void LIZ(int[] iArr, String[] strArr4) {
                                        if (iArr.length != 0) {
                                            if (iArr[0] == 0) {
                                                C20274314Ur c20274314Ur2 = c20274314Ur;
                                                Activity activity3 = activity2;
                                                c20274314Ur2.getClass();
                                                C20274314Ur.LIZLLL(activity3);
                                                return;
                                            }
                                            if (Build.VERSION.SDK_INT >= 34 && iArr.length == 2 && C838410Wul.LIZ(activity2, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                                                C20274314Ur c20274314Ur3 = c20274314Ur;
                                                Activity activity4 = activity2;
                                                c20274314Ur3.getClass();
                                                C20274314Ur.LIZLLL(activity4);
                                                return;
                                            }
                                            c20274314Ur.LIZIZ.LIZ(-6, "Storage permission denied");
                                        }
                                    }
                                });
                                return;
                            }
                            final C20274214Uq c20274214Uq = new C20274214Uq(weakReference2, c14v1);
                            c14v1.LL = c20274214Uq;
                            final Activity activity3 = (Activity) weakReference2.get();
                            if (activity3 == null) {
                                c14v1.LIZ(0, "Activity not found");
                                return;
                            }
                            if (!activity3.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
                                c14v1.LIZ(0, "Camera feature not found");
                                return;
                            }
                            if (new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(activity3.getPackageManager()) == null) {
                                c14v1.LIZ(0, "Camera app not found");
                                return;
                            }
                            c20274214Uq.LJI = c20275114Uz.LJFF;
                            if (!c20275114Uz.LIZLLL && !c20275114Uz.LJIIL) {
                                z = false;
                            } else {
                                z = true;
                            }
                            c20274214Uq.LJIIIIZZ = z;
                            c20274214Uq.LJIIJJI = c20275114Uz.LJIILIIL;
                            c20274214Uq.LJIIIZ = c20275114Uz.LJIIL;
                            c20274214Uq.LJIIJ = c20275114Uz.LJ;
                            C20274214Uq.LJIIL = c20275114Uz.LJIILLIIL;
                            C20274214Uq.LJIILIIL = c20275114Uz.LJI;
                            C20274214Uq.LJIILJJIL = c20275114Uz.LJII;
                            C20274214Uq.LJIILL = c20275114Uz.LJIIIIZZ;
                            boolean zLIZIZ = C20274214Uq.LIZIZ(activity3, "android.permission.CAMERA");
                            if (!c20274214Uq.LJIIJ ? zLIZIZ : !(Build.VERSION.SDK_INT < 33 ? !zLIZIZ || !C20274214Uq.LIZIZ(activity3, "android.permission.WRITE_EXTERNAL_STORAGE") : !zLIZIZ || !C20274214Uq.LIZIZ(activity3, "android.permission.READ_MEDIA_IMAGES"))) {
                                c20274214Uq.LIZ(activity3);
                                return;
                            }
                            if (c20274214Uq.LJIIJ) {
                                int i9 = Build.VERSION.SDK_INT;
                                if (i9 >= 33) {
                                    String[] strArr4 = new String[3];
                                    strArr4[0] = "android.permission.CAMERA";
                                    strArr4[1] = "android.permission.READ_MEDIA_IMAGES";
                                    if (i9 < 34) {
                                        str4 = null;
                                    }
                                    strArr4[2] = str4;
                                    strArr = (String[]) ((ArrayList) C13LQ.LJIJI(strArr4)).toArray(new String[0]);
                                } else {
                                    strArr = new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
                                }
                            } else {
                                strArr = new String[]{"android.permission.CAMERA"};
                            }
                            C19771812Xk.LIZIZ(activity3, TokenCert.Companion.with("bpea-x_take_photo_camera_and_write_storage_permission"), strArr, new InterfaceC19772112Xn() { // from class: X.14V3
                                @Override // X.InterfaceC19772112Xn
                                public final void LIZ(int[] iArr, String[] strArr5) {
                                    boolean z4;
                                    if (strArr5.length != 0) {
                                        for (int i10 : iArr) {
                                            if (i10 == 0) {
                                            }
                                        }
                                        c20274214Uq.LIZ(activity3);
                                        return;
                                    }
                                    if (Build.VERSION.SDK_INT >= 34 && iArr.length == 3) {
                                        C20274214Uq c20274214Uq2 = c20274214Uq;
                                        Activity activity4 = activity3;
                                        c20274214Uq2.getClass();
                                        if (C20274214Uq.LIZIZ(activity4, "android.permission.CAMERA")) {
                                            C20274214Uq c20274214Uq3 = c20274214Uq;
                                            Activity activity5 = activity3;
                                            c20274214Uq3.getClass();
                                            if (C20274214Uq.LIZIZ(activity5, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) {
                                                c20274214Uq.LIZ(activity3);
                                                return;
                                            }
                                        }
                                    }
                                    if (strArr5.length == 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if ((!z4) && iArr[0] == -1) {
                                        c20274214Uq.LIZIZ.LIZ(-6, "Camera permission denied");
                                    } else {
                                        if (strArr5.length == 0 || iArr.length != 2 || iArr[1] != -1) {
                                            return;
                                        }
                                        c20274214Uq.LIZIZ.LIZ(-6, "Storage permission denied");
                                    }
                                }
                            });
                            return;
                        }
                        final C20274614Uu c20274614Uu = new C20274614Uu(weakReference2, c14v1);
                        c14v1.LL = c20274614Uu;
                        c20274614Uu.LIZJ = c20275114Uz.LJ;
                        final AwS431S0200000_30 awS431S0200000_30 = new AwS431S0200000_30(c20274614Uu, c20275114Uz, 53);
                        final Activity activity4 = (Activity) weakReference2.get();
                        if (activity4 == null) {
                            return;
                        }
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 < 33) {
                            str3 = "android.permission.WRITE_EXTERNAL_STORAGE";
                        }
                        if (C14W2.LIZ(activity4) == 0 && C838410Wul.LIZ(activity4, str3) == 0) {
                            awS431S0200000_30.invoke();
                            return;
                        }
                        if (C14W2.LIZ(activity4) == 0 && i10 >= 34 && C838410Wul.LIZ(activity4, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                            awS431S0200000_30.invoke();
                            return;
                        }
                        TokenCert tokenCertWith3 = TokenCert.Companion.with("bpea-x_take_video_camera_write_storage_permission");
                        String[] strArr5 = new String[3];
                        strArr5[0] = "android.permission.CAMERA";
                        strArr5[1] = str3;
                        if (i10 < 34) {
                            str4 = null;
                        }
                        strArr5[2] = str4;
                        C19771812Xk.LIZIZ(activity4, tokenCertWith3, (String[]) ((ArrayList) C13LQ.LJIJI(strArr5)).toArray(new String[0]), new InterfaceC19772112Xn() { // from class: X.14UX
                            @Override // X.InterfaceC19772112Xn
                            public final void LIZ(int[] iArr, String[] strArr6) {
                                if (iArr[0] == 0 && iArr[1] == 0) {
                                    awS431S0200000_30.invoke();
                                    return;
                                }
                                if (Build.VERSION.SDK_INT >= 34 && iArr.length == 3 && C838410Wul.LIZ(activity4, "android.permission.CAMERA") == 0 && C838410Wul.LIZ(activity4, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                                    awS431S0200000_30.invoke();
                                } else {
                                    c20274614Uu.LIZIZ.LIZ(-6, "Permission rejected");
                                }
                            }
                        });
                        return;
                    }
                    final C20274714Uv c20274714Uv = new C20274714Uv(weakReference2, c14v1);
                    c14v1.LL = c20274714Uv;
                    final AwS547S0100000_3 awS547S0100000_3 = new AwS547S0100000_3(c20274714Uv, 153);
                    final Activity activity5 = (Activity) weakReference2.get();
                    if (activity5 == null) {
                        return;
                    }
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 < 33) {
                        str3 = "android.permission.WRITE_EXTERNAL_STORAGE";
                    }
                    if (C838410Wul.LIZ(activity5, str3) == 0) {
                        awS547S0100000_3.invoke();
                        return;
                    }
                    if (i11 >= 34 && C838410Wul.LIZ(activity5, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                        awS547S0100000_3.invoke();
                        return;
                    }
                    TokenCert tokenCertWith4 = TokenCert.Companion.with("bpea-x_pick_videos_write_storage_permision");
                    String[] strArr6 = new String[2];
                    strArr6[0] = str3;
                    if (i11 < 34) {
                        str4 = null;
                    }
                    strArr6[1] = str4;
                    C19771812Xk.LIZIZ(activity5, tokenCertWith4, (String[]) ((ArrayList) C13LQ.LJIJI(strArr6)).toArray(new String[0]), new InterfaceC19772112Xn() { // from class: X.14Uy
                        @Override // X.InterfaceC19772112Xn
                        public final void LIZ(int[] iArr, String[] strArr7) {
                            if (iArr[0] == 0) {
                                awS547S0100000_3.invoke();
                            } else if (Build.VERSION.SDK_INT >= 34 && iArr.length == 2 && C838410Wul.LIZ(activity5, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                                awS547S0100000_3.invoke();
                            } else {
                                c20274714Uv.LIZIZ.LIZ(-6, "Permission not granted");
                            }
                        }
                    });
                }
            };
            c1871520ynm.LIZLLL = new IHostOpenDepend() { // from class: X.1BZl
                public static File LIZ(Context context) throws Throwable {
                    File file = C786450Ut9.LIZJ;
                    if (file != null && C786450Ut9.LJ) {
                        return file;
                    }
                    try {
                        C786450Ut9.LIZJ = context.getFilesDir();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        Context applicationContext = null;
                        try {
                            Class<?> cls = Class.forName("android.app.ActivityThread");
                            Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                            Field declaredField = cls.getDeclaredField("mInitialApplication");
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(objInvoke);
                            if (obj instanceof Application) {
                                applicationContext = ((Application) obj).getApplicationContext();
                                PrintStream printStream = System.out;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Application context obtained through ActivityThread: ");
                                sbLIZ.append(applicationContext);
                                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                            } else {
                                System.out.println("Error: mInitialApplication is not an instance of Application");
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            PrintStream printStream2 = System.out;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Error: ");
                            sbLIZ2.append(e.getMessage());
                            printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        if (applicationContext != null) {
                            C786450Ut9.LIZJ = applicationContext.getFilesDir();
                            C08RN.LIZ(applicationContext);
                        } else {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(th.getMessage());
                            sbLIZ3.append(":");
                            sbLIZ3.append(C08RN.LIZJ());
                            sbLIZ3.append(" applicationContext is null");
                            throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    }
                    return C786450Ut9.LIZJ;
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend
                public final Unit getGeckoInfo(String str, String str2, InterfaceC1889940zHU interfaceC1889940zHU) {
                    C443120HZe<Boolean, Long, Long> c443120HZeLIZJ = C1551910qUH.LIZJ(str, str2);
                    C1890110zHl c1890110zHl = new C1890110zHl(c443120HZeLIZJ.getFirst().booleanValue());
                    Long lLIZJ = C1550610qSB.LIZJ(str, str2);
                    if (lLIZJ != null && lLIZJ.longValue() != 0) {
                        c1890110zHl.LJ = EnumC992900bwe.OFFLINED;
                        c1890110zHl.LIZLLL = lLIZJ;
                    }
                    c1890110zHl.LIZIZ = c443120HZeLIZJ.getSecond();
                    Long third = c443120HZeLIZJ.getThird();
                    if (third != null) {
                        c1890110zHl.LIZJ = String.valueOf(third.longValue());
                    }
                    interfaceC1889940zHU.LIZ(c1890110zHl);
                    return Unit.LIZ;
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend
                public final void scanCode(C1059860dge c1059860dge, boolean z, final InterfaceC1871090yn5 interfaceC1871090yn5) {
                    Context context = (Context) C1553710qXB.LIZIZ(c1059860dge, Context.class);
                    if (context == null) {
                        interfaceC1871090yn5.onFailure();
                        return;
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "h5");
                    C20684815ws.LJIILLIIL("qr_code_scan_enter", c2344009Gk.LIZ);
                    InterfaceC19271510aP interfaceC19271510aP = new InterfaceC19271510aP() { // from class: X.10dN
                        @Override // X.InterfaceC19271510aP
                        public final String LIZ() {
                            return "";
                        }

                        @Override // X.InterfaceC19271510aP
                        public final String getName() {
                            return "x_host_open_depend_impl";
                        }

                        @Override // X.InterfaceC19271510aP
                        public final boolean LIZIZ(int i, String str) {
                            IBridgeScanHandler iBridgeScanHandlerLIZJ = BridgeScanHandlerImpl.LIZJ();
                            if (iBridgeScanHandlerLIZJ != null) {
                                iBridgeScanHandlerLIZJ.LIZ(this);
                            }
                            InterfaceC1871090yn5 interfaceC1871090yn52 = interfaceC1871090yn5;
                            if (str == null) {
                                str = "";
                            }
                            interfaceC1871090yn52.onSuccess(str);
                            return true;
                        }
                    };
                    IBridgeScanHandler iBridgeScanHandlerLIZJ = BridgeScanHandlerImpl.LIZJ();
                    if (iBridgeScanHandlerLIZJ != null) {
                        iBridgeScanHandlerLIZJ.LIZIZ(interfaceC19271510aP);
                    }
                    IQRCodePermissionActivityStarter iQRCodePermissionActivityStarterLIZIZ = QRCodePermissionActivityStarter.LIZIZ();
                    if (iQRCodePermissionActivityStarterLIZIZ != null) {
                        iQRCodePermissionActivityStarterLIZIZ.LIZ(C1871830yoH.LIZ(context), z);
                    }
                }

                public static void LIZIZ(String str, String str2, boolean z, C09ZO c09zo, boolean z2) {
                    C1551950qUL c1551950qULLJIIIZ = C1552050qUV.LJIIIZ(str2);
                    OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                    optionCheckUpdateParams.setLazyUpdate(z2);
                    optionCheckUpdateParams.setFrom("jsb");
                    optionCheckUpdateParams.setListener(new C09ZM(c09zo, str, z2, str2));
                    optionCheckUpdateParams.setEnableDownloadAutoRetry(z);
                    optionCheckUpdateParams.setChannelUpdatePriority(3);
                    c1551950qULLJIIIZ.LIZ(null, C2097908Jt.LIZJ(new Pair(str2, Collections.singletonList(new CheckRequestBodyModel.TargetChannel(str)))), optionCheckUpdateParams);
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend
                public final Unit updateGecko(String str, String str2, boolean z, C09ZO c09zo, boolean z2) throws Throwable {
                    List<String> list;
                    try {
                        if (z) {
                            LIZIZ(str2, str, z2, c09zo, true);
                        } else {
                            C844470XAv.LIZ.getClass();
                            File fileLIZ = LIZ(C844470XAv.LIZ());
                            C1553670qX7.LIZ.getClass();
                            new C0VSJ(fileLIZ, "offlineX");
                            if (C1550600qSA.LIZ(str, str2)) {
                                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                                UpdateNonLazyResourceSwitch.UpdateNonLazyResourceModel updateNonLazyResourceModel = UpdateNonLazyResourceSwitch.LIZ;
                                UpdateNonLazyResourceSwitch.UpdateNonLazyResourceModel updateNonLazyResourceModel2 = (UpdateNonLazyResourceSwitch.UpdateNonLazyResourceModel) settingsManagerLIZLLL.LJIIIIZZ("update_non_lazy_resource_switch", UpdateNonLazyResourceSwitch.UpdateNonLazyResourceModel.class, updateNonLazyResourceModel);
                                if (updateNonLazyResourceModel2 != null) {
                                    updateNonLazyResourceModel = updateNonLazyResourceModel2;
                                }
                                if (!updateNonLazyResourceModel.f69switch || ((list = updateNonLazyResourceModel.denyList) != null && list.contains(str2))) {
                                    c09zo.LIZLLL();
                                    return Unit.LIZ;
                                }
                            }
                            C1551330qTL.LIZ.getClass();
                            if (C1551330qTL.LJIIIIZZ(str, str2)) {
                                SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
                                UpdateGeckoWhiteListSettings.UpdateGeckoWhiteListModel updateGeckoWhiteListModel = UpdateGeckoWhiteListSettings.LIZ;
                                UpdateGeckoWhiteListSettings.UpdateGeckoWhiteListModel updateGeckoWhiteListModel2 = (UpdateGeckoWhiteListSettings.UpdateGeckoWhiteListModel) settingsManagerLIZLLL2.LJIIIIZZ("update_gecko_white_list", UpdateGeckoWhiteListSettings.UpdateGeckoWhiteListModel.class, updateGeckoWhiteListModel);
                                if (updateGeckoWhiteListModel2 != null) {
                                    updateGeckoWhiteListModel = updateGeckoWhiteListModel2;
                                }
                                if (updateGeckoWhiteListModel.whiteList.contains(str2)) {
                                    C1550610qSB.LIZIZ(str, str2);
                                    c09zo.LIZJ();
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("access_key", str);
                                    jSONObject.put("channel", str2);
                                    jSONObject.put("allow_update", 1);
                                    C20684815ws.LJIJ("update_blocked_gecko", jSONObject);
                                } else {
                                    c09zo.LIZIZ();
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("access_key", str);
                                    jSONObject2.put("channel", str2);
                                    jSONObject2.put("allow_update", 0);
                                    C20684815ws.LJIJ("update_blocked_gecko", jSONObject2);
                                }
                            } else {
                                LIZIZ(str2, str, z2, c09zo, false);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        c09zo.LIZ(e);
                    }
                    return Unit.LIZ;
                }
            };
            c1871520ynm.LJIIIZ = new IHostPermissionDepend() { // from class: X.0yr6
                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostPermissionDepend
                public final boolean hasPermission(Activity activity, String str) {
                    if (C838410Wul.LIZ(activity, str) == 0) {
                        return true;
                    }
                    return false;
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostPermissionDepend
                public final void requestPermission(Activity activity, final OnPermissionGrantCallback onPermissionGrantCallback, final String str, Cert cert) {
                    C19514711Wn.LIZIZ.LIZIZ(activity, cert).LIZIZ(str).LIZJ(new InterfaceC19515111Wr() { // from class: X.0yr5
                        @Override // X.InterfaceC19515111Wr
                        public final void onCanceled() {
                        }

                        @Override // X.InterfaceC19515111Wr
                        public final void LIZ(C0HWO... c0hwoArr) {
                            String str2 = str;
                            int length = c0hwoArr.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                C0HWO c0hwo = c0hwoArr[i];
                                if (Intrinsics.LJFF(c0hwo.LIZ, str2)) {
                                    if (c0hwo.LIZ()) {
                                        onPermissionGrantCallback.onAllGranted();
                                        return;
                                    }
                                } else {
                                    i++;
                                }
                            }
                            onPermissionGrantCallback.onNotGranted();
                        }
                    });
                }

                @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostPermissionDepend
                public final void requestPermissions(Activity activity, OnPermissionsGrantCallback onPermissionsGrantCallback, String[] strArr, Cert cert) {
                    C19514711Wn.LIZIZ.LIZIZ(activity, cert).LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new C19334910kd(onPermissionsGrantCallback, 2));
                }
            };
            c1871520ynm.LJIIJJI = new InterfaceC1872030yob() { // from class: X.0KbO
                @Override // X.InterfaceC1872030yob
                public final boolean LIZ(String str) {
                    return C1528360psI.LIZ.containsKey(str);
                }

                @Override // X.InterfaceC1872030yob
                public final void LIZJ(Map map) {
                    map.put("response-format", "protobuf");
                }

                @Override // X.InterfaceC1872030yob
                public final JSONObject LIZIZ(String str, String str2, byte[] bArr) {
                    return C1528360psI.LIZ(str, str2, null, bArr);
                }
            };
            HybridTrafficColoringModel hybridTrafficColoringModelLIZ = C822030WMn.LIZ();
            if (hybridTrafficColoringModelLIZ.enabled && hybridTrafficColoringModelLIZ.contextPassEnabled) {
                c1871520ynm.LJIIJ = new IHostThreadPoolExecutorDepend() { // from class: X.0ytK
                    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend
                    public final ExecutorService getNormalThreadExecutor() {
                        ExecutorService executorServiceLJI;
                        ExecutorService executorService = C2126108Up.LIZ;
                        IClientSecurityService iClientSecurityService = (IClientSecurityService) ServiceManager.get().getService(IClientSecurityService.class);
                        return (iClientSecurityService == null || (executorServiceLJI = iClientSecurityService.LJI(executorService)) == null) ? executorService : executorServiceLJI;
                    }

                    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend
                    public final int requestConcurrentNumber() {
                        SettingsManager.LIZLLL().getClass();
                        if (SettingsManager.LJ("xrequest_concurrency_number_limitation", 0) <= 0) {
                            return 0;
                        }
                        SettingsManager.LIZLLL().getClass();
                        return SettingsManager.LJ("xrequest_concurrency_number_limitation", 0);
                    }
                };
            }
            c1871520ynm.LIZ();
        }
        if (C1874950ytJ.LJIIL == null) {
            C1874950ytJ c1874950ytJ = new C1874950ytJ();
            c1874950ytJ.LIZ = new com.bytedance.sdk.xbridge.runtime.depend.IHostPermissionDepend() { // from class: X.0zCD
                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostPermissionDepend
                public final boolean hasPermission(Activity activity, String str) {
                    if (C838410Wul.LIZ(activity, str) == 0) {
                        return true;
                    }
                    return false;
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostPermissionDepend
                public final void requestPermission(Activity activity, final com.bytedance.sdk.xbridge.runtime.depend.OnPermissionGrantCallback onPermissionGrantCallback, String str) throws Throwable {
                    InterfaceC1886710zCH interfaceC1886710zCH = new InterfaceC1886710zCH() { // from class: X.0zCE
                        @Override // X.InterfaceC1886710zCH
                        public final void LIZ() {
                            onPermissionGrantCallback.onNotGranted();
                        }

                        @Override // X.InterfaceC1886710zCH
                        public final void LIZIZ() {
                            onPermissionGrantCallback.onAllGranted();
                        }
                    };
                    String[] strArr = {str};
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(activity);
                    if (activity != null && c19egLIZIZ != null) {
                        PermissionViewModel permissionViewModel = (PermissionViewModel) ViewModelProviders.of(c19egLIZIZ).get(PermissionViewModel.class);
                        C1886690zCF c1886690zCF = new C1886690zCF();
                        c1886690zCF.LIZ = interfaceC1886710zCH;
                        c1886690zCF.LIZIZ = 1001;
                        permissionViewModel.LL = c1886690zCF;
                        ArrayList arrayList = new ArrayList();
                        String str2 = strArr[0];
                        if (C838410Wul.LIZ(activity, str2) == -1) {
                            arrayList.add(str2);
                        }
                        if (!arrayList.isEmpty()) {
                            C2204961BRm.LLJJIJI(activity, (String[]) arrayList.toArray(new String[arrayList.size()]), 1001, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkiLdY0p3mKzfWbd/NitSN5741vsuWuaKwpF7YFVkP6s=", null));
                        } else {
                            interfaceC1886710zCH.LIZIZ();
                        }
                    }
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostPermissionDepend
                public final void requestPermissions(Activity activity, final com.bytedance.sdk.xbridge.runtime.depend.OnPermissionsGrantCallback onPermissionsGrantCallback, String[] strArr, HybridPermissionCert hybridPermissionCert) {
                    C19514711Wn.LIZIZ.LIZIZ(activity, TokenCert.Companion.with(hybridPermissionCert.getToken())).LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new InterfaceC19515111Wr() { // from class: X.0pGN
                        @Override // X.InterfaceC19515111Wr
                        public final void onCanceled() {
                        }

                        @Override // X.InterfaceC19515111Wr
                        public final void LIZ(C0HWO... c0hwoArr) {
                            int i;
                            ArrayList arrayList = new ArrayList();
                            com.bytedance.sdk.xbridge.runtime.depend.OnPermissionsGrantCallback onPermissionsGrantCallback2 = onPermissionsGrantCallback;
                            for (C0HWO c0hwo : c0hwoArr) {
                                String str = c0hwo.LIZ;
                                if (c0hwo.LIZ()) {
                                    i = 0;
                                } else {
                                    i = -1;
                                }
                                arrayList.add(new OnPermissionsGrantResult(str, i));
                            }
                            onPermissionsGrantCallback2.onResult((OnPermissionsGrantResult[]) arrayList.toArray(new OnPermissionsGrantResult[0]));
                        }
                    });
                }
            };
            c1874950ytJ.LIZIZ = new com.bytedance.sdk.xbridge.runtime.depend.IHostStyleUIDepend() { // from class: X.0zDA
                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostStyleUIDepend
                public final Boolean showDialog(com.bytedance.sdk.xbridge.runtime.depend.DialogBuilder dialogBuilder) {
                    Activity activityLIZ = C0XS4.LIZ(dialogBuilder.context);
                    if (activityLIZ == null) {
                        return Boolean.FALSE;
                    }
                    boolean z = dialogBuilder.cancelOnTouchOutside;
                    String str = dialogBuilder.positiveBtnText;
                    C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
                    c1397580mTM.LJI(dialogBuilder.title);
                    c1397580mTM.LIZIZ(dialogBuilder.message);
                    C985403tE.LIZ(c1397580mTM, new AwS142S1100000_28(str, dialogBuilder, 7));
                    c1397580mTM.LJII = z;
                    c1397580mTM.LIZLLL(new AwS607S0100000_28(dialogBuilder, 273));
                    new C1397510mTF(c1397580mTM).LIZLLL();
                    return Boolean.TRUE;
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostStyleUIDepend
                public final Boolean hideLoading(C1872620ypY c1872620ypY, InterfaceC634840OvC interfaceC634840OvC) {
                    Context context;
                    InterfaceC1887270zDB interfaceC1887270zDB;
                    if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
                        C1877130ywp.LIZ.getClass();
                        Activity activityLIZ = C1877130ywp.LIZ(context);
                        String containerID = interfaceC634840OvC.getContainerID();
                        if (containerID == null) {
                            containerID = "";
                        }
                        boolean zBooleanValue = false;
                        if (activityLIZ instanceof SparkActivity) {
                            SparkActivity sparkActivity = (SparkActivity) activityLIZ;
                            if (!sparkActivity.isFinishing()) {
                                Boolean bool = c1872620ypY.LIZ;
                                if (bool != null) {
                                    zBooleanValue = bool.booleanValue();
                                }
                                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sparkActivity.LLJILJIL.LLILLL;
                                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                                    if (zBooleanValue) {
                                        C786410Ut5.LJJJJIZL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJJJLIIL);
                                        C786410Ut5.LJZ(8, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJJJLIIL);
                                    } else {
                                        InterfaceC1542220qEe interfaceC1542220qEe = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJIJI;
                                        if (interfaceC1542220qEe != null) {
                                            interfaceC1542220qEe.hide();
                                        }
                                    }
                                }
                            }
                            return Boolean.TRUE;
                        }
                        SparkContext.Companion.getClass();
                        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
                        if (c1537480q70LIZIZ != null && (interfaceC1887270zDB = (InterfaceC1887270zDB) c1537480q70LIZIZ.LJFF(InterfaceC1887270zDB.class)) != null) {
                            Boolean bool2 = c1872620ypY.LIZ;
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            interfaceC1887270zDB.LIZIZ(zBooleanValue);
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    }
                    return Boolean.FALSE;
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostStyleUIDepend
                public final Boolean showLoading(C1872770ypn c1872770ypn, InterfaceC634840OvC interfaceC634840OvC) {
                    Context context;
                    InterfaceC1887270zDB interfaceC1887270zDB;
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
                    InterfaceC1542220qEe interfaceC1542220qEe;
                    if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
                        C1877130ywp.LIZ.getClass();
                        Activity activityLIZ = C1877130ywp.LIZ(context);
                        if (activityLIZ == null) {
                            return Boolean.FALSE;
                        }
                        if (activityLIZ instanceof SparkActivity) {
                            if (!activityLIZ.isFinishing() && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = ((SparkActivity) activityLIZ).LLJILJIL.LLILLL) != null && (interfaceC1542220qEe = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJIJI) != null) {
                                interfaceC1542220qEe.show();
                            }
                            return Boolean.TRUE;
                        }
                        String containerID = interfaceC634840OvC.getContainerID();
                        if (containerID == null) {
                            containerID = "";
                        }
                        SparkContext.Companion.getClass();
                        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
                        if (c1537480q70LIZIZ != null && (interfaceC1887270zDB = (InterfaceC1887270zDB) c1537480q70LIZIZ.LJFF(InterfaceC1887270zDB.class)) != null) {
                            interfaceC1887270zDB.LIZ();
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    }
                    return Boolean.FALSE;
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostStyleUIDepend
                public final Boolean showToast(com.bytedance.sdk.xbridge.runtime.depend.ToastBuilder toastBuilder, InterfaceC634840OvC interfaceC634840OvC) {
                    String containerID;
                    String stringExtra;
                    SparkContext sparkContextLIZ;
                    View viewE1;
                    Integer numValueOf;
                    C1389890mGx c1389890mGx;
                    long jLongValue;
                    long jLongValue2;
                    InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
                    SparkPopup sparkPopup;
                    Activity activityLIZ = C0XS4.LIZ(toastBuilder.context);
                    String str = "";
                    if (interfaceC634840OvC == null || (containerID = interfaceC634840OvC.getContainerID()) == null) {
                        containerID = "";
                    }
                    SparkContext.Companion.getClass();
                    InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(containerID);
                    if (activityLIZ == null) {
                        return Boolean.FALSE;
                    }
                    Integer numValueOf2 = null;
                    if (interfaceC1059280dfiLIZ instanceof InterfaceC1800900wxs) {
                        if (interfaceC1059280dfiLIZ instanceof SparkPopup) {
                            sparkPopup = (SparkPopup) interfaceC1059280dfiLIZ;
                        } else {
                            sparkPopup = null;
                        }
                        if (sparkPopup != null) {
                            sparkContextLIZ = sparkPopup.LLJIJIL;
                        } else {
                            sparkContextLIZ = null;
                        }
                    } else {
                        C905703gN.LIZ.getClass();
                        C1041990dDp c1041990dDp = C1041990dDp.LIZ;
                        try {
                            stringExtra = activityLIZ.getIntent().getStringExtra("SparkContextContainerId");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            stringExtra = null;
                        }
                        c1041990dDp.getClass();
                        sparkContextLIZ = C1041990dDp.LIZ(stringExtra);
                    }
                    if (sparkContextLIZ != null && (interfaceC1541990qEHLJIJJ = sparkContextLIZ.LJIJJ()) != null) {
                        viewE1 = interfaceC1541990qEHLJIJJ.e1();
                    } else {
                        viewE1 = null;
                    }
                    String str2 = toastBuilder.type;
                    Locale locale = Locale.ROOT;
                    if (Intrinsics.LJFF(str2, "ERROR".toLowerCase(locale))) {
                        numValueOf2 = Integer.valueOf(R.attr.zi);
                        numValueOf = Integer.valueOf(R.raw.icon_exclamation_mark_circle_fill);
                    } else if (Intrinsics.LJFF(str2, "SUCCESS".toLowerCase(locale))) {
                        numValueOf2 = Integer.valueOf(R.attr.zi);
                        numValueOf = Integer.valueOf(R.raw.icon_tick_circle_fill);
                    } else if (Intrinsics.LJFF(str2, "WARN".toLowerCase(locale))) {
                        numValueOf2 = Integer.valueOf(R.attr.zi);
                        numValueOf = Integer.valueOf(R.raw.icon_exclamation_mark_triangle_fill);
                    } else if (Intrinsics.LJFF(str2, "INFO".toLowerCase(locale))) {
                        numValueOf2 = Integer.valueOf(R.attr.zi);
                        numValueOf = Integer.valueOf(R.raw.icon_info_circle_fill);
                    } else {
                        numValueOf = null;
                    }
                    if (viewE1 != null) {
                        c1389890mGx = new C1389890mGx(viewE1);
                    } else {
                        c1389890mGx = new C1389890mGx(activityLIZ);
                    }
                    String str3 = toastBuilder.message;
                    if (str3 != null) {
                        str = str3;
                    }
                    c1389890mGx.LJIIJ(str);
                    Number number = toastBuilder.duration;
                    if (number != null) {
                        jLongValue = number.longValue();
                    } else {
                        jLongValue = 3000;
                    }
                    c1389890mGx.LIZLLL(jLongValue);
                    c1389890mGx.LIZ(true);
                    if (numValueOf2 != null) {
                        numValueOf2.intValue();
                        c1389890mGx.LJII(numValueOf2.intValue());
                    }
                    if (numValueOf != null) {
                        numValueOf.intValue();
                        c1389890mGx.LJFF(numValueOf.intValue());
                    }
                    Number number2 = toastBuilder.delay;
                    if (number2 != null) {
                        jLongValue2 = number2.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    if (jLongValue2 > 0) {
                        C786410Ut5.LJLIIL(jLongValue2, new BPEAHandler(Looper.getMainLooper()), new ARunnableS128S0100000_28(c1389890mGx, 100));
                    } else {
                        c1389890mGx.LJIIJJI();
                    }
                    return Boolean.TRUE;
                }

                /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostStyleUIDepend
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void setPageNaviStyle(X.InterfaceC634840OvC r6, android.app.Activity r7, com.bytedance.sdk.xbridge.runtime.depend.PageTitleBar r8) {
                    /*
                        Method dump skipped, instruction units count: 205
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1887260zDA.setPageNaviStyle(X.0OvC, android.app.Activity, com.bytedance.sdk.xbridge.runtime.depend.PageTitleBar):void");
                }
            };
            c1874950ytJ.LIZJ = new InterfaceC1887650zDn() { // from class: X.0zDp
                @Override // X.InterfaceC1887650zDn
                public final void LIZ(InterfaceC634840OvC interfaceC634840OvC, PopupConfig popupConfig) {
                    InterfaceC1887690zDr interfaceC1887690zDr;
                    String strLIZ;
                    if (interfaceC634840OvC != null && (interfaceC1887690zDr = (InterfaceC1887690zDr) interfaceC634840OvC.LIZIZ(InterfaceC1887690zDr.class)) != null && (strLIZ = interfaceC1887690zDr.LIZ()) != null) {
                        SparkContext.Companion.getClass();
                        InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(strLIZ);
                        if (interfaceC1059280dfiLIZ != null && (interfaceC1059280dfiLIZ instanceof SparkPopup)) {
                            Integer num = popupConfig.enablePullDownClose;
                            if (num != null) {
                                if (num.intValue() == 1) {
                                    ((SparkPopup) interfaceC1059280dfiLIZ).mS(true);
                                } else if (num.intValue() == 0) {
                                    ((SparkPopup) interfaceC1059280dfiLIZ).mS(false);
                                }
                            }
                            Integer num2 = popupConfig.disableMaskClickClose;
                            SparkPopupSchemaParam sparkPopupSchemaParam = null;
                            if (num2 != null) {
                                if (num2.intValue() == 1) {
                                    SparkPopupSchemaParam sparkPopupSchemaParam2 = ((SparkPopup) interfaceC1059280dfiLIZ).LLJI;
                                    if (sparkPopupSchemaParam2 != null) {
                                        sparkPopupSchemaParam = sparkPopupSchemaParam2;
                                    }
                                    sparkPopupSchemaParam.setDisableOutsideClickClose(true);
                                    return;
                                }
                                if (num2.intValue() != 0) {
                                    return;
                                }
                                SparkPopupSchemaParam sparkPopupSchemaParam3 = ((SparkPopup) interfaceC1059280dfiLIZ).LLJI;
                                if (sparkPopupSchemaParam3 != null) {
                                    sparkPopupSchemaParam = sparkPopupSchemaParam3;
                                }
                                sparkPopupSchemaParam.setDisableOutsideClickClose(false);
                            }
                        }
                    }
                }

                @Override // X.InterfaceC1887650zDn
                public final void LIZIZ(InterfaceC634840OvC interfaceC634840OvC, BackPressConfig backPressConfig) {
                    InterfaceC1887690zDr interfaceC1887690zDr;
                    String strLIZ;
                    Integer num;
                    if (interfaceC634840OvC != null && (interfaceC1887690zDr = (InterfaceC1887690zDr) interfaceC634840OvC.LIZIZ(InterfaceC1887690zDr.class)) != null && (strLIZ = interfaceC1887690zDr.LIZ()) != null && (num = backPressConfig.disableBackPress) != null) {
                        if (num.intValue() == 1) {
                            C1024630clp.LLILLL.put(strLIZ, Boolean.TRUE);
                        } else {
                            if (num.intValue() != 0) {
                                return;
                            }
                            C1024630clp.LLILLL.put(strLIZ, Boolean.FALSE);
                        }
                    }
                }
            };
            c1874950ytJ.LJIIIZ = new C1878200yyY();
            c1874950ytJ.LIZLLL = new com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend() { // from class: X.0yyj
                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                public final String getCurrentTelcomCarrier() {
                    return "";
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                public final String getSkinName() {
                    return "light";
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                public final String getAppName() {
                    C844470XAv.LIZ.getClass();
                    String str = C844470XAv.LJ;
                    if (str == null) {
                        return null;
                    }
                    return str;
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                public final Application getApplication() {
                    C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
                    return C1161970gLL.LIZIZ().LIZJ();
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                public final String getChannel() {
                    C844470XAv.LIZ.getClass();
                    return C844470XAv.LJIILL;
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                public final int getExactAppId() {
                    C844470XAv.LIZ.getClass();
                    return C844470XAv.LJIIJ;
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                public final String getFullLanguage() {
                    I18nManagerServiceApi i18nManagerServiceApiLIZ;
                    I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
                    if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
                        C844470XAv.LIZ.getClass();
                        String strLJIILJJIL = i18nManagerServiceApiLIZ.LJIILJJIL(C844470XAv.LIZ());
                        if (strLJIILJJIL != null) {
                            return strLJIILJJIL;
                        }
                    }
                    return "";
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                public final String getUpdateVersion() {
                    C844470XAv.LIZ.getClass();
                    return String.valueOf(C844470XAv.LIZLLL());
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                public final String getVersionName() {
                    C844470XAv.LIZ.getClass();
                    return C844470XAv.LIZJ();
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                public final boolean isDebuggable() {
                    C844470XAv.LIZ.getClass();
                    return Intrinsics.LJFF(C844470XAv.LJIILL, "local_test");
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                public final Context getApplicationContext() {
                    return C786410Ut5.M3(getApplication());
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                public final String getBoeChannel() {
                    return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getBoeLane();
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                public final String getDeviceId() {
                    return DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                public final String getLanguage() {
                    return C838600Wv4.LIZ().toString();
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                public final String getPPEChannel() {
                    return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getPPELane();
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                public final boolean isBoeEnable() {
                    return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe();
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                public final boolean isPPEEnable() {
                    return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enablePpe();
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                public final boolean isTeenMode() {
                    return C10EU.LJIIIIZZ();
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                public final int getAppId() {
                    return 1233;
                }

                /* JADX WARN: Removed duplicated region for block: B:118:0x01ce A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:121:0x007d A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:96:0x01c9 A[PHI: r1
                  0x01c9: PHI (r1v4 java.lang.Object) = 
                  (r1v3 java.lang.Object)
                  (r1v6 java.lang.Object)
                  (r1v20 java.lang.Object)
                  (r1v21 java.lang.Object)
                  (r1v22 java.lang.Object)
                  (r1v23 java.lang.Object)
                  (r1v24 java.lang.Object)
                 binds: [B:94:0x01c6, B:61:0x0168, B:72:0x017e, B:67:0x0173, B:39:0x00c5, B:34:0x00b9, B:29:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.util.List<X.C1873100yqK> getSettings(java.util.List<X.C1873070yqH> r12) {
                    /*
                        Method dump skipped, instruction units count: 502
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1878310yyj.getSettings(java.util.List):java.util.List");
                }
            };
            c1874950ytJ.LJ = new com.bytedance.sdk.xbridge.runtime.depend.IHostLogDepend() { // from class: X.0dnl
                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostLogDepend
                public final void putCommonParams(Map<String, String> map, boolean z) {
                    C0XDN.LIZJ(map, z);
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostLogDepend
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final kotlin.Unit reportJSBFetchError(X.InterfaceC634840OvC r13, java.util.Map<java.lang.String, ? extends java.lang.Object> r14) {
                    /*
                        Method dump skipped, instruction units count: 277
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1064270dnl.reportJSBFetchError(X.0OvC, java.util.Map):kotlin.Unit");
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostLogDepend
                public final void onEventV3Map(InterfaceC634840OvC interfaceC634840OvC, String str, Map<String, String> map, boolean z) {
                    Map<String, String> mapLJ;
                    String str2;
                    String str3;
                    View view;
                    View view2;
                    String string;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (map == null) {
                        mapLJ = C2097608Jq.LJ();
                    } else {
                        mapLJ = map;
                    }
                    linkedHashMap.putAll(mapLJ);
                    if (map == null || (str2 = map.get("btm")) == null) {
                        str2 = "";
                    }
                    String containerID = null;
                    if (map != null) {
                        str3 = map.get("btm_show_id");
                    } else {
                        str3 = null;
                    }
                    if (str2.length() > 0 && (str3 == null || str3.length() == 0)) {
                        BtmSDK btmSDK = BtmSDK.INSTANCE;
                        if (interfaceC634840OvC != null) {
                            view2 = interfaceC634840OvC.getView();
                        } else {
                            view2 = null;
                        }
                        for (Map.Entry entry : BtmSDK.createReportParams$default(btmSDK, str2, PageFinder.via(view2), null, 4, null).entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            if (value != null) {
                                string = value.toString();
                            } else {
                                string = null;
                            }
                            linkedHashMap.put(key, string);
                        }
                    }
                    C1064340dns.LIZ.getClass();
                    ILocalServicePassThroughService iLocalServicePassThroughService = C1064340dns.LIZIZ;
                    if (iLocalServicePassThroughService != null) {
                        if (interfaceC634840OvC != null) {
                            view = interfaceC634840OvC.getView();
                        } else {
                            view = null;
                        }
                        Map mapLJIILL = iLocalServicePassThroughService.LJIILL(PageFinder.via(PageFinder.via(view)), str, linkedHashMap);
                        if (mapLJIILL != null) {
                            for (Map.Entry entry2 : mapLJIILL.entrySet()) {
                                linkedHashMap.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                    }
                    if (z) {
                        if (interfaceC634840OvC != null) {
                            containerID = interfaceC634840OvC.getContainerID();
                        }
                        C1520360pfO c1520360pfO = new C1520360pfO(str);
                        c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
                        c1520360pfO.LIZLLL = C678560QjW.LIZLLL(linkedHashMap);
                        C1520080pew.LIZ(containerID, c1520360pfO.LIZ());
                        return;
                    }
                    C20684815ws.LJIILLIIL(str, linkedHashMap);
                }

                /* JADX WARN: Not initialized variable reg: 10, insn: 0x0194: INVOKE (r10 I:X.0dnu), (r0 I:java.lang.String) INTERFACE call: X.0dnu.LJIIJ(java.lang.String):void A[MD:(java.lang.String):void (m)] (LINE:83886484), block:B:67:0x0189 */
                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostLogDepend
                public final void handleReportADLog(InterfaceC634840OvC interfaceC634840OvC, String str, C1064320dnq c1064320dnq, InterfaceC1064360dnu interfaceC1064360dnu, EnumC1063300dmC enumC1063300dmC) throws JSONException {
                    InterfaceC1064360dnu interfaceC1064360dnuLJIIJ;
                    boolean zOptBoolean;
                    Object objLIZIZ;
                    Aweme aweme;
                    AwemeRawAd awemeRawAd;
                    C1019830ce5 c1019830ce5LIZ = C988850bq7.LIZ();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("label", c1064320dnq.LIZ);
                    jSONObject.put("tag", c1064320dnq.LIZIZ);
                    String str2 = c1064320dnq.LIZJ;
                    if (str2 != null) {
                        jSONObject.put("refer", str2);
                    }
                    String str3 = c1064320dnq.LIZLLL;
                    if (str3 != null) {
                        jSONObject.put("group_id", str3);
                    }
                    String str4 = c1064320dnq.LJ;
                    if (str4 != null) {
                        jSONObject.put("creative_id", str4);
                    }
                    String str5 = c1064320dnq.LJFF;
                    if (str5 != null) {
                        jSONObject.put("log_extra", str5);
                    }
                    Map<String, Object> map = c1064320dnq.LJI;
                    if (map != null) {
                        C1543800qHC.LIZ.getClass();
                        jSONObject.put("extParams", C1543800qHC.LIZJ(map));
                    }
                    try {
                        String strOptString = jSONObject.optString("tag");
                        String strOptString2 = jSONObject.optString("label");
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extParams");
                        if (jSONObjectOptJSONObject != null) {
                            zOptBoolean = jSONObjectOptJSONObject.optBoolean("has_ad_info", false);
                        } else {
                            zOptBoolean = false;
                        }
                        Context context = null;
                        if (interfaceC634840OvC != null) {
                            objLIZIZ = interfaceC634840OvC.LIZIZ(InterfaceC1028200cra.class);
                        } else {
                            objLIZIZ = null;
                        }
                        jSONObject.optString("creative_id");
                        jSONObject.optString("creative_id");
                        if (zOptBoolean) {
                            String strOptString3 = jSONObject.optString("creative_id");
                            String strOptString4 = jSONObject.optString("log_extra");
                            String strOptString5 = jSONObject.optString("group_id");
                            if (TextUtils.isEmpty(strOptString3)) {
                                jSONObject.optString("creative_id");
                                interfaceC1064360dnu.LJIIJ("empty creativeId");
                            } else {
                                C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                                c1020020ceOLIZ.LIZ = strOptString;
                                c1020020ceOLIZ.LIZIZ = strOptString2;
                                c1020020ceOLIZ.LIZJ = strOptString3;
                                c1020020ceOLIZ.LJIIIIZZ(strOptString4);
                                c1020020ceOLIZ.LIZLLL = strOptString5;
                                c1020020ceOLIZ.LJI(jSONObjectOptJSONObject);
                                if (interfaceC634840OvC != null) {
                                    context = interfaceC634840OvC.getContext();
                                }
                                c1020020ceOLIZ.LJIIJ(context);
                                C1022820ciu c1022820ciuLJ = C2184171Adz.LJ(strOptString, strOptString2, strOptString3, strOptString4, strOptString5);
                                if (jSONObjectOptJSONObject != null) {
                                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                    while (itKeys.hasNext()) {
                                        String next = itKeys.next();
                                        c1022820ciuLJ.LIZJ(jSONObjectOptJSONObject.opt(next), next);
                                    }
                                }
                                c1022820ciuLJ.LJIIIIZZ();
                                jSONObject.optString("creative_id");
                                interfaceC1064360dnu.onSuccess("");
                            }
                        } else if (strOptString.length() > 0 && strOptString2.length() > 0 && c1019830ce5LIZ != null) {
                            C1020020ceO c1020020ceOLIZ2 = C1020030ceP.LIZ();
                            c1020020ceOLIZ2.LIZ = strOptString;
                            c1020020ceOLIZ2.LIZIZ = strOptString2;
                            c1020020ceOLIZ2.LIZLLL(Long.valueOf(c1019830ce5LIZ.LIZ));
                            c1020020ceOLIZ2.LJIIIIZZ(c1019830ce5LIZ.LIZIZ);
                            c1020020ceOLIZ2.LJII(Long.valueOf(c1019830ce5LIZ.LIZJ));
                            c1020020ceOLIZ2.LJI(jSONObjectOptJSONObject);
                            if (interfaceC634840OvC != null) {
                                context = interfaceC634840OvC.getContext();
                            }
                            c1020020ceOLIZ2.LJIIJ(context);
                            C1022820ciu c1022820ciuLJ2 = C2184171Adz.LJ(strOptString, strOptString2, String.valueOf(c1019830ce5LIZ.LIZ), c1019830ce5LIZ.LIZIZ, String.valueOf(c1019830ce5LIZ.LIZJ));
                            if (jSONObjectOptJSONObject != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    c1022820ciuLJ2.LIZJ(jSONObjectOptJSONObject.opt(next2), next2);
                                }
                            }
                            c1022820ciuLJ2.LJIIIIZZ();
                            if (Intrinsics.LJFF(strOptString, "draw_ad") && Intrinsics.LJFF(strOptString2, "click") && (aweme = c1019830ce5LIZ.LJIIL) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                                UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                                Long creativeId = awemeRawAd.getCreativeId();
                                String logExtra = awemeRawAd.getLogExtra();
                                new AwS630S0100000_16(c1019830ce5LIZ, 79);
                                C2201691BEx.LIZ("click", clickTrackUrlList, creativeId, logExtra);
                            }
                            jSONObject.optString("creative_id");
                            interfaceC1064360dnu.onSuccess("");
                        } else {
                            jSONObject.optString("creative_id");
                            interfaceC1064360dnu.LJIIJ("empty_tag_or_label_or_adinfo");
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C2344809Gs.LIZ(e);
                        jSONObject.optString("creative_id");
                        interfaceC1064360dnuLJIIJ.LJIIJ("unknown error");
                    }
                    C1440005kM.LIZ(new C0T4N(str, jSONObject));
                }
            };
            c1874950ytJ.LJFF = new com.bytedance.sdk.xbridge.runtime.depend.IHostNetworkDepend() { // from class: X.0pf0
                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostNetworkDepend
                public final Map<String, Object> getAPIParams() {
                    HashMap map = new HashMap();
                    C0XDN.LIZJ(map, true);
                    return map;
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostNetworkDepend
                public final boolean usePiperData(String str) {
                    InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
                    InterfaceC1531560pxS interfaceC1531560pxS;
                    if (str == null) {
                        return false;
                    }
                    SparkContext.Companion.getClass();
                    C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(str);
                    HybridSchemaParam hybridSchemaParamLIZJ = null;
                    if (c1537480q70LIZIZ != null) {
                        interfaceC1541990qEHLJIJJ = c1537480q70LIZIZ.LJIJJ();
                    } else {
                        interfaceC1541990qEHLJIJJ = null;
                    }
                    if (interfaceC1541990qEHLJIJJ instanceof LynxView) {
                        SettingsManager.LIZLLL().getClass();
                        if (SettingsManager.LIZ("xrequest_support_piperdata", false)) {
                            C1537480q70 c1537480q70LIZIZ2 = C1529880puk.LIZIZ(str);
                            if (c1537480q70LIZIZ2 != null && (interfaceC1531560pxS = c1537480q70LIZIZ2.hybridParams) != null) {
                                hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ();
                            }
                            if (hybridSchemaParamLIZJ == null || !hybridSchemaParamLIZJ.getEnableAirStrictMode() || hybridSchemaParamLIZJ.getAirStrictModeUsePiperdata()) {
                                return true;
                            }
                        }
                    }
                    return false;
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostNetworkDepend
                public final com.bytedance.sdk.xbridge.runtime.depend.XIRetrofit createRetrofit(String str, boolean z) {
                    C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str);
                    c1499850p8JCreateBuilder.LJIIIIZZ(0);
                    return new com.bytedance.sdk.xbridge.runtime.depend.XIRetrofit(c1499850p8JCreateBuilder.build()) { // from class: X.0pEM
                        public final InterfaceC2661011f LIZ;

                        {
                            this.LIZ = interfaceC2661011f;
                        }

                        @Override // com.bytedance.sdk.xbridge.runtime.depend.XIRetrofit
                        public final <T> T create(Class<T> cls) {
                            return (T) this.LIZ.create(cls);
                        }
                    };
                }
            };
            c1874950ytJ.LJI = new InterfaceC1797410wsF() { // from class: X.0dm3
                @Override // X.InterfaceC1797410wsF
                public final boolean LIZ(InterfaceC634840OvC interfaceC634840OvC, EnumC1063300dmC enumC1063300dmC, String str, boolean z) {
                    String containerID;
                    IHostRouterDepend iHostRouterDepend;
                    EnumC1059790dgX enumC1059790dgX;
                    C1537480q70 hybridContext;
                    if (interfaceC634840OvC != null && (containerID = interfaceC634840OvC.getContainerID()) != null) {
                        C1529870puj.LIZ.getClass();
                        InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(containerID);
                        C1059860dge c1059860dge = null;
                        if (interfaceC1541990qEHLJFF != null && (hybridContext = interfaceC1541990qEHLJFF.getHybridContext()) != null) {
                            c1059860dge = (C1059860dge) hybridContext.LJFF(C1059860dge.class);
                        }
                        C1871520ynm c1871520ynm2 = C1871520ynm.LJIIL;
                        if (c1871520ynm2 != null && (iHostRouterDepend = c1871520ynm2.LJI) != null) {
                            int i = C1063230dm5.LIZ[enumC1063300dmC.ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i != 4) {
                                            enumC1059790dgX = EnumC1059790dgX.NONE;
                                        } else {
                                            enumC1059790dgX = EnumC1059790dgX.RN;
                                        }
                                    } else {
                                        enumC1059790dgX = EnumC1059790dgX.LYNX;
                                    }
                                } else {
                                    enumC1059790dgX = EnumC1059790dgX.ALL;
                                }
                            } else {
                                enumC1059790dgX = EnumC1059790dgX.WEB;
                            }
                            if (str == null) {
                                str = containerID;
                            }
                            Boolean boolValueOf = Boolean.valueOf(iHostRouterDepend.closeView(c1059860dge, enumC1059790dgX, str, z));
                            if (boolValueOf != null) {
                                return boolValueOf.booleanValue();
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
            };
            c1874950ytJ.LJII = new com.bytedance.sdk.xbridge.runtime.depend.IHostThreadPoolExecutorDepend() { // from class: X.0ytL
                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostThreadPoolExecutorDepend
                public final ExecutorService getNormalThreadExecutor() {
                    ExecutorService executorServiceLJI;
                    ExecutorService executorService = C2126108Up.LIZ;
                    IClientSecurityService iClientSecurityService = (IClientSecurityService) ServiceManager.get().getService(IClientSecurityService.class);
                    return (iClientSecurityService == null || (executorServiceLJI = iClientSecurityService.LJI(executorService)) == null) ? executorService : executorServiceLJI;
                }
            };
            c1874950ytJ.LJIIIIZZ = new InterfaceC1055640dZq() { // from class: X.0dMT
                @Override // X.InterfaceC1055640dZq
                public final String LIZ(InterfaceC634840OvC interfaceC634840OvC) {
                    String str;
                    if (interfaceC634840OvC != null) {
                        return interfaceC634840OvC.getContainerID();
                    }
                    C1524340plo value = C1524340plo.LJI.getValue();
                    if (!(!((ArrayList) value.LIZIZ).isEmpty()) || (str = (String) C13LP.LJJLIIIJJI(value.LIZIZ)) == null) {
                        return "";
                    }
                    return str;
                }

                @Override // X.InterfaceC1055640dZq
                public final void LIZIZ(InterfaceC634840OvC interfaceC634840OvC, String str, List<String> list, List<? extends JSONObject> list2) {
                    KeyEvent.Callback view;
                    InterfaceC1541990qEH interfaceC1541990qEH;
                    C1537480q70 hybridContext;
                    C1075770e6J c1075770e6J;
                    if (Intrinsics.LJFF(str, EnumC1047340dMS.Closed.getActionType()) && interfaceC634840OvC != null && (view = interfaceC634840OvC.getView()) != null && (view instanceof InterfaceC1541990qEH) && (interfaceC1541990qEH = (InterfaceC1541990qEH) view) != null && (hybridContext = interfaceC1541990qEH.getHybridContext()) != null && (c1075770e6J = (C1075770e6J) hybridContext.LJFF(C1075770e6J.class)) != null) {
                        c1075770e6J.LJIIIZ(list, list2);
                    }
                }
            };
            c1874950ytJ.LJIIJ = new com.bytedance.sdk.xbridge.runtime.depend.IHostOpenDepend() { // from class: X.1BZm
                public static File LIZ(Context context) throws Throwable {
                    File file = C786450Ut9.LIZJ;
                    if (file != null && C786450Ut9.LJ) {
                        return file;
                    }
                    try {
                        C786450Ut9.LIZJ = context.getFilesDir();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        Context applicationContext = null;
                        try {
                            Class<?> cls = Class.forName("android.app.ActivityThread");
                            Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                            Field declaredField = cls.getDeclaredField("mInitialApplication");
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(objInvoke);
                            if (obj instanceof Application) {
                                applicationContext = ((Application) obj).getApplicationContext();
                                PrintStream printStream = System.out;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Application context obtained through ActivityThread: ");
                                sbLIZ.append(applicationContext);
                                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                            } else {
                                System.out.println("Error: mInitialApplication is not an instance of Application");
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            PrintStream printStream2 = System.out;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Error: ");
                            sbLIZ2.append(e.getMessage());
                            printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        if (applicationContext != null) {
                            C786450Ut9.LIZJ = applicationContext.getFilesDir();
                            C08RN.LIZ(applicationContext);
                        } else {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(th.getMessage());
                            sbLIZ3.append(":");
                            sbLIZ3.append(C08RN.LIZJ());
                            sbLIZ3.append(" applicationContext is null");
                            throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    }
                    return C786450Ut9.LIZJ;
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostOpenDepend
                public final Unit getGeckoInfo(String str, String str2, InterfaceC1889950zHV interfaceC1889950zHV) {
                    C443120HZe<Boolean, Long, Long> c443120HZeLIZJ = C1551910qUH.LIZJ(str, str2);
                    C1890100zHk c1890100zHk = new C1890100zHk(c443120HZeLIZJ.getFirst().booleanValue());
                    Long lLIZJ = C1550610qSB.LIZJ(str, str2);
                    if (lLIZJ != null && lLIZJ.longValue() != 0) {
                        c1890100zHk.LJ = EnumC992890bwd.OFFLINED.getValue();
                        c1890100zHk.LIZLLL = lLIZJ;
                    }
                    c1890100zHk.LIZIZ = c443120HZeLIZJ.getSecond();
                    Long third = c443120HZeLIZJ.getThird();
                    if (third != null) {
                        c1890100zHk.LIZJ = String.valueOf(third.longValue());
                    }
                    interfaceC1889950zHV.LIZ(c1890100zHk);
                    return Unit.LIZ;
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostOpenDepend
                public final void scanCode(InterfaceC634840OvC interfaceC634840OvC, boolean z, final InterfaceC1890170zHr interfaceC1890170zHr) {
                    Context context;
                    if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", "h5");
                        C20684815ws.LJIILLIIL("qr_code_scan_enter", c2344009Gk.LIZ);
                        InterfaceC19271510aP interfaceC19271510aP = new InterfaceC19271510aP() { // from class: X.10dO
                            @Override // X.InterfaceC19271510aP
                            public final String LIZ() {
                                return "";
                            }

                            @Override // X.InterfaceC19271510aP
                            public final String getName() {
                                return "bdx_host_open_depend_impl";
                            }

                            @Override // X.InterfaceC19271510aP
                            public final boolean LIZIZ(int i, String str) {
                                IBridgeScanHandler iBridgeScanHandlerLIZJ = BridgeScanHandlerImpl.LIZJ();
                                if (iBridgeScanHandlerLIZJ != null) {
                                    iBridgeScanHandlerLIZJ.LIZ(this);
                                }
                                InterfaceC1890170zHr interfaceC1890170zHr2 = interfaceC1890170zHr;
                                if (str == null) {
                                    str = "";
                                }
                                interfaceC1890170zHr2.onSuccess(str);
                                return true;
                            }
                        };
                        IBridgeScanHandler iBridgeScanHandlerLIZJ = BridgeScanHandlerImpl.LIZJ();
                        if (iBridgeScanHandlerLIZJ != null) {
                            iBridgeScanHandlerLIZJ.LIZIZ(interfaceC19271510aP);
                        }
                        IQRCodePermissionActivityStarter iQRCodePermissionActivityStarterLIZIZ = QRCodePermissionActivityStarter.LIZIZ();
                        if (iQRCodePermissionActivityStarterLIZIZ != null) {
                            iQRCodePermissionActivityStarterLIZIZ.LIZ(C0XS4.LIZ(context), z);
                            return;
                        }
                        return;
                    }
                    interfaceC1890170zHr.onFailure();
                }

                public static void LIZIZ(String str, String str2, boolean z, C09ZL c09zl, boolean z2) {
                    try {
                        C1551950qUL c1551950qULLJIIIZ = C1552050qUV.LJIIIZ(str2);
                        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                        optionCheckUpdateParams.setLazyUpdate(z2);
                        optionCheckUpdateParams.setFrom("jsb");
                        optionCheckUpdateParams.setListener(new C09ZI(c09zl, str, z2, str2));
                        optionCheckUpdateParams.setEnableDownloadAutoRetry(z);
                        optionCheckUpdateParams.setChannelUpdatePriority(3);
                        Map<String, List<CheckRequestBodyModel.TargetChannel>> mapLIZJ = C2097908Jt.LIZJ(new Pair(str2, Collections.singletonList(new CheckRequestBodyModel.TargetChannel(str))));
                        if (c1551950qULLJIIIZ != null) {
                            c1551950qULLJIIIZ.LIZ(null, mapLIZJ, optionCheckUpdateParams);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        c09zl.LIZ(e);
                    }
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostOpenDepend
                public final Unit updateGecko(String str, String str2, boolean z, C09ZL c09zl, boolean z2) throws Throwable {
                    List<String> list;
                    try {
                        if (z) {
                            LIZIZ(str2, str, z2, c09zl, true);
                        } else {
                            C844470XAv.LIZ.getClass();
                            File fileLIZ = LIZ(C844470XAv.LIZ());
                            C1553670qX7.LIZ.getClass();
                            new C0VSJ(fileLIZ, "offlineX");
                            if (C1550600qSA.LIZ(str, str2)) {
                                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                                UpdateNonLazyResourceSwitch.UpdateNonLazyResourceModel updateNonLazyResourceModel = UpdateNonLazyResourceSwitch.LIZ;
                                UpdateNonLazyResourceSwitch.UpdateNonLazyResourceModel updateNonLazyResourceModel2 = (UpdateNonLazyResourceSwitch.UpdateNonLazyResourceModel) settingsManagerLIZLLL.LJIIIIZZ("update_non_lazy_resource_switch", UpdateNonLazyResourceSwitch.UpdateNonLazyResourceModel.class, updateNonLazyResourceModel);
                                if (updateNonLazyResourceModel2 != null) {
                                    updateNonLazyResourceModel = updateNonLazyResourceModel2;
                                }
                                if (!updateNonLazyResourceModel.f69switch || ((list = updateNonLazyResourceModel.denyList) != null && list.contains(str2))) {
                                    c09zl.LIZLLL();
                                    return Unit.LIZ;
                                }
                            }
                            C1551330qTL.LIZ.getClass();
                            if (C1551330qTL.LJIIIIZZ(str, str2)) {
                                SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
                                UpdateGeckoWhiteListSettings.UpdateGeckoWhiteListModel updateGeckoWhiteListModel = UpdateGeckoWhiteListSettings.LIZ;
                                UpdateGeckoWhiteListSettings.UpdateGeckoWhiteListModel updateGeckoWhiteListModel2 = (UpdateGeckoWhiteListSettings.UpdateGeckoWhiteListModel) settingsManagerLIZLLL2.LJIIIIZZ("update_gecko_white_list", UpdateGeckoWhiteListSettings.UpdateGeckoWhiteListModel.class, updateGeckoWhiteListModel);
                                if (updateGeckoWhiteListModel2 != null) {
                                    updateGeckoWhiteListModel = updateGeckoWhiteListModel2;
                                }
                                if (updateGeckoWhiteListModel.whiteList.contains(str2)) {
                                    C1550610qSB.LIZIZ(str, str2);
                                    c09zl.LIZJ();
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("access_key", str);
                                    jSONObject.put("channel", str2);
                                    jSONObject.put("allow_update", 1);
                                    C20684815ws.LJIJ("update_blocked_gecko", jSONObject);
                                } else {
                                    c09zl.LIZIZ();
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("access_key", str);
                                    jSONObject2.put("channel", str2);
                                    jSONObject2.put("allow_update", 0);
                                    C20684815ws.LJIJ("update_blocked_gecko", jSONObject2);
                                }
                            } else {
                                LIZIZ(str2, str, z2, c09zl, false);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        c09zl.LIZ(e);
                    }
                    return Unit.LIZ;
                }
            };
            c1874950ytJ.LJIIJJI = new InterfaceC20273114Uf() { // from class: X.14UP
                @Override // X.InterfaceC20273114Uf
                public final void LIZ(Context context, C14UW c14uw, C14UQ c14uq) {
                    EnumC20272714Ub enumC20272714Ub;
                    boolean z;
                    String[] strArr;
                    boolean z2;
                    boolean z3;
                    C1877130ywp.LIZ.getClass();
                    Activity activityLIZ = C1877130ywp.LIZ(context);
                    if (activityLIZ == null) {
                        c14uq.onFailure(0, "Context not provided");
                        return;
                    }
                    WeakReference weakReference = new WeakReference(activityLIZ);
                    C20272914Ud c20272914Ud = new C20272914Ud(activityLIZ, c14uq, weakReference);
                    Activity activityLIZ2 = C0XS4.LIZ((Context) weakReference.get());
                    if (!C142C.LIZ(activityLIZ2, c20272914Ud)) {
                        c20272914Ud.LIZ(0, "Failed to find proper activity");
                        return;
                    }
                    WeakReference weakReference2 = new WeakReference(activityLIZ2);
                    String str = (String) ListProtector.get(c14uw.LIZ, 0);
                    String str2 = c14uw.LIZIZ;
                    EnumC20272714Ub.Companion.getClass();
                    if (str != null && str2 != null) {
                        Locale locale = Locale.ROOT;
                        if (Intrinsics.LJFF(str.toLowerCase(locale), "image") && Intrinsics.LJFF(str2.toLowerCase(locale), "camera")) {
                            enumC20272714Ub = EnumC20272714Ub.TAKE_PHOTO;
                        } else if (Intrinsics.LJFF(str.toLowerCase(locale), "image") && Intrinsics.LJFF(str2.toLowerCase(locale), "album")) {
                            enumC20272714Ub = EnumC20272714Ub.PICK_PHOTO_FROM_ALBUM;
                        } else if (Intrinsics.LJFF(str.toLowerCase(locale), "video") && Intrinsics.LJFF(str2.toLowerCase(locale), "camera")) {
                            enumC20272714Ub = EnumC20272714Ub.TAKE_VIDEO;
                        } else if (Intrinsics.LJFF(str.toLowerCase(locale), "video") && Intrinsics.LJFF(str2.toLowerCase(locale), "album")) {
                            enumC20272714Ub = EnumC20272714Ub.PICK_VIDEO_FROM_ALBUM;
                        } else {
                            enumC20272714Ub = EnumC20272714Ub.UNSUPPORTED;
                        }
                    } else {
                        enumC20272714Ub = EnumC20272714Ub.UNSUPPORTED;
                    }
                    if (enumC20272714Ub == EnumC20272714Ub.UNSUPPORTED) {
                        c20272914Ud.LIZ(-3, "Invalid fileType and sourceType in params");
                        return;
                    }
                    int i = C20272614Ua.LIZ[enumC20272714Ub.ordinal()];
                    String str3 = "android.permission.READ_MEDIA_VIDEO";
                    String str4 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED";
                    String str5 = "android.permission.WRITE_EXTERNAL_STORAGE";
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    return;
                                }
                                final C14UB c14ub = new C14UB(weakReference2, c20272914Ud);
                                c20272914Ud.LL = c14ub;
                                int i2 = c14uw.LIZJ;
                                c14ub.LIZJ = i2;
                                if (!c14uw.LIZLLL && !c14uw.LJIIL) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                c14ub.LIZLLL = z2;
                                c14ub.LJII = c14uw.LJIILIIL;
                                c14ub.LJFF = c14uw.LJIIIZ;
                                int i3 = c14uw.LJIIJJI;
                                int i4 = c14uw.LJIIJ;
                                if (i3 * i4 != 0) {
                                    c14ub.LJI = (i3 * 1.0f) / i4;
                                }
                                if (i2 <= 1 && !c14uw.LJIILL) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                c14ub.LJ = c14uw.LJIIL;
                                c14ub.LJIIIIZZ = c14uw.LJIILJJIL;
                                int i5 = c14uw.LJI;
                                if (i5 == 0) {
                                    i5 = 216;
                                }
                                C14UB.LJIIJ = i5;
                                int i6 = c14uw.LJII;
                                if (i6 == 0) {
                                    i6 = 384;
                                }
                                C14UB.LJIIJJI = i6;
                                C14UB.LJIIL = c14uw.LJIILLIIL;
                                C14UB.LJIILIIL = c14uw.LJIIIIZZ;
                                if (z3) {
                                    final Activity activity = (Activity) weakReference2.get();
                                    int i7 = Build.VERSION.SDK_INT;
                                    if (i7 >= 33) {
                                        str5 = "android.permission.READ_MEDIA_IMAGES";
                                    }
                                    if (C838410Wul.LIZ(activity, str5) == 0) {
                                        c14ub.LIZIZ(activity);
                                        return;
                                    }
                                    if (i7 >= 34 && C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                                        c14ub.LIZIZ(activity);
                                        return;
                                    }
                                    TokenCert tokenCertWith = TokenCert.Companion.with("bpea-x_pick_photos_write_storage_permission");
                                    String[] strArr2 = new String[2];
                                    strArr2[0] = str5;
                                    if (i7 < 34) {
                                        str4 = null;
                                    }
                                    strArr2[1] = str4;
                                    C19771812Xk.LIZIZ(activity, tokenCertWith, (String[]) ((ArrayList) C13LQ.LJIJI(strArr2)).toArray(new String[0]), new InterfaceC19772112Xn() { // from class: X.14UC
                                        @Override // X.InterfaceC19772112Xn
                                        public final void LIZ(int[] iArr, String[] strArr3) {
                                            if (iArr.length != 0) {
                                                if (iArr[0] == 0) {
                                                    c14ub.LIZIZ(activity);
                                                    return;
                                                }
                                                if (Build.VERSION.SDK_INT >= 34 && iArr.length == 2 && C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                                                    c14ub.LIZIZ(activity);
                                                    return;
                                                }
                                                if (c14ub.LJIIIIZZ == 0) {
                                                    C1233040iBy c1233040iBy = new C1233040iBy(activity);
                                                    c1233040iBy.LIZJ(activity.getString(2131839204));
                                                    c1233040iBy.LIZLLL();
                                                }
                                                c14ub.LIZIZ.LIZ(-6, "Storage permission denied");
                                            }
                                        }
                                    });
                                    return;
                                }
                                final Activity activity2 = (Activity) weakReference2.get();
                                int i8 = Build.VERSION.SDK_INT;
                                if (i8 >= 33) {
                                    str5 = "android.permission.READ_MEDIA_IMAGES";
                                }
                                if (C838410Wul.LIZ(activity2, str5) == 0) {
                                    C14UB.LIZLLL(activity2);
                                    return;
                                }
                                if (i8 >= 34 && C838410Wul.LIZ(activity2, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                                    C14UB.LIZLLL(activity2);
                                    return;
                                }
                                TokenCert tokenCertWith2 = TokenCert.Companion.with("bpea-x_pick_photos_write_storage_2_permission");
                                String[] strArr3 = new String[2];
                                strArr3[0] = str5;
                                if (i8 < 34) {
                                    str4 = null;
                                }
                                strArr3[1] = str4;
                                C19771812Xk.LIZIZ(activity2, tokenCertWith2, (String[]) ((ArrayList) C13LQ.LJIJI(strArr3)).toArray(new String[0]), new InterfaceC19772112Xn() { // from class: X.14UD
                                    @Override // X.InterfaceC19772112Xn
                                    public final void LIZ(int[] iArr, String[] strArr4) {
                                        if (iArr.length != 0) {
                                            if (iArr[0] == 0) {
                                                C14UB c14ub2 = c14ub;
                                                Activity activity3 = activity2;
                                                c14ub2.getClass();
                                                C14UB.LIZLLL(activity3);
                                                return;
                                            }
                                            if (Build.VERSION.SDK_INT >= 34 && iArr.length == 2 && C838410Wul.LIZ(activity2, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                                                C14UB c14ub3 = c14ub;
                                                Activity activity4 = activity2;
                                                c14ub3.getClass();
                                                C14UB.LIZLLL(activity4);
                                                return;
                                            }
                                            c14ub.LIZIZ.LIZ(-6, "Storage permission denied");
                                        }
                                    }
                                });
                                return;
                            }
                            final C14UN c14un = new C14UN(weakReference2, c20272914Ud);
                            c20272914Ud.LL = c14un;
                            final Activity activity3 = (Activity) weakReference2.get();
                            if (activity3 == null) {
                                c20272914Ud.LIZ(0, "Activity not found");
                                return;
                            }
                            if (!activity3.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
                                c20272914Ud.LIZ(0, "Camera feature not found");
                                return;
                            }
                            if (new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(activity3.getPackageManager()) == null) {
                                c20272914Ud.LIZ(0, "Camera app not found");
                                return;
                            }
                            c14un.LJI = c14uw.LJFF;
                            if (!c14uw.LIZLLL && !c14uw.LJIIL) {
                                z = false;
                            } else {
                                z = true;
                            }
                            c14un.LJIIIIZZ = z;
                            c14un.LJIIJJI = c14uw.LJIILIIL;
                            c14un.LJIIIZ = c14uw.LJIIL;
                            c14un.LJIIJ = c14uw.LJ;
                            C14UN.LJIIL = c14uw.LJIILLIIL;
                            C14UN.LJIILIIL = c14uw.LJI;
                            C14UN.LJIILJJIL = c14uw.LJII;
                            C14UN.LJIILL = c14uw.LJIIIIZZ;
                            boolean zLIZIZ = C14UN.LIZIZ(activity3, "android.permission.CAMERA");
                            if (!c14un.LJIIJ ? zLIZIZ : !(Build.VERSION.SDK_INT < 33 ? !zLIZIZ || !C14UN.LIZIZ(activity3, "android.permission.WRITE_EXTERNAL_STORAGE") : !zLIZIZ || !C14UN.LIZIZ(activity3, "android.permission.READ_MEDIA_IMAGES"))) {
                                c14un.LIZ(activity3);
                                return;
                            }
                            if (c14un.LJIIJ) {
                                int i9 = Build.VERSION.SDK_INT;
                                if (i9 >= 33) {
                                    String[] strArr4 = new String[3];
                                    strArr4[0] = "android.permission.CAMERA";
                                    strArr4[1] = "android.permission.READ_MEDIA_IMAGES";
                                    if (i9 < 34) {
                                        str4 = null;
                                    }
                                    strArr4[2] = str4;
                                    strArr = (String[]) ((ArrayList) C13LQ.LJIJI(strArr4)).toArray(new String[0]);
                                } else {
                                    strArr = new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
                                }
                            } else {
                                strArr = new String[]{"android.permission.CAMERA"};
                            }
                            C19771812Xk.LIZIZ(activity3, TokenCert.Companion.with("bpea-x_take_photo_camera_and_write_storage_permission"), strArr, new InterfaceC19772112Xn() { // from class: X.14UY
                                @Override // X.InterfaceC19772112Xn
                                public final void LIZ(int[] iArr, String[] strArr5) {
                                    boolean z4;
                                    if (strArr5.length != 0) {
                                        for (int i10 : iArr) {
                                            if (i10 == 0) {
                                            }
                                        }
                                        c14un.LIZ(activity3);
                                        return;
                                    }
                                    if (Build.VERSION.SDK_INT >= 34 && iArr.length == 3) {
                                        C14UN c14un2 = c14un;
                                        Activity activity4 = activity3;
                                        c14un2.getClass();
                                        if (C14UN.LIZIZ(activity4, "android.permission.CAMERA")) {
                                            C14UN c14un3 = c14un;
                                            Activity activity5 = activity3;
                                            c14un3.getClass();
                                            if (C14UN.LIZIZ(activity5, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) {
                                                c14un.LIZ(activity3);
                                                return;
                                            }
                                        }
                                    }
                                    if (strArr5.length == 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if ((!z4) && iArr[0] == -1) {
                                        c14un.LIZIZ.LIZ(-6, "Camera permission denied");
                                    } else {
                                        if (strArr5.length == 0 || iArr.length != 2 || iArr[1] != -1) {
                                            return;
                                        }
                                        c14un.LIZIZ.LIZ(-6, "Storage permission denied");
                                    }
                                }
                            });
                            return;
                        }
                        final C14UO c14uo = new C14UO(weakReference2, c20272914Ud);
                        c20272914Ud.LL = c14uo;
                        c14uo.LIZJ = c14uw.LJ;
                        final AwS431S0200000_30 awS431S0200000_30 = new AwS431S0200000_30(c14uo, c14uw, 54);
                        final Activity activity4 = (Activity) weakReference2.get();
                        if (activity4 == null) {
                            return;
                        }
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 < 33) {
                            str3 = "android.permission.WRITE_EXTERNAL_STORAGE";
                        }
                        if (C14W2.LIZ(activity4) == 0 && C838410Wul.LIZ(activity4, str3) == 0) {
                            awS431S0200000_30.invoke();
                            return;
                        }
                        if (C14W2.LIZ(activity4) == 0 && i10 >= 34 && C838410Wul.LIZ(activity4, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                            awS431S0200000_30.invoke();
                            return;
                        }
                        TokenCert tokenCertWith3 = TokenCert.Companion.with("bpea-x_take_video_camera_write_storage_permission");
                        String[] strArr5 = new String[3];
                        strArr5[0] = "android.permission.CAMERA";
                        strArr5[1] = str3;
                        if (i10 < 34) {
                            str4 = null;
                        }
                        strArr5[2] = str4;
                        C19771812Xk.LIZIZ(activity4, tokenCertWith3, (String[]) ((ArrayList) C13LQ.LJIJI(strArr5)).toArray(new String[0]), new InterfaceC19772112Xn() { // from class: X.14US
                            @Override // X.InterfaceC19772112Xn
                            public final void LIZ(int[] iArr, String[] strArr6) {
                                if (iArr[0] == 0 && iArr[1] == 0) {
                                    awS431S0200000_30.invoke();
                                    return;
                                }
                                if (Build.VERSION.SDK_INT >= 34 && iArr.length == 3 && C838410Wul.LIZ(activity4, "android.permission.CAMERA") == 0 && C838410Wul.LIZ(activity4, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                                    awS431S0200000_30.invoke();
                                } else {
                                    c14uo.LIZIZ.LIZ(-6, "Permission rejected");
                                }
                            }
                        });
                        return;
                    }
                    final C14UJ c14uj = new C14UJ(weakReference2, c20272914Ud);
                    c20272914Ud.LL = c14uj;
                    final AwS547S0100000_3 awS547S0100000_3 = new AwS547S0100000_3(c14uj, 152);
                    final Activity activity5 = (Activity) weakReference2.get();
                    if (activity5 == null) {
                        return;
                    }
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 < 33) {
                        str3 = "android.permission.WRITE_EXTERNAL_STORAGE";
                    }
                    if (C838410Wul.LIZ(activity5, str3) == 0) {
                        awS547S0100000_3.invoke();
                        return;
                    }
                    if (i11 >= 34 && C838410Wul.LIZ(activity5, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                        awS547S0100000_3.invoke();
                        return;
                    }
                    TokenCert tokenCertWith4 = TokenCert.Companion.with("bpea-x_pick_videos_write_storage_permision");
                    String[] strArr6 = new String[2];
                    strArr6[0] = str3;
                    if (i11 < 34) {
                        str4 = null;
                    }
                    strArr6[1] = str4;
                    C19771812Xk.LIZIZ(activity5, tokenCertWith4, (String[]) ((ArrayList) C13LQ.LJIJI(strArr6)).toArray(new String[0]), new InterfaceC19772112Xn() { // from class: X.14UK
                        @Override // X.InterfaceC19772112Xn
                        public final void LIZ(int[] iArr, String[] strArr7) {
                            if (iArr[0] == 0) {
                                awS547S0100000_3.invoke();
                            } else if (Build.VERSION.SDK_INT >= 34 && iArr.length == 2 && C838410Wul.LIZ(activity5, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                                awS547S0100000_3.invoke();
                            } else {
                                c14uj.LIZIZ.LIZ(-6, "Permission not granted");
                            }
                        }
                    });
                }
            };
            synchronized (c1874950ytJ) {
                if (C1874950ytJ.LJIIL == null) {
                    C1874950ytJ.LJIIL = c1874950ytJ;
                }
            }
        }
        C1063910dnB.LIZ("true", "BDXBridgeServiceInitializer_finish");
        C1063910dnB.LIZ("true", "XBridgeServiceInitializer_finish");
    }
}
