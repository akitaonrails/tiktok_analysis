package com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.widget;

import X.C917720ZzO;
import X.C924810aAp;
import X.C927150aEb;
import X.C935820aSa;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.viewmodel.KaraokeAnchorViewModel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAnchorInProgressEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class KaraokeAnchorWidget extends BaseKaraokeWidget {
    public KaraokeAnchorViewModel LL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.widget.BaseKaraokeWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.LL = (KaraokeAnchorViewModel) new ViewModelProvider(C927150aEb.LL, new C935820aSa(this.dataChannel)).get(KaraokeAnchorViewModel.class);
        C917720ZzO c917720ZzO = C917720ZzO.LIZ;
        DataChannel dataChannel = this.dataChannel;
        c917720ZzO.getClass();
        C917720ZzO.LJIIIZ(dataChannel, 0);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
    }

    public final void x1(long j, long j2, Function1 function1, Function1 function12, boolean z) {
        KaraokeAnchorViewModel karaokeAnchorViewModel = this.LL;
        if (karaokeAnchorViewModel != null) {
            if (karaokeAnchorViewModel.LLILLJJLI) {
                C917720ZzO.LIZ.getClass();
                C917720ZzO.LJII("KaraokeAnchorViewModel", "isManaging, so return ", null);
                if (function12 != null) {
                    function12.invoke(new Throwable("current anchor is managing"));
                    return;
                }
                return;
            }
            if (!z) {
                karaokeAnchorViewModel.vQ2(this, j, j2, 2, function1, function12);
                return;
            }
            C924810aAp.LJ().LJIIJJI(true);
            DataChannel dataChannel = karaokeAnchorViewModel.LL;
            if (dataChannel != null) {
                dataChannel.FQ2(MultiGuestAnchorInProgressEvent.class);
            }
            C924810aAp.LJ().LJJIIZI = true;
            C924810aAp c924810aApLJ = C924810aAp.LJ();
            System.currentTimeMillis();
            c924810aApLJ.getClass();
            karaokeAnchorViewModel.vQ2(this, j, j2, 1, function1, function12);
        }
    }
}
