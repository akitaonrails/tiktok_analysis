package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i83, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230610i83 {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1230610i83)) {
            return false;
        }
        C1230610i83 c1230610i83 = (C1230610i83) obj;
        return Intrinsics.LJFF(this.LIZ, c1230610i83.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1230610i83.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteInfo(source=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inviteId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1230610i83(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
