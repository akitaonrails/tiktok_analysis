package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0STT, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0STT implements Interpolator {
    public int LIZ;
    public final PointF LIZIZ = new PointF();
    public final PointF LIZJ = new PointF();

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        int i = this.LIZ;
        float f2 = f;
        while (true) {
            if (i >= 4096) {
                break;
            }
            f2 = (i * 1.0f) / SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            double d = f2;
            double d2 = ((double) 1) - d;
            double d3 = d * d;
            double d4 = d2 * d2;
            double d5 = 3;
            if ((d4 * d2 * 0.0d) + (d4 * d5 * d * ((double) this.LIZIZ.x)) + (d5 * d2 * d3 * ((double) this.LIZJ.x)) + (d3 * d * 1.0d) >= f) {
                this.LIZ = i;
                break;
            }
            i++;
        }
        double d6 = f2;
        double d7 = ((double) 1) - d6;
        double d8 = d6 * d6;
        double d9 = d7 * d7;
        double d10 = 3;
        double d11 = (d9 * d7 * 0.0d) + (d9 * d10 * d6 * ((double) this.LIZIZ.y)) + (d10 * d7 * d8 * ((double) this.LIZJ.y)) + (d8 * d6 * 1.0d);
        if (d11 > 0.999d) {
            this.LIZ = 0;
            d11 = 1.0d;
        }
        return (float) d11;
    }
}
