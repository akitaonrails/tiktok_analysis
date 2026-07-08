package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RK3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RK3 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ BaseCellTriggerComponent<RECEIVER> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RK3(BaseCellTriggerComponent<RECEIVER> baseCellTriggerComponent) {
        super(1);
        this.LL = baseCellTriggerComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        BaseCellTriggerComponent<RECEIVER> baseCellTriggerComponent = this.LL;
        assembler.MQ2(baseCellTriggerComponent, new C0RK2(baseCellTriggerComponent));
        return Unit.LIZ;
    }
}
