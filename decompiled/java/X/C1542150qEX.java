package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0qEX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1542150qEX {
    public static int LIZ() {
        try {
            Context context = C1100000ejO.LIZ;
            if (context == null) {
                context = null;
            }
            return C446980Hfs.LIZ(context, R.color.d3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }
}
