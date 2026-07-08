package X;

import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04ef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1149904ef extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ C1150304ej LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1149904ef(C1150304ej c1150304ej) {
        super(1);
        this.LL = c1150304ej;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        C1150304ej c1150304ej = this.LL;
        assembler2.RQ2(c1150304ej, new C1138604cq());
        assembler2.RQ2(c1150304ej, new C1149704ed());
        return Unit.LIZ;
    }
}
