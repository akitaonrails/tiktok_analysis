package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM;
import java.util.List;

/* JADX INFO: renamed from: X.0QiH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C677790QiH implements InterfaceC677820QiK {
    public final MixShopSearchBizVM LIZ;

    @Override // X.InterfaceC677820QiK
    public final void LIZ(int i, n nVar, boolean z) {
    }

    @Override // X.InterfaceC677820QiK
    public final void LIZIZ(n nVar, C1422405hW c1422405hW, int i, boolean z) {
    }

    @Override // X.InterfaceC677820QiK
    public final void LIZJ(n nVar, C1422405hW c1422405hW, int i, boolean z, long j, long j2) {
    }

    @Override // X.InterfaceC677820QiK
    public final void LIZLLL(int i, String str, Integer num, long j, long j2, long j3) {
    }

    @Override // X.InterfaceC677820QiK
    public final void LJ(int i, n nVar) {
    }

    @Override // X.InterfaceC677820QiK
    public final void LJFF(int i, String str, Integer num, long j, long j2, long j3) {
    }

    @Override // X.InterfaceC677820QiK
    public final void LJI(int i, List<String> list) {
    }

    public C677790QiH(MixShopSearchBizVM mixShopSearchBizVM) {
        this.LIZ = mixShopSearchBizVM;
    }

    @Override // X.InterfaceC677820QiK
    public final void onFailed(Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Skin handling failed: ");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
