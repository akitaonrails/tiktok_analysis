package com.bytedance.android.live.liveinteract.linkroom.widget;

import X.C0UDZ;
import X.C1078480eAg;
import X.C20743516Fd;
import X.C497740JfY;
import X.C780690Ujr;
import X.C969520bKw;
import X.C969530bKx;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.room.MultiLiveUIChangeEvent;
import com.bytedance.android.livesdk.dataChannel.ShowAudienceBottomLeftLinkWidgetChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes16.dex */
public final class AudienceBottomLeftLinkWidget extends LiveRecyclableWidget {
    public boolean LL;
    public LiveIconView LLILLJJLI;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        boolean zBooleanValue = (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C780690Ujr.class)) == null) ? false : bool.booleanValue();
        this.LL = zBooleanValue;
        return zBooleanValue ? R.layout.hqy : R.layout.hqx;
    }

    public final void x1() {
        Drawable drawableMutate;
        LiveIconView liveIconView = this.LLILLJJLI;
        if (liveIconView != null) {
            Drawable drawableLIZ = C0UDZ.LIZ(this.LL ? R.drawable.eo_ : R.drawable.eo8);
            if (drawableLIZ == null || (drawableMutate = drawableLIZ.mutate()) == null) {
                drawableMutate = null;
            } else {
                drawableMutate.setAlpha(255);
            }
            liveIconView.setImageDrawable(new C20743516Fd(drawableMutate));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (this.LL) {
            ((TextView) findViewById(R.id.y7s)).setText(C497740JfY.LJIJI(2131842925));
        }
        this.LLILLJJLI = (LiveIconView) findViewById(R.id.k55);
        x1();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Object obj;
        hide();
        this.dataChannel.EQ2(this, ShowAudienceBottomLeftLinkWidgetChannel.class, new C969530bKx(this));
        this.dataChannel.EQ2(this, MultiLiveUIChangeEvent.class, new C969520bKw(this));
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C1078480eAg) && ((obj = ((C1078480eAg) obj2).LIZ) == null || (obj instanceof Boolean))) {
                    if (((Boolean) obj).booleanValue()) {
                        show();
                    } else {
                        hide();
                    }
                }
            }
        }
    }
}
