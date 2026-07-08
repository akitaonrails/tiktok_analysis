package Y;

import X.C09JN;
import X.C0K6D;
import X.C1C7U;
import X.C2097608Jq;
import X.EnumC499440JiI;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
public class AfS0S2300100_7 implements C09JN {
    public final int $t;
    public long j5;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // X.C09JN
    public final void accept(T t) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, t);
                break;
            case 1:
                accept$1(this, t);
                break;
        }
    }

    public static final void accept$0(AfS0S2300100_7 afS0S2300100_7, Object obj) throws JSONException {
        C1C7U.LIZ("PgcMonitorAdaptersKt@8c2c.monitorMetricsForApiObservable$1$1");
        if (((AtomicBoolean) afS0S2300100_7.l2).compareAndSet(false, true)) {
            C0K6D.LIZ((EnumC499440JiI) afS0S2300100_7.l3, afS0S2300100_7.s0, SystemClock.elapsedRealtime() - afS0S2300100_7.j5, afS0S2300100_7.s1, (Map) afS0S2300100_7.l4, false);
        }
        C1C7U.LIZIZ("PgcMonitorAdaptersKt@8c2c.monitorMetricsForApiObservable$1$1");
    }

    public static final void accept$1(AfS0S2300100_7 afS0S2300100_7, Object obj) throws JSONException {
        C1C7U.LIZ("PgcMonitorAdaptersKt@8c2c.monitorMetricsForApiObservable$1$3");
        Throwable th = (Throwable) obj;
        if (((AtomicBoolean) afS0S2300100_7.l2).compareAndSet(false, true)) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - afS0S2300100_7.j5;
            EnumC499440JiI enumC499440JiI = (EnumC499440JiI) afS0S2300100_7.l3;
            String str = afS0S2300100_7.s0;
            String str2 = afS0S2300100_7.s1;
            Map map = (Map) afS0S2300100_7.l4;
            C0K6D.LIZ.getClass();
            Map mapLJIIL = C2097608Jq.LJIIL(C0K6D.LIZIZ(enumC499440JiI, str, str2, map), C2097608Jq.LJIIIIZZ(new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "fail"), new Pair("duration", Long.valueOf(jElapsedRealtime))));
            C0K6D.LJFF(jElapsedRealtime, mapLJIIL);
            C0K6D.LIZLLL(th, mapLJIIL);
        }
        C1C7U.LIZIZ("PgcMonitorAdaptersKt@8c2c.monitorMetricsForApiObservable$1$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0007: IPUT (r5 I:java.lang.Object), (r0 I:Y.AfS0S2300100_7) (LINE:117440519) Y.AfS0S2300100_7.l3 java.lang.Object, block:B:2:0x0000 */
    public AfS0S2300100_7(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, long j, EnumC499440JiI enumC499440JiI, String str, String str2, Map<String, String> map) {
        Object obj;
        this.$t = map;
        this.l2 = atomicBoolean;
        this.j5 = atomicBoolean2;
        this.l3 = obj;
        this.s0 = enumC499440JiI;
        this.s1 = str;
        this.l4 = str2;
    }
}
