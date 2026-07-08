package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06ld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1702706ld extends AbstractC1702506lb {
    public final C1711306n1 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1702706ld) && Intrinsics.LJFF(this.LIZ, ((C1702706ld) obj).LIZ);
    }

    public final int hashCode() {
        C1711306n1 c1711306n1 = this.LIZ;
        if (c1711306n1 == null) {
            return 0;
        }
        return c1711306n1.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnSyncConversationEvent(convSyncEvent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1702706ld(C1711306n1 c1711306n1) {
        this.LIZ = c1711306n1;
    }
}
