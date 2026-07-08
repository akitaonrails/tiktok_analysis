package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0PWB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PWB<T> extends C09AY implements Function0<C0PW9<T>> {
    public final /* synthetic */ C0PW2<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PWB(C0PW2<T> c0pw2) {
        super(0);
        this.LL = c0pw2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.LL.getClass();
        return new C0PW9();
    }
}
