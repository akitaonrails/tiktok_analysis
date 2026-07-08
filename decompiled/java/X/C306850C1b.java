package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0C1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C306850C1b {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZ(float f, int i, int i2, int i3, int i4) {
        try {
            if (f <= 0.5f) {
                i3 = Math.min(C814420VxA.LIZIZ(i / f), i4);
            } else if (f > 0.5f && f < 1.0f) {
                i = C814420VxA.LIZIZ(i4 * f);
                i3 = i4;
            } else if (f == 1.0f) {
                i = Math.min(i2, i4);
                i3 = Math.min(i2, i4);
            } else if (f > 1.0f && f < 2.0f) {
                i3 = (int) (i2 / f);
                i = i2;
            } else {
                i = Math.min(C814420VxA.LIZIZ(i3 * f), i2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            i = Math.min(i2, i4);
            i3 = Math.min(i2, i4);
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i3));
    }
}
