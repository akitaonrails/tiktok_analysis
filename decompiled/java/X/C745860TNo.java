package X;

import android.app.Activity;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ProductInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.PersonalizationViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionNotificationPrompt;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745860TNo extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ ProductInfo LLILLJJLI;
    public final /* synthetic */ EnumC745880TNq LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C259800zU<TuxSheet> LLILZIL;
    public final /* synthetic */ C20656615sK LLILZLL;
    public final /* synthetic */ C013C LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C745860TNo(Activity activity, ProductInfo productInfo, EnumC745880TNq enumC745880TNq, int i, C259800zU<TuxSheet> c259800zU, C20656615sK c20656615sK, C013C c013c) {
        super(0);
        this.LL = activity;
        this.LLILLJJLI = productInfo;
        this.LLILLL = enumC745880TNq;
        this.LLILZ = i;
        this.LLILZIL = c259800zU;
        this.LLILZLL = c20656615sK;
        this.LLIZ = c013c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PickYourAdPlanPage pickYourAdPlanPage;
        C05P0<Boolean> c05p0 = SubscriptionNotificationPrompt.LLJILJIL;
        C13FE c13fe = (C13FE) c05p0;
        if (!((Boolean) c13fe.getValue()).booleanValue()) {
            MutableLiveData<IapProductDetail> mutableLiveData = SubscriptionNotificationPrompt.LLJIJIL;
            Boolean boolIsContinuePay = null;
            boolIsContinuePay = null;
            if (mutableLiveData.getValue() == null) {
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL);
                if (c19egLIZIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                    c1389890mGx.LJIIIZ(2131843198);
                    c1389890mGx.LJIIJJI();
                }
                C0TOS c0tos = C0TOS.LIZ;
                ProductInfo productInfo = this.LLILLJJLI;
                String str = productInfo != null ? productInfo.merchantId : null;
                c0tos.getClass();
                C0TOS.LIZIZ(str, productInfo, mutableLiveData, 1);
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(1, "enter_from");
                c2344009Gk.LIZJ(1, "button_status");
                C20684815ws.LJIILLIIL("tt_plus_click_buy", c2344009Gk.LIZ);
            } else {
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LIZJ(this.LLILLL.toMobType(), "prompt_type");
                c2344009Gk2.LIZJ(1, "click_value");
                C20684815ws.LJIILLIIL("click_subscription_prompt", c2344009Gk2.LIZ);
                c13fe.setValue(Boolean.TRUE);
                C0TOS c0tos2 = C0TOS.LIZ;
                IapProductDetail value = mutableLiveData.getValue();
                ProductInfo productInfo2 = this.LLILLJJLI;
                String str2 = productInfo2 != null ? productInfo2.pricePointId : null;
                SubscriptionVM subscriptionVM = SubscriptionNotificationPrompt.LLIZLLLIL;
                AdFreeSubscription adFreeSubscription = SubscriptionNotificationPrompt.LLJ;
                if (adFreeSubscription != null && (pickYourAdPlanPage = adFreeSubscription.pickYourAdPlanPage) != null) {
                    boolIsContinuePay = pickYourAdPlanPage.isContinuePay();
                }
                final C259800zU<TuxSheet> c259800zU = this.LLILZIL;
                final Activity activity = this.LL;
                final C20656615sK c20656615sK = this.LLILZLL;
                final C013C c013c = this.LLIZ;
                C0TGR c0tgr = new C0TGR() { // from class: X.0TNn
                    @Override // X.C0TGR
                    public final void onFail() {
                        ((C13FE) SubscriptionNotificationPrompt.LLJILJIL).setValue(Boolean.FALSE);
                    }

                    @Override // X.C0TGR
                    public final void onSuccess() {
                        ((C13FE) SubscriptionNotificationPrompt.LLJILJIL).setValue(Boolean.FALSE);
                        TuxSheet tuxSheet = c259800zU.element;
                        if (tuxSheet != null) {
                            tuxSheet.dismiss();
                        }
                        String str3 = SubscriptionNotificationPrompt._pnsPageId;
                        Activity activity2 = activity;
                        C20656615sK c20656615sK2 = c20656615sK;
                        AdFreeSubscription adFreeSubscription2 = SubscriptionNotificationPrompt.LLJ;
                        C1674230tfZ.LJFF(activity2, 1, c20656615sK2, adFreeSubscription2 != null ? adFreeSubscription2.completePaymentWelcomePage : null);
                        ComplianceServiceProvider.LJJI().LJIJJLI(null, 0);
                        PersonalizationViewModel personalizationViewModel = SubscriptionNotificationPrompt.LLJI;
                        if (personalizationViewModel != null) {
                            personalizationViewModel.xQ2(2);
                        }
                        c013c.element = true;
                    }
                };
                Integer numValueOf = Integer.valueOf(this.LLILZ);
                Activity activity2 = this.LL;
                ProductInfo productInfo3 = this.LLILLJJLI;
                c0tos2.getClass();
                C0TOS.LJFF(numValueOf, activity2, productInfo3, value, str2, subscriptionVM, boolIsContinuePay, c0tgr, null, null, 0, c05p0);
                C2344009Gk c2344009Gk3 = new C2344009Gk();
                c2344009Gk3.LIZJ(1, "enter_from");
                c2344009Gk3.LIZJ(0, "button_status");
                C20684815ws.LJIILLIIL("tt_plus_click_buy", c2344009Gk3.LIZ);
            }
        }
        return Unit.LIZ;
    }
}
