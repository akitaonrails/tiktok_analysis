package Y;

import X.C013C;
import X.C0IJT;
import X.C0TGR;
import X.C0TOS;
import X.C0TUL;
import X.C0UX0;
import X.C1161920gLG;
import X.C1389890mGx;
import X.C197039127h;
import X.C20684815ws;
import X.C2344009Gk;
import X.C474500IjA;
import X.C500260Jjc;
import X.C770580UKq;
import X.C785000Uqo;
import X.C785410UrT;
import X.C923760a98;
import X.InterfaceC1124060fMC;
import X.InterfaceC752610Tff;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ProductInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.AdPersonalizationActivity;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.PersonalizationViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.AdFreeSubscriptionFragment;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.ChangePlanPageFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class ACListenerS49S0400000_12 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS49S0400000_12 aCListenerS49S0400000_12, View view) {
        InterfaceC752610Tff interfaceC752610TffLIZJ = ((IIconSlot) aCListenerS49S0400000_12.l0).LIZJ();
        if (interfaceC752610TffLIZJ != null) {
            interfaceC752610TffLIZJ.LIZ(((C785000Uqo) aCListenerS49S0400000_12.l3).LLILZIL.LJ(), "during_live");
        } else {
            ((IIconSlot) aCListenerS49S0400000_12.l0).getScheme();
            if (!TextUtils.isEmpty(null)) {
                IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                ((IIconSlot) aCListenerS49S0400000_12.l0).getScheme();
                iHostAction.openLiveBrowser((String) null, ((IIconSlot.SlotViewModel) aCListenerS49S0400000_12.l1).LLJILJILJ.getValue(), ((C785000Uqo) aCListenerS49S0400000_12.l3).LLILLJJLI);
            }
        }
        C770580UKq.LIZJ((InterfaceC1124060fMC) aCListenerS49S0400000_12.l2);
    }

    public static final void onClick$1(ACListenerS49S0400000_12 aCListenerS49S0400000_12, View view) {
        int i;
        String str;
        String str2;
        C923760a98 c923760a98 = (C923760a98) aCListenerS49S0400000_12.l0;
        Context context = (Context) aCListenerS49S0400000_12.l1;
        LatestBanRecordInfo latestBanRecordInfo = (LatestBanRecordInfo) aCListenerS49S0400000_12.l2;
        c923760a98.getClass();
        if (latestBanRecordInfo != null) {
            i = latestBanRecordInfo.banSource;
            str = latestBanRecordInfo.detailUrl;
        } else {
            i = 1;
            str = null;
        }
        C0UX0.LIZ(i, context, str, "link_mic", new AwS591S0100000_12(context, 923));
        LiveDialog liveDialog = (LiveDialog) aCListenerS49S0400000_12.l3;
        liveDialog.dismiss();
        C785410UrT.LIZ(liveDialog);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_linkmic_ban_details_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJ("click");
        if (C500260Jjc.LJIJ(DataChannelGlobal.LLILZ)) {
            str2 = "anchor";
        } else {
            str2 = "guest";
        }
        c474500IjALIZ.LJJII(str2, "user_type");
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$2(ACListenerS49S0400000_12 aCListenerS49S0400000_12, View view) {
        ProductInfo productInfo;
        ProductInfo productInfo2;
        String str;
        ProductInfo productInfo3;
        Boolean value = ((ChangePlanPageFragment) aCListenerS49S0400000_12.l0).LLJJLIIIJLLLLLLLZ.getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(value, bool)) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(((ChangePlanPageFragment) aCListenerS49S0400000_12.l0).LLJL, "enter_from");
        c2344009Gk.LIZJ(1, "click_value");
        C20684815ws.LJIILLIIL("click_ttadfree_ad_page", c2344009Gk.LIZ);
        String str2 = null;
        ProductInfo productInfo4 = null;
        str2 = null;
        if (!view.isEnabled()) {
            C0TOS c0tos = C0TOS.LIZ;
            OfferInfo offerInfo = (OfferInfo) aCListenerS49S0400000_12.l1;
            if (offerInfo != null && (productInfo3 = offerInfo.productInfo) != null) {
                str = productInfo3.merchantId;
            } else {
                str = null;
                if (offerInfo != null) {
                }
                MutableLiveData<IapProductDetail> mutableLiveData = ((ChangePlanPageFragment) aCListenerS49S0400000_12.l0).LLJJIJIL;
                c0tos.getClass();
                C0TOS.LIZIZ(str, productInfo4, mutableLiveData, 3);
                C1389890mGx c1389890mGx = new C1389890mGx((ChangePlanPageFragment) aCListenerS49S0400000_12.l0);
                c1389890mGx.LJIIIZ(2131843198);
                c1389890mGx.LJIIJJI();
                return;
            }
            productInfo4 = offerInfo.productInfo;
            MutableLiveData<IapProductDetail> mutableLiveData2 = ((ChangePlanPageFragment) aCListenerS49S0400000_12.l0).LLJJIJIL;
            c0tos.getClass();
            C0TOS.LIZIZ(str, productInfo4, mutableLiveData2, 3);
            C1389890mGx c1389890mGx2 = new C1389890mGx((ChangePlanPageFragment) aCListenerS49S0400000_12.l0);
            c1389890mGx2.LJIIIZ(2131843198);
            c1389890mGx2.LJIIJJI();
            return;
        }
        ((ChangePlanPageFragment) aCListenerS49S0400000_12.l0).LLJJLIIIJLLLLLLLZ.setValue(bool);
        C0TOS c0tos2 = C0TOS.LIZ;
        Context context = ((C197039127h) aCListenerS49S0400000_12.l2).getContext();
        OfferInfo offerInfo2 = (OfferInfo) aCListenerS49S0400000_12.l1;
        if (offerInfo2 != null) {
            productInfo = offerInfo2.productInfo;
        } else {
            productInfo = null;
        }
        IapProductDetail value2 = ((ChangePlanPageFragment) aCListenerS49S0400000_12.l0).LLJJIJIL.getValue();
        OfferInfo offerInfo3 = (OfferInfo) aCListenerS49S0400000_12.l1;
        if (offerInfo3 != null && (productInfo2 = offerInfo3.productInfo) != null) {
            str2 = productInfo2.pricePointId;
        }
        final ChangePlanPageFragment changePlanPageFragment = (ChangePlanPageFragment) aCListenerS49S0400000_12.l0;
        SubscriptionVM subscriptionVM = changePlanPageFragment.LLJJJJJIL;
        Boolean bool2 = Boolean.FALSE;
        final Context context2 = (Context) aCListenerS49S0400000_12.l3;
        C0TGR c0tgr = new C0TGR() { // from class: X.0TNg
            @Override // X.C0TGR
            public final void onFail() {
                changePlanPageFragment.LLJJLIIIJLLLLLLLZ.setValue(Boolean.FALSE);
            }

            @Override // X.C0TGR
            public final void onSuccess() {
                changePlanPageFragment.LLJJLIIIJLLLLLLLZ.setValue(Boolean.FALSE);
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LIZJ(2, "prompt_type");
                c2344009Gk2.LIZJ(1, "product_line");
                C20684815ws.LJIILLIIL("exit_payment_success", c2344009Gk2.LIZ);
                IComplianceSettingsService iComplianceSettingsServiceLJJI = ComplianceServiceProvider.LJJI();
                final ChangePlanPageFragment changePlanPageFragment2 = changePlanPageFragment;
                final Context context3 = context2;
                iComplianceSettingsServiceLJJI.LJIJJLI(new C100F() { // from class: X.0TNh
                    @Override // X.C100F
                    public final void LIZIZ(boolean z) {
                        AdFreeTrialPageInfo adFreeTrialPageInfo;
                        PersonalizationViewModel personalizationViewModel = changePlanPageFragment2.LLJJJJLIIL;
                        if (personalizationViewModel != null) {
                            personalizationViewModel.xQ2(2);
                        }
                        C19EH c19ehLJIIJ = changePlanPageFragment2.getParentFragmentManager().LJIIJ();
                        c19ehLJIIJ.LJIJJLI(R.anim.fn, R.anim.fo, R.anim.fm, R.anim.fp);
                        AdFreeSubscriptionFragment adFreeSubscriptionFragment = new AdFreeSubscriptionFragment();
                        Bundle bundle = new Bundle();
                        bundle.putInt("enter_from", 0);
                        adFreeSubscriptionFragment.setArguments(bundle);
                        c19ehLJIIJ.LJIJ(R.id.iiv, adFreeSubscriptionFragment, null);
                        c19ehLJIIJ.LJII(null);
                        c19ehLJIIJ.LJIIIZ();
                        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context3);
                        if (c19egLIZIZ != null) {
                            AdFreeSubscription adFreeSubscription = changePlanPageFragment2.LLJJJ;
                            if (adFreeSubscription != null) {
                                adFreeTrialPageInfo = adFreeSubscription.completePaymentWelcomePage;
                            } else {
                                adFreeTrialPageInfo = null;
                            }
                            C746110TOn.LIZ(c19egLIZIZ, adFreeTrialPageInfo, null);
                        }
                        for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
                            if (abstractC1387200mCc.LIZIZ() instanceof AdPersonalizationActivity) {
                                abstractC1387200mCc.LIZ();
                            }
                        }
                    }
                }, 0);
            }
        };
        MutableLiveData<Boolean> mutableLiveData3 = changePlanPageFragment.LLJJLIIIJLLLLLLLZ;
        c0tos2.getClass();
        C0TOS.LJFF(3, context, productInfo, value2, str2, subscriptionVM, bool2, c0tgr, null, mutableLiveData3, 1, null);
    }

    public static final void onClick$3(ACListenerS49S0400000_12 aCListenerS49S0400000_12, View view) {
        C0TUL c0tul = (C0TUL) aCListenerS49S0400000_12.l0;
        if (c0tul != null) {
            c0tul.LIZLLL(3);
        }
        C2344009Gk c2344009Gk = (C2344009Gk) aCListenerS49S0400000_12.l1;
        c2344009Gk.LIZJ(((C013C) aCListenerS49S0400000_12.l2).element ? 1 : 0, "if_click_cg");
        C20684815ws.LJIILLIIL("comment_rethink_post_ck", c2344009Gk.LIZ);
        ((TuxSheet) aCListenerS49S0400000_12.l3).dismiss();
    }

    public static final void onClick$4(ACListenerS49S0400000_12 aCListenerS49S0400000_12, View view) {
        C0TUL c0tul = (C0TUL) aCListenerS49S0400000_12.l0;
        if (c0tul != null) {
            c0tul.LIZIZ();
        }
        C2344009Gk c2344009Gk = (C2344009Gk) aCListenerS49S0400000_12.l1;
        c2344009Gk.LIZJ(((C013C) aCListenerS49S0400000_12.l2).element ? 1 : 0, "if_click_cg");
        C20684815ws.LJIILLIIL("comment_rethink_edit_ck", c2344009Gk.LIZ);
        ((TuxSheet) aCListenerS49S0400000_12.l3).dismiss();
    }

    public ACListenerS49S0400000_12(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l3 = obj4;
        this.l0 = obj2;
        this.l1 = obj;
        this.l2 = obj3;
    }
}
