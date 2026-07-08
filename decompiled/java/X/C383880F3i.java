package X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0F3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C383880F3i implements InterfaceC384230F4r {
    public final Paint LIZ;
    public final Path LIZIZ;
    public final float LIZJ;
    public final RectF LIZLLL;
    public final float LJ;

    @Override // X.InterfaceC384230F4r
    public final void LIZ() {
    }

    public C383880F3i() {
        Paint paint = new Paint();
        paint.setStrokeWidth(C341940Daq.LIZ(1.0d));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.LIZ = paint;
        this.LIZIZ = new Path();
        C341940Daq.LIZ(13.0d);
        this.LIZJ = 1.0f;
        this.LIZLLL = new RectF();
        this.LJ = C341940Daq.LIZ(30.0d) / 1000.0f;
    }
}
