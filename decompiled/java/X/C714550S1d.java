package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714550S1d extends AbstractC714580S1g {
    public final String LIZ;

    public C714550S1d() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C714550S1d) && Intrinsics.LJFF(this.LIZ, ((C714550S1d) obj).LIZ);
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
        sbLIZ.append("DefaultData(info=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C714550S1d(String str) {
        this.LIZ = str;
    }
}
