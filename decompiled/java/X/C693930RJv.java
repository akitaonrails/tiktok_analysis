package X;

import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693930RJv extends C09AY implements Function1<C0REQ, Unit> {
    public final /* synthetic */ FeedBottomButtonContainer LL;
    public final /* synthetic */ PriorityProtocol LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C693930RJv(FeedBottomButtonContainer feedBottomButtonContainer, PriorityProtocol priorityProtocol) {
        super(1);
        this.LL = feedBottomButtonContainer;
        this.LLILLJJLI = priorityProtocol;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0REQ c0req) {
        C0REQ c0req2 = c0req;
        c0req2.LJ = this.LL.sp();
        c0req2.LIZIZ = (BaseCellTriggerComponent) this.LLILLJJLI;
        return Unit.LIZ;
    }
}
