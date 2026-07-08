package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01r7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C462701r7 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C462701r7) && Intrinsics.LJFF(this.LIZ, ((C462701r7) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoticeboardCreateAndUpdateInfo(mediaNodeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C462701r7(String str) {
        this.LIZ = str;
    }
}
