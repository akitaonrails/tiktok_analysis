package X;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0l0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341410l0l {
    public static volatile C1341400l0k LIZ;

    public static int LIZ() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (contextLIZ != null) {
            try {
                Configuration configuration = contextLIZ.getResources().getConfiguration();
                int i = (((((configuration.screenWidthDp * 31) + configuration.screenHeightDp) * 31) + configuration.densityDpi) * 31) + configuration.orientation;
                C1341400l0k c1341400l0k = LIZ;
                if (c1341400l0k != null && c1341400l0k.LIZ == i) {
                    return c1341400l0k.LIZIZ;
                }
                DisplayMetrics displayMetrics = contextLIZ.getResources().getDisplayMetrics();
                Integer numValueOf = Integer.valueOf(Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels));
                int iIntValue = numValueOf.intValue() > 0 ? numValueOf.intValue() : 720;
                LIZ = new C1341400l0k(i, iIntValue);
                return iIntValue;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return 720;
    }
}
