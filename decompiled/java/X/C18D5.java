package X;

import android.os.SystemClock;
import com.bytedance.android.btm.impl.setting.BugfixModel;

/* JADX INFO: renamed from: X.18D5, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18D5 {
    public static volatile boolean LIZIZ;
    public static C21241518Ar LIZJ;
    public static C18DJ LIZLLL;
    public static long LJFF;
    public static final C18D5 LIZ = new C18D5();
    public static String LJ = "";

    public final synchronized void LIZIZ() {
        if (!LIZIZ) {
            LIZIZ = true;
            LIZJ = new C21241518Ar();
            LIZLLL = new C18DJ();
            LJ = String.valueOf(System.currentTimeMillis());
            LJFF = SystemClock.elapsedRealtime();
        }
    }

    public static InterfaceC21252218Eu LIZ() {
        BugfixModel bugfixModelLIZIZ = C18CS.LIZ.LIZIZ();
        bugfixModelLIZIZ.getClass();
        Object objLIZIZ = C1972007ny.LIZIZ(bugfixModelLIZIZ, "app_observe_v2", Integer.valueOf(bugfixModelLIZIZ.appObserveV2));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : bugfixModelLIZIZ.appObserveV2;
        bugfixModelLIZIZ.appObserveV2 = iIntValue;
        return iIntValue == 1 ? C20146713sH.LL : C20146813sI.LL;
    }
}
