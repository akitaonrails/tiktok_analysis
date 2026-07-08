package X;

import Y.ACListenerS119S0200000_16;
import Y.ACListenerS151S0100000_16;
import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.shopify.checkout.models.CartInfo;
import com.shopify.checkout.models.Discount;
import com.shopify.checkout.models.Money;
import com.shopify.checkout.models.ProgressButtonStage;
import com.ss.android.ugc.aweme.checkout.CheckoutBtnState;
import com.ss.android.ugc.aweme.checkout.model.ShopifyCheckoutPrivacyConfig;
import com.ss.android.ugc.aweme.checkout.model.ShopifyDiscountBannerLogModel;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS165S1100000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0dXs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1054420dXs extends RelativeLayout {
    public Float LL;
    public String LLILLJJLI;
    public Boolean LLILLL;
    public InterfaceC1054500dY0 LLILZ;
    public InterfaceC1036110d4L LLILZIL;
    public final LinearLayout LLILZLL;
    public final C197039127h LLIZ;
    public ProgressButtonStage LLIZLLLIL;
    public final C0HZQ LLJ;
    public final TuxTextView LLJI;
    public final TuxTextView LLJIJIL;
    public final TuxTextView LLJILJIL;
    public final boolean LLJILJILJ;
    public final boolean LLJILLL;
    public String LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;

    public final void setTotalQuantity(int i) {
    }

    private final String getPlaceOrderText() {
        StringBuilder sb = new StringBuilder(getContext().getString(2131848120));
        C1953307kx c1953307kx = C1953307kx.LIZ;
        String str = this.LLJJ;
        c1953307kx.getClass();
        if (C1953307kx.LIZLLL(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" ⋅ ");
            sbLIZ.append(this.LLJJ);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        return sb.toString();
    }

    private final ShopifyCheckoutPrivacyConfig getShopifyCheckoutPrivacyConfig() {
        return (ShopifyCheckoutPrivacyConfig) this.LLJJIII.getValue();
    }

    private final Boolean getShowDiscountBannerEnable() {
        return (Boolean) this.LLJJI.getValue();
    }

    public C1054420dXs(Context context) {
        boolean z;
        int i;
        int i2;
        super(context, null, 0);
        this.LLILLL = Boolean.FALSE;
        CheckoutBtnState checkoutBtnState = CheckoutBtnState.DISABLED;
        ProgressButtonStage progressButtonStage = ProgressButtonStage.Pay;
        this.LLIZLLLIL = progressButtonStage;
        boolean zBooleanValue = ((Boolean) C276140As0.LIZ.getValue()).booleanValue();
        this.LLJILLL = zBooleanValue;
        this.LLJJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(122));
        this.LLJJIII = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(121));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.l8, this, true);
        View viewFindViewById = findViewById(R.id.nbo);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.nbn);
        this.LLILZLL = linearLayout;
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.jze);
        TuxIconView tuxIconView2 = (TuxIconView) findViewById(R.id.jzf);
        C197039127h c197039127h = (C197039127h) findViewById(R.id.col);
        this.LLIZ = c197039127h;
        C0HZQ c0hzq = (C0HZQ) findViewById(R.id.djf);
        this.LLJ = c0hzq;
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.zdg);
        this.LLJI = tuxTextView;
        tuxTextView.setMaxLines(5);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.zde);
        this.LLJIJIL = tuxTextView2;
        TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.zdf);
        this.LLJILJIL = tuxTextView3;
        Boolean bool = getShopifyCheckoutPrivacyConfig().useUiBlackTheme;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, getContext());
            if (numLIZJ != null) {
                linearLayout.setBackgroundColor(numLIZJ.intValue());
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, getContext());
            if (numLIZJ2 != null) {
                int iIntValue = numLIZJ2.intValue();
                tuxIconView.setTintColor(iIntValue);
                tuxIconView2.setTintColor(iIntValue);
            }
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, getContext());
            if (numLIZJ3 != null) {
                tuxIconView.setTintColor(numLIZJ3.intValue());
            }
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1h, getContext());
            if (numLIZJ4 != null) {
                int iIntValue2 = numLIZJ4.intValue();
                tuxTextView2.setTextColor(iIntValue2);
                tuxTextView3.setTextColor(iIntValue2);
            }
            c197039127h.LJJJJL(new AwS580S0100000_1(this, 54));
        }
        LJ(checkoutBtnState, progressButtonStage);
        tuxTextView.setMaxLines(5);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        C1041360dCo c1041360dCo = C1041360dCo.LIZ;
        String str = getShopifyCheckoutPrivacyConfig().allowedPrivacyRegions;
        c1041360dCo.getClass();
        boolean zLIZ = C1041360dCo.LIZ(str);
        this.LLJILJILJ = zLIZ;
        setOnPrivacyPolicyClickListener(zLIZ);
        ShopifyCheckoutPrivacyConfig shopifyCheckoutPrivacyConfig = getShopifyCheckoutPrivacyConfig();
        if (!zLIZ && Intrinsics.LJFF(shopifyCheckoutPrivacyConfig.hideDisclaimerTextNonUS, bool2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        if (!zBooleanValue && zLIZ) {
            C786410Ut5.LJLLLLLL(0, c0hzq);
            HandlerHook.viewPost(this.LLJ, new ARunnableS116S0100000_16(this, 25));
            c0hzq.setInterceptToggleListener(new AwS560S0100000_16(this, 82));
        } else {
            C786410Ut5.LJLLLLLL(8, c0hzq);
        }
        C786410Ut5.h9(tuxTextView, new ACListenerS151S0100000_16(this, 11));
        C786410Ut5.a9(tuxIconView, new ACListenerS151S0100000_16(this, 12));
        C786410Ut5.LJLLLLLL(8, linearLayout);
        if (zBooleanValue) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        tuxTextView.setTextAlignment(i2);
    }

    private final void setDiscountAmount(List<Discount> list) {
        boolean z;
        String str;
        Money money;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.LJLLLLLL(8, this.LLILZLL);
            return;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Discount> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(it2.next().amount.amount));
        }
        float fLJZ = C13LP.LJZ(arrayList);
        Discount discount = (Discount) C13LP.LJJJLL(list);
        if (discount != null && (money = discount.amount) != null) {
            str = money.currencyCode;
        } else {
            str = null;
        }
        this.LL = Float.valueOf(fLJZ);
        this.LLILLJJLI = str;
        if (fLJZ > 0.0f && str != null) {
            Boolean showDiscountBannerEnable = getShowDiscountBannerEnable();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.LJFF(showDiscountBannerEnable, bool) && !Intrinsics.LJFF(this.LLILLL, bool)) {
                this.LLJIJIL.setText(getContext().getString(2131848115));
                TuxTextView tuxTextView = this.LLJILJIL;
                C1041360dCo c1041360dCo = C1041360dCo.LIZ;
                Currency currency = Currency.getInstance(str);
                Context context = getContext();
                c1041360dCo.getClass();
                tuxTextView.setText(C1041360dCo.LJI(fLJZ, currency, C1041360dCo.LIZLLL(context)));
                C786410Ut5.LJLLLLLL(0, this.LLILZLL);
                LIZJ(true);
                return;
            }
        }
        C786410Ut5.LJLLLLLL(8, this.LLILZLL);
    }

    private final void setOnPrivacyPolicyClickListener(boolean z) {
        this.LLJI.setMovementMethod(C431260Gvc.LIZ);
        this.LLJI.setText(LIZIZ(82, 81, z));
    }

    public final void LIZJ(boolean z) {
        try {
            String str = this.LLILLJJLI;
            Float f = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((Object) this.LLJIJIL.getText());
            sbLIZ.append(' ');
            sbLIZ.append((Object) this.LLJILJIL.getText());
            ShopifyDiscountBannerLogModel shopifyDiscountBannerLogModel = new ShopifyDiscountBannerLogModel(str, f, C2188811AlT.LIZIZ(sbLIZ));
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(shopifyDiscountBannerLogModel);
            if (z) {
                InterfaceC1036110d4L interfaceC1036110d4L = this.LLILZIL;
                if (interfaceC1036110d4L != null) {
                    interfaceC1036110d4L.LJJJIL(strLJI);
                    return;
                }
                return;
            }
            InterfaceC1036110d4L interfaceC1036110d4L2 = this.LLILZIL;
            if (interfaceC1036110d4L2 != null) {
                interfaceC1036110d4L2.LJFF(strLJI);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    public final void LIZLLL(String str) {
        try {
            String strEncode = URLEncoder.encode(str, "UTF-8");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://webview_popup?url=");
            sbLIZ.append(strEncode);
            sbLIZ.append("&use_spark=1&height_percent=73&show_mask=1&mask_bg_color=00000080&enable_pull_down_close=1&transition_animation=bottom");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Context contextLJFF = C2214201BlK.LJFF();
            if (contextLJFF == null) {
                contextLJFF = getContext();
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(contextLJFF, strLIZIZ);
            smartRouteBuildRoute.withParam(UriProtector.parse(strLIZIZ));
            smartRouteBuildRoute.open();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    public final void LJFF(CartInfo cartInfo) {
        setDiscountAmount(cartInfo.price.discounts);
    }

    public final void setAdWebLogManager(InterfaceC1036110d4L interfaceC1036110d4L) {
        this.LLILZIL = interfaceC1036110d4L;
    }

    public final void setAgreementChecked(boolean z) {
        this.LLJ.setChecked(z);
        C1041360dCo.LIZ.getClass();
        ((Keva) C1041360dCo.LIZIZ.getValue()).storeBoolean("SHOPIFY_CHECKOUT_POLICY_SP_KEY", z);
    }

    public final void setPlaceOrderClickListener(Function1<? super ProgressButtonStage, Unit> function1) {
        C786410Ut5.U8(this.LLIZ, new ACListenerS119S0200000_16(this, function1, 4));
    }

    public final void setVisibilityObserver(InterfaceC1054500dY0 interfaceC1054500dY0) {
        this.LLILZ = interfaceC1054500dY0;
    }

    public final void LJ(CheckoutBtnState checkoutBtnState, ProgressButtonStage progressButtonStage) {
        int i = C1054320dXi.LIZ[checkoutBtnState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LLIZ.setLoading(true);
                    this.LLIZ.setEnabled(true);
                } else {
                    throw new C1954807lC();
                }
            } else {
                this.LLIZ.setLoading(false);
                this.LLIZ.setEnabled(false);
            }
        } else {
            this.LLIZ.setLoading(false);
            this.LLIZ.setEnabled(true);
        }
        int i2 = C1054320dXi.LIZIZ[progressButtonStage.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                this.LLIZ.setText(getPlaceOrderText());
                this.LLIZLLLIL = ProgressButtonStage.Pay;
                return;
            }
            throw new C1954807lC();
        }
        this.LLIZ.setText(getContext().getString(2131848121));
        this.LLIZLLLIL = ProgressButtonStage.Review;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            InterfaceC1054500dY0 interfaceC1054500dY0 = this.LLILZ;
            if (interfaceC1054500dY0 != null) {
                interfaceC1054500dY0.onVisible();
                return;
            }
            return;
        }
        InterfaceC1054500dY0 interfaceC1054500dY02 = this.LLILZ;
        if (interfaceC1054500dY02 == null) {
            return;
        }
        interfaceC1054500dY02.Z0();
    }

    public final CharSequence LIZ(String str, int i, Function0<Unit> function0) {
        C444940Hca c444940Hca = new C444940Hca();
        c444940Hca.LIZJ = str;
        c444940Hca.LIZLLL(1);
        c444940Hca.LIZIZ = false;
        c444940Hca.LIZIZ(i);
        c444940Hca.LJIIIIZZ = new AwS560S0100000_16(function0, (Function0<Unit>) 83);
        return c444940Hca.LIZ(getContext());
    }

    public final SpannableStringBuilder LIZIZ(int i, int i2, boolean z) {
        String strLIZIZ;
        String string = getContext().getString(2131848112);
        String string2 = getContext().getString(2131848111);
        if (this.LLJILLL) {
            strLIZIZ = C786410Ut5.j4(getContext().getString(2131848114), Arrays.copyOf(new Object[]{string2}, 1));
        } else if (z) {
            strLIZIZ = C786410Ut5.j4(getContext().getString(2131848110), Arrays.copyOf(new Object[]{string, string2}, 2));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getContext().getString(2131848109));
            sbLIZ.append(string2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        C444940Hca c444940Hca = new C444940Hca();
        c444940Hca.LIZJ = strLIZIZ;
        c444940Hca.LIZLLL(2);
        c444940Hca.LIZIZ = false;
        c444940Hca.LIZIZ(i2);
        CharSequence charSequenceLIZ = c444940Hca.LIZ(getContext());
        String str = (String) C2505209rm.LIZ.getValue();
        String str2 = (String) C2547309yZ.LIZ.getValue();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceLIZ;
        if (!this.LLJILLL && z) {
            CharSequence charSequenceLIZ2 = LIZ(string, i, new AwS165S1100000_16(this, str, 8));
            int iLJJJ = a0.LJJJ(spannableStringBuilder, string, 0, false, 6);
            if (iLJJJ != -1) {
                spannableStringBuilder.replace(iLJJJ, string.length() + iLJJJ, charSequenceLIZ2);
            }
        }
        CharSequence charSequenceLIZ3 = LIZ(string2, i, new AwS165S1100000_16(this, str2, 9));
        int iLJJJ2 = a0.LJJJ(spannableStringBuilder, string2, 0, false, 6);
        if (iLJJJ2 != -1) {
            spannableStringBuilder.replace(iLJJJ2, string2.length() + iLJJJ2, charSequenceLIZ3);
        }
        return spannableStringBuilder;
    }
}
