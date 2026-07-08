package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XdT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853170XdT implements InterfaceC853190XdV {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C853170XdT) && Intrinsics.LJFF(this.LIZ, ((C853170XdT) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClickSendCodeActionParams(email=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C853170XdT(String str) {
        this.LIZ = str;
    }
}
