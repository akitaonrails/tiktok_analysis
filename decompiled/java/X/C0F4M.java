package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0F4M, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F4M extends Drawable {
    public final Path LIZ;
    public final Paint LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C0F4M() {
        Path path = new Path();
        this.LIZ = path;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(218103808);
        this.LIZIZ = paint;
        this.LIZJ = 44.0f;
        this.LIZLLL = 44.0f;
        path.set(C21518819Ji.LIZLLL("M21.923,3.01C22.183,3.009 24.997,2.732 28.014,5.163C31.029,7.592 31.353,13.421 31.354,13.442C32.137,13.303 33.255,14.192 33.255,15.802C33.255,17.414 31.353,19.036 29.73,19.651L29.675,19.791C29.338,20.623 29.126,22.048 28.098,23.592C27.527,24.448 26.638,25.381 25.435,26.045L25.435,26.078C25.435,27.365 25.96,29.977 28.063,30.133C30.693,30.329 32.724,31.141 34.122,32.092C35.155,32.794 36.449,34.551 36.794,35.905C36.999,36.709 45.429,67.409 44.646,67.683C43.065,68.236 30.357,69 21.923,69C13.489,69 3.771,68.236 2.19,67.683C1.407,67.409 6.837,36.709 7.042,35.905C7.387,34.55 8.68,32.794 9.714,32.092C11.112,31.141 13.143,30.329 15.773,30.133C17.875,29.977 18.401,27.365 18.401,26.078L18.401,26.029C17.222,25.367 16.352,24.441 15.773,23.592C14.719,22.048 14.498,20.623 14.161,19.791L14.106,19.651C12.483,19.036 10.581,17.414 10.581,15.802C10.581,14.192 11.699,13.303 12.482,13.442C12.483,13.421 12.807,7.592 15.822,5.163C18.841,2.731 21.666,3.01 21.923,3.01Z"));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float fMin = Math.min(bounds.width() / this.LIZJ, bounds.height() / this.LIZLLL);
        float f = 2;
        float fWidth = (bounds.width() - (this.LIZJ * fMin)) / f;
        float fHeight = (bounds.height() - (this.LIZLLL * fMin)) / f;
        int iSave = canvas.save();
        canvas.translate(fWidth, fHeight);
        try {
            canvas.scale(fMin, fMin);
            canvas.drawPath(this.LIZ, this.LIZIZ);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            canvas.restoreToCount(iSave);
            throw th;
        }
    }
}
