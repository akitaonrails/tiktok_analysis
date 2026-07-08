package X;

import android.graphics.Color;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.u;

/* JADX INFO: renamed from: X.00oO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C191000oO {
    public static int LIZ(String str) {
        int color = 0;
        if (str != null) {
            if (!u.LJJIIJZLJL(str, "#", false)) {
                try {
                    color = CastIntegerProtector.parseInt(str);
                    return color;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return color;
                }
            }
            try {
                color = Color.parseColor(str);
                return color;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        return color;
    }
}
