package X;

import java.util.TimeZone;

/* JADX INFO: renamed from: X.0KLP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KLP {
    public static boolean LIZ(long j, long j2) {
        long j3 = j - j2;
        if (j3 < 86400000 && j3 > -86400000) {
            long j4 = 86400000;
            if ((j + ((long) TimeZone.getDefault().getOffset(j))) / j4 == (j2 + ((long) TimeZone.getDefault().getOffset(j2))) / j4) {
                return true;
            }
            return false;
        }
        return false;
    }
}
