package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cB5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001850cB5 implements InterfaceC1023650ckF<Boolean, Integer> {
    public final String LIZ;
    public final Function1<C1196804mE, Boolean> LIZIZ;

    @Override // X.InterfaceC1023650ckF
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1023650ckF
    public final Function1<C1196804mE, Boolean> LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1023650ckF
    public final String getName() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1023650ckF
    public final Integer LIZ(Boolean bool) {
        return Integer.valueOf(bool.booleanValue() ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1001850cB5(String str, Function1<? super C1196804mE, Boolean> function1) {
        this.LIZ = str;
        this.LIZIZ = function1;
    }
}
