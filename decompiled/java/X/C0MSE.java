package X;

import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.ies.nle.editor_jni.NLEPoint;

/* JADX INFO: renamed from: X.0MSE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MSE {
    public boolean LIZ;
    public C0MSF LIZIZ = C0MSF.NONE;
    public final NLEPoint LIZJ = new NLEPoint();
    public final NLEPoint LIZLLL = new NLEPoint();
    public final NLEPoint LJ = new NLEPoint();
    public final NLEPoint LJFF = new NLEPoint();
    public final C0MSG LJI = new C0MSG(0);
    public final RectF LJII = new RectF();
    public final C0MSG LJIIIIZZ = new C0MSG(0);
    public float LJIIIZ;
    public float LJIIJ;

    public static void LIZ(RectF rectF, Rect rect, float f) {
        if (f == 1.0f) {
            rectF.set(rect);
            return;
        }
        float fWidth = (rect.width() + 1) * f;
        float fHeight = (rect.height() + 1) * f;
        float fCenterX = rect.centerX() - ((fWidth / 2.0f) * f);
        float fCenterY = rect.centerY() - ((fHeight / 2.0f) * f);
        rectF.left = fCenterX;
        rectF.top = fCenterY;
        rectF.right = fCenterX + fWidth;
        rectF.bottom = fCenterY + fHeight;
    }
}
