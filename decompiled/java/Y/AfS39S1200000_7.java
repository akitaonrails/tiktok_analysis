package Y;

import X.C09JN;
import X.C0KM7;
import X.C0W0R;
import X.C189200o6;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C501540Jlg;
import X.C512300K7g;
import X.C516010KLn;
import X.C517690KRz;
import X.InterfaceC1364105Vn;
import com.bytedance.android.live.network.response.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.room.StrategyCheckData;
import webcast.api.room.StrategyData;

/* JADX INFO: loaded from: classes8.dex */
public class AfS39S1200000_7 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final void accept$0(AfS39S1200000_7 afS39S1200000_7, Object obj) {
        C1C7U.LIZ("FansResubscribeStrategy@14ed.tryRecoverContract$response$1$result$2");
        Throwable th = (Throwable) obj;
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS39S1200000_7.l1;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
        C501540Jlg.LIZJ(((C517690KRz) afS39S1200000_7.l2).LIZJ, th);
        C0KM7 c0km7LIZ = C0W0R.LIZ(((C517690KRz) afS39S1200000_7.l2).LIZJ);
        C516010KLn c516010KLn = C516010KLn.LIZ;
        String str = afS39S1200000_7.s0;
        c516010KLn.getClass();
        C516010KLn.LJIILIIL(true, "", "recover_sub", str, c0km7LIZ, null);
        c516010KLn.LJIIJJI(true, System.currentTimeMillis(), C512300K7g.LIZIZ(th), "recover_sub", afS39S1200000_7.s0, c0km7LIZ, 0, C512300K7g.LIZJ(th), th, null);
        C1C7U.LIZIZ("FansResubscribeStrategy@14ed.tryRecoverContract$response$1$result$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS39S1200000_7 afS39S1200000_7, Object obj) {
        long j;
        String str;
        C1C7U.LIZ("LiveRepostManager@c2f7.requestStrategyCheck$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        StrategyCheckData strategyCheckData = (StrategyCheckData) baseResponse.data;
        if (strategyCheckData != null) {
            j = strategyCheckData.decision;
            if (j == 1) {
                ((Function1) afS39S1200000_7.l1).invoke((StrategyData) afS39S1200000_7.l2);
            }
            C1C7U.LIZIZ("LiveRepostManager@c2f7.requestStrategyCheck$1");
        }
        j = 0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("strategyCheck deny actionType=");
        sbLIZ.append(afS39S1200000_7.s0);
        sbLIZ.append(" decision=");
        sbLIZ.append(j);
        sbLIZ.append(" detail=");
        StrategyCheckData strategyCheckData2 = (StrategyCheckData) baseResponse.data;
        if (strategyCheckData2 != null) {
            str = strategyCheckData2.detail;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C20441214yg.LIZIZ("LiveRepostManager", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("LiveRepostManager@c2f7.requestStrategyCheck$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS39S1200000_7(Object obj, Function1<? super StrategyData, Unit> function1, StrategyData strategyData, String str) {
        this.$t = str;
        this.l1 = obj;
        this.l2 = function1;
        this.s0 = strategyData;
    }
}
