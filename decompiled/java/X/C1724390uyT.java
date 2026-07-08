package X;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.dependency.appsetting.AppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uyT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1724390uyT {
    public static final C1724390uyT LIZ = new C1724390uyT();

    public static String LIZIZ() {
        try {
            String property = System.getProperty("http.agent");
            if (property == null) {
                property = "";
            }
            StringBuilder sb = new StringBuilder();
            int length = property.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if (Intrinsics.LJI(cCharAt, 31) <= 0 || Intrinsics.LJI(cCharAt, 127) >= 0) {
                    sb.append(C786410Ut5.j4("\\u%04x", Arrays.copyOf(new Object[]{Character.valueOf(cCharAt)}, 1)));
                } else {
                    sb.append(cCharAt);
                }
            }
            return sb.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            return "";
        }
    }

    public static JSONObject LIZJ(n nVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<T> it2 = nVar.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str = (String) entry.getKey();
                k kVar = (k) entry.getValue();
                kVar.getClass();
                if (kVar instanceof n) {
                    jSONObject.put(str, LIZJ(kVar.LJIILIIL()));
                } else if (kVar instanceof h) {
                    jSONObject.put(str, kVar.LJIIL().toString());
                } else if (kVar instanceof q) {
                    q qVarLJIILJJIL = kVar.LJIILJJIL();
                    Object obj = qVarLJIILJJIL.LL;
                    if (obj instanceof Boolean) {
                        jSONObject.put(str, qVarLJIILJJIL.LJ());
                    } else if (obj instanceof Number) {
                        jSONObject.put(str, qVarLJIILJJIL.LJIJ());
                    } else if (obj instanceof String) {
                        jSONObject.put(str, qVarLJIILJJIL.LJIL());
                    }
                } else if (kVar instanceof m) {
                    jSONObject.put(str, JSONObject.NULL);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return jSONObject;
        }
    }

    public static JSONObject LIZ(String str, n nVar, List list) {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        IECommerceHostService iECommerceHostService3;
        IECommerceHostService iECommerceHostService4;
        IECommerceHostService iECommerceHostService5;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2;
        IECommerceHostService iECommerceHostService6;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        IECommerceHostService iECommerceHostService7;
        IECommerceHostService iECommerceHostService8;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin4;
        IECommerceHostService iECommerceHostService9;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin5;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin6;
        AnonymousClass0317 anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin;
        Object objLIZ;
        Object next;
        boolean z;
        String name;
        boolean z2;
        String name2;
        boolean z3;
        String name3;
        boolean z4;
        String name4;
        boolean z5;
        String name5;
        boolean z6;
        String name6;
        boolean z7;
        String name7;
        boolean z8;
        String name8;
        boolean z9;
        String name9;
        boolean z10;
        String name10;
        boolean z11;
        String name11;
        boolean z12;
        boolean z13;
        String name12;
        boolean z14;
        String name13;
        boolean z15;
        String name14;
        boolean z16;
        String name15;
        boolean z17;
        String name16;
        boolean z18;
        String name17;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device_platform", "android");
            String name18 = null;
            jSONObject.put("device_fp_id", (Object) null);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService10 = (IECommerceHostService) service;
                if (iECommerceHostService10 != null) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                String name19 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService10 != null) {
                    name17 = iECommerceHostService10.getClass().getName();
                } else {
                    name17 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name19, name17, z18);
                iECommerceHostService = (IECommerceHostService) service;
            } else {
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZ.LIZJ().LIZLLL(IApplicationDependencyService.class);
            }
            jSONObject.put("app_version", ((IApplicationDependencyService) iECommerceHostService).getVersionInfo().LIZ);
            jSONObject.put("gp_device_fp_id", (Object) null);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                Object service2 = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService11 = (IECommerceHostService) service2;
                if (iECommerceHostService11 != null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                String name20 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService11 != null) {
                    name16 = iECommerceHostService11.getClass().getName();
                } else {
                    name16 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name20, name16, z17);
                iECommerceHostService2 = (IECommerceHostService) service2;
            } else {
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZ.LIZJ().LIZLLL(IApplicationDependencyService.class);
            }
            jSONObject.put("aid", String.valueOf(((IApplicationDependencyService) iECommerceHostService2).getAppId()));
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                Object service3 = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService12 = (IECommerceHostService) service3;
                if (iECommerceHostService12 != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                String name21 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService12 != null) {
                    name15 = iECommerceHostService12.getClass().getName();
                } else {
                    name15 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime3, 1, name21, name15, z16);
                iECommerceHostService3 = (IECommerceHostService) service3;
            } else {
                iECommerceHostService3 = (IECommerceHostService) C1120604Zw.LIZ.LIZJ().LIZLLL(IApplicationDependencyService.class);
            }
            jSONObject.put("app_id", String.valueOf(((IApplicationDependencyService) iECommerceHostService3).getAppId()));
            jSONObject.put("did", DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
            jSONObject.put("device_id", DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                Object service4 = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService13 = (IECommerceHostService) service4;
                if (iECommerceHostService13 != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                String name22 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService13 != null) {
                    name14 = iECommerceHostService13.getClass().getName();
                } else {
                    name14 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime4, 1, name22, name14, z15);
                iECommerceHostService4 = (IECommerceHostService) service4;
            } else {
                iECommerceHostService4 = (IECommerceHostService) C1120604Zw.LIZ.LIZJ().LIZLLL(IApplicationDependencyService.class);
            }
            EnumC804620VhM enumC804620VhMLJ = C804420Vh2.LJ(((IApplicationDependencyService) iECommerceHostService4).getApplicationContext());
            jSONObject.put("ac", enumC804620VhMLJ);
            jSONObject.put("net_type", enumC804620VhMLJ);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime5 = SystemClock.elapsedRealtime();
                Object service5 = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService14 = (IECommerceHostService) service5;
                if (iECommerceHostService14 != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                String name23 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService14 != null) {
                    name13 = iECommerceHostService14.getClass().getName();
                } else {
                    name13 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime5, 1, name23, name13, z14);
                iECommerceHostService5 = (IECommerceHostService) service5;
            } else {
                iECommerceHostService5 = (IECommerceHostService) C1120604Zw.LIZ.LIZJ().LIZLLL(IApplicationDependencyService.class);
            }
            jSONObject.put("app_name", ((IApplicationDependencyService) iECommerceHostService5).getAppName());
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime6 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                String name24 = ILocationDependencyService.class.getName();
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                    name12 = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name12 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime6, 1, name24, name12, z13);
            } else {
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZ.LIZJ().LIZLLL(ILocationDependencyService.class);
            }
            jSONObject.put("app_region", ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getRegion());
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime7 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2 = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                String name25 = ILocationDependencyService.class.getName();
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2 != null) {
                    name18 = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime7, 1, name25, name18, z12);
            } else {
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZ.LIZJ().LIZLLL(ILocationDependencyService.class);
            }
            jSONObject.put("current_region", ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2).getCurrentRegionCode());
            jSONObject.put("user_agent", LIZIZ());
            String str2 = Build.MODEL;
            jSONObject.put("device_type", str2);
            jSONObject.put("timezone_name", TimeZone.getDefault().getID());
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime8 = SystemClock.elapsedRealtime();
                Object service6 = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService15 = (IECommerceHostService) service6;
                if (iECommerceHostService15 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                String name26 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService15 != null) {
                    name11 = iECommerceHostService15.getClass().getName();
                } else {
                    name11 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime8, 1, name26, name11, z11);
                iECommerceHostService6 = (IECommerceHostService) service6;
            } else {
                iECommerceHostService6 = (IECommerceHostService) C1120604Zw.LIZ.LIZJ().LIZLLL(IApplicationDependencyService.class);
            }
            jSONObject.put("channel", ((IApplicationDependencyService) iECommerceHostService6).getChannel());
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime9 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String name27 = ILogDependencyService.class.getName();
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    name10 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name10 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime9, 1, name27, name10, z10);
            } else {
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZ.LIZJ().LIZLLL(ILogDependencyService.class);
            }
            jSONObject.put("iid", ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getIid());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("android");
            sbLIZ.append(Build.VERSION.RELEASE);
            jSONObject.put("os_version", C2188811AlT.LIZIZ(sbLIZ));
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime10 = SystemClock.elapsedRealtime();
                Object service7 = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService16 = (IECommerceHostService) service7;
                if (iECommerceHostService16 != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                String name28 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService16 != null) {
                    name9 = iECommerceHostService16.getClass().getName();
                } else {
                    name9 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime10, 1, name28, name9, z9);
                iECommerceHostService7 = (IECommerceHostService) service7;
            } else {
                iECommerceHostService7 = (IECommerceHostService) C1120604Zw.LIZ.LIZJ().LIZLLL(IApplicationDependencyService.class);
            }
            jSONObject.put("screen_height", String.valueOf(C12ES.LJIIIIZZ(((IApplicationDependencyService) iECommerceHostService7).getApplicationContext())));
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime11 = SystemClock.elapsedRealtime();
                Object service8 = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService17 = (IECommerceHostService) service8;
                if (iECommerceHostService17 != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                String name29 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService17 != null) {
                    name8 = iECommerceHostService17.getClass().getName();
                } else {
                    name8 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime11, 1, name29, name8, z8);
                iECommerceHostService8 = (IECommerceHostService) service8;
            } else {
                iECommerceHostService8 = (IECommerceHostService) C1120604Zw.LIZ.LIZJ().LIZLLL(IApplicationDependencyService.class);
            }
            jSONObject.put("screen_width", String.valueOf(C12ES.LJIIJ(((IApplicationDependencyService) iECommerceHostService8).getApplicationContext())));
            jSONObject.put("sys_language", C786410Ut5.t2(Locale.getDefault()));
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime12 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3 = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3 != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                String name30 = ILocationDependencyService.class.getName();
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3 != null) {
                    name7 = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3.getClass().getName();
                } else {
                    name7 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime12, 1, name30, name7, z7);
            } else {
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3 = (IECommerceHostService) C1120604Zw.LIZ.LIZJ().LIZLLL(ILocationDependencyService.class);
            }
            jSONObject.put("sys_region", ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3).getSysRegion());
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime13 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin4 = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin4 != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                String name31 = ILocationDependencyService.class.getName();
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin4 != null) {
                    name6 = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin4.getClass().getName();
                } else {
                    name6 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime13, 1, name31, name6, z6);
            } else {
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin4 = (IECommerceHostService) C1120604Zw.LIZ.LIZJ().LIZLLL(ILocationDependencyService.class);
            }
            jSONObject.put("terminal_country", ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin4).getRegion());
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime14 = SystemClock.elapsedRealtime();
                Object service9 = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService18 = (IECommerceHostService) service9;
                if (iECommerceHostService18 != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                String name32 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService18 != null) {
                    name5 = iECommerceHostService18.getClass().getName();
                } else {
                    name5 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime14, 1, name32, name5, z5);
                iECommerceHostService9 = (IECommerceHostService) service9;
            } else {
                iECommerceHostService9 = (IECommerceHostService) C1120604Zw.LIZ.LIZJ().LIZLLL(IApplicationDependencyService.class);
            }
            jSONObject.put("version_name", ((IApplicationDependencyService) iECommerceHostService9).getVersionInfo().LIZ);
            jSONObject.put("locale", C786410Ut5.t2(Locale.getDefault()));
            jSONObject.put("platform", "android");
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime15 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin5 = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin5 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                String name33 = ILocationDependencyService.class.getName();
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin5 != null) {
                    name4 = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin5.getClass().getName();
                } else {
                    name4 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime15, 1, name33, name4, z4);
            } else {
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin5 = (IECommerceHostService) C1120604Zw.LIZ.LIZJ().LIZLLL(ILocationDependencyService.class);
            }
            jSONObject.put("carrier_region", ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin5).getSimCountry());
            jSONObject.put("build_board", Build.BOARD);
            jSONObject.put("build_brand", Build.BRAND);
            jSONObject.put("build_cpu_abi", Build.CPU_ABI);
            jSONObject.put("build_device", Build.DEVICE);
            jSONObject.put("build_manufacturer", Build.MANUFACTURER);
            jSONObject.put("build_model", str2);
            jSONObject.put("build_product", Build.PRODUCT);
            jSONObject.put("is_root", String.valueOf(C0WYJ.LJJ()));
            jSONObject.put("uuid", UUID.randomUUID());
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime16 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String name34 = ILogDependencyService.class.getName();
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 != null) {
                    name3 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2.getClass().getName();
                } else {
                    name3 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime16, 1, name34, name3, z3);
            } else {
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZ.LIZJ().LIZLLL(ILogDependencyService.class);
            }
            jSONObject.put("did", ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2).getServerDeviceId());
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime17 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin6 = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin6 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name35 = ILocationDependencyService.class.getName();
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin6 != null) {
                    name2 = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin6.getClass().getName();
                } else {
                    name2 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime17, 1, name35, name2, z2);
            } else {
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin6 = (IECommerceHostService) C1120604Zw.LIZ.LIZJ().LIZLLL(ILocationDependencyService.class);
            }
            jSONObject.put("priority_region", ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin6).getCurrentRegionCode());
            String strLIZ = C09GB.LIZ();
            if (strLIZ != null) {
                jSONObject.put("ip_address", strLIZ);
            }
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime18 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = AppSettingDependencyService.createIAppSettingDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name36 = IAppSettingDependencyService.class.getName();
                if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime18, 1, name36, name, z);
            } else {
                anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZ.LIZJ().LIZLLL(IAppSettingDependencyService.class);
            }
            jSONObject.put("app_language", ((IAppSettingDependencyService) anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin).getAppLanguage());
            jSONObject.put("time_zone", TimeZone.getDefault().getID());
            jSONObject.put("consultation_id", str);
            jSONObject.put("user_type_new", "user");
            if (nVar != null) {
                try {
                    jSONObject.put("address_id", C2399609ak.LIZJ(nVar, "address_id"));
                    jSONObject.put("amount", C2399609ak.LIZJ(nVar, "amount"));
                    jSONObject.put("sub_merchant_id", nVar.LJJIIZI("sub_merchant_id"));
                    h hVarLJJIIZI = nVar.LJJIIZI("goods_info");
                    jSONObject.put("goods_info", hVarLJJIIZI);
                    if (hVarLJJIIZI.size() > 0) {
                        jSONObject.put("seller_id", C2399609ak.LIZJ(hVarLJJIIZI.LJJIIJZLJL(0).LJIILIIL(), "seller_id"));
                    }
                    LIZ.getClass();
                    JSONObject jSONObjectLIZJ = LIZJ(nVar);
                    Iterator<String> itKeys = jSONObjectLIZJ.keys();
                    while (itKeys.hasNext()) {
                        String next2 = itKeys.next();
                        if (!jSONObject.has(next2)) {
                            jSONObject.put(next2, jSONObjectLIZJ.get(next2));
                        }
                    }
                    objLIZ = Unit.LIZ;
                    C189200o6.m2constructorimpl(objLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    objLIZ = C155000ia.LIZ(th);
                    C189200o6.m2constructorimpl(objLIZ);
                }
                C189200o6.m1boximpl(objLIZ);
            }
            if (list != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((PaymentElement) next).element, "eg_ccdc_global_billing_address_postal_code")) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                PaymentElement paymentElement = (PaymentElement) next;
                if (paymentElement != null) {
                    jSONObject.put("billing_postal_code", paymentElement.paramValue);
                    return jSONObject;
                }
            }
            return jSONObject;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return new JSONObject();
        }
    }
}
