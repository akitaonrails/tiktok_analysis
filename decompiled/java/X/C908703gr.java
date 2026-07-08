package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.SeaOneStepOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS3S2102000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS86S1000000_1;

/* JADX INFO: renamed from: X.03gr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C908703gr {
    public final /* synthetic */ SeaOneStepOrderSubmitFragment LIZ;

    public final Map<String, Object> LIZIZ() {
        return this.LIZ.bS().LLLIL;
    }

    public C908703gr(SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment) {
        this.LIZ = seaOneStepOrderSubmitFragment;
    }

    public final Map<String, Object> LIZ(String str) {
        return this.LIZ.bS().LLLZLZ.LIZ(str);
    }

    public final void LIZJ(int i, int i2, String str) {
        String str2;
        List<ShopOrderNew> list;
        ShopOrderNew shopOrderNew;
        List<MainOrderInfo> list2;
        MainOrderInfo mainOrderInfo;
        List<PackedSku> list3;
        PackedSku packedSku;
        BillInfoData billInfoData = this.LIZ.bS().LLJJI;
        if (billInfoData != null && (list = billInfoData.newShopOrders) != null && (shopOrderNew = (ShopOrderNew) C13LP.LJJJLL(list)) != null && (list2 = shopOrderNew.mainOrderInfos) != null && (mainOrderInfo = (MainOrderInfo) C13LP.LJJJLL(list2)) != null && (list3 = mainOrderInfo.packedSkus) != null && (packedSku = (PackedSku) C13LP.LJJJLL(list3)) != null) {
            str2 = packedSku.sellerId;
        } else {
            str2 = null;
        }
        C736680Sv4.LJIJJ(this.LIZ.aS(), new AwS3S2102000_1(this.LIZ, str2, i, i2, str, 1));
    }

    public final void LIZLLL(String str, AbstractC1748750vbl abstractC1748750vbl, Function0<? extends Map<String, ? extends Object>> function0, EnumC1011903xV enumC1011903xV, View view, String str2) {
        if (!this.LIZ.aS().LL) {
            return;
        }
        Map<String, ? extends Object> mapInvoke = function0.invoke();
        int i = C1011803xU.LIZ[enumC1011903xV.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (str != null) {
                        C1018703yb.LIZIZ(str, mapInvoke);
                        return;
                    }
                    return;
                }
                throw new C1954807lC();
            }
            if (abstractC1748750vbl == null || view == null) {
                return;
            }
            C1748720vbi.LJFF(view, abstractC1748750vbl, new AwS86S1000000_1(str2, 25), new AwS580S0100000_1(mapInvoke, (Map<Integer, String>) 1025));
            return;
        }
        if (abstractC1748750vbl == null || view == null) {
            return;
        }
        C1748720vbi.LIZLLL(view, abstractC1748750vbl, new AwS580S0100000_1(mapInvoke, (Map<Integer, String>) 1024));
    }
}
