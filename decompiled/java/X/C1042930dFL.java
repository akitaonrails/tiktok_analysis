package X;

import android.net.Uri;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0dFL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042930dFL {
    public final Keva LIZ = Keva.getRepo("hybrid_ssp");

    public static String LIZ(Uri uri) {
        if (!uri.isHierarchical()) {
            return uri.toString();
        }
        try {
            return uri.buildUpon().clearQuery().toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return uri.toString();
        }
    }
}
