package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.session.Session;

/* JADX INFO: renamed from: X.0ocs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1480360ocs {
    public static final C1480360ocs LIZJ = new C1480360ocs();
    public C1480380ocu LIZ;
    public final C1480390ocv LIZIZ = new Object() { // from class: X.0ocv
    };

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0ocq] */
    public final void LIZ(String str) {
        Session sessionLJI;
        if (!TextUtils.isEmpty(str) && (sessionLJI = C1477400oY6.LJJJJI.LJI(str)) != null && sessionLJI.state == null) {
            synchronized (this) {
                try {
                    if (sessionLJI.state == null) {
                        sessionLJI.state = new Object() { // from class: X.0ocq
                        };
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
