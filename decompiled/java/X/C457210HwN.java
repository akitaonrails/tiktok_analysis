package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C457210HwN extends AbstractC457230HwP {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C457210HwN) && Intrinsics.LJFF(this.LIZ, ((C457210HwN) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleChatTargetId(targetUserId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C457210HwN(String str) {
        this.LIZ = str;
    }
}
