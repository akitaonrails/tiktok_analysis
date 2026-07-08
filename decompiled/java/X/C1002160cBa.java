package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0cBa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1002160cBa<T> extends C09AY implements Function1<C1196804mE, T> {
    public final /* synthetic */ T LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002160cBa(T t) {
        super(1);
        this.LL = t;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(C1196804mE c1196804mE) {
        return this.LL;
    }
}
