package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.ShopChunkResponse;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.StoreApi;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0vMI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1739160vMI implements InterfaceC1166330gSN<C0POE<ShopChunkResponse>> {
    public final Map<String, Object> LIZ;
    public final AtomicReference<C1739170vMJ> LIZIZ = new AtomicReference<>(null);

    @Override // X.InterfaceC1166330gSN
    public final void LIZ() {
        C1739170vMJ c1739170vMJ = this.LIZIZ.get();
        if (c1739170vMJ != null) {
            c1739170vMJ.LIZ.cancel();
            C1166490gSd c1166490gSd = c1739170vMJ.LIZLLL;
            c1166490gSd.LIZJ.clear();
            c1166490gSd.LIZLLL = null;
            c1166490gSd.LJI = 0;
        }
        this.LIZIZ.set(null);
    }

    public C1739160vMI(Map<String, Object> map) {
        this.LIZ = map;
    }

    @Override // X.InterfaceC1166330gSN
    public final void LIZIZ(n nVar) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1739150vMH(nVar, this, null), 2);
    }

    public final C1739170vMJ LIZLLL(n nVar, boolean z) {
        if (nVar == null) {
            return null;
        }
        C0X9S<C1515820pY4<ShopChunkResponse>> shopChunkData = ((StoreApi) C0NSL.LIZ().create(StoreApi.class)).getShopChunkData(nVar);
        Map<String, Object> map = this.LIZ;
        map.put("request_type", Integer.valueOf(z ? 1 : 0));
        return new C1739170vMJ(shopChunkData, map, z);
    }

    @Override // X.InterfaceC1166330gSN
    public final void LIZJ(n nVar, boolean z, C1166360gSQ c1166360gSQ) {
        C1166490gSd c1166490gSd;
        if (z) {
            C1739170vMJ c1739170vMJ = this.LIZIZ.get();
            if (c1739170vMJ != null) {
                c1739170vMJ.LIZ.cancel();
                C1166490gSd c1166490gSd2 = c1739170vMJ.LIZLLL;
                c1166490gSd2.LIZJ.clear();
                c1166490gSd2.LIZLLL = null;
                c1166490gSd2.LJI = 0;
            }
            C1739170vMJ c1739170vMJLIZLLL = LIZLLL(nVar, z);
            if (c1739170vMJLIZLLL != null) {
                this.LIZIZ.set(c1739170vMJLIZLLL);
                c1739170vMJLIZLLL.LIZLLL.LIZ(c1166360gSQ);
                c1739170vMJLIZLLL.LIZ();
                return;
            }
            c1166360gSQ.onFailed(new RuntimeException("request not found"));
            return;
        }
        if (this.LIZIZ.get() == null) {
            this.LIZIZ.set(LIZLLL(nVar, z));
        }
        C1739170vMJ c1739170vMJ2 = this.LIZIZ.get();
        if (c1739170vMJ2 != null && (c1166490gSd = c1739170vMJ2.LIZLLL) != null) {
            c1166490gSd.LIZ(c1166360gSQ);
        } else {
            c1166360gSQ.onFailed(new RuntimeException("chunkRequestTask not found"));
        }
    }
}
