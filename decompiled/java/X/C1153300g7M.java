package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g7M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153300g7M implements C18VI {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1153300g7M) && Intrinsics.LJFF(this.LIZ, ((C1153300g7M) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CopyAction(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1153300g7M(String str) {
        this.LIZ = str;
    }
}
