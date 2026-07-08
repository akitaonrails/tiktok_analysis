package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07o8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1973007o8 implements InterfaceC1875007Wa {
    public final Bitmap LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1973007o8)) {
            return false;
        }
        C1973007o8 c1973007o8 = (C1973007o8) obj;
        return Intrinsics.LJFF(this.LIZ, c1973007o8.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1973007o8.LIZIZ);
    }

    public final int hashCode() {
        Bitmap bitmap = this.LIZ;
        return ((bitmap == null ? 0 : bitmap.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(bitmap=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", url=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1973007o8(Bitmap bitmap, String str) {
        this.LIZ = bitmap;
        this.LIZIZ = str;
    }
}
