package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XdP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853130XdP implements InterfaceC853100XdM {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C853130XdP) && Intrinsics.LJFF(this.LIZ, ((C853130XdP) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClickResendEmailCodeActionParams(email=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C853130XdP(String str) {
        this.LIZ = str;
    }
}
