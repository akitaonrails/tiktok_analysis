package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailActivity;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.DefaultAddressEditDetailStrategyService;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vXd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746190vXd extends AbstractC1746380vXw<Object> {
    public final AddressEditDetailActivity LLILZIL;
    public final Function0<Unit> LLILZLL;

    @Override // X.AbstractC1746380vXw
    public final IComponentStrategyService LLLIL() {
        return new DefaultAddressEditDetailStrategyService();
    }

    @Override // X.C11DY, X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        return this.LLILZ.LIZIZ(i);
    }

    public C1746190vXd(AddressEditDetailActivity addressEditDetailActivity, String str, AwS570S0100000_26 awS570S0100000_26) {
        super(addressEditDetailActivity, new AbstractC339510DSr<Object>() { // from class: X.0vW1
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(Object obj, Object obj2) {
                return Intrinsics.LJFF(obj, obj2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(Object obj, Object obj2) {
                if ((obj instanceof C1745680vWo) && (obj2 instanceof C1745680vWo)) {
                    return Intrinsics.LJFF(((C1745680vWo) obj).LIZ.key, ((C1745680vWo) obj2).LIZ.key);
                }
                return Intrinsics.LJFF(obj, obj2);
            }
        }, "add_address_and_detail", null, str, 216);
        this.LLILZIL = addressEditDetailActivity;
        this.LLILZLL = awS570S0100000_26;
    }
}
