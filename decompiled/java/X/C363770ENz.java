package X;

import android.graphics.Matrix;
import android.util.Size;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0ENz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363770ENz {
    public static final /* synthetic */ int LIZ = 0;

    public static float LJ(float f) {
        float f2 = 360;
        float f3 = f % f2;
        if (f3 > 180.0f) {
            f3 -= f2;
        } else if (f3 < -180.0f) {
            f3 += f2;
        }
        float f4 = f3 % f2;
        return f3 < 0.0f ? f4 + f2 : f4;
    }

    public static boolean LIZJ(Size... sizeArr) {
        for (Size size : sizeArr) {
            if (size == null || size.getWidth() <= 0 || size.getHeight() <= 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZLLL(C0EO0 c0eo0, MotionEvent motionEvent) {
        float x = motionEvent.getX() - c0eo0.LIZJ;
        float y = motionEvent.getY() - c0eo0.LIZLLL;
        Matrix matrix = new Matrix();
        matrix.setRotate(-c0eo0.LJ);
        float[] fArr = {x, y};
        matrix.mapPoints(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = c0eo0.LIZ / 2.0f;
        float f4 = c0eo0.LIZIZ / 2.0f;
        if ((-f3) > f || f > f3 || (-f4) > f2 || f2 > f4) {
            return false;
        }
        return true;
    }

    public static Size LIZ(float f, int i, int i2) {
        float f2 = i;
        float f3 = i2;
        if (f2 / f3 > f) {
            float f4 = f3 * f;
            if (Math.abs(f4) <= Float.MAX_VALUE) {
                return new Size((int) f4, i2);
            }
            return new Size(720, 1280);
        }
        float f5 = f2 / f;
        if (Math.abs(f5) <= Float.MAX_VALUE) {
            return new Size(i, (int) f5);
        }
        return new Size(720, 1280);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0EO0 LIZIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot r11, android.util.Size r12, android.util.Size r13) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363770ENz.LIZIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot, android.util.Size, android.util.Size):X.0EO0");
    }
}
