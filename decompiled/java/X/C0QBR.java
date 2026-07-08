package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.Map;

/* JADX INFO: renamed from: X.0QBR, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QBR extends AbstractC1476805qI {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Integer num;
        Map<String, Object> loadMoreParams = ((InterfaceC1476905qJ) xBaseParamModel).getLoadMoreParams();
        Object obj = loadMoreParams.get("cursor");
        View view = null;
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
        }
        IEcomSearchService iEcomSearchServiceLIZ = C315220CXg.LIZ();
        if (view != null) {
            C948503nH.LJII(view, new C0QBS(loadMoreParams, num, view, this, completionBlock, iEcomSearchServiceLIZ, null));
        }
    }
}
