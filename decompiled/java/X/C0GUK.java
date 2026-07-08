package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.0GUK, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GUK extends ConstraintLayout {
    public final Path LL;

    public C0GUK(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0GUK(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        Path path = new Path();
        this.LL = path;
        if (C426750GoL.LIZLLL(context)) {
            i2 = 9;
        } else {
            i2 = 39;
        }
        path.addCircle(C497740JfY.LIZIZ(i2), C497740JfY.LIZIZ(39), C497740JfY.LIZIZ(8), Path.Direction.CCW);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.save();
        canvas.clipPath(this.LL, Region.Op.DIFFERENCE);
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return zDrawChild;
    }
}
