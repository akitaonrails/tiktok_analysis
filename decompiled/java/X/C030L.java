package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.030L, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C030L implements C033V {
    public final BillInfoData LIZ;
    public final String LIZIZ;

    public C030L() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C030L) && Intrinsics.LJFF(this.LIZ, ((C030L) obj).LIZ);
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
        sbLIZ.append("BonusModuleBO(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C033V
    public final String getName() {
        return this.LIZIZ;
    }

    public C030L(BillInfoData billInfoData) {
        this.LIZ = billInfoData;
        this.LIZIZ = "BonusModuleBO";
    }
}
