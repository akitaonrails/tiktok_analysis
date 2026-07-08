package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;

/* JADX INFO: renamed from: X.1506, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1506 extends AnonymousClass1509 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        AnonymousClass1508 anonymousClass1508 = (AnonymousClass1508) xBaseParamModel;
        String formattedAddress = anonymousClass1508.getFormattedAddress();
        IPoiService iPoiService = (IPoiService) ServiceManager.get().getService(IPoiService.class);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        iPoiService.LJLL(context, null, null, anonymousClass1508.getPoiName(), formattedAddress, null, null, null, null);
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(AnonymousClass1507.class, null), "");
    }
}
