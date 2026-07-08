package Y;

import com.bytedance.android.live.wallet.data.api.IWalletApi;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletApiTrackingSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public class AObjectS25S2100000_27 implements Function0 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS25S2100000_27 aObjectS25S2100000_27) {
        if (LiveWalletApiTrackingSetting.INSTANCE.getValue()) {
            return ((IWalletApi) aObjectS25S2100000_27.l2).getExchangeInfoWithHeader(aObjectS25S2100000_27.s0, aObjectS25S2100000_27.s1);
        }
        return ((IWalletApi) aObjectS25S2100000_27.l2).getExchangeInfo();
    }

    public static final Object invoke$1(AObjectS25S2100000_27 aObjectS25S2100000_27) {
        if (LiveWalletApiTrackingSetting.INSTANCE.getValue()) {
            return ((IWalletApi) aObjectS25S2100000_27.l2).getUGBalanceInfoWithHeader(aObjectS25S2100000_27.s0, aObjectS25S2100000_27.s1, 1);
        }
        return ((IWalletApi) aObjectS25S2100000_27.l2).getUGBalanceInfo(1);
    }

    public AObjectS25S2100000_27(IWalletApi iWalletApi, String str, String str2, int i) {
        this.$t = i;
        this.l2 = iWalletApi;
        this.s0 = str;
        this.s1 = str2;
    }
}
