package X;

import android.app.ActivityManager;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.13l3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20101913l3 {
    public static final HashMap<String, C20101913l3> LJFF = new HashMap<>();
    public final Context LIZ;
    public final String LIZIZ;
    public C20102113l5 LIZJ;
    public int LIZLLL;
    public boolean LJ;

    public C20101913l3(Context context, String str) {
        this.LIZ = context;
        this.LIZIZ = str;
    }

    public static final C20101913l3 LIZ(Context context, String str) {
        HashMap<String, C20101913l3> map = LJFF;
        if (map.get(str) == null) {
            map.put(str, new C20101913l3(context, str));
        }
        return map.get(str);
    }

    public final C20102113l5 LIZIZ(Context context, String str) {
        ActivityManager activityManager;
        if (context != null && (activityManager = (ActivityManager) C786410Ut5.H2(context, "activity")) != null) {
            try {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhidbMhcI8P8r50K2B6J8Kn3I77JOMyGGM", null));
                C20102113l5 c20102113l5 = new C20102113l5();
                C1699250uJv.LLILLL.getClass();
                long j = 1024;
                c20102113l5.LIZ = 0 / j;
                long j2 = memoryInfo.totalMem;
                long j3 = memoryInfo.availMem;
                c20102113l5.LIZIZ = ((j2 - j3) / j) / j;
                c20102113l5.LIZJ = (j3 / j) / j;
                C20102013l4.LIZIZ(this.LIZIZ, str, c20102113l5);
                return c20102113l5;
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
                C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("snapshot exception ");
                sbLIZ.append(e);
                C201955140j.LJII(c20102213l6, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return null;
    }
}
