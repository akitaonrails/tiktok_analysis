package X;

import X.C19PH;
import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* JADX INFO: renamed from: X.19Pk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21534619Pk<S extends C19PH> extends AbstractC21534819Pm {
    public AbstractC21534019Pe<S> LLJILJIL;
    public AbstractC21534519Pj<ObjectAnimator> LLJILJILJ;

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LLJILJIL.LIZLLL();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LLJILJIL.LJ();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            AbstractC21534019Pe<S> abstractC21534019Pe = this.LLJILJIL;
            float fLIZIZ = LIZIZ();
            abstractC21534019Pe.LIZ.LIZ();
            abstractC21534019Pe.LIZ(fLIZIZ, canvas);
            this.LLJILJIL.LIZJ(canvas, this.LLJ);
            int i = 0;
            while (true) {
                AbstractC21534519Pj<ObjectAnimator> abstractC21534519Pj = this.LLJILJILJ;
                int[] iArr = abstractC21534519Pj.LIZJ;
                if (i < iArr.length) {
                    AbstractC21534019Pe<S> abstractC21534019Pe2 = this.LLJILJIL;
                    Paint paint = this.LLJ;
                    float[] fArr = abstractC21534519Pj.LIZIZ;
                    int i2 = i * 2;
                    abstractC21534019Pe2.LIZIZ(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                    i++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    @Override // X.AbstractC21534819Pm
    public final boolean LJFF(boolean z, boolean z2, boolean z3) {
        boolean zLJFF = super.LJFF(z, z2, z3);
        if (!isRunning()) {
            this.LLJILJILJ.LIZ();
        }
        C21534419Pi c21534419Pi = this.LLILLL;
        ContentResolver contentResolver = this.LL.getContentResolver();
        c21534419Pi.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z && z3) {
            this.LLJILJILJ.LJ();
        }
        return zLJFF;
    }

    public C21534619Pk(Context context, C19PH c19ph, AbstractC21534019Pe<S> abstractC21534019Pe, AbstractC21534519Pj<ObjectAnimator> abstractC21534519Pj) {
        super(context, c19ph);
        this.LLJILJIL = abstractC21534019Pe;
        abstractC21534019Pe.LIZIZ = this;
        this.LLJILJILJ = abstractC21534519Pj;
        abstractC21534519Pj.LIZ = this;
    }
}
