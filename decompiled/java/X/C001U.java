package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.001U, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C001U {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C001U)) {
            return false;
        }
        obj.getClass();
        return Intrinsics.LJFF(null, null) && Intrinsics.LJFF(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefreshRequest(trigger=");
        sbLIZ.append((String) null);
        sbLIZ.append(", forceInsertAid=");
        sbLIZ.append((String) null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
