package Y;

import X.AbstractC2126608Uu;
import X.C09S2;
import X.C1C7U;
import X.C20684815ws;
import X.C2179771ASp;
import X.C2344009Gk;
import X.C624530OeZ;
import X.C637770Ozv;
import X.C844470XAv;
import X.InterfaceC2661011f;
import X.InterfaceC637720Ozq;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.duet.model.DuetDetailModel;
import com.ss.android.ugc.aweme.notification.followrequest.model.RejectResponse;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public class ACallableS24S1000000_9 implements Callable {
    public final int $t;
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

    public ACallableS24S1000000_9(int i) {
        this.$t = i;
        this.s0 = "video_play";
    }

    public static final Object call$0(ACallableS24S1000000_9 aCallableS24S1000000_9) {
        String str;
        C1C7U.LIZ("EarPhoneUnplugHelper@65ff.logEarPhoneStatus$1");
        C844470XAv.LIZ.getClass();
        if (C2179771ASp.LJIIJ(C844470XAv.LIZ())) {
            str = "on";
        } else {
            str = "off";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("plugin_type", aCallableS24S1000000_9.s0);
        c2344009Gk.LJIIIIZZ("to_status", str);
        C20684815ws.LJIILLIIL("earphone_status", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EarPhoneUnplugHelper@65ff.logEarPhoneStatus$1");
        return unit;
    }

    public static final Object call$1(ACallableS24S1000000_9 aCallableS24S1000000_9) throws InterruptedException {
        C1C7U.LIZ("FollowRequestApiManager@2cc9.rejectFollowRequest$1");
        try {
            RejectResponse rejectResponse = C624530OeZ.LIZ.rejectRequest(aCallableS24S1000000_9.s0).get();
            C1C7U.LIZIZ("FollowRequestApiManager@2cc9.rejectFollowRequest$1");
            return rejectResponse;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static final Object call$2(ACallableS24S1000000_9 aCallableS24S1000000_9) throws ExecutionException, InterruptedException {
        Object objCreate;
        C1C7U.LIZ("DuetDetailPresenter@80ea.fetchData$1");
        C637770Ozv c637770Ozv = C637770Ozv.LIZ;
        String str = aCallableS24S1000000_9.s0;
        c637770Ozv.getClass();
        InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(Api.LIZ);
        if (interfaceC2661011fLIZ != null) {
            objCreate = interfaceC2661011fLIZ.create(InterfaceC637720Ozq.class);
        } else {
            objCreate = null;
        }
        DuetDetailModel duetDetailModel = ((InterfaceC637720Ozq) objCreate).LIZIZ(str).get();
        C1C7U.LIZIZ("DuetDetailPresenter@80ea.fetchData$1");
        return duetDetailModel;
    }

    public ACallableS24S1000000_9(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
