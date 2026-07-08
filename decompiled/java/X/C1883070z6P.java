package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z6P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883070z6P extends C09AY implements Function1<InterfaceC1883030z6L, Boolean> {
    public final /* synthetic */ C013C LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1883070z6P(C013C c013c) {
        super(1);
        this.LL = c013c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(InterfaceC1883030z6L interfaceC1883030z6L) {
        InterfaceC1883030z6L interfaceC1883030z6L2 = interfaceC1883030z6L;
        if (!interfaceC1883030z6L2.LJFF()) {
            int iLJIIJ = interfaceC1883030z6L2.LJIIJ();
            if (iLJIIJ != 2) {
                if (iLJIIJ != 3) {
                    this.LL.element = false;
                    return Boolean.FALSE;
                }
                this.LL.element = false;
                return Boolean.TRUE;
            }
            return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
