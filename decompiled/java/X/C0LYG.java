package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LYG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LYG extends C0LYS {
    public final Integer LIZ;

    public C0LYG() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0LYG) && Intrinsics.LJFF(this.LIZ, ((C0LYG) obj).LIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LastGenerationToast(quota=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LYG(Integer num) {
        this.LIZ = num;
    }
}
