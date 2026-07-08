package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: X.13kP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20097913kP {
    public final EdgeEffect mEdgeEffect;

    public final void LIZIZ() {
        this.mEdgeEffect.finish();
    }

    public final boolean LIZLLL() {
        return this.mEdgeEffect.isFinished();
    }

    public final boolean LJI() {
        this.mEdgeEffect.onRelease();
        return this.mEdgeEffect.isFinished();
    }

    public C20097913kP(Context context) {
        this.mEdgeEffect = new EdgeEffect(context);
    }

    public static float LIZJ(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C20087513ij.LIZIZ(edgeEffect);
        }
        return 0.0f;
    }

    public final boolean LIZ(Canvas canvas) {
        return this.mEdgeEffect.draw(canvas);
    }

    public final void LJ(float f) {
        this.mEdgeEffect.onPull(f);
    }

    public final void LJII(int i, int i2) {
        this.mEdgeEffect.setSize(i, i2);
    }

    public static float LJFF(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C20087513ij.LIZJ(edgeEffect, f, f2);
        }
        C20097813kO.LIZ(edgeEffect, f, f2);
        return f;
    }
}
