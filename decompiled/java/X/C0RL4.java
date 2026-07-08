package X;

import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RL4, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RL4 extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ BaseFeedPageParams LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RL4(BaseFeedPageParams baseFeedPageParams) {
        super(1);
        this.LL = baseFeedPageParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        String creationId;
        String parentTagId;
        C062P<InterfaceC111300bX> c062p2 = c062p;
        String previousPage = this.LL.getPreviousPage();
        String str = "";
        if (previousPage == null) {
            previousPage = "";
        }
        String fromGroupId = this.LL.getFromGroupId();
        if (fromGroupId == null) {
            fromGroupId = "";
        }
        String previousPagePosition = this.LL.getPreviousPagePosition();
        if (previousPagePosition == null) {
            previousPagePosition = "";
        }
        C2189821An6 c2189821An6 = this.LL.param;
        if (c2189821An6 == null || (creationId = c2189821An6.getCreationId()) == null) {
            creationId = "";
        }
        BaseFeedPageParams baseFeedPageParams = this.LL;
        String str2 = baseFeedPageParams.challengeId;
        if (str2 == null) {
            str2 = "";
        }
        C2189821An6 c2189821An62 = baseFeedPageParams.param;
        if (c2189821An62 != null && (parentTagId = c2189821An62.getParentTagId()) != null) {
            str = parentTagId;
        }
        c062p2.LIZ = new C0SYJ(previousPage, fromGroupId, previousPagePosition, creationId, str2, str, 64);
        return Unit.LIZ;
    }
}
