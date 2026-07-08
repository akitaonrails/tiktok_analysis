package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;

/* JADX INFO: renamed from: X.030K, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C030K implements C033V {
    public final BillInfoData LIZ;
    public final String LIZIZ;

    public C030K() {
        this(null, 31);
    }

    @Override // X.C033V
    public final String getName() {
        return this.LIZIZ;
    }

    public C030K(BillInfoData billInfoData, int i) {
        this.LIZ = (i & 1) != 0 ? null : billInfoData;
        this.LIZIZ = "OrderSummaryBO";
    }
}
