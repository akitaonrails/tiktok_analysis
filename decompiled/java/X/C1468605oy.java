package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.series.feed.IMiniDramaSearchHubService;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.05oy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1468605oy extends AbstractC1468705oz {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1468805p0 interfaceC1468805p0 = (InterfaceC1468805p0) xBaseParamModel;
        HashMap map = new HashMap();
        map.put("awemeList", interfaceC1468805p0.getAwemeList());
        map.put("collectionList", interfaceC1468805p0.getCollectionList());
        map.put("uniqueKey", interfaceC1468805p0.getUniqueKey());
        map.put("enableShortDrama", interfaceC1468805p0.getEnableShortDrama());
        IMiniDramaSearchHubService.LIZ.getClass();
        IMiniDramaSearchHubService iMiniDramaSearchHubService = (IMiniDramaSearchHubService) PluggableExtentionKt.pluggableSpi$default(IMiniDramaSearchHubService.class, false, false, false, 14, null);
        if (iMiniDramaSearchHubService == null) {
            iMiniDramaSearchHubService = new IMiniDramaSearchHubService() { // from class: X.04Pr
                @Override // com.ss.android.ugc.aweme.series.feed.IMiniDramaSearchHubService
                public final void LIZ(Map<String, ? extends Object> map2) {
                }
            };
        }
        iMiniDramaSearchHubService.LIZ(map);
    }
}
