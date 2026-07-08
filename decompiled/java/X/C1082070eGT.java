package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.livesetting.gift.ViewerWishesConfig;
import com.bytedance.android.livesdk.viewerwishes.widget.ViewerWishesWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eGT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1082070eGT extends AbstractC1081700eFs<Object> {
    public final RecyclableWidgetManager LIZ;

    @Override // X.AbstractC1081700eFs
    public final Object LIZIZ() {
        InterfaceC949480aoc viewerWishesService;
        ViewerWishesWidget viewerWishesWidgetLIZJ;
        if (ViewerWishesConfig.INSTANCE.getGetValue().audienceEnabled && (viewerWishesService = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getViewerWishesService()) != null && (viewerWishesWidgetLIZJ = viewerWishesService.LIZJ()) != null) {
            this.LIZ.load(R.id.viewer_wishes_container, viewerWishesWidgetLIZJ);
        }
        return null;
    }

    public C1082070eGT(RecyclableWidgetManager recyclableWidgetManager) {
        this.LIZ = recyclableWidgetManager;
    }
}
