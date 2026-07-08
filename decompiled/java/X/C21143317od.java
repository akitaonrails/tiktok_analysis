package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.17od, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21143317od implements Function1<C21143617og, Boolean> {
    public final InterfaceC21143917oj LL;

    public C21143317od(InterfaceC21143917oj interfaceC21143917oj) {
        this.LL = interfaceC21143917oj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C21143617og c21143617og) {
        boolean z;
        C21143617og c21143617og2 = c21143617og;
        if (c21143617og2.LJII) {
            if (c21143617og2.LJI == this.LL.getActivity().hashCode()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return Boolean.FALSE;
    }
}
