package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GlK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C424880GlK extends LinearLayout {
    public TextView LL;
    public Button LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LL = (TextView) findViewById(R.id.vn_);
        this.LLILLJJLI = (Button) findViewById(R.id.vn8);
    }

    public Button getActionView() {
        return this.LLILLJJLI;
    }

    public TextView getMessageView() {
        return this.LL;
    }

    public void setMaxInlineActionWidth(int i) {
        this.LLILZ = i;
    }

    public C424880GlK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SnackbarLayout);
        this.LLILLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SnackbarLayout_android_maxWidth, -1);
        this.LLILZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SnackbarLayout_maxActionInlineWidth, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LLILLL > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.LLILLL;
            if (measuredWidth > i3) {
                i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                super.onMeasure(i, i2);
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.r9);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.r8);
        if (this.LL.getLayout().getLineCount() > 1) {
            if (this.LLILZ > 0 && this.LLILLJJLI.getMeasuredWidth() > this.LLILZ) {
                if (!LIZ(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    return;
                }
            }
            super.onMeasure(i, i2);
        }
        dimensionPixelSize = dimensionPixelSize2;
        if (!LIZ(0, dimensionPixelSize, dimensionPixelSize)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public final boolean LIZ(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.LL.getPaddingTop() == i2 && this.LL.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.LL;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }
}
