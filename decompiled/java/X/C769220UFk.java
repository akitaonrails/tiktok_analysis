package X;

import android.content.Context;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tux.system.TuxImmersionBar;

/* JADX INFO: renamed from: X.0UFk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C769220UFk {
    public static final C769220UFk LIZ = new C769220UFk();
    public static int LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;
    public static int LJ;
    public static Float LJFF;
    public static boolean LJI;

    public static void LIZJ(Context context) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19egLIZIZ);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19egLIZIZ, immersionBarLJIILJJIL);
            tuxImmersionBar.LIZJ(false, false);
            immersionBarLJIILJJIL.LJIIL();
            tuxImmersionBar.LJFF(-16777216);
            immersionBarLJIILJJIL.LJII(false);
            tuxImmersionBar.LIZLLL();
        }
    }

    public static float LIZ(int i, int i2) {
        Float fValueOf;
        Float f = LJFF;
        if (f != null) {
            return f.floatValue();
        }
        Float fLIZ = InterfaceC772190UQv.Y2.LIZ();
        if (fLIZ != null) {
            LJFF = fLIZ;
            return fLIZ.floatValue();
        }
        if (i <= 0 || i2 <= 0) {
            return 0.5625f;
        }
        float f2 = (i * 1.0f) / i2;
        if (Math.abs(f2 - 0.5625f) < Math.abs(f2 - 0.5f)) {
            fValueOf = Float.valueOf(0.5625f);
        } else {
            fValueOf = Float.valueOf(0.5f);
        }
        LJFF = fValueOf;
        return fValueOf.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C769220UFk r8, android.content.Context r9, android.view.View r10, android.view.View r11, android.view.View r12, boolean r13, float r14, boolean r15, boolean r16, int r17) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C769220UFk.LIZIZ(X.0UFk, android.content.Context, android.view.View, android.view.View, android.view.View, boolean, float, boolean, boolean, int):void");
    }
}
