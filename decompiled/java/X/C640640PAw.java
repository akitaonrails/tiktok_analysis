package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0PAw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.performance.metrics.lcp.SearchLcpLoadTimeTracker$onCompleteWithStatus$1", f = "SearchLcpLoadTimeTracker.kt", l = {568}, m = "invokeSuspend")
public final class C640640PAw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0P8S LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ List<Integer> LLILZIL;
    public final /* synthetic */ C0PG5 LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C640640PAw(C0P8S c0p8s, long j, boolean z, List<Integer> list, C0PG5 c0pg5, long j2, InterfaceC1364105Vn<? super C640640PAw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0p8s;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = list;
        this.LLILZLL = c0pg5;
        this.LLIZ = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C640640PAw(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchLcpLoadTimeTracker@b0f5.onCompleteWithStatus$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0P8S c0p8s = this.LLILLJJLI;
            long j = this.LLILLL;
            boolean z = this.LLILZ;
            List<Integer> list = this.LLILZIL;
            C0PG5 c0pg5 = this.LLILZLL;
            long j2 = this.LLIZ;
            c0p8s.getClass();
            long jLongValue = 0;
            if (j > 0 && z && !list.isEmpty()) {
                Iterator<Integer> it2 = list.iterator();
                while (it2.hasNext()) {
                    Long l = c0p8s.LJI.get(Integer.valueOf(it2.next().intValue()));
                    if (l != null && l.longValue() > jLongValue) {
                        jLongValue = l.longValue();
                    }
                }
                if (c0pg5 == C0PG5.TIMEOUT) {
                    jLongValue = j + j2;
                }
                jLongValue -= j;
            }
            try {
                C0P8S c0p8s2 = this.LLILLJJLI;
                c0p8s2.LIZLLL(jLongValue, this.LLILZLL, this.LLILZIL, c0p8s2.LIZJ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C640660PAy c640660PAy = new C640660PAy(this.LLILLJJLI, jLongValue, this.LLILZLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c640660PAy) == objLJFF) {
                C1C7U.LIZIZ("SearchLcpLoadTimeTracker@b0f5.onCompleteWithStatus$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchLcpLoadTimeTracker@b0f5.onCompleteWithStatus$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
