package X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.tux.widget.RadiusLayout;

/* JADX INFO: renamed from: X.19RL, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C19RL {
    public final RadiusLayout LIZ;
    public final RectF LIZIZ = new RectF();
    public final Path LIZJ = new Path();
    public float[] LIZLLL;

    public void LIZ(Canvas canvas) {
    }

    public abstract void LIZJ(float[] fArr);

    public final float[] LIZIZ() {
        float[] fArr = this.LIZLLL;
        if (fArr != null) {
            return fArr;
        }
        return null;
    }

    public C19RL(RadiusLayout radiusLayout) {
        this.LIZ = radiusLayout;
    }
}
