package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaFeature;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04Bp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1057504Bp {
    public final Image LIZ;
    public final String LIZIZ;
    public final MediaFeature LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1057504Bp)) {
            return false;
        }
        C1057504Bp c1057504Bp = (C1057504Bp) obj;
        return Intrinsics.LJFF(this.LIZ, c1057504Bp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1057504Bp.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1057504Bp.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        MediaFeature mediaFeature = this.LIZJ;
        return iHashCode2 + (mediaFeature != null ? mediaFeature.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageWrapper(image=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", category=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mediaFeature=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1057504Bp(Image image, String str, MediaFeature mediaFeature, int i) {
        str = (i & 2) != 0 ? null : str;
        mediaFeature = (i & 4) != 0 ? null : mediaFeature;
        this.LIZ = image;
        this.LIZIZ = str;
        this.LIZJ = mediaFeature;
    }
}
