package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F2E, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F2E {
    public final boolean LIZ;
    public final Bitmap LIZIZ;
    public final boolean LIZJ;

    public C0F2E() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0F2E)) {
            return false;
        }
        C0F2E c0f2e = (C0F2E) obj;
        return this.LIZ == c0f2e.LIZ && Intrinsics.LJFF(this.LIZIZ, c0f2e.LIZIZ) && this.LIZJ == c0f2e.LIZJ;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        Bitmap bitmap = this.LIZIZ;
        return ((iZ2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RevealBlurOverlayState(showBlur=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", blurBitmap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showButton=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0F2E(int i) {
        this(false, null, true);
    }

    public C0F2E(boolean z, Bitmap bitmap, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = bitmap;
        this.LIZJ = z2;
    }

    public static C0F2E LIZ(C0F2E c0f2e, boolean z, Bitmap bitmap, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = c0f2e.LIZ;
        }
        if ((i & 2) != 0) {
            bitmap = c0f2e.LIZIZ;
        }
        if ((i & 4) != 0) {
            z2 = c0f2e.LIZJ;
        }
        c0f2e.getClass();
        return new C0F2E(z, bitmap, z2);
    }
}
