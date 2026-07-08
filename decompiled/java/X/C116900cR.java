package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00cR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C116900cR extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL = "story";
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C116900cR(int i, String str, long j) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) {
        Object c098200Yq;
        JSONObject jSONObject2 = jSONObject;
        String str = this.LL;
        long j = this.LLILLJJLI;
        String str2 = this.LLILLL;
        int i = this.LLILZ;
        try {
            jSONObject2.put("enter_from", str);
            jSONObject2.put("duration", j);
            jSONObject2.put("skylight_type", str2);
            c098200Yq = jSONObject2.put("story_exp_group", i);
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
