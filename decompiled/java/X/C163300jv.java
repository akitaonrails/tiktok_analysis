package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00jv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C163300jv extends C09AY implements Function1<Float, Unit> {
    public final /* synthetic */ Function1<Float, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C163300jv(Function1<? super Float, Unit> function1) {
        super(1);
        this.LL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        this.LL.invoke(Float.valueOf(f.floatValue()));
        return Unit.LIZ;
    }
}
