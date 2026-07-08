package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [I, NewO] */
/* JADX INFO: renamed from: X.1E0X, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E0X<I, NewO> extends C09AY implements Function1<I, NewO> {
    public final /* synthetic */ Function1<O, NewO> LL;
    public final /* synthetic */ C1E0W<I, O> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1E0X(Function1<? super O, ? extends NewO> function1, C1E0W<I, O> c1e0w) {
        super(1);
        this.LL = function1;
        this.LLILLJJLI = c1e0w;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function1
    public final NewO invoke(I i) {
        return this.LL.invoke((O) this.LLILLJJLI.LIZ.invoke(i));
    }
}
