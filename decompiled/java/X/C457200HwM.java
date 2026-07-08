package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HwM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C457200HwM extends AbstractC457230HwP {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C457200HwM) && Intrinsics.LJFF(this.LIZ, ((C457200HwM) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupChatTargetId(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C457200HwM(String str) {
        this.LIZ = str;
    }
}
