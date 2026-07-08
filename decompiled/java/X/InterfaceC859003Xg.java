package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelLayoutRequest;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelResponse;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetRecommendDataRequest;

/* JADX INFO: renamed from: X.03Xg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC859003Xg {
    public static final C859303Xj LIZ = C859303Xj.LIZ;

    @InterfaceC1501240pAY("/api/v1/shop/recommend/feed/generic_feed")
    Object LIZ(@C040I GetRecommendDataRequest getRecommendDataRequest, InterfaceC1364105Vn<? super n> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/addon/get_panel_layout")
    Object LIZIZ(@C040I GetAddonPanelLayoutRequest getAddonPanelLayoutRequest, InterfaceC1364105Vn<? super GetAddonPanelResponse> interfaceC1364105Vn);
}
