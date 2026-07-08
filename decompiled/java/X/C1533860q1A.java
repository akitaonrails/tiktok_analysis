package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS172S1100000_23;

/* JADX INFO: renamed from: X.0q1A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533860q1A extends C09AY implements Function1<C1533790q13, Unit> {
    public final /* synthetic */ Forest LL;
    public final /* synthetic */ C259800zU<C1534570q2J> LLILLJJLI;
    public final /* synthetic */ RequestParams LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function1<C1533790q13, Unit> LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1533860q1A(Forest forest, C259800zU<C1534570q2J> c259800zU, RequestParams requestParams, long j, boolean z, Function1<? super C1533790q13, Unit> function1, String str) {
        super(1);
        this.LL = forest;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = requestParams;
        this.LLILZ = j;
        this.LLILZIL = z;
        this.LLILZLL = function1;
        this.LLIZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1533790q13 c1533790q13) {
        C1533790q13 c1533790q132 = c1533790q13;
        C1533790q13 c1533790q13ReuseResponse$forest_release = this.LL.reuseResponse$forest_release(c1533790q132, this.LLILLJJLI.element, this.LLILLL, this.LLILZ);
        this.LL.triggerCallback$forest_release(this.LLILZIL, this.LLILZLL, c1533790q13ReuseResponse$forest_release);
        C1534250q1n.LIZ.LJIIJ(new AwS172S1100000_23(this.LLIZ, c1533790q132, 2));
        C1534490q2B.LIZ(c1533790q13ReuseResponse$forest_release);
        Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
        C1533480q0Y.LJ(c1533790q13ReuseResponse$forest_release, null);
        return Unit.LIZ;
    }
}
