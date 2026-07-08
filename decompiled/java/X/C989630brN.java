package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0brN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989630brN extends AbstractC989640brO {
    public final String LIZ;

    public C989630brN() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C989630brN) && Intrinsics.LJFF(this.LIZ, ((C989630brN) obj).LIZ);
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
        sbLIZ.append("Empty(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C989630brN(String str) {
        this.LIZ = str;
    }
}
