package Y;

import X.C098200Yq;
import X.C0NB9;
import X.C13WZ;
import X.C189200o6;
import X.C1C7U;
import X.C1EE1;
import X.C20684815ws;
import X.C793770VBv;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS15S0100100_9 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        AtomicLong atomicLong = C0NB9.LIZ;
        long j = this.j1;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.l0;
        try {
            Function0<Unit> function0Remove = C0NB9.LIZIZ.remove(Long.valueOf(j));
            if (function0Remove != null) {
                scheduledFuture.cancel(false);
                function0Remove.invoke();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void run$0(ARunnableS15S0100100_9 aRunnableS15S0100100_9) {
        boolean zLIZ;
        C1C7U.LIZ("MobClickDispatcher@e8a9.dispatchWithTimeout$1");
        try {
            aRunnableS15S0100100_9.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MobClickDispatcher@e8a9.dispatchWithTimeout$1");
    }

    public static final void run$1(ARunnableS15S0100100_9 aRunnableS15S0100100_9) {
        C13WZ c13wz = (C13WZ) aRunnableS15S0100100_9.l0;
        long j = aRunnableS15S0100100_9.j1;
        c13wz.getClass();
        C1C7U.LIZ("ColdBootFullLogger@bb73.reportComponent$1L");
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("duration", j);
            c13wz.LJIIJ(jSONObject2);
            jSONObject.put("metric", jSONObject2);
            AppLogNewUtils.onEventV3("full_first_show_event_component", jSONObject2);
            C793770VBv.LJFF("full_first_show_event_component", null, jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1C7U.LIZIZ("ColdBootFullLogger@bb73.reportComponent$1L");
    }

    public static final void run$2(ARunnableS15S0100100_9 aRunnableS15S0100100_9) {
        FeedFragment feedFragment = (FeedFragment) aRunnableS15S0100100_9.l0;
        long j = aRunnableS15S0100100_9.j1;
        feedFragment.getClass();
        C1C7U.LIZ("FeedFragment@bc83.stopCalTimeFix$1L");
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName("stay_time");
        mobClickObtain.setLabelName(feedFragment.LLILLJJLI);
        mobClickObtain.setExtValueLong(j);
        try {
            mobClickObtain.setJsonObject(new JSONObject().put("if_default", C1EE1.LIZIZ.LJJIII()));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C20684815ws.onEvent(mobClickObtain);
        feedFragment.OR();
        feedFragment.PR(j);
        C1C7U.LIZIZ("FeedFragment@bc83.stopCalTimeFix$1L");
    }

    public static final void run$3(ARunnableS15S0100100_9 aRunnableS15S0100100_9) {
        FeedFragment feedFragment = (FeedFragment) aRunnableS15S0100100_9.l0;
        long j = aRunnableS15S0100100_9.j1;
        feedFragment.getClass();
        C1C7U.LIZ("FeedFragment@bc83.stopCalTime$1L");
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName("stay_time");
        mobClickObtain.setLabelName(feedFragment.LLILLJJLI);
        mobClickObtain.setExtValueLong(j);
        try {
            mobClickObtain.setJsonObject(new JSONObject().put("if_default", C1EE1.LIZIZ.LJJIII()));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C20684815ws.onEvent(mobClickObtain);
        feedFragment.OR();
        feedFragment.PR(j);
        C1C7U.LIZIZ("FeedFragment@bc83.stopCalTime$1L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0003: IPUT (r2 I:long), (r0 I:Y.ARunnableS15S0100100_9) (LINE:50331651) Y.ARunnableS15S0100100_9.j1 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: IPUT (r4 I:java.lang.Object), (r0 I:Y.ARunnableS15S0100100_9) (LINE:50331653) Y.ARunnableS15S0100100_9.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r1v0, types: [Y.ARunnableS15S0100100_9, java.lang.Object] */
    public ARunnableS15S0100100_9(long j, long j2, ScheduledFuture<?> scheduledFuture) {
        long j3;
        Object obj;
        obj.$t = scheduledFuture;
        obj.j1 = j3;
        obj.l0 = obj;
        ?? obj2 = new Object();
    }
}
