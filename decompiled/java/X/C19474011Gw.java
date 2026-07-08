package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [A, S] */
/* JADX INFO: renamed from: X.11Gw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19474011Gw<A, S> extends C09AY implements Function1<S, C11H9<A>> {
    public final /* synthetic */ InterfaceC2217241BqE<S, A> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19474011Gw(InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE) {
        super(1);
        this.LL = interfaceC2217241BqE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C11H9(this.LL.get(obj));
    }
}
