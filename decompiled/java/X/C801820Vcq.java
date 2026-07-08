package X;

import android.os.Process;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.dumper.MemoryInfo;
import com.bytedance.crash.dumper.Scraps;
import com.bytedance.crash.entity.Header;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vcq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801820Vcq {
    public static C801830Vcr LIZ(C802790VeP c802790VeP, String str, long j, String str2, Map map, Map map2) {
        C801830Vcr c801830Vcr = new C801830Vcr();
        try {
            C799500VXw c799500VXw = c802790VeP.LJIIJJI;
            if (c799500VXw != null) {
                C0VJO.LIZLLL(c801830Vcr.LIZ, c799500VXw.LIZJ(CrashType.DART));
            }
            c801830Vcr.LIZJ("is_dart", 1);
            c801830Vcr.LIZJ("data", str2);
            c801830Vcr.LIZJ("crash_time", Long.valueOf(j));
            c801830Vcr.LIZJ("crash_thread_name", str);
            c801830Vcr.LIZJ("process_name", C802270VdZ.LIZJ());
            c801830Vcr.LIZJ("app_start_time", Long.valueOf(C0VX9.LIZJ()));
            c801830Vcr.LIZJ("upload_scene", "direct");
            MemoryInfo.LIZIZ(c801830Vcr.LIZ, null);
            Scraps.pushTo(c801830Vcr.LIZ);
            if (C802260VdY.LJIIIIZZ && map != null) {
                JSONObject jSONObject = new JSONObject();
                C0VJO.LJIIIZ(jSONObject, map);
                if (map2 != null) {
                    C0VJO.LJIIIZ(jSONObject, map2);
                }
                c801830Vcr.LIZJ("custom", jSONObject);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Header headerLIZIZ = Header.LIZIZ(c802790VeP, j, CrashType.DART, Process.myPid());
        c801830Vcr.LIZJ("header", headerLIZIZ.LIZ);
        c801830Vcr.LIZIZ = headerLIZIZ;
        return c801830Vcr;
    }
}
