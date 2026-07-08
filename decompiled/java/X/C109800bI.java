package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00bI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C109800bI extends C09AY implements Function0<Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI = "DM#applyStyle";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C109800bI(long j) {
        super(0);
        this.LL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        JSONObject jSONObject = new JSONObject();
        long j = this.LL;
        String str = this.LLILLJJLI;
        try {
            jSONObject.put("duration", j);
            jSONObject.put("name", str);
            C20684815ws.LJIJ("inbox_widget_method_cost", jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }
}
