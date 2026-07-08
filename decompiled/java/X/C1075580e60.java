package X;

import Y.AkS478S0100000_16;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0e60, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075580e60 implements InterfaceC1487280oo2<C11NZ<Throwable>, C098D<?>> {
    public final Function1<Throwable, Boolean> LL;
    public final int LLILLJJLI;
    public final long LLILLL;
    public int LLILZ;

    public C1075580e60() {
        this(1, 500L, null);
    }

    @Override // X.InterfaceC1487280oo2
    public final C098D<?> apply(C11NZ<Throwable> c11nz) {
        return c11nz.LJJJ(new AkS478S0100000_16(this, 1), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1075580e60(int i, long j, Function1<? super Throwable, Boolean> function1) {
        this.LL = function1;
        this.LLILLJJLI = Math.min(Math.max(1, i), 10);
        this.LLILLL = j <= 0 ? 500L : j;
        this.LLILZ = 0;
    }
}
