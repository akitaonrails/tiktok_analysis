package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.015D, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C015D extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C015D(int i, int i2, String str, String str2, boolean z) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = i2;
        this.LLILZ = z;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        JSONObject jSONObject = new JSONObject();
        int i = this.LL;
        String str = this.LLILLJJLI;
        int i2 = this.LLILLL;
        boolean z = this.LLILZ;
        String str2 = this.LLILZIL;
        try {
            jSONObject.put("hit_cache", i);
            jSONObject.put("reason", str);
            jSONObject.put("hit_preload", i2);
            if (z) {
                jSONObject.put("not_preload_reason", "use_cache");
            } else {
                jSONObject.put("not_preload_reason", str2);
            }
            C20684815ws.LJIJ("following_feed_launch_check_result", jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }
}
