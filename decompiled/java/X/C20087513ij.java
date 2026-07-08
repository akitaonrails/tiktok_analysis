package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13ij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20087513ij {
    public static float LIZIZ(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0.0f;
        }
    }

    public static EdgeEffect LIZ(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new EdgeEffect(context);
        }
    }

    public static float LIZJ(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
