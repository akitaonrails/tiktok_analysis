package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T3T, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T3T extends C09AY implements Function0<Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI = "new_follower";
    public final /* synthetic */ String LLILLL = "collapseLoadedNotice";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0T3T(long j) {
        super(0);
        this.LL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long j = this.LL;
        if (j >= 0 && j <= 10000) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI);
            c2344009Gk.LJIIIIZZ("enter_method", this.LLILLL);
            c2344009Gk.LIZLLL(this.LL, "widget_cost");
            C20684815ws.LJIILLIIL("recommend_diagnosis", c2344009Gk.LIZ);
        }
        return Unit.LIZ;
    }
}
