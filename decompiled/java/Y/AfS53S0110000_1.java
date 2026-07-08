package Y;

import X.C044U;
import X.C044Z;
import X.C054G;
import X.C09JN;
import X.C11JF;
import X.C1758120vqs;
import X.C1758140vqu;
import X.C1C7U;
import X.EnumC10382044e;
import X.EnumC10383044f;
import X.EnumC1756020vnU;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SeaSkuPanelData;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS89S0110000_1;

/* JADX INFO: loaded from: classes2.dex */
public class AfS53S0110000_1 implements C09JN {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS53S0110000_1 afS53S0110000_1, Object obj) {
        ProductPackStruct productPackStruct;
        C1C7U.LIZ("ISeaSkuPanelViewModel@3099.getProductInfo$1");
        ProductPackStruct productPackStructLIZ = (ProductPackStruct) obj;
        SeaSkuPanelData seaSkuPanelData = productPackStructLIZ.skuPanelData;
        if (seaSkuPanelData != null && seaSkuPanelData.sellingPointsBubble != null) {
            productPackStruct = productPackStructLIZ;
            productPackStructLIZ = ProductPackStruct.LIZ(productPackStructLIZ, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new SeaSkuPanelData(null, seaSkuPanelData.headerTopLabels, seaSkuPanelData.seaCoreBizDaInfo, seaSkuPanelData.feedbackVoteData), null, null, null, null, null, null, null, null, -1, -1, -513, 2097151);
        } else {
            productPackStruct = productPackStructLIZ;
        }
        String str = productPackStructLIZ.productId;
        if (str != null) {
            productPackStructLIZ.godaProtocolJSON = null;
            C054G c054g = C1758140vqu.LIZ;
            C1758140vqu.LJFF(str, productPackStructLIZ, EnumC1756020vnU.LAST_USED_CACHE, null);
        }
        if (afS53S0110000_1.z1) {
            ((C044Z) afS53S0110000_1.l0).ua0(EnumC10382044e.NORMAL);
        }
        C044U.LJ((C044Z) afS53S0110000_1.l0, productPackStruct, true, afS53S0110000_1.z1);
        ((C044Z) afS53S0110000_1.l0).dispose();
        if (afS53S0110000_1.z1) {
            ((C044Z) afS53S0110000_1.l0).Fk(false);
        }
        C1C7U.LIZIZ("ISeaSkuPanelViewModel@3099.getProductInfo$1");
    }

    public static final void accept$1(AfS53S0110000_1 afS53S0110000_1, Object obj) {
        C1C7U.LIZ("ISeaSkuPanelViewModel@3099.getProductInfo$2");
        ((C044Z) afS53S0110000_1.l0).LJJJZ(AFwS228S0000000_1.get$arr$(359));
        ((C044Z) afS53S0110000_1.l0).dispose();
        if (afS53S0110000_1.z1) {
            ((C044Z) afS53S0110000_1.l0).Fk(false);
            ((C044Z) afS53S0110000_1.l0).LJJJZ(new AwS89S0110000_1(false, EnumC10383044f.FAIL, 12));
        }
        C1C7U.LIZIZ("ISeaSkuPanelViewModel@3099.getProductInfo$2");
    }

    public static final void accept$2(AfS53S0110000_1 afS53S0110000_1, Object obj) {
        C1C7U.LIZ("PdpViewModel@6cb1.realLoadProductionInfo$1$2");
        Throwable th = (Throwable) obj;
        if (!afS53S0110000_1.z1) {
            if (th instanceof C1758120vqs) {
                PdpViewModel.zS2((PdpViewModel) afS53S0110000_1.l0, null, Integer.valueOf(((C1758120vqs) th).getCode()), false, false, false, false, false, false, false, false, 1020);
            } else {
                PdpViewModel.zS2((PdpViewModel) afS53S0110000_1.l0, null, null, false, false, false, false, false, false, false, false, 1020);
            }
        }
        PdpViewModel pdpViewModel = (PdpViewModel) afS53S0110000_1.l0;
        C11JF c11jf = pdpViewModel.k;
        if (c11jf != null) {
            c11jf.dispose();
        }
        pdpViewModel.k = null;
        C1C7U.LIZIZ("PdpViewModel@6cb1.realLoadProductionInfo$1$2");
    }

    public AfS53S0110000_1(Object obj, boolean z, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}
