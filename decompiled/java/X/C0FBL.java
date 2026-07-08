package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Size;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: renamed from: X.0FBL, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FBL implements C0FBW {
    public boolean LIZ;
    public C0FBM LIZIZ = new C0FBM(false, false, false, false);
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(370));

    @Override // X.C0FBW
    public final int LIZIZ() {
        return 3;
    }

    public final Paint LIZJ() {
        return (Paint) this.LIZJ.getValue();
    }

    @Override // X.C0FBW
    public final void LIZ(Canvas canvas, Size size, C0FEW c0few) {
        if (this.LIZ && size.getWidth() > 0 && size.getHeight() > 0) {
            float f = 2;
            float measuredWidth = (c0few.getMeasuredWidth() - size.getWidth()) / f;
            float width = measuredWidth + size.getWidth();
            float measuredHeight = (c0few.getMeasuredHeight() - size.getHeight()) / f;
            float height = size.getHeight() + measuredHeight;
            if (this.LIZIZ.LIZ) {
                canvas.drawLine(measuredWidth, measuredHeight, measuredWidth, height, LIZJ());
            }
            if (this.LIZIZ.LIZJ) {
                canvas.drawLine(width, measuredHeight, width, height, LIZJ());
            }
            if (this.LIZIZ.LIZIZ) {
                canvas.drawLine(measuredWidth, measuredHeight + (LIZJ().getStrokeWidth() / f), width, measuredHeight + (LIZJ().getStrokeWidth() / f), LIZJ());
            }
            if (this.LIZIZ.LIZLLL) {
                canvas.drawLine(measuredWidth, height - (LIZJ().getStrokeWidth() / f), width, height - (LIZJ().getStrokeWidth() / f), LIZJ());
            }
        }
    }
}
