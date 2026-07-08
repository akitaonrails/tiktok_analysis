package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05mG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1451805mG extends C2217421BqW implements Function0<Object> {
    public final /* synthetic */ C259800zU<Object> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1451805mG(C259800zU<Object> c259800zU) {
        super(0, C1449605lu.class, "getState", "createStore$getState(Lkotlin/jvm/internal/Ref$ObjectRef;)Ljava/lang/Object;", 0);
        this.LL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.LL.element;
    }
}
