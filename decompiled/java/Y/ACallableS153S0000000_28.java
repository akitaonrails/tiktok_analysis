package Y;

import X.AbstractC2126608Uu;
import X.C19274810aw;
import X.C1C7U;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.promote.PromoteProgramResponse;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes29.dex */
public class ACallableS153S0000000_28 implements Callable {
    public final int $t;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            default:
                return null;
        }
    }

    public ACallableS153S0000000_28(int i) {
        this.$t = i;
    }

    public static final Object call$0(ACallableS153S0000000_28 aCallableS153S0000000_28) {
        C1C7U.LIZ("FetchPushOffReasonsPresenter@491b.bindModel$1$sendRequest$1");
        BaseResponse baseResponseLJIIIIZZ = PushSettingsApiManager.LJIIIIZZ();
        C1C7U.LIZIZ("FetchPushOffReasonsPresenter@491b.bindModel$1$sendRequest$1");
        return baseResponseLJIIIIZZ;
    }

    public static final Object call$1(ACallableS153S0000000_28 aCallableS153S0000000_28) {
        C1C7U.LIZ("PushSettingFetchPresenter@d1d9.bindModel$1$sendRequest$1");
        PushSettings pushSettingsLJI = PushSettingsApiManager.LJI();
        C1C7U.LIZIZ("PushSettingFetchPresenter@d1d9.bindModel$1$sendRequest$1");
        return pushSettingsLJI;
    }

    public static final Object call$2(ACallableS153S0000000_28 aCallableS153S0000000_28) throws InterruptedException {
        C1C7U.LIZ("PromoteProgramRequestApiManager@866e.confirmPromoteProgram$1");
        try {
            PromoteProgramResponse promoteProgramResponse = C19274810aw.LIZ.LIZ("1").get();
            C1C7U.LIZIZ("PromoteProgramRequestApiManager@866e.confirmPromoteProgram$1");
            return promoteProgramResponse;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static final Object call$3(ACallableS153S0000000_28 aCallableS153S0000000_28) throws InterruptedException {
        C1C7U.LIZ("PromoteProgramRequestApiManager@866e.cancelPromoteProgram$1");
        try {
            BaseResponse baseResponse = C19274810aw.LIZ.LIZIZ().get();
            C1C7U.LIZIZ("PromoteProgramRequestApiManager@866e.cancelPromoteProgram$1");
            return baseResponse;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }
}
