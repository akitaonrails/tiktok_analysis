package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gET, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157710gET extends AbstractC1157700gES {
    public final C1157720gEU LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1157710gET) && Intrinsics.LJFF(this.LIZ, ((C1157710gET) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Photo(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157710gET(C1157720gEU c1157720gEU) {
        this.LIZ = c1157720gEU;
    }
}
