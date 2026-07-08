package X;

import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.LoginModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.PaymentModel;
import com.ss.android.ugc.aweme.feed.model.AutofillModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0dD2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1041500dD2 {
    boolean autofillEnable();

    AutofillModel autofillModel();

    boolean enableCardPreload();

    boolean enableWebGoogleLogin();

    String getAdContainerId();

    LoginModel getIABLoginModel();

    String getIABMessageSessionId();

    PaymentModel getIABPaymentModel();

    int getIsFirstPage();

    boolean getIsFromJsb();

    String getLoadUrl();

    String getLpRefer();

    String getPreloadAdChannel();

    String getPreloadAdScene();

    int getPreloadAdWeb();

    int getPreloadWebStatus();

    AwemeRawAd getRawAd();

    long getRealCreativeId();

    String getRealCreativeIdStr();

    String getRealLogExtra();

    Integer isAutofillNoneffective();

    boolean isFromLynxPage();

    int isPreloadSecondPage();

    boolean isPreviewMode();

    boolean isReuseMode();

    int isUseWebUrl();

    boolean pureMode();

    void setVisible(EnumC1037150d61 enumC1037150d61);

    boolean sheetExpanded();

    boolean sheetVariantFullScreenMode();
}
