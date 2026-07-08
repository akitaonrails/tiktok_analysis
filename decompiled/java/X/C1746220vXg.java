package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;

/* JADX INFO: renamed from: X.0vXg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746220vXg extends AbstractC1746380vXw<Object> {
    public final AddressEditFragment LLILZIL;

    @Override // X.AbstractC1746380vXw
    public final IComponentStrategyService LLLIL() {
        return new DefaultAddressEditStrategyService();
    }

    @Override // X.C11DY, X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        return this.LLILZ.LIZIZ(i);
    }

    public C1746220vXg(AddressEditFragment addressEditFragment, String str) {
        super(addressEditFragment, new C1746230vXh(), "shipping_address", null, str, 216);
        this.LLILZIL = addressEditFragment;
    }
}
