package X;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.0w33, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1765670w33 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i) {
        int i2 = i % 60;
        int i3 = i / 60;
        int i4 = i3 / 60;
        int i5 = i3 % 60;
        if (i4 == 0) {
            if (i5 >= 10) {
                return C786410Ut5.k4(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)}, 2));
            }
            return C786410Ut5.k4(Locale.ENGLISH, "%1d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)}, 2));
        }
        return C786410Ut5.k4(Locale.ENGLISH, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)}, 3));
    }

    public static String LIZIZ(float f, int i) {
        return LIZ((int) (f * i));
    }
}
