package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgPromotionLabel;
import com.zhiliaoapp.musically.R;
import g1c.AjS7S0201000_32;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18Q2, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18Q2 extends RelativeLayout implements C18QA {
    public SmartImageView LL;
    public LinearLayout LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public C426160GnO LLIZ;
    public int LLIZLLLIL;

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
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m_j);
            this.LLIZ = (C426160GnO) callbackFindViewById;
        }
        return (C426160GnO) callbackFindViewById;
    }

    public final LinearLayout getLayoutVsaPromotionFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mhj);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getTvProductCurrencyFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_product_currency);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvProductPriceExtraInfoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_product_price_extra_info);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvProductSalesPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_product_sales_price);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvProductTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_product_title);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public C18Q2(Context context) {
        super(context, null, 0);
        this.LLIZLLLIL = -1;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C786410Ut5.Td(C786410Ut5.ne(new ContextThemeWrapper(context, R.style.z5)), R.layout.btf, this, true);
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LLLILZJ.getValue());
    }

    public final void setIvProductCoverFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public final void setLayoutCommonPromotionFromXml(C426160GnO c426160GnO) {
        this.LLIZ = c426160GnO;
    }

    public final void setLayoutVsaPromotionFromXml(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public final void setTvProductCurrencyFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setTvProductPriceExtraInfoFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setTvProductSalesPriceFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setTvProductTitleFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public static View LIZJ(Context context, boolean z) {
        if (z) {
            FrameLayout frameLayout = new FrameLayout(context);
            C786410Ut5.a6(frameLayout, new ViewGroup.MarginLayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), -1));
            View view = new View(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
            layoutParams.gravity = 17;
            C786410Ut5.W5(view, layoutParams);
            view.setBackground(new ColorDrawable(Color.argb(86, 0, 0, 0)));
            frameLayout.addView(view);
            return frameLayout;
        }
        Space space = new Space(context);
        C786410Ut5.f6(space, new ViewGroup.MarginLayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), -1));
        return space;
    }

    @Override // X.C18QA
    public final void LIZ(int i, EcUgProduct ecUgProduct, boolean z, C18QB c18qb) {
        List<EcUgPromotionLabel> list;
        List<EcUgPromotionLabel> list2;
        Object objLJJJLL;
        List<EcUgPromotionLabel> list3;
        Object objLJJJLL2;
        C03IT imageUrlModel;
        Image image = ecUgProduct.firstImage;
        if (image != null && (imageUrlModel = image.toImageUrlModel()) != null) {
            getIvProductCoverFromXml().setColorFilter(Color.argb(7, 0, 0, 0));
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C418440Gaw.LIZIZ(10);
            C1331730kl9 c1331730kl9 = new C1331730kl9(c1331750klB);
            Drawable drawableLJ = C1308910kAL.LJ(R.attr.bv, getContext());
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(imageUrlModel);
            c1331670kl3LJIIJ.LJJI = c1331730kl9;
            c1331670kl3LJIIJ.LJJIIZI(drawableLJ);
            c1331670kl3LJIIJ.LJIL(drawableLJ);
            c1331670kl3LJIIJ.LJJ = EnumC1338240kve.CENTER_CROP;
            c1331670kl3LJIIJ.LJJIII = EnumC1334360kpO.HIGH;
            c1331670kl3LJIIJ.LIZLLL("ec_ug_vsa");
            c1331670kl3LJIIJ.LJJ(getIvProductCoverFromXml());
            C786410Ut5.h3(c1331670kl3LJIIJ);
        }
        C786410Ut5.LJJJJJL(getLayoutVsaPromotionFromXml());
        this.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(168));
        Map<String, List<EcUgPromotionLabel>> map = ecUgProduct.productLabels;
        if (map != null && (list3 = map.get("discount_labels")) != null && (objLJJJLL2 = C13LP.LJJJLL(list3)) != null) {
            C786410Ut5.LJZL(0, getLayoutVsaPromotionFromXml());
            LIZIZ(getContext(), Collections.singletonList(objLJJJLL2), getLayoutVsaPromotionFromXml(), EnumC1083490eIl.RIGHT);
        }
        Map<String, List<EcUgPromotionLabel>> map2 = ecUgProduct.productLabels;
        if (map2 != null && (list2 = map2.get("marketing_labels")) != null && (objLJJJLL = C13LP.LJJJLL(list2)) != null) {
            C786410Ut5.LJZL(0, getLayoutVsaPromotionFromXml());
            LIZIZ(getContext(), Collections.singletonList(objLJJJLL), getLayoutVsaPromotionFromXml(), EnumC1083490eIl.LEFT);
        }
        getTvProductTitleFromXml().setText(C123500dV.LIZIZ(ecUgProduct.title));
        EcUgProduct.EcUgProductPrice ecUgProductPrice = ecUgProduct.price;
        if (ecUgProductPrice != null) {
            String strLIZIZ = C123500dV.LIZIZ(ecUgProductPrice.currency);
            getTvProductCurrencyFromXml().setText(strLIZIZ);
            String strLIZIZ2 = C123500dV.LIZIZ(ecUgProductPrice.minSalesPrice);
            if (!a0.LJJJIL(strLIZIZ2)) {
                getTvProductSalesPriceFromXml().setText(strLIZIZ2);
            } else {
                getTvProductCurrencyFromXml().setText("");
                getTvProductSalesPriceFromXml().setText("");
            }
            String strLIZIZ3 = C123500dV.LIZIZ(ecUgProduct.soldCountStr);
            if (a0.LJJJIL(strLIZIZ3)) {
                strLIZIZ3 = C123500dV.LIZIZ(ecUgProductPrice.minOriginalPrice);
                if (!a0.LJJJIL(strLIZIZ3)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(strLIZIZ3);
                    strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ);
                    getTvProductPriceExtraInfoFromXml().setPaintFlags(getTvProductPriceExtraInfoFromXml().getPaintFlags() | 16);
                }
            }
            if (!a0.LJJJIL(strLIZIZ3)) {
                getTvProductPriceExtraInfoFromXml().setText(strLIZIZ3);
            } else {
                getTvProductPriceExtraInfoFromXml().setText("");
            }
        } else {
            getTvProductCurrencyFromXml().setText("");
            getTvProductSalesPriceFromXml().setText("");
            getTvProductPriceExtraInfoFromXml().setText("");
        }
        C786410Ut5.LJJJJZ(getLayoutCommonPromotionFromXml());
        Map<String, List<EcUgPromotionLabel>> map3 = ecUgProduct.productLabels;
        if (map3 != null && (list = map3.get("benefit_labels")) != null) {
            C786410Ut5.LLZLLLL(getLayoutCommonPromotionFromXml(), 0);
            Context context = getContext();
            C426160GnO layoutCommonPromotionFromXml = getLayoutCommonPromotionFromXml();
            Iterator<EcUgPromotionLabel> it2 = list.iterator();
            while (it2.hasNext()) {
                C341650DaN c341650DaNLIZ = C18Q5.LIZ(context, it2.next());
                if (c341650DaNLIZ != null) {
                    if (layoutCommonPromotionFromXml.getChildCount() > 0) {
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.addView(LIZJ(context, true));
                        linearLayout.addView(c341650DaNLIZ);
                        layoutCommonPromotionFromXml.addView(linearLayout);
                    } else {
                        layoutCommonPromotionFromXml.addView(c341650DaNLIZ);
                    }
                }
            }
        }
        C786410Ut5.I7(new AjS7S0201000_32(c18qb, i, ecUgProduct, 1), this);
        if (c18qb != null) {
            c18qb.LIZ(i, ecUgProduct, C18PU.BENEFIT_IMPACT_VSA_CARD_PRODUCT);
        }
    }

    public final void LIZIZ(Context context, List<EcUgPromotionLabel> list, LinearLayout linearLayout, EnumC1083490eIl enumC1083490eIl) {
        Integer num;
        int childCount;
        for (EcUgPromotionLabel ecUgPromotionLabel : list) {
            C341650DaN c341650DaNLIZ = C18Q5.LIZ(context, ecUgPromotionLabel);
            if (c341650DaNLIZ != null) {
                int childCount2 = 0;
                c341650DaNLIZ.measure(0, 0);
                if (linearLayout.getChildCount() == 0) {
                    if (this.LLIZLLLIL < c341650DaNLIZ.getMeasuredWidth() && (num = ecUgPromotionLabel.style) != null && num.intValue() == 2) {
                        c341650DaNLIZ.setMaxWidth(this.LLIZLLLIL);
                    }
                    linearLayout.addView(c341650DaNLIZ);
                    this.LLIZLLLIL -= c341650DaNLIZ.getMeasuredWidth();
                } else if (this.LLIZLLLIL >= c341650DaNLIZ.getMeasuredWidth() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))) {
                    View viewLIZJ = LIZJ(context, false);
                    EnumC1083490eIl enumC1083490eIl2 = EnumC1083490eIl.LEFT;
                    if (enumC1083490eIl == enumC1083490eIl2) {
                        childCount = 0;
                    } else {
                        childCount = linearLayout.getChildCount();
                    }
                    linearLayout.addView(viewLIZJ, childCount);
                    this.LLIZLLLIL -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    if (enumC1083490eIl != enumC1083490eIl2) {
                        childCount2 = linearLayout.getChildCount();
                    }
                    linearLayout.addView(c341650DaNLIZ, childCount2);
                    this.LLIZLLLIL -= c341650DaNLIZ.getMeasuredWidth();
                } else {
                    return;
                }
            }
        }
    }
}
