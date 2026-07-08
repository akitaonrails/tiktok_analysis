package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tJK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660440tJK {
    public final C375830EoP<Bitmap> LIZ;
    public final C375830EoP<Bitmap> LIZIZ;

    public C1660440tJK() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1660440tJK)) {
            return false;
        }
        C1660440tJK c1660440tJK = (C1660440tJK) obj;
        return Intrinsics.LJFF(this.LIZ, c1660440tJK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1660440tJK.LIZIZ);
    }

    public final int hashCode() {
        C375830EoP<Bitmap> c375830EoP = this.LIZ;
        int iHashCode = (c375830EoP == null ? 0 : c375830EoP.hashCode()) * 31;
        C375830EoP<Bitmap> c375830EoP2 = this.LIZIZ;
        return iHashCode + (c375830EoP2 != null ? c375830EoP2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RevealFakeDualCameraShootState(backgroundBitmapReady=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", foregroundBitmapReady=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1660440tJK(C375830EoP<Bitmap> c375830EoP, C375830EoP<Bitmap> c375830EoP2) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
    }
}
