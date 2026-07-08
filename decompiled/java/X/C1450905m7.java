package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05m7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1450905m7 extends C2217421BqW implements Function1<Function2<Object, ? super InterfaceC1445905lJ, Object>, Unit> {
    public final /* synthetic */ C259800zU<Function2<Object, InterfaceC1445905lJ, Object>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1450905m7(C259800zU<Function2<Object, InterfaceC1445905lJ, Object>> c259800zU) {
        super(1, C1449605lu.class, "replaceReducer", "createReduxStore$replaceReducer(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function2;)V", 0);
        this.LL = c259800zU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Function2<Object, ? super InterfaceC1445905lJ, Object> function2) {
        this.LL.element = function2;
        return Unit.LIZ;
    }
}
