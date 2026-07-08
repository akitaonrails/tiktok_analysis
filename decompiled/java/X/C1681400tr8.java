package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tr8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681400tr8 extends C09AY implements Function1<C0MAE, Unit> {
    public final /* synthetic */ List<List<C1147620fyC>> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Function1<Long, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1681400tr8(List<? extends List<C1147620fyC>> list, long j, Function1<? super Long, Unit> function1) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = j;
        this.LLILLL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0MAE c0mae) {
        List<List<C1147620fyC>> list = this.LL;
        c0mae.LIZJ(list.size(), new C00HQ(new C1681490trH(), list), new C00HR(new C1681510trJ(), list), new C19719212De(-632812321, new C1666690tTP(list, this.LLILLJJLI, this.LLILLL), true));
        return Unit.LIZ;
    }
}
