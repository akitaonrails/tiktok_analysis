package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.00wz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C244300wz {
    public static final String LIZ(long j) {
        long j2 = 1048576;
        if (j >= j2 && j % j2 == 0) {
            return String.valueOf(j / j2);
        }
        return C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(j / ((double) 1048576))}, 1));
    }
}
