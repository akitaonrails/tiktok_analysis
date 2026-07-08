package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P08, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P08 extends C197039127h {
    public int LLLIIIL;
    public String LLLIIL;
    public int LLLIILIL;
    public boolean LLLIL;
    public Integer LLLILZ;

    public final void LJJLIIIIJ() {
        Integer num = this.LLLILZ;
        if (num != null) {
            setIconTintColor(num.intValue());
        }
    }

    public final String getFallbackText() {
        String str = this.LLLIIL;
        if (str != null) {
            return str;
        }
        if (this.LLLIIIL != 0) {
            return getContext().getString(this.LLLIIIL);
        }
        return null;
    }

    @Override // X.C197039127h
    public final void LJJJJJ() {
        Drawable drawable;
        TuxIconDrawable tuxIconDrawable;
        Drawable[] compoundDrawables = getCompoundDrawables();
        if (compoundDrawables != null && compoundDrawables.length != 0 && (drawable = compoundDrawables[0]) != null) {
            Integer num = null;
            if ((drawable instanceof TuxIconDrawable) && (tuxIconDrawable = (TuxIconDrawable) drawable) != null) {
                num = tuxIconDrawable.LJIILL;
            }
            this.LLLILZ = num;
        }
        super.LJJJJJ();
    }

    public final int getFallbackStartIconResId() {
        return this.LLLIILIL;
    }

    public final int getFallbackTextResId() {
        return this.LLLIIIL;
    }

    public final void setFallbackEnabled(boolean z) {
        this.LLLIL = z;
    }

    public final void setFallbackStartIconResId(int i) {
        this.LLLIILIL = i;
    }

    public final void setFallbackText(String str) {
        this.LLLIIL = str;
    }

    public final void setFallbackTextResId(int i) {
        this.LLLIIIL = i;
    }

    @Override // X.C197039127h
    public void setIconTintColor(int i) {
        super.setIconTintColor(i);
        this.LLLILZ = Integer.valueOf(i);
    }

    public C0P08(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xj);
        this.LLLIL = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FallbackSupportTuxButton);
        this.LLLIIIL = typedArrayObtainStyledAttributes.getResourceId(R$styleable.FallbackSupportTuxButton_fallback_text, 0);
        this.LLLIILIL = typedArrayObtainStyledAttributes.getResourceId(R$styleable.FallbackSupportTuxButton_fallback_iconStart, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        int minimumWidth;
        TuxIconDrawable tuxIconDrawable;
        Drawable drawable2;
        int minimumWidth2;
        TuxIconDrawable tuxIconDrawable2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.LLLIL && getFallbackText() != null) {
            CharSequence text = getText();
            int iLIZIZ = 0;
            if (text != null && text.length() > 0 && !Intrinsics.LJFF(getFallbackText(), getText()) && getWidth() > 0 && getHeight() > 0) {
                Drawable[] compoundDrawables = getCompoundDrawables();
                if (compoundDrawables != null) {
                    if (compoundDrawables.length > 0 && (drawable2 = compoundDrawables[0]) != null) {
                        if ((drawable2 instanceof TuxIconDrawable) && (tuxIconDrawable2 = (TuxIconDrawable) drawable2) != null) {
                            minimumWidth2 = tuxIconDrawable2.LIZJ();
                        } else {
                            minimumWidth2 = drawable2.getMinimumWidth();
                        }
                        iLIZIZ = 0 + minimumWidth2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(4.0f)));
                    }
                    if (compoundDrawables.length > 2 && (drawable = compoundDrawables[2]) != null) {
                        if ((drawable instanceof TuxIconDrawable) && (tuxIconDrawable = (TuxIconDrawable) drawable) != null) {
                            minimumWidth = tuxIconDrawable.LIZJ();
                        } else {
                            minimumWidth = drawable.getMinimumWidth();
                        }
                        iLIZIZ += minimumWidth + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(4.0f)));
                    }
                }
                int width = ((getWidth() - getPaddingStart()) - getPaddingEnd()) - iLIZIZ;
                float fMeasureText = getPaint().measureText(getText().toString());
                if (getMinTextSize() > 0) {
                    TextPaint textPaint = new TextPaint(getPaint());
                    textPaint.setTextSize(getMinTextSize());
                    fMeasureText = textPaint.measureText(getText().toString());
                }
                if (fMeasureText > width) {
                    setText(getFallbackText());
                    int i5 = this.LLLIILIL;
                    if (i5 != 0) {
                        setButtonStartIcon(Integer.valueOf(i5));
                        LJJLIIIIJ();
                    }
                }
            }
        }
    }
}
