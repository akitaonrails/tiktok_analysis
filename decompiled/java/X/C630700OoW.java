package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0OoW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630700OoW {
    public static boolean LIZ;
    public static boolean LIZIZ;

    public static boolean LIZ() {
        if (!LIZ) {
            try {
                C2222691Bz1 c2222691Bz1 = C2222691Bz1.LIZ;
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                c2222691Bz1.getClass();
                LIZIZ = C2222691Bz1.LJI(contextLIZ);
                LIZ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return LIZIZ;
    }
}
