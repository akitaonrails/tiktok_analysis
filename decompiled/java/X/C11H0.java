package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [A, B, S, C] */
/* JADX INFO: renamed from: X.11H0, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11H0<A, B, C, S> extends C09AY implements Function1<S, C11H7<A, B, C>> {
    public final /* synthetic */ InterfaceC2217241BqE<S, A> LL;
    public final /* synthetic */ InterfaceC2217241BqE<S, B> LLILLJJLI;
    public final /* synthetic */ InterfaceC2217241BqE<S, C> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11H0(InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3) {
        super(1);
        this.LL = interfaceC2217241BqE;
        this.LLILLJJLI = interfaceC2217241BqE2;
        this.LLILLL = interfaceC2217241BqE3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C11H7(this.LL.get(obj), this.LLILLJJLI.get(obj), this.LLILLL.get(obj));
    }
}
