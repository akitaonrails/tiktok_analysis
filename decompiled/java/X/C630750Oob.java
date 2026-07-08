package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0Oob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630750Oob<T> extends C09AY implements Function0<T> {
    public final /* synthetic */ C630740Ooa<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C630750Oob(C630740Ooa<? extends T> c630740Ooa) {
        super(0);
        this.LL = c630740Ooa;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        return this.LL.LLILLJJLI.invoke();
    }
}
