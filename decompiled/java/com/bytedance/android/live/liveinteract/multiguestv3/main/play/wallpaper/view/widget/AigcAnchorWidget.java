package com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.widget;

import X.C1548820qPI;
import X.C20441214yg;
import X.C23250099c;
import X.C473410IhP;
import X.C492400JSs;
import X.C748880TZe;
import X.C927150aEb;
import X.C935820aSa;
import X.C942730adj;
import X.C943120aeM;
import Y.ARunnableS84S0200000_15;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.liveinteract.multiguestv3.AigcWallpaperStatus;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AnchorClickAigcWallpaperEntranceEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.anchor.AigcWallpaperAnchorCreateDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.anchor.AigcWallpaperAnchorGuideDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS249S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class AigcAnchorWidget extends AbsAigcAnchorWidget {
    public final MultiGuestSharedBgAnchorViewModel LL;
    public AigcWallpaperAnchorViewModel LLILLJJLI;
    public ARunnableS84S0200000_15 LLILLL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.widget.AbsAigcAnchorWidget, com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.widget.BaseAigcWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.widget.BaseAigcWidget, X.InterfaceC941870acL
    public final void end() {
        C20441214yg.LIZIZ("AigcAnchorWidget", "ILinkMicAbility#end");
        AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = this.LLILLJJLI;
        if (aigcWallpaperAnchorViewModel != null) {
            aigcWallpaperAnchorViewModel.FQ2(2);
        }
        C943120aeM.LJ(0, "anchor_mutex_end");
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = this.LL;
        if (multiGuestSharedBgAnchorViewModel != null) {
            multiGuestSharedBgAnchorViewModel.setState(new AwS249S0000000_15(2));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.widget.AbsAigcAnchorWidget
    public final void x1() {
        FragmentManager fragmentManager;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null) {
            return;
        }
        AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = this.LLILLJJLI;
        AigcWallpaperAnchorCreateDialog aigcWallpaperAnchorCreateDialog = new AigcWallpaperAnchorCreateDialog();
        aigcWallpaperAnchorCreateDialog.LLILLJJLI = aigcWallpaperAnchorViewModel;
        C492400JSs.LIZ(aigcWallpaperAnchorCreateDialog, fragmentManager, "AigcAnchorWidget_create");
    }

    public final void y1() {
        FragmentManager fragmentManager;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null) {
            return;
        }
        AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = this.LLILLJJLI;
        AigcWallpaperAnchorGuideDialog aigcWallpaperAnchorGuideDialog = new AigcWallpaperAnchorGuideDialog();
        aigcWallpaperAnchorGuideDialog.LLILLJJLI = aigcWallpaperAnchorViewModel;
        aigcWallpaperAnchorGuideDialog.LLILLL = this;
        C492400JSs.LIZ(aigcWallpaperAnchorGuideDialog, fragmentManager, "AigcAnchorWidget_guide");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.LLILLJJLI = (AigcWallpaperAnchorViewModel) new ViewModelProvider(C927150aEb.LL, new C935820aSa(this.dataChannel)).get(AigcWallpaperAnchorViewModel.class);
        this.dataChannel.BQ2(this, AigcWallpaperStatus.class, new AwS594S0100000_15(this, 415));
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = this.LL;
        if (multiGuestSharedBgAnchorViewModel != null) {
            multiGuestSharedBgAnchorViewModel.LLILZLL = this.LLILLJJLI;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C942730adj(this, null), 3);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.CQ2(AnchorClickAigcWallpaperEntranceEvent.class, this, new AwS594S0100000_15(this, 416));
        }
        AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = this.LLILLJJLI;
        if (aigcWallpaperAnchorViewModel != null) {
            C1548820qPI.LIZLLL("multi_guest_banner_ready", aigcWallpaperAnchorViewModel.LLIZLLLIL.LJIIJ);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = this.LLILLJJLI;
        if (aigcWallpaperAnchorViewModel != null) {
            C1548820qPI.LJIIIIZZ("multi_guest_banner_ready", aigcWallpaperAnchorViewModel.LLIZLLLIL.LJIIJ);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = this.LL;
        if (multiGuestSharedBgAnchorViewModel != null) {
            multiGuestSharedBgAnchorViewModel.LLILZLL = null;
        }
        ARunnableS84S0200000_15 aRunnableS84S0200000_15 = this.LLILLL;
        if (aRunnableS84S0200000_15 != null) {
            C473410IhP.LIZ().removeCallbacks(aRunnableS84S0200000_15);
        }
    }

    public AigcAnchorWidget(MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel) {
        this.LL = multiGuestSharedBgAnchorViewModel;
    }
}
