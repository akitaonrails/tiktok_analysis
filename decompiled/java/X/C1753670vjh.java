package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundlePrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleProduct;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import fta.c;

/* JADX INFO: renamed from: X.0vjh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1753670vjh extends FrameLayout {
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public C426160GnO LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public BundleProduct LLJ;

    public final C426160GnO getPriceFlowLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rt3);
            this.LLILZIL = (C426160GnO) callbackFindViewById;
        }
        return (C426160GnO) callbackFindViewById;
    }

    public final SmartImageView getProductImgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ry0);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getTvDepositFeeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zhq);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvEnergyLabelFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zk_);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvPricePerUnitFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_price_per_unit);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvProductDiscountFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_product_discount);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvProductOriginalPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_product_original_price);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvProductRealPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_product_real_price);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final BundleProduct getBundleProduct() {
        return this.LLJ;
    }

    public C1753670vjh(Context context) {
        super(context, null, 0);
        C954703oH.LIZ(context, R.layout.ar_, this, true);
    }

    public final void setBundleProduct(BundleProduct bundleProduct) {
        this.LLJ = bundleProduct;
    }

    public final void setPriceFlowLayoutFromXml(C426160GnO c426160GnO) {
        this.LLILZIL = c426160GnO;
    }

    public final void setProductImgFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public final void setTvDepositFeeFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setTvEnergyLabelFromXml(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public final void setTvPricePerUnitFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setTvProductDiscountFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setTvProductOriginalPriceFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setTvProductRealPriceFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void LIZ(BundleProduct bundleProduct, c cVar) {
        String str;
        TuxTextView tvEnergyLabelFromXml;
        String str2;
        TuxTextView tvDepositFeeFromXml;
        String str3;
        TuxTextView tvPricePerUnitFromXml;
        String str4;
        String str5;
        String str6;
        this.LLJ = bundleProduct;
        getTvProductRealPriceFromXml().setTuxFont(cVar.LJLJLLL());
        getTvProductRealPriceFromXml().setTextColorRes(cVar.LLIIIILZ());
        C0H9H.LJI(cVar.LLJJIJI(), getTvProductRealPriceFromXml());
        getTvProductOriginalPriceFromXml().setTuxFont(cVar.LLJILJIL());
        getTvProductDiscountFromXml().setTuxFont(cVar.LLJILJIL());
        if (cVar.LLILZLL()) {
            getProductImgFromXml().setColorFilter(Color.argb(7, 0, 0, 0), PorterDuff.Mode.SRC_OVER);
        }
        Image image = bundleProduct.image;
        SmartImageView productImgFromXml = getProductImgFromXml();
        if (image != null) {
            EnumC1769850w9n enumC1769850w9n = EnumC1769850w9n.PDP_BUNDLE_PRODUCT_COVER;
            C1334210kp9.LIZ(image, enumC1769850w9n, enumC1769850w9n, null, null, null, 248);
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image);
            c1331670kl3LIZLLL.LJJ = EnumC1338240kve.CENTER_CROP;
            c1331670kl3LIZLLL.LJJI = cVar.LJJJ();
            c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.bv, getContext()));
            c1331670kl3LIZLLL.LJJ(productImgFromXml);
            if (cVar.LJLL()) {
                c1331670kl3LIZLLL.LJIIJJI();
            } else {
                C786410Ut5.h3(c1331670kl3LIZLLL);
            }
        }
        BundlePrice bundlePrice = bundleProduct.productPrice;
        if (bundlePrice != null && (str6 = bundlePrice.discount) != null && C703302op.LIZ(str6)) {
            C03DZ.LIZJ(getTvProductDiscountFromXml());
            getTvProductDiscountFromXml().setText(bundleProduct.productPrice.discount);
        }
        TuxTextView tvProductRealPriceFromXml = getTvProductRealPriceFromXml();
        BundlePrice bundlePrice2 = bundleProduct.productPrice;
        String str7 = "";
        if (bundlePrice2 == null || (str = bundlePrice2.realPrice) == null) {
            str = "";
        }
        tvProductRealPriceFromXml.setText(str);
        TuxTextView tvProductOriginalPriceFromXml = getTvProductOriginalPriceFromXml();
        BundlePrice bundlePrice3 = bundleProduct.productPrice;
        if (bundlePrice3 != null && (str5 = bundlePrice3.originalPrice) != null) {
            str7 = str5;
        }
        tvProductOriginalPriceFromXml.setText(str7);
        getTvProductOriginalPriceFromXml().getPaint().setFlags(16);
        getTvProductOriginalPriceFromXml().getPaint().setAntiAlias(true);
        BundlePrice bundlePrice4 = bundleProduct.productPrice;
        if (bundlePrice4 == null || (str4 = bundlePrice4.originalPrice) == null || str4.length() == 0) {
            C03DZ.LIZ(getPriceFlowLayoutFromXml());
        }
        BundlePrice bundlePrice5 = bundleProduct.productPrice;
        if (bundlePrice5 != null && (str3 = bundlePrice5.unitPriceDesc) != null && (tvPricePerUnitFromXml = getTvPricePerUnitFromXml()) != null) {
            C03DZ.LIZJ(tvPricePerUnitFromXml);
            tvPricePerUnitFromXml.setTuxFont(81);
            tvPricePerUnitFromXml.setText(str3);
        } else {
            TuxTextView tvPricePerUnitFromXml2 = getTvPricePerUnitFromXml();
            if (tvPricePerUnitFromXml2 != null) {
                C03DZ.LIZ(tvPricePerUnitFromXml2);
            }
        }
        BundlePrice bundlePrice6 = bundleProduct.productPrice;
        if (bundlePrice6 != null && (str2 = bundlePrice6.depositFeeDesc) != null && (tvDepositFeeFromXml = getTvDepositFeeFromXml()) != null) {
            C03DZ.LIZJ(tvDepositFeeFromXml);
            tvDepositFeeFromXml.setTuxFont(81);
            tvDepositFeeFromXml.setText(str2);
        } else {
            TuxTextView tvDepositFeeFromXml2 = getTvDepositFeeFromXml();
            if (tvDepositFeeFromXml2 != null) {
                C03DZ.LIZ(tvDepositFeeFromXml2);
            }
        }
        ECRichText eCRichText = bundleProduct.label;
        if (eCRichText != null && (tvEnergyLabelFromXml = getTvEnergyLabelFromXml()) != null) {
            C03DZ.LIZJ(tvEnergyLabelFromXml);
            C03B0 c03b0 = new C03B0(tvEnergyLabelFromXml, "pdp_bundle_energy_label");
            C03B0.LIZ(c03b0, eCRichText, null, null, false, null, null, 126);
            tvEnergyLabelFromXml.setText(c03b0.LIZJ);
            return;
        }
        TuxTextView tvEnergyLabelFromXml2 = getTvEnergyLabelFromXml();
        if (tvEnergyLabelFromXml2 == null) {
            return;
        }
        C03DZ.LIZ(tvEnergyLabelFromXml2);
    }
}
