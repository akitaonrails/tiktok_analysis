package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LYF, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LYF extends C0LYS {
    public final Integer LIZ;

    public C0LYF() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0LYF) && Intrinsics.LJFF(this.LIZ, ((C0LYF) obj).LIZ);
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
        sbLIZ.append("GenerationLimitToast(quota=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LYF(Integer num) {
        this.LIZ = num;
    }
}
