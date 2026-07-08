package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qmE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563040qmE extends C09AY implements Function0<InterfaceC1563050qmF> {
    public final /* synthetic */ C1563030qmD LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563040qmE(C1563030qmD c1563030qmD) {
        super(0);
        this.LL = c1563030qmD;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1563050qmF invoke() {
        Function2<? super String, ? super Boolean, ? extends InterfaceC1563050qmF> function2 = C20605015k0.LJI;
        if (function2 != null) {
            return function2.invoke(this.LL.LJJIJIIJIL(), Boolean.TRUE);
        }
        return null;
    }
}
