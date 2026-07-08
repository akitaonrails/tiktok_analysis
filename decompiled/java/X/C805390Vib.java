package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805390Vib {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static final Object LIZJ = new Object();

    public static final void LIZ(Context context) {
        boolean z;
        if (!LIZIZ && context != null) {
            synchronized (LIZJ) {
                try {
                    if (!LIZIZ) {
                        String strLIZ = C2162308dZ.LIZ(context);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("keva_new_user_repo_");
                        sbLIZ.append(strLIZ);
                        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
                        if (repo.getBoolean("is_new_user", true) && C1150504el.LIZ().LJIJJLI) {
                            z = true;
                        } else {
                            z = false;
                        }
                        LIZ = z;
                        LIZIZ = true;
                        repo.storeBoolean("is_new_user", false);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
