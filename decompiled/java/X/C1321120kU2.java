package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0kU2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321120kU2 extends C1331050kk3 implements InterfaceC1320910kTh {
    public Drawable LLILZIL;
    public InterfaceC1321160kU6 LLILZLL;

    @Override // X.C1331050kk3, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // X.C1331050kk3, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    public C1321120kU2(Drawable drawable) {
        super(drawable);
    }

    @Override // X.InterfaceC1320910kTh
    public final void LIZLLL(InterfaceC1321160kU6 interfaceC1321160kU6) {
        this.LLILZLL = interfaceC1321160kU6;
    }

    @Override // X.C1331050kk3, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!isVisible()) {
            return;
        }
        InterfaceC1321160kU6 interfaceC1321160kU6 = this.LLILZLL;
        if (interfaceC1321160kU6 != null) {
            interfaceC1321160kU6.onDraw();
        }
        super.draw(canvas);
        Drawable drawable = this.LLILZIL;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.LLILZIL.draw(canvas);
        }
    }

    @Override // X.C1331050kk3, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        InterfaceC1321160kU6 interfaceC1321160kU6 = this.LLILZLL;
        if (interfaceC1321160kU6 != null) {
            interfaceC1321160kU6.LIZ(z);
        }
        return super.setVisible(z, z2);
    }
}
