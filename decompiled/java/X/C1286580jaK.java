package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jaK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286580jaK {
    public static String LIZ(int i, Context context) {
        if (i != -1) {
            try {
                return context.getResources().getResourceEntryName(i);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("?");
                sbLIZ.append(i);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        return "UNKNOWN";
    }

    public static String LIZIZ(C21526919Ml c21526919Ml, int i) {
        if (i == -1) {
            return "UNDEFINED";
        }
        return c21526919Ml.getContext().getResources().getResourceEntryName(i);
    }
}
