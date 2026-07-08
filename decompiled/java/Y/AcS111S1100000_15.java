package Y;

import X.C0PEM;
import X.C1AI0;
import X.C23250099c;
import X.C930540aK4;
import X.C932410aN5;
import X.C932420aN6;
import X.C943060aeG;
import X.C943120aeM;
import X.InterfaceC743640TFa;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.guest.AigcWallpaperGuestResultFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.widget.AigcAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.BaseAigcWallpaperViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAigcWallpaperConfigSetting;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS249S0000000_15;

/* JADX INFO: loaded from: classes16.dex */
public class AcS111S1100000_15 implements InterfaceC743640TFa {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
            case 2:
                LIZ$2(this, liveDialog);
                break;
            case 3:
                LIZ$3(this, liveDialog);
                break;
            case 4:
                LIZ$4(this, liveDialog);
                break;
            case 5:
                LIZ$5(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS111S1100000_15 acS111S1100000_15, LiveDialog liveDialog) {
        MutableLiveData<Integer> mutableLiveData;
        AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = ((AigcWallpaperGuestResultFragment) acS111S1100000_15.l1).LLIZLLLIL;
        if (aigcWallpaperGuestViewModel != null) {
            aigcWallpaperGuestViewModel.LLJJI = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(aigcWallpaperGuestViewModel), C0PEM.LIZJ, null, new C943060aeG(aigcWallpaperGuestViewModel, null), 2);
        }
        AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel2 = ((AigcWallpaperGuestResultFragment) acS111S1100000_15.l1).LLIZLLLIL;
        if (aigcWallpaperGuestViewModel2 != null && (mutableLiveData = aigcWallpaperGuestViewModel2.LLJJJJ) != null) {
            mutableLiveData.setValue(Integer.valueOf(MultiGuestAigcWallpaperConfigSetting.INSTANCE.getMaxRetryCount()));
        }
        C943120aeM.LJIIJJI(acS111S1100000_15.s0, "click", "proceed");
        C943120aeM.LJIIL("guest_skip");
        ((AigcWallpaperGuestResultFragment) acS111S1100000_15.l1).LLJJI = true;
        liveDialog.dismiss();
        C930540aK4.LJJIZ(((AigcWallpaperGuestResultFragment) acS111S1100000_15.l1).LLJ);
    }

    public static final void LIZ$1(AcS111S1100000_15 acS111S1100000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = ((AigcAnchorWidget) acS111S1100000_15.l1).LLILLJJLI;
        if (aigcWallpaperAnchorViewModel != null) {
            BaseAigcWallpaperViewModel.vQ2(aigcWallpaperAnchorViewModel, "", acS111S1100000_15.s0, "", "", 3, true, null, null, false, 448);
        }
        AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel2 = ((AigcAnchorWidget) acS111S1100000_15.l1).LLILLJJLI;
        if (aigcWallpaperAnchorViewModel2 != null) {
            aigcWallpaperAnchorViewModel2.LLIZLLLIL.LIZ();
        }
        C943120aeM.LJ(1, "time_end");
    }

    public static final void LIZ$2(AcS111S1100000_15 acS111S1100000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = ((AigcAnchorWidget) acS111S1100000_15.l1).LLILLJJLI;
        if (aigcWallpaperAnchorViewModel != null) {
            BaseAigcWallpaperViewModel.vQ2(aigcWallpaperAnchorViewModel, "", acS111S1100000_15.s0, "", "", 4, true, null, null, false, 448);
        }
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = ((AigcAnchorWidget) acS111S1100000_15.l1).LL;
        if (multiGuestSharedBgAnchorViewModel != null) {
            multiGuestSharedBgAnchorViewModel.setState(new AwS249S0000000_15(2));
        }
        AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel2 = ((AigcAnchorWidget) acS111S1100000_15.l1).LLILLJJLI;
        if (aigcWallpaperAnchorViewModel2 != null) {
            aigcWallpaperAnchorViewModel2.LLIZLLLIL.LIZ();
        }
        C943120aeM.LJ(0, "time_end");
    }

    public static final void LIZ$3(AcS111S1100000_15 acS111S1100000_15, LiveDialog liveDialog) {
        C1AI0.LJIIIIZZ("click", acS111S1100000_15.s0, "cancel");
        ((Function1) acS111S1100000_15.l1).invoke(Boolean.FALSE);
        liveDialog.cancel();
    }

    public static final void LIZ$4(AcS111S1100000_15 acS111S1100000_15, LiveDialog liveDialog) {
        ((C932410aN5) acS111S1100000_15.l1).LJJLIIIJL(acS111S1100000_15.s0, liveDialog, false);
    }

    public static final void LIZ$5(AcS111S1100000_15 acS111S1100000_15, LiveDialog liveDialog) {
        ((C932420aN6) acS111S1100000_15.l1).LJJLJ(acS111S1100000_15.s0, liveDialog, false, true, false, true);
    }

    public AcS111S1100000_15(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
