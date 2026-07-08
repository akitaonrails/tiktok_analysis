package X;

import Y.AfS152S0200000_16;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.checkout.model.ShopifyCheckoutPrivacyConfig;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.commercialize.adshopifycheckout.ShopifyCheckoutEntity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS113S0400000_16;
import kotlin.jvm.internal.AwS31S0000100_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0dXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1054430dXt implements InterfaceC1035540d3Q {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(AwemeRawAd awemeRawAd, String str) {
        ShopifyCheckoutEntity shopifyData;
        if (awemeRawAd != null && (shopifyData = awemeRawAd.getShopifyData()) != null && shopifyData.getEnableNativeCheckout() && str != null && !Intrinsics.LJFF(str, "landing_page") && ((Boolean) C276140As0.LIZ.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(long j, AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null) {
            return;
        }
        final Object[] objArr = {awemeRawAd};
        new AbstractC1023470cjx(objArr) { // from class: X.0c9O
            public final C1023630ckD<?>[] LIZ = new C1023630ckD[0];

            @Override // X.AbstractC1023380cjo, X.C1023640ckE
            public final C1023630ckD<?>[] getInternalLogics() {
                return this.LIZ;
            }
        }.logAd(C1054450dXv.LIZ, new AwS31S0000100_16(j, 27));
    }

    public final boolean LIZJ(final Context context, AwemeRawAd awemeRawAd) {
        boolean z;
        long j;
        CharSequence string;
        boolean zLJIILLIIL = C13LQ.LJIILLIIL(((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).getCurUserId(), Keva.getRepo("COMMERCE_SHOPIFY_DISCLAIMER").getStringArray("kCommerceCheckoutDisclaimerNotShowStorageKey", new String[0]));
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ShopifyCheckoutPrivacyConfig shopifyCheckoutPrivacyConfig = C1054490dXz.LIZ;
        ShopifyCheckoutPrivacyConfig shopifyCheckoutPrivacyConfig2 = (ShopifyCheckoutPrivacyConfig) settingsManagerLIZLLL.LJIIIIZZ("shopify_privacy_config", ShopifyCheckoutPrivacyConfig.class, shopifyCheckoutPrivacyConfig);
        if (shopifyCheckoutPrivacyConfig2 != null) {
            shopifyCheckoutPrivacyConfig = shopifyCheckoutPrivacyConfig2;
        }
        C1041360dCo.LIZ.getClass();
        if (!C1041360dCo.LIZ(shopifyCheckoutPrivacyConfig.allowedPrivacyRegions) && Intrinsics.LJFF(shopifyCheckoutPrivacyConfig.hideWelcomeWindowNonUS, Boolean.TRUE)) {
            z = false;
        } else {
            z = true;
        }
        if (zLJIILLIIL) {
            j = 0;
        } else if (z) {
            j = 2;
        } else {
            j = 1;
        }
        if (awemeRawAd != null) {
            final Object[] objArr = {awemeRawAd};
            new AbstractC1023470cjx(objArr) { // from class: X.0c9P
                public final C1023630ckD<?>[] LIZ = new C1023630ckD[0];

                @Override // X.AbstractC1023380cjo, X.C1023640ckE
                public final C1023630ckD<?>[] getInternalLogics() {
                    return this.LIZ;
                }
            }.logAd(C1054470dXx.LIZ, new AwS31S0000100_16(j, 28));
        }
        if (!z || zLJIILLIIL) {
            return false;
        }
        InterfaceC420801kM interfaceC420801kMLJJLJLI = C1906580ziK.LIZJ().LIZ().LJJLJLI(new AfS152S0200000_16(this, awemeRawAd, 9));
        C1054440dXu c1054440dXu = new C1054440dXu(context);
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJIIIZ = new AbstractC1391830mK5(context) { // from class: X.0DVQ
            public final /* synthetic */ Context LJ;

            @Override // X.AbstractC1397490mTD
            public final View LIZIZ() {
                FrameLayout frameLayout = new FrameLayout(this.LJ);
                Context context2 = this.LJ;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                frameLayout.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                C786410Ut5.a6(frameLayout, layoutParams);
                frameLayout.setBackground(new ColorDrawable(this.LIZLLL));
                ImageView imageView = new ImageView(context2);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62)));
                layoutParams2.gravity = 17;
                C786410Ut5.c6(imageView, layoutParams2);
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setAdjustViewBounds(true);
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.zv;
                imageView.setImageDrawable(c0hti.LIZ(context2));
                frameLayout.addView(imageView);
                return frameLayout;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, 0);
                this.LJ = context;
            }
        };
        c1397580mTM.LJFF(2131848119);
        C20301214c6 c20301214c6 = C20301014c4.LIZ;
        String upperCase = C20301014c4.LIZ.LIZIZ.toUpperCase(Locale.ROOT);
        if (!Intrinsics.LJFF(upperCase, "US") && !Intrinsics.LJFF(upperCase, "CA")) {
            string = context.getResources().getString(2131848117);
        } else {
            String string2 = context.getString(2131848112);
            String strJ4 = C786410Ut5.j4(context.getString(2131848118), Arrays.copyOf(new Object[]{string2}, 1));
            int iLJJJ = a0.LJJJ(strJ4, string2, 0, false, 6);
            int length = string2.length() + iLJJJ;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strJ4);
            C444940Hca c444940Hca = new C444940Hca();
            c444940Hca.LIZJ = string2;
            c444940Hca.LIZLLL(1);
            c444940Hca.LIZIZ = false;
            c444940Hca.LIZIZ(42);
            c444940Hca.LJIIIIZZ = new AwS417S0200000_16(this, context, 120);
            spannableStringBuilder.replace(iLJJJ, length, c444940Hca.LIZ(context));
            string = spannableStringBuilder;
        }
        c1397580mTM.LIZIZ(string);
        c1397580mTM.LJIIJJI = new C1054540dY4(c1054440dXu);
        C985403tE.LIZ(c1397580mTM, new AwS113S0400000_16(c1054440dXu, this, awemeRawAd, context, 5));
        c1397580mTM.LJIILIIL = 0;
        c1397580mTM.LJII = false;
        c1397580mTM.LIZLLL(new AwS595S0100000_16((C11JF) interfaceC420801kMLJJLJLI, 466));
        c1397580mTM.LJ(AFwS252S0000000_16.get$arr$(736));
        new C1397510mTF(c1397580mTM).LIZLLL();
        return true;
    }
}
