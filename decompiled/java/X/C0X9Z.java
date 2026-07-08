package X;

import android.os.SystemClock;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0X9Z, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X9Z {
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static final C0X9Z LIZ = new C0X9Z();
    public static final PthreadTimer LJ = new PthreadTimer("DfPreloadManager");

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
        c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.0X9a
            @Override // X.InterfaceC842850X4p
            public final void LIZJ(String str2, boolean z) {
                C0X9Z.LIZ.getClass();
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
                C0X9Z.LIZ.getClass();
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

    public static void LIZIZ(int i, String[] strArr) {
        long jElapsedRealtime;
        Object[] objArr;
        String str;
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        int i2 = 0;
        for (String str2 : strArr) {
            if (a0.LJJIIZI(str2, e3.d, false)) {
                if (iPluginService.checkPluginInstalled(str2)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("already installed: ");
                    sbLIZ.append(str2);
                    C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("preloadWithRetry   ");
                    sbLIZ2.append(str2);
                    sbLIZ2.append("   -------> ");
                    sbLIZ2.append(1);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    String str3 = "unknown";
                    if ((C08Q0.LIZIZ(C1BWL.LIZ(), 0, "ab_resaltas_event") & 16) == 16) {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[0] = FollowStatusChangeMethod.PARAM_UID;
                            if (str2 == null) {
                                str = "unknown";
                            } else {
                                str = str2;
                            }
                            objArr2[1] = str;
                            objArr2[2] = "version";
                            objArr2[3] = "v1";
                            C08TG.LIZJ("df_preload", "start", C08TG.LIZIZ(objArr2));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        boolean zLIZ = LIZ(str2);
                        try {
                            jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                            objArr = new Object[8];
                            objArr[0] = FollowStatusChangeMethod.PARAM_UID;
                            if (str2 != null) {
                                str3 = str2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            objArr[1] = str3;
                            objArr[2] = "version";
                            objArr[3] = "v1";
                            objArr[4] = "cost_ms";
                            objArr[5] = Long.valueOf(jElapsedRealtime);
                            objArr[6] = "result";
                            objArr[7] = Boolean.valueOf(zLIZ);
                            C08TG.LIZJ("df_preload", "finish", C08TG.LIZIZ(objArr));
                        } catch (Throwable th3) {
                            th = th3;
                            TryCatchGuardChecker.doCheck(th);
                        }
                    } else {
                        LIZ(str2);
                    }
                    i2++;
                    if (i2 >= i) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("already hit limit size: ");
                        sbLIZ3.append(i);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        return;
                    }
                }
            }
        }
    }
}
