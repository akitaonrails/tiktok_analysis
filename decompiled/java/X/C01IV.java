package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01IV, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01IV extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ C01IS LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01IV(C01IS c01is, int i) {
        super(1);
        this.LL = c01is;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        num.intValue();
        this.LL.LIZJ.setValue(Integer.valueOf(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
