package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17oT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21142317oT implements Function1<C21143617og, Boolean> {
    public final InterfaceC21138617ns LL;

    public C21142317oT(InterfaceC21138617ns interfaceC21138617ns) {
        this.LL = interfaceC21138617ns;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C21143617og c21143617og) {
        InterfaceC21138617ns interfaceC21138617ns = c21143617og.LJ;
        if (Intrinsics.LJFF(interfaceC21138617ns, this.LL)) {
            return Boolean.TRUE;
        }
        if (interfaceC21138617ns instanceof C21138517nr) {
            return Boolean.valueOf(Intrinsics.LJFF(((C21138517nr) interfaceC21138617ns).LIZJ.getValue(), this.LL));
        }
        return Boolean.FALSE;
    }
}
