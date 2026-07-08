package X;

import Y.ARunnableS88S0200000_19;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0hjA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1215180hjA extends FrameLayout {
    public ConstraintLayout LL;
    public C426160GnO LLILLJJLI;
    public ConstraintLayout LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public View LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxIconView LLJ;
    public TuxTextView LLJI;
    public C426160GnO LLJIJIL;

    public final ConstraintLayout getAnchorContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.azo);
            this.LL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final ConstraintLayout getAnchorDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.azp);
            this.LLILLL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxIconView getAnchorImgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b00);
            this.LLJ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final View getAnchorPriceDivFromXml() {
        View view = this.LLIZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.b1h);
        this.LLIZ = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxTextView getAnchorPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b1g);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C426160GnO getAnchorPricingFlowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b1k);
            this.LLJIJIL = (C426160GnO) callbackFindViewById;
        }
        return (C426160GnO) callbackFindViewById;
    }

    public final TuxTextView getAnchorPricingFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b1j);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C426160GnO getAnchorSubtitleFlowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b2b);
            this.LLILLJJLI = (C426160GnO) callbackFindViewById;
        }
        return (C426160GnO) callbackFindViewById;
    }

    public final TuxTextView getAnchorTagFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b2f);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getAnchorTitleDotDivFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b35);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getAnchorTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b31);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LIZIZ() {
        CharSequence text = getAnchorTagFromXml().getText();
        if (text == null || text.length() == 0) {
            return;
        }
        setPivotX(0.0f);
        setPivotY(getHeight());
        C426160GnO anchorSubtitleFlowFromXml = getAnchorSubtitleFlowFromXml();
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(anchorSubtitleFlowFromXml, new ARunnableS88S0200000_19(anchorSubtitleFlowFromXml, this, 62));
    }

    public C1215180hjA(Context context) {
        super(context, null);
        FrameLayout.inflate(context, R.layout.du_, this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        float f = C715390S4j.LIZ;
        C715390S4j.LIZJ(4, getAnchorContentFromXml());
    }

    public final void setAnchorContentFromXml(ConstraintLayout constraintLayout) {
        this.LL = constraintLayout;
    }

    public final void setAnchorDescFromXml(ConstraintLayout constraintLayout) {
        this.LLILLL = constraintLayout;
    }

    public final void setAnchorImgFromXml(TuxIconView tuxIconView) {
        this.LLJ = tuxIconView;
    }

    public final void setAnchorPriceDivFromXml(View view) {
        this.LLIZ = view;
    }

    public final void setAnchorPriceFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setAnchorPricingFlowFromXml(C426160GnO c426160GnO) {
        this.LLJIJIL = c426160GnO;
    }

    public final void setAnchorPricingFromXml(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public final void setAnchorSubtitleFlowFromXml(C426160GnO c426160GnO) {
        this.LLILLJJLI = c426160GnO;
    }

    public final void setAnchorTagFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setAnchorTitleDotDivFromXml(TuxTextView tuxTextView) {
        this.LLJI = tuxTextView;
    }

    public final void setAnchorTitleFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setSubtitle$anchor_business_release(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            getAnchorTagFromXml().setText(str);
            C03DZ.LIZJ(getAnchorTagFromXml());
        }
    }

    public final void setTitle$anchor_business_release(CharSequence charSequence) {
        if (charSequence != null) {
            getAnchorTitleFromXml().setText(charSequence);
        }
    }

    public final void LIZ(String str, String str2, boolean z) {
        String strJ4;
        if (z) {
            if (str2 != null) {
                Object[] objArr = new Object[1];
                if (str == null) {
                    str = "";
                }
                objArr[0] = str;
                strJ4 = C786410Ut5.j4(str2, Arrays.copyOf(objArr, 1));
            } else {
                strJ4 = null;
            }
            setSubtitle$anchor_business_release(strJ4);
            LIZIZ();
            return;
        }
        if (str == null || str.length() == 0) {
            return;
        }
        getAnchorPricingFromXml().setText(str);
        C12ES.LJIILL(4, getAnchorTitleFromXml());
        ConstraintLayout anchorDescFromXml = getAnchorDescFromXml();
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(anchorDescFromXml, new ARunnableS88S0200000_19(anchorDescFromXml, this, 61));
        C03DZ.LIZJ(getAnchorTitleDotDivFromXml());
        C03DZ.LIZJ(getAnchorTitleFromXml());
        C03DZ.LIZJ(getAnchorPricingFlowFromXml());
    }
}
