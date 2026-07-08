package Y;

import X.C09JN;
import X.C1C7U;
import X.C484570IzP;
import X.C484580IzQ;
import com.bytedance.android.live.network.response.BaseResponse;
import kotlin.jvm.functions.Function1;
import webcast.api.room.StrategyCheckData;

/* JADX INFO: loaded from: classes8.dex */
public class AfS1S0201100_7 implements C09JN {
    public final int $t;
    public int i2;
    public long j3;
    public Object l0;
    public Object l1;

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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS1S0201100_7 afS1S0201100_7, Object obj) {
        Long lValueOf;
        C1C7U.LIZ("FollowGuideFilter@ba9e.serverFilter$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        C484570IzP c484570IzP = (C484570IzP) afS1S0201100_7.l0;
        long j = afS1S0201100_7.j3;
        int i = afS1S0201100_7.i2;
        StrategyCheckData strategyCheckData = (StrategyCheckData) baseResponse.data;
        if (strategyCheckData != null) {
            lValueOf = Long.valueOf(strategyCheckData.decision);
        } else {
            lValueOf = null;
        }
        c484570IzP.LIZJ(i, j, lValueOf);
        StrategyCheckData strategyCheckData2 = (StrategyCheckData) baseResponse.data;
        if (strategyCheckData2 != null) {
            Function1 function1 = (Function1) afS1S0201100_7.l1;
            if (strategyCheckData2.decision == 1) {
                function1.invoke(baseResponse);
            }
        }
        C1C7U.LIZIZ("FollowGuideFilter@ba9e.serverFilter$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS1S0201100_7 afS1S0201100_7, Object obj) {
        Long lValueOf;
        C1C7U.LIZ("ToolbarTipsFilter@552f.serverFilter$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        C484580IzQ c484580IzQ = (C484580IzQ) afS1S0201100_7.l0;
        long j = afS1S0201100_7.j3;
        int i = afS1S0201100_7.i2;
        StrategyCheckData strategyCheckData = (StrategyCheckData) baseResponse.data;
        if (strategyCheckData != null) {
            lValueOf = Long.valueOf(strategyCheckData.decision);
        } else {
            lValueOf = null;
        }
        c484580IzQ.LIZJ(i, j, lValueOf);
        StrategyCheckData strategyCheckData2 = (StrategyCheckData) baseResponse.data;
        if (strategyCheckData2 != null) {
            Function1 function1 = (Function1) afS1S0201100_7.l1;
            if (strategyCheckData2.decision == 1) {
                function1.invoke(baseResponse);
            }
        }
        C1C7U.LIZIZ("ToolbarTipsFilter@552f.serverFilter$2");
    }

    public AfS1S0201100_7(Object obj, long j, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.j3 = j;
        this.i2 = i;
        this.l1 = obj2;
    }
}
