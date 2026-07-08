package X;

import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomAreaComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RJ1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RJ1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InteractBottomAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RJ1(InteractBottomAreaComponent interactBottomAreaComponent) {
        super(0);
        this.LL = interactBottomAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InteractInfoAreaAttachAbility interactInfoAreaAttachAbility = (InteractInfoAreaAttachAbility) this.LL.LLJLL.getValue();
        if (interactInfoAreaAttachAbility != null) {
            interactInfoAreaAttachAbility.w5();
        }
        return Unit.LIZ;
    }
}
