package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LPG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LPG implements C0LPX {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0LPG) && Intrinsics.LJFF(this.LIZ, ((C0LPG) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ByServerTaskId(serverTaskId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LPG(String str) {
        this.LIZ = str;
    }
}
