package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GkE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424200GkE extends C418780GbU {
    public C19471411Fw LL;
    public C424190GkD LLILLJJLI;
    public String LLILLL;
    public Drawable LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;

    public final C19471411Fw getAvDmtTextView() {
        C19471411Fw c19471411Fw = this.LL;
        if (c19471411Fw != null) {
            return c19471411Fw;
        }
        return null;
    }

    public final void setAvDmtTextView(C19471411Fw c19471411Fw) {
        this.LL = c19471411Fw;
    }

    public final void setChangeColor(boolean z) {
        C424190GkD c424190GkD = this.LLILLJJLI;
        if (c424190GkD == null) {
            c424190GkD = null;
        }
        c424190GkD.setChangeColor(z);
    }

    public final void setImageRes(int i) {
        C424190GkD c424190GkD = this.LLILLJJLI;
        if (c424190GkD == null) {
            c424190GkD = null;
        }
        c424190GkD.setImageDrawable(C800330VaR.LIZIZ(getContext(), i));
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            getAvDmtTextView().setText(str);
        }
    }

    public final void setTextSize(int i) {
        getAvDmtTextView().setTextSize(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C424200GkE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i = 0;
        this.LLIZ = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            this.LLILLL = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.AVDmtView_titleText);
            this.LLILZ = typedArrayObtainStyledAttributes.getDrawable(R$styleable.AVDmtView_localSrc);
            this.LLILZIL = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.AVDmtView_padding, 0.0f);
            this.LLILZLL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_isShowTextLanguage, false);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.LLILZLL) {
            this.LLIZ = C12VA.LIZ().LIZ;
        }
        setAvDmtTextView(new C19471411Fw(context, null, 6));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = (int) C11VU.LIZIZ(4.0f, context);
        layoutParams.gravity = 16;
        C19471411Fw avDmtTextView = getAvDmtTextView();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(avDmtTextView);
        avDmtTextView.setLayoutParams(layoutParams);
        this.LLILLJJLI = new C424190GkD(context, 0 == true ? 1 : 0, 6, i);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        if (!this.LLIZ) {
            int iLIZIZ = (int) C11VU.LIZIZ(12.0f, getContext());
            layoutParams2.rightMargin = iLIZIZ;
            layoutParams2.leftMargin = iLIZIZ;
        }
        C424190GkD c424190GkD = this.LLILLJJLI;
        c424190GkD = c424190GkD == null ? null : c424190GkD;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424190GkD);
        c424190GkD.setLayoutParams(layoutParams2);
        C424190GkD c424190GkD2 = this.LLILLJJLI;
        addView(c424190GkD2 == null ? null : c424190GkD2);
        addView(getAvDmtTextView());
        int i2 = this.LLILZIL;
        setPadding(i2, i2, i2, i2);
        setGravity(17);
        getAvDmtTextView().setTextSize(13.0f);
        getAvDmtTextView().setMaxLines(1);
        getAvDmtTextView().setEllipsize(TextUtils.TruncateAt.END);
        C786410Ut5.g1(getAvDmtTextView(), 8);
        C424190GkD c424190GkD3 = this.LLILLJJLI;
        (c424190GkD3 == null ? null : c424190GkD3).setChangeColor(false);
        if (!TextUtils.isEmpty(this.LLILLL)) {
            getAvDmtTextView().setText(this.LLILLL);
        }
        Drawable drawable = this.LLILZ;
        if (drawable != null) {
            C424190GkD c424190GkD4 = this.LLILLJJLI;
            (c424190GkD4 != null ? c424190GkD4 : null).setImageDrawable(drawable);
        }
        if (this.LLIZ) {
            C786410Ut5.g1(getAvDmtTextView(), 0);
        }
    }
}
