package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aeQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C943160aeQ extends AbstractC942990ae9 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C943160aeQ) && Intrinsics.LJFF(this.LIZ, ((C943160aeQ) obj).LIZ);
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
        sbLIZ.append("CreateWallpaperFailed(errMsg=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C943160aeQ(String str) {
        this.LIZ = str;
    }
}
