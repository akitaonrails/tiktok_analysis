package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04eM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1148004eM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Assembler LL;
    public final /* synthetic */ BasePanelUIComponent LLILLJJLI;
    public final /* synthetic */ C13IQ<? extends AbstractC738140SxQ> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1148004eM(Assembler assembler, BasePanelUIComponent basePanelUIComponent, C13IQ<? extends AbstractC738140SxQ> c13iq) {
        super(0);
        this.LL = assembler;
        this.LLILLJJLI = basePanelUIComponent;
        this.LLILLL = c13iq;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.vQ2(this.LLILLJJLI, new C1147904eL(this.LLILLL));
        return Unit.LIZ;
    }
}
