package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0JF6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JF6<T> extends C09AY implements Function0<C13IQ<T>> {
    public final /* synthetic */ C13IQ<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JF6(C13IQ<T> c13iq) {
        super(0);
        this.LL = c13iq;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.LL;
    }
}
