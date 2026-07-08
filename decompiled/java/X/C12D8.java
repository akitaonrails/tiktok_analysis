package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.12D8, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C12D8 extends C2217421BqW implements Function2<Integer, Function0<? extends Unit>, Unit> {
    public C12D8(C12D1 c12d1) {
        super(2, c12d1, C12D1.class, "seek", "seek(ILkotlin/jvm/functions/Function0;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Function0<? extends Unit> function0) {
        ((C12D1) this.receiver).H5(num.intValue(), function0);
        return Unit.LIZ;
    }
}
