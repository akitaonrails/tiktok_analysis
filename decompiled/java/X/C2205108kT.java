package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08kT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2205108kT {
    public static final SimpleDateFormat LIZ = new SimpleDateFormat("yyyyMMdd");

    public static boolean LIZ(long j, long j2) {
        if (j >= 0 && j2 >= 0) {
            try {
                SimpleDateFormat simpleDateFormat = LIZ;
                return Intrinsics.LJFF(simpleDateFormat.format(Long.valueOf(j)), simpleDateFormat.format(Long.valueOf(j2)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }
}
