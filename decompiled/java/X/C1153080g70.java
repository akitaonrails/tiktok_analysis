package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g70, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153080g70 {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1153080g70)) {
            return false;
        }
        C1153080g70 c1153080g70 = (C1153080g70) obj;
        return Intrinsics.LJFF(this.LIZ, c1153080g70.LIZ) && this.LIZIZ == c1153080g70.LIZIZ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Snapshot(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", allowListValue=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1153080g70(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
