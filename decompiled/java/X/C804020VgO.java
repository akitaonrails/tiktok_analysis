package X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0VgO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804020VgO {
    public static C804030VgP LIZ;

    public static C804030VgP LIZ(Context context) {
        C804030VgP c804030VgP = LIZ;
        if (c804030VgP != null) {
            return c804030VgP;
        }
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "sp_device_fixed_info");
        if (sharedPreferencesLIZJ != null) {
            int i = sharedPreferencesLIZJ.getInt("ram_mb", 0);
            if (i > 0) {
                C804030VgP c804030VgP2 = new C804030VgP();
                C804030VgP.LIZ = i;
                LIZ = c804030VgP2;
            } else {
                LIZ = null;
            }
        }
        return LIZ;
    }

    public static void LIZIZ(Context context) {
        if (LIZ(context) != null && C804030VgP.LIZ > 0) {
            return;
        }
        ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(context, "activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEgAjS8/YVFkiQFyFaGaflZeUubB9yvbfEIglzy9eYDI2I1UZrmA=", null));
        long j = memoryInfo.totalMem;
        if (j > 0) {
            int i = (int) ((j / 1024) / 1024);
            SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(context, 0, "sp_device_fixed_info").edit();
            editorEdit.putInt("ram_mb", i);
            C804030VgP c804030VgP = new C804030VgP();
            C804030VgP.LIZ = i;
            editorEdit.commit();
            LIZ = c804030VgP;
        }
    }
}
