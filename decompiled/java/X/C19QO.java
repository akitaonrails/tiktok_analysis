package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.19QO, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19QO {
    public static C19QP LIZ(Paint.Align align) throws Exception {
        C19QP c19qp;
        ConcurrentHashMap<Integer, C19QP> concurrentHashMap = C19QP.LIZIZ;
        C19QP c19qp2 = concurrentHashMap.get(Integer.valueOf(align.ordinal()));
        if (c19qp2 != null) {
            return c19qp2;
        }
        int iOrdinal = align.ordinal();
        if (iOrdinal == Paint.Align.LEFT.ordinal()) {
            c19qp = new C19QP() { // from class: X.19QN
                @Override // X.C19QP
                public final float LIZIZ(int i) {
                    return 0.0f;
                }

                @Override // X.C19QP
                public final void LIZ(RectF rectF, int i, int i2, float f, float f2) {
                    if (this.LIZ) {
                        rectF.set(0.0f, 0.0f, f2, i);
                    } else {
                        rectF.set(f - f2, 0.0f, f, i);
                    }
                }
            };
        } else if (iOrdinal == Paint.Align.RIGHT.ordinal()) {
            c19qp = new C19QP() { // from class: X.19QL
                public final float LIZJ = (int) C497740JfY.LIZIZ(4.0f);

                @Override // X.C19QP
                public final float LIZIZ(int i) {
                    return i;
                }

                @Override // X.C19QP
                public final float LIZJ(int i, Rect rect) {
                    return (rect.height() - i) + this.LIZJ;
                }

                @Override // X.C19QP
                public final void LIZ(RectF rectF, int i, int i2, float f, float f2) {
                    float f3 = i2;
                    float f4 = f3 - (f - f2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("isReverse:");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", x:");
                    sbLIZ.append(f4);
                    C20441214yg.LIZIZ("KtvRtl", C2188811AlT.LIZIZ(sbLIZ));
                    if (this.LIZ) {
                        rectF.set(0.0f, 0.0f, f4, i);
                    } else {
                        rectF.set(f3 - f2, 0.0f, f3, i);
                    }
                }
            };
        } else if (iOrdinal == Paint.Align.CENTER.ordinal()) {
            c19qp = new C19QP() { // from class: X.19QM
                @Override // X.C19QP
                public final float LIZIZ(int i) {
                    return i / 2.0f;
                }

                @Override // X.C19QP
                public final void LIZ(RectF rectF, int i, int i2, float f, float f2) {
                    float f3 = i2;
                    float f4 = ((f3 - f) / 2.0f) + f2;
                    if (this.LIZ) {
                        rectF.set(f4, 0.0f, f3, (i / 2) + 5);
                    } else {
                        rectF.set(0.0f, 0.0f, f4, i);
                    }
                }
            };
        } else {
            throw new Exception("error Paint.Align");
        }
        concurrentHashMap.put(Integer.valueOf(align.ordinal()), c19qp);
        return c19qp;
    }
}
