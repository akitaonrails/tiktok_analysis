package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sEQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618960sEQ extends C09AY implements Function0<AbstractC1591090rVT> {
    public final /* synthetic */ C1618830sED LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1618960sEQ(C1618830sED c1618830sED) {
        super(0);
        this.LL = c1618830sED;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbstractC1591090rVT invoke() {
        InterfaceC1570600qyQ interfaceC1570600qyQ = (InterfaceC1570600qyQ) this.LL.LLJJI.getValue();
        if (interfaceC1570600qyQ != null) {
            return interfaceC1570600qyQ.y01();
        }
        return null;
    }
}
