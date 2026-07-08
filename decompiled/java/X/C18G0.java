package X;

import com.bytedance.android.btm.api.BtmPageLifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18G0, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18G0 extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ BtmPageLifecycle.State LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18G0(long j, BtmPageLifecycle.State state, String str) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = state;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        long j = 100;
        jSONObject2.put("delay_time", (this.LL / j) * j);
        jSONObject2.put("hybrid_page_state", this.LLILLJJLI);
        jSONObject2.put("btm", this.LLILLL);
        return Unit.LIZ;
    }
}
