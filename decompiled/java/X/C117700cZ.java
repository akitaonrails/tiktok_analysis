package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00cZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C117700cZ extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ Throwable LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C117700cZ(String str, int i, long j, int i2, int i3, int i4, Throwable th) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = j;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = i4;
        this.LLIZ = th;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) {
        Object c098200Yq;
        String string;
        JSONObject jSONObject2 = jSONObject;
        String str = this.LL;
        int i = this.LLILLJJLI;
        long j = this.LLILLL;
        int i2 = this.LLILZ;
        int i3 = this.LLILZIL;
        int i4 = this.LLILZLL;
        Throwable th = this.LLIZ;
        try {
            jSONObject2.put("enter_from", str);
            jSONObject2.put("is_success", i);
            jSONObject2.put("duration", j);
            jSONObject2.put("pull_type", i2);
            jSONObject2.put("code", i3);
            jSONObject2.put("fetched_live_cnt", i4);
            if (th == null || (string = th.toString()) == null) {
                string = "";
            }
            c098200Yq = jSONObject2.put("err_msg", string);
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
