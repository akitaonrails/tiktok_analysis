package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07sU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2000007sU extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2000007sU(boolean z, int i) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(this.LL ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LIZJ(this.LLILLJJLI, "status_code");
        C20684815ws.LJIILLIIL("dispatch_notice_action_api", c2344009Gk.LIZ);
        return Unit.LIZ;
    }
}
