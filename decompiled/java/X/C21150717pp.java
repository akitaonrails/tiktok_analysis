package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17pp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21150717pp extends AbstractC21150817pq {
    public final InterfaceC20638715pR LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21150717pp) && Intrinsics.LJFF(this.LIZ, ((C21150717pp) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatrixMismatch(questionnaire=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C21150717pp(InterfaceC20638715pR interfaceC20638715pR) {
        this.LIZ = interfaceC20638715pR;
    }
}
