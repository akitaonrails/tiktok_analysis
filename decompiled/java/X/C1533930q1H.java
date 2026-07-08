package X;

import com.bytedance.forest.experiments.ForestExperiment;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q1H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533930q1H extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C1533900q1E LLILLJJLI;
    public final /* synthetic */ Function1<JSONObject, Unit> LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1533930q1H(boolean z, C1533900q1E c1533900q1E, Function1<? super JSONObject, Unit> function1, boolean z2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c1533900q1E;
        this.LLILLL = function1;
        this.LLILZ = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws JSONException {
        C1533790q13 c1533790q13;
        C1534360q1y<?> c1534360q1y;
        if (this.LL) {
            ConcurrentHashMap<String, C1533970q1L> concurrentHashMap = C1533900q1E.LJIJ;
            C1533900q1E c1533900q1E = this.LLILLJJLI;
            boolean z = this.LLILZ;
            for (Map.Entry<String, C1533970q1L> entry : concurrentHashMap.entrySet()) {
                C1533970q1L value = entry.getValue();
                if (Intrinsics.LJFF(value.LIZJ, c1533900q1E.LIZIZ)) {
                    C1533920q1G.LIZJ(null, value, c1533900q1E, true);
                    if (!c1533900q1E.LJIILL) {
                        if (value.LJII) {
                            value.LIZ();
                        } else {
                            if (!ForestExperiment.INSTANCE.getFetchIfDestroyed() && (c1533790q13 = value.LJ) != null && (c1534360q1y = c1533790q13.LJJIIJZLJL) != null) {
                                c1534360q1y.LIZIZ();
                            }
                            value.LIZ.LJIIIZ.LJ(value.LJI.getAndSet(0));
                        }
                    }
                    if (z) {
                        C1533940q1I.LIZJ().LIZ.remove(entry.getKey());
                    }
                }
            }
        }
        C1533900q1E c1533900q1E2 = this.LLILLJJLI;
        int i = c1533900q1E2.LJ;
        if (i != 0 || c1533900q1E2.LJFF != 0) {
            Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
            if (function2 != null) {
                JSONObject jSONObject = c1533900q1E2.LJIILJJIL;
                int i2 = c1533900q1E2.LJFF;
                jSONObject.put("fetch_count", i);
                jSONObject.put("successful_fetch_count", c1533900q1E2.LJIILIIL);
                jSONObject.put("prefetch_count", i2);
                jSONObject.put("hit_prefetch_count", c1533900q1E2.LJI);
                jSONObject.put("hit_reuse_count", c1533900q1E2.LJII);
                jSONObject.put("ssp_prefetch_count", c1533900q1E2.LJIIJ);
                jSONObject.put("ssp_prefetch_limited_count", 0);
                jSONObject.put("ssp_prefetch_recorded_count", c1533900q1E2.LJIIL);
                jSONObject.put("ssp_prefetch_released_count", c1533900q1E2.LJIIJJI);
                jSONObject.put("prefetch_recorded_count", c1533900q1E2.LJIIIIZZ);
                jSONObject.put("prefetch_limited_count", 0);
                jSONObject.put("prefetch_released_count", c1533900q1E2.LJIIIZ);
                jSONObject.put("identifier", c1533900q1E2.LIZIZ);
                Integer numValueOf = Integer.valueOf(c1533900q1E2.LJ);
                if (numValueOf.intValue() > 0) {
                    jSONObject.put("success_rate", ((double) c1533900q1E2.LJIILIIL) / ((double) numValueOf.intValue()));
                }
                if (i2 != 0) {
                    double d = i2;
                    jSONObject.put("hit_prefetch_rate", ((double) c1533900q1E2.LJI) / d);
                    jSONObject.put("hit_reuse_rate", ((double) c1533900q1E2.LJII) / d);
                    jSONObject.put("prefetch_accuracy", ((double) (c1533900q1E2.LJI + c1533900q1E2.LJIIIIZZ)) / d);
                    jSONObject.put("prefetch_released_rate", ((double) c1533900q1E2.LJIIIZ) / d);
                } else {
                    jSONObject.put("hit_prefetch_rate", 0);
                    jSONObject.put("hit_reuse_rate", 0);
                    jSONObject.put("prefetch_accuracy", 0);
                    jSONObject.put("prefetch_released_rate", 0);
                }
                function2.invoke("ResourceGroupStatistics", new C1535250q3P("ResourceGroup", "destroy", null, null, null, false, jSONObject, 60));
            }
            Function1<JSONObject, Unit> function1 = this.LLILLL;
            if (function1 != null) {
                function1.invoke(this.LLILLJJLI.LJIILJJIL);
            }
        }
        return Unit.LIZ;
    }
}
