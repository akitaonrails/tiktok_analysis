package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LhV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549910LhV {
    public final String LIZ;
    public final Drawable LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final String LJ;

    public C549910LhV() {
        this(null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C549910LhV)) {
            return false;
        }
        C549910LhV c549910LhV = (C549910LhV) obj;
        return Intrinsics.LJFF(this.LIZ, c549910LhV.LIZ) && Intrinsics.LJFF(this.LIZIZ, c549910LhV.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c549910LhV.LIZJ) && this.LIZLLL == c549910LhV.LIZLLL && Intrinsics.LJFF(this.LJ, c549910LhV.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Drawable drawable = this.LIZIZ;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        String str3 = this.LJ;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoBackgroundState(backgroundImageUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", placeHolderDrawable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", videoUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showOverlayLottie=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", lottieResFilePath=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C549910LhV(String str, int i) {
        boolean z;
        String str2 = (i & 1) != 0 ? null : str;
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(str2, null, null, z, null);
    }

    public C549910LhV(String str, Drawable drawable, String str2, boolean z, String str3) {
        this.LIZ = str;
        this.LIZIZ = drawable;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = str3;
    }
}
