package X;

import Y.ARunnableS134S0100000_34;
import android.app.Activity;
import android.location.LocationManager;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.i18n.region.RegionManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BYV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BYV {
    public static C0TN9 LIZIZ;
    public static boolean LIZLLL;
    public static Boolean LJ;
    public static long LJFF;
    public static long LJI;
    public static final C1BYV LIZ = new C1BYV();
    public static C1BYW LIZJ = C1BYW.LL;
    public static final long LJII = C202094145s.LJIILL;
    public static volatile String LJIIIIZZ = "event_bus";
    public static final C1BYY LJIIIZ = C1BYY.LL;
    public static final ARunnableS134S0100000_34 LJIIJ = new ARunnableS134S0100000_34((Object) null, 69);

    public static void LIZ() {
        if (C305440ByA.LIZ) {
            C1798060wtI c1798060wtI = C1798060wtI.LIZ;
            InterfaceC1798270wtd interfaceC1798270wtd = new InterfaceC1798270wtd() { // from class: X.1BYb
                @Override // X.InterfaceC1798270wtd
                public final void LIZ() {
                    C1798170wtT.LIZIZ = true;
                }

                @Override // X.InterfaceC1798270wtd
                public final void LIZIZ(n nVar) {
                    C1798170wtT.LIZIZ = false;
                    C1BYV.LJI = SystemClock.uptimeMillis();
                    C1BYV.LIZ.getClass();
                    C1BYV.LJII(nVar);
                }
            };
            RegionManager regionManager = C1798060wtI.LIZJ;
            if (!C1798060wtI.LIZIZ() || regionManager == null) {
                C1798060wtI.LJFF.add(interfaceC1798270wtd);
            } else {
                regionManager.LIZJ.add(interfaceC1798270wtd);
            }
        }
        SettingsManager.LIZLLL().LJIIIZ(new InterfaceC304970BxP() { // from class: X.1BYZ
            @Override // X.InterfaceC304970BxP
            public final void LIZ() {
                if (!C305440ByA.LIZ || C1798170wtT.LIZIZ) {
                    C1BYV.LJI = SystemClock.uptimeMillis();
                    C1BYV.LIZ.getClass();
                    C1BYV.LJII(null);
                }
            }
        });
    }

    public static String LJ() {
        List listLIZ;
        C1207340hWW.LIZ.getClass();
        if (C291220BbE.LIZ()) {
            listLIZ = C1207340hWW.LIZLLL().LIZLLL();
            C1207340hWW.LIZLLL().LIZJ("", "fyp", "getBusiness", !listLIZ.isEmpty(), !((ArrayList) C1207340hWW.LIZ()).isEmpty());
        } else {
            listLIZ = C1207340hWW.LIZ();
        }
        if (!listLIZ.isEmpty()) {
            return (String) ListProtector.get(listLIZ, 0);
        }
        return null;
    }

    public static void LJIIIIZZ() {
        C19EG c19eg;
        boolean zLJI;
        String strLJ;
        C1207680hX4.LIZ.getClass();
        if (C1207680hX4.LIZ().enable != null) {
            return;
        }
        Activity activityLJFF = C2214201BlK.LJFF();
        String strLJ2 = null;
        if (!(activityLJFF instanceof C19EG) || (c19eg = (C19EG) activityLJFF) == null) {
            return;
        }
        String strLJ3 = LJ();
        if (strLJ3 != null) {
            C1207340hWW.LIZ.getClass();
            zLJI = C1207340hWW.LJI(strLJ3, "fyp");
        } else {
            zLJI = false;
        }
        if (!LIZLLL()) {
            if (zLJI) {
                C1207400hWc.LIZ.getClass();
                C1207400hWc.LJIILIIL(1);
                return;
            }
            return;
        }
        if (zLJI) {
            C1207400hWc.LIZ.getClass();
            C1207400hWc.LJIILIIL(0);
            if (c19eg.isFinishing()) {
                C1207400hWc.LJIILIIL(2);
                return;
            }
            try {
                C19741112Lp.LIZ.getClass();
                if (C19741112Lp.LIZLLL(c19eg, "android.permission.ACCESS_COARSE_LOCATION")) {
                    C1207400hWc.LIZ.getClass();
                    C1207400hWc.LJIILIIL(4);
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                e.getMessage();
            }
            String strLJ4 = LJ();
            if (C123100dR.LIZ(strLJ4)) {
                C1207340hWW.LIZ.getClass();
                if (C1207340hWW.LJII(strLJ4, "fyp") && (strLJ = LJ()) != null) {
                    C1207340hWW.LIZ.getClass();
                    if (C1207340hWW.LJI(strLJ, "fyp")) {
                        C20489080x.LIZ.getClass();
                        if (C20489080x.LIZLLL().getBoolean("has_consented_location_permission", false)) {
                            LJIIJ(c19eg);
                            C1207400hWc.LIZ.getClass();
                            C1207400hWc.LJIILIIL(12);
                            return;
                        }
                        C1207400hWc.LIZ.getClass();
                        C1207400hWc.LJIILIIL(6);
                        String strLJ5 = LJ();
                        if (strLJ5 != null) {
                            C1207340hWW.LIZ.getClass();
                            strLJ2 = C1207340hWW.LJ(strLJ5, "fyp");
                        }
                        PopupManager.LJIJI(new C20661515t7(c19eg, strLJ2, AFwS281S0000000_34.get$arr$(57)), true);
                        return;
                    }
                }
            }
            LJIIJ(c19eg);
        }
    }

    public static void LIZJ() {
        ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LJIILJJIL();
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || !((IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class)).shouldShowForcedLogin(false)) {
            LJIIIIZZ();
        } else {
            LIZLLL = true;
        }
    }

    public static boolean LIZLLL() {
        boolean z = (!ComplianceServiceProvider.LJIILJJIL().LJII(null) || ((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).isGuestMode() || C10EU.LJIILIIL()) ? false : true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isInAllowLocationMode:");
        sbLIZ.append(z);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("poi", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    public final void LIZIZ() {
        final boolean z;
        String str;
        LJFF = SystemClock.uptimeMillis();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "location_force_init_experiment", true, true)) {
            long j = C0BH8.LIZ;
            if (j == 1 || j == 2) {
                if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                    C823050WQl.LJFF().execute(LJIIJ);
                } else {
                    LJIIJ.run();
                }
            }
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "location_account_event_source", true) == 1) {
            z = true;
            str = "listener";
        } else {
            z = false;
            str = "event_bus";
        }
        LJIIIIZZ = str;
        int iLIZ = C04T3.LIZIZ.LIZ();
        if (iLIZ == 1) {
            C799570VYd.LJFF(false).execute(new Runnable() { // from class: X.1BYT
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LocationPermissionManager@1882.addListeners$1");
                    try {
                        C1BYV.LIZ.LJI(z);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LocationPermissionManager@1882.addListeners$1");
                }
            });
            LIZ();
        } else if (iLIZ == 2) {
            C799570VYd.LJFF(false).execute(new Runnable() { // from class: X.1BYU
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LocationPermissionManager@1882.addListeners$2");
                    try {
                        C1BYV.LIZ.LJI(z);
                        C1BYV.LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LocationPermissionManager@1882.addListeners$2");
                }
            });
        } else {
            LJI(z);
            LIZ();
        }
    }

    public static void LJFF(C1BYW c1byw) {
        LIZJ = c1byw;
        C1207750hXB.LIZ.getClass();
        C1208440hYI.LIZ.getClass();
        C1208440hYI.LIZIZ.getClass();
        C1798620wuC.LIZLLL("LocationController", "deInit: ");
        C1208130hXn.LJJIIJ(true);
        C1207820hXI.LIZ.getClass();
        C1798550wu5.LIZIZ.deInit();
    }

    public static void LJII(n nVar) {
        ARunnableS134S0100000_34 aRunnableS134S0100000_34;
        if (nVar != null) {
            LIZ.getClass();
            aRunnableS134S0100000_34 = new ARunnableS134S0100000_34(nVar, 69);
        } else {
            aRunnableS134S0100000_34 = LJIIJ;
        }
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            C823050WQl.LJFF().execute(aRunnableS134S0100000_34);
        } else {
            aRunnableS134S0100000_34.run();
        }
    }

    public static void LJIIIZ(C1BYW c1byw) {
        String str;
        String str2;
        ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJIFFI(AFwS256S0000000_18.get$arr$(952), C1606660rua.LIZIZ.LJII());
        ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIILL();
        C1207400hWc.LIZ.getClass();
        C20489080x.LIZ.getClass();
        boolean z = !C20489080x.LIZLLL().contains("location_permission_is_allow");
        boolean z2 = C20489080x.LIZLLL().getBoolean("location_permission_is_allow", false);
        C844470XAv.LIZ.getClass();
        boolean zLIZIZ = C1207400hWc.LIZIZ(C844470XAv.LIZ());
        if (z2) {
            if (zLIZIZ) {
                str = "long_term_permission";
            } else {
                str = "short_term_permission";
            }
        } else if (!z2) {
            if (zLIZIZ) {
                str = "deny_and_change";
            } else {
                str = "long_term_deny";
            }
        } else {
            throw new C1954807lC();
        }
        if (z || zLIZIZ != z2) {
            C20489080x.LIZLLL().storeBoolean("location_permission_is_allow", zLIZIZ);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!z) {
            linkedHashMap.put("app_status", str);
        }
        if (Intrinsics.LJFF(str, "long_term_permission")) {
            linkedHashMap.put("system_status", String.valueOf(((LocationManager) C786410Ut5.H2(C844470XAv.LIZ(), "location")).isProviderEnabled("gps") ? 1 : 0));
        }
        C20684815ws.LJIILLIIL("location_permission_status", linkedHashMap);
        boolean zLIZJ = C145T.LIZJ();
        C185100nR c185100nR = C185100nR.LIZ;
        final String str3 = LJIIIIZZ;
        boolean z3 = C305440ByA.LIZ;
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportDeinitBeforeInit: ");
        sbLIZ.append(str3);
        sbLIZ.append(' ');
        sbLIZ.append(zLIZJ ? 1 : 0);
        sbLIZ.append(' ');
        sbLIZ.append(z3 ? 1 : 0);
        C1798620wuC.LIZLLL("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (!C185100nR.LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportDeinitBeforeInit: not initialized");
        } else {
            BPEAHandler bPEAHandler = C185100nR.LIZIZ;
            final int i = zLIZJ ? 1 : 0;
            final int i2 = z3 ? 1 : 0;
            C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.00nZ
                public final void LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    String str4 = str3;
                    int i3 = i;
                    int i4 = i2;
                    jSONObject.put("event_source", str4);
                    jSONObject.put("deinit", i3);
                    jSONObject.put("new_flow", i4);
                    C185100nR.LIZIZ(C185100nR.LIZ, "deinit_before_init", jSONObject, null, 12);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SdkMonitorWrapper@f316.reportDeinitBeforeInit$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportDeinitBeforeInit$1");
                }
            });
        }
        if (zLIZJ) {
            C1207820hXI.LIZ.getClass();
            C1798550wu5.LIZIZ.deInit();
        }
        int iOrdinal = c1byw.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    str2 = "Unknown";
                } else {
                    str2 = "account_switch";
                }
            } else {
                str2 = "login";
            }
        } else {
            str2 = "cold_start";
        }
        C1207820hXI.LIZ.LIZIZ(str2, Long.valueOf(LJII), Long.valueOf(LJFF), Long.valueOf(LJI), null, "auto");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0TN9, X.15sG] */
    public static void LJIIJ(final C19EG c19eg) {
        C20489080x.LIZ.getClass();
        if (C20489080x.LIZLLL().getBoolean("has_deny_location_permission_manually", false)) {
            C1207400hWc.LIZ.getClass();
            C1207400hWc.LJIILIIL(9);
        } else {
            final AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19eg, 2605);
            ?? r1 = new C10GR(c19eg, awS562S0100000_18) { // from class: X.0TN9
                public final C19EG LL;
                public final Function0<Unit> LLILLJJLI;
                public final int LLILLL = 220;

                @Override // X.InterfaceC20660415sw
                public final C688120Qyw i2() {
                    C19EG c19eg2 = this.LL;
                    return new C688120Qyw(c19eg2, c19eg2, null);
                }

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return this.LLILLL;
                }

                {
                    this.LL = c19eg;
                    this.LLILLJJLI = awS562S0100000_18;
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    Function0<Unit> function0 = this.LLILLJJLI;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            };
            LIZIZ = r1;
            PopupManager.LJIJI(r1, true);
        }
    }

    public final void LJI(boolean z) {
        if (z) {
            C0XQ7.LJ();
            C0XQ7.LIZ.LJIILL(LJIIIZ);
        } else {
            C622680Oba.LIZJ(this);
        }
    }

    @C14EU
    public final void onUserStateChangeEvent(C486550J6f c486550J6f) {
        LJFF = SystemClock.uptimeMillis();
        LJI = SystemClock.uptimeMillis();
        int i = c486550J6f.LIZ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    LJFF(C1BYW.LLILZ);
                    return;
                }
                return;
            }
            LJFF(C1BYW.LLILLL);
            return;
        }
        LJFF(C1BYW.LLILLJJLI);
    }
}
