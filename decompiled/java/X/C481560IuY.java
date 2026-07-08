package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IuY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481560IuY extends AbstractC481570IuZ {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C481560IuY) && Intrinsics.LJFF(this.LIZ, ((C481560IuY) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CancelRandomMatchSucceed(logId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C481560IuY(String str) {
        this.LIZ = str;
    }
}
