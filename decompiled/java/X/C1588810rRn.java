package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rRn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1588810rRn extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1588810rRn(int i, int i2, int i3, int i4, int i5, String str) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = str;
        this.LLILZ = i3;
        this.LLILZIL = i4;
        this.LLILZLL = i5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        JSONObject jSONObject = new JSONObject();
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        String str = this.LLILLL;
        int i3 = this.LLILZ;
        int i4 = this.LLILZIL;
        int i5 = this.LLILZLL;
        try {
            jSONObject.put("hit_cache", i);
            jSONObject.put("skip", i2);
            jSONObject.put("reason", str);
            jSONObject.put("hit_preload", i3);
            jSONObject.put("pre_check_status", C1588800rRm.LIZIZ);
            jSONObject.put("aweme_type", i4);
            jSONObject.put("push_landing", i5);
            C20684815ws.LJIJ("following_feed_load_perf", jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }
}
