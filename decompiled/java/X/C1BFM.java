package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;

/* JADX INFO: renamed from: X.1BFM, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BFM extends C1BFK {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C1BFL c1bfl = (C1BFL) xBaseParamModel;
        String center = c1bfl.getCenter();
        Number imageWidth = c1bfl.getImageWidth();
        Number imageHeight = c1bfl.getImageHeight();
        String markers = c1bfl.getMarkers();
        String scale = c1bfl.getScale();
        String style = c1bfl.getStyle();
        String maptype = c1bfl.getMaptype();
        C1BFN c1bfn = (C1BFN) C1909107dp.LIZJ(C1BFN.class, null);
        c1bfn.setStaticMapURL(((IPoiService) ServiceManager.get().getService(IPoiService.class)).LJLIL(center, ((Integer) imageWidth).intValue(), ((Integer) imageHeight).intValue(), markers, scale, maptype, style, null));
        completionBlock.onSuccess(c1bfn, "");
    }
}
