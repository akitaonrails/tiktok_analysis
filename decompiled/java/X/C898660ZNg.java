package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZNg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898660ZNg implements InterfaceC903660Zci {
    public final Function1<C869590Y9l, Boolean> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C898660ZNg(Function1<? super C869590Y9l, Boolean> function1) {
        this.LIZ = function1;
    }

    @Override // X.InterfaceC903660Zci
    public final boolean LIZ(C869590Y9l c869590Y9l) {
        return this.LIZ.invoke(c869590Y9l).booleanValue();
    }
}
