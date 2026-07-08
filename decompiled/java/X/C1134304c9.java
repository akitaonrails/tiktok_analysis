package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: renamed from: X.04c9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1134304c9 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Assembler LL;
    public final /* synthetic */ BasePanelUIComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134304c9(Assembler assembler, BasePanelUIComponent basePanelUIComponent) {
        super(0);
        this.LL = assembler;
        this.LLILLJJLI = basePanelUIComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.vQ2(this.LLILLJJLI, AFwS229S0000000_2.get$arr$(180));
        return Unit.LIZ;
    }
}
