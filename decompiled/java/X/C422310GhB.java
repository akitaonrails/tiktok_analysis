package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0GhB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422310GhB extends AbstractC422350GhF {
    public final Context LJFF;
    public final int[] LJI = new int[4];
    public final float[] LJII = new float[4];
    public final RuntimeShader LJIIIIZZ;
    public final Paint LJIIIZ;
    public final Paint LJIIJ;
    public final C422330GhD LJIIJJI;
    public double LJIIL;
    public double LJIILIIL;
    public double LJIILJJIL;

    public C422310GhB(Context context) {
        this.LJFF = context;
        RuntimeShader runtimeShader = new RuntimeShader("\n                uniform int colorCount;\n                uniform vec4 colors[4];\n                uniform float ratios[4];\n\n                uniform float screenHeight;\n                uniform float screenWidth;\n                uniform float topPos;\n                uniform float leftPos;\n                uniform float isDiagonal;\n                uniform float isRtl;\n\n                vec4 main(vec2 fragCoord) {\n                    // Calculate screen position of this pixel\n                    float screenX = fragCoord.x + leftPos;\n                    float screenY = fragCoord.y + topPos;\n                    // For RTL, mirror the X coordinate\n                    float xCoord = isRtl > 0.5 ? (screenWidth - screenX) : screenX;\n                    vec2 contentCoord = vec2(xCoord, screenY);\n                    // Use diagonal vector (screenWidth, screenHeight) or vertical vector (0, screenHeight)\n                    vec2 gradientVector = vec2(isDiagonal * screenWidth, screenHeight);\n                    vec2 pixelVector = vec2(contentCoord.x, contentCoord.y);\n\n                    float y = dot(pixelVector, gradientVector) / dot(gradientVector, gradientVector);\n\n                    // Edge case: before first stop\n                    if (y <= ratios[0]) return colors[0];\n\n                    // Segment 0 -> 1\n                    if (y < ratios[1]) {\n                        float t = (y - ratios[0]) / (ratios[1] - ratios[0]);\n                        return mix(colors[0], colors[1], t);\n                    }\n                    if (colorCount <= 2) return colors[1];\n\n                    // Segment 1 -> 2\n                    if (y < ratios[2]) {\n                        float t = (y - ratios[1]) / (ratios[2] - ratios[1]);\n                        return mix(colors[1], colors[2], t);\n                    }\n                    if (colorCount <= 3) return colors[2];\n\n                    // Segment 2 -> 3\n                    if (y < ratios[3]) {\n                        float t = (y - ratios[2]) / (ratios[3] - ratios[2]);\n                        return mix(colors[2], colors[3], t);\n                    }\n\n                    return colors[3];\n                }\n            ");
        this.LJIIIIZZ = runtimeShader;
        Paint paint = new Paint();
        paint.setShader(runtimeShader);
        paint.setStyle(Paint.Style.FILL);
        this.LJIIIZ = paint;
        this.LJIIJ = new Paint();
        this.LJIIJJI = new C422330GhD();
    }

    public final void LJFF(Canvas canvas) {
        Shader shaderLIZJ;
        C422330GhD c422330GhD;
        if (canvas.isHardwareAccelerated()) {
            canvas.drawPath(this.LIZLLL, this.LJIIIZ);
            return;
        }
        Paint paint = this.LJIIJ;
        if (getBounds().bottom > 0 && this.LJIIL > 0.0d && (c422330GhD = this.LJIIJJI) != null) {
            getBounds();
            shaderLIZJ = c422330GhD.LIZJ(this.LJIILIIL, this.LJIILJJIL);
        } else {
            shaderLIZJ = null;
        }
        paint.setShader(shaderLIZJ);
        canvas.drawPath(this.LIZLLL, this.LJIIJ);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!C426750GoL.LIZLLL(this.LJFF) && this.LIZJ) {
            int iSave = canvas.save();
            try {
                canvas.scale(-1.0f, 1.0f, getBounds().width() / 2.0f, getBounds().height() / 2.0f);
                LJFF(canvas);
                canvas.restoreToCount(iSave);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        LJFF(canvas);
    }

    public final void LJI(List<Integer> list, List<Float> list2, boolean z) {
        float f;
        float f2;
        Object objValueOf;
        C422330GhD c422330GhD = this.LJIIJJI;
        if (c422330GhD != null) {
            c422330GhD.LIZIZ(list, list2, z);
        }
        int i = 0;
        for (Object obj : C13LP.LL(list, 4)) {
            int i2 = i + 1;
            if (i >= 0) {
                this.LJI[i] = ((Number) obj).intValue();
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        int i3 = 0;
        for (Object obj2 : C13LP.LL(list2, 4)) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                this.LJII[i3] = ((Number) obj2).floatValue();
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        int iMin = Math.min(list.size(), 4);
        this.LJIIIIZZ.setIntUniform("colorCount", iMin);
        float[] fArr = new float[16];
        int i5 = 0;
        while (true) {
            f = 1.0f;
            if (i5 >= iMin) {
                break;
            }
            int iIntValue = ((Number) ListProtector.get(list, i5)).intValue();
            int i6 = i5 * 4;
            fArr[i6] = Color.red(iIntValue) / 255.0f;
            fArr[i6 + 1] = Color.green(iIntValue) / 255.0f;
            fArr[i6 + 2] = Color.blue(iIntValue) / 255.0f;
            fArr[i6 + 3] = 1.0f;
            i5++;
        }
        this.LJIIIIZZ.setFloatUniform("colors", fArr);
        float[] fArr2 = new float[4];
        for (int i7 = 0; i7 < iMin; i7++) {
            if (i7 >= 0 && i7 < list2.size()) {
                objValueOf = ListProtector.get(list2, i7);
            } else {
                objValueOf = Float.valueOf(1.0f);
            }
            fArr2[i7] = ((Number) objValueOf).floatValue();
        }
        this.LJIIIIZZ.setFloatUniform("ratios", fArr2);
        RuntimeShader runtimeShader = this.LJIIIIZZ;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        runtimeShader.setFloatUniform("isDiagonal", f2);
        RuntimeShader runtimeShader2 = this.LJIIIIZZ;
        if (!C426750GoL.LIZLLL(this.LJFF) && !this.LIZJ) {
            f = 0.0f;
        }
        runtimeShader2.setFloatUniform("isRtl", f);
    }
}
