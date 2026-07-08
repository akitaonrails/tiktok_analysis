package X;

import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: renamed from: X.0qmS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563180qmS extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ C1563170qmR LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563180qmS(C1563170qmR c1563170qmR) {
        super(1);
        this.LL = c1563170qmR;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        C1563170qmR c1563170qmR = this.LL;
        assembler2.QQ2(c1563170qmR, new C1559350qgH());
        assembler2.QQ2(c1563170qmR, AFwS257S0000000_19.get$arr$(227));
        return Unit.LIZ;
    }
}
