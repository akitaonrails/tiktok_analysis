package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [A, B, S] */
/* JADX INFO: renamed from: X.11Gv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19473911Gv<A, B, S> extends C09AY implements Function1<S, C19474211Gy<A, B>> {
    public final /* synthetic */ InterfaceC2217241BqE<S, A> LL;
    public final /* synthetic */ InterfaceC2217241BqE<S, B> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19473911Gv(InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2) {
        super(1);
        this.LL = interfaceC2217241BqE;
        this.LLILLJJLI = interfaceC2217241BqE2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C19474211Gy(this.LL.get(obj), this.LLILLJJLI.get(obj));
    }
}
