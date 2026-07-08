package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0VXU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VXU {
    public static boolean LIZLLL;
    public static int LJ = 100;
    public static int LJFF = 2;
    public static int LJI = 5;
    public static C0VXU LJII;
    public static volatile boolean LJIIIIZZ;
    public long LIZ;
    public final HashMap<String, Long> LIZIZ;
    public final C0VSJ LIZJ;

    public static C0VXU LIZIZ() {
        if (LJII == null) {
            synchronized (C0VXU.class) {
                try {
                    if (LJII == null) {
                        LJII = new C0VXU();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJII;
    }

    public final void LIZLLL() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.LIZ);
            sb.append('\n');
            for (Map.Entry<String, Long> entry : this.LIZIZ.entrySet()) {
                sb.append(entry.getKey());
                sb.append(' ');
                sb.append(entry.getValue());
                sb.append('\n');
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("writeUploadTimesFile:");
            sbLIZ.append((Object) sb);
            C2188811AlT.LIZIZ(sbLIZ);
            C08SE.LJIIIIZZ(this.LIZJ, sb.toString(), false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C801940Vd2.LIZIZ("NPTH_ANR_ERROR_AppMonitor", e);
        }
    }

    public C0VXU() {
        Long lDecode;
        String strLIZJ = C802270VdZ.LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZJ.replace(e3.d, "_").replace(":", "-"));
        sbLIZ.append(".times");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C0VSJ c0vsj = new C0VSJ(C0VX9.LJFF(), "uploadLimits");
        C2112008Pe.LIZJ(c0vsj);
        C0VSJ c0vsj2 = new C0VSJ(c0vsj, strLIZIZ);
        this.LIZJ = c0vsj2;
        HashMap<String, Long> map = new HashMap<>();
        if (c0vsj2.exists()) {
            try {
                JSONArray jSONArrayLJ = C08SE.LJ(c0vsj2);
                if (jSONArrayLJ.length() != 0) {
                    try {
                        lDecode = Long.decode(jSONArrayLJ.optString(0, null));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        lDecode = 0L;
                    }
                    if (System.currentTimeMillis() - lDecode.longValue() >= 86400000) {
                        this.LIZ = System.currentTimeMillis();
                        C08SE.LIZIZ(this.LIZJ);
                    } else {
                        this.LIZ = lDecode.longValue();
                        for (int i = 1; i < jSONArrayLJ.length(); i++) {
                            String[] strArrSplit = jSONArrayLJ.optString(i, "").split(" ");
                            if (strArrSplit.length == 2) {
                                map.put(strArrSplit[0], Long.decode(strArrSplit[1]));
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZ = System.currentTimeMillis();
                C08SE.LIZIZ(this.LIZJ);
            }
        } else {
            this.LIZ = System.currentTimeMillis();
        }
        this.LIZIZ = map;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("upload_times:");
        sbLIZ2.append(map);
        C2188811AlT.LIZIZ(sbLIZ2);
        LJIIIIZZ = true;
    }

    public final synchronized void LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTimes:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        Long l = this.LIZIZ.get(str);
        long jLongValue = 1;
        if (l != null) {
            jLongValue = 1 + l.longValue();
        }
        this.LIZIZ.put(str, Long.valueOf(jLongValue));
    }

    public final synchronized boolean LIZ(long j, String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        Long l = this.LIZIZ.get(str);
        if (l == null) {
            l = 0L;
        }
        if (l.longValue() >= j) {
            z = true;
        }
        return z;
    }
}
