package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.037O, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C037O implements C03LX {
    public final OrderSubmitAssemViewModel LIZ;
    public final ECBaseFragment LIZIZ;
    public final OspAddressViewModel LIZJ;

    @Override // X.C03LX
    public final C03LS LIZIZ(String str, String str2) {
        Object obj;
        ExceptionUX exceptionUX = this.LIZ.LLJJIII;
        if (exceptionUX == null || (obj = exceptionUX.triggerType) == null) {
            obj = EnumC804403Cg.DEFAULT;
        }
        if (Intrinsics.LJFF(obj, Integer.valueOf(EnumC804403Cg.POST.getValue()))) {
            C0CNO.LIZLLL(0L, new AwS545S0100000_1(this, 1754));
            return C03LS.EXCEPTION_UX;
        }
        return null;
    }

    public C037O(OrderSubmitAssemViewModel orderSubmitAssemViewModel, ECBaseFragment eCBaseFragment, OspAddressViewModel ospAddressViewModel) {
        this.LIZ = orderSubmitAssemViewModel;
        this.LIZIZ = eCBaseFragment;
        this.LIZJ = ospAddressViewModel;
    }
}
