package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rbU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1594820rbU extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1594810rbT LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1594820rbU(long j, C1594810rbT c1594810rbT, String str) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = c1594810rbT;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) {
        Object c098200Yq;
        String string;
        JSONObject jSONObject2 = jSONObject;
        String str = this.LL;
        C1594810rbT c1594810rbT = this.LLILLJJLI;
        long j = this.LLILLL;
        try {
            jSONObject2.put("enter_from", str);
            jSONObject2.put("is_success", c1594810rbT.LIZ);
            jSONObject2.put("duration", j);
            jSONObject2.put("request_type", c1594810rbT.LIZIZ);
            jSONObject2.put("fetched_story_cnt", c1594810rbT.LIZLLL);
            jSONObject2.put("fetched_live_cnt", c1594810rbT.LJII);
            jSONObject2.put("total_count", c1594810rbT.LJIIIIZZ);
            jSONObject2.put("story_total_count", c1594810rbT.LJIIJJI);
            jSONObject2.put("live_total_count", c1594810rbT.LJIIL);
            jSONObject2.put("is_mix_rank", c1594810rbT.LJIIIZ);
            jSONObject2.put("has_more", c1594810rbT.LJIIJ);
            jSONObject2.put("pull_type", c1594810rbT.LIZJ);
            jSONObject2.put("status_code", c1594810rbT.LJ);
            String str2 = c1594810rbT.LJFF;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            jSONObject2.put("status_msg", str2);
            Throwable th = c1594810rbT.LJI;
            if (th != null && (string = th.toString()) != null) {
                str3 = string;
            }
            c098200Yq = jSONObject2.put("err_msg", str3);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return Unit.LIZ;
    }
}
