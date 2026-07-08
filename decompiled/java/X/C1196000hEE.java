package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0hEE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196000hEE extends AbstractC1196010hEF {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC1196020hEG interfaceC1196020hEG = (InterfaceC1196020hEG) xBaseParamModel;
        Number defaultTime = interfaceC1196020hEG.getDefaultTime();
        String title = interfaceC1196020hEG.getTitle();
        Boolean boolIsTwelveHourFormat = interfaceC1196020hEG.isTwelveHourFormat();
        Boolean boolIsTimeIndicatorSuffix = interfaceC1196020hEG.isTimeIndicatorSuffix();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        ((IPoiService) ServiceManager.get().getService(IPoiService.class)).LJJJJJ(context, defaultTime, title, boolIsTwelveHourFormat, boolIsTimeIndicatorSuffix, new AwS384S0200000_18((InterfaceC1196030hEH) C1909107dp.LIZJ(InterfaceC1196030hEH.class, null), (InterfaceC1196030hEH) completionBlock, (CompletionBlock<InterfaceC1196030hEH>) 177), new AwS562S0100000_18(completionBlock, (CompletionBlock<InterfaceC1196030hEH>) 2443));
    }
}
