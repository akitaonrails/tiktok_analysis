package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rbf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1594930rbf extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1594930rbf(long j, int i, long j2, int i2, String str, long j3, long j4) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = j2;
        this.LLILZIL = j3;
        this.LLILZLL = j4;
        this.LLIZ = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) {
        Object c098200Yq;
        JSONObject jSONObject2 = jSONObject;
        String str = this.LL;
        long j = this.LLILLJJLI;
        int i = this.LLILLL;
        long j2 = this.LLILZ;
        long j3 = this.LLILZIL;
        long j4 = this.LLILZLL;
        int i2 = this.LLIZ;
        try {
            jSONObject2.put("enter_from", str);
            jSONObject2.put("total_duration", j);
            jSONObject2.put("displayed_item_cnt", i);
            jSONObject2.put("request_trigger_duration", j2);
            jSONObject2.put("request_duration", j3);
            jSONObject2.put("response_handle_duration", j4);
            c098200Yq = jSONObject2.put("story_exp_group", i2);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return Unit.LIZ;
    }
}
