package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS377S0200000_11;

/* JADX INFO: renamed from: X.0RK0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RK0 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ InteractBottomBannerComponent LL;
    public final /* synthetic */ List<BottomBarPriorityProtocol> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0RK0(InteractBottomBannerComponent interactBottomBannerComponent, List<? extends BottomBarPriorityProtocol> list) {
        super(1);
        this.LL = interactBottomBannerComponent;
        this.LLILLJJLI = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        InteractBottomBannerComponent interactBottomBannerComponent = this.LL;
        interactBottomBannerComponent.subscribeChildAssemState(assembler2, new C0RK4(interactBottomBannerComponent.Ap()));
        List<BottomBarPriorityProtocol> list = this.LLILLJJLI;
        if (list != null) {
            InteractBottomBannerComponent interactBottomBannerComponent2 = this.LL;
            for (BottomBarPriorityProtocol bottomBarPriorityProtocol : list) {
                if (bottomBarPriorityProtocol instanceof BaseCellTriggerComponent) {
                    C0RJE.LIZJ(assembler2, interactBottomBannerComponent2, new AwS377S0200000_11(interactBottomBannerComponent2, bottomBarPriorityProtocol, 75));
                } else if (bottomBarPriorityProtocol instanceof BaseCellSlotComponent) {
                    assembler2.MQ2(interactBottomBannerComponent2, new AwS377S0200000_11(interactBottomBannerComponent2, bottomBarPriorityProtocol, 76));
                } else {
                    throw new IllegalStateException("The type implementing BottomBarPriorityProtocol is not supported!");
                }
            }
        }
        return Unit.LIZ;
    }
}
