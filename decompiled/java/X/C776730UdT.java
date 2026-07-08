package X;

import java.util.TimeZone;

/* JADX INFO: renamed from: X.0UdT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776730UdT {
    public static final boolean LIZ(long j, long j2, TimeZone timeZone) {
        long j3 = j - j2;
        if (j3 < 86400000 && j3 > -86400000) {
            long offset = ((long) timeZone.getOffset(j)) + j;
            long j4 = 86400000;
            if (offset / j4 == (((long) timeZone.getOffset(j2)) + j2) / j4) {
                return true;
            }
            return false;
        }
        return false;
    }
}
