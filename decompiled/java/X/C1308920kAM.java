package X;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kAM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308920kAM {
    public static String LIZ(String str) {
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("android-app://androidx.navigation/");
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "";
    }

    public static String LIZIZ(int i, Context context) {
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            return context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return String.valueOf(i);
        }
    }
}
