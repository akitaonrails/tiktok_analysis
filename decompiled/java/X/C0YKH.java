package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YKH, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YKH extends C0YKN {
    public final C0YKK LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0YKH) && Intrinsics.LJFF(this.LIZ, ((C0YKH) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnWsMessageReceived(newMsgNotifyBufferItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YKH(C0YKK c0ykk) {
        this.LIZ = c0ykk;
    }
}
