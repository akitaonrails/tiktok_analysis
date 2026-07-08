package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Eg2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370640Eg2 extends FrameLayout {
    public final C427660Gpo LL;
    public final TuxIconView LLILLJJLI;
    public final Paint LLILLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = this.LLILLJJLI.getWidth();
        int height = this.LLILLJJLI.getHeight();
        if (width > 0 && height > 0) {
            float f = width / 2.0f;
            this.LLILLL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawCircle(this.LLILLJJLI.getLeft() + f, this.LLILLJJLI.getTop() + (height / 2.0f), f, this.LLILLL);
        }
    }

    public C370640Eg2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C418440Gaw.LIZIZ(5));
        this.LLILLL = paint;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ceg, this, true);
        this.LL = (C427660Gpo) findViewById(R.id.nvy);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.ey9);
        this.LLILLJJLI = tuxIconView;
        tuxIconView.setImageDrawable(new C370650Eg3(C418440Gaw.LIZIZ(Float.valueOf(0.0f)), new AnonymousClass0615().LIZ));
        setWillNotDraw(false);
        setLayerType(1, null);
    }
}
