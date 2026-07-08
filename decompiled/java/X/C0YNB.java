package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YNB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YNB implements C0YNG {
    public final C0YNC LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0YNB) && Intrinsics.LJFF(this.LIZ, ((C0YNB) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuccessWithNoChanges(msgInConvRange=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YNB(C0YNC c0ync) {
        this.LIZ = c0ync;
    }
}
