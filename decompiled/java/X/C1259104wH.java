package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04wH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1259104wH implements InterfaceC949240aoE {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1259104wH) && Intrinsics.LJFF(this.LIZ, ((C1259104wH) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemovePlayer(playerId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1259104wH(String str) {
        this.LIZ = str;
    }
}
