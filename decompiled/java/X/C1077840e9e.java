package X;

import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.userinfowidget.IUserInfoWidgetService;
import com.bytedance.android.livesdk.userinfowidget.LiveToggleWatermarkWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0e9e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1077840e9e extends AbstractC1081700eFs<Object> {
    public final RecyclableWidgetManager LIZ;
    public final Room LIZIZ;

    @Override // X.AbstractC1081700eFs
    public final Object LIZIZ() {
        LiveToggleWatermarkWidget liveToggleWatermarkWidgetYl0;
        if (((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).vu1(this.LIZIZ) && (liveToggleWatermarkWidgetYl0 = ((IUserInfoWidgetService) C1161920gLG.LIZJ(IUserInfoWidgetService.class)).Yl0()) != null) {
            this.LIZ.load(R.id.n8i, liveToggleWatermarkWidgetYl0);
        }
        return null;
    }

    public C1077840e9e(RecyclableWidgetManager recyclableWidgetManager, Room room) {
        this.LIZ = recyclableWidgetManager;
        this.LIZIZ = room;
    }
}
