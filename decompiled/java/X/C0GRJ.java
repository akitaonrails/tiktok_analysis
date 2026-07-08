package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GRJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GRJ extends View {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    private final Paint getForgroundPaint() {
        return (Paint) this.LLILLJJLI.getValue();
    }

    private final TuxIconDrawable getIconDrawable() {
        return (TuxIconDrawable) this.LLILLL.getValue();
    }

    private final Paint getRingPaint() {
        return (Paint) this.LL.getValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float fMin = Math.min(width, height);
        canvas.drawCircle(width, height, fMin, getForgroundPaint());
        canvas.drawCircle(width, height, fMin - (getRingPaint().getStrokeWidth() / 2), getRingPaint());
        int width2 = (getWidth() - getIconDrawable().getIntrinsicWidth()) / 2;
        int height2 = (getHeight() - getIconDrawable().getIntrinsicHeight()) / 2;
        getIconDrawable().setBounds(new Rect(width2, height2, getIconDrawable().getIntrinsicWidth() + width2, getIconDrawable().getIntrinsicHeight() + height2));
        getIconDrawable().draw(canvas);
    }

    public C0GRJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1240));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1238));
        this.LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1239));
    }
}
