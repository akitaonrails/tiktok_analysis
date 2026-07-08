package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Q4C, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q4C extends C09AY implements Function2<InterfaceC663970Q2p, InterfaceC663910Q2j, InterfaceC663970Q2p> {
    public final /* synthetic */ Function2<InterfaceC663970Q2p, Object, InterfaceC663970Q2p> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Q4C(Function2<InterfaceC663970Q2p, Object, InterfaceC663970Q2p> function2) {
        super(2);
        this.LL = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final InterfaceC663970Q2p invoke(InterfaceC663970Q2p interfaceC663970Q2p, InterfaceC663910Q2j interfaceC663910Q2j) {
        return this.LL.invoke(interfaceC663970Q2p, interfaceC663910Q2j);
    }
}
