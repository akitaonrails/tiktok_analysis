package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xH2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812780xH2 extends AbstractC1812820xH6 {
    public final C1812850xH9 LIZ;
    public final Bitmap LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1812780xH2)) {
            return false;
        }
        C1812780xH2 c1812780xH2 = (C1812780xH2) obj;
        return Intrinsics.LJFF(this.LIZ, c1812780xH2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1812780xH2.LIZIZ) && this.LIZJ == c1812780xH2.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Bitmap bitmap = this.LIZIZ;
        return ((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddBoard(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bitmap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFromCapsule=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1812780xH2(C1812850xH9 c1812850xH9, Bitmap bitmap, boolean z) {
        this.LIZ = c1812850xH9;
        this.LIZIZ = bitmap;
        this.LIZJ = z;
    }
}
