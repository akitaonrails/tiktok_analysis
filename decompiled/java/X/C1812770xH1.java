package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xH1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812770xH1 extends AbstractC1812820xH6 {
    public final C1812850xH9 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1812770xH1) && Intrinsics.LJFF(this.LIZ, ((C1812770xH1) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditBoard(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1812770xH1(C1812850xH9 c1812850xH9) {
        this.LIZ = c1812850xH9;
    }
}
