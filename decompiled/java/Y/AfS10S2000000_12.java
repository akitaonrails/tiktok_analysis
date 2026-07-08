package Y;

import X.C09JN;
import X.C0U53;
import X.C158B;
import X.C1804180x3A;
import X.C1C7U;
import X.C20441214yg;
import X.C750340Tc0;
import X.C784440Upu;
import X.C974210bSV;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.data.model.wallet.RechargeCancelFrequency;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.RechargeRetentionPopupConfig;

/* JADX INFO: loaded from: classes13.dex */
public class AfS10S2000000_12 implements C09JN {
    public final int $t;
    public String s0;
    public String s1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS10S2000000_12 afS10S2000000_12, Object obj) {
        C1C7U.LIZ("CohostRemindReservationUtil@5708.remindReservationCheckpoint$1");
        if (afS10S2000000_12.s0.equals("true")) {
            C20441214yg.LJIIIZ("CohostRemindReservationUtil", "remindReservationCheckpoint openCohostDialog");
            String str = afS10S2000000_12.s1;
            C974210bSV c974210bSV = new C974210bSV("start_co_host", null);
            c974210bSV.LJFF = str;
            C784440Upu.LIZ().LIZIZ(c974210bSV);
        }
        C1C7U.LIZIZ("CohostRemindReservationUtil@5708.remindReservationCheckpoint$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS10S2000000_12 afS10S2000000_12, Object obj) {
        RechargeRetentionPopupConfig rechargeRetentionPopupConfig;
        C1C7U.LIZ("RechargeCancelRetentionSettingHandler@a1e2.handleAPICall$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (Intrinsics.LJFF(afS10S2000000_12.s0, "recharge_cancel_retention_dialog")) {
            T t = baseResponse.data;
            if (t != 0 && ((RechargeCancelFrequency) t).getRechargeRetentionConfig().containsKey(afS10S2000000_12.s0) && (rechargeRetentionPopupConfig = ((RechargeCancelFrequency) baseResponse.data).getRechargeRetentionConfig().get(afS10S2000000_12.s0)) != null && rechargeRetentionPopupConfig.eventInfo != null) {
                C750340Tc0.LIZJ(rechargeRetentionPopupConfig);
            }
        } else if (Intrinsics.LJFF(afS10S2000000_12.s0, "recharge_v3_retention_dialog") && Intrinsics.LJFF(afS10S2000000_12.s1, "show") && C1804180x3A.LIZIZ()) {
            C0U53.Ud.LIZJ(Long.valueOf(C158B.LIZ()));
        }
        C1C7U.LIZIZ("RechargeCancelRetentionSettingHandler@a1e2.handleAPICall$2");
    }

    public AfS10S2000000_12(String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
