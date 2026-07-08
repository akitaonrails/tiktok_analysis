package X;

import android.os.Looper;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0KbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520680KbS {
    public static View LIZ(int i, View view) {
        View viewLIZIZ;
        if (C1220404q2.LIZ()) {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                synchronized (C0JAD.LLIZ) {
                    try {
                        viewLIZIZ = C0JAF.LIZIZ(view.findViewById(i), view, i);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return viewLIZIZ;
            }
            return C0JAF.LIZIZ(view.findViewById(i), view, i);
        }
        return view.findViewById(i);
    }
}
