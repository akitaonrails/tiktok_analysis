package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.0agJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C944330agJ {
    public static C934350aQD LIZIZ;
    public static DataChannel LIZJ;
    public static final C944330agJ LIZ = new C944330agJ();
    public static final C944320agI LIZLLL = C944320agI.LIZ;

    public static String LIZ(long j) {
        boolean z;
        if (j <= 1000) {
            return String.valueOf(j);
        }
        if (j >= 1000000) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return C786410Ut5.k4(Locale.US, "%.1fK", Arrays.copyOf(new Object[]{Double.valueOf(Math.floor(j / 100.0d) / 10.0d)}, 1));
        }
        return C786410Ut5.k4(Locale.US, "%.1fM", Arrays.copyOf(new Object[]{Double.valueOf(Math.floor(j / 100000.0d) / 10.0d)}, 1));
    }
}
