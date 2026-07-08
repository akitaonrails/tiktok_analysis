package X;

import android.os.Build;
import android.widget.EdgeEffect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13ig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20087213ig {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZIZ(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public static void LIZJ(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public static void LJ(EdgeEffect edgeEffect, float f) {
        if (edgeEffect instanceof C20087313ih) {
            C20087313ih c20087313ih = (C20087313ih) edgeEffect;
            float f2 = c20087313ih.LIZIZ + f;
            c20087313ih.LIZIZ = f2;
            if (Math.abs(f2) > c20087313ih.LIZ) {
                c20087313ih.onRelease();
                return;
            }
            return;
        }
        edgeEffect.onRelease();
    }

    public static float LIZLLL(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static float LIZ(EdgeEffect edgeEffect, float f, float f2, InterfaceC1690500u5o interfaceC1690500u5o) {
        float f3 = C20087413ii.LIZ;
        double density = interfaceC1690500u5o.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) C20087413ii.LIZ) * density;
        if (((float) (d * Math.exp((C20087413ii.LIZIZ / C20087413ii.LIZJ) * Math.log(dAbs / d)))) <= LIZIZ(edgeEffect) * f2) {
            LIZJ(edgeEffect, C814420VxA.LIZIZ(f));
            return f;
        }
        return 0.0f;
    }
}
