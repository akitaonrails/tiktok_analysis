package X;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0GUv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416510GUv extends Path {
    public final List<RectF> LIZ = new ArrayList();
    public float LIZIZ;
    public float LIZJ;

    @Override // android.graphics.Path
    public final void reset() {
        super.reset();
        ((ArrayList) this.LIZ).clear();
    }

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
        if (f2 < f3) {
            f2 = f3;
        }
        RectF rectF2 = new RectF(f, this.LIZIZ, f2, this.LIZJ);
        ((ArrayList) this.LIZ).add(rectF2);
        super.addRect(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, direction);
    }

    @Override // android.graphics.Path
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        float f5;
        if (f > f3) {
            f5 = f3;
        } else {
            f5 = f;
        }
        if (f < f3) {
            f = f3;
        }
        RectF rectF = new RectF(f5, this.LIZIZ, f, this.LIZJ);
        ((ArrayList) this.LIZ).add(rectF);
        super.addRect(rectF.left, rectF.top, rectF.right, rectF.bottom, direction);
    }
}
