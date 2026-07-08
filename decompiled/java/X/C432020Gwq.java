package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gwq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C432020Gwq extends FrameLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;

    @Override // android.view.View
    public int getBaseline() {
        if (!this.LLILZ) {
            return super.getBaseline();
        }
        TuxTextView productOriginPriceFromXml = getProductOriginPriceFromXml();
        if ((productOriginPriceFromXml != null && productOriginPriceFromXml.getVisibility() == 0) && productOriginPriceFromXml.getBaseline() != -1) {
            return productOriginPriceFromXml.getBaseline();
        }
        TuxTextView productDistcountFromXml = getProductDistcountFromXml();
        return (productDistcountFromXml == null || productDistcountFromXml.getVisibility() != 0 || productDistcountFromXml.getBaseline() == -1) ? super.getBaseline() : productDistcountFromXml.getBaseline();
    }

    public final TuxTextView getProductDistcountFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rxp);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getProductOriginPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rz5);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setDiscountBgColor(int i) {
        getProductDistcountFromXml().setBackgroundColor(i);
    }

    public final void setDiscountColor(int i) {
        getProductDistcountFromXml().setTextColor(i);
    }

    public final void setDiscountTuxFont(int i) {
        getProductDistcountFromXml().setTuxFont(i);
    }

    public final void setOriginPriceColor(int i) {
        getProductOriginPriceFromXml().setTextColor(i);
    }

    public final void setOriginPriceTuxFont(int i) {
        getProductOriginPriceFromXml().setTuxFont(i);
    }

    public final void setProductDistcountFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setProductOriginPriceFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public C432020Gwq(Context context, AttributeSet attributeSet) {
        TextPaint paint;
        super(context, attributeSet);
        this.LLILLL = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ProductScribingPriceView);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.ProductScribingPriceView_priceFont, 51);
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.ProductScribingPriceView_discountFont, 91);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.ProductScribingPriceView_priceColor, R.attr.a1p);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.ProductScribingPriceView_discountColor, R.attr.a04);
        typedArrayObtainStyledAttributes.getColor(R$styleable.ProductScribingPriceView_discountBackgroundColor, R.attr.a07);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ProductScribingPriceView_displayDiscount, true);
        this.LLILLL = z;
        this.LLILZ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ProductScribingPriceView_enableCustomBaseline, false);
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.akp, this, true);
        TuxTextView productOriginPriceFromXml = getProductOriginPriceFromXml();
        if (productOriginPriceFromXml != null && (paint = productOriginPriceFromXml.getPaint()) != null) {
            paint.setFlags(16);
            paint.setAntiAlias(true);
        }
        TuxTextView productOriginPriceFromXml2 = getProductOriginPriceFromXml();
        productOriginPriceFromXml2.setTuxFont(i);
        productOriginPriceFromXml2.setTextColorRes(color);
        TuxTextView productDistcountFromXml = getProductDistcountFromXml();
        productDistcountFromXml.setTuxFont(i2);
        productDistcountFromXml.setTextColorRes(color2);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a07, context);
        if (numLIZJ != null) {
            productDistcountFromXml.setBackgroundColor(numLIZJ.intValue());
        }
        if (!z) {
            C12ES.LJIILL(4, productDistcountFromXml);
        }
    }

    public final void LIZ(String str, String str2) {
        if (C703302op.LIZ(str)) {
            TuxTextView productOriginPriceFromXml = getProductOriginPriceFromXml();
            if (productOriginPriceFromXml != null) {
                C786410Ut5.LLLLZLL(productOriginPriceFromXml, 0);
            }
            TuxTextView productOriginPriceFromXml2 = getProductOriginPriceFromXml();
            if (productOriginPriceFromXml2 != null) {
                productOriginPriceFromXml2.setText(str);
            }
        } else {
            TuxTextView productOriginPriceFromXml3 = getProductOriginPriceFromXml();
            if (productOriginPriceFromXml3 != null) {
                C786410Ut5.LLLLZLL(productOriginPriceFromXml3, 8);
            }
        }
        if (C703302op.LIZ(str2) && this.LLILLL) {
            TuxTextView productDistcountFromXml = getProductDistcountFromXml();
            if (productDistcountFromXml != null) {
                C786410Ut5.LLLLZLL(productDistcountFromXml, 0);
            }
            TuxTextView productDistcountFromXml2 = getProductDistcountFromXml();
            if (productDistcountFromXml2 != null) {
                productDistcountFromXml2.setText(str2);
                return;
            }
            return;
        }
        TuxTextView productDistcountFromXml3 = getProductDistcountFromXml();
        if (productDistcountFromXml3 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(productDistcountFromXml3, 8);
    }
}
