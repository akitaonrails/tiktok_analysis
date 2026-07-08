package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05Mr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1341105Mr {
    public final InterfaceC332260D0u<InterfaceC439080HJq> LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1341105Mr)) {
            return false;
        }
        C1341105Mr c1341105Mr = (C1341105Mr) obj;
        return Intrinsics.LJFF(this.LIZ, c1341105Mr.LIZ) && this.LIZIZ == c1341105Mr.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserSocialAvatarFastFlowStateWithTTL(state.value=");
        sbLIZ.append(this.LIZ.getValue());
        sbLIZ.append(", queriedTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1341105Mr(long j, InterfaceC332260D0u interfaceC332260D0u) {
        this.LIZ = interfaceC332260D0u;
        this.LIZIZ = j;
    }
}
