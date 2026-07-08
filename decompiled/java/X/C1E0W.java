package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1E0W, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E0W<I, O> {
    public final Function1<I, O> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1E0W(Function1<? super I, ? extends O> function1) {
        this.LIZ = function1;
    }

    public final <NewO> C1E0W<I, NewO> LIZ(Function1<? super O, ? extends NewO> function1) {
        return new C1E0W<>(new C1E0X(function1, this));
    }
}
