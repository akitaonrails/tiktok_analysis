package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NUk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C594760NUk {
    public final C05P1<Boolean> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C594760NUk) && Intrinsics.LJFF(this.LIZ, ((C594760NUk) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotificationState(isNotificationEnabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C594760NUk(C05P0 c05p0) {
        this.LIZ = c05p0;
    }
}
