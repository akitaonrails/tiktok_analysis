package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.19R8, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19R8 extends LinearLayout implements C19RA {
    public final C19R5 LL;

    @Override // X.C19RA
    public final void LJJJ(C19RB c19rb) {
        setOutlineProvider(c19rb);
        setClipToOutline(true);
    }

    @Override // X.C19RA
    public final void LJJJJ(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        this.LL.LIZ(canvas);
    }

    public C19R8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C19R5 c19r5 = new C19R5(this);
        this.LL = c19r5;
        c19r5.LIZIZ(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LL.LIZJ(getWidth(), getHeight());
    }
}
