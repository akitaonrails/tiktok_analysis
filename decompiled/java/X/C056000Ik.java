package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Ik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C056000Ik implements InterfaceC056100Il {
    public final C056400Io LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C056000Ik) && Intrinsics.LJFF(this.LIZ, ((C056000Ik) obj).LIZ);
    }

    public final int hashCode() {
        C056400Io c056400Io = this.LIZ;
        if (c056400Io == null) {
            return 0;
        }
        return c056400Io.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(categoryInfoModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C056000Ik(C056400Io c056400Io) {
        this.LIZ = c056400Io;
    }
}
