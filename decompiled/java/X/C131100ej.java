package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00ej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C131100ej {
    public static final boolean LIZ(String str) {
        try {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "left_slide_webpage_optimize_enable_android", true, false)) {
                if (str == null || a0.LJJJIL(str)) {
                    return true;
                }
                if (((List) C131000ei.LIZ.getValue()).isEmpty() || (!((List) r1.getValue()).contains(str))) {
                    return true;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }
}
