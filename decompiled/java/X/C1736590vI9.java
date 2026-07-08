package X;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vI9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1736590vI9 extends AbstractC1736670vIH {
    public final String LIZ;
    public final Uri LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1736590vI9)) {
            return false;
        }
        C1736590vI9 c1736590vI9 = (C1736590vI9) obj;
        return Intrinsics.LJFF(this.LIZ, c1736590vI9.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1736590vI9.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Uri uri = this.LIZIZ;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditSuccess(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", newImageUri=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1736590vI9(Uri uri, String str) {
        this.LIZ = str;
        this.LIZIZ = uri;
    }
}
