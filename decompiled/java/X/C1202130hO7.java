package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: renamed from: X.0hO7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202130hO7 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Assembler LL;
    public final /* synthetic */ BasePanelUIComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1202130hO7(Assembler assembler, BasePanelUIComponent basePanelUIComponent) {
        super(0);
        this.LL = assembler;
        this.LLILLJJLI = basePanelUIComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.vQ2(this.LLILLJJLI, AFwS256S0000000_18.get$arr$(111));
        return Unit.LIZ;
    }
}
