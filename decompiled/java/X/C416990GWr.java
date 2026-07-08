package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0GWr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416990GWr extends C1610770s1D {
    public final Path LLJIJIL;
    public boolean LLJILJIL;

    @Override // X.C1610770s1D, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        if (this.LLJILJIL) {
            canvas.clipPath(this.LLJIJIL, Region.Op.DIFFERENCE);
        }
        super.onDraw(canvas);
        canvas.restore();
    }

    public C416990GWr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Path path = new Path();
        this.LLJIJIL = path;
        float f = 2;
        float f2 = ((2.5f * f) + 18.0f) / f;
        float fLIZ = C11VU.LIZ(((74.0f - (10.0f / f)) - f2) + (5.0f / f));
        if (C426750GoL.LIZLLL(context)) {
            path.addCircle(C11VU.LIZ(79.0f) - fLIZ, fLIZ, C11VU.LIZ(f2), Path.Direction.CCW);
        } else {
            path.addCircle(fLIZ, fLIZ, C11VU.LIZ(f2), Path.Direction.CCW);
        }
    }
}
