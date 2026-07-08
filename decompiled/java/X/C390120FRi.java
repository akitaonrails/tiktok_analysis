package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0FRi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390120FRi extends TuxTextView {
    public final Paint LLJJJJ;
    public final PorterDuffXfermode LLJJJJJIL;
    public final RectF LLJJJJLIIL;

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.LLJJJJLIIL;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getWidth();
        rectF.bottom = getHeight();
        canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        float f = 2;
        canvas.drawRoundRect(this.LLJJJJLIIL, getHeight() / f, getHeight() / f, this.LLJJJJ);
        getPaint().setXfermode(this.LLJJJJJIL);
        super.onDraw(canvas);
        canvas.restore();
    }

    public C390120FRi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.LLJJJJ = paint;
        this.LLJJJJLIIL = new RectF();
        paint.setColor(-1);
        this.LLJJJJJIL = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        int i = 0;
        if (charSequence != null && charSequence.length() != 0) {
            try {
                SpannableString spannableString = new SpannableString(charSequence);
                int length = charSequence.length();
                while (i < length) {
                    int i2 = i + 1;
                    C786410Ut5.p2(spannableString, new ScaleXSpan(0.92f), i, i2, 33);
                    i = i2;
                }
                super.setText(spannableString, bufferType);
                return;
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                super.setText(charSequence, bufferType);
                return;
            }
        }
        super.setText(charSequence, bufferType);
    }
}
