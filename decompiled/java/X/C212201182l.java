package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.LabelIcon;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.GoLiveCard;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.Color;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.CardTitleInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ShoppingBagList;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.UserRight;
import com.zhiliaoapp.musically.R;
import g1c.AjS72S0100000_32;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS646S0100000_32;

/* JADX INFO: renamed from: X.182l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212201182l extends AbstractC212214182y {
    public ConstraintLayout LLILZ;
    public TuxIconView LLILZIL;
    public ConstraintLayout LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public LinearLayout LLJ;
    public ShoppingBagList LLJI;
    public final C182K LLJIJIL;
    public boolean LLJILJIL;

    @Override // X.AbstractC212214182y
    public final void e0() {
    }

    @Override // X.AbstractC212214182y
    public final void h0(C182T c182t, long j, GoLiveCard goLiveCard, Integer num) {
    }

    @Override // X.AbstractC212214182y
    public Map<String, String> getContentShowParams() {
        String str;
        String str2;
        HashMap map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ShoppingBagList shoppingBagList = this.LLJI;
            if (shoppingBagList != null && (str2 = shoppingBagList.daInfo) != null && (map = (HashMap) C08JS.LIZIZ().LJIIIIZZ(str2, new TypeToken<HashMap<String, String>>() { // from class: X.182m
            }.getType())) != null) {
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c7998.d66871", PageFinder.via((View) this), null, 4, null);
            if (!mapCreateReportParams$default.isEmpty()) {
                for (Map.Entry entry2 : mapCreateReportParams$default.entrySet()) {
                    linkedHashMap.put(entry2.getKey(), String.valueOf(entry2.getValue()));
                }
            }
            ShoppingBagList shoppingBagList2 = this.LLJI;
            if (shoppingBagList2 == null || (str = shoppingBagList2.title) == null) {
                str = "";
            }
            linkedHashMap.put("card_title", str);
            return linkedHashMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return linkedHashMap;
        }
    }

    public final ConstraintLayout getEcommerceliveFeedShoppingBagContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gks);
            this.LLILZ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final LinearLayout getEcommerceliveFeedShoppingBagProductListViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gkt);
            this.LLJ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getEcommerceliveFeedShoppingBagTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gku);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getEcommerceliveFeedShoppingBagTitleInfoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gkv);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final ConstraintLayout getEcommerceliveFeedShoppingBagTopAreaFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gkw);
            this.LLILZLL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxIconView getEcommerceliveIconCloseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gl8);
            this.LLILZIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final void setEcommerceliveFeedShoppingBagContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLILZ = constraintLayout;
    }

    public final void setEcommerceliveFeedShoppingBagProductListViewFromXml(LinearLayout linearLayout) {
        this.LLJ = linearLayout;
    }

    public final void setEcommerceliveFeedShoppingBagTitleFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setEcommerceliveFeedShoppingBagTitleInfoFromXml(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public final void setEcommerceliveFeedShoppingBagTopAreaFromXml(ConstraintLayout constraintLayout) {
        this.LLILZLL = constraintLayout;
    }

    public final void setEcommerceliveIconCloseFromXml(TuxIconView tuxIconView) {
        this.LLILZIL = tuxIconView;
    }

    public final void setProductListData(ShoppingBagList shoppingBagList) {
        C182K c182k;
        String str;
        CardTitleInfo cardTitleInfo;
        this.LLJI = shoppingBagList;
        if (shoppingBagList != null) {
            boolean z = false;
            if (shoppingBagList.titleInfo != null) {
                if (shoppingBagList != null && (cardTitleInfo = shoppingBagList.titleInfo) != null) {
                    z = cardTitleInfo.useLabelText;
                }
                setTitleInfo(z);
            } else if (shoppingBagList != null && (str = shoppingBagList.title) != null) {
                TuxTextView ecommerceliveFeedShoppingBagTitleFromXml = getEcommerceliveFeedShoppingBagTitleFromXml();
                ecommerceliveFeedShoppingBagTitleFromXml.setText(str);
                C786410Ut5.LLLLZLL(ecommerceliveFeedShoppingBagTitleFromXml, 0);
            }
        }
        ShoppingBagList shoppingBagList2 = this.LLJI;
        if (shoppingBagList2 != null && (c182k = this.LLJIJIL) != null) {
            List list = shoppingBagList2.productList;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            c182k.LJIIIIZZ = new C212189181z(list, shoppingBagList2.productNum, 1, new AwS646S0100000_32(this, 24), null, EnumC1769850w9n.FYP_SHOPPING_BAG_LIST_CARD_PRODUCTS);
            c182k.LJIIL();
        }
    }

    public final void setTitleInfo(boolean z) {
        String strConcat;
        CardTitleInfo cardTitleInfo;
        UserRight userRight;
        String str;
        CardTitleInfo cardTitleInfo2;
        UserRight userRight2;
        Color color;
        String str2;
        CardTitleInfo cardTitleInfo3;
        UserRight userRight3;
        Integer num;
        CardTitleInfo cardTitleInfo4;
        List<PlacementLabel> list;
        Image image;
        List<String> urls;
        Image image2;
        List<String> urls2;
        LabelIcon labelIcon;
        Image image3;
        C18QS c18qs = (C18QS) getEcommerceliveFeedShoppingBagTitleInfoFromXml();
        int visibility = c18qs.getVisibility();
        c18qs.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c18qs);
        ArrayList arrayList = new ArrayList();
        ShoppingBagList shoppingBagList = this.LLJI;
        if (shoppingBagList != null && (cardTitleInfo4 = shoppingBagList.titleInfo) != null && (list = cardTitleInfo4.placementLabels) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (PlacementLabel placementLabel : list) {
                Integer num2 = placementLabel.placement;
                if (num2 != null && num2.intValue() == 2) {
                    arrayList2.add(placementLabel);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                List<PromotionLabel> list2 = ((PlacementLabel) it2.next()).placementLabelList;
                if (list2 != null) {
                    for (PromotionLabel promotionLabel : list2) {
                        LabelIcon labelIcon2 = promotionLabel.icon;
                        if (labelIcon2 != null && (image = labelIcon2.darkIcon) != null && (urls = image.getUrls()) != null && (!urls.isEmpty()) && !z) {
                            LabelIcon labelIcon3 = promotionLabel.icon;
                            if (labelIcon3 != null && (image2 = labelIcon3.darkIcon) != null && (urls2 = image2.getUrls()) != null && (labelIcon = promotionLabel.icon) != null && (image3 = labelIcon.darkIcon) != null) {
                                image3.setUrls(C19411510wz.LIZJ(C19411510wz.LIZ, urls2, EnumC1769850w9n.FYP_SHOPPING_BAG_LIST_CARD_TITLE_IMAGE));
                            }
                            arrayList.add(promotionLabel.copy(promotionLabel.id, promotionLabel.idStr, promotionLabel.type, promotionLabel.status, null, promotionLabel.extraText, promotionLabel.icon, promotionLabel.schema, promotionLabel.countdown, promotionLabel.defaultStyle, promotionLabel.extraProperty, promotionLabel.daInfo, promotionLabel.iconPopup, promotionLabel.textPopup, promotionLabel.instanceKey));
                        } else if (C123100dR.LIZ(promotionLabel.text) && z) {
                            arrayList.add(promotionLabel.copy(promotionLabel.id, promotionLabel.idStr, promotionLabel.type, promotionLabel.status, promotionLabel.text, promotionLabel.extraText, null, promotionLabel.schema, promotionLabel.countdown, promotionLabel.defaultStyle, promotionLabel.extraProperty, promotionLabel.daInfo, promotionLabel.iconPopup, promotionLabel.textPopup, promotionLabel.instanceKey));
                        }
                    }
                }
            }
        }
        ShoppingBagList shoppingBagList2 = this.LLJI;
        if (shoppingBagList2 != null && (cardTitleInfo3 = shoppingBagList2.titleInfo) != null && (userRight3 = cardTitleInfo3.userRightInfo) != null && (num = userRight3.textFont) != null) {
            int iIntValue = num.intValue();
            InterfaceC1003930cER.LJIILIIL.getClass();
            c18qs.setTuxFont(C1003920cEQ.LIZ(iIntValue));
        }
        try {
            ShoppingBagList shoppingBagList3 = this.LLJI;
            if (shoppingBagList3 != null && (cardTitleInfo2 = shoppingBagList3.titleInfo) != null && (userRight2 = cardTitleInfo2.userRightInfo) != null && (color = userRight2.color) != null && (str2 = color.darkValue) != null) {
                C01GW c01gw = C2248361CzK.LIZ;
                Integer numLJ = C2248361CzK.LJ(c18qs.getContext(), str2);
                if (numLJ != null) {
                    c18qs.setTextColor(numLJ.intValue());
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ShoppingBagList shoppingBagList4 = this.LLJI;
        if (shoppingBagList4 == null || (cardTitleInfo = shoppingBagList4.titleInfo) == null || (userRight = cardTitleInfo.userRightInfo) == null || (str = userRight.text) == null || (strConcat = " · ".concat(str)) == null) {
            strConcat = "";
        }
        c18qs.LJJJJLL(strConcat, arrayList, null, true, new C18QX() { // from class: X.01vu
            @Override // X.C18QX
            public final void onSuccess() {
            }

            @Override // X.C18QX
            public final void onFail() {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C492301vt(this.LIZ, null), 3);
            }
        });
    }

    public C212201182l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.z4);
        C786410Ut5.Sd(R.layout.bvk, C786410Ut5.ne(context).cloneInContext(contextThemeWrapper), this);
        TuxIconView ecommerceliveIconCloseFromXml = getEcommerceliveIconCloseFromXml();
        if (ecommerceliveIconCloseFromXml != null) {
            C786410Ut5.I7(new AjS72S0100000_32(this, 8), ecommerceliveIconCloseFromXml);
        }
        C182K c182k = new C182K(getEcommerceliveFeedShoppingBagProductListViewFromXml());
        c182k.LJIILL(new C212178181o() { // from class: X.181q
            public final float LJIIL;
            public final int LJIILIIL;
            public final int LJIILJJIL;
            public final int LJIILL;
            public final boolean LJIILLIIL;
            public final boolean LJIIZILJ;
            public final int LJIJ;
            public final int LJIJI;
            public final int LJIJJ;
            public final int LJIJJLI;
            public final int LJIL;
            public final int LJJ;

            {
                float fLIZIZ = C418440Gaw.LIZIZ(10);
                int iLIZIZ = C0H9H.LIZIZ(62);
                int iLIZIZ2 = C0H9H.LIZIZ(62);
                int iLIZIZ3 = C0H9H.LIZIZ(8);
                int iLIZIZ4 = C0H9H.LIZIZ(12);
                this.LJIIL = fLIZIZ;
                this.LJIILIIL = iLIZIZ;
                this.LJIILJJIL = iLIZIZ2;
                this.LJIILL = 52;
                this.LJIILLIIL = false;
                this.LJIIZILJ = false;
                this.LJIJ = R.attr.a1j;
                this.LJIJI = R.attr.a03;
                this.LJIJJ = 100;
                this.LJIJJLI = 100;
                this.LJIL = iLIZIZ3;
                this.LJJ = iLIZIZ4;
            }

            @Override // X.C212178181o, X.C182L
            public final int LIZ() {
                return this.LJIILL;
            }

            @Override // X.C212178181o, X.C182L
            public final int LIZIZ() {
                return this.LJJ;
            }

            @Override // X.C212178181o, X.C182L
            public final boolean LIZJ() {
                return this.LJIIZILJ;
            }

            @Override // X.C212178181o, X.C182L
            public final boolean LIZLLL() {
                return this.LJIILLIIL;
            }

            @Override // X.C212178181o, X.C182L
            public final int LJ() {
                return this.LJIJI;
            }

            @Override // X.C212178181o, X.C182L
            public final int LJFF() {
                return this.LJIJJ;
            }

            @Override // X.C212178181o, X.C182L
            public final int LJI() {
                return this.LJIL;
            }

            @Override // X.C212178181o, X.C182L
            public final int LJII() {
                return this.LJIJJLI;
            }

            @Override // X.C212178181o, X.C182L
            public final float LJIIJJI() {
                return this.LJIIL;
            }

            @Override // X.C212178181o, X.C182L
            public final int getHeight() {
                return this.LJIILJJIL;
            }

            @Override // X.C212178181o, X.C182L
            public final int getTitleColor() {
                return this.LJIJ;
            }

            @Override // X.C212178181o, X.C182L
            public final int getWidth() {
                return this.LJIILIIL;
            }
        });
        this.LLJIJIL = c182k;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(new C19342510lr().LIZ);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zh);
        setBackground(c384050F3z.LIZ(contextThemeWrapper));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.LLJILJIL) {
            this.LLJILJIL = true;
            int width = getEcommerceliveFeedShoppingBagContainerFromXml().getWidth();
            C182K c182k = this.LLJIJIL;
            if (c182k != null) {
                c182k.LJIILJJIL(width);
            }
        }
        if (z) {
            int width2 = getEcommerceliveFeedShoppingBagContainerFromXml().getWidth();
            C182K c182k2 = this.LLJIJIL;
            if (c182k2 != null) {
                c182k2.LJIILJJIL(width2);
            }
        }
    }
}
