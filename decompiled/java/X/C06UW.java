package X;

import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.06UW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06UW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Assembler LL;
    public final /* synthetic */ BasePanelUIComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06UW(Assembler assembler, BasePanelUIComponent basePanelUIComponent) {
        super(0);
        this.LL = assembler;
        this.LLILLJJLI = basePanelUIComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C13IQ<? extends AbstractC738140SxQ> c13iqLJJIII = C1618440sDa.LIZIZ.LJJIIJ().LJJIII();
        if (c13iqLJJIII != null) {
            this.LL.vQ2(this.LLILLJJLI, new AwS581S0100000_2((C13IQ) c13iqLJJIII, (C13IQ<? extends UISlotAssem>) 180));
        }
        return Unit.LIZ;
    }
}
