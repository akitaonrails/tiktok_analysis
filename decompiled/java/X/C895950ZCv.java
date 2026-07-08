package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895950ZCv extends AbstractC895980ZCy {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C895950ZCv) && Intrinsics.LJFF(this.LIZ, ((C895950ZCv) obj).LIZ);
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
        sbLIZ.append("MsgRequestLabel(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C895950ZCv(String str) {
        this.LIZ = str;
    }
}
