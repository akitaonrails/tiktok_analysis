package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OxR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C636230OxR {
    public static final <T> boolean LIZ(InterfaceC636240OxS<T> interfaceC636240OxS) {
        AbstractC636210OxP refreshState = interfaceC636240OxS.getRefreshState();
        C636220OxQ c636220OxQ = C636220OxQ.LIZ;
        if (!Intrinsics.LJFF(refreshState, c636220OxQ) && !Intrinsics.LJFF(interfaceC636240OxS.getLoadMoreState(), c636220OxQ) && !Intrinsics.LJFF(interfaceC636240OxS.getLoadLatestState(), c636220OxQ)) {
            return false;
        }
        return true;
    }
}
