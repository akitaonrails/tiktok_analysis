package X;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0GUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416550GUz extends Path {
    public final List<RectF> LIZ = new ArrayList();
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;

    @Override // android.graphics.Path
    public final void reset() {
        super.reset();
        ((ArrayList) this.LIZ).clear();
    }

    @Override // android.graphics.Path
    public final void addRect(RectF rectF, Path.Direction direction) {
        float f;
        float f2 = this.LIZLLL;
        if (f2 > 0.0f) {
            f = rectF.left + f2;
        } else {
            f = rectF.right;
        }
        RectF rectF2 = new RectF(rectF.left, this.LIZIZ, f, this.LIZJ);
        ((ArrayList) this.LIZ).add(rectF2);
        super.addRect(rectF2, direction);
    }

    @Override // android.graphics.Path
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        float f5 = this.LIZLLL;
        if (f5 > 0.0f) {
            f3 = f + f5;
        }
        ((ArrayList) this.LIZ).add(new RectF(f, this.LIZIZ, f3, this.LIZJ));
        super.addRect(f, this.LIZIZ, f3, this.LIZJ, direction);
    }
}
