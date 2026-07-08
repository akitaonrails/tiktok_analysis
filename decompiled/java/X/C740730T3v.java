package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740730T3v {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C740730T3v)) {
            return false;
        }
        C740730T3v c740730T3v = (C740730T3v) obj;
        return Intrinsics.LJFF(this.LIZ, c740730T3v.LIZ) && Intrinsics.LJFF(this.LIZIZ, c740730T3v.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareImTargetInfo(nickname=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", avatarUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C740730T3v(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
