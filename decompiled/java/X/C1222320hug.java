package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1222320hug extends AbstractC1222340hui {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1222320hug) && Intrinsics.LJFF(this.LIZ, ((C1222320hug) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1222320hug(String str) {
        this.LIZ = str;
    }
}
