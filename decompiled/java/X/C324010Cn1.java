package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.ug.ordercenter.services.OrderCenterGuideDialogApi;
import com.ss.android.ugc.aweme.ecommerce.ug.ordercenter.services.OrderCenterGuideDialogRepository;
import com.ss.android.ugc.aweme.ecommerce.ug.ordercenter.services.ReportTradeEntranceRequest;

/* JADX INFO: renamed from: X.0Cn1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C324010Cn1 implements OrderCenterGuideDialogRepository.OrderCenterGuideDialogOperator {
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.ordercenter.services.OrderCenterGuideDialogRepository.OrderCenterGuideDialogOperator
    public final Object getInboxEntranceInfo(ReportTradeEntranceRequest reportTradeEntranceRequest, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn) {
        OrderCenterGuideDialogApi.LIZ.getClass();
        return C324020Cn2.LIZIZ.getValue().getInboxEntranceInfo(reportTradeEntranceRequest, interfaceC1364105Vn);
    }
}
