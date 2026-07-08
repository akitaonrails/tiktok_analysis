package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.052D, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C052D {
    public static volatile Integer LIZ;
    public static final Keva LIZIZ = Keva.getRepo("UserLaunchCountHelper");

    public static int LIZ() {
        Integer num = LIZ;
        if (num != null) {
            return num.intValue();
        }
        Keva keva = LIZIZ;
        int i = keva.getInt("user_launch_count", -1);
        if (i != -2) {
            if (i != -1) {
                int i2 = i + 1;
                LIZ = Integer.valueOf(i2);
                keva.storeInt("user_launch_count", i2);
            } else {
                int i3 = C1514430pVp.LIZLLL().booleanValue() ? 1 : -2;
                LIZ = Integer.valueOf(i3);
                keva.storeInt("user_launch_count", i3);
            }
        } else {
            LIZ = Integer.valueOf(i);
        }
        Integer num2 = LIZ;
        if (num2 != null) {
            return num2.intValue();
        }
        return -2;
    }
}
