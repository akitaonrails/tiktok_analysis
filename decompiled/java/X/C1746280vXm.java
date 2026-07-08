package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.DefaultAddressMapDetailStrategyService;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;

/* JADX INFO: renamed from: X.0vXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746280vXm extends AbstractC1746380vXw<Object> {
    public final AddressMapDetailFragment LLILZIL;

    @Override // X.AbstractC1746380vXw
    public final IComponentStrategyService LLLIL() {
        return new DefaultAddressMapDetailStrategyService();
    }

    public C1746280vXm(AddressMapDetailFragment addressMapDetailFragment) {
        super(addressMapDetailFragment, new C1746230vXh(), "trajectory_map_for_address", null, null, 216);
        this.LLILZIL = addressMapDetailFragment;
    }

    @Override // X.C11DY, X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        return this.LLILZ.LIZIZ(i);
    }
}
