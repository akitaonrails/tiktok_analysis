package X;

import android.os.SystemClock;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0X9Y, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X9Y {
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static final C0X9Y LIZ = new C0X9Y();
    public static final PthreadTimer LJ = new PthreadTimer("DfPreloadManagerV2");

    public static boolean LIZ(final String str) {
        final C013C c013c = new C013C();
        c013c.element = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("begin download df: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        C844020X9c c844020X9c = new C844020X9c();
        c844020X9c.LIZ = str;
        c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.0X9b
            @Override // X.InterfaceC842850X4p
            public final void LIZJ(String str2, boolean z) {
                C0X9Y.LIZ.getClass();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("download df: ");
                sbLIZ2.append(str);
                sbLIZ2.append(' ');
                sbLIZ2.append(str2);
                sbLIZ2.append(" onSuccess");
                C2188811AlT.LIZIZ(sbLIZ2);
                c013c.element = true;
            }

            @Override // X.InterfaceC842850X4p
            public final void LIZ(int i, String str2, boolean z) {
                c013c.element = false;
                C0X9Y.LIZ.getClass();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("install ");
                sbLIZ2.append(str2);
                sbLIZ2.append(" failed, reason: ");
                sbLIZ2.append(i);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        };
        c844020X9c.LIZIZ = true;
        c844020X9c.LJI = -10;
        iPluginService.LJJI(new C202068144s(c844020X9c));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("finish download df: ");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
        return c013c.element;
    }

    public static void LIZIZ(Pair[] pairArr, final int i) {
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        for (Pair pair : pairArr) {
            final String str = (String) pair.getFirst();
            final long jLongValue = ((Number) ((Function0) pair.getSecond()).invoke()).longValue();
            if (jLongValue < 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("do not preload ");
                sbLIZ.append(str);
                sbLIZ.append(" config: ");
                sbLIZ.append(jLongValue);
                C2188811AlT.LIZIZ(sbLIZ);
            } else if (a0.LJJIIZI(str, e3.d, false)) {
                if (jLongValue == 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(" config: ");
                    sbLIZ2.append(jLongValue);
                    sbLIZ2.append(", preload right away");
                    C2188811AlT.LIZIZ(sbLIZ2);
                    if (iPluginService.checkPluginInstalled(str)) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("already installed: ");
                        sbLIZ3.append(str);
                        C2188811AlT.LIZIZ(sbLIZ3);
                    } else {
                        LIZJ(i, str);
                    }
                } else {
                    LJ.schedule(new C0W9W() { // from class: X.0THd
                        public final void LIZ() {
                            C0X9Y.LIZ.getClass();
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("schedule task ");
                            sbLIZ4.append(str);
                            sbLIZ4.append(" with config: ");
                            sbLIZ4.append(jLongValue);
                            C2188811AlT.LIZIZ(sbLIZ4);
                            C0X9Y.LIZJ(i, str);
                        }

                        @Override // java.util.TimerTask, java.lang.Runnable
                        public final void run() {
                            C1C7U.LIZ("DfPreloadManagerV2@5128.preloadByCustomCfg$1");
                            boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                            try {
                                LIZ();
                            } finally {
                            }
                            if (zLJ) {
                                C0W9U.LJFF();
                            }
                            C1C7U.LIZIZ("DfPreloadManagerV2@5128.preloadByCustomCfg$1");
                        }
                    }, jLongValue);
                }
            }
        }
    }

    public static void LIZJ(int i, String str) {
        boolean zLIZ;
        String str2;
        for (int i2 = i; i2 > 0; i2--) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadWithRetry   ");
            sbLIZ.append(str);
            sbLIZ.append("   -------> ");
            sbLIZ.append(i2);
            C2188811AlT.LIZIZ(sbLIZ);
            String str3 = "unknown";
            if ((C08Q0.LIZIZ(C1BWL.LIZ(), 0, "ab_resaltas_event") & 16) == 16) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    Object[] objArr = new Object[4];
                    objArr[0] = FollowStatusChangeMethod.PARAM_UID;
                    if (str == null) {
                        str2 = "unknown";
                    } else {
                        str2 = str;
                    }
                    objArr[1] = str2;
                    objArr[2] = "version";
                    objArr[3] = "v2";
                    C08TG.LIZJ("df_preload", "start", C08TG.LIZIZ(objArr));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                zLIZ = LIZ(str);
                try {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    Object[] objArr2 = new Object[8];
                    objArr2[0] = FollowStatusChangeMethod.PARAM_UID;
                    if (str != null) {
                        str3 = str;
                    }
                    objArr2[1] = str3;
                    objArr2[2] = "version";
                    objArr2[3] = "v2";
                    objArr2[4] = "cost_ms";
                    objArr2[5] = Long.valueOf(jElapsedRealtime2);
                    objArr2[6] = "result";
                    objArr2[7] = Boolean.valueOf(zLIZ);
                    C08TG.LIZJ("df_preload", "finish", C08TG.LIZIZ(objArr2));
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            } else {
                zLIZ = LIZ(str);
            }
            if (zLIZ) {
                return;
            }
        }
    }
}
