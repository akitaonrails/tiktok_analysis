package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0y2b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1842270y2b extends C0I7D {
    public Function0<Unit> LLIZ;
    public Function0<Unit> LLIZLLLIL;

    @Override // X.C21410318qb, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        Function0<Unit> function0;
        if ((i == 16908322 || i == 16908337) && (function0 = this.LLIZ) != null) {
            function0.invoke();
        }
        return super.onTextContextMenuItem(i);
    }

    public final void setHintTextWithEndEllipsize(CharSequence charSequence) {
        int width;
        if (charSequence != null && charSequence.length() != 0) {
            if (getWidth() > 0) {
                width = getWidth();
            } else {
                width = (int) (getResources().getDisplayMetrics().widthPixels * 0.8f);
            }
            int paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
            if (paddingLeft < 0) {
                paddingLeft = 0;
            }
            TextPaint textPaint = new TextPaint(getPaint());
            textPaint.setTextSize(textPaint.getTextSize());
            textPaint.setTypeface(textPaint.getTypeface());
            textPaint.setAntiAlias(true);
            String strLJJIFFI = u.LJJIFFI(charSequence.toString(), "\n", " ", false);
            float f = paddingLeft;
            if (textPaint.measureText(strLJJIFFI) > f) {
                setHint(TextUtils.ellipsize(strLJJIFFI, textPaint, f, TextUtils.TruncateAt.END));
                return;
            } else {
                setHint(strLJJIFFI);
                return;
            }
        }
        setHint(charSequence);
    }

    public final void setOnHeightChangedListener(Function0<Unit> function0) {
        this.LLIZLLLIL = function0;
    }

    public final void setOnPasteListener(Function0<Unit> function0) {
        this.LLIZ = function0;
    }

    public C1842270y2b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xv);
    }

    public C1842270y2b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Function0<Unit> function0;
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4 && (function0 = this.LLIZLLLIL) != null) {
            function0.invoke();
        }
        if (i != i3) {
            setHintTextWithEndEllipsize(getHint());
        }
    }
}
