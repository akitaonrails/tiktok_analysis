package X;

import android.content.Context;
import com.bytedance.crash.general.AppInfo;
import com.bytedance.crash.general.HardwareInfo;
import com.bytedance.crash.general.RomInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VeN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802770VeN {
    public static volatile C802770VeN LJI;
    public final C0VSJ LIZ;
    public final Context LIZIZ;
    public volatile AppInfo LIZJ;
    public volatile RomInfo LIZLLL;
    public volatile HardwareInfo LJ;
    public volatile C1284490jWx LJFF;

    public static C802770VeN LIZ() {
        if (LJI == null) {
            synchronized (C802770VeN.class) {
                try {
                    if (LJI == null) {
                        Context contextLJ = C0VX9.LJ();
                        C0VSJ c0vsjLJFF = C0VX9.LJFF();
                        if (contextLJ != null && c0vsjLJFF != null) {
                            LJI = new C802770VeN(contextLJ, c0vsjLJFF);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJI;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:9|(1:18)(2:17|19)|3|4|14) */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJI() {
        /*
            java.lang.String r0 = "/data/local/su"
            java.lang.String r1 = "/data/local/bin/su"
            java.lang.String r2 = "/data/local/xbin/su"
            java.lang.String r3 = "/system/xbin/su"
            java.lang.String r4 = "/system/bin/su"
            java.lang.String r5 = "/system/bin/.ext/su"
            java.lang.String r6 = "/system/bin/failsafe/su"
            java.lang.String r7 = "/system/sd/xbin/su"
            java.lang.String r8 = "/system/usr/we-need-root/su"
            java.lang.String r9 = "/sbin/su"
            java.lang.String r10 = "/su/bin/su"
            java.lang.String[] r4 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            r3 = 0
            r2 = 0
        L1c:
            r1 = r4[r2]
            X.0VSJ r0 = new X.0VSJ     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L2e
            goto L35
        L2a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L2e:
            int r2 = r2 + 1
            r0 = 11
            if (r2 >= r0) goto L36
            goto L1c
        L35:
            r3 = 1
        L36:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802770VeN.LJI():boolean");
    }

    public final AppInfo LIZIZ() {
        if (this.LIZJ == null) {
            synchronized (AppInfo.class) {
                try {
                    if (this.LIZJ == null) {
                        this.LIZJ = AppInfo.get(this.LIZIZ, this.LIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZJ;
    }

    public final HardwareInfo LIZJ() {
        if (this.LJ == null) {
            synchronized (HardwareInfo.class) {
                try {
                    if (this.LJ == null) {
                        this.LJ = HardwareInfo.get(this.LIZIZ, this.LIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LJ;
    }

    public final RomInfo LJFF() {
        if (this.LIZLLL == null) {
            synchronized (RomInfo.class) {
                try {
                    if (this.LIZLLL == null) {
                        this.LIZLLL = RomInfo.get(this.LIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZLLL;
    }

    public static long LIZLLL() {
        C802770VeN c802770VeNLIZ = LIZ();
        if (c802770VeNLIZ != null) {
            return c802770VeNLIZ.LIZJ().getJiffy();
        }
        return -1L;
    }

    public static long LJ(long j) {
        C802770VeN c802770VeNLIZ = LIZ();
        if (c802770VeNLIZ != null) {
            if (j == 0) {
                return c802770VeNLIZ.LIZIZ().mLastUpdateTime;
            }
            AppInfo appInfoFindAppInfo = AppInfo.findAppInfo(c802770VeNLIZ.LIZ, j);
            if (appInfoFindAppInfo != null) {
                return appInfoFindAppInfo.mLastUpdateTime;
            }
        }
        return 0L;
    }

    public C802770VeN(Context context, C0VSJ c0vsj) {
        this.LIZ = C2112008Pe.LIZIZ(c0vsj, "general");
        this.LIZIZ = context;
    }

    public static void LJII(JSONObject jSONObject, long j) {
        AppInfo appInfoFindAppInfo;
        C802770VeN c802770VeNLIZ = LIZ();
        if (c802770VeNLIZ != null) {
            AppInfo appInfoLIZIZ = c802770VeNLIZ.LIZIZ();
            if (j > 0 && j < appInfoLIZIZ.mLastUpdateTime && (appInfoFindAppInfo = AppInfo.findAppInfo(c802770VeNLIZ.LIZ, j)) != null) {
                appInfoLIZIZ = appInfoFindAppInfo;
            }
            appInfoLIZIZ.putTo(jSONObject);
        }
    }
}
