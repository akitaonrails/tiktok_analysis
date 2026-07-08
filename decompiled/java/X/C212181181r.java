package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnchorPinCardButtonProperty;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnchorPinCardConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BuyButtonProperty;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.GetMoreActionResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PinCardBuyButton;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ShoppingBagList;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.181r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212181181r extends C181K {
    public C197039127h LLJILJIL;
    public LinearLayout LLJILJILJ;
    public TuxIconView LLJILLL;
    public ConstraintLayout LLJJ;
    public SmartImageView LLJJI;
    public TuxTextView LLJJIII;
    public final C212186181w LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;

    @Override // X.InterfaceC21184117vD
    public final void LJIIJJI(GetMoreActionResp getMoreActionResp, Function0<Unit> function0) {
    }

    public final C197039127h getEcommerceliveBtnSeeAllFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gkk);
            this.LLJILJIL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final TuxIconView getEcommerceliveIconCloseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gl8);
            this.LLJILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final SmartImageView getEcommerceliveShoppingBagAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmx);
            this.LLJJI = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final LinearLayout getEcommerceliveShoppingBagProductListFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmz);
            this.LLJILJILJ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getEcommerceliveShoppingBagTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gn3);
            this.LLJJIII = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final ConstraintLayout getEcommerceliveShoppingBagTopAreaFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gn4);
            this.LLJJ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final void l0() {
        AnchorPinCardConfig anchorPinCardConfig;
        Map<String, AnchorPinCardButtonProperty> map;
        AnchorPinCardButtonProperty anchorPinCardButtonProperty;
        C197039127h ecommerceliveBtnSeeAllFromXml;
        PopupCardVO popupCardVO = this.LLILZLL;
        if (popupCardVO == null || (anchorPinCardConfig = popupCardVO.anchorPinCardConfig) == null || (map = anchorPinCardConfig.buttonConfig) == null || (anchorPinCardButtonProperty = map.get(String.valueOf(this.LLJJIJIL))) == null || (ecommerceliveBtnSeeAllFromXml = getEcommerceliveBtnSeeAllFromXml()) == null) {
            return;
        }
        ecommerceliveBtnSeeAllFromXml.setText(anchorPinCardButtonProperty.displayText);
        ecommerceliveBtnSeeAllFromXml.setTextColor(ColorProtector.parseColor((C960203pA.LIZIZ(getContext()) && C123100dR.LIZ(anchorPinCardButtonProperty.displayTextColorDarkMode)) ? anchorPinCardButtonProperty.displayTextColorDarkMode : anchorPinCardButtonProperty.displayTextColor));
        int color = ColorProtector.parseColor((C960203pA.LIZIZ(getContext()) && C123100dR.LIZ(anchorPinCardButtonProperty.backgroundColorDarkMode)) ? anchorPinCardButtonProperty.backgroundColorDarkMode : anchorPinCardButtonProperty.backgroundColor);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C0H9H.LIZ(4));
        c384050F3z.LIZ = Integer.valueOf(color);
        ecommerceliveBtnSeeAllFromXml.setBackground(c384050F3z.LIZ(getContext()));
    }

    public final void n0() {
        ShoppingBagList shoppingBagList;
        PopupCardVO popupCardVO = this.LLILZLL;
        if (popupCardVO == null || (shoppingBagList = popupCardVO.shoppingBagList) == null) {
            C182J productViewController = getProductViewController();
            if (productViewController != null) {
                productViewController.LJIIIZ(false);
                return;
            }
            return;
        }
        C182J productViewController2 = getProductViewController();
        if (productViewController2 != null) {
            List list = shoppingBagList.productList;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            productViewController2.LJII = new C212183181t(list, shoppingBagList.productNum, this.LLIZLLLIL, this.LLJI, this.LLJIJIL);
            productViewController2.LJIIJJI();
        }
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        String str = shoppingBagList.avatarUrl;
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZ = true;
        c1331670kl3LIZLLL.LJJI = new C1331730kl9(c1331750klB);
        c1331670kl3LIZLLL.LJJ(getEcommerceliveShoppingBagAvatarFromXml());
        C786410Ut5.h3(c1331670kl3LIZLLL);
        getEcommerceliveShoppingBagTitleFromXml().setText(shoppingBagList.title);
    }

    @Override // X.C181K
    public final void j0() {
        C182J productViewController = getProductViewController();
        int i = 1;
        if (productViewController == null || !productViewController.LJFF()) {
            return;
        }
        int iAbs = C444960Hcc.LIZIZ() ? Math.abs(getEcommerceliveShoppingBagProductListFromXml().getRight() - getEcommerceliveBtnSeeAllFromXml().getRight()) : Math.abs(getEcommerceliveBtnSeeAllFromXml().getLeft() - getEcommerceliveShoppingBagProductListFromXml().getLeft());
        C182J productViewController2 = getProductViewController();
        if (productViewController2 == null || iAbs <= 0 || iAbs == productViewController2.LJI) {
            return;
        }
        productViewController2.LJI = iAbs;
        int width = productViewController2.LJ.getWidth() + C0H9H.LIZIZ(8);
        while (width <= iAbs) {
            width += productViewController2.LJ.getWidth() + C0H9H.LIZIZ(6);
            i++;
        }
        int i2 = i - 1;
        productViewController2.LJFF = i2 >= 0 ? i2 : 0;
        if (productViewController2.LIZLLL.getChildCount() != productViewController2.LJFF) {
            productViewController2.LJIIJJI();
        }
    }

    @Override // X.AbstractC21202217y8, X.InterfaceC21184317vF
    public final void LLLLLLJ(int i) {
        if (this.LLJJIJIIJIL) {
            this.LLJJIJIL = i;
            l0();
        }
    }

    public final void setEcommerceliveBtnSeeAllFromXml(C197039127h c197039127h) {
        this.LLJILJIL = c197039127h;
    }

    public final void setEcommerceliveIconCloseFromXml(TuxIconView tuxIconView) {
        this.LLJILLL = tuxIconView;
    }

    public final void setEcommerceliveShoppingBagAvatarFromXml(SmartImageView smartImageView) {
        this.LLJJI = smartImageView;
    }

    public final void setEcommerceliveShoppingBagProductListFromXml(LinearLayout linearLayout) {
        this.LLJILJILJ = linearLayout;
    }

    public final void setEcommerceliveShoppingBagTitleFromXml(TuxTextView tuxTextView) {
        this.LLJJIII = tuxTextView;
    }

    public final void setEcommerceliveShoppingBagTopAreaFromXml(ConstraintLayout constraintLayout) {
        this.LLJJ = constraintLayout;
    }

    @Override // X.InterfaceC21184117vD
    public final void LJJLIIIJLJLI(PopupCardVO popupCardVO, String str) {
        if (this.LLILZLL == null) {
            return;
        }
        this.LLILZLL = popupCardVO;
        n0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.181w] */
    public C212181181r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJJIJI = new C212187181x() { // from class: X.181w
        };
        C786410Ut5.Sd(R.layout.bwi, C786410Ut5.ne(context).cloneInContext(new ContextThemeWrapper(context, R.style.acp)), this);
        getEcommerceliveBtnSeeAllFromXml().setTuxFont(72);
        C182J c182j = new C182J(getEcommerceliveShoppingBagProductListFromXml());
        c182j.LJ = new C19396210uW() { // from class: X.10uX
            public final float LJI;
            public final int LJII;
            public final int LJIIIIZZ;
            public final int LJIIIZ;
            public final boolean LJIIJ;
            public final boolean LJIIJJI;

            {
                float fLIZIZ = C418440Gaw.LIZIZ(8);
                int iLIZIZ = C0H9H.LIZIZ(50);
                int iLIZIZ2 = C0H9H.LIZIZ(50);
                this.LJI = fLIZIZ;
                this.LJII = iLIZIZ;
                this.LJIIIIZZ = iLIZIZ2;
                this.LJIIIZ = 52;
                this.LJIIJ = false;
                this.LJIIJJI = false;
            }

            @Override // X.C19396210uW, X.C182M
            public final int LIZ() {
                return this.LJIIIZ;
            }

            @Override // X.C19396210uW, X.C182M
            public final boolean LIZJ() {
                return this.LJIIJJI;
            }

            @Override // X.C19396210uW, X.C182M
            public final boolean LIZLLL() {
                return this.LJIIJ;
            }

            @Override // X.C19396210uW, X.C182M
            public final float LJIIJJI() {
                return this.LJI;
            }

            @Override // X.C19396210uW, X.C182M
            public final int getHeight() {
                return this.LJIIIIZZ;
            }

            @Override // X.C19396210uW, X.C182M
            public final int getWidth() {
                return this.LJII;
            }
        };
        setProductViewController(c182j);
    }

    @Override // X.C181K, X.AbstractC21202217y8
    public final void i0(final PopupCardVO popupCardVO, C1743900vTw c1743900vTw, final Function0<Unit> function0, boolean z, final boolean z2, int i) {
        boolean z3;
        String str;
        String str2;
        ShoppingBagList shoppingBagList;
        List<Product> list;
        Product product;
        PinCardBuyButton pinCardBuyButton;
        int iIntValue;
        AnchorPinCardConfig anchorPinCardConfig;
        Integer num;
        AnchorPinCardConfig anchorPinCardConfig2;
        Map<String, AnchorPinCardButtonProperty> map;
        super.i0(popupCardVO, c1743900vTw, function0, z, z2, i);
        C384050F3z c384050F3z = new C384050F3z();
        getClass();
        c384050F3z.LIZJ = Float.valueOf(new C1913707eZ().LIZ);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
        setBackground(c384050F3z.LIZ(getContext()));
        getClass();
        int i2 = new C1913707eZ().LIZIZ;
        getClass();
        int i3 = new C1913707eZ().LIZIZ;
        getClass();
        int i4 = 0;
        setPaddingRelative(i2, i3, 0, new C1913707eZ().LIZIZ);
        C786410Ut5.I7(new AbstractViewOnClickListenerC372950Ejl() { // from class: X.181s
            @Override // X.AbstractViewOnClickListenerC372950Ejl
            public final void LIZ(View view) {
                Activity activityLIZ;
                if (view != null) {
                    if (z2) {
                        C212181181r c212181181r = this;
                        if (!c212181181r.LLJJIJIIJIL || c212181181r.LLJJIJIL != 1) {
                            PopupCardVO popupCardVO2 = popupCardVO;
                            Context context = c212181181r.getContext();
                            if (context != null) {
                                activityLIZ = C1388190mED.LIZ(context);
                            } else {
                                activityLIZ = null;
                            }
                            C597450Nbz.LIZ(popupCardVO2, activityLIZ);
                        }
                    }
                    Function0 function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, getEcommerceliveIconCloseFromXml());
        C786410Ut5.I7(new C19LP(this, 17, 42, 42), getEcommerceliveShoppingBagTopAreaFromXml());
        C786410Ut5.I7(new C19LP(this, 18, 42, 42), getEcommerceliveBtnSeeAllFromXml());
        C786410Ut5.I7(new C19LP(this, 19, 42, 42), this);
        n0();
        Integer num2 = null;
        if (z2 && (anchorPinCardConfig2 = popupCardVO.anchorPinCardConfig) != null && (map = anchorPinCardConfig2.buttonConfig) != null && !map.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LLJJIJIIJIL = z3;
        if (z2) {
            if (z3) {
                if (this.LLJJIJIL == 0) {
                    PopupCardVO popupCardVO2 = this.LLILZLL;
                    if (popupCardVO2 != null && (anchorPinCardConfig = popupCardVO2.anchorPinCardConfig) != null && (num = anchorPinCardConfig.buttonType) != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 2;
                    }
                    this.LLJJIJIL = iIntValue;
                }
                l0();
            } else {
                PopupCardVO popupCardVO3 = this.LLILZLL;
                if (popupCardVO3 != null && (shoppingBagList = popupCardVO3.shoppingBagList) != null && (list = shoppingBagList.productList) != null && (product = (Product) C13LP.LJJJLL(list)) != null && (pinCardBuyButton = product.pinCardBuyButton) != null) {
                    num2 = pinCardBuyButton.buyButtonType;
                }
                PopupCardVO.Companion.getClass();
                BuyButtonProperty buyButtonPropertyLIZIZ = C182S.LIZIZ(num2);
                C197039127h ecommerceliveBtnSeeAllFromXml = getEcommerceliveBtnSeeAllFromXml();
                if (ecommerceliveBtnSeeAllFromXml != null) {
                    ecommerceliveBtnSeeAllFromXml.setText(buyButtonPropertyLIZIZ.displayText);
                    if (C960203pA.LIZIZ(getContext()) && C123100dR.LIZ(buyButtonPropertyLIZIZ.displayTextColorDarkMode)) {
                        str = buyButtonPropertyLIZIZ.displayTextColorDarkMode;
                    } else {
                        str = buyButtonPropertyLIZIZ.displayTextColor;
                    }
                    ecommerceliveBtnSeeAllFromXml.setTextColor(ColorProtector.parseColor(str));
                    if (C960203pA.LIZIZ(getContext()) && C123100dR.LIZ(buyButtonPropertyLIZIZ.backgroundColorDarkMode)) {
                        str2 = buyButtonPropertyLIZIZ.backgroundColorDarkMode;
                    } else {
                        str2 = buyButtonPropertyLIZIZ.backgroundColor;
                    }
                    int color = ColorProtector.parseColor(str2);
                    C384050F3z c384050F3z2 = new C384050F3z();
                    c384050F3z2.LIZJ = Float.valueOf(C0H9H.LIZ(4));
                    c384050F3z2.LIZ = Integer.valueOf(color);
                    ecommerceliveBtnSeeAllFromXml.setBackground(c384050F3z2.LIZ(getContext()));
                }
            }
        }
        TuxIconView ecommerceliveIconCloseFromXml = getEcommerceliveIconCloseFromXml();
        if (ecommerceliveIconCloseFromXml != null) {
            if (z2) {
                try {
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "ec_live_anchor_pin_card_close_button_hidden", true, false)) {
                        i4 = 4;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            C786410Ut5.LLLLLLZZ(ecommerceliveIconCloseFromXml, i4);
        }
    }
}
