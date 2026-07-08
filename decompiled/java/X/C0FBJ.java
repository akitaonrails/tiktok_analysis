package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Size;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: renamed from: X.0FBJ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FBJ implements C0FBW {
    public boolean LIZ;
    public C0EO3 LIZIZ = new C0EO3(false, false);
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(369));
    public final float LIZLLL = C0EGK.LIZIZ() * 44.0f;

    @Override // X.C0FBW
    public final int LIZIZ() {
        return 2;
    }

    @Override // X.C0FBW
    public final void LIZ(Canvas canvas, Size size, C0FEW c0few) {
        if (!this.LIZ) {
            return;
        }
        if (this.LIZIZ.LIZ) {
            float measuredWidth = c0few.getMeasuredWidth() / 2.0f;
            canvas.drawLine(measuredWidth, 0.0f, measuredWidth, this.LIZLLL, (Paint) this.LIZJ.getValue());
            float measuredHeight = c0few.getMeasuredHeight();
            canvas.drawLine(measuredWidth, measuredHeight - this.LIZLLL, measuredWidth, measuredHeight, (Paint) this.LIZJ.getValue());
        }
        if (this.LIZIZ.LIZIZ) {
            float measuredHeight2 = c0few.getMeasuredHeight() / 2.0f;
            canvas.drawLine(0.0f, measuredHeight2, this.LIZLLL, measuredHeight2, (Paint) this.LIZJ.getValue());
            float measuredWidth2 = c0few.getMeasuredWidth();
            canvas.drawLine(measuredWidth2 - this.LIZLLL, measuredHeight2, measuredWidth2, measuredHeight2, (Paint) this.LIZJ.getValue());
        }
    }
}
