package X;

import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693950RJx extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ VideoTagContainer LL;
    public final /* synthetic */ PriorityProtocol LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C693950RJx(VideoTagContainer videoTagContainer, PriorityProtocol priorityProtocol) {
        super(1);
        this.LL = videoTagContainer;
        this.LLILLJJLI = priorityProtocol;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        c0rta2.LLJILJIL = this.LL.op();
        c0rta2.LLJ = (ReusedUIContentAssem) this.LLILLJJLI;
        return Unit.LIZ;
    }
}
