package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UDZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UDZ {
    public static final /* synthetic */ int LIZ = 0;

    public static final Drawable LIZ(int i) {
        Context contextLJII = C497740JfY.LJII();
        Drawable drawable = null;
        if (contextLJII != null) {
            try {
                if (contextLJII.getResources() != null) {
                    drawable = contextLJII.getResources().getDrawable(i);
                    return drawable;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return drawable;
    }
}
