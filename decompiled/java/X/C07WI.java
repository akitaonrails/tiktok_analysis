package X;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07WI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07WI {
    public final Uri LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07WI)) {
            return false;
        }
        C07WI c07wi = (C07WI) obj;
        return Intrinsics.LJFF(this.LIZ, c07wi.LIZ) && this.LIZIZ == c07wi.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClipboardCopyResult(uri=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isImage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07WI(boolean z, Uri uri) {
        this.LIZ = uri;
        this.LIZIZ = z;
    }
}
