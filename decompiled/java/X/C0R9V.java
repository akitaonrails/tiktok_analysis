package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0R9V, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R9V extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ RootCellComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R9V(RootCellComponent rootCellComponent) {
        super(1);
        this.LL = rootCellComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        RootCellComponent rootCellComponent = this.LL;
        assembler.EQ2(rootCellComponent, new C0R9U(rootCellComponent));
        return Unit.LIZ;
    }
}
