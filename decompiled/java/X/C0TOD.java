package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ProductInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionStatusInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionNotificationPrompt;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.net.URLEncoder;
import kotlin.jvm.internal.AwS97S1000000_12;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TOD, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TOD implements C0TPB {
    public static SubscriptionVM LIZIZ;
    public static ProductInfo LIZLLL;
    public static boolean LJ;
    public static final C0TOD LIZ = new C0TOD();
    public static final MutableLiveData<IapProductDetail> LIZJ = new MutableLiveData<>();

    @Override // X.C0TPB
    public final void LIZIZ(String str) {
        C0TPE.LIZ.getClass();
        C0TPE.LJFF().LIZLLL(1, str, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.C0TPB
    public final void LIZ(Context context, final Aweme aweme, String str, String str2, final C997520c46 c997520c46) {
        SubscriptionVM subscriptionVMLIZ;
        ProductInfo productInfo;
        SubscriptionStatusInfo subscriptionStatusInfo;
        SubscriptionInfo subscriptionInfo;
        OfferInfo offerInfo;
        C19EG c19egLIZIZ;
        final Activity activityLIZ;
        String str3 = null;
        switch (str.hashCode()) {
            case -1158743454:
                if (str.equals("ttPlusNotInterested")) {
                    if (str2 != null) {
                        JSONObject jSONObject = new JSONObject(str2);
                        String strOptString = jSONObject.optString("card_style");
                        int iOptInt = jSONObject.optInt("slide_index", -1);
                        C0TPE.LIZ.getClass();
                        C0TPE.LJFF().LJ(0, 1, iOptInt, strOptString);
                        C0TPE.LJFF().LJI();
                    }
                    SubscriptionVM subscriptionVM = LIZIZ;
                    if (subscriptionVM != null) {
                        subscriptionVM.BQ2(7, "4");
                    }
                    C1440005kM.LIZ(new C1210880hcE("homepage_hot", "FUNCTION_FROM_NOT_INTERESTED", "ttplus_card_not_interested", aweme));
                }
                break;
            case -790039367:
                if (str.equals("ttPlusClickTerms") && str2 != null) {
                    JSONObject jSONObject2 = new JSONObject(str2);
                    String strOptString2 = jSONObject2.optString("terms_url");
                    String strOptString3 = jSONObject2.optString("card_style");
                    int iOptInt2 = jSONObject2.optInt("slide_index", -1);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aweme://webview?url=");
                    sbLIZ.append(URLEncoder.encode(strOptString2, "UTF-8"));
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C0TPE.LIZ.getClass();
                    C0TPE.LJFF().LJ(2, 1, iOptInt2, strOptString3);
                    SmartRouter.buildRoute(context, strLIZIZ).open();
                    break;
                }
                break;
            case 930401840:
                if (str.equals("ttPlusSubscribe") && !LJ) {
                    if (str2 != null) {
                        JSONObject jSONObject3 = new JSONObject(str2);
                        String strOptString4 = jSONObject3.optString("card_style");
                        int iOptInt3 = jSONObject3.optInt("slide_index", -1);
                        C0TPE.LIZ.getClass();
                        C0TPE.LJFF().LJ(1, 1, iOptInt3, strOptString4);
                    }
                    if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                        MutableLiveData<IapProductDetail> mutableLiveData = LIZJ;
                        if (mutableLiveData.getValue() == null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                            c1389890mGx.LJIIIZ(2131843198);
                            c1389890mGx.LJIIJJI();
                            C0TOS c0tos = C0TOS.LIZ;
                            ProductInfo productInfo2 = LIZLLL;
                            if (productInfo2 != null) {
                                str3 = productInfo2.merchantId;
                            }
                            c0tos.getClass();
                            C0TOS.LIZIZ(str3, productInfo2, mutableLiveData, 1);
                            c997520c46.invoke();
                        } else {
                            LJ = true;
                            C0TOS c0tos2 = C0TOS.LIZ;
                            ProductInfo productInfo3 = LIZLLL;
                            IapProductDetail value = mutableLiveData.getValue();
                            ProductInfo productInfo4 = LIZLLL;
                            if (productInfo4 != null) {
                                str3 = productInfo4.pricePointId;
                            }
                            SubscriptionVM subscriptionVM2 = LIZIZ;
                            Boolean bool = Boolean.FALSE;
                            C0TGR c0tgr = new C0TGR() { // from class: X.0TOB
                                @Override // X.C0TGR
                                public final void onFail() {
                                    C0TOD.LJ = false;
                                    c997520c46.invoke();
                                }

                                @Override // X.C0TGR
                                public final void onSuccess() {
                                    C0TOD.LJ = false;
                                    c997520c46.invoke();
                                    C1440005kM.LIZ(new C1210880hcE("homepage_hot", "FUNCTION_FROM_DEFAULT", "ttplus_card_subscribe", aweme));
                                    String str4 = SubscriptionNotificationPrompt._pnsPageId;
                                    C1674230tfZ.LJFF(activityLIZ, 1, null, null);
                                    ComplianceServiceProvider.LJJI().LJIJJLI(null, 0);
                                    C0TOS.LIZ.getClass();
                                    C0TOS.LJIIJ();
                                }
                            };
                            c0tos2.getClass();
                            C0TOS.LJFF(7, context, productInfo3, value, str3, subscriptionVM2, bool, c0tgr, null, null, 0, null);
                        }
                        break;
                    }
                }
                break;
            case 1978364503:
                if (str.equals("ttPlusShow")) {
                    if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                        subscriptionVMLIZ = C0TQ7.LIZ(c19egLIZIZ);
                    } else {
                        subscriptionVMLIZ = null;
                    }
                    LIZIZ = subscriptionVMLIZ;
                    C0TOM.LIZ.getClass();
                    AdFreeSubscription adFreeSubscriptionLJ = C0TOM.LJ();
                    if (adFreeSubscriptionLJ != null && (subscriptionStatusInfo = adFreeSubscriptionLJ.subscriptionStatusInfo) != null && (subscriptionInfo = subscriptionStatusInfo.subscriptionInfo) != null && (offerInfo = subscriptionInfo.offerInfo) != null) {
                        productInfo = offerInfo.productInfo;
                    } else {
                        productInfo = null;
                    }
                    LIZLLL = productInfo;
                    C0TOS c0tos3 = C0TOS.LIZ;
                    ProductInfo productInfo5 = LIZLLL;
                    if (productInfo5 != null) {
                        str3 = productInfo5.merchantId;
                    }
                    MutableLiveData<IapProductDetail> mutableLiveData2 = LIZJ;
                    c0tos3.getClass();
                    C0TOS.LIZIZ(str3, productInfo5, mutableLiveData2, 1);
                    if (str2 != null) {
                        String strOptString5 = new JSONObject(str2).optString("card_style");
                        C0TPE.LIZ.getClass();
                        C0TPE.LJFF().LJIIIIZZ(1, aweme.getAid(), strOptString5, new AwS97S1000000_12(strOptString5, 15));
                    }
                }
                break;
        }
    }
}
