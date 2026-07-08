package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.031h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7759031h implements C033V {
    public final BillInfoData LIZ;
    public final String LIZIZ;

    public C7759031h() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7759031h) && Intrinsics.LJFF(this.LIZ, ((C7759031h) obj).LIZ);
    }

    public final int hashCode() {
        BillInfoData billInfoData = this.LIZ;
        if (billInfoData == null) {
            return 0;
        }
        return billInfoData.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WaistBannerBO(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C033V
    public final String getName() {
        return this.LIZIZ;
    }

    public C7759031h(BillInfoData billInfoData) {
        this.LIZ = billInfoData;
        this.LIZIZ = "WaistBannerBO";
    }
}
