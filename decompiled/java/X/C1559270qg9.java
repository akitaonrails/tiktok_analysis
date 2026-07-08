package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0qg9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559270qg9<T> extends C09AY implements Function0<T> {
    public final /* synthetic */ C1559260qg8<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1559270qg9(C1559260qg8<T> c1559260qg8) {
        super(0);
        this.LL = c1559260qg8;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        T tInvoke = this.LL.LLILLJJLI.invoke();
        this.LL.LLILLL = tInvoke;
        return tInvoke;
    }
}
