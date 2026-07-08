package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0Hyo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C458720Hyo {
    public static int LIZ;
    public static final Keva LIZIZ = Keva.getRepo("InputLayoutStates");

    public static int LIZ(int i) {
        if (LIZ <= 0) {
            LIZ = LIZIZ.getInt("last_keyboard_height", i);
        }
        int i2 = LIZ;
        if (i2 > 0) {
            return i2;
        }
        return i;
    }
}
