package com.bytedance.android.live.liveinteract.gamelink.widget;

import X.C01GW;
import X.C0IPN;
import X.C1143680frq;
import X.C452501pT;
import X.C786410Ut5;
import Y.ACListenerS150S0100000_15;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkGuestNumChannel;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkMicViewSmallStyle;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class GameLinkMicStyleSwitchWidget extends LiveWidget {
    public final C01GW LL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 125));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i01;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final ImageView x1() {
        return (ImageView) this.LL.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        y1(true);
        C786410Ut5.Q7(x1(), new ACListenerS150S0100000_15(this, 44));
        this.dataChannel.BQ2(this, GameLinkGuestNumChannel.class, new AwS594S0100000_15(this, 115));
    }

    public final void y1(boolean z) {
        x1().setSelected(z);
        if (z) {
            C1143680frq.LIZLLL(x1(), C0IPN.LIZ("tiktok_live_link_mic", "tiktok_live_game_demand_1"), "ttlive_game_link_mic_switch2.png");
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x1().getLayoutParams();
            layoutParams.gravity = 16;
            C786410Ut5.c6(x1(), layoutParams);
        } else {
            C1143680frq.LIZLLL(x1(), C0IPN.LIZ("tiktok_live_link_mic", "tiktok_live_game_demand_1"), "ttlive_game_link_mic_switch1.png");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) x1().getLayoutParams();
            layoutParams2.gravity = 48;
            C786410Ut5.c6(x1(), layoutParams2);
        }
        this.dataChannel.zW(GameLinkMicViewSmallStyle.class, Boolean.valueOf(z));
    }
}
