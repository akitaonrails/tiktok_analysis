package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AuthorizationDialog;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import kotlin.jvm.internal.AwS0S0020000_1;

/* JADX INFO: renamed from: X.03IA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03IA implements C03LX {
    public final OrderSubmitAssemViewModel LIZ;
    public final ECBaseFragment LIZIZ;

    public C03IA(OrderSubmitAssemViewModel orderSubmitAssemViewModel, ECBaseFragment eCBaseFragment) {
        this.LIZ = orderSubmitAssemViewModel;
        this.LIZIZ = eCBaseFragment;
    }

    @Override // X.C03LX
    public final C03LS LIZIZ(String str, String str2) {
        Context context;
        C03JV state = this.LIZ.getState();
        ECBaseFragment eCBaseFragment = this.LIZIZ;
        if (eCBaseFragment != null && (context = eCBaseFragment.getContext()) != null) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZ;
            BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
            AuthorizationDialog authorizationDialog = null;
            if (billInfoData != null) {
                if (billInfoData.underAgeConfirmDialog != null && !orderSubmitAssemViewModel.LLZZZZ) {
                    if (billInfoData != null) {
                        authorizationDialog = billInfoData.underAgeConfirmDialog;
                    }
                    C1DFH c1dfh = C0PEM.LIZ;
                    C948503nH.LJI(orderSubmitAssemViewModel, C2107308Nj.LIZ.LLIILII(), new C826103Kp(this, context, authorizationDialog, state, null));
                    return C03LS.AGE;
                }
                if (billInfoData != null && billInfoData.ageConfirmModule != null && !state.LLZZZZ.LIZ) {
                    orderSubmitAssemViewModel.setState(new AwS0S0020000_1(false, true, 0));
                    OrderSubmitAssemViewModel.oT2(this.LIZ, "age_confirm_module", true);
                    return C03LS.AGE;
                }
            }
            return null;
        }
        return C03LS.AGE;
    }
}
