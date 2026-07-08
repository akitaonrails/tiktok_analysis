package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08Qe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2114608Qe {
    public static volatile String LIZ;
    public static volatile String LIZIZ;
    public static volatile boolean LIZJ;

    public static boolean LIZ(Context context, String str) {
        if (!LIZJ) {
            synchronized (C2114608Qe.class) {
                try {
                    if (!LIZJ) {
                        String packageName = context.getPackageName();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(packageName);
                        sbLIZ.append(":push");
                        LIZ = C2188811AlT.LIZIZ(sbLIZ);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(packageName);
                        sbLIZ2.append(":pushservice");
                        LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        LIZJ = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.equals(LIZ, str) || TextUtils.equals(LIZIZ, str)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
