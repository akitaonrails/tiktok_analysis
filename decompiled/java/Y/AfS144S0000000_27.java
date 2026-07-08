package Y;

import X.C09JN;
import X.C1C7U;
import X.InterfaceC1106030et7;
import com.ss.android.ugc.aweme.compliance.protection.serviceimpl.FamilyPairingServiceImpl;
import tikcast.api.wallet.tiktok.ProfileBannerStatusResult;

/* JADX INFO: loaded from: classes28.dex */
public class AfS144S0000000_27 implements C09JN {
    public final int $t;

    public static final void accept$4(AfS144S0000000_27 afS144S0000000_27, Object obj) {
    }

    @Override // X.C09JN
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
        }
    }

    public AfS144S0000000_27(int i) {
        this.$t = i;
    }

    public AfS144S0000000_27(FamilyPairingServiceImpl familyPairingServiceImpl, int i) {
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ void accept$0(AfS144S0000000_27 afS144S0000000_27, Object obj) {
        C1C7U.LIZ("FamilyPairingServiceImpl@16fd.dismissEngagementCountEntrance$1");
        C1C7U.LIZIZ("FamilyPairingServiceImpl@16fd.dismissEngagementCountEntrance$1");
    }

    public static final /* bridge */ /* synthetic */ void accept$1(AfS144S0000000_27 afS144S0000000_27, Object obj) {
        C1C7U.LIZ("FamilyPairingServiceImpl@16fd.dismissEngagementCountEntrance$2");
        C1C7U.LIZIZ("FamilyPairingServiceImpl@16fd.dismissEngagementCountEntrance$2");
    }

    public static final /* bridge */ /* synthetic */ void accept$2(AfS144S0000000_27 afS144S0000000_27, Object obj) {
        C1C7U.LIZ("FamilyPairingServiceImpl@16fd.requestEngagementCount$1");
        C1C7U.LIZIZ("FamilyPairingServiceImpl@16fd.requestEngagementCount$1");
    }

    public static final /* bridge */ /* synthetic */ void accept$3(AfS144S0000000_27 afS144S0000000_27, Object obj) {
        C1C7U.LIZ("FamilyPairingServiceImpl@16fd.requestEngagementCount$2");
        C1C7U.LIZIZ("FamilyPairingServiceImpl@16fd.requestEngagementCount$2");
    }

    public static final void accept$5(AfS144S0000000_27 afS144S0000000_27, Object obj) {
        C1C7U.LIZ("WalletService@76b8.queryShouldShowWebappProfileBanner$1L");
        ProfileBannerStatusResult.ProfileBannerStatusResultData profileBannerStatusResultData = ((ProfileBannerStatusResult) obj).data;
        if (profileBannerStatusResultData != null) {
            InterfaceC1106030et7.Z5.LIZJ(Boolean.valueOf(profileBannerStatusResultData.shouldShow));
        }
        C1C7U.LIZIZ("WalletService@76b8.queryShouldShowWebappProfileBanner$1L");
    }
}
