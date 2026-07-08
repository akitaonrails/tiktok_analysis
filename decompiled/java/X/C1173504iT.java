package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04iT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1173504iT implements InterfaceC1704540uSS {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1173504iT) && Intrinsics.LJFF(this.LIZ, ((C1173504iT) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OwnerStop(sceneName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1173504iT(String str) {
        this.LIZ = str;
    }
}
