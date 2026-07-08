package com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.anchor;

import X.C0URX;
import X.C1143680frq;
import X.C16FS;
import X.C176600m4;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C917140ZyS;
import X.C930540aK4;
import X.C931790aM5;
import X.C940770aaZ;
import X.C943120aeM;
import X.C946050aj5;
import X.C946060aj6;
import X.C948450amx;
import X.EnumC918970a1P;
import X.InterfaceC927510aFB;
import X.InterfaceC937820aVo;
import X.InterfaceC937840aVq;
import X.InterfaceC937900aVw;
import X.InterfaceC954180awC;
import Y.ACListenerS150S0100000_15;
import Y.AObserverS219S0100000_15;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.widget.AbsAigcAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperAnchorViewModel;
import com.bytedance.android.livesdk.model.AIWallpaperChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class AigcWallpaperAnchorGuideDialog extends AbsAigcBottomDialog {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/KTHELIOSxiPi4/JDUtOSohZjMlLDh9LCwtJSA0ZiQiKic8OmsNICgwHyQgJT8yOCA+CCEwICo+Djo6LCAIIC4/JyI=";
    public AigcWallpaperAnchorViewModel LLILLJJLI;
    public AbsAigcAnchorWidget LLILLL;
    public C16FS LLILZ;
    public final String LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;

    public AigcWallpaperAnchorGuideDialog() {
        super(true);
        this.LLILZIL = "";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final int getLayoutId() {
        return R.layout.hbv;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final void MR() {
        MutableLiveData mutableLiveData;
        AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = this.LLILLJJLI;
        if (aigcWallpaperAnchorViewModel == null || (mutableLiveData = aigcWallpaperAnchorViewModel.LLJJIII) == null) {
            return;
        }
        mutableLiveData.observe(this, new AObserverS219S0100000_15(this, 128));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        C946060aj6 c946060aj6LIZ;
        C946050aj5 c946050aj5LIZIZ;
        if (!this.LLIZ) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (c946060aj6LIZ = C0URX.LIZ(dataChannel, AIWallpaperChannel.class)) != null && (c946050aj5LIZIZ = c946060aj6LIZ.LIZIZ()) != null) {
                c946050aj5LIZIZ.LIZIZ(2);
            }
            C943120aeM.LJFF(this.LLILZLL, "click", "cancel");
        }
        super.dismiss();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final void initData() {
        int size;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<InterfaceC937840aVq> allLayoutWindows;
        InterfaceC954180awC interfaceC954180awCLLJLL;
        InterfaceC927510aFB interfaceC927510aFB;
        InterfaceC954180awC interfaceC954180awCLLJLL2;
        AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = this.LLILLJJLI;
        if (aigcWallpaperAnchorViewModel != null) {
            InterfaceC954180awC interfaceC954180awCLLJLL3 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (!C176600m4.LIZIZ(interfaceC954180awCLLJLL3 != null ? Boolean.valueOf(interfaceC954180awCLLJLL3.LJLIIIL()) : null)) {
                aigcWallpaperAnchorViewModel.LLJJI.setValue(1);
                return;
            }
            if (!C930540aK4.LJJIJIIJI()) {
                aigcWallpaperAnchorViewModel.LLJJI.setValue(1);
                return;
            }
            if (C931790aM5.LIZIZ()) {
                size = C940770aaZ.LIZ().getDataSource().LJIIIZ().size();
            } else {
                InterfaceC954180awC interfaceC954180awCLLJLL4 = C915980Zwa.LJIIIIZZ().LLJLL();
                size = (interfaceC954180awCLLJLL4 == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL4.LLIIJLIL()) == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) == null || (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) == null) ? 0 : allLayoutWindows.size();
            }
            EnumC918970a1P enumC918970a1PLJ = C917140ZyS.LJ();
            EnumC918970a1P enumC918970a1P = EnumC918970a1P.GRID;
            if ((enumC918970a1PLJ != enumC918970a1P && enumC918970a1PLJ != EnumC918970a1P.GRID_FIX) || (enumC918970a1PLJ == EnumC918970a1P.GRID_FIX && ((interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL()) == null || interfaceC954180awCLLJLL2.LIZIZ() - 1 < 1))) {
                aigcWallpaperAnchorViewModel.LLJJI.setValue(2);
                return;
            }
            if (enumC918970a1PLJ == enumC918970a1P && size <= 1) {
                aigcWallpaperAnchorViewModel.LLJJI.setValue(1);
                return;
            }
            if ((enumC918970a1PLJ != enumC918970a1P && enumC918970a1PLJ != EnumC918970a1P.FLOATING) || ((interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) != null && interfaceC954180awCLLJLL.LIZIZ() - 1 >= 1)) {
                aigcWallpaperAnchorViewModel.LLJJI.setValue(3);
                return;
            }
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("ZOOM_SERVICE");
            if ((objLJIIIZ instanceof InterfaceC927510aFB) && (interfaceC927510aFB = (InterfaceC927510aFB) objLJIIIZ) != null && interfaceC927510aFB.LJIIIIZZ()) {
                aigcWallpaperAnchorViewModel.LLJJI.setValue(3);
            } else {
                aigcWallpaperAnchorViewModel.LLJJI.setValue(1);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog, com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        C930540aK4.LJJIZ(this);
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final void NR(View view) {
        C16FS c16fs = (C16FS) view.findViewById(R.id.at3);
        c16fs.setText(this.LLILZIL);
        C786410Ut5.h8(c16fs, new ACListenerS150S0100000_15(this, 89));
        this.LLILZ = c16fs;
        C1143680frq.LIZLLL(view.findViewById(R.id.jcn), "tiktok_live_interaction_normal_1", "ttlive_multiguest_aigc_wallpaper_dialog_guide.png");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C946060aj6 c946060aj6LIZ;
        C946050aj5 c946050aj5LIZIZ;
        super.onCreate(bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (c946060aj6LIZ = C0URX.LIZ(dataChannel, AIWallpaperChannel.class)) != null && (c946050aj5LIZIZ = c946060aj6LIZ.LIZIZ()) != null) {
            c946050aj5LIZIZ.LJFF(0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        setCancelable(true);
    }
}
