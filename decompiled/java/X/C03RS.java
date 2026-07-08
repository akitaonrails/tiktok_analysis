package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: renamed from: X.03RS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03RS {
    public final C03RT LIZ;
    public final BillInfoResponse LIZIZ;
    public final EnumC840403Qc LIZJ;
    public final long LIZLLL;
    public final C03RX LJ;
    public final C03RW LJFF;
    public final C01GW LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LIZ() {
        BillInfoData billInfoData;
        BillInfoData billInfoData2;
        if (this.LIZ == C03RT.PRELOADING) {
            return true;
        }
        BillInfoResponse billInfoResponse = this.LIZIZ;
        boolean zLJIIZILJ = (billInfoResponse == null || (billInfoData2 = (BillInfoData) billInfoResponse.data) == null) ? false : billInfoData2.LJIIZILJ();
        BillInfoResponse billInfoResponse2 = this.LIZIZ;
        return C756302xN.LIZ((billInfoResponse2 == null || (billInfoData = (BillInfoData) billInfoResponse2.data) == null) ? null : billInfoData.newShopOrders) && zLJIIZILJ;
    }

    public C03RS(C03RT c03rt, BillInfoResponse billInfoResponse, EnumC840403Qc enumC840403Qc, C03RX c03rx, C03RW c03rw, int i) {
        long jElapsedRealtime;
        if ((i & 8) != 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        c03rx = (i & 16) != 0 ? null : c03rx;
        c03rw = (i & 32) != 0 ? null : c03rw;
        this.LIZ = c03rt;
        this.LIZIZ = billInfoResponse;
        this.LIZJ = enumC840403Qc;
        this.LIZLLL = jElapsedRealtime;
        this.LJ = c03rx;
        this.LJFF = c03rw;
        this.LJI = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(536));
    }
}
