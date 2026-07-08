package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;

/* JADX INFO: renamed from: X.045N, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C045N {
    public final ProductPackStruct LIZ;
    public final DeliveryPanelStarter.PackedDeliverySelectResult LIZIZ;
    public final IPdpStarter.PdpEnterParam LIZJ;
    public final boolean LIZLLL;

    public C045N() {
        this(null, null, null, false);
    }

    public C045N(ProductPackStruct productPackStruct, DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult, IPdpStarter.PdpEnterParam pdpEnterParam, boolean z) {
        this.LIZ = productPackStruct;
        this.LIZIZ = packedDeliverySelectResult;
        this.LIZJ = pdpEnterParam;
        this.LIZLLL = z;
    }
}
