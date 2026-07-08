package X;

import X.AbstractC1313310kHR;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import j27.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0kHM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1313260kHM<T extends AbstractC1313310kHR> extends Drawable {
    public final C1314260kIy LIZ;
    public final float[] LIZIZ;
    public final Rect LIZJ = new Rect();
    public final Rect LIZLLL = new Rect();
    public final T LJ;
    public final s LJFF;
    public final float LJI;

    public abstract T LIZ();

    public final RectF LIZIZ() {
        float fLIZ = this.LIZ.LIZ(1);
        float fLIZ2 = this.LIZ.LIZ(3);
        float fLIZ3 = this.LIZ.LIZ(0);
        float fLIZ4 = this.LIZ.LIZ(2);
        Rect bounds = getBounds();
        float f = fLIZ3 + fLIZ4;
        if (f > bounds.width() && bounds.width() >= 1) {
            float fWidth = bounds.width() / f;
            fLIZ3 *= fWidth;
            fLIZ4 *= fWidth;
        }
        float f2 = fLIZ + fLIZ2;
        if (f2 > bounds.height() && bounds.height() >= 1) {
            float fHeight = bounds.height() / f2;
            fLIZ *= fHeight;
            fLIZ2 *= fHeight;
        }
        return new RectF(fLIZ3, fLIZ, fLIZ4, fLIZ2);
    }

    public final void LJ() {
        Rect bounds = getBounds();
        this.LIZJ.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        RectF rectFLIZIZ = LIZIZ();
        Rect rect = this.LIZJ;
        int i = (int) (rect.left + rectFLIZIZ.left);
        rect.left = i;
        int i2 = (int) (rect.top + rectFLIZIZ.top);
        rect.top = i2;
        int i3 = (int) (rect.right - rectFLIZIZ.right);
        rect.right = i3;
        int i4 = (int) (rect.bottom - rectFLIZIZ.bottom);
        rect.bottom = i4;
        this.LIZLLL.set(i, i2, i3, i4);
        Rect rect2 = this.LIZLLL;
        float f = rect2.top;
        float[] fArr = this.LIZIZ;
        rect2.top = (int) (f + fArr[0]);
        rect2.right = (int) (rect2.right - fArr[1]);
        rect2.bottom = (int) (rect2.bottom - fArr[2]);
        rect2.left = (int) (rect2.left + fArr[3]);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Iterator it2 = ((ArrayList) this.LJ.LL).iterator();
        while (it2.hasNext()) {
            ((AbstractC1313950kIT) it2.next()).LJI(rect.width(), rect.height());
        }
        LJ();
    }

    public AbstractC1313260kHM(s sVar, float f) {
        this.LJ = null;
        this.LJFF = sVar;
        this.LJI = f;
        this.LJ = (T) LIZ();
        float[] fArr = new float[4];
        this.LIZIZ = fArr;
        Arrays.fill(fArr, 0.0f);
        C1310290kCZ c1310290kCZ = sVar.LLLIIII;
        if (c1310290kCZ != null && c1310290kCZ.LJIILIIL) {
            this.LIZ = new C1314260kIy(3.0f);
        } else {
            this.LIZ = new C1314260kIy();
        }
    }

    public boolean LIZJ(float f, int i) {
        return this.LIZ.LIZIZ(f, i);
    }

    public boolean LIZLLL(float f, float f2, float f3, float f4) {
        boolean z = false;
        if (!C1314000kIY.LIZ(this.LIZIZ[0], f)) {
            this.LIZIZ[0] = f;
            z = true;
        }
        if (!C1314000kIY.LIZ(this.LIZIZ[1], f2)) {
            this.LIZIZ[1] = f2;
            z = true;
        }
        if (!C1314000kIY.LIZ(this.LIZIZ[2], f3)) {
            this.LIZIZ[2] = f3;
            z = true;
        }
        if (!C1314000kIY.LIZ(this.LIZIZ[3], f4)) {
            this.LIZIZ[3] = f4;
            return true;
        }
        return z;
    }
}
