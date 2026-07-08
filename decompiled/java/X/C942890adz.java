package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0adz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942890adz extends AbstractC942990ae9 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C942890adz) && Intrinsics.LJFF(this.LIZ, ((C942890adz) obj).LIZ);
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
        sbLIZ.append("TotalPlayGameOver(wallpaperUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C942890adz(String str) {
        this.LIZ = str;
    }
}
