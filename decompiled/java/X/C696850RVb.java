package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C696850RVb extends C2217421BqW implements Function1<Function1<? super C696930RVj<Object>, ? extends C696930RVj<Object>>, Function0<? extends Unit>> {
    public final /* synthetic */ List<Function1<C696930RVj<Object>, C696930RVj<Object>>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C696850RVb(List<Function1<C696930RVj<Object>, C696930RVj<Object>>> list) {
        super(1, C1449605lu.class, "connect", "createCellNodeProcessor$connect(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", 0);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Function0<? extends Unit> invoke(Function1<? super C696930RVj<Object>, ? extends C696930RVj<Object>> function1) {
        Function1<? super C696930RVj<Object>, ? extends C696930RVj<Object>> function12 = function1;
        List<Function1<C696930RVj<Object>, C696930RVj<Object>>> list = this.LL;
        list.add((Function1<C696930RVj<Object>, C696930RVj<Object>>) function12);
        return new C1915707et(list, function12);
    }
}
