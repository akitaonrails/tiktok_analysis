package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS377S0200000_11;

/* JADX INFO: renamed from: X.0RJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693920RJu extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ FeedBottomButtonContainer LL;
    public final /* synthetic */ List<PriorityProtocol> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C693920RJu(FeedBottomButtonContainer feedBottomButtonContainer, List<? extends PriorityProtocol> list) {
        super(1);
        this.LL = feedBottomButtonContainer;
        this.LLILLJJLI = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        this.LL.subscribeChildAssemState(assembler2, new C0RK4(true));
        List<PriorityProtocol> list = this.LLILLJJLI;
        if (list != null) {
            FeedBottomButtonContainer feedBottomButtonContainer = this.LL;
            for (PriorityProtocol priorityProtocol : list) {
                if (priorityProtocol instanceof BaseCellTriggerComponent) {
                    C0RJE.LIZJ(assembler2, feedBottomButtonContainer, new C693930RJv(feedBottomButtonContainer, priorityProtocol));
                } else if (priorityProtocol instanceof BaseCellSlotComponent) {
                    assembler2.MQ2(feedBottomButtonContainer, new AwS377S0200000_11(feedBottomButtonContainer, priorityProtocol, 137));
                } else if (priorityProtocol instanceof FcpContainerAssem) {
                    assembler2.LQ2(feedBottomButtonContainer, new C693940RJw(feedBottomButtonContainer, priorityProtocol));
                    feedBottomButtonContainer.LLJLLL = (C0RWZ) priorityProtocol;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("The type ");
                    sbLIZ.append(priorityProtocol.getClass().getCanonicalName());
                    sbLIZ.append(" implementing PriorityProtocol is not supported!");
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        return Unit.LIZ;
    }
}
