package X;

import android.view.View;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RKR, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RKR extends C09AY implements Function1<PriorityProtocol, Unit> {
    public final /* synthetic */ Function1<View, Unit> LL;
    public final /* synthetic */ InteractBottomBannerComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0RKR(Function1<? super View, Unit> function1, InteractBottomBannerComponent interactBottomBannerComponent) {
        super(1);
        this.LL = function1;
        this.LLILLJJLI = interactBottomBannerComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PriorityProtocol priorityProtocol) {
        String strH3;
        InteractAreaCommonAbility interactAreaCommonAbilityUp;
        PriorityProtocol priorityProtocol2 = priorityProtocol;
        Function1<View, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(priorityProtocol2.Vt());
        }
        if (!this.LLILLJJLI.zp()) {
            C786410Ut5.LJLLLLLL(0, this.LLILLJJLI.LJJIJL());
        }
        if (!this.LLILLJJLI.Ap() && (strH3 = this.LLILLJJLI.H3()) != null && strH3.length() != 0 && (interactAreaCommonAbilityUp = this.LLILLJJLI.up()) != null) {
            interactAreaCommonAbilityUp.CL(this.LLILLJJLI.H3(), this.LLILLJJLI, true);
        }
        return Unit.LIZ;
    }
}
