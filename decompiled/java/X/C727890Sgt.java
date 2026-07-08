package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Sgt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727890Sgt {
    public static final C727890Sgt LIZ = new C727890Sgt();

    public static String LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Story-");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ(String str, String str2) {
        String strLIZLLL = LIZLLL(str);
        if (C2344809Gs.LIZ) {
            C2344809Gs.LIZLLL(3, strLIZLLL, str2);
        }
    }

    public static void LIZIZ(String str, String str2) {
        if (str2 == null) {
            return;
        }
        try {
            LIZ(str, str2);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJ(String str, String str2) {
        String strLIZLLL = LIZLLL(str);
        if (C2344809Gs.LIZ) {
            C2344809Gs.LIZLLL(4, strLIZLLL, str2);
        }
    }

    public static void LIZJ(String str, String str2, Throwable th) {
        String strLIZLLL = LIZLLL(str);
        if (C2344809Gs.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(": ");
            sbLIZ.append(Log.getStackTraceString(th));
            C2344809Gs.LIZLLL(6, strLIZLLL, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
