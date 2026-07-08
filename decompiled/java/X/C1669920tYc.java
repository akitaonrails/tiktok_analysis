package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: renamed from: X.0tYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669920tYc extends C09AY implements Function1<C0MAE, Unit> {
    public final /* synthetic */ List<C941240abK> LL;
    public final /* synthetic */ Function2<C941240abK, Integer, Unit> LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1669920tYc(List<C941240abK> list, Function2<? super C941240abK, ? super Integer, Unit> function2, float f) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = function2;
        this.LLILLL = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0MAE c0mae) {
        c0mae.LIZJ(this.LL.size(), null, AFwS240S0000000_9.get$arr$(907), new C19719212De(378380345, new C1669930tYd(this.LL, this.LLILLJJLI, this.LLILLL), true));
        return Unit.LIZ;
    }
}
