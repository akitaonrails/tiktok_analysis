package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NOL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NOL {
    public static C0NOI LIZ(long j, long j2, long j3, long j4) {
        if (j4 > 0 && j3 > 0) {
            return new C0NOI(j, j2, j3, j4);
        }
        return null;
    }

    public static C0NOI LIZIZ(long j, long j2, String str, String str2) {
        if (str != null && !a0.LJJJIL(str) && str2 != null && !a0.LJJJIL(str2) && j2 > 0 && j > 0) {
            try {
                return new C0NOI(CastLongProtector.parseLong(str), CastLongProtector.parseLong(str2), j, j2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }
}
