package X;

import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS393S0200000_27;

/* JADX INFO: renamed from: X.0y1Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841540y1Q extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ C197039127h LL;
    public final /* synthetic */ C1841510y1N LLILLJJLI;
    public final /* synthetic */ C1841520y1O LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ ExploreCustomTopicResponse LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1841540y1Q(C197039127h c197039127h, C1841510y1N c1841510y1N, C1841520y1O c1841520y1O, C013C c013c, ExploreCustomTopicResponse exploreCustomTopicResponse, int i) {
        super(1);
        this.LL = c197039127h;
        this.LLILLJJLI = c1841510y1N;
        this.LLILLL = c1841520y1O;
        this.LLILZ = c013c;
        this.LLILZIL = exploreCustomTopicResponse;
        this.LLILZLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LIZJ(2, this.LL.getContext().getString(2131829910), new C1841550y1R(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL));
        c1397620mTQ2.LIZJ(1, this.LL.getContext().getString(2131829909), new AwS393S0200000_27(this.LLILZ, this.LLILZIL, 183));
        return Unit.LIZ;
    }
}
