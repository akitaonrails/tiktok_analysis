package Y;

import X.C1C7U;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes29.dex */
public class ACallableS1S1001000_28 implements Callable {
    public final int $t;
    public int i1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS1S1001000_28 aCallableS1S1001000_28) {
        C1C7U.LIZ("PushSettingChangePresenter@45.<init>$1$sendRequest$1");
        BaseResponse baseResponseLJIILL = PushSettingsApiManager.LJIILL(aCallableS1S1001000_28.i1, aCallableS1S1001000_28.s0);
        C1C7U.LIZIZ("PushSettingChangePresenter@45.<init>$1$sendRequest$1");
        return baseResponseLJIILL;
    }

    public static final Object call$1(ACallableS1S1001000_28 aCallableS1S1001000_28) {
        C1C7U.LIZ("PushSettingsLoginVM@db7f.requestUpdatePushSetting$1");
        BaseResponse baseResponseLJIILL = PushSettingsApiManager.LJIILL(aCallableS1S1001000_28.i1, aCallableS1S1001000_28.s0);
        C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestUpdatePushSetting$1");
        return baseResponseLJIILL;
    }

    public static final Object call$2(ACallableS1S1001000_28 aCallableS1S1001000_28) {
        C1C7U.LIZ("PushSettingsUnLoginVM@2a0b.requestUpdateSwitch$1");
        BaseResponse baseResponseLJIILLIIL = PushSettingsApiManager.LJIILLIIL(aCallableS1S1001000_28.i1, aCallableS1S1001000_28.s0);
        C1C7U.LIZIZ("PushSettingsUnLoginVM@2a0b.requestUpdateSwitch$1");
        return baseResponseLJIILLIIL;
    }

    public ACallableS1S1001000_28(String str, int i, int i2) {
        this.$t = i2;
        this.s0 = str;
        this.i1 = i;
    }
}
