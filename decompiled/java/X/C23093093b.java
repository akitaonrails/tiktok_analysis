package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.093b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23093093b {
    public static final C23093093b LIZ = new C23093093b();
    public static float LIZIZ = Float.MIN_VALUE;

    public static float LIZ() {
        Float f;
        if (LIZIZ == Float.MIN_VALUE) {
            C212350188e c212350188eLIZJ = C212350188e.LIZJ();
            C844470XAv.LIZ.getClass();
            C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
            C1300610jwx c1300610jwx = C1300610jwx.LIZJ;
            C1300610jwx[] c1300610jwxArr = {c1300610jwx};
            Bundle bundle = new Bundle();
            if (c09gaLIZIZ != null) {
                c09gaLIZIZ.LJIILJJIL(c1300610jwxArr, bundle);
            }
            Object obj = null;
            try {
                obj = bundle.get(c1300610jwx.LIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            LIZIZ = (!(obj instanceof Float) || (f = (Float) obj) == null) ? 0.0f : f.floatValue();
        }
        return LIZIZ;
    }
}
