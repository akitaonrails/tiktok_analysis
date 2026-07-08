package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DW4, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DW4 extends C09AY implements Function1<C1DW6, Unit> {
    public final /* synthetic */ C0Y3I LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ Map<String, List<C0YA1>> LLILLL;
    public final /* synthetic */ Map<String, List<C0YA1>> LLILZ;
    public final /* synthetic */ Long LLILZIL;
    public final /* synthetic */ Long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1DW4(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, List<C0YA1>> map, Map<String, List<C0YA1>> map2, Long l, Long l2) {
        super(1);
        this.LL = c0y3i;
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = map;
        this.LLILZ = map2;
        this.LLILZIL = l;
        this.LLILZLL = l2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1DW6 c1dw6) {
        c1dw6.mp(this.LL.LIZ(), this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        return Unit.LIZ;
    }
}
