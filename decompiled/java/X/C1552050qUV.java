package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.ss.android.ugc.aweme.launcher.service.configcenter.IAwemeConfigCenterApi;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.utils.gecko.GeckoDownloadStrategyWhiteListSettings;
import com.ss.android.ugc.aweme.web.GeckoXClientManager;
import com.ss.android.ugc.aweme.web.IGeckoXClientManager;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qUV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552050qUV {
    public static Context LIZ;
    public static final C1552300qUu LIZIZ;
    public static final C1552340qUy LIZJ;
    public static HashMap<String, C1551640qTq> LIZLLL;
    public static boolean LJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0qUu] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0qUy] */
    static {
        ((CopyOnWriteArrayList) C1553130qWF.LIZIZ).add(new InterfaceC1553210qWN() { // from class: X.0qWI
            @Override // X.InterfaceC1553210qWN
            public final void LIZ() {
            }

            @Override // X.InterfaceC1553210qWN
            public final void e() {
            }

            @Override // X.InterfaceC1553210qWN
            public final void w() {
            }

            @Override // X.InterfaceC1553210qWN
            public final void LIZIZ(Object... objArr) {
                Context context = C1552050qUV.LIZ;
            }
        });
        C1553130qWF.LIZ = true;
        LIZIZ = new InterfaceC1551450qTX() { // from class: X.0qUu
            public final IAwemeConfigCenterApi LIZ = (IAwemeConfigCenterApi) ServiceManager.get().getService(IAwemeConfigCenterApi.class);

            @Override // X.InterfaceC1551450qTX
            public final void LIZ(final String str, final JSONObject jSONObject) {
                if (!TextUtils.isEmpty(str) && this.LIZ.isInitialized()) {
                    if (str.equals("geckosdk_update_aggr_stats")) {
                        try {
                            jSONObject.put("idc", C2273401Dyc.LIZLLL);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    C1326370kcV.LIZ(new Function0<Unit>() { // from class: X.0qW8
                        @Override // kotlin.jvm.functions.Function0
                        public final Unit invoke() {
                            AppLogNewUtils.onEventV3(str, jSONObject);
                            return Unit.LIZ;
                        }
                    });
                }
            }
        };
        LIZJ = new GeckoGlobalConfig.IMonitorConfig() { // from class: X.0qUy
            @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
            public final String getMonitorHost() {
                return "https://mon.isnssdk.com";
            }

            @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
            public final String getPackageId() {
                return null;
            }

            @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
            public final boolean isOversea() {
                return true;
            }

            @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
            public final String getChannel() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LJIILL;
            }

            @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
            public final Map<String, String> getCommonParams() {
                HashMap map = new HashMap();
                C0XDN.LIZJ(map, true);
                map.remove("mac_address");
                map.remove("uuid");
                map.remove("openudid");
                map.remove("aliyun_uuid");
                map.remove("oaid");
                return map;
            }

            @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
            public final String getUpdateVersionCode() {
                C844470XAv.LIZ.getClass();
                return String.valueOf(C844470XAv.LIZLLL());
            }
        };
    }

    public static Context LJI() {
        if (LIZ == null) {
            C844470XAv.LIZ.getClass();
            LIZ = C844470XAv.LIZ();
        }
        return LIZ;
    }

    public static GeckoGlobalConfig.ENVType LJII() {
        "online".equals(LJIIJ());
        return GeckoGlobalConfig.ENVType.PROD;
    }

    public static String LJIIJ() {
        return Keva.getRepo("hybrid_debug_settings").getString("gecko_deployment", ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe() ? "boe" : "local_test");
    }

    public static HashMap<String, C1551640qTq> LJIILIIL() {
        GeckoDownloadStrategyWhiteListSettings.List[] listArr;
        if (LIZLLL == null) {
            LIZLLL = new HashMap<>();
            try {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                GeckoDownloadStrategyWhiteListSettings.GeckoDownloadStrategyWhiteListModel geckoDownloadStrategyWhiteListModel = GeckoDownloadStrategyWhiteListSettings.LIZ;
                GeckoDownloadStrategyWhiteListSettings.GeckoDownloadStrategyWhiteListModel geckoDownloadStrategyWhiteListModel2 = (GeckoDownloadStrategyWhiteListSettings.GeckoDownloadStrategyWhiteListModel) settingsManagerLIZLLL.LJIIIIZZ("GeckoDownloadStrategyWhiteList", GeckoDownloadStrategyWhiteListSettings.GeckoDownloadStrategyWhiteListModel.class, geckoDownloadStrategyWhiteListModel);
                if (geckoDownloadStrategyWhiteListModel2 != null) {
                    geckoDownloadStrategyWhiteListModel = geckoDownloadStrategyWhiteListModel2;
                }
                if (geckoDownloadStrategyWhiteListModel != null && (listArr = geckoDownloadStrategyWhiteListModel.list) != null && listArr.length > 0) {
                    for (GeckoDownloadStrategyWhiteListSettings.List list : listArr) {
                        C1551640qTq c1551640qTq = new C1551640qTq();
                        c1551640qTq.LIZ = Arrays.asList(list.groups);
                        c1551640qTq.LIZIZ = Arrays.asList(list.channels);
                        LIZLLL.put(list.ak, c1551640qTq);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return LIZLLL;
    }

    public static void LJIJ() {
        GeckoGlobalConfig geckoGlobalConfig;
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        c1551940qUK.LIZIZ();
        if (TextUtils.isEmpty(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId) || (geckoGlobalConfig = c1551940qUK.LIZLLL) == null) {
            return;
        }
        geckoGlobalConfig.setDeviceId(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId);
        Common common = c1551940qUK.LIZJ;
        if (common != null) {
            common.deviceId = strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId;
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [X.0eJ7] */
    public static void LIZJ() {
        String strLJIILJJIL;
        AbstractC1552040qUU c1024460clY;
        C1551950qUL c1551950qULLJIILL = LJIILL();
        if (c1551950qULLJIILL != null) {
            I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
            if (i18nServiceApi == null || i18nServiceApi.LIZ() == null) {
                strLJIILJJIL = "";
            } else {
                I18nManagerServiceApi i18nManagerServiceApiLIZ = i18nServiceApi.LIZ();
                C844470XAv.LIZ.getClass();
                strLJIILJJIL = i18nManagerServiceApiLIZ.LJIILJJIL(C844470XAv.LIZ());
            }
            if (TextUtils.isEmpty(strLJIILJJIL)) {
                return;
            }
            String lowerCase = strLJIILJJIL.toLowerCase(Locale.ROOT);
            if (i18nServiceApi == null || i18nServiceApi.LIZ() == null) {
                c1024460clY = new C1024460clY();
            } else {
                C0W86 c0w86 = C0W86.LIZ;
                I18nManagerServiceApi i18nManagerServiceApiLIZ2 = i18nServiceApi.LIZ();
                C844470XAv.LIZ.getClass();
                final Locale localeLJIJJLI = i18nManagerServiceApiLIZ2.LJIJJLI(C844470XAv.LIZ());
                final C1024460clY c1024460clY2 = new C1024460clY();
                c0w86.getClass();
                final String accessKey = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAccessKey();
                final String strLIZIZ = NxRewordManager.LJIIIZ ? C818130W7n.LIZIZ(localeLJIJJLI) : "";
                if (!NxRewordManager.LJIIIZ || !C818130W7n.LIZ()) {
                    C1550610qSB.LIZ(accessKey, strLIZIZ);
                }
                final ?? r11 = new InterfaceC1083720eJ8() { // from class: X.0eJ7
                    @Override // X.InterfaceC1083720eJ8
                    public final void LIZ(int i, String str, Throwable th) throws JSONException {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("StringPatchLoader gecko update Failed: ");
                        sbLIZ.append(th.getMessage());
                        sbLIZ.append(", channel: ");
                        sbLIZ.append(str);
                        sbLIZ.append(", failReason: ");
                        sbLIZ.append(i);
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (i != -1) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("event", "reword_gecko_update_file_event");
                            jSONObject.put("channel", str);
                            jSONObject.put("file_update_status", i);
                        }
                    }
                };
                c1024460clY = new AbstractC1552040qUU() { // from class: X.0qUI
                    public boolean LIZ;

                    @Override // X.AbstractC1552040qUU
                    public final void LJIJJ() {
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJIJJ();
                        }
                        String anywhereChannelPath = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAnywhereChannelPath(strLIZIZ);
                        C0W86 c0w862 = C0W86.LIZ;
                        Locale locale = localeLJIJJLI;
                        boolean z = this.LIZ;
                        c0w862.getClass();
                        C0W86.LIZ(locale, anywhereChannelPath, z);
                    }

                    @Override // X.AbstractC1552040qUU, X.InterfaceC1551180qT6
                    public final void LIZ(String str) {
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LIZ(str);
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJFF(UpdatePackage updatePackage) {
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJFF(updatePackage);
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIIJ(String str) {
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJIIJ(str);
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIIL(UpdatePackage updatePackage) {
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJIIL(updatePackage);
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIILJJIL(UpdatePackage updatePackage) {
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJIILJJIL(updatePackage);
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIILL(UpdatePackage updatePackage) {
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJIILL(updatePackage);
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIILLIIL(LocalPackageModel localPackageModel) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onLocalNewestVersion:channel:");
                        sbLIZ.append(localPackageModel.getChannel());
                        sbLIZ.append(" version:");
                        sbLIZ.append(Long.valueOf(localPackageModel.getLatestVersion()));
                        C2188811AlT.LIZIZ(sbLIZ);
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJIILLIIL(localPackageModel);
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIJJLI(UpdatePackage updatePackage) {
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJIJJLI(updatePackage);
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJ(UpdatePackage updatePackage, Throwable th) {
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJ(updatePackage, th);
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJII(Throwable th, Map map) {
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJII(th, map);
                        }
                        InterfaceC1083720eJ8 interfaceC1083720eJ8 = r11;
                        String str = strLIZIZ;
                        if (th == null) {
                            th = new Throwable("geckox checkServerVersion failed", th);
                        }
                        interfaceC1083720eJ8.LIZ(-2, str, th);
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIIIIZZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
                        List<UpdatePackage> list;
                        List<Pair<String, Long>> list2;
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJIIIIZZ(map, map2);
                        }
                        if (map != null && (list2 = map.get(accessKey)) != null) {
                            String str = strLIZIZ;
                            Iterator<Pair<String, Long>> it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Pair<String, Long> next = it2.next();
                                if (Intrinsics.LJFF(next.first, str)) {
                                    if (next != null) {
                                        return;
                                    }
                                }
                            }
                        }
                        if (map2 != null && (list = map2.get(accessKey)) != null) {
                            String str2 = strLIZIZ;
                            Iterator<UpdatePackage> it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                UpdatePackage next2 = it3.next();
                                if (Intrinsics.LJFF(next2.getChannel(), str2)) {
                                    if (next2 != null) {
                                        return;
                                    }
                                }
                            }
                        }
                        r11.LIZ(-1, strLIZIZ, new Throwable("invalid channel"));
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIIJJI(UpdatePackage updatePackage, Throwable th) {
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJIIJJI(updatePackage, th);
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIIZILJ(UpdatePackage updatePackage, EnumC0335009t enumC0335009t) {
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJIIZILJ(updatePackage, enumC0335009t);
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJIJ(updatePackage, th);
                        }
                        InterfaceC1083720eJ8 interfaceC1083720eJ8 = r11;
                        String str = strLIZIZ;
                        if (th == null) {
                            th = new Throwable("geckox update failed", th);
                        }
                        interfaceC1083720eJ8.LIZ(1, str, th);
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIJI(String str, Throwable th) {
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJIJI(str, th);
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIL(long j, UpdatePackage updatePackage) {
                        String channel;
                        String channel2;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onUpdateSuccess:channel:");
                        String channel3 = null;
                        if (updatePackage != null) {
                            channel = updatePackage.getChannel();
                        } else {
                            channel = null;
                        }
                        sbLIZ.append(channel);
                        sbLIZ.append(" version:");
                        sbLIZ.append(j);
                        C2188811AlT.LIZIZ(sbLIZ);
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJIL(j, updatePackage);
                        }
                        if (updatePackage != null) {
                            channel2 = updatePackage.getChannel();
                        } else {
                            channel2 = null;
                        }
                        if (Intrinsics.LJFF(channel2, strLIZIZ)) {
                            IMainService iMainService = (IMainService) ServiceManager.get().getService(IMainService.class);
                            if (updatePackage != null) {
                                channel3 = updatePackage.getChannel();
                            }
                            String anywhereChannelPath = iMainService.getAnywhereChannelPath(channel3);
                            this.LIZ = true;
                            C0W86 c0w862 = C0W86.LIZ;
                            Locale locale = localeLJIJJLI;
                            c0w862.getClass();
                            C0W86.LIZ(locale, anywhereChannelPath, true);
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJJ(long j, String str) {
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJJ(j, str);
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJI(int i, Throwable th, Map map) {
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJI(i, th, map);
                        }
                        r11.LIZ(2, strLIZIZ, th);
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIIIZ(Map<String, ? extends List<? extends Pair<String, Long>>> map, Map<String, ? extends List<? extends UpdatePackage>> map2, C1551680qTu c1551680qTu) {
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJIIIZ(map, map2, c1551680qTu);
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIILIIL(UpdatePackage updatePackage, long j, long j2) {
                        AbstractC1552040qUU abstractC1552040qUU = c1024460clY2;
                        if (abstractC1552040qUU != null) {
                            abstractC1552040qUU.LJIILIIL(updatePackage, j, j2);
                        }
                    }
                };
            }
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setListener(c1024460clY);
            HashMap map = new HashMap();
            C844470XAv.LIZ.getClass();
            String str = C844470XAv.LJII;
            if (str == null) {
                str = null;
            }
            map.put("release_build", str);
            HashMap map2 = new HashMap();
            map2.put(((IMainService) ServiceManager.get().getService(IMainService.class)).getAccessKey(), map);
            optionCheckUpdateParams.setCustomParam(map2);
            c1551950qULLJIILL.LIZ(lowerCase, null, optionCheckUpdateParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0118 A[ADDED_TO_REGION, REMOVE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.geckox.GeckoGlobalConfig LJIIIIZZ() {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1552050qUV.LJIIIIZZ():com.bytedance.geckox.GeckoGlobalConfig");
    }

    public static C1551950qUL LJIIJJI() {
        IGeckoXClientManager iGeckoXClientManagerLJ;
        String strLIZ = C1553670qX7.LIZ();
        if (TextUtils.isEmpty(strLIZ) || (iGeckoXClientManagerLJ = GeckoXClientManager.LJ()) == null) {
            return null;
        }
        C1551950qUL c1551950qULLIZIZ = iGeckoXClientManagerLJ.LIZIZ(strLIZ);
        if (c1551950qULLIZIZ != null) {
            return c1551950qULLIZIZ;
        }
        C1551950qUL c1551950qULLJIILLIIL = LJIILLIIL(strLIZ);
        iGeckoXClientManagerLJ.LIZ(strLIZ, c1551950qULLJIILLIIL);
        return c1551950qULLJIILLIIL;
    }

    public static C1551950qUL LJIILL() {
        String strLIZ = C1553670qX7.LIZ();
        if (TextUtils.isEmpty(strLIZ)) {
            return null;
        }
        return LJIIIZ(strLIZ);
    }

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

    public static String LIZLLL(String str) {
        return LJ(C1553670qX7.LIZ(), str);
    }

    public static C1551950qUL LJIIIZ(String str) {
        IGeckoXClientManager iGeckoXClientManagerLJ = GeckoXClientManager.LJ();
        if (iGeckoXClientManagerLJ != null) {
            C1551950qUL c1551950qULLIZLLL = iGeckoXClientManagerLJ.LIZLLL(str);
            if (c1551950qULLIZLLL == null) {
                C1551950qUL c1551950qULLJIILLIIL = LJIILLIIL(str);
                iGeckoXClientManagerLJ.LIZJ(str, c1551950qULLJIILLIIL);
                return c1551950qULLJIILLIIL;
            }
            return c1551950qULLIZLLL;
        }
        return null;
    }

    public static C1551950qUL LJIILLIIL(String str) {
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        if (TextUtils.isEmpty(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId)) {
            return null;
        }
        C1553670qX7.LIZ.getClass();
        C0VSJ c0vsjLIZLLL = C1553670qX7.LIZLLL();
        try {
            C1537040q6I c1537040q6I = new C1537040q6I(LJI());
            c1537040q6I.LJIIIZ = C1553670qX7.LIZIZ();
            C844470XAv.LIZ.getClass();
            c1537040q6I.LIZJ(C844470XAv.LJIIJ);
            c1537040q6I.LJII = C844470XAv.LIZJ();
            LJI();
            c1537040q6I.LIZ = new GeckoXNetImpl();
            c1537040q6I.LJ = LIZIZ;
            c1537040q6I.LIZIZ(str);
            c1537040q6I.LIZ(str);
            c1537040q6I.LJIIJJI = C2222691Bz1.LIZIZ();
            c1537040q6I.LJIIIIZZ = strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId;
            c1537040q6I.LJIIJ = c0vsjLIZLLL;
            return C1551950qUL.LIZLLL(new C1551530qTf(c1537040q6I));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static boolean LJIIZILJ(String str) {
        return LIZIZ(C1553670qX7.LIZ(), str);
    }

    public static boolean LIZIZ(String str, String str2) {
        C1553670qX7.LIZ.getClass();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && LJIIL(str, str2) != null) {
            return true;
        }
        return false;
    }

    public static String LJ(String str, String str2) {
        C1553670qX7.LIZ.getClass();
        return LJFF("offlineX", str, str2);
    }

    public static Long LJIIL(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return C1550610qSB.LIZJ(str, str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1551950qUL LJIILJJIL(java.lang.String r14, X.InterfaceC1551300qTI r15) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1552050qUV.LJIILJJIL(java.lang.String, X.0qTI):X.0qUL");
    }

    public static String LJFF(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            if (TextUtils.isEmpty(str)) {
                str = "gecko_offline_res_x";
            }
            if (str3.indexOf("/") == 0) {
                str3 = str3.substring(1);
            }
            if (str3.lastIndexOf("/") == str3.length() - 1) {
                str3 = str3.substring(0, str3.lastIndexOf("/"));
            }
            new C0VSJ(LIZ(LJI()), str);
            return C1550610qSB.LIZIZ(str2, str3);
        }
        return null;
    }
}
