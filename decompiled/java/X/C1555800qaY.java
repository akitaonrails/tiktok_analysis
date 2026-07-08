package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qaY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555800qaY {
    public final ECImage LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1555800qaY) && Intrinsics.LJFF(this.LIZ, ((C1555800qaY) obj).LIZ);
    }

    public final int hashCode() {
        ECImage eCImage = this.LIZ;
        if (eCImage == null) {
            return 0;
        }
        return eCImage.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaFlashSaleBuyerInfo(avatar=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1555800qaY(ECImage eCImage) {
        this.LIZ = eCImage;
    }
}
