package X;

import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693940RJw extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ FeedBottomButtonContainer LL;
    public final /* synthetic */ PriorityProtocol LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C693940RJw(FeedBottomButtonContainer feedBottomButtonContainer, PriorityProtocol priorityProtocol) {
        super(1);
        this.LL = feedBottomButtonContainer;
        this.LLILLJJLI = priorityProtocol;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        c0rta2.LLJILJIL = this.LL.sp();
        c0rta2.LLJ = (ReusedUIContentAssem) this.LLILLJJLI;
        return Unit.LIZ;
    }
}
