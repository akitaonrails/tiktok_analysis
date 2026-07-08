package X;

import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.UpvoteVideoTrigger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lV6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360220lV6 extends C09AY implements Function0<InterfaceC1360060lUq> {
    public final /* synthetic */ UpvoteVideoTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1360220lV6(UpvoteVideoTrigger upvoteVideoTrigger) {
        super(0);
        this.LL = upvoteVideoTrigger;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1360060lUq invoke() {
        C1360460lVU c1360460lVU = C1360460lVU.LIZIZ;
        BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) C631370Opb.LIZ(this.LL)).baseFeedPageParams;
        return c1360460lVU.LJJIJIL(baseFeedPageParams != null ? baseFeedPageParams.eventType : null);
    }
}
