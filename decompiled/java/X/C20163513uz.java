package X;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.GuestModeDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.compliance.TpcConsentDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.launcher.LauncherDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IGuestModeDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.ITpcConsentDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.ILauncherDependencyService;
import com.ss.android.ugc.aweme.ecommerce.sec.EcomCsSdkTokenModel;
import com.tts.mobsec.oecsec.ov.CSManagerUtils;
import cs.bd.o.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13uz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20163513uz {
    public static boolean LIZLLL;
    public static boolean LJ;
    public static C20164313v7 LJFF;
    public static C20164413v8 LJI;
    public static boolean LJIIJJI;
    public static final C20163513uz LIZ = new C20163513uz();
    public static final C13LK LIZIZ = new C13LK();
    public static String LIZJ = "";
    public static final ArrayList<String> LJII = new ArrayList<>();
    public static int LJIIIIZZ = 5;
    public static final ScheduledExecutorService LJIIIZ = C807400Vlq.LJ();
    public static int LJIIJ = 5;
    public static final C20164213v6 LJIIL = C20164213v6.LIZ;
    public static boolean LJIILIIL = true;

    public static void LIZ() {
        if (C20163313ux.LIZ.abBtm && !LIZLLL) {
            BtmSDK.INSTANCE.registerBtmPageCallback(LJIIL);
            LIZLLL = true;
        }
        LJIIIZ.schedule(new Runnable() { // from class: X.13v0
            public static void LIZ() {
                String sessionId;
                AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
                AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2;
                AnonymousClass0317 anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin;
                try {
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin = LauncherDependencyService.createILauncherDependencyServicebyMonsterPlugin(false);
                        C1AQS.LIZJ(jElapsedRealtime, 1, ILauncherDependencyService.class.getName(), anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin != null);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILauncherDependencyService.class);
                    }
                    sessionId = ((ILauncherDependencyService) anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin).getSessionId();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sessionId = "";
                }
                C20163513uz c20163513uz = C20163513uz.LIZ;
                c20163513uz.getClass();
                C20164313v7 c20164313v7 = C20163513uz.LJFF;
                if (c20164313v7 != null) {
                    c20164313v7.LIZIZ(sessionId);
                }
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                    C1AQS.LIZJ(jElapsedRealtime2, 1, ILogDependencyService.class.getName(), anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                }
                String serverDeviceId = ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getServerDeviceId();
                if (serverDeviceId == null) {
                    serverDeviceId = "";
                }
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                    C1AQS.LIZJ(jElapsedRealtime3, 1, ILogDependencyService.class.getName(), anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 != null ? anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2.getClass().getName() : null, anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                }
                String installId = ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2).getInstallId();
                if (installId == null) {
                    installId = "";
                }
                c20163513uz.LJIIJJI();
                C20164313v7 c20164313v72 = C20163513uz.LJFF;
                if (c20164313v72 != null) {
                    c20164313v72.setDeviceID(serverDeviceId);
                }
                C20164313v7 c20164313v73 = C20163513uz.LJFF;
                if (c20164313v73 != null) {
                    c20164313v73.setInstallID(installId);
                }
                C20163513uz.LJ = true;
                synchronized (c20163513uz) {
                    try {
                        ArrayList<String> arrayList = C20163513uz.LJII;
                        if (true ^ arrayList.isEmpty()) {
                            Iterator<String> it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                C20163513uz.LJIIIIZZ(it2.next());
                            }
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("GecSec@68cf.doInit$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("GecSec@68cf.doInit$1");
            }
        }, 3000L, TimeUnit.MILLISECONDS);
    }

    public static final String LIZJ() {
        String str = "v10.02.10-ov-android".length() > 0 ? "v10.02.10-ov-android" : "notSet";
        C19304810fm.LIZ.getClass();
        String str2 = C19304810fm.LIZIZ.csLibraVer;
        if (str2.length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ != null) {
                return strLIZIZ;
            }
        }
        return str;
    }

    public final void LJIIJJI() {
        AnonymousClass0317 anonymousClass0317CreateIGuestModeDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateITpcConsentDependencyServicebyMonsterPlugin;
        Map<String, Object> map = C20163313ux.LIZ.csSwitch;
        if (!(map.get("add_fld") instanceof String) || !Intrinsics.LJFF(map.get("add_fld"), "1")) {
            LJI(Integer.valueOf(LJIIJ));
            return;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIGuestModeDependencyServicebyMonsterPlugin = GuestModeDependencyService.createIGuestModeDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IGuestModeDependencyService.class.getName(), anonymousClass0317CreateIGuestModeDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIGuestModeDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIGuestModeDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIGuestModeDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IGuestModeDependencyService.class);
        }
        if (Intrinsics.LJFF(((IGuestModeDependencyService) anonymousClass0317CreateIGuestModeDependencyServicebyMonsterPlugin).isGuestMode(), Boolean.TRUE)) {
            LJI(504);
            return;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateITpcConsentDependencyServicebyMonsterPlugin = TpcConsentDependencyService.createITpcConsentDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime2, 1, ITpcConsentDependencyService.class.getName(), anonymousClass0317CreateITpcConsentDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateITpcConsentDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateITpcConsentDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateITpcConsentDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ITpcConsentDependencyService.class);
        }
        EnumC1914030zuL region = ((ITpcConsentDependencyService) anonymousClass0317CreateITpcConsentDependencyServicebyMonsterPlugin).getRegion();
        if (region == null) {
            LJI(5);
        } else if (region == EnumC1914030zuL.US || region == EnumC1914030zuL.EU) {
            LJI(503);
        } else {
            LJI(603);
        }
    }

    public static void LJIIJ() {
        if (C0CN5.LJII()) {
            LIZ();
        } else {
            C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.13v5
                @Override // X.InterfaceC1006670cIr
                public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                    if (c1602200rnO2.LIZJ()) {
                        C20163513uz.LIZ.getClass();
                        if (C20163513uz.LJIILIIL) {
                            C20163513uz.LJIILIIL = false;
                            C20163513uz.LIZ();
                        }
                        C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
                    }
                }
            });
            C786410Ut5.LJLIIL(2500L, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.13v4
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("GecSec@68cf.tryDelayInitUntilFirstFeed$2");
                    try {
                        C20163513uz.LIZ.getClass();
                        if (C20163513uz.LJIILIIL) {
                            C20163513uz.LJIILIIL = false;
                            C20163513uz.LIZ();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("GecSec@68cf.tryDelayInitUntilFirstFeed$2");
                }
            });
        }
    }

    public static final void LJII(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (CSManagerUtils.class) {
            f1.LIZIZ(context);
        }
        EcomCsSdkTokenModel ecomCsSdkTokenModel = C1784260wX2.LIZ;
        if (ecomCsSdkTokenModel.enableTk) {
            String str = ecomCsSdkTokenModel.tk;
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(ecomCsSdkTokenModel.tkId);
            if ((!a0.LJJJIL(str)) && numLJIIJJI != null) {
                CSManagerUtils.setLiteTokenInfoNative(true, numLJIIJJI.intValue(), str);
            } else {
                CSManagerUtils.setLiteTokenInfoNative(false, 0, "");
            }
        }
        LJIIIZ(System.currentTimeMillis() - jCurrentTimeMillis, "si_lite_impl");
    }

    public static final synchronized void LJIIIIZZ(String str) {
        C20164313v7 c20164313v7;
        if (LJ) {
            if (LJIIIIZZ == 5) {
                LIZ.LJIIJJI();
            }
            C20164413v8 c20164413v8 = LJI;
            if (c20164413v8 != null && (c20164313v7 = c20164413v8.LIZ) != null) {
                c20164313v7.report(str);
            }
        } else {
            LJII.add(str);
        }
    }

    public final void LJI(Integer num) {
        C20164313v7 c20164313v7;
        synchronized (this) {
            if (num != null) {
                try {
                    LJIIIIZZ = num.intValue();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (num != null && (c20164313v7 = LJFF) != null) {
            c20164313v7.LIZ(num.intValue());
        }
    }

    public static final void LIZIZ(int i, String str) {
        try {
            if (LJIIJJI) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject2.put("err_code", i);
                if (str != null && str.length() != 0) {
                    jSONObject2.put("err_type", str);
                }
                C2119008Rw.LJII().LIZJ("cs_glue_event", jSONObject, jSONObject2, jSONObject3);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final void LJIIIZ(long j, String str) {
        C19304810fm.LIZ.getClass();
        if (!C19304810fm.LIZIZ.csSignCountRep) {
            return;
        }
        try {
            if (LJIIJJI) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject2.put("type", "si_ts");
                jSONObject2.put("pos", str);
                jSONObject2.put("duration", j);
                C2119008Rw.LJII().LIZJ("lite_sign", jSONObject, jSONObject2, jSONObject3);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final synchronized void LJFF(Context context, int i, String str) {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        if (LJIIJJI) {
            return;
        }
        try {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = ILogDependencyService.class.getName();
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
            }
            String serverDeviceId = ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getServerDeviceId();
            if (serverDeviceId == null) {
                serverDeviceId = "";
            }
            if (C2119008Rw.LJII().LJI(context, serverDeviceId, String.valueOf(i), str)) {
                LJIIJJI = true;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final void LJ(Context context, String str, String str2, int i, String str3, String str4) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ILogDependencyService iLogDependencyServiceCreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
            if (iLogDependencyServiceCreateILogDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = ILogDependencyService.class.getName();
            if (iLogDependencyServiceCreateILogDependencyServicebyMonsterPlugin != null) {
                name = iLogDependencyServiceCreateILogDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            iECommerceHostService = iLogDependencyServiceCreateILogDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
        }
        ILogDependencyService iLogDependencyService = (ILogDependencyService) iECommerceHostService;
        String serverDeviceId = iLogDependencyService.getServerDeviceId();
        String str5 = "";
        if (serverDeviceId == null) {
            serverDeviceId = "";
        }
        String installId = iLogDependencyService.getInstallId();
        if (installId != null) {
            str5 = installId;
        }
        new C149X(context, new C202200149u(str, str2, i, str3, str5, serverDeviceId, str4, C0CGR.LIZ.delayBackupDuration, !C1497080p3q.LJFF() ? 1 : 0, C0CGR.LIZ(), C00J8.LIZ()));
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2 A[Catch: all -> 0x0124, TryCatch #0 {all -> 0x0124, blocks: (B:51:0x00a1, B:53:0x00b2, B:57:0x00cf, B:59:0x00d7, B:60:0x00df, B:63:0x00f8, B:67:0x0114, B:69:0x011a, B:62:0x00e9), top: B:114:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9 A[Catch: all -> 0x0124, TryCatch #0 {all -> 0x0124, blocks: (B:51:0x00a1, B:53:0x00b2, B:57:0x00cf, B:59:0x00d7, B:60:0x00df, B:63:0x00f8, B:67:0x0114, B:69:0x011a, B:62:0x00e9), top: B:114:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(android.content.Context r18, java.lang.String r19, java.lang.String r20, int r21, java.lang.String r22, java.lang.String r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20163513uz.LIZLLL(android.content.Context, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, boolean, boolean):void");
    }
}
