package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import j27.s;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0kHZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313390kHZ extends AbstractC1313260kHM<C1313400kHa> {
    public int LJII;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // X.AbstractC1313260kHM
    public final AbstractC1313310kHR LIZ() {
        final s sVar = this.LJFF;
        final float f = this.LJI;
        return new AbstractC1313310kHR(sVar, this, f) { // from class: X.0kHa
            public Paint LLJILJILJ;

            @Override // X.AbstractC1313310kHR
            public final boolean LIZJ() {
                return true;
            }

            @Override // X.AbstractC1313310kHR
            public final void LIZLLL(ReadableArray readableArray, LynxBaseUI lynxBaseUI) {
                T t;
                super.LIZLLL(readableArray, lynxBaseUI);
                if (this.LLJILJILJ == null) {
                    Paint paint = new Paint();
                    this.LLJILJILJ = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                    this.LLJILJILJ.setAntiAlias(true);
                    if ((lynxBaseUI instanceof LynxUI) && (t = ((LynxUI) lynxBaseUI).mView) != 0 && t.getLayerType() != 2) {
                        t.setWillNotDraw(false);
                        t.setLayerType(2, null);
                    }
                }
            }

            @Override // X.AbstractC1313310kHR
            public final void LIZ(Canvas canvas, RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, Path path, Path path2, boolean z) {
                int iSaveLayer = canvas.saveLayer(null, this.LLJILJILJ, 31);
                super.LIZ(canvas, rectF, rectF2, rectF3, rectF4, null, null, z);
                canvas.restoreToCount(iSaveLayer);
            }
        };
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LJII;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z = true;
        if (!((ArrayList) this.LJ.LL).isEmpty()) {
            RectF rectF = new RectF(getBounds());
            RectF rectF2 = new RectF(this.LIZJ);
            RectF rectF3 = new RectF(this.LIZLLL);
            T t = this.LJ;
            if (this.LIZ == null) {
                z = false;
            }
            t.LIZ(canvas, rectF, rectF2, rectF3, rectF, null, null, z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.LJII) {
            this.LJII = i;
            invalidateSelf();
        }
    }

    public C1313390kHZ(s sVar, float f) {
        super(sVar, f);
        this.LJII = 255;
    }
}
