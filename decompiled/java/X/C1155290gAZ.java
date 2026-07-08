package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155290gAZ implements InterfaceC111300bX {
    public final C1743880vTu LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155290gAZ) && Intrinsics.LJFF(this.LL, ((C1155290gAZ) obj).LL);
    }

    public final int hashCode() {
        C1743880vTu c1743880vTu = this.LL;
        if (c1743880vTu == null) {
            return 0;
        }
        return c1743880vTu.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECLivePlaybackEnterData(enterParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155290gAZ(C1743880vTu c1743880vTu) {
        this.LL = c1743880vTu;
    }
}
