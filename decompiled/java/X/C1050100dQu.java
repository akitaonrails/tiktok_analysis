package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0dQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050100dQu {
    public static float LIZ(float f, String str) {
        try {
            f = CastFloatProtector.parseFloat(str);
            return f;
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return f;
        }
    }

    public static int LIZIZ(String str, int i) {
        try {
            i = CastIntegerProtector.parseInt(str);
            return i;
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return i;
        }
    }
}
