package X;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1884, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1884 extends FrameLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;

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

    public AnonymousClass1884(Context context, AttributeSet attributeSet) {
        TextPaint paint;
        super(context, attributeSet);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.boc, this, true);
        TuxTextView productOriginPriceFromXml = getProductOriginPriceFromXml();
        if (productOriginPriceFromXml != null && (paint = productOriginPriceFromXml.getPaint()) != null) {
            paint.setFlags(16);
            paint.setAntiAlias(true);
        }
    }

    public final void LIZ(String str, String str2) {
        if (C770702zh.LIZ(str)) {
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
        if (C770702zh.LIZ(str2)) {
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
