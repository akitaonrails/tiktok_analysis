package com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.widget;

import X.C1161920gLG;
import X.C917720ZzO;
import X.C917730ZzP;
import X.C927150aEb;
import X.C935820aSa;
import X.InterfaceC914680ZuU;
import X.InterfaceC923600a8s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.viewmodel.KaraokeGuestViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes16.dex */
public final class KaraokeGuestWidget extends BaseKaraokeWidget {
    public final InterfaceC923600a8s LL;
    public KaraokeGuestViewModel LLILLJJLI;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.widget.BaseKaraokeWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0ZuU, X.0ZzP] */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.LLILLJJLI = (KaraokeGuestViewModel) new ViewModelProvider(C927150aEb.LL, new C935820aSa(this.dataChannel)).get(KaraokeGuestViewModel.class);
        C917720ZzO c917720ZzO = C917720ZzO.LIZ;
        final DataChannel dataChannel = this.dataChannel;
        c917720ZzO.getClass();
        ?? r1 = new InterfaceC914680ZuU() { // from class: X.0ZzP
            @Override // X.InterfaceC914680ZuU
            public final void LIZ(boolean z) {
                C917720ZzO c917720ZzO2 = C917720ZzO.LIZ;
                DataChannel dataChannel2 = dataChannel;
                c917720ZzO2.getClass();
                C917720ZzO.LJIIIZ(dataChannel2, 0);
            }
        };
        C917720ZzO.LIZIZ = r1;
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ss2(r1);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C917720ZzO.LIZ.getClass();
        C917730ZzP c917730ZzP = C917720ZzO.LIZIZ;
        if (c917730ZzP != null) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Z42(c917730ZzP);
        }
        C917720ZzO.LIZIZ = null;
    }

    public KaraokeGuestWidget(InterfaceC923600a8s interfaceC923600a8s) {
        this.LL = interfaceC923600a8s;
    }
}
