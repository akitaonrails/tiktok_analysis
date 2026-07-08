package X;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.19QP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C19QP {
    public static final ConcurrentHashMap<Integer, C19QP> LIZIZ = new ConcurrentHashMap<>();
    public boolean LIZ;

    public abstract void LIZ(RectF rectF, int i, int i2, float f, float f2);

    public abstract float LIZIZ(int i);

    public C19QP() {
        C497740JfY.LIZIZ(10.0f);
        this.LIZ = true;
        Float fValueOf = Float.valueOf(0.0f);
        C1697810uHb.LJ(fValueOf, fValueOf, fValueOf);
        C497740JfY.LIZIZ(3.0f);
        C497740JfY.LIZIZ(5.5f);
    }

    public float LIZJ(int i, Rect rect) {
        return (rect.height() - i) - 0.0f;
    }
}
