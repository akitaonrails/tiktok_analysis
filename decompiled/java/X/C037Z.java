package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.037Z, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C037Z extends C035N<C729602t4> implements InterfaceC765602ys {
    public final OrderSubmitAssemViewModel LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 9));
    public final long LJ = SystemClock.elapsedRealtime();

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C729602t4(0);
    }

    @Override // X.C035N, X.InterfaceC2257711DYj
    public final void onStop() {
        Map<String, Object> mapLJJI;
        if (C036A.LIZIZ()) {
            C03O0.LIZ.getClass();
            C03O0.LJ = SystemClock.elapsedRealtime();
            this.LIZJ.LLJZ = "close";
            C03O0.LJJLIIJ("close");
        }
        if (C904203g8.LJIIJ) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_edit_quantity", Integer.valueOf(this.LIZJ.LLLIIIIL ? 1 : 0));
        linkedHashMap.put("quit_type", this.LIZJ.LLJZ);
        linkedHashMap.put("stay_time", Long.valueOf(SystemClock.elapsedRealtime() - this.LJ));
        linkedHashMap.put("is_load_data", Integer.valueOf(this.LIZJ.LLJLL ? 1 : 0));
        InterfaceC7908037a interfaceC7908037a = (InterfaceC7908037a) this.LIZLLL.getValue();
        if (interfaceC7908037a != null && (mapLJJI = interfaceC7908037a.LJJI()) != null) {
            linkedHashMap.putAll(mapLJJI);
        }
        C038N.LIZ(linkedHashMap, this.LIZJ.LLLZLZ.LJIIJ());
    }

    public C037Z(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }

    @Override // X.C035N, X.C036G
    public final void LJJJJZ(PaymentInfo paymentInfo, BillInfoData billInfoData, boolean z) {
        Map mapLJJII;
        if (z) {
            Boolean bool = billInfoData.LIZ;
            Boolean bool2 = Boolean.TRUE;
            if (!Intrinsics.LJFF(bool, bool2) || Intrinsics.LJFF(billInfoData.lastChunk, bool2)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                InterfaceC7908037a interfaceC7908037a = (InterfaceC7908037a) this.LIZLLL.getValue();
                if (interfaceC7908037a != null && (mapLJJII = interfaceC7908037a.LJJII()) != null) {
                    linkedHashMap.putAll(mapLJJII);
                }
                C038N.LIZ(linkedHashMap, this.LIZJ.LLLZLZ.LJIIJ());
            }
        }
    }
}
