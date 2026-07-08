package com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.widget;

import X.C01GW;
import X.C1548820qPI;
import X.C23250099c;
import X.C452501pT;
import X.C927150aEb;
import X.C935820aSa;
import X.C942740adk;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class AigcGuestWidget extends BaseAigcWidget {
    public final MultiGuestSharedBgGuestViewModel LL;
    public AigcWallpaperGuestViewModel LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 348));

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.widget.BaseAigcWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.LLILLJJLI = (AigcWallpaperGuestViewModel) new ViewModelProvider(C927150aEb.LL, new C935820aSa(this.dataChannel)).get(AigcWallpaperGuestViewModel.class);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C942740adk(this, null), 3);
        AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = this.LLILLJJLI;
        if (aigcWallpaperGuestViewModel != null) {
            C1548820qPI.LIZLLL("multi_guest_banner_ready", aigcWallpaperGuestViewModel.LLIZLLLIL.LJIIJ);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = this.LLILLJJLI;
        if (aigcWallpaperGuestViewModel != null) {
            C1548820qPI.LJIIIIZZ("multi_guest_banner_ready", aigcWallpaperGuestViewModel.LLIZLLLIL.LJIIJ);
        }
    }

    public AigcGuestWidget(MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel) {
        this.LL = multiGuestSharedBgGuestViewModel;
    }
}
