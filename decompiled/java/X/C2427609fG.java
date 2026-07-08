package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09fG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2427609fG {
    public static final Keva LIZ = Keva.getRepo("storage_info");

    public static long LIZ(Context context) {
        long length = 0;
        try {
            String str = context.getApplicationInfo().publicSourceDir;
            if (str != null) {
                C0VSJ c0vsj = new C0VSJ(str);
                if (c0vsj.exists()) {
                    length = c0vsj.length();
                }
            }
            String[] strArr = context.getApplicationInfo().splitPublicSourceDirs;
            if (strArr != null && strArr.length > 0) {
                for (String str2 : strArr) {
                    C0VSJ c0vsj2 = new C0VSJ(str2);
                    if (c0vsj2.exists()) {
                        length += c0vsj2.length();
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return length;
    }

    public static void LIZIZ(Context context) {
        long jLIZIZ;
        long totalSpace;
        boolean z;
        File fileX2;
        Keva keva = LIZ;
        long freeSpace = 0;
        if (C1387310mCn.LJFF(keva.getLong("STORAGE_INFO_LAST_REPORT_TIME", 0L))) {
            return;
        }
        try {
            keva.storeLong("STORAGE_INFO_LAST_REPORT_TIME", System.currentTimeMillis());
            JSONObject jSONObject = new JSONObject();
            long jLIZIZ2 = C2259808tI.LIZIZ(C786410Ut5.w2(context).getParent());
            long jLIZIZ3 = C2259808tI.LIZIZ(C786410Ut5.x2(context).getParent());
            File fileLJIIIZ = C2427009fA.LJIIIZ(context);
            if (fileLJIIIZ != null) {
                jLIZIZ = C2259808tI.LIZIZ(fileLJIIIZ.getParent());
            } else {
                jLIZIZ = 0;
            }
            jSONObject.put("private_size", jLIZIZ2);
            jSONObject.put("external_size", jLIZIZ3);
            jSONObject.put("sdcard_size", jLIZIZ);
            jSONObject.put("total_size", jLIZIZ2 + jLIZIZ3);
            try {
                fileX2 = C786410Ut5.x2(context);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (fileX2 != null) {
                totalSpace = fileX2.getTotalSpace();
            } else {
                totalSpace = 0;
            }
            jSONObject.put("device_size", totalSpace);
            try {
                File fileX22 = C786410Ut5.x2(context);
                if (fileX22 != null) {
                    freeSpace = fileX22.getFreeSpace();
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            jSONObject.put("available_size", freeSpace);
            jSONObject.put("apk_size", LIZ(context));
            if (C2427009fA.LJIIL() && C2427309fD.LIZ(context) != null && C2427309fD.LIZ(context).LIZJ()) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("strategy_enabled", z);
            C2206861BYu.LIZ(context, jSONObject);
            C793770VBv.LJ("disk_usage", jSONObject);
            C786410Ut5.J3(jSONObject);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }
}
