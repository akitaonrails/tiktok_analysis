package X;

import com.bytedance.crash.Npth;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.OkHttp3TTPSandBoxInterceptor;
import com.bytedance.helios.network.SandboxBridge;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.tnc.TNCManager;
import com.orbu.core.TTKOrbu;
import com.orbu.core.adapter.TTKNetworkRequest;
import com.orbu.core.adapter.TTKResponse;
import com.orbu.core.adapter.TTKResponseKt;
import com.orbu.core.adapter.TTKSDKRequest;
import com.orbu.core.api.INetworkHandler;
import com.orbu.core.impl.TTKDowngradeOrbuDelegate;
import com.orbu.core.impl.TTPOrbuDelegate;
import com.orbu.core.init.HardBlockConfig;
import com.orbu.core.init.HardBlockConfigManager;
import com.orbu.core.init.TTKNativeNetworkManager;
import com.orbu.core.logger.SandboxBootLogger;
import com.ss.android.ugc.aweme.compliance.sandbox.api.experiment.SandboxApp2AppSkipListSettings;
import com.ss.android.ugc.aweme.compliance.sandbox.network.OrbuSandboxOkHttpInterceptor;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.compliance.sandbox.offline.IComplianceSandboxOfflineService;
import com.ss.android.ugc.aweme.performanceopt.api.IPnSSandboxOptApi;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0XKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C846870XKb {
    public static String LJ;
    public static final C846870XKb LIZ = new C846870XKb();
    public static final String[] LIZIZ = {"US", "AS", "GU", "MP", "PR", "VI", "UM"};
    public static EnumC847160XLe LIZJ = EnumC847160XLe.COLD_BOOT;
    public static C847070XKv LIZLLL = C847070XKv.LIZJ;
    public static final IComplianceSandboxOfflineService LJFF = (IComplianceSandboxOfflineService) ServiceManager.get().getService(IComplianceSandboxOfflineService.class);

    public static void LIZJ() {
        HardBlockConfig hardBlockConfig = null;
        try {
            hardBlockConfig = (HardBlockConfig) SettingsManager.LIZLLL().LJIIIIZZ("sandbox_hard_block_config", HardBlockConfig.class, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        TTKOrbu.INSTANCE.setHardBlockConfig(hardBlockConfig);
    }

    static {
        Object c098200Yq;
        Object c098200Yq2;
        SandboxApp2AppSkipListSettings.SandboxApp2AppSkipListData sandboxApp2AppSkipListData;
        String strLJI;
        SandboxBootLogger.INSTANCE.sandboxInitStart();
        if (C0CLN.LIZIZ()) {
            System.nanoTime();
            LIZJ();
            LIZLLL();
            SettingsManager.LIZLLL().LJIIIZ(new InterfaceC304970BxP() { // from class: X.0XKk
                @Override // X.InterfaceC304970BxP
                public final void LIZ() {
                    C846870XKb.LIZ.getClass();
                    C846870XKb.LIZJ();
                    C846870XKb.LIZLLL();
                }
            });
            System.nanoTime();
            C0XKV.LIZ.getClass();
            try {
                IPnSSandboxOptApi iPnSSandboxOptApi = (IPnSSandboxOptApi) PluggableExtentionKt.pluggableSpi$default(IPnSSandboxOptApi.class, false, false, false, 14, null);
                if (iPnSSandboxOptApi == null || (strLJI = iPnSSandboxOptApi.LJI()) == null) {
                    strLJI = "";
                }
                if (((Boolean) C0XKV.LIZJ.getValue()).booleanValue()) {
                    TTKOrbu tTKOrbu = TTKOrbu.INSTANCE;
                    C844470XAv.LIZ.getClass();
                    int iCleanUpTTP = tTKOrbu.cleanUpTTP(C844470XAv.LIZ(), "sandbox crash occured.");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sandbox code: ");
                    sbLIZ.append(iCleanUpTTP);
                    C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    HardBlockConfigManager hardBlockConfigManager = HardBlockConfigManager.INSTANCE;
                    if (hardBlockConfigManager.enableCleanupOnRuleMismatch() && !hardBlockConfigManager.inTargetBlockRuleHashList(strLJI)) {
                        TTKOrbu tTKOrbu2 = TTKOrbu.INSTANCE;
                        C844470XAv.LIZ.getClass();
                        int iCleanUpTTP2 = tTKOrbu2.cleanUpTTP(C844470XAv.LIZ(), "sandbox cache rule hash not match.");
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("sandbox code: ");
                        sbLIZ2.append(iCleanUpTTP2);
                        sbLIZ2.append(", cacheRuleHash: ");
                        sbLIZ2.append(strLJI);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
                c098200Yq2 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            if (thM5exceptionOrNullimpl != null) {
                C0XKV.LIZ.getClass();
                C0XKV.LIZIZ(thM5exceptionOrNullimpl);
            }
            TTKOrbu tTKOrbu3 = TTKOrbu.INSTANCE;
            tTKOrbu3.setDelegate(new TTPOrbuDelegate());
            tTKOrbu3.setConfigCenter(C846880XKc.LIZ);
            LIZ.getClass();
            C0XKV c0xkv = C0XKV.LIZ;
            c0xkv.getClass();
            C0XKV.LIZIZ = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(c0xkv);
            Npth.addTag("sandbox_enabled", String.valueOf(C0CLN.LIZ()));
            C0XLA.LIZIZ = new InterfaceC847030XKr() { // from class: X.0X2k
                @Override // X.InterfaceC847030XKr
                public final void LIZ(C1495510p1J c1495510p1J) {
                    c1495510p1J.addNetworkInterceptor(OrbuSandboxOkHttpInterceptor.INSTANCE);
                }
            };
            TNCManager tNCManagerLJI = TNCManager.LJI();
            tNCManagerLJI.LJJIFFI = new InterfaceC847040XKs() { // from class: X.0WOU
                public static Map LIZJ(List list) {
                    if (list != null) {
                        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            C080U c080u = (C080U) it2.next();
                            String lowerCase = c080u.LIZ.toLowerCase(Locale.US);
                            List arrayList = (List) treeMap.get(lowerCase);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(c080u.LIZIZ);
                            treeMap.put(lowerCase, arrayList);
                        }
                        return treeMap;
                    }
                    return null;
                }

                @Override // X.InterfaceC847040XKs
                public final boolean LIZ(String str, String str2, List list) {
                    byte[] bArrLJIILLIIL;
                    try {
                        TTKOrbu tTKOrbu4 = TTKOrbu.INSTANCE;
                        Map mapLIZJ = LIZJ(list);
                        if (str2 != null) {
                            bArrLJIILLIIL = u.LJIILLIIL(str2);
                        } else {
                            bArrLJIILLIIL = null;
                        }
                        return !TTKResponseKt.isBlock(tTKOrbu4.shouldInterceptTTKRequest(new TTKNetworkRequest(str, "GET", mapLIZJ, bArrLJIILLIIL, C2097608Jq.LJIIJ(new Pair("x-tt-dataflow-id", "738197763")))));
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C098200Yq c098200Yq3 = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq3);
                        C189200o6.m5exceptionOrNullimpl(c098200Yq3);
                        return true;
                    }
                }

                @Override // X.InterfaceC847040XKs
                public final boolean LIZIZ(String str, String str2, String str3, List list) {
                    try {
                        return !TTKResponseKt.isBlock(TTKOrbu.INSTANCE.shouldInterceptTTKRequest(new TTKNetworkRequest(str2, str, LIZJ(list), u.LJIILLIIL(str3), C2097608Jq.LJIIJ(new Pair("x-tt-dataflow-id", "738197762")))));
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C098200Yq c098200Yq3 = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq3);
                        C189200o6.m5exceptionOrNullimpl(c098200Yq3);
                        return true;
                    }
                }
            };
            OkHttp3TTPSandBoxInterceptor.LIZ = tNCManagerLJI.LJJII;
            C846940XKi c846940XKi = C846930XKh.LIZ;
            C846950XKj c846950XKj = new C846950XKj();
            ((ArrayList) c846950XKj.LIZ).add(new C0XL2());
            ((ArrayList) c846950XKj.LIZ).add(new C0XL7() { // from class: X.0XKy
                @Override // X.C0XL7
                public final C0XL5 LIZ(C847110XKz c847110XKz) {
                    C820370WGd c820370WGd = c847110XKz.LIZJ;
                    TTKOrbu tTKOrbu4 = TTKOrbu.INSTANCE;
                    if (tTKOrbu4.enableInterceptor()) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Map<String, Object> map = c820370WGd.LIZLLL;
                        if (map != null) {
                            Object obj = map.get("x-tt-dataflow-id");
                            if ((obj instanceof String) && obj != null) {
                                linkedHashMap.put("x-tt-dataflow-id", obj);
                            }
                        }
                        TTKResponse tTKResponseShouldInterceptTTKRequest = tTKOrbu4.shouldInterceptTTKRequest(new TTKSDKRequest(c820370WGd.LIZ, c820370WGd.LIZIZ, c820370WGd.LIZJ, linkedHashMap));
                        if (tTKResponseShouldInterceptTTKRequest != null && TTKResponseKt.isBlock(tTKResponseShouldInterceptTTKRequest)) {
                            C0XL3 c0xl3 = new C0XL3();
                            c0xl3.LIZ = c820370WGd;
                            c0xl3.LIZIZ = tTKResponseShouldInterceptTTKRequest.getStatusCode();
                            c0xl3.LIZJ = tTKResponseShouldInterceptTTKRequest.getDescription();
                            return new C0XL5(c0xl3);
                        }
                    }
                    return c847110XKz.LIZ(c820370WGd);
                }
            });
            C846930XKh.LIZ = new C846940XKi(c846950XKj);
            C0XKO c0xko = C0XKO.LIZ;
            tTKOrbu3.setEventReportImpl(c0xko);
            tTKOrbu3.setDomainTypeIdentifier(C841470Wzh.LIZ);
            TTKNativeNetworkManager.setTTKNativeCallback(c0xko);
            IComplianceSandboxOfflineService iComplianceSandboxOfflineService = LJFF;
            if (iComplianceSandboxOfflineService != null) {
                iComplianceSandboxOfflineService.LIZIZ();
            }
            SandboxBootLogger.INSTANCE.sandboxInitEnd();
            C825790WaP c825790WaP = C825790WaP.LIZ;
            C844470XAv.LIZ.getClass();
            C825790WaP.LIZIZ.addAll(C1697810uHb.LJIIJJI(C844470XAv.LIZ().getPackageName(), "com.lemon.lvoverseas", "com.lemon.lvoverseas.lite", "com.lemon.lvoverseass", "com.lemon.lvoverseat", "com.lemon.lvoverus", "com.lemon.lvovsheseas", "com.ss.android.ugc.now", "com.ss.android.ugc.spark", "com.ss.android.ugc.tiktok.lite", "com.ss.android.ugc.trill", "com.tiktok.android.music", "com.tiktok.sdk.demo.share", "com.tiktokshop.seller", "com.zhiliaoapp.musically", "com.android.packageinstaller", "com.android.settings", "com.android.systemui", "com.google.android.packageinstaller", "com.huawei.systemmanager", "com.meta.systemui", "com.miui.packageinstaller", "com.miui.securitycenter", "com.miui.system", "com.oppo.launcher", "com.samsung.android.packageinstaller", "com.sonyericsson.android.camera", "com.sonymobile.photopro", "com.tct.applock", "com.xiaomi.misettings", "com.zui.safecenter", "com.zui.safecenter.row", "com.miui.phrase", "com.samsung.android.app.interpreter"));
            C825790WaP.LIZJ.addAll(C1697810uHb.LJIIJJI("com.tiktok.opensdk.share.PROXY_LINK_SHARE", "android.provider.action.PICK_IMAGES", "COM.PNS.ENTER_THIRD_CONTAINER", "COM.PNS.LEAVE_THIRD_CONTAINER", "android.bluetooth.adapter.action.REQUEST_ENABLE", "android.intent.action.APPLICATION_MESSAGE_UPDATE", "android.intent.action.BADGE_COUNT_UPDATE", "android.intent.action.GET_CONTENT", "android.intent.action.MEDIA_SCANNER_SCAN_FILE", "android.intent.action.PICK", "android.media.action.IMAGE_CAPTURE", "android.media.action.VIDEO_CAPTURE", "android.service.wallpaper.CHANGE_LIVE_WALLPAPER", "android.settings.APPLICATION_DETAILS_SETTINGS", "android.settings.APPLICATION_SETTINGS", "android.settings.APP_NOTIFICATION_SETTINGS", "android.settings.BATTERY_SAVER_SETTINGS", "android.settings.BIOMETRIC_ENROLL", "android.settings.CHANNEL_NOTIFICATION_SETTINGS", "android.settings.FINGERPRINT_ENROLL", "android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS", "android.settings.LOCATION_SOURCE_SETTINGS", "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", "android.settings.NFC_SETTINGS", "android.settings.PICTURE_IN_PICTURE_SETTINGS", "android.settings.SETTINGS", "android.settings.SOUND_SETTINGS", "android.settings.ZEN_MODE_SETTINGS", "android.settings.action.MANAGE_OVERLAY_PERMISSION", "com.android.launcher.action.INSTALL_SHORTCUT", "com.apm.setting.update.action", "com.meizu.safe.security.SHOW_APPSEC", "com.tct.privacymode.action.APPS_LOCK", "launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM", "android.app.action.CONFIRM_APP_LOCK", "android.content.pm.CONFIRM_ACCESS_APPLICATIONS", "android.intent.action.CALL_BUTTON", "android.intent.action.SEARCH_LONG_PRESS", "android.intent.action.VOICE_COMMAND", "android.intent.action.WEB_SEARCH", "android.settings.ADD_COMMON_PHRASE", "android.settings.COMMON_PHRASE_SETTINGS", "android.settings.NEW_ADD_COMMON_PHRASE", "android.settings.NEW_COMMON_PHRASE_SETTINGS", "com.android.settings.USER_DICTIONARY_INSERT", "com.samsung.android.intent.action.WritingToolkit", "smartisanos.intent.action.BOOM_IMAGE", "android.intent.action.DIAL", "android.intent.action.SEND"));
            C825790WaP.LIZLLL.addAll(Collections.singletonList("android.intent.category.HOME"));
            try {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                sandboxApp2AppSkipListData = SandboxApp2AppSkipListSettings.LIZ;
                SandboxApp2AppSkipListSettings.SandboxApp2AppSkipListData sandboxApp2AppSkipListData2 = (SandboxApp2AppSkipListSettings.SandboxApp2AppSkipListData) settingsManagerLIZLLL.LJIIIIZZ("sandbox_app2app_skip_list", SandboxApp2AppSkipListSettings.SandboxApp2AppSkipListData.class, sandboxApp2AppSkipListData);
                if (sandboxApp2AppSkipListData2 != null) {
                    sandboxApp2AppSkipListData = sandboxApp2AppSkipListData2;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                sandboxApp2AppSkipListData = SandboxApp2AppSkipListSettings.LIZ;
            }
            List<String> list = sandboxApp2AppSkipListData.skipPackages;
            if (list != null) {
                C825790WaP.LIZIZ.addAll(list);
            }
            List<String> list2 = sandboxApp2AppSkipListData.skipActions;
            if (list2 != null) {
                C825790WaP.LIZJ.addAll(list2);
            }
            List<String> list3 = sandboxApp2AppSkipListData.skipCategories;
            if (list3 != null) {
                C825790WaP.LIZLLL.addAll(list3);
            }
        } else {
            TTKOrbu.INSTANCE.setDelegate(new TTKDowngradeOrbuDelegate());
        }
        LIZ.getClass();
        try {
            C1798060wtI c1798060wtI = C1798060wtI.LIZ;
            C1798060wtI.LJ(new C0XLF() { // from class: X.0XKg
                @Override // X.C0XLF
                public final void LIZ(String str, C847070XKv c847070XKv) {
                    if (!Intrinsics.LJFF(C846870XKb.LIZLLL, c847070XKv)) {
                        C846900XKe.LIZ(C846870XKb.LIZJ, "StoreRegionCallback");
                    }
                }
            });
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl2 != null) {
            C0XKV.LIZ.getClass();
            C0XKV.LIZ(thM5exceptionOrNullimpl2);
        }
        LIZ.getClass();
        C01GW c01gw = C846860XKa.LIZ;
        Npth.addTag("control_sandbox_wrapper_pre_load_so", String.valueOf(((Number) c01gw.getValue()).intValue()));
        if (((Number) c01gw.getValue()).intValue() == 1) {
            C01GW c01gw2 = C0XKY.LIZ;
            Npth.addTag("control_sandbox_pumbaa_network_aspect", String.valueOf(((Number) c01gw2.getValue()).intValue()));
            TTKNativeNetworkManager.loadPumbaa(((Number) c01gw2.getValue()).intValue());
            TTKNativeNetworkManager.setGetUserRegionCall(new Callable() { // from class: X.0XKd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("OrbuInitManager@6226.preload$1");
                    C846870XKb c846870XKb = C846870XKb.LIZ;
                    String str = C846870XKb.LIZLLL.LIZ;
                    c846870XKb.getClass();
                    String str2 = C846870XKb.LIZIZ(str) ? "1" : CardStruct.IStatusCode.DEFAULT;
                    C1C7U.LIZIZ("OrbuInitManager@6226.preload$1");
                    return str2;
                }
            });
            TTKNativeNetworkManager.setGetSandboxState(new Callable() { // from class: X.0XKf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("OrbuInitManager@6226.preload$2");
                    String str = C846870XKb.LJ;
                    C1C7U.LIZIZ("OrbuInitManager@6226.preload$2");
                    return str;
                }
            });
            TTKOrbu.INSTANCE.registerNetworkHandler(new INetworkHandler() { // from class: X.0Wxg
                @Override // com.orbu.core.api.INetworkHandler
                public final int shouldIntercept(String str, String str2, Map<String, String> map, ByteBuffer byteBuffer, int i, Map<String, String> map2, Map<String, String> map3) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iHandleByPumbaa = SandboxBridge.handleByPumbaa(str, str2, map, byteBuffer, i, map3);
                    SandboxBridge.monitorCost("handleByPumbaaForSandboxFromJava", System.currentTimeMillis() - jCurrentTimeMillis);
                    return iHandleByPumbaa;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static void LIZLLL() {
        ?? linkedHashMap;
        try {
            Map map = (Map) SettingsManager.LIZLLL().LJIIIIZZ("sandbox_payload_sampling_config", Map.class, C0XKQ.LIZ);
            linkedHashMap = new LinkedHashMap();
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put((String) entry.getKey(), Integer.valueOf(((Number) entry.getValue()).intValue()));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            linkedHashMap = C0XKQ.LIZ;
        }
        C0XKQ.LIZIZ = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.EnumC847160XLe r16) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C846870XKb.LIZ(X.0XLe):void");
    }

    public static boolean LIZIZ(String str) {
        String upperCase;
        String[] strArr = LIZIZ;
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
        } else {
            upperCase = null;
        }
        if (C13LQ.LJJIJIIJI(upperCase, strArr) >= 0) {
            return true;
        }
        return false;
    }
}
