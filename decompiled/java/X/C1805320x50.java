package X;

import Y.AfS10S0100100_27;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.wallet.data.api.IWalletApi;
import com.bytedance.android.livesdk.livesetting.wallet.LiveEmailIncentiveSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.wallet.tiktok.CheckEmailNotificationEligibilityResult;

/* JADX INFO: renamed from: X.0x50, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1805320x50 implements InterfaceC1806200x6Q {
    public C11JF LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(2));

    @Override // X.InterfaceC1806200x6Q
    public void LIZIZ() {
    }

    @Override // X.InterfaceC1806200x6Q
    public boolean LIZJ(EnumC1805630x5V enumC1805630x5V) {
        return true;
    }

    @Override // X.InterfaceC1806200x6Q
    public void LIZLLL() {
    }

    public boolean LJ() {
        return ((Boolean) this.LIZIZ.getValue()).booleanValue() && !Intrinsics.LJFF(InterfaceC1106030et7.S5.LIZ(), Boolean.TRUE) && LiveEmailIncentiveSetting.INSTANCE.getValue().inExp;
    }

    @Override // X.InterfaceC1806200x6Q
    public void LIZ() {
        if (LJ()) {
            LJFF(false);
        }
    }

    public final void LJFF(final boolean z) {
        if (this.LIZ == null) {
            LiveEmailIncentiveSetting liveEmailIncentiveSetting = LiveEmailIncentiveSetting.INSTANCE;
            if (C158B.LIZJ() - C1805760x5i.LIZJ > liveEmailIncentiveSetting.getValue().apiCallCooldown) {
                final long jLIZ = C158B.LIZ();
                C480460Ism.LIZ().getClass();
                this.LIZ = (C11JF) ((IWalletApi) C480460Ism.LIZLLL(IWalletApi.class)).emailCampaignEligibility().LJIILIIL(new C0UO0()).LJLJI(liveEmailIncentiveSetting.getValue().apiTimeoutMillis, TimeUnit.MILLISECONDS).LJJLL(new C09JN() { // from class: X.0x52
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        boolean z2;
                        String str;
                        String str2;
                        C1C7U.LIZ("EmailIncentiveBalancePageStrategy@c920.callAPI$1");
                        BaseResponse baseResponse = (BaseResponse) obj;
                        CheckEmailNotificationEligibilityResult.Data data = (CheckEmailNotificationEligibilityResult.Data) baseResponse.data;
                        if (data != null && data.eligibility == 3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            InterfaceC1106030et7.S5.LIZJ(Boolean.TRUE);
                            C1805760x5i.LIZ = null;
                            C1805760x5i.LIZIZ = null;
                            C1805760x5i.LIZJ = 0L;
                        } else {
                            C1805760x5i.LIZ = Long.valueOf(UserService.getInstance().user().getCurrentUserId());
                            C1805760x5i.LIZIZ = data;
                            C1805760x5i.LIZJ = C158B.LIZJ();
                            if (!z) {
                                C1805760x5i.LIZJ = 0L;
                            }
                        }
                        C1806360x6g c1806360x6g = new C1806360x6g();
                        long j = jLIZ;
                        c1806360x6g.LIZ("status_code", String.valueOf(baseResponse.statusCode));
                        c1806360x6g.LIZ("duration", String.valueOf(C158B.LIZ() - j));
                        RequestError requestError = baseResponse.LJ;
                        if (requestError == null || (str = requestError.message) == null) {
                            str = "";
                        }
                        c1806360x6g.LIZ("error_message", str);
                        c1806360x6g.LIZ("log_id", baseResponse.LIZIZ);
                        CheckEmailNotificationEligibilityResult.Data data2 = (CheckEmailNotificationEligibilityResult.Data) baseResponse.data;
                        c1806360x6g.LIZ("eligibility", String.valueOf(data2.eligibility));
                        c1806360x6g.LIZ("expiry_date", String.valueOf(data2.expiryDate));
                        if (data2.emailConsentNeeded) {
                            str2 = "1";
                        } else {
                            str2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        c1806360x6g.LIZ("email_consent_needed", str2);
                        c1806360x6g.LIZ("registration_ab_test_group", String.valueOf(data2.registrationAbTestGroup));
                        c1806360x6g.LIZIZ();
                        this.LIZ = null;
                        C1C7U.LIZIZ("EmailIncentiveBalancePageStrategy@c920.callAPI$1");
                    }
                }, new AfS10S0100100_27(this, jLIZ, 0));
            }
        }
    }
}
