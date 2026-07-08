package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location.config.CacheConfigModel;
import com.ss.android.ugc.tiktok.location.config.CellConfigModel;
import com.ss.android.ugc.tiktok.location.config.DeSkipCertForLbsModel;
import com.ss.android.ugc.tiktok.location.config.DeSkipCertForOthersModel;
import com.ss.android.ugc.tiktok.location.config.DeSkipCertForSearchModel;
import com.ss.android.ugc.tiktok.location.config.LocationCertSignalRuleConfig;
import com.ss.android.ugc.tiktok.location.config.LocationCertSignalsConfigModel;
import com.ss.android.ugc.tiktok.location.config.LocationInAppPreciseConsentExperimentModel;
import com.ss.android.ugc.tiktok.location.config.SensorConfigModel;
import com.ss.android.ugc.tiktok.location.config.WifiConfigModel;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.experiment.LocationSdkConfigModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS462S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0wwa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1800100wwa {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C1798690wuJ LIZ = new InterfaceC1798630wuD() { // from class: X.0wuJ
        @Override // X.InterfaceC1798630wuD
        public final void d(String str, String str2, Throwable th) {
            LIZ(3, str, str2, th);
        }

        @Override // X.InterfaceC1798630wuD
        public final void e(String str, String str2, Throwable th) {
            LIZ(6, str, str2, th);
        }

        @Override // X.InterfaceC1798630wuD
        public final void i(String str, String str2, Throwable th) {
            LIZ(4, str, str2, th);
        }

        @Override // X.InterfaceC1798630wuD
        public final void w(String str, String str2, Throwable th) {
            LIZ(5, str, str2, th);
        }

        public static void LIZ(int i, String str, String str2, Throwable th) {
            if (th != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append('\n');
                sbLIZ.append(Log.getStackTraceString(th));
                str2 = C2188811AlT.LIZIZ(sbLIZ);
            }
            C2344809Gs.LIZLLL(i, str, str2);
        }
    };

    public static String LIZ() {
        AccountUserService accountUserServiceLJIIJ;
        String uid;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        return (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null || !accountUserServiceLJIIJ.isLogin() || (uid = accountUserServiceLJIIJ.getCurUser().getUid()) == null) ? CardStruct.IStatusCode.DEFAULT : uid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [X.0hOo] */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.09Ne] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r38v0, types: [X.04i5] */
    /* JADX WARN: Type inference failed for: r3v16, types: [X.0hN6] */
    /* JADX WARN: Type inference failed for: r48v2, types: [X.0wwk] */
    /* JADX WARN: Type inference failed for: r4v28, types: [X.0wuI] */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.0wwd] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZIZ(String str, Long l, Long l2, Long l3, C1202170hOB c1202170hOB, String str2) {
        List<String> list;
        List<String> list2;
        List<String> list3;
        Locale locale;
        C1153410g7X c1153410g7X;
        ?? r1;
        C1153410g7X c1153410g7X2;
        C1153410g7X c1153410g7X3;
        C1158340gFU c1158340gFU;
        C1207210hWJ c1207210hWJ;
        String str3 = str;
        ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJIJIIJI();
        if (!C145T.LIZJ()) {
            if (str3 == null) {
                str3 = "unknown";
            }
            String strConcat = C844470XAv.LJIIIIZZ.LIZ;
            if (TextUtils.isEmpty(strConcat)) {
                C2344809Gs.LJFF("LocationInitializer", "Api host is null");
                return;
            }
            if (!u.LJJIIJZLJL(strConcat, "https://", false)) {
                strConcat = "https://".concat(strConcat);
            }
            C844470XAv.LIZ.getClass();
            final Context contextLIZ = C844470XAv.LIZ();
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            SensorConfigModel sensorConfigModel = C1800150wwf.LIZ;
            SensorConfigModel sensorConfigModel2 = (SensorConfigModel) c0c64LJIILLIIL.LJJII(SensorConfigModel.class, sensorConfigModel, "android_sensor_config", true);
            if (sensorConfigModel2 != null) {
                sensorConfigModel = sensorConfigModel2;
            }
            C0C64 c0c64LJIILLIIL2 = C0C64.LJIILLIIL();
            CellConfigModel cellConfigModel = C1800140wwe.LIZ;
            CellConfigModel cellConfigModel2 = (CellConfigModel) c0c64LJIILLIIL2.LJJII(CellConfigModel.class, cellConfigModel, "pns_cell_config", true);
            if (cellConfigModel2 != null) {
                cellConfigModel = cellConfigModel2;
            }
            C0C64 c0c64LJIILLIIL3 = C0C64.LJIILLIIL();
            WifiConfigModel wifiConfigModel = C1800170wwh.LIZ;
            WifiConfigModel wifiConfigModel2 = (WifiConfigModel) c0c64LJIILLIIL3.LJJII(WifiConfigModel.class, wifiConfigModel, "android_wifi_config", true);
            if (wifiConfigModel2 != null) {
                wifiConfigModel = wifiConfigModel2;
            }
            final boolean zEquals = TextUtils.equals(C844470XAv.LJIILL, "local_test");
            final boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "android_location_de_enable", true, false);
            C0C64 c0c64LJIILLIIL4 = C0C64.LJIILLIIL();
            DeSkipCertForLbsModel deSkipCertForLbsModel = C1201560hNC.LIZ;
            DeSkipCertForLbsModel deSkipCertForLbsModel2 = (DeSkipCertForLbsModel) c0c64LJIILLIIL4.LJJII(DeSkipCertForLbsModel.class, deSkipCertForLbsModel, "android_location_de_skip_cert_for_lbs", true);
            if (deSkipCertForLbsModel2 == null || (list = deSkipCertForLbsModel2.list) == null) {
                list = deSkipCertForLbsModel.list;
            }
            C0C64 c0c64LJIILLIIL5 = C0C64.LJIILLIIL();
            DeSkipCertForSearchModel deSkipCertForSearchModel = C1268704xp.LIZ;
            DeSkipCertForSearchModel deSkipCertForSearchModel2 = (DeSkipCertForSearchModel) c0c64LJIILLIIL5.LJJII(DeSkipCertForSearchModel.class, deSkipCertForSearchModel, "android_location_de_skip_cert_for_search", true);
            if (deSkipCertForSearchModel2 == null || (list2 = deSkipCertForSearchModel2.list) == null) {
                list2 = deSkipCertForSearchModel.list;
            }
            List listLJLIL = C13LP.LJLIL(list2, list);
            C0C64 c0c64LJIILLIIL6 = C0C64.LJIILLIIL();
            DeSkipCertForOthersModel deSkipCertForOthersModel = C1800240wwo.LIZ;
            DeSkipCertForOthersModel deSkipCertForOthersModel2 = (DeSkipCertForOthersModel) c0c64LJIILLIIL6.LJJII(DeSkipCertForOthersModel.class, deSkipCertForOthersModel, "android_location_de_skip_cert_for_others", true);
            if (deSkipCertForOthersModel2 == null || (list3 = deSkipCertForOthersModel2.list) == null) {
                list3 = deSkipCertForOthersModel.list;
            }
            final List listLJLIL2 = C13LP.LJLIL(list3, listLJLIL);
            final String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            LIZ();
            final String strValueOf = String.valueOf(C844470XAv.LJIIJ);
            final String str4 = C844470XAv.LJIILL;
            final String strValueOf2 = String.valueOf(C844470XAv.LJ());
            final String strValueOf3 = String.valueOf(C844470XAv.LIZLLL());
            final String packageName = contextLIZ.getPackageName();
            TokenCert.Companion companion = TokenCert.Companion;
            final TokenCert tokenCertWith = companion.with("bpea-poi_location_sdk_init");
            tokenCertWith.auth("dwcr");
            final TokenCert tokenCertWith2 = companion.with("bpea-poi_sdk_cold_start");
            tokenCertWith2.auth("lubb");
            tokenCertWith2.attachCustomInfo("transmit_enable", Boolean.valueOf(C0WP5.LIZ));
            final TokenCert tokenCertWith3 = companion.with("bpea-poi_sdk_hot_start_locate_android");
            tokenCertWith3.auth("lubb");
            final ?? r19 = new Object(tokenCertWith, tokenCertWith2, tokenCertWith3) { // from class: X.09Ne
                public final Cert LIZ;
                public final Cert LIZIZ;
                public final Cert LIZJ;

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("BpeaConfig(enabled=");
                    sbLIZ.append(true);
                    sbLIZ.append(", initCert=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", coldStartCert=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", hotStartCert=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = tokenCertWith;
                    this.LIZIZ = tokenCertWith2;
                    this.LIZJ = tokenCertWith3;
                }
            };
            final C1798390wtp c1798390wtp = new C1798390wtp(strConcat, C092E.LIZ);
            final C1798690wuJ c1798690wuJ = this.LIZ;
            final boolean zLJII = ComplianceServiceProvider.LJIILJJIL().LJII(null);
            if (Build.VERSION.SDK_INT >= 24) {
                locale = Resources.getSystem().getConfiguration().getLocales().get(0);
            } else {
                locale = Resources.getSystem().getConfiguration().locale;
            }
            final int i = 7;
            final int i2 = 2;
            final boolean z = true;
            final char c = 1 == true ? 1 : 0;
            final ?? r16 = new Object(z, c, i, i2) { // from class: X.0hOo
                public boolean LIZ;
                public final int LIZIZ;
                public int LIZJ;
                public int LIZLLL;

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FuzzMode(enabled=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", type=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", distance=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(", resolution=");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    z = (i2 & 1) != 0 ? false : z;
                    int i3 = (i2 & 2) != 0 ? 2 : 0;
                    i = (i2 & 4) != 0 ? 1 : c;
                    i = (i2 & 8) != 0 ? 7 : i;
                    this.LIZ = z;
                    this.LIZIZ = i3;
                    this.LIZJ = i;
                    this.LIZLLL = i;
                }
            };
            final boolean zLJIIIZ2 = C0C64.LJIILLIIL().LJIIIZ(31744, "enable_location_sdk_cache_time_optimize", false, false);
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            CacheConfigModel cacheConfigModel = C1800180wwi.LIZ;
            CacheConfigModel cacheConfigModel2 = (CacheConfigModel) settingsManagerLIZLLL.LJIIIIZZ("location_sdk_cache_ttl_range", CacheConfigModel.class, cacheConfigModel);
            if (cacheConfigModel2 == null) {
                cacheConfigModel2 = cacheConfigModel;
            }
            final long j = cacheConfigModel2.minCacheTime;
            CacheConfigModel cacheConfigModel3 = (CacheConfigModel) SettingsManager.LIZLLL().LJIIIIZZ("location_sdk_cache_ttl_range", CacheConfigModel.class, cacheConfigModel);
            if (cacheConfigModel3 != null) {
                cacheConfigModel = cacheConfigModel3;
            }
            final long j2 = cacheConfigModel.maxCacheTime;
            final boolean zLJIIIZ3 = C0C64.LJIILLIIL().LJIIIZ(31744, "location_sdk_async_cache", false, false);
            final ?? r38 = new Object(zLJIIIZ2, j, j2, zLJIIIZ3) { // from class: X.04i5
                public final boolean LIZ;
                public final long LIZIZ;
                public final long LIZJ;
                public final boolean LIZLLL;

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CacheConfig(enableCacheOpt=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", minCacheTime=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", maxCacheTime=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(", asyncSaveCacheEnabled=");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = zLJIIIZ2;
                    this.LIZIZ = j;
                    this.LIZJ = j2;
                    this.LIZLLL = zLJIIIZ3;
                }
            };
            C1153440g7a.LIZ.getClass();
            C0C64 c0c64LJIILLIIL7 = C0C64.LJIILLIIL();
            LocationCertSignalsConfigModel locationCertSignalsConfigModel = C1153440g7a.LIZIZ;
            LocationCertSignalsConfigModel locationCertSignalsConfigModel2 = (LocationCertSignalsConfigModel) c0c64LJIILLIIL7.LJJII(LocationCertSignalsConfigModel.class, locationCertSignalsConfigModel, "location_cert_signals_config", true);
            if (locationCertSignalsConfigModel2 != null) {
                locationCertSignalsConfigModel = locationCertSignalsConfigModel2;
            }
            locationCertSignalsConfigModel.getClass();
            boolean z2 = locationCertSignalsConfigModel.enabled;
            LocationCertSignalRuleConfig locationCertSignalRuleConfig = locationCertSignalsConfigModel.wifi;
            if (locationCertSignalRuleConfig != null) {
                c1153410g7X = locationCertSignalRuleConfig.LIZ();
                r1 = 0;
            } else {
                r1 = 0;
                c1153410g7X = new C1153410g7X(0);
            }
            LocationCertSignalRuleConfig locationCertSignalRuleConfig2 = locationCertSignalsConfigModel.cell;
            if (locationCertSignalRuleConfig2 != null) {
                c1153410g7X2 = locationCertSignalRuleConfig2.LIZ();
            } else {
                c1153410g7X2 = new C1153410g7X(r1);
            }
            LocationCertSignalRuleConfig locationCertSignalRuleConfig3 = locationCertSignalsConfigModel.sensor;
            if (locationCertSignalRuleConfig3 != null) {
                c1153410g7X3 = locationCertSignalRuleConfig3.LIZ();
            } else {
                c1153410g7X3 = new C1153410g7X(r1);
            }
            final C1153420g7Y c1153420g7Y = new C1153420g7Y(z2, c1153410g7X, c1153410g7X2, c1153410g7X3);
            C0C64 c0c64LJIILLIIL8 = C0C64.LJIILLIIL();
            LocationSdkConfigModel locationSdkConfigModel = C1800190wwj.LIZ;
            LocationSdkConfigModel locationSdkConfigModel2 = (LocationSdkConfigModel) c0c64LJIILLIIL8.LJJII(LocationSdkConfigModel.class, locationSdkConfigModel, "location_sdk_config", r1);
            if (locationSdkConfigModel2 != null) {
                locationSdkConfigModel = locationSdkConfigModel2;
            }
            final boolean z3 = locationSdkConfigModel.enableLocalGeocode;
            final Set<String> set = C1800120wwc.LIZ().fineRegions;
            final Set<String> set2 = C1800120wwc.LIZ().blockedRegions;
            final boolean z4 = sensorConfigModel.withGps;
            final C1798540wu4 c1798540wu4 = new C1798540wu4(contextLIZ, sensorConfigModel.enabled, sensorConfigModel.requiredPermissionLevel, sensorConfigModel.enabledRegions, sensorConfigModel.enabledSensors, sensorConfigModel.batchSize, sensorConfigModel.batchTimeout, sensorConfigModel.sampleRate, AFwS216S0000000_27.get$arr$(320), new AwS571S0100000_27(contextLIZ, 1319));
            boolean z5 = cellConfigModel.enabled;
            Map<String, List<String>> map = cellConfigModel.regionRequirements;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                arrayList.add(new C1798570wu7(entry.getKey(), entry.getValue()));
            }
            final C1798560wu6 c1798560wu6 = new C1798560wu6(contextLIZ, z5, arrayList, cellConfigModel.requiredPermission, cellConfigModel.batchSize, new AwS571S0100000_27(contextLIZ, 1320), AFwS216S0000000_27.get$arr$(321), AFwS216S0000000_27.get$arr$(322));
            final boolean zLJIIIZ4 = C0C64.LJIILLIIL().LJIIIZ(31744, "location_force_h3_under_s", false, false);
            final ?? r48 = new InterfaceC1798670wuH() { // from class: X.0wwk
                @Override // X.InterfaceC1798670wuH
                public final int get() {
                    C1208440hYI.LIZ.getClass();
                    return C1208440hYI.LIZ();
                }

                @Override // X.InterfaceC1798670wuH
                public final void LIZ(boolean z6) {
                    C1208440hYI.LIZ.getClass();
                    ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
                    if (iLocationBaseServiceForMT != null) {
                        iLocationBaseServiceForMT.LIZIZ(z6);
                    }
                }
            };
            final C1798490wtz c1798490wtz = new C1798490wtz(contextLIZ, wifiConfigModel.enabled, wifiConfigModel.connectedOnly, new AwS571S0100000_27(contextLIZ, 1321), wifiConfigModel.enabledRegions, AFwS216S0000000_27.get$arr$(323), C13LP.LLIIIZ(wifiConfigModel.realtimeScanCerts), wifiConfigModel.scanTimeoutMs);
            final TokenCert tokenCertWith4 = TokenCert.Companion.with("bpea-consent_login_location_permission_downgrade");
            final AFwS216S0000000_27 aFwS216S0000000_27 = AFwS216S0000000_27.get$arr$(317);
            final AFwS216S0000000_27 aFwS216S0000000_272 = AFwS216S0000000_27.get$arr$(318);
            final ?? r9 = new Object(tokenCertWith4, aFwS216S0000000_27, aFwS216S0000000_272) { // from class: X.0wwd
                public final Cert LIZ;
                public final Function0<C12Q8> LIZIZ;
                public final Function0<Activity> LIZJ;

                {
                    this.LIZ = tokenCertWith4;
                    this.LIZIZ = aFwS216S0000000_27;
                    this.LIZJ = aFwS216S0000000_272;
                }
            };
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (l != null) {
                linkedHashMap.put("cold_start_time", Long.valueOf(l.longValue()));
            }
            if (l2 != null) {
                linkedHashMap.put("location_task_load_start_time", Long.valueOf(l2.longValue()));
            }
            if (l3 != null) {
                linkedHashMap.put("settings_callback_time", Long.valueOf(l3.longValue()));
            }
            linkedHashMap.put("load_type", str3);
            linkedHashMap.put("init_trigger", str2);
            C00AH.LIZ.getClass();
            C0C64 c0c64LJIILLIIL9 = C0C64.LJIILLIIL();
            LocationInAppPreciseConsentExperimentModel locationInAppPreciseConsentExperimentModel = C00AH.LIZIZ;
            LocationInAppPreciseConsentExperimentModel locationInAppPreciseConsentExperimentModel2 = (LocationInAppPreciseConsentExperimentModel) c0c64LJIILLIIL9.LJJII(LocationInAppPreciseConsentExperimentModel.class, locationInAppPreciseConsentExperimentModel, "location_in_app_precise_consent", true);
            if (locationInAppPreciseConsentExperimentModel2 != null) {
                locationInAppPreciseConsentExperimentModel = locationInAppPreciseConsentExperimentModel2;
            }
            ?? r3 = new InterfaceC1201510hN7(this) { // from class: X.0hN6
                @Override // X.InterfaceC1201510hN7
                public final boolean LIZ(Activity activity, EnumC1800110wwb enumC1800110wwb, InterfaceC1207170hWF interfaceC1207170hWF) {
                    ILocationBaseServiceForMT iLocationBaseServiceForMT;
                    Object c098200Yq;
                    if (!(activity instanceof C19EG) || (iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null)) == null || !iLocationBaseServiceForMT.LJIILJJIL()) {
                        return false;
                    }
                    try {
                        iLocationBaseServiceForMT.LIZLLL(activity, null, null, interfaceC1207170hWF, enumC1800110wwb.getTriggerScene());
                        c098200Yq = Boolean.TRUE;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                        c098200Yq = Boolean.FALSE;
                    }
                    return ((Boolean) c098200Yq).booleanValue();
                }
            };
            Set<Integer> set3 = locationInAppPreciseConsentExperimentModel.enabledTriggers;
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = set3.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                EnumC1800110wwb.Companion.getClass();
                EnumC1800110wwb[] enumC1800110wwbArrValues = EnumC1800110wwb.values();
                int length = enumC1800110wwbArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        EnumC1800110wwb enumC1800110wwb = enumC1800110wwbArrValues[i3];
                        if (enumC1800110wwb.getCode() == iIntValue) {
                            arrayList2.add(enumC1800110wwb);
                            break;
                        }
                        i3++;
                    }
                }
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList2);
            if (setLLIIJI.isEmpty()) {
                c1158340gFU = null;
            } else {
                c1158340gFU = new C1158340gFU(setLLIIJI, r3);
            }
            final AFwS200S0000000_13 aFwS200S0000000_13 = AFwS200S0000000_13.get$arr$(311);
            final AFwS216S0000000_27 aFwS216S0000000_273 = AFwS216S0000000_27.get$arr$(319);
            final AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 1318);
            final Locale locale2 = locale;
            final C1158340gFU c1158340gFU2 = c1158340gFU;
            ?? r4 = new Object(contextLIZ, zEquals, zLJIIIZ, listLJLIL2, strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, strValueOf, str4, strValueOf2, strValueOf3, packageName, r19, c1798390wtp, c1798690wuJ, zLJII, locale2, r16, r38, z3, aFwS200S0000000_13, aFwS216S0000000_273, set, set2, z4, c1798540wu4, c1798560wu6, zLJIIIZ4, r48, c1798490wtz, awS571S0100000_27, r9, linkedHashMap, c1153420g7Y, c1158340gFU2) { // from class: X.0wuI
                public final Context LIZ;
                public final boolean LIZIZ;
                public final boolean LIZJ;
                public final boolean LIZLLL;
                public final List<String> LJ;
                public final boolean LJFF;
                public final String LJI;
                public final String LJII;
                public final String LJIIIIZZ;
                public final String LJIIIZ;
                public final String LJIIJ;
                public final String LJIIJJI;
                public final C2361609Ne LJIIL;
                public final C01B4 LJIILIIL;
                public final C1798390wtp LJIILJJIL;
                public final InterfaceC1798630wuD LJIILL;
                public final boolean LJIILLIIL;
                public final Locale LJIIZILJ;
                public final C1202560hOo LJIJ;
                public final C1171104i5 LJIJI;
                public final boolean LJIJJ;
                public final Function0<Boolean> LJIJJLI;
                public final long LJIL;
                public final Function0<String> LJJ;
                public final Set<String> LJJI;
                public final Set<String> LJJIFFI;
                public final boolean LJJII;
                public final C1798540wu4 LJJIII;
                public final C1798560wu6 LJJIIJ;
                public final boolean LJJIIJZLJL;
                public final InterfaceC1798670wuH LJJIIZ;
                public final C1798490wtz LJJIIZI;
                public final Function0<String> LJJIJ;
                public final C1800130wwd LJJIJIIJI;
                public final Map<String, Object> LJJIJIIJIL;
                public final C1153420g7Y LJJIJIL;
                public final C1158340gFU LJJIJL;

                public final String toString() {
                    return "InitParams{context=" + this.LIZ + ",did=" + this.LJI + ", appId=" + this.LJII + ", channel=" + this.LJIIIIZZ + ", version=" + this.LJIIIZ + ", versionCode=" + this.LJIIJ + ", packageName=" + this.LJIIJJI + ", bpeaConfig=" + this.LJIIL + ", autoReportConfig=" + this.LJIILIIL + ", networkConfig=" + this.LJIILJJIL + ", consented=" + this.LJIILLIIL + ", locale=" + this.LJIIZILJ + ", fuzzMode=" + this.LJIJ + ", cacheConfig=" + this.LJIJI + ", enableLocalReverseGeo=" + this.LJIJJ + ", infoUploadInterval=" + this.LJIL + ", }";
                }

                /* JADX WARN: Type inference failed for: r2v0, types: [X.01B4] */
                {
                    TimeUnit timeUnit;
                    long j3;
                    ?? r2 = new Object() { // from class: X.01B4
                        public boolean LIZ;
                        public int LIZIZ;
                        public long LIZJ;
                        public final long LIZLLL;

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("AutoReportConfig(enabled=");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(", maxReportCountPerDay=");
                            sbLIZ.append(this.LIZIZ);
                            sbLIZ.append(", autoReportInterval=");
                            sbLIZ.append(this.LIZJ);
                            sbLIZ.append(", maxReportDuration=");
                            sbLIZ.append(this.LIZLLL);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        {
                            TimeUnit timeUnit2 = TimeUnit.DAYS;
                            long millis = timeUnit2.toMillis(1L);
                            long millis2 = timeUnit2.toMillis(1L);
                            this.LIZ = false;
                            this.LIZIZ = 0;
                            this.LIZJ = millis;
                            this.LIZLLL = millis2;
                        }
                    };
                    if (zEquals) {
                        timeUnit = TimeUnit.MINUTES;
                        j3 = 10;
                    } else {
                        timeUnit = TimeUnit.HOURS;
                        j3 = 12;
                    }
                    long millis = timeUnit.toMillis(j3);
                    this.LIZ = contextLIZ;
                    this.LIZIZ = zEquals;
                    this.LIZJ = true;
                    this.LIZLLL = zLJIIIZ;
                    this.LJ = listLJLIL2;
                    this.LJFF = false;
                    this.LJI = strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId;
                    this.LJII = strValueOf;
                    this.LJIIIIZZ = str4;
                    this.LJIIIZ = strValueOf2;
                    this.LJIIJ = strValueOf3;
                    this.LJIIJJI = packageName;
                    this.LJIIL = r19;
                    this.LJIILIIL = r2;
                    this.LJIILJJIL = c1798390wtp;
                    this.LJIILL = c1798690wuJ;
                    this.LJIILLIIL = zLJII;
                    this.LJIIZILJ = locale2;
                    this.LJIJ = r16;
                    this.LJIJI = r38;
                    this.LJIJJ = z3;
                    this.LJIJJLI = aFwS200S0000000_13;
                    this.LJIL = millis;
                    this.LJJ = aFwS216S0000000_273;
                    this.LJJI = set;
                    this.LJJIFFI = set2;
                    this.LJJII = z4;
                    this.LJJIII = c1798540wu4;
                    this.LJJIIJ = c1798560wu6;
                    this.LJJIIJZLJL = zLJIIIZ4;
                    this.LJJIIZ = r48;
                    this.LJJIIZI = c1798490wtz;
                    this.LJJIJ = awS571S0100000_27;
                    this.LJJIJIIJI = r9;
                    this.LJJIJIIJIL = linkedHashMap;
                    this.LJJIJIL = c1153420g7Y;
                    this.LJJIJL = c1158340gFU2;
                }
            };
            C1207750hXB c1207750hXB = C1207750hXB.LIZ;
            if (C1207750hXB.LIZIZ) {
                c1207750hXB.getClass();
                c1207210hWJ = (C1207210hWJ) C1207750hXB.LIZJ.getValue();
            } else {
                c1207750hXB.getClass();
                c1207210hWJ = null;
            }
            C1798550wu5.LIZIZ.LJIILL(r4, c1207210hWJ, new AwS462S0200000_27(c1202170hOB, this, 17));
            return;
        }
        if (c1202170hOB == null) {
            return;
        }
        c1202170hOB.invoke(0, null);
    }
}
