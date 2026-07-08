package X;

import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SaV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723930SaV extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function1<Assembler, Unit> LL;
    public final /* synthetic */ Assembler LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C723930SaV(Assembler assembler, Function1 function1) {
        super(0);
        this.LL = function1;
        this.LLILLJJLI = assembler;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.invoke(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
