package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0F4L, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F4L extends Drawable {
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

    public C0F4L() {
        Path path = new Path();
        this.LIZ = path;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-11316397);
        this.LIZIZ = paint;
        this.LIZJ = 44.0f;
        this.LIZLLL = 44.0f;
        path.set(C21518819Ji.LIZLLL("M16.765,4.017C18.846,2.717 21.298,2.397 23.358,2.716L23.707,2.777C25.456,3.118 27.283,4.016 28.681,5.67C30.183,7.447 31.1,9.993 30.999,13.394L30.995,13.491C30.995,13.491 31.334,13.364 31.549,13.403C32.627,13.596 33.254,14.766 32.826,16.317C32.613,17.089 32.359,17.737 31.755,18.444C31.011,19.318 30.087,19.755 29.283,20.018C28.391,22.586 27.136,24.941 24.281,25.701C24.203,26.828 24.447,28.376 25.261,29.2L25.367,29.295C26.596,30.276 27.485,30.217 27.485,30.217C33.985,31.717 35.324,32.763 36.485,37.524C37.647,42.285 37.646,50.906 36.887,51.295C36.013,51.743 33.007,52.544 33.007,52.544C33.007,52.544 27.096,53.03 23.308,52.972C16.722,52.871 9.506,53.173 6.583,50.97C6.166,50.655 5.485,42.716 6.503,37.512C6.713,36.438 7.021,35.864 7.579,34.919C8.712,33.001 10.809,31.144 15.066,30.378L15.483,30.3C16.47,30.108 17.53,29.816 18.215,29.022L18.332,28.871C18.892,28.075 18.84,26.924 18.772,26.004C16.961,25.317 16.025,24.459 14.876,22.882C14.153,21.889 13.611,20.49 13.467,20.067C13.412,19.971 13.343,19.843 13.268,19.679C12.298,19.47 11.473,18.743 10.987,17.894L10.862,17.657C10.49,16.891 10.358,16.036 10.503,15.247C10.686,14.247 11.374,13.348 12.358,13.051C12.397,12.369 12.468,11.691 12.553,11.012C13.002,7.633 14.638,5.344 16.765,4.017Z"));
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
