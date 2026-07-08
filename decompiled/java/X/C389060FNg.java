package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0FNg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389060FNg extends C09AY implements Function2<Integer, Integer, Unit> {
    public final /* synthetic */ C389050FNf LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Function1<Integer, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C389060FNg(C389050FNf c389050FNf, int i, int i2, int i3, Function1<? super Integer, Unit> function1) {
        super(2);
        this.LL = c389050FNf;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Integer num2) {
        num.intValue();
        this.LL.LIZJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, num2.intValue(), this.LLILZIL);
        return Unit.LIZ;
    }
}
