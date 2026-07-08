package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.address.DefaultAddressSelectStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectFragment;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;

/* JADX INFO: renamed from: X.03qa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C969003qa extends AbstractC1746380vXw<Object> {
    public final AddressSelectFragment LLILZIL;

    @Override // X.AbstractC1746380vXw
    public final IComponentStrategyService LLLIL() {
        return new DefaultAddressSelectStrategyService();
    }

    @Override // X.C11DY, X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        return this.LLILZ.LIZIZ(i);
    }

    public C969003qa(AddressSelectFragment addressSelectFragment, Integer num) {
        super(addressSelectFragment, null, "logistics_address", num, null, 242);
        this.LLILZIL = addressSelectFragment;
    }
}
