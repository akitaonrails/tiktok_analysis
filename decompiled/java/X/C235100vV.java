package X;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00vV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C235100vV {
    public static Integer LIZ;

    public static int LIZ(int i, Context context) {
        Integer num = LIZ;
        if (num != null) {
            return num.intValue();
        }
        try {
            int color = Color.parseColor("#66545454");
            LIZ = Integer.valueOf(color);
            return color;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C20736316Cj.LIZIZ(i, context);
        }
    }
}
