package com.bytedance.android.live.userinfowidget;

import X.C006A;
import com.bytedance.android.livesdk.userinfowidget.LiveToggleWatermarkWidget;
import com.bytedance.android.livesdk.userinfowidget.TryModeUserInfoWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* JADX INFO: loaded from: classes13.dex */
public interface IUserInfoWidgetService extends C006A {
    Class<? extends LiveRecyclableWidget> S92();

    Class<? extends LiveRecyclableWidget> Sp2();

    boolean YI0(Room room);

    LiveToggleWatermarkWidget Yl0();

    TryModeUserInfoWidget sK();
}
