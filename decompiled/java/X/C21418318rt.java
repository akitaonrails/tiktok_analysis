package X;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.18rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21418318rt extends Path {
    public float LIZ;
    public float LIZIZ;
    public Float LIZJ;
    public Float LIZLLL;

    @Override // android.graphics.Path
    public final void addRect(RectF rectF, Path.Direction direction) {
        float fFloatValue;
        float fFloatValue2;
        float f = rectF.left;
        Float f2 = this.LIZJ;
        if (f2 != null) {
            fFloatValue = f2.floatValue();
        } else {
            fFloatValue = f;
        }
        if (f < fFloatValue) {
            f = fFloatValue;
        }
        float f3 = this.LIZ;
        float f4 = rectF.right;
        Float f5 = this.LIZLLL;
        if (f5 != null) {
            fFloatValue2 = f5.floatValue();
        } else {
            fFloatValue2 = f4;
        }
        if (f4 > fFloatValue2) {
            f4 = fFloatValue2;
        }
        rectF.set(f, f3, f4, this.LIZIZ);
        super.addRect(rectF, direction);
    }

    @Override // android.graphics.Path
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        float fFloatValue;
        float fFloatValue2;
        Float f5 = this.LIZJ;
        if (f5 != null) {
            fFloatValue = f5.floatValue();
        } else {
            fFloatValue = f;
        }
        if (f >= fFloatValue) {
            fFloatValue = f;
        }
        float f6 = this.LIZ;
        Float f7 = this.LIZLLL;
        if (f7 != null) {
            fFloatValue2 = f7.floatValue();
        } else {
            fFloatValue2 = f3;
        }
        if (f3 <= fFloatValue2) {
            fFloatValue2 = f3;
        }
        super.addRect(fFloatValue, f6, fFloatValue2, this.LIZIZ, direction);
    }
}
