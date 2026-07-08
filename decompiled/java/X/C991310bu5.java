package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bu5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991310bu5 extends AbstractC991850bux {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C991310bu5) && Intrinsics.LJFF(this.LIZ, ((C991310bu5) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowFailed(failReason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991310bu5(String str) {
        this.LIZ = str;
    }
}
