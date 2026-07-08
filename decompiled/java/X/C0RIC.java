package X;

import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.feed.platform.dowgrade.BaseDowngradeCellTriggerComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RIC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RIC extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ BaseDowngradeCellTriggerComponent<RECEIVER> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RIC(BaseDowngradeCellTriggerComponent<RECEIVER> baseDowngradeCellTriggerComponent) {
        super(1);
        this.LL = baseDowngradeCellTriggerComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        BaseDowngradeCellTriggerComponent<RECEIVER> baseDowngradeCellTriggerComponent = this.LL;
        baseDowngradeCellTriggerComponent.LLJJLIIIJLLLLLLLZ = (ReusedUISlotAssem) C09R7.LIZ(baseDowngradeCellTriggerComponent.getType()).newInstance();
        BaseDowngradeCellTriggerComponent<RECEIVER> baseDowngradeCellTriggerComponent2 = this.LL;
        assembler.MQ2(baseDowngradeCellTriggerComponent2, new C0RIB(baseDowngradeCellTriggerComponent2));
        return Unit.LIZ;
    }
}
