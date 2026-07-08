package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.feed.platform.cell.interact.right.InteractRightAreaComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RHp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693350RHp extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ InteractRightAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C693350RHp(InteractRightAreaComponent interactRightAreaComponent) {
        super(1);
        this.LL = interactRightAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        InteractRightAreaComponent interactRightAreaComponent = this.LL;
        assembler.EQ2(interactRightAreaComponent, new C693340RHo(interactRightAreaComponent));
        return Unit.LIZ;
    }
}
