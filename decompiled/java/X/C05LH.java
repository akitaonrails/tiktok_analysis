package X;

import android.os.SystemClock;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.05LH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05LH {
    public static long LIZ = -1;
    public static long LIZIZ = -1;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1160));

    public static boolean LIZ(C05LG c05lg) {
        long j;
        C01GW c01gw = LIZJ;
        if (((Number) c01gw.getValue()).intValue() < 0) {
            return false;
        }
        if (c05lg == C05LG.MORE_PANEL) {
            j = LIZ;
        } else {
            j = LIZIZ;
        }
        if (SystemClock.elapsedRealtime() - j <= ((long) ((Number) c01gw.getValue()).intValue()) * 1000) {
            return false;
        }
        return true;
    }
}
