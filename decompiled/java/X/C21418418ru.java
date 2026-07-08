package X;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.18ru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21418418ru extends Path {
    public float LIZ;
    public float LIZIZ;

    @Override // android.graphics.Path
    public final void addRect(RectF rectF, Path.Direction direction) {
        float f;
        float f2 = rectF.left;
        float f3 = rectF.right;
        if (f2 > f3) {
            f = f3;
        } else {
            f = f2;
        }
        if (f2 >= f3) {
            f3 = f2;
        }
        super.addRect(f, this.LIZ, f3, this.LIZIZ, direction);
    }

    @Override // android.graphics.Path
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        float f5;
        float f6 = f3;
        if (f > f6) {
            f5 = f6;
        } else {
            f5 = f;
        }
        if (f >= f6) {
            f6 = f;
        }
        super.addRect(f5, this.LIZ, f6, this.LIZIZ, direction);
    }
}
