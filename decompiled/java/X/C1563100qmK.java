package X;

import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qmK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563100qmK extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ C1563110qmL LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563100qmK(C1563110qmL c1563110qmL) {
        super(1);
        this.LL = c1563110qmL;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        C1558150qeL.LIZ(assembler, this.LL);
        return Unit.LIZ;
    }
}
