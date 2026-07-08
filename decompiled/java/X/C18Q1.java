package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18Q1, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18Q1 extends RelativeLayout implements C18QA {
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public C426160GnO LLILZLL;
    public FrameLayout LLIZ;
    public final boolean LLIZLLLIL;

    @Override // X.C18QA
    public final void hide() {
    }

    @Override // X.C18QA
    public final void show() {
    }

    public final SmartImageView getIvProductCoverFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lrz);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final C426160GnO getLayoutCommonPromotionFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m_j);
            this.LLILZLL = (C426160GnO) callbackFindViewById;
        }
        return (C426160GnO) callbackFindViewById;
    }

    public final FrameLayout getLayoutSpecialPromotionFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mf4);
            this.LLIZ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxTextView getTvProductCurrencyFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_product_currency);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvProductOriginalPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_product_original_price);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvProductSalesPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_product_sales_price);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvProductTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_product_title);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18Q1(Context context) {
        ContextThemeWrapper contextThemeWrapper;
        super(context, null, 0);
        boolean z = false;
        if (C294640Bgk.LIZIZ() && C294640Bgk.LIZ() != 1) {
            z = true;
        }
        this.LLIZLLLIL = z;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        if (z) {
            contextThemeWrapper = new ContextThemeWrapper(context, R.style.z5);
        } else {
            contextThemeWrapper = new ContextThemeWrapper(context, R.style.y0);
        }
        C786410Ut5.Td(C786410Ut5.ne(contextThemeWrapper), R.layout.bte, this, true);
        if (z) {
            getIvProductCoverFromXml().setPlaceholderImage(C1308910kAL.LJ(R.attr.bv, context));
            getTvProductTitleFromXml().setTextColorRes(R.attr.e3);
            getTvProductCurrencyFromXml().setTextColorRes(R.attr.e2);
            getTvProductSalesPriceFromXml().setTextColorRes(R.attr.e2);
            getTvProductOriginalPriceFromXml().setTextColorRes(R.attr.e6);
        } else {
            getIvProductCoverFromXml().setPlaceholderImage(C1308910kAL.LJ(R.attr.dz, context));
            getTvProductTitleFromXml().setTextColorRes(R.attr.eg);
            getTvProductCurrencyFromXml().setTextColorRes(R.attr.ee);
            getTvProductSalesPriceFromXml().setTextColorRes(R.attr.ee);
            getTvProductOriginalPriceFromXml().setTextColorRes(R.attr.eh);
        }
        TextPaint paint = getTvProductOriginalPriceFromXml().getPaint();
        if (paint != null) {
            paint.setFlags(16);
            paint.setAntiAlias(true);
        }
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LLLF.getValue());
    }

    public final void setIvProductCoverFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public final void setLayoutCommonPromotionFromXml(C426160GnO c426160GnO) {
        this.LLILZLL = c426160GnO;
    }

    public final void setLayoutSpecialPromotionFromXml(FrameLayout frameLayout) {
        this.LLIZ = frameLayout;
    }

    public final void setTvProductCurrencyFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setTvProductOriginalPriceFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setTvProductSalesPriceFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setTvProductTitleFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0319  */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.0GnO, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v56, types: [X.0GqR, android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.internal.AwS367S0200000_1] */
    /* JADX WARN: Type inference failed for: r5v9, types: [X.0cGy, android.view.View] */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.jvm.internal.AwS5S0002000_1] */
    /* JADX WARN: Type inference failed for: r8v13, types: [android.widget.TextView, com.bytedance.tux.input.TuxTextView] */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.03IN, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v5, types: [X.03oe, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [X.0FJJ, android.view.View, android.widget.TextView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.widget.TextView, com.bytedance.tux.input.TuxTextView] */
    @Override // X.C18QA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r22, com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct r23, boolean r24, X.C18QB r25) {
        /*
            Method dump skipped, instruction units count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18Q1.LIZ(int, com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct, boolean, X.18QB):void");
    }
}
