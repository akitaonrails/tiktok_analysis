package X;

import Y.ACListenerS132S0200000_30;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;

/* JADX INFO: renamed from: X.14Zw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20287814Zw extends LinearLayout implements InterfaceC20290614aO {
    public final Context LL;
    public LinearLayout LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public InterfaceC20289614aE LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public Drawable LLJ;
    public Drawable LLJI;
    public Drawable LLJIJIL;
    public EnumC1528090prr LLJILJIL;
    public TuxTextView LLJILJILJ;
    public InterfaceC20293914av LLJILLL;

    public void setUnClickableClickListener(InterfaceC20290814aQ interfaceC20290814aQ) {
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Math.round(this.LLILZLL), Math.round(this.LLILZLL));
        layoutParams.setMargins(0, 0, Math.round(this.LLIZ), 0);
        C786410Ut5.c6(imageView, layoutParams);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageDrawable(this.LLJ);
        imageView.setMinimumWidth(10);
        imageView.setMaxHeight(10);
        return imageView;
    }

    public final void LIZ() {
        if (this.LL == null) {
            return;
        }
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(this.LL);
        this.LLILLJJLI = linearLayout;
        linearLayout.setGravity(17);
        for (int i = 0; i < this.LLILZ; i++) {
            ImageView starImageView = getStarImageView();
            starImageView.setImageDrawable(this.LLJ);
            C786410Ut5.Q7(starImageView, new ACListenerS132S0200000_30(starImageView, this, 7));
            this.LLILLJJLI.addView(starImageView);
        }
        setStar(this.LLIZLLLIL);
        addView(this.LLILLJJLI, new LinearLayout.LayoutParams(-1, -2));
        if (this.LL != null) {
            TuxTextView tuxTextView = new TuxTextView(this.LL);
            this.LLJILJILJ = tuxTextView;
            tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1k, this.LL));
            this.LLJILJILJ.setTuxFont(61);
            this.LLJILJILJ.setGravity(17);
            this.LLJILJILJ.setPadding(0, (int) C12ES.LIZJ(4.0f, this.LL), 0, 0);
            addView(this.LLJILJILJ, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        LIZ();
    }

    public InterfaceC20293914av getOptionClickListener() {
        return this.LLJILLL;
    }

    public C20287814Zw(Context context) {
        super(context, null);
        this.LL = context;
        setOrientation(0);
        this.LL = context;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        this.LLILLL = z;
    }

    public void setOnRatingChangeListener(InterfaceC20289614aE interfaceC20289614aE) {
        this.LLILZIL = interfaceC20289614aE;
    }

    public void setOption(String str) {
        TuxTextView tuxTextView = this.LLJILJILJ;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }

    @Override // X.InterfaceC20290614aO
    public void setOptionListener(InterfaceC20293914av interfaceC20293914av) {
        this.LLJILLL = interfaceC20293914av;
    }

    public void setStar(float f) {
        LinearLayout linearLayout;
        if (f < 0.0f) {
            f = 0.0f;
        }
        int i = this.LLILZ;
        if (f > i) {
            f = i;
        }
        InterfaceC20289614aE interfaceC20289614aE = this.LLILZIL;
        if (interfaceC20289614aE != null) {
            interfaceC20289614aE.LIZ(f);
        }
        this.LLIZLLLIL = f;
        int i2 = (int) f;
        float fFloatValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Integer.toString(i2))).floatValue();
        for (int i3 = 0; i3 < i2; i3++) {
            LinearLayout linearLayout2 = this.LLILLJJLI;
            if (linearLayout2 != null) {
                ((ImageView) linearLayout2.getChildAt(i3)).setImageDrawable(this.LLJI);
            }
        }
        for (int i4 = i2; i4 < this.LLILZ; i4++) {
            ((ImageView) this.LLILLJJLI.getChildAt(i4)).setImageDrawable(this.LLJ);
        }
        if (fFloatValue > 0.0f && (linearLayout = this.LLILLJJLI) != null) {
            ((ImageView) linearLayout.getChildAt(i2)).setImageDrawable(this.LLJIJIL);
        }
    }

    public void setStarCount(int i) {
        this.LLILZ = i;
    }

    public void setStarEmptyDrawable(Drawable drawable) {
        this.LLJ = drawable;
    }

    public void setStarFillDrawable(Drawable drawable) {
        this.LLJI = drawable;
    }

    public void setStarHalfDrawable(Drawable drawable) {
        this.LLJIJIL = drawable;
    }

    public void setStarImageSize(float f) {
        this.LLILZLL = f;
    }

    public void setStarPadding(float f) {
        this.LLIZ = f;
    }

    public void setStarStep(float f) {
        this.LLIZLLLIL = f;
    }

    public void setStepSize(int i) {
        this.LLJILJIL = EnumC1528090prr.fromStep(i);
    }
}
