package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09QU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09QU extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09QU(String str, String str2, long j, long j2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = j;
        this.LLILZ = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        long j = this.LLILLL;
        long j2 = this.LLILZ;
        try {
            SmartRoute smartRoute = new SmartRoute(C08AH.LIZ());
            smartRoute.withUrl(str);
            smartRoute.open();
            C2369309Qd.LIZ(Long.valueOf(System.currentTimeMillis() - j2), "pdp_inbox_share", str2, String.valueOf(j));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }
}
