package X;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Debug;
import android.os.SystemClock;
import com.bytedance.tailor.Tailor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.09bj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2405709bj {
    public static Application LIZ;

    public static void LIZ(C2406409bq c2406409bq, boolean z, String str) {
        if (c2406409bq.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dumpHprofAndAppInfo exceptionType:");
            sbLIZ.append("oom");
            sbLIZ.append(" channel:");
            sbLIZ.append(str);
            C2223208nO.LIZ("MemDump", C2188811AlT.LIZIZ(sbLIZ));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!c2406409bq.LIZ && jCurrentTimeMillis - C810670Vr7.LIZJ(LIZ, 0, "hprof_swift").getLong("last_oom_time", 0L) <= C2406809bu.LIZ) {
            return;
        }
        try {
            C2406109bn.LIZ().LIZ(1, 0L, c2406409bq.LIZ);
            long jUptimeMillis = SystemClock.uptimeMillis();
            LIZJ(c2406409bq, z, str);
            SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(LIZ, 0, "hprof_swift").edit();
            editorEdit.putLong("last_oom_time", jCurrentTimeMillis);
            editorEdit.apply();
            long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
            if (c2406409bq.LIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("dumpHprofAndAppInfo cost(s):");
                sbLIZ2.append(jUptimeMillis2 / 1000);
                C2223208nO.LIZ("MemDump", C2188811AlT.LIZIZ(sbLIZ2));
            }
            C2406109bn.LIZ().LIZ(2, jUptimeMillis2, c2406409bq.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2406109bn.LIZ().LIZ(3, 0L, c2406409bq.LIZ);
            SharedPreferences.Editor editorEdit2 = C810670Vr7.LIZJ(LIZ, 0, "hprof_swift").edit();
            editorEdit2.putLong("last_oom_time", 0L);
            editorEdit2.apply();
            if (!c2406409bq.LIZ) {
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("dumpHprofAndAppInfo: ");
            sbLIZ3.append(th.getMessage());
            C2223208nO.LIZ("MemDump", C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C0VSJ r21, java.lang.String r22, java.lang.String r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2405709bj.LIZIZ(X.0VSJ, java.lang.String, java.lang.String):void");
    }

    public static void LIZJ(C2406409bq c2406409bq, boolean z, String str) {
        String strValueOf = String.valueOf(System.currentTimeMillis());
        File fileLIZIZ = C2223108nN.LIZIZ();
        if (fileLIZIZ == null) {
            return;
        }
        if ("chaos_hprof_test".equals(str) && fileLIZIZ.exists() && fileLIZIZ.isDirectory()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("deleteDirectory hprofRootDir:");
            sbLIZ.append(fileLIZIZ.getAbsolutePath());
            C2223208nO.LIZ("MemDump", C2188811AlT.LIZIZ(sbLIZ));
            C2223108nN.LIZ(fileLIZIZ);
        }
        C0VSJ c0vsj = new C0VSJ(fileLIZIZ, strValueOf);
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        try {
            LIZIZ(c0vsj, str, strValueOf);
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strValueOf);
                sbLIZ2.append(".hprof");
                C0VSJ c0vsj2 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ2));
                if (c2406409bq.LIZ) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("saveAppInfoAndDumpHprofAfterException start dump:");
                    sbLIZ3.append(c0vsj2.getAbsolutePath());
                    C2223208nO.LIZ("MemDump", C2188811AlT.LIZIZ(sbLIZ3));
                }
                if (z) {
                    Tailor.dumpHprofData(c0vsj2.getAbsolutePath(), true);
                } else {
                    Debug.dumpHprofData(c0vsj2.getAbsolutePath());
                }
                if (c2406409bq.LIZ) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("saveAppInfoAndDumpHprofAfterException end length(M):");
                    sbLIZ4.append((c0vsj2.length() / 1024) / 1024);
                    C2223208nO.LIZ("MemDump", C2188811AlT.LIZIZ(sbLIZ4));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (c2406409bq.LIZ) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("dumpHprof: ");
                    sbLIZ5.append(e.getMessage());
                    C2223208nO.LIZ("MemDump", C2188811AlT.LIZIZ(sbLIZ5));
                }
            }
            if (c2406409bq.LIZ) {
                C2223208nO.LIZ("MemDump", "compress and report now");
                C2223108nN.LIZJ(c0vsj, true, z);
                C1501930pBf.LIZJ(c2406409bq, c0vsj, str, null, null);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
