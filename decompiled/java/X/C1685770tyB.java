package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tyB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685770tyB implements InterfaceC1679180tnY {
    public final C2267581DpE LL;
    public final Function1<C2267501Dp6, Unit> LLILLJJLI;
    public final Object LLILLL;

    public final int hashCode() {
        return (this.LL.LIZ.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    @Override // X.InterfaceC1679180tnY
    public final Object getLayoutId() {
        return this.LLILLL;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1685770tyB) {
            C1685770tyB c1685770tyB = (C1685770tyB) obj;
            if (Intrinsics.LJFF(this.LL.LIZ, c1685770tyB.LL.LIZ) && Intrinsics.LJFF(this.LLILLJJLI, c1685770tyB.LLILLJJLI)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1685770tyB(C2267581DpE c2267581DpE, Function1<? super C2267501Dp6, Unit> function1) {
        this.LL = c2267581DpE;
        this.LLILLJJLI = function1;
        this.LLILLL = c2267581DpE.LIZ;
    }
}
