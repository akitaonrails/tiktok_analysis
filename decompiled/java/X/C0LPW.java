package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LPW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LPW implements C0LPX {
    public final String LIZ = "effect_aigc";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0LPW) && Intrinsics.LJFF(this.LIZ, ((C0LPW) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ByBusinessSource(business=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
