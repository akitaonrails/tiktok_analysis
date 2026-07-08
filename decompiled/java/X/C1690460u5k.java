package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u5k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690460u5k {
    public static final int LIZ(int i, InterfaceC1690480u5m interfaceC1690480u5m, Object obj) {
        int iLIZ;
        if (obj != null && interfaceC1690480u5m.getItemCount() != 0 && ((i >= interfaceC1690480u5m.getItemCount() || !Intrinsics.LJFF(obj, interfaceC1690480u5m.LIZLLL(i))) && (iLIZ = interfaceC1690480u5m.LIZ(obj)) != -1)) {
            return iLIZ;
        }
        return i;
    }
}
