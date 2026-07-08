package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0M1F, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M1F {
    public static String LIZ(long j) {
        if (j < 0) {
            return "0.0";
        }
        return C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(j / 1048576.0d)}, 1));
    }
}
