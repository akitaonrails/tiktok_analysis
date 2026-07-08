package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vdp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1750030vdp<T, R> implements InterfaceC1487280oo2 {
    public final /* synthetic */ Function1<InterfaceC0148002o, R> LL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1750030vdp(Function1<InterfaceC0148002o, ? extends R> function1) {
        this.LL = function1;
    }

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        return this.LL.invoke(obj);
    }
}
