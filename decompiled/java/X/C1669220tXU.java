package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS35S0100001_8;

/* JADX INFO: renamed from: X.0tXU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669220tXU extends C09AY implements Function1<C0MAE, Unit> {
    public final /* synthetic */ List<C1669250tXX> LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ List<C1669250tXX> LLILLL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ Function1<String, Unit> LLIZ;
    public final /* synthetic */ List<String> LLIZLLLIL;
    public final /* synthetic */ C1669440tXq LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;
    public final /* synthetic */ float LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1669220tXU(List<C1669250tXX> list, Integer num, List<C1669250tXX> list2, InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2, Function1<? super String, Unit> function1, List<String> list3, C1669440tXq c1669440tXq, Function0<Unit> function0, float f3) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = num;
        this.LLILLL = list2;
        this.LLILZ = interfaceC1685750ty9;
        this.LLILZIL = f;
        this.LLILZLL = f2;
        this.LLIZ = function1;
        this.LLIZLLLIL = list3;
        this.LLJ = c1669440tXq;
        this.LLJI = function0;
        this.LLJIJIL = f3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0MAE c0mae) {
        C0MAE c0mae2 = c0mae;
        List<C1669250tXX> list = this.LL;
        c0mae2.LIZJ(list.size(), null, new C5183020f((List) list, (List<Function1<Function1<? super Boolean, Unit>, Unit>>) 173), new C19719212De(-1091073711, new C1669210tXT(list, this.LLILZ, this.LLILZIL, this.LLILZLL, list, this.LLILLL, this.LLIZ, this.LLIZLLLIL, this.LLJ), true));
        Integer num = this.LLILLJJLI;
        if (num != null && num.intValue() < this.LLILLL.size()) {
            c0mae2.LIZIZ(null, null, new C19719212De(1578103473, new C1666160tSY(this.LLILZ, this.LLILZIL, this.LLJI, this.LLILZLL), true));
        }
        c0mae2.LIZIZ(null, null, new C19719212De(-263375572, new AwS35S0100001_8(this.LLILZ, this.LLJIJIL, 0), true));
        return Unit.LIZ;
    }
}
