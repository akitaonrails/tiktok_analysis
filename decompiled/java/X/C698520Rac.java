package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C698520Rac extends C2217421BqW implements Function1<Function1<? super C698680Ras, ? extends C698680Ras>, Function0<? extends Unit>> {
    public final /* synthetic */ List<Function1<C698680Ras, C698680Ras>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C698520Rac(List<Function1<C698680Ras, C698680Ras>> list) {
        super(1, C1449605lu.class, "addObserver", "createFcpSignalService$addObserver(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", 0);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Function0<? extends Unit> invoke(Function1<? super C698680Ras, ? extends C698680Ras> function1) {
        Function1<? super C698680Ras, ? extends C698680Ras> function12 = function1;
        List<Function1<C698680Ras, C698680Ras>> list = this.LL;
        list.add((Function1<C698680Ras, C698680Ras>) function12);
        return new C698530Rad(list, function12);
    }
}
