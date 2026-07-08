package X;

import android.graphics.Color;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.u;

/* JADX INFO: renamed from: X.00oN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C190900oN {
    public static int LIZ(String str) {
        if (!u.LJJIIJZLJL(str, "#", false)) {
            try {
                return CastIntegerProtector.parseInt(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return -1;
            }
        }
        try {
            return Color.parseColor(str);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return -1;
        }
    }
}
