package X;

import android.graphics.Paint;
import android.graphics.RectF;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368310EcH {
    public final NLEResType LIZ;
    public final RectF LIZIZ;
    public final Paint LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C368310EcH)) {
            return false;
        }
        C368310EcH c368310EcH = (C368310EcH) obj;
        return this.LIZ == c368310EcH.LIZ && Intrinsics.LJFF(this.LIZIZ, c368310EcH.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c368310EcH.LIZJ) && this.LIZLLL == c368310EcH.LIZLLL && this.LJ == c368310EcH.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaskConfig(animType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", animRectF=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", paint=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", needStartCorner=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", needEndCorner=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C368310EcH() {
        this(NLEResType.NONE, new RectF(), new Paint(), false, false);
    }

    public C368310EcH(NLEResType nLEResType, RectF rectF, Paint paint, boolean z, boolean z2) {
        this.LIZ = nLEResType;
        this.LIZIZ = rectF;
        this.LIZJ = paint;
        this.LIZLLL = z;
        this.LJ = z2;
    }
}
