package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.007O, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C007O {
    public final Set<Long> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C007O) && Intrinsics.LJFF(this.LIZ, ((C007O) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupChatReadStatus(readers=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C007O(Set<Long> set) {
        this.LIZ = set;
    }
}
