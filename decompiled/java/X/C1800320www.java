package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.touchpoint.api.service.IIncentiveAdService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0www, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1800320www extends AbstractC1800280wws {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        List list;
        InterfaceC1800290wwt interfaceC1800290wwt = (InterfaceC1800290wwt) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        String params = interfaceC1800290wwt.getParams();
        if (params != null && params.length() != 0) {
            try {
                list = (List) C20484080s.LIZIZ().LJIIIIZZ(params, new TypeToken<List<? extends HashMap<String, Object>>>() { // from class: X.00UY
                }.getType());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                list = null;
            }
        } else {
            list = null;
        }
        if (context != null) {
            IIncentiveAdService iIncentiveAdService = (IIncentiveAdService) PluggableExtentionKt.pluggableSpi$default(IIncentiveAdService.class, false, false, false, 14, null);
            if (iIncentiveAdService != null) {
                iIncentiveAdService.LJIIJJI(list);
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1800300wwu.class, null), "");
        }
    }
}
