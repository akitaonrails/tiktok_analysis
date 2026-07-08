package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iMk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239720iMk extends FrameLayout {
    public final C19713212Aw LL;
    public final TextView LLILLJJLI;
    public String LLILLL;
    public boolean LLILZ;

    public final boolean getDisableWhileLoading() {
        return this.LLILZ;
    }

    public final void LIZ(boolean z) {
        this.LLILZ = false;
        setEnabled(z);
        if (this.LL.getVisibility() != 8) {
            C786410Ut5.w1(this.LL, 8);
        }
        this.LL.LIZJ();
        setText(this.LLILLL);
    }

    public final void LIZIZ(boolean z) {
        this.LLILZ = z;
        setEnabled(!z);
        if (this.LL.getVisibility() != 0) {
            C786410Ut5.w1(this.LL, 0);
        }
        this.LL.LIZIZ();
        setText("");
    }

    public final void setButtonText(String str) {
        this.LLILLL = str;
        this.LLILLJJLI.setText(str);
    }

    public final void setDisableWhileLoading(boolean z) {
        this.LLILZ = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.LLILLJJLI.setEnabled(z);
        if (!this.LLILLJJLI.isEnabled() && !this.LLILZ) {
            this.LLILLJJLI.setTextColor(C960203pA.LIZ(R.attr.a1p, getContext()));
            this.LLILLJJLI.setBackground(C800330VaR.LIZIZ(getContext(), R.drawable.adf));
        } else {
            this.LLILLJJLI.setTextColor(C960203pA.LIZ(R.attr.ee, getContext()));
            this.LLILLJJLI.setBackground(C800330VaR.LIZIZ(getContext(), R.drawable.adg));
        }
    }

    public final void setText(String str) {
        this.LLILLJJLI.setText(str);
    }

    public C1239720iMk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LoadingButton);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.LoadingButton_loadingColor, -1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LoadingButton_loadingViewSize, C341940Daq.LIZ(20.0d));
        float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LoadingButton_loadingLineSize, C341940Daq.LIZ(3.0d));
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.LoadingButton_android_textColor, -16777216);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LoadingButton_android_text);
        this.LLILLL = strXd == null ? "" : strXd;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.LoadingButton_android_background);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LoadingButton_android_textSize, -1);
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJLLJ(context, R.layout.z_, this);
        if (drawable != null) {
            setBackground(drawable);
        }
        C19713212Aw c19713212Aw = (C19713212Aw) findViewById(R.id.nlj);
        this.LL = c19713212Aw;
        TextView textView = (TextView) findViewById(R.id.nlk);
        this.LLILLJJLI = textView;
        textView.setText(this.LLILLL);
        textView.setTextColor(color2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c19713212Aw.getLayoutParams();
        layoutParams.height = dimensionPixelSize;
        layoutParams.width = dimensionPixelSize;
        C19713212Aw c19713212Aw2 = this.LL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19713212Aw2);
        c19713212Aw2.setLayoutParams(layoutParams);
        c19713212Aw.setLoadingColor(color);
        c19713212Aw.setLineWidth(dimensionPixelSize2);
        if (dimensionPixelSize3 != -1) {
            textView.setTextSize(0, dimensionPixelSize3);
        }
        setEnabled(false);
        C10VO.LIZIZ(this);
    }
}
