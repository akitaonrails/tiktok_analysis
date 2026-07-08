package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS2S0800000_1;
import kotlin.jvm.internal.AwS367S0200000_1;

/* JADX INFO: renamed from: X.03ME, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ME extends C1002203vw<OspBottomViewModel> implements C03MH {
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Integer] */
    public final void LIZIZ(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        C259800zU c259800zU = new C259800zU();
        C259800zU c259800zU2 = new C259800zU();
        C259800zU c259800zU3 = new C259800zU();
        c259800zU3.element = 0;
        orderSubmitAssemViewModel.withState(new AwS2S0800000_1(c259800zU, new C259800zU(), this, orderSubmitAssemViewModel, new C259800zU(), c259800zU2, c259800zU3, new C013C(), 0));
    }

    @Override // X.C03MH
    public final void wZ1(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        ECRichText eCRichText;
        ButtonInfo buttonInfo;
        orderSubmitAssemViewModel.withState(new C03MF(new C013C(), this, new C259800zU()));
        LIZIZ(orderSubmitAssemViewModel);
        C013C c013c = new C013C();
        c013c.element = true;
        orderSubmitAssemViewModel.withState(new AwS210S0300000_1(orderSubmitAssemViewModel, this, c013c, 86));
        BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
        if (billInfoData != null && (buttonInfo = billInfoData.ospButtonInfo) != null) {
            eCRichText = buttonInfo.authorizationStatement;
        } else {
            eCRichText = null;
        }
        orderSubmitAssemViewModel.withState(new AwS367S0200000_1(eCRichText, this, 292));
    }

    @Override // X.C03MH
    public final void zx1(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        ECRichText eCRichText;
        ButtonInfo buttonInfo;
        if (orderSubmitAssemViewModel != null) {
            LIZ().setState(AFwS228S0000000_1.get$arr$(716));
            orderSubmitAssemViewModel.withState(new C03MF(new C013C(), this, new C259800zU()));
            LIZIZ(orderSubmitAssemViewModel);
            C013C c013c = new C013C();
            c013c.element = true;
            orderSubmitAssemViewModel.withState(new AwS210S0300000_1(orderSubmitAssemViewModel, this, c013c, 86));
            BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
            if (billInfoData != null && (buttonInfo = billInfoData.ospButtonInfo) != null) {
                eCRichText = buttonInfo.authorizationStatement;
            } else {
                eCRichText = null;
            }
            orderSubmitAssemViewModel.withState(new AwS367S0200000_1(eCRichText, this, 292));
            LIZ().LLILZLL = true;
        }
    }
}
