package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.12Oy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19749812Oy extends Drawable {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public int LIZLLL;
    public int LJ;
    public final Paint LJFF = new Paint();
    public final RectF LJI = new RectF();
    public int LJII = -65536;
    public float LJIIIIZZ = C418440Gaw.LIZIZ(1);
    public float LJIIIZ = C418440Gaw.LIZIZ(2);
    public float LJIIJ = C418440Gaw.LIZIZ(2);
    public final List<Float> LJIIJJI = new ArrayList();

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!(!((ArrayList) this.LJIIJJI).isEmpty())) {
            return;
        }
        int i = this.LIZLLL;
        float f = this.LIZIZ / 2;
        float f2 = this.LJ / 2;
        float f3 = this.LIZJ;
        float f4 = (f2 - f) + f3;
        float f5 = f2 + f + f3;
        Iterator<Float> it2 = this.LJIIJJI.iterator();
        while (it2.hasNext()) {
            float fFloatValue = it2.next().floatValue();
            if (fFloatValue != 0.0f) {
                this.LJFF.setColor(this.LJII);
                RectF rectF = this.LJI;
                float f6 = fFloatValue * i;
                float f7 = this.LJIIIIZZ;
                rectF.set(f6 - f7, this.LJIIIZ + f4, f6 + f7, f5 - this.LJIIJ);
                RectF rectF2 = this.LJI;
                float f8 = this.LIZ;
                canvas.drawRoundRect(rectF2, f8, f8, this.LJFF);
            }
        }
    }
}
