package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponseData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04A2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04A2 {
    public final BundleInfoResponseData LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C04A2) && Intrinsics.LJFF(this.LIZ, ((C04A2) obj).LIZ);
    }

    public final int hashCode() {
        BundleInfoResponseData bundleInfoResponseData = this.LIZ;
        if (bundleInfoResponseData == null) {
            return 0;
        }
        return bundleInfoResponseData.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaBundleDealVO(bundleDealData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C04A2(BundleInfoResponseData bundleInfoResponseData) {
        this.LIZ = bundleInfoResponseData;
    }
}
