package X;

import java.util.Arrays;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0yCy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1848700yCy {
    public static final int LIZ(String str) {
        return str.getBytes(Charsets.UTF_8).length;
    }

    public static final String LIZIZ(long j) {
        long j2 = 1048576;
        if (j >= j2 && j % j2 == 0) {
            return String.valueOf(j / j2);
        }
        return C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(j / ((double) 1048576))}, 1));
    }
}
