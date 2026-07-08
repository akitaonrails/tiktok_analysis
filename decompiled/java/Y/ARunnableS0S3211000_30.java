package Y;

import X.AbstractC826920WcE;
import X.AnonymousClass1499;
import X.C09JN;
import X.C149B;
import X.C1906580ziK;
import X.C1C7U;
import X.C20222814Aw;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C786410Ut5;
import X.C807400Vlq;
import X.EnumC20222314Ar;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.sec.DmtSec;
import com.ss.android.ugc.aweme.sec.captcha.SecCaptcha;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes31.dex */
public class ARunnableS0S3211000_30 implements Runnable {
    public final int $t;
    public int i6;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;
    public String s2;
    public boolean z5;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$1() {
        if (Keva.getRepo("plugin_repo").getInt("reinstall_check_result", -1) == 2) {
            DmtSec.INSTANCE.tryDelayInitUntilFirstFeed((C149B) this.l3, this.z5, this.s0, this.i6, this.s1, this.s2, (Context) this.l4);
        } else {
            DmtSec.INSTANCE.doDelayInit((C149B) this.l3, this.z5, this.s0, this.i6, this.s1, this.s2, (Context) this.l4);
        }
    }

    public final void LIZ$0() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String sessionId = ((C149B) this.l3).getSessionId();
        if (sessionId == null) {
            sessionId = "";
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initSCCheckUtil getSessionTime = ");
        sbLIZ.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
        C2188811AlT.LIZIZ(sbLIZ);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        DmtSec dmtSec = DmtSec.INSTANCE;
        C20222814Aw msManager = dmtSec.getMsManager();
        if (msManager != null) {
            msManager.LIZIZ(sessionId);
        }
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("init setSessionTime = ");
        sbLIZ2.append(jCurrentTimeMillis4 - jCurrentTimeMillis3);
        C2188811AlT.LIZIZ(sbLIZ2);
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId() != null ? AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId() : "";
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId() != null ? AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId() : "";
        dmtSec.updateCollectMode(null);
        dmtSec.getDeviceConsentService().LJIIJJI(new AbstractC826920WcE() { // from class: X.14Au
            @Override // X.InterfaceC1915870zxJ
            public final void LIZ(EnumC1876780ywG enumC1876780ywG) {
                String strName;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onConsentRecordsUpdated status: ");
                if (enumC1876780ywG != null) {
                    strName = enumC1876780ywG.name();
                } else {
                    strName = null;
                }
                sbLIZ3.append(strName);
                C2188811AlT.LIZIZ(sbLIZ3);
                DmtSec.INSTANCE.updateCollectMode(null);
            }
        });
        dmtSec.fallbackSetDid(dmtSec.getMsManager(), strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId);
        C20222814Aw msManager2 = dmtSec.getMsManager();
        if (msManager2 != null) {
            msManager2.setInstallID(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId);
        }
        if (this.z5) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("initCaptchaParams:did = ");
            sbLIZ3.append(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId);
            sbLIZ3.append("  iid = ");
            sbLIZ3.append(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId);
            sbLIZ3.append("  sid = ");
            sbLIZ3.append(sessionId);
            C2344809Gs.LIZLLL(4, "Sec", C2188811AlT.LIZIZ(sbLIZ3));
            AnonymousClass1499 anonymousClass1499 = new AnonymousClass1499(this.s0, this.i6, this.s1, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, this.s2);
            long jCurrentTimeMillis5 = System.currentTimeMillis();
            DmtSec.captcha = new SecCaptcha(C786410Ut5.N3((Context) this.l4), anonymousClass1499, (C149B) this.l3);
            long jCurrentTimeMillis6 = System.currentTimeMillis();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("init createSecCaptchaTime = ");
            sbLIZ4.append(jCurrentTimeMillis6 - jCurrentTimeMillis5);
            C2188811AlT.LIZIZ(sbLIZ4);
        }
        DmtSec.initSuccess = true;
        C2344809Gs.LIZLLL(4, "Sec", "secInitSuccessFlag");
        DmtSec.finishInitAndProcessPending();
        if (DmtSec.useInitReport.get()) {
            DmtSec.report("init");
        }
        if (DmtSec.useInitColdStartReport.get()) {
            if (DmtSec.curMode != EnumC20222314Ar.COLLECT_MODE_INIT) {
                DmtSec.report("cold_start");
            } else {
                long j = DmtSec.delayColdStartSec.get();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("init cold_start fallback wait ");
                sbLIZ5.append(j);
                C2188811AlT.LIZIZ(sbLIZ5);
                if (j > 0) {
                    final ScheduledExecutorService scheduledExecutorServiceLJ = C807400Vlq.LJ();
                    scheduledExecutorServiceLJ.schedule(new Runnable() { // from class: X.14Ao
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("DmtSec@b504.doInit$1$2");
                            boolean zLJI = MethodIDManager.LJI(196644);
                            try {
                                try {
                                    if (DmtSec.curMode != EnumC20222314Ar.COLLECT_MODE_INIT) {
                                        DmtSec.report("cold_start");
                                    }
                                    scheduledExecutorServiceLJ.shutdown();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    scheduledExecutorServiceLJ.shutdown();
                                    throw th;
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            if (zLJI) {
                                MethodIDManager.LJ();
                            }
                            C1C7U.LIZIZ("DmtSec@b504.doInit$1$2");
                        }
                    }, j, TimeUnit.SECONDS);
                }
            }
        }
        C1906580ziK.LIZJ().LIZ().LJLLLLLL(new C09JN() { // from class: X.14Ap
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DmtSec@b504.doInit$1$3");
                if (((C606810Nr5) obj).LIZIZ) {
                    C20222814Aw msManager3 = DmtSec.INSTANCE.getMsManager();
                    if (msManager3 != null) {
                        msManager3.LIZLLL(2);
                    }
                } else {
                    C20222814Aw msManager4 = DmtSec.INSTANCE.getMsManager();
                    if (msManager4 != null) {
                        msManager4.LIZLLL(1);
                    }
                }
                C1C7U.LIZIZ("DmtSec@b504.doInit$1$3");
            }
        });
    }

    public static final void run$0(ARunnableS0S3211000_30 aRunnableS0S3211000_30) {
        boolean zLIZ;
        C1C7U.LIZ("DmtSec@b504.doInit$1");
        boolean zLJI = MethodIDManager.LJI(196644);
        try {
            aRunnableS0S3211000_30.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        C1C7U.LIZIZ("DmtSec@b504.doInit$1");
    }

    public static final void run$1(ARunnableS0S3211000_30 aRunnableS0S3211000_30) {
        boolean zLIZ;
        C1C7U.LIZ("DmtSec@b504.init$1");
        try {
            aRunnableS0S3211000_30.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DmtSec@b504.init$1");
    }

    public ARunnableS0S3211000_30(Context context, String str, int i, String str2, String str3, boolean z, C149B c149b, int i2) {
        this.$t = i2;
        this.l3 = c149b;
        this.z5 = z;
        this.s0 = str;
        this.i6 = i;
        this.s1 = str2;
        this.s2 = str3;
        this.l4 = context;
    }
}
