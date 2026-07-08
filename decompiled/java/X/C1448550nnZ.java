package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448550nnZ extends AbstractC1448530nnX {
    public final C1656120tCM LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1448550nnZ) && Intrinsics.LJFF(this.LIZ, ((C1448550nnZ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TryRecordOnCameraNotInit(event=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1448550nnZ(C1656120tCM c1656120tCM) {
        this.LIZ = c1656120tCM;
    }
}
