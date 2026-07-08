package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.feed.platform.cell.interact.right.InteractRightAreaComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RL5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RL5 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ InteractRightAreaComponent LL;
    public final /* synthetic */ BaseFeedPageParams LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RL5(InteractRightAreaComponent interactRightAreaComponent, BaseFeedPageParams baseFeedPageParams) {
        super(1);
        this.LL = interactRightAreaComponent;
        this.LLILLJJLI = baseFeedPageParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.EQ2(this.LL, new C0RL4(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
