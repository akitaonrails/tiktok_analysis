package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DW8, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DW8 extends C09AY implements Function1<C1DW6, Unit> {
    public final /* synthetic */ List<C869590Y9l> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1DW8(int i, String str, List list, Long l) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1DW6 c1dw6) {
        c1dw6.a(this.LLILLJJLI, this.LLILLL, this.LL, this.LLILZ);
        return Unit.LIZ;
    }
}
