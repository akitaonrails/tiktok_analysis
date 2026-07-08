package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.087p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20663087p {
    public static Activity LIZ(Context context) {
        while (context instanceof ContextWrapper) {
            try {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1520960pgM.LIZIZ(e);
                return null;
            }
        }
        return null;
    }
}
