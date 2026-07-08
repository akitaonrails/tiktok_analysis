package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Size;

/* JADX INFO: renamed from: X.0FBH, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FBH implements C0FBW {
    public boolean LIZ;
    public String LIZIZ;
    public final C444890HcV LIZJ;
    public final float LIZLLL;

    @Override // X.C0FBW
    public final int LIZIZ() {
        return 4;
    }

    public C0FBH() {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.setColor(-1);
        c444890HcV.setAntiAlias(true);
        c444890HcV.setTextSize(C418440Gaw.LIZIZ(12));
        c444890HcV.LIZ(61);
        c444890HcV.setTextAlign(Paint.Align.CENTER);
        this.LIZJ = c444890HcV;
        this.LIZLLL = (-c444890HcV.getFontMetrics().ascent) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    }

    @Override // X.C0FBW
    public final void LIZ(Canvas canvas, Size size, C0FEW c0few) {
        String str;
        if (!this.LIZ || (str = this.LIZIZ) == null) {
            return;
        }
        canvas.drawText(str, c0few.getWidth() / 2.0f, this.LIZLLL, this.LIZJ);
    }
}
