package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.android.livesdk.iap.IapSubscriptionProduct;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ProductInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscribeResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionStatusInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.AdFreeSubscriptionSettingsSettings;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionAdPageActivity;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionNotificationPrompt;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.AdFreeSubscriptionFragment;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.feedcard.TTPlusCardData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS110S0400000_12;
import kotlin.jvm.internal.AwS52S1300000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TOS, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TOS {
    public static WeakReference<SubscriptionAdPageActivity> LIZJ;
    public static WeakReference<AdFreeSubscriptionFragment> LIZLLL;
    public static Integer LJ;
    public static WeakReference<SparkContext> LJI;
    public static final C0TOS LIZ = new C0TOS();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(159));
    public static final MutableLiveData<IapProductDetail> LJFF = new MutableLiveData<>();

    public static boolean LIZLLL() {
        AdFreeSubscription adFreeSubscription;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ == null || (adFreeSubscription = adPersonalitySettingsLIZIZ.subscription) == null) {
            return false;
        }
        Integer num = adFreeSubscription.subscriptionMode;
        if (num != null && num.intValue() == 0) {
            return false;
        }
        Integer num2 = adFreeSubscription.subscriptionStatus;
        if (num2 != null && num2.intValue() == 1) {
            return true;
        }
        Integer num3 = adFreeSubscription.subscriptionStatus;
        return num3 != null && num3.intValue() == 0;
    }

    public static boolean LJ() {
        AdFreeSubscription adFreeSubscription;
        Integer num;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ == null || (adFreeSubscription = adPersonalitySettingsLIZIZ.subscription) == null) {
            return false;
        }
        Integer num2 = adFreeSubscription.subscriptionMode;
        return (num2 == null || num2.intValue() != 0) && (num = adFreeSubscription.subscriptionStatus) != null && num.intValue() == 2;
    }

    public static void LJIIJ() {
        AdFreeSubscription adFreeSubscription;
        ComplianceSetting complianceSetting;
        IComplianceSettingsService iComplianceSettingsServiceLJJI = ComplianceServiceProvider.LJJI();
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ != null) {
            adFreeSubscription = adPersonalitySettingsLIZIZ.subscription;
            if (adFreeSubscription != null) {
                adFreeSubscription.setSubscriptionStatus(2);
            }
        } else {
            adFreeSubscription = null;
        }
        AdPersonalitySettings adPersonalitySettingsLIZIZ2 = C0TOM.LIZIZ();
        AdPersonalitySettings adPersonalitySettingsCopy = adPersonalitySettingsLIZIZ2 != null ? adPersonalitySettingsLIZIZ2.copy(adPersonalitySettingsLIZIZ2.mode, adPersonalitySettingsLIZIZ2.needPopUp, adPersonalitySettingsLIZIZ2.isFollowSystemConfig, adPersonalitySettingsLIZIZ2.description, adPersonalitySettingsLIZIZ2.title, adPersonalitySettingsLIZIZ2.copyWriting, adPersonalitySettingsLIZIZ2.isShowSettings, adPersonalitySettingsLIZIZ2.showInterestLabel, adPersonalitySettingsLIZIZ2.showInterestItemType, adPersonalitySettingsLIZIZ2.lat, adPersonalitySettingsLIZIZ2.promptStyle, adPersonalitySettingsLIZIZ2.isNpUser, adPersonalitySettingsLIZIZ2.unifiedMode, adPersonalitySettingsLIZIZ2.isTeenagerMode, adPersonalitySettingsLIZIZ2.isNewUser, adPersonalitySettingsLIZIZ2.PARevisingSwitch, adPersonalitySettingsLIZIZ2.unifiedModeTextData, adPersonalitySettingsLIZIZ2.isShowResetEntry, adPersonalitySettingsLIZIZ2.reset, adPersonalitySettingsLIZIZ2.isUseBalancePrompt, adPersonalitySettingsLIZIZ2.isShowAdvertiserSettings, adPersonalitySettingsLIZIZ2.popUpStyle, adPersonalitySettingsLIZIZ2.contentType, adPersonalitySettingsLIZIZ2.abCopyWriting, adFreeSubscription, adPersonalitySettingsLIZIZ2.thirdPartyAdConsentPromptConfig, adPersonalitySettingsLIZIZ2.enableToggleDecoupling, adPersonalitySettingsLIZIZ2.hitDisconnectAdvExperiment) : null;
        ComplianceSetting complianceSettingLJIILLIIL = iComplianceSettingsServiceLJJI.LJIILLIIL();
        if (complianceSettingLJIILLIIL == null || (complianceSetting = complianceSettingLJIILLIIL.copy(complianceSettingLJIILLIIL.blackSetting, complianceSettingLJIILLIIL.enableImpressum, complianceSettingLJIILLIIL.impressumUrl, complianceSettingLJIILLIIL.privacyPolicyUrl, adPersonalitySettingsCopy, complianceSettingLJIILLIIL.notifyPrivateAccount, complianceSettingLJIILLIIL.forcePrivateAccount, complianceSettingLJIILLIIL.addTermsConsentForRegister, complianceSettingLJIILLIIL.enableTermsConsentPopup, complianceSettingLJIILLIIL.termsConsentInfo, complianceSettingLJIILLIIL.termConsentInfoNewUsers, complianceSettingLJIILLIIL.complianceEncrypt, complianceSettingLJIILLIIL.ageGateInfo, complianceSettingLJIILLIIL.logPb, complianceSettingLJIILLIIL.legalEntityChangeInfo, complianceSettingLJIILLIIL.afSharingBlock, complianceSettingLJIILLIIL.interfaceControlSettingsString, complianceSettingLJIILLIIL.deviceLimitRegisterExpiredTime, complianceSettingLJIILLIIL.privacyHighlightsForTeensLink, complianceSettingLJIILLIIL.privacyHighlightsType, complianceSettingLJIILLIIL.privateAccountPrompt, complianceSettingLJIILLIIL.privateAccountPromptType, complianceSettingLJIILLIIL.isMixedAge, complianceSettingLJIILLIIL.preferenceSettings, complianceSettingLJIILLIIL.ageVerificationAction, complianceSettingLJIILLIIL.notifyParentsWithEmail, complianceSettingLJIILLIIL.ageGraduationScenes, complianceSettingLJIILLIIL.stopAutoPlayTimesThreshold)) == null) {
            complianceSetting = new ComplianceSetting(null, 0, null, null, adPersonalitySettingsCopy, 0, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, Boolean.FALSE, null, 0L, "", 0, 0, 0, 0, null, false, false, new LinkedHashMap(), 0);
        }
        iComplianceSettingsServiceLJJI.LJJIIJ(complianceSetting);
    }

    public static int LIZJ(int i, Context context) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return C446980Hfs.LIZ(context, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(X.C19EG r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0TOS.LJIIIZ(X.19EG, java.lang.String):void");
    }

    public static void LIZ(Activity activity, int i, Integer num) {
        String string = activity.getString(i);
        if (AdFreeSubscriptionSettingsSettings.LIZ().showErrorCodeInToast && num != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append('(');
            sbLIZ.append(num);
            sbLIZ.append(')');
            string = C2188811AlT.LIZIZ(sbLIZ);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIJ(string);
        c1389890mGx.LJIIJJI();
    }

    public static void LIZIZ(String str, final ProductInfo productInfo, final MutableLiveData mutableLiveData, final Integer num) {
        String str2;
        if (str != null && productInfo != null && (str2 = productInfo.skuId) != null) {
            C1617170sBX c1617170sBX = new C1617170sBX(str, (List<String>) Collections.singletonList(str2), "subs");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getProductDetails merchantId: ");
            sbLIZ.append(str);
            sbLIZ.append(", productId: ");
            sbLIZ.append(productInfo.skuId);
            C1022620cia.LIZ("SubscriptionUtils", C2188811AlT.LIZIZ(sbLIZ));
            ((InterfaceC1791930wjP) LIZIZ.getValue()).LIZ(c1617170sBX, new InterfaceC1791300wiO() { // from class: X.0TP1
                @Override // X.InterfaceC1791300wiO
                public final void LJ(C0KSV c0ksv) {
                }

                @Override // X.InterfaceC1791300wiO
                public final void LIZLLL(C518150KTt c518150KTt) {
                    String str3;
                    Integer numValueOf;
                    Integer numValueOf2;
                    EnumC1792020wjY enumC1792020wjY;
                    EnumC1792020wjY enumC1792020wjY2;
                    SparkContext sparkContext;
                    if (c518150KTt.LIZ) {
                        Map<String, IapProductDetail> map = c518150KTt.LIZIZ;
                        if (map != null) {
                            MutableLiveData<IapProductDetail> mutableLiveData2 = mutableLiveData;
                            ProductInfo productInfo2 = productInfo;
                            Integer num2 = num;
                            mutableLiveData2.setValue(map.get(productInfo2.skuId));
                            C0TOS.LIZ.getClass();
                            WeakReference<SparkContext> weakReference = C0TOS.LJI;
                            if (weakReference != null && (sparkContext = weakReference.get()) != null) {
                                sparkContext.LJJ(IapProductDetail.class, mutableLiveData2.getValue());
                            }
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJ(num2, "enter_from");
                            c2344009Gk.LIZJ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                            C20684815ws.LJIILLIIL("tt_plus_get_product_detail", c2344009Gk.LIZ);
                            return;
                        }
                        Integer num3 = num;
                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                        c2344009Gk2.LJ(num3, "enter_from");
                        c2344009Gk2.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                        C20684815ws.LJIILLIIL("tt_plus_get_product_detail", c2344009Gk2.LIZ);
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("getProductDetails onFailure: ");
                    C0KQW c0kqw = c518150KTt.LIZJ;
                    String str4 = null;
                    if (c0kqw != null) {
                        str3 = c0kqw.LIZIZ;
                    } else {
                        str3 = null;
                    }
                    sbLIZ2.append(str3);
                    sbLIZ2.append(" errorCode: ");
                    C0KQW c0kqw2 = c518150KTt.LIZJ;
                    if (c0kqw2 != null && (enumC1792020wjY2 = c0kqw2.LIZ) != null) {
                        numValueOf = Integer.valueOf(enumC1792020wjY2.getValue());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ2.append(numValueOf);
                    C1022620cia.LIZ("SubscriptionUtils", C2188811AlT.LIZIZ(sbLIZ2));
                    C2344009Gk c2344009Gk3 = new C2344009Gk();
                    c2344009Gk3.LJ(num, "enter_from");
                    c2344009Gk3.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                    C0KQW c0kqw3 = c518150KTt.LIZJ;
                    if (c0kqw3 != null && (enumC1792020wjY = c0kqw3.LIZ) != null) {
                        numValueOf2 = Integer.valueOf(enumC1792020wjY.getValue());
                    } else {
                        numValueOf2 = null;
                    }
                    c2344009Gk3.LJ(numValueOf2, "error_code");
                    C0KQW c0kqw4 = c518150KTt.LIZJ;
                    if (c0kqw4 != null) {
                        str4 = c0kqw4.LIZIZ;
                    }
                    c2344009Gk3.LJIIIIZZ("error_message", str4);
                    C20684815ws.LJIILLIIL("tt_plus_get_product_detail", c2344009Gk3.LIZ);
                }
            });
        }
    }

    public static void LJII(Activity activity, Integer num, Integer num2, String str) {
        C1397580mTM c1397580mTM = new C1397580mTM(activity);
        c1397580mTM.LJI(activity.getString(2131857225));
        c1397580mTM.LIZIZ(activity.getString(2131857222));
        C985403tE.LIZ(c1397580mTM, new AwS52S1300000_12(activity, num, num2, str, 0));
        c1397580mTM.LJII = true;
        new C1397510mTF(c1397580mTM).LJ();
    }

    public static void LJIIIIZZ(C0TOS c0tos, final Context context, IapProductDetail iapProductDetail, final SubscriptionVM subscriptionVM, TTPlusCardData tTPlusCardData, Aweme aweme, String str, String str2, final int i, int i2) {
        String str3;
        String str4;
        String str5;
        ProductInfo productInfo;
        String str6;
        SubscriptionStatusInfo subscriptionStatusInfo;
        SubscriptionInfo subscriptionInfo;
        OfferInfo offerInfo;
        String str7 = str2;
        String str8 = str;
        final Aweme aweme2 = aweme;
        final TTPlusCardData tTPlusCardData2 = tTPlusCardData;
        String str9 = null;
        if ((i2 & 8) != 0) {
            tTPlusCardData2 = null;
        }
        if ((i2 & 16) != 0) {
            aweme2 = null;
        }
        if ((i2 & 32) != 0) {
            str8 = null;
        }
        if ((i2 & 64) != 0) {
            str7 = null;
        }
        c0tos.getClass();
        if (context != null) {
            if (tTPlusCardData2 == null && (str7 == null || str8 == null)) {
                return;
            }
            if (iapProductDetail == null) {
                C0TOM.LIZ.getClass();
                AdFreeSubscription adFreeSubscriptionLJ = C0TOM.LJ();
                if (adFreeSubscriptionLJ != null && (subscriptionStatusInfo = adFreeSubscriptionLJ.subscriptionStatusInfo) != null && (subscriptionInfo = subscriptionStatusInfo.subscriptionInfo) != null && (offerInfo = subscriptionInfo.offerInfo) != null) {
                    productInfo = offerInfo.productInfo;
                    if (productInfo != null) {
                        str6 = productInfo.merchantId;
                    }
                    LIZIZ(str6, productInfo, LJFF, 1);
                } else {
                    productInfo = null;
                }
                str6 = null;
                LIZIZ(str6, productInfo, LJFF, 1);
            }
            final C238400w2 c238400w2 = new C238400w2();
            final C238400w2 c238400w22 = new C238400w2();
            if (tTPlusCardData2 != null && (str5 = tTPlusCardData2.midPageUrl) != null) {
                str8 = str5;
            }
            final C013C c013c = new C013C();
            c013c.element = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str8);
            sbLIZ.append("&isDarkMode=");
            if (C960203pA.LIZIZ(context)) {
                str3 = "true";
            } else {
                str3 = "false";
            }
            sbLIZ.append(str3);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[showFeedCardMidPage] enterFrom=");
            sbLIZ2.append(i);
            sbLIZ2.append(", productDetail=");
            sbLIZ2.append(iapProductDetail);
            C1022620cia.LIZ("SubscriptionUtils", C2188811AlT.LIZIZ(sbLIZ2));
            SparkContext sparkContext = new SparkContext();
            C1537510q73 c1537510q73 = new C1537510q73();
            if (tTPlusCardData2 != null && (str4 = tTPlusCardData2.midPageInfo) != null) {
                str7 = str4;
            } else if (str7 == null) {
                str7 = "";
            }
            c1537510q73.put("ttPlusPageInfo", (Object) str7);
            sparkContext.runtimeInfo = c1537510q73;
            sparkContext.LJJ(IapProductDetail.class, iapProductDetail);
            if (tTPlusCardData2 != null) {
                str9 = tTPlusCardData2.cardStyleId;
            }
            sparkContext.LJJ(C746000TOc.class, new C746000TOc(i, str9));
            sparkContext.LJJLIIJ(strLIZIZ);
            sparkContext.LJJ(InterfaceC1892990zMP.class, new AbstractC1893000zMQ() { // from class: X.0DaJ
                public TuxNavBar LL;
                public C1250250idj LLILLJJLI;

                @Override // X.InterfaceC1892990zMP
                public final void LJIILL(int i3) {
                }

                @Override // X.InterfaceC1892990zMP
                public final void LJJIFFI(EnumC1067700dtI enumC1067700dtI) {
                }

                @Override // X.InterfaceC1892990zMP
                public final void setCloseAllClickListener(View.OnClickListener onClickListener) {
                }

                @Override // X.InterfaceC1892990zMP
                public final View LJFF(Context context2) {
                    View viewSd = C786410Ut5.Sd(R.layout.i3_, C786410Ut5.ne(context2), null);
                    this.LL = (TuxNavBar) viewSd.findViewById(R.id.yx2);
                    C0OM1 c0om1 = new C0OM1();
                    C1251150ifB c1251150ifB = new C1251150ifB();
                    c1251150ifB.LIZLLL();
                    c1251150ifB.LIZJ = R.raw.icon_chevron_left_fill_ltr;
                    c1251150ifB.LIZIZ = "back_btn";
                    c0om1.LJ(c1251150ifB);
                    TuxNavBar tuxNavBar = this.LL;
                    if (tuxNavBar != null) {
                        tuxNavBar.setNavActions(c0om1);
                    }
                    return viewSd;
                }

                @Override // X.InterfaceC1892990zMP
                public final void LJJJI(int i3) {
                    TuxNavBar tuxNavBar = this.LL;
                    if (tuxNavBar != null) {
                        tuxNavBar.setNavBackground(i3);
                    }
                }

                @Override // X.InterfaceC1892990zMP
                public final void LJJJJ(boolean z) {
                    View viewLJII = null;
                    if (z) {
                        TuxNavBar tuxNavBar = this.LL;
                        if (tuxNavBar != null) {
                            viewLJII = tuxNavBar.LJII("close_all_btn");
                        }
                        C12ES.LJIILL(0, viewLJII);
                        return;
                    }
                    TuxNavBar tuxNavBar2 = this.LL;
                    if (tuxNavBar2 != null) {
                        viewLJII = tuxNavBar2.LJII("close_all_btn");
                    }
                    C12ES.LJIILL(8, viewLJII);
                }

                @Override // X.InterfaceC1892990zMP
                public final void setBackClickListener(View.OnClickListener onClickListener) {
                    View viewLJII;
                    TuxNavBar tuxNavBar = this.LL;
                    if (tuxNavBar != null && (viewLJII = tuxNavBar.LJII("back_btn")) != null) {
                        C786410Ut5.I7(onClickListener, viewLJII);
                    }
                }

                @Override // X.InterfaceC1892990zMP
                public final void setTitle(String str10) {
                    if (this.LLILLJJLI == null) {
                        this.LLILLJJLI = new C1250250idj();
                    }
                    C1250250idj c1250250idj = this.LLILLJJLI;
                    if (c1250250idj != null) {
                        c1250250idj.LIZJ = str10;
                        TuxNavBar tuxNavBar = this.LL;
                        if (tuxNavBar != null) {
                            tuxNavBar.LJIJJ(c1250250idj);
                        }
                    }
                }
            });
            sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0TNm
                @Override // X.AbstractC1537870q7d
                public final void LJJZ(InterfaceC1541990qEH interfaceC1541990qEH) {
                    String str10;
                    String str11;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[onDestroy] begin, isSubscriptionUser()=");
                    C0TOS.LIZ.getClass();
                    sbLIZ3.append(C0TOS.LJ());
                    C1022620cia.LIZ("SubscriptionUtils", C2188811AlT.LIZIZ(sbLIZ3));
                    String str12 = "";
                    if (C0TOS.LJ()) {
                        if (aweme2 == null) {
                            SubscriptionVM subscriptionVM2 = subscriptionVM;
                            if (subscriptionVM2 != null) {
                                subscriptionVM2.zQ2();
                            }
                            SubscriptionVM subscriptionVM3 = subscriptionVM;
                            if (subscriptionVM3 != null) {
                                subscriptionVM3.AQ2();
                            }
                        } else {
                            C1022620cia.LIZ("SubscriptionUtils", "[onDestroy] delete aweme");
                            C1440005kM.LIZ(new C1210880hcE("homepage_hot", "FUNCTION_FROM_DEFAULT", "ttplus_card_subscribe", aweme2));
                        }
                        Activity activityLIZ = C1388190mED.LIZ(context);
                        if (activityLIZ != null) {
                            String str13 = SubscriptionNotificationPrompt._pnsPageId;
                            C1674230tfZ.LJFF(activityLIZ, 6, null, null);
                        }
                    } else {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LIZJ(0, "click_value");
                        c2344009Gk.LIZJ(i, "enter_from");
                        TTPlusCardData tTPlusCardData3 = tTPlusCardData2;
                        if (tTPlusCardData3 == null || (str10 = tTPlusCardData3.cardStyleId) == null) {
                            str10 = "";
                        }
                        c2344009Gk.LJIIIIZZ("enter_from_card_style", str10);
                        C20684815ws.LJIILLIIL("ttplus_mid_page_click", c2344009Gk.LIZ);
                    }
                    if (c238400w2.element != 0) {
                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                        c2344009Gk2.LIZLLL(System.currentTimeMillis() - c238400w2.element, "stay_time");
                        c2344009Gk2.LIZJ(i, "enter_from");
                        TTPlusCardData tTPlusCardData4 = tTPlusCardData2;
                        if (tTPlusCardData4 != null && (str11 = tTPlusCardData4.cardStyleId) != null) {
                            str12 = str11;
                        }
                        c2344009Gk2.LJIIIIZZ("enter_from_card_style", str12);
                        C20684815ws.LJIILLIIL("ttplus_mid_page_exit", c2344009Gk2.LIZ);
                    }
                }

                @Override // X.AbstractC1537870q7d
                public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                    String str10;
                    C013C c013c2 = c013c;
                    if (c013c2.element) {
                        c013c2.element = false;
                        SubscriptionVM subscriptionVM2 = subscriptionVM;
                        if (subscriptionVM2 != null) {
                            subscriptionVM2.xQ2(11, null, null);
                        }
                        c238400w2.element = System.currentTimeMillis();
                        long j = c238400w2.element - c238400w22.element;
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LIZJ(i, "enter_from");
                        c2344009Gk.LIZLLL(j, "loading_time");
                        TTPlusCardData tTPlusCardData3 = tTPlusCardData2;
                        if (tTPlusCardData3 == null || (str10 = tTPlusCardData3.cardStyleId) == null) {
                            str10 = "";
                        }
                        c2344009Gk.LJIIIIZZ("enter_from_card_style", str10);
                        C20684815ws.LJIILLIIL("ttplus_mid_page_show", c2344009Gk.LIZ);
                    }
                }

                @Override // X.AbstractC1537870q7d
                public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str10) {
                    c238400w22.element = System.currentTimeMillis();
                }
            });
            LJI = new WeakReference<>(sparkContext);
            C1541950qED.LIZJ.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.0TNj] */
    public static void LJFF(final Integer num, final Context context, final ProductInfo productInfo, final IapProductDetail iapProductDetail, final String str, final SubscriptionVM subscriptionVM, final Boolean bool, final C0TGR c0tgr, final C0TNG c0tng, final MutableLiveData mutableLiveData, final int i, final C05P0 c05p0) {
        String str2;
        IapSubscriptionProduct iapSubscriptionProduct;
        LJ = Integer.valueOf(i);
        if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
            final Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                C0TOS c0tos = LIZ;
                final ?? r8 = new C0TGR() { // from class: X.0TNj
                    @Override // X.C0TGR
                    public final void onFail() {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                        c1389890mGx.LJIIIZ(2131829404);
                        c1389890mGx.LJIIJJI();
                        c0tgr.onFail();
                    }

                    @Override // X.C0TGR
                    public final void onSuccess() {
                        C0TOS c0tos2 = C0TOS.LIZ;
                        Integer num2 = num;
                        Context context2 = context;
                        ProductInfo productInfo2 = productInfo;
                        IapProductDetail iapProductDetail2 = iapProductDetail;
                        String str3 = str;
                        SubscriptionVM subscriptionVM2 = subscriptionVM;
                        Boolean bool2 = bool;
                        C0TGR c0tgr2 = c0tgr;
                        C0TNG c0tng2 = c0tng;
                        MutableLiveData<Boolean> mutableLiveData2 = mutableLiveData;
                        int i2 = i;
                        C05P0<Boolean> c05p02 = c05p0;
                        c0tos2.getClass();
                        C0TOS.LJFF(num2, context2, productInfo2, iapProductDetail2, str3, subscriptionVM2, bool2, c0tgr2, c0tng2, mutableLiveData2, i2, c05p02);
                    }
                };
                c0tos.getClass();
                ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
                C0XQS c0xqs = new C0XQS();
                c0xqs.LIZ = activityLIZ;
                c0xqs.LIZIZ = "cold_launch";
                c0xqs.LIZJ = "SubscriptionPage";
                c0xqs.LJI = new C0TNI() { // from class: X.0TNH
                    @Override // X.C0TNI
                    public final void LIZ(int i2, int i3) {
                        Integer numValueOf = Integer.valueOf(i3);
                        if (i2 == 19) {
                            if (numValueOf != null && numValueOf.intValue() == 1) {
                                if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isNewUser()) {
                                    C0TNG c0tng2 = c0tng;
                                    if (c0tng2 != null) {
                                        c0tng2.LIZ();
                                    }
                                    ComplianceServiceProvider.LJIL().LJJIIJ();
                                    return;
                                }
                                r8.onSuccess();
                                return;
                            }
                            r8.onFail();
                        }
                    }
                };
                iLoginServiceLIZJ.showLoginAndRegisterView(new C0XQT(c0xqs));
                if (mutableLiveData != null) {
                    mutableLiveData.setValue(Boolean.FALSE);
                }
                if (c05p0 != null) {
                    c05p0.setValue(Boolean.FALSE);
                    return;
                }
                return;
            }
            return;
        }
        final Activity activityLIZ2 = C1388190mED.LIZ(context);
        String str3 = null;
        if (productInfo != null) {
            str2 = productInfo.productId;
        } else {
            str2 = null;
        }
        if (activityLIZ2 != null && str2 != null && iapProductDetail != null) {
            if (subscriptionVM != null) {
                List<IapSubscriptionProduct> list = iapProductDetail.subscriptionOffer;
                if (list != null && (iapSubscriptionProduct = (IapSubscriptionProduct) C13LP.LJJJLZIJ(0, list)) != null) {
                    str3 = iapSubscriptionProduct.offerToken;
                }
                InterfaceC746140TOq interfaceC746140TOq = new InterfaceC746140TOq() { // from class: X.0TP0
                    @Override // X.InterfaceC746140TOq
                    public final void onFail() {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ2);
                        c1389890mGx.LJIIIZ(2131829405);
                        c1389890mGx.LJIIJJI();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        Integer num2 = num;
                        c2344009Gk.LJ((num2 != null && num2.intValue() == 2 && Intrinsics.LJFF(bool, Boolean.TRUE)) ? 3 : num, "prompt_type");
                        c2344009Gk.LIZJ(5, "subscribe_code");
                        c2344009Gk.LIZJ(i, "product_line");
                        C20684815ws.LJIILLIIL("tt_plus_create_order_error", c2344009Gk.LIZ);
                        c0tgr.onFail();
                    }

                    @Override // X.InterfaceC746140TOq
                    public final void LIZ(SubscribeResponse subscribeResponse) {
                        Integer num2;
                        Integer subscribeCode;
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        Integer num3 = num;
                        Integer num4 = 3;
                        if (num3 != null && num3.intValue() == 2 && Intrinsics.LJFF(bool, Boolean.TRUE)) {
                            num2 = num4;
                        } else {
                            num2 = num;
                        }
                        c2344009Gk.LJ(num2, "prompt_type");
                        c2344009Gk.LJ(subscribeResponse.getSubscribeCode(), "subscribe_code");
                        c2344009Gk.LIZJ(i, "product_line");
                        c2344009Gk.LJ(subscribeResponse.getErrorCode(), "error_code");
                        C20684815ws.LJIILLIIL("tt_plus_create_order_error", c2344009Gk.LIZ);
                        Integer subscribeCode2 = subscribeResponse.getSubscribeCode();
                        int i2 = 1;
                        if ((subscribeCode2 != null && subscribeCode2.intValue() == 2) || ((subscribeCode = subscribeResponse.getSubscribeCode()) != null && subscribeCode.intValue() == 4)) {
                            Integer subscribeCode3 = subscribeResponse.getSubscribeCode();
                            if (subscribeCode3 != null) {
                                Activity activity = activityLIZ2;
                                int iIntValue = subscribeCode3.intValue();
                                C0TOS.LIZ.getClass();
                                C1397580mTM c1397580mTM = new C1397580mTM(activity);
                                if (iIntValue == 2) {
                                    c1397580mTM.LIZIZ(activity.getString(2131821929));
                                    C985403tE.LIZ(c1397580mTM, new AwS591S0100000_12(activity, 945));
                                } else if (iIntValue == 4) {
                                    c1397580mTM.LIZIZ(activity.getString(2131821931));
                                    C985403tE.LIZ(c1397580mTM, new AwS591S0100000_12(activity, 946));
                                }
                                c1397580mTM.LJII = true;
                                new C1397510mTF(c1397580mTM).LJ();
                                C2344009Gk c2344009Gk2 = new C2344009Gk();
                                if (iIntValue == 2) {
                                    i2 = 0;
                                }
                                c2344009Gk2.LIZJ(i2, "error_type");
                                c2344009Gk2.LJ(C0TOS.LJ, "product_line");
                                C20684815ws.LJIILLIIL("show_payment_error_prompt", c2344009Gk2.LIZ);
                            }
                            c0tgr.onFail();
                            return;
                        }
                        Integer subscribeCode4 = subscribeResponse.getSubscribeCode();
                        if (subscribeCode4 != null && subscribeCode4.intValue() == 3) {
                            C0TOS c0tos2 = C0TOS.LIZ;
                            Activity activity2 = activityLIZ2;
                            Integer errorCode = subscribeResponse.getErrorCode();
                            c0tos2.getClass();
                            C0TOS.LJII(activity2, errorCode, 2, null);
                            c0tgr.onFail();
                            return;
                        }
                        Integer subscribeCode5 = subscribeResponse.getSubscribeCode();
                        if (subscribeCode5 != null && subscribeCode5.intValue() == 1 && subscribeResponse.getContent() != null) {
                            C0TOS c0tos3 = C0TOS.LIZ;
                            final Activity activity3 = activityLIZ2;
                            String content = subscribeResponse.getContent();
                            final Integer num5 = num;
                            final Boolean bool2 = bool;
                            final AwS110S0400000_12 awS110S0400000_12 = new AwS110S0400000_12(activityLIZ2, subscribeResponse, c0tgr, subscriptionVM, 0);
                            c0tos3.getClass();
                            if (content != null) {
                                InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C0TOS.LIZIZ.getValue();
                                HashMap map = new HashMap();
                                map.put("biz_scenario", "ttplus");
                                interfaceC1791930wjP.LIZIZ(activity3, new C1789970wgF(content, map), new InterfaceC518120KTq(activity3, num5, bool2, awS110S0400000_12) { // from class: X.0TP2
                                    public final /* synthetic */ Activity LIZ;
                                    public final /* synthetic */ Function1<C0KPG, Unit> LIZIZ;

                                    @Override // X.InterfaceC518120KTq
                                    public final void LIZ(C0KPG c0kpg) {
                                        Integer numValueOf;
                                        String str4;
                                        Integer numValueOf2;
                                        Integer numValueOf3;
                                        EnumC1792020wjY enumC1792020wjY;
                                        C518080KTm c518080KTm = c0kpg.LJ;
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("onPurchaseFinish result: ");
                                        Integer numValueOf4 = null;
                                        if (c518080KTm != null) {
                                            numValueOf = Integer.valueOf(c518080KTm.LIZIZ);
                                        } else {
                                            numValueOf = null;
                                        }
                                        sbLIZ.append(numValueOf);
                                        sbLIZ.append(" errorMsg: ");
                                        if (c518080KTm != null) {
                                            str4 = c518080KTm.LJFF;
                                        } else {
                                            str4 = null;
                                        }
                                        sbLIZ.append(str4);
                                        sbLIZ.append(" detailCode: ");
                                        if (c518080KTm != null) {
                                            numValueOf2 = Integer.valueOf(c518080KTm.LIZJ);
                                        } else {
                                            numValueOf2 = null;
                                        }
                                        sbLIZ.append(numValueOf2);
                                        sbLIZ.append("  status: ");
                                        if (c518080KTm != null) {
                                            numValueOf3 = Integer.valueOf(c518080KTm.LIZ);
                                        } else {
                                            numValueOf3 = null;
                                        }
                                        sbLIZ.append(numValueOf3);
                                        C1022620cia.LIZ("SubscriptionUtils", C2188811AlT.LIZIZ(sbLIZ));
                                        if (C0KQC.LIZ[c0kpg.LIZ.ordinal()] == 1) {
                                            C2344009Gk c2344009Gk3 = new C2344009Gk();
                                            c2344009Gk3.LIZJ(1, "scenario");
                                            c2344009Gk3.LJ(Boolean.TRUE, "is_success");
                                            c2344009Gk3.LJ(C0TOS.LJ, "product_line");
                                            C20684815ws.LJIILLIIL("ttplus_user_IAP_callback", c2344009Gk3.LIZ);
                                        } else {
                                            if (c518080KTm != null) {
                                                C0TOS c0tos4 = C0TOS.LIZ;
                                                Activity activity4 = this.LIZ;
                                                c0tos4.getClass();
                                                int i3 = c518080KTm.LIZIZ;
                                                if (i3 != 301) {
                                                    if (i3 != 302) {
                                                        switch (i3) {
                                                            case 201:
                                                            case 202:
                                                            case 207:
                                                            case 209:
                                                            case 210:
                                                                C0TOS.LIZ(activity4, 2131829404, Integer.valueOf(i3));
                                                                break;
                                                            case 203:
                                                                C0TOS.LIZ(activity4, 2131829403, Integer.valueOf(i3));
                                                                break;
                                                            case 204:
                                                                C0TOS.LIZ(activity4, 2131829407, Integer.valueOf(i3));
                                                                break;
                                                            case 205:
                                                                C0TOS.LIZ(activity4, 2131829406, Integer.valueOf(i3));
                                                                break;
                                                            case 206:
                                                                C0TOS.LIZ(activity4, 2131829408, Integer.valueOf(i3));
                                                                break;
                                                            case 208:
                                                                C0TOS.LIZ(activity4, 2131829410, Integer.valueOf(i3));
                                                                break;
                                                            default:
                                                                C0TOS.LIZ(activity4, 2131829404, Integer.valueOf(i3));
                                                                break;
                                                        }
                                                    } else {
                                                        C0TOS.LIZ(activity4, 2131829401, Integer.valueOf(i3));
                                                    }
                                                } else if (c518080KTm.LIZJ == -2) {
                                                    C0TOS.LIZ(activity4, 2131843198, Integer.valueOf(i3));
                                                } else {
                                                    C0TOS.LIZ(activity4, 2131829400, Integer.valueOf(i3));
                                                }
                                                C2344009Gk c2344009Gk4 = new C2344009Gk();
                                                c2344009Gk4.LIZJ(3, "error_type");
                                                c2344009Gk4.LJ(C0TOS.LJ, "product_line");
                                                C20684815ws.LJIILLIIL("show_payment_error_prompt", c2344009Gk4.LIZ);
                                            }
                                            C2344009Gk c2344009Gk5 = new C2344009Gk();
                                            C0KQW c0kqw = c0kpg.LIZLLL;
                                            if (c0kqw != null && (enumC1792020wjY = c0kqw.LIZ) != null) {
                                                numValueOf4 = Integer.valueOf(enumC1792020wjY.getValue());
                                            }
                                            c2344009Gk5.LJ(numValueOf4, "iap_error_code");
                                            c2344009Gk5.LIZJ(1, "scenario");
                                            c2344009Gk5.LJ(Boolean.FALSE, "is_success");
                                            c2344009Gk5.LJ(C0TOS.LJ, "product_line");
                                            C20684815ws.LJIILLIIL("ttplus_user_IAP_callback", c2344009Gk5.LIZ);
                                        }
                                        this.LIZIZ.invoke(c0kpg);
                                    }

                                    {
                                        this.LIZIZ = awS110S0400000_12;
                                    }
                                });
                                C2344009Gk c2344009Gk3 = new C2344009Gk();
                                if (num5 == null || num5.intValue() != 2 || !Intrinsics.LJFF(bool2, Boolean.TRUE)) {
                                    num4 = num5;
                                }
                                c2344009Gk3.LJ(num4, "prompt_type");
                                c2344009Gk3.LJ(C0TOS.LJ, "product_line");
                                C20684815ws.LJIILLIIL("tt_plus_user_start_payment", c2344009Gk3.LIZ);
                                return;
                            }
                            return;
                        }
                        C0TOS c0tos4 = C0TOS.LIZ;
                        Activity activity4 = activityLIZ2;
                        Integer subscribeCode6 = subscribeResponse.getSubscribeCode();
                        c0tos4.getClass();
                        C0TOS.LIZ(activity4, 2131829405, subscribeCode6);
                        c0tgr.onFail();
                    }
                };
                try {
                    subscriptionVM.LL.subscribe(str2, num, str3, str).enqueue(new C786260Usq(interfaceC746140TOq, 13));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    interfaceC746140TOq.onFail();
                }
            } else {
                return;
            }
        } else if (subscriptionVM == null) {
            return;
        }
        subscriptionVM.BQ2(num, "2");
    }
}
