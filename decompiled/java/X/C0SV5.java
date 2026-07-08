package X;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0SV5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SV5 {
    /* JADX WARN: Multi-variable type inference failed */
    public static C1319910kS5 LIZ(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof C1319910kS5) {
            return (C1319910kS5) drawable;
        }
        if (drawable instanceof InterfaceC722050STz) {
            return LIZ(((InterfaceC722050STz) drawable).LIZ());
        }
        if (drawable instanceof C1331060kk4) {
            C1331060kk4 c1331060kk4 = (C1331060kk4) drawable;
            int length = c1331060kk4.LLILLL.length;
            for (int i = 0; i < length; i++) {
                C1319910kS5 c1319910kS5LIZ = LIZ(c1331060kk4.LIZ(i));
                if (c1319910kS5LIZ != null) {
                    return c1319910kS5LIZ;
                }
            }
        }
        return null;
    }
}
