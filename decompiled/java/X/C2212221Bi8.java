package X;

import Y.ARunnableS134S0100000_34;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bi8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212221Bi8 {
    public static volatile C2212221Bi8 LIZIZ;
    public final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();

    public static C2212221Bi8 LIZIZ() {
        if (LIZIZ == null) {
            synchronized (C2212221Bi8.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C2212221Bi8();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZLLL() {
        if (C2212231Bi9.LJJIIJ) {
            if (Math.abs(System.currentTimeMillis() - C2212141Bi0.LJIIIIZZ().LIZJ.LIZJ("clear_local_cache_time", 0L)) < Math.min(C2212231Bi9.LJJIII, 3600000L)) {
                return;
            }
            C2212231Bi9.LJFF.execute(new ARunnableS134S0100000_34(this, 83));
        }
    }

    public final void LJ() {
        ConcurrentHashMap<String, String> concurrentHashMap = this.LIZ;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : this.LIZ.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                C0VSJ c0vsj = new C0VSJ(key);
                if (c0vsj.exists() && !C2212141Bi0.LJIIIIZZ().LJIILJJIL(value)) {
                    c0vsj.delete();
                }
            }
        }
        this.LIZ.clear();
    }

    public static void LIZ(String str) {
        File[] fileArrListFiles;
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.exists() && (fileArrListFiles = c0vsj.listFiles()) != null && fileArrListFiles.length > 0) {
                for (File file : fileArrListFiles) {
                    long j = C2212231Bi9.LJJIII;
                    if (file != null) {
                        if (j <= 0 || System.currentTimeMillis() - file.lastModified() > j) {
                            if (file.exists()) {
                                file.delete();
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("file ");
                            sbLIZ.append(str);
                            sbLIZ.append(" is expired, delete it");
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("file ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(" is expired, delete it");
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZJ(String str, boolean z) {
        String str2;
        try {
            long jLIZLLL = C1293980jmG.LIZLLL(new C0VSJ(str)) / 1024;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key_splash_cache_size", jLIZLLL);
            if (z) {
                str2 = "service_ad_extra_res_disk_cache_size_in_mb";
            } else {
                str2 = "service_ad_res_disk_cache_size_in_mb";
            }
            C2212291BiF.LIZLLL().LJI(str2, jSONObject, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
