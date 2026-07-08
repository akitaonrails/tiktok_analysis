package Y;

import X.C09JN;
import X.C1720106oR;
import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;

/* JADX INFO: loaded from: classes20.dex */
public class AfS140S0000000_19 implements C09JN {
    public final int $t;

    @Override // X.C09JN
    public final void accept(Object obj) {
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
        }
    }

    public AfS140S0000000_19(int i) {
        this.$t = i;
    }

    public static final void accept$0(AfS140S0000000_19 afS140S0000000_19, Object obj) {
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        C1C7U.LIZ("I18nSettingManageMyAccountActivity@7df8.getRegionStatus$2L");
        C1C7U.LIZIZ("I18nSettingManageMyAccountActivity@7df8.getRegionStatus$2L");
    }

    public static final /* bridge */ /* synthetic */ void accept$1(AfS140S0000000_19 afS140S0000000_19, Object obj) {
        C1C7U.LIZ("CommercePromoteService@6ab5.reportBannerAction$2");
        C1C7U.LIZIZ("CommercePromoteService@6ab5.reportBannerAction$2");
    }

    public static final /* bridge */ /* synthetic */ void accept$2(AfS140S0000000_19 afS140S0000000_19, Object obj) {
        C1C7U.LIZ("CommercePromoteService@6ab5.reportBannerAction$3");
        C1C7U.LIZIZ("CommercePromoteService@6ab5.reportBannerAction$3");
    }

    public static final void accept$3(AfS140S0000000_19 afS140S0000000_19, Object obj) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("AwemeModel", "requestStoryAPI success");
    }

    public static final void accept$4(AfS140S0000000_19 afS140S0000000_19, Object obj) {
        Throwable th = (Throwable) obj;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestStoryAPI error, msg: ");
        sbLIZ.append(th.getMessage());
        sbLIZ.append(" cause: ");
        sbLIZ.append(th.getCause());
        C1720106oR.LIZ("AwemeModel", C2188811AlT.LIZIZ(sbLIZ));
    }
}
