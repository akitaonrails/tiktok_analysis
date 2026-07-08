package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0FNS, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FNS extends TuxTextView {
    public final PorterDuffXfermode LLJJJJ;
    public boolean LLJJJJJIL;

    public final boolean getEnableHollow() {
        return this.LLJJJJJIL;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LLJJJJJIL) {
            getPaint().setXfermode(this.LLJJJJ);
            super.onDraw(canvas);
        } else {
            getPaint().setXfermode(null);
            super.onDraw(canvas);
        }
    }

    public final void setEnableHollow(boolean z) {
        this.LLJJJJJIL = z;
        invalidate();
    }

    public C0FNS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJ = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    }
}
