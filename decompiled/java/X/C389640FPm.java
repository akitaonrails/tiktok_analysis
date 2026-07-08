package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FPm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389640FPm extends View {
    public final C01GW LL;
    public final RectF LLILLJJLI;

    private final Paint getPaint() {
        return (Paint) this.LL.getValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        if (z) {
            this.LLILLJJLI.set(-getWidth(), 0.0f, getWidth(), getHeight());
            canvas.drawArc(this.LLILLJJLI, -90.0f, 180.0f, false, getPaint());
        } else {
            this.LLILLJJLI.set(0.0f, 0.0f, 2 * getWidth(), getHeight());
            canvas.drawArc(this.LLILLJJLI, -90.0f, -180.0f, false, getPaint());
        }
    }

    public C389640FPm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1610));
        this.LLILLJJLI = new RectF();
    }
}
