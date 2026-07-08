package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0GWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416940GWm extends FrameLayout {
    public final Path LL;
    public boolean LLILLJJLI;

    public C416940GWm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Path path = new Path();
        this.LL = path;
        float f = 2;
        float f2 = ((f * 2.5f) + 18.0f) / f;
        if (C426750GoL.LIZLLL(context)) {
            path.addCircle(C11VU.LIZ(f2 - 2.5f), C11VU.LIZ((64.0f - f2) + 2.5f), C11VU.LIZ(f2), Path.Direction.CCW);
        } else {
            float fLIZ = C11VU.LIZ((64.0f - f2) + 2.5f);
            path.addCircle(fLIZ, fLIZ, C11VU.LIZ(f2), Path.Direction.CCW);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.save();
        if (this.LLILLJJLI) {
            canvas.clipPath(this.LL, Region.Op.DIFFERENCE);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return zDrawChild;
    }
}
