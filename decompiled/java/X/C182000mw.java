package X;

import java.util.List;

/* JADX INFO: renamed from: X.00mw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C182000mw implements InterfaceC1432240nNG {
    public static final C182000mw LIZ = new C182000mw();

    @Override // X.InterfaceC1432240nNG
    public final List<Long> LIZIZ(List<String> list, boolean z) {
        return C00RV.LIZ(C13LQ.LJL(C00RV.LIZ), list);
    }

    @Override // X.InterfaceC1432240nNG
    public final List<Long> LIZJ(List<String> list, boolean z) {
        return C00RV.LIZ(C13LQ.LJL(C00RV.LIZIZ), list);
    }

    @Override // X.InterfaceC1432240nNG
    public final boolean LIZ(List<Long> list, List<Long> list2, boolean z) {
        int i = 0;
        while (C00RV.LIZIZ(i, list, list2) == 0) {
            i++;
            if (i >= 3) {
                return true;
            }
        }
        return false;
    }
}
