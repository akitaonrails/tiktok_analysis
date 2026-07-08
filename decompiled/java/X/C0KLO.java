package X;

import com.bytedance.android.pgc.wallet.base.subscribe.PGCCreateContractResult;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0KLO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KLO extends AbstractC516150KMb<PGCCreateContractResult> {
    public final /* synthetic */ C516490KNj LIZ;

    public C0KLO(C516490KNj c516490KNj) {
        this.LIZ = c516490KNj;
    }

    public final C11NZ LJ(C0KFM c0kfm) {
        C11NZ<DataResponse<PGCCreateContractResult>> c11nzLIZ = C0KLQ.LIZ().LIZ(c0kfm.LJIIIZ, c0kfm.LJIL, c0kfm.LJJ, TimeZone.getDefault().getID(), c0kfm.LJIJI, c0kfm.LJJIFFI, Boolean.valueOf(c0kfm.LJIIJ), c0kfm.LJIJ, c0kfm.LJIIZILJ, C0KL8.LIZ(true), c0kfm.LJJIIZI, c0kfm.LJJIJ, c0kfm.LJIILIIL, C515950KLh.LJFF(), C2097608Jq.LJIIZILJ(this.LIZ.LIZIZ.LIZIZ));
        if (c11nzLIZ != null) {
            return C0JCK.LIZ(c11nzLIZ, EnumC499440JiI.GENERAL, c0kfm.LIZLLL, "sub/contract/create", null, 8).LJIILIIL(new C0UJ2());
        }
        return null;
    }
}
