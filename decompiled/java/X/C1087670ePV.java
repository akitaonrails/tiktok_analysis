package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ePV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087670ePV {
    public final ImageModel LIZ;
    public final ImageModel LIZIZ;
    public final ImageModel LIZJ;

    public C1087670ePV() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1087670ePV)) {
            return false;
        }
        C1087670ePV c1087670ePV = (C1087670ePV) obj;
        return Intrinsics.LJFF(this.LIZ, c1087670ePV.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1087670ePV.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1087670ePV.LIZJ);
    }

    public final int hashCode() {
        ImageModel imageModel = this.LIZ;
        int iHashCode = (imageModel == null ? 0 : imageModel.hashCode()) * 31;
        ImageModel imageModel2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (imageModel2 == null ? 0 : imageModel2.hashCode())) * 31;
        ImageModel imageModel3 = this.LIZJ;
        return iHashCode2 + (imageModel3 != null ? imageModel3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BubbleDecoration(topLightImage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", haloImage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bottomLightImage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1087670ePV(ImageModel imageModel, ImageModel imageModel2, ImageModel imageModel3) {
        this.LIZ = imageModel;
        this.LIZIZ = imageModel2;
        this.LIZJ = imageModel3;
    }
}
