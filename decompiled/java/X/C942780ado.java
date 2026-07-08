package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ado, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942780ado extends AbstractC942990ae9 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C942780ado) && Intrinsics.LJFF(this.LIZ, ((C942780ado) obj).LIZ);
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
        sbLIZ.append("ApplyWallpaperFailed(errMsg=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C942780ado(String str) {
        this.LIZ = str;
    }
}
