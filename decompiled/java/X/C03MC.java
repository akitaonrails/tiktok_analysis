package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlaceOrderButtonInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;

/* JADX INFO: renamed from: X.03MC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03MC extends C1002203vw<OspBottomViewModel> implements C03MH {
    public static C03MQ LIZIZ(PlaceOrderButtonInfo placeOrderButtonInfo) {
        return new C03MQ(placeOrderButtonInfo.buttonText, placeOrderButtonInfo.buttonTextRichText, placeOrderButtonInfo.subtextArea, null, null, 24);
    }

    @Override // X.C03MH
    public final void wZ1(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        ECRichText eCRichText;
        ButtonInfo buttonInfo;
        orderSubmitAssemViewModel.withState(new C03MB(new C118300cf(), new C013C(), this, new C259800zU()));
        C013C c013c = new C013C();
        c013c.element = true;
        orderSubmitAssemViewModel.withState(new AwS210S0300000_1(orderSubmitAssemViewModel, this, c013c, 84));
        BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
        if (billInfoData != null && (buttonInfo = billInfoData.ospButtonInfo) != null) {
            eCRichText = buttonInfo.authorizationStatement;
        } else {
            eCRichText = null;
        }
        orderSubmitAssemViewModel.withState(new AwS367S0200000_1(eCRichText, this, 291));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Integer] */
    @Override // X.C03MH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zx1(com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r24) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03MC.zx1(com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel):void");
    }
}
