package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GXo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417220GXo extends TuxTextView {
    public int[] LLJJJJ;
    public float[] LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;

    public final void LJJJJJ() {
        CharSequence text;
        if (!this.LLJJL || this.LLJJJJ.length < 2) {
            getPaint().setShader(null);
            invalidate();
            return;
        }
        if (getWidth() == 0 || getHeight() == 0 || (text = getText()) == null || text.length() == 0) {
            return;
        }
        float fMeasureText = (this.LLJJJJLIIL && getMaxLines() == 1) ? getPaint().measureText(getText().toString()) : getWidth();
        float[] fArr = this.LLJJJJJIL;
        if (fArr == null || fArr.length != this.LLJJJJ.length) {
            fArr = null;
        }
        getPaint().setShader(new LinearGradient(0.0f, 0.0f, fMeasureText, 0.0f, this.LLJJJJ, fArr, Shader.TileMode.CLAMP));
        invalidate();
    }

    public final int[] getColors() {
        return this.LLJJJJ;
    }

    public final boolean getGradientEnabled() {
        return this.LLJJL;
    }

    public final float[] getPositions() {
        return this.LLJJJJJIL;
    }

    public final boolean getUseTextWidthForSingleLine() {
        return this.LLJJJJLIIL;
    }

    public final void setColors(int[] iArr) {
        this.LLJJJJ = iArr;
    }

    public final void setGradientEnabled(boolean z) {
        this.LLJJL = z;
    }

    public final void setPositions(float[] fArr) {
        this.LLJJJJJIL = fArr;
    }

    public final void setUseTextWidthForSingleLine(boolean z) {
        this.LLJJJJLIIL = z;
    }

    public C417220GXo(Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        super(context, attributeSet, 0);
        int[] iArr = new int[3];
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.cn, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -8739841;
        }
        iArr[0] = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ce, getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        iArr[1] = iIntValue2;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.cc, getContext());
        iArr[2] = numLIZJ3 != null ? numLIZJ3.intValue() : 0;
        this.LLJJJJ = iArr;
        this.LLJJJJLIIL = true;
        this.LLJJL = true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LJJJJJ();
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (getMaxLines() == 1) {
            LJJJJJ();
        }
    }
}
