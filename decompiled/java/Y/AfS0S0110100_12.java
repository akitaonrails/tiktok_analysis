package Y;

import X.C09JN;
import X.C0UFI;
import X.C1136380fg4;
import X.C1138230fj3;
import X.C1C7U;
import X.C2188811AlT;
import X.C473410IhP;
import X.C786410Ut5;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.android.live.network.response.BaseResponse;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AfS0S0110100_12 implements C09JN {
    public final int $t;
    public long j2;
    public Object l0;
    public boolean z1;

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

    public static final void accept$0(AfS0S0110100_12 afS0S0110100_12, Object obj) {
        C1C7U.LIZ("LiveGoalEffectHelper@76ee.getGoalApi$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        ((Function1) afS0S0110100_12.l0).invoke(baseResponse);
        long jUptimeMillis = SystemClock.uptimeMillis() - afS0S0110100_12.j2;
        C0UFI c0ufi = C0UFI.LIZ;
        C0UFI.LJIILJJIL(jUptimeMillis, Boolean.valueOf(afS0S0110100_12.z1), Integer.valueOf(baseResponse.statusCode), baseResponse.LIZIZ);
        C1C7U.LIZIZ("LiveGoalEffectHelper@76ee.getGoalApi$1");
    }

    public static final void accept$1(AfS0S0110100_12 afS0S0110100_12, Object obj) {
        long jLongValue;
        C1C7U.LIZ("CrossScreenRenderHelper@8565.interceptReactionIM$1");
        C1136380fg4.LIZJ.add(Long.valueOf(afS0S0110100_12.j2));
        ((Runnable) afS0S0110100_12.l0).run();
        if (afS0S0110100_12.z1) {
            Long l = (Long) ((ConcurrentHashMap) C1136380fg4.LJFF).get(Long.valueOf(afS0S0110100_12.j2));
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Running Multiple batch gifts ");
            sbLIZ.append(jLongValue);
            C1138230fj3.LIZ("CROSS_SEI", C2188811AlT.LIZIZ(sbLIZ));
            for (long j = 0; j < jLongValue; j++) {
                ((Runnable) afS0S0110100_12.l0).run();
            }
        }
        Handler handlerLIZ = C473410IhP.LIZ();
        final long j2 = afS0S0110100_12.j2;
        final boolean z = afS0S0110100_12.z1;
        C786410Ut5.LJJZZIII(handlerLIZ, new Runnable() { // from class: X.0T3o
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CrossScreenRenderHelper@8565.interceptReactionIM$1$1");
                try {
                    ((ConcurrentHashMap) C1136380fg4.LIZLLL).remove(Long.valueOf(j2));
                    if (z) {
                        ((ConcurrentHashMap) C1136380fg4.LJFF).remove(Long.valueOf(j2));
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CrossScreenRenderHelper@8565.interceptReactionIM$1$1");
            }
        });
        C1C7U.LIZIZ("CrossScreenRenderHelper@8565.interceptReactionIM$1");
    }

    public AfS0S0110100_12(long j, Object obj, boolean z, int i) {
        this.$t = i;
        this.j2 = j;
        this.l0 = obj;
        this.z1 = z;
    }
}
