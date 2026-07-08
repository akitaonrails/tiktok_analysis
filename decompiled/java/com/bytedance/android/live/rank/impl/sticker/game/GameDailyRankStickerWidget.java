package com.bytedance.android.live.rank.impl.sticker.game;

import X.C1091250eVH;
import X.C1119420fEi;
import X.C1846960yAA;
import X.C1847010yAF;
import X.C1847050yAJ;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class GameDailyRankStickerWidget extends LiveWidget {
    public C1847050yAJ LL;
    public C1847010yAF LLILLJJLI;
    public C1846960yAA LLILLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hkg;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        C1119420fEi c1119420fEi;
        super.onCreate();
        this.LL = new C1847050yAJ((C1091250eVH) this.contentView, 2131855525);
        this.LLILLJJLI = new C1847010yAF((C1091250eVH) this.contentView, RankTypeV2.LJIILJJIL);
        this.LLILLL = new C1846960yAA(this.contentView, true);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (c1119420fEi = (C1119420fEi) dataChannel.gg0(GameDailyRankStickerModel.class)) == null) {
            return;
        }
        C1847050yAJ c1847050yAJ = this.LL;
        if (c1847050yAJ != null) {
            c1847050yAJ.LIZIZ(c1119420fEi);
        }
        C1847010yAF c1847010yAF = this.LLILLJJLI;
        if (c1847010yAF != null) {
            c1847010yAF.LIZIZ(c1119420fEi);
        }
        C1846960yAA c1846960yAA = this.LLILLL;
        if (c1846960yAA != null) {
            c1846960yAA.LIZIZ(c1119420fEi);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C1846960yAA c1846960yAA = this.LLILLL;
        if (c1846960yAA != null) {
            c1846960yAA.onDestroy();
        }
    }
}
