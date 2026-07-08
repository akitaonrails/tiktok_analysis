package com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.anchor;

import X.C01GW;
import X.C0URX;
import X.C19EH;
import X.C20441214yg;
import X.C292401Bi;
import X.C786410Ut5;
import X.C946050aj5;
import X.C946060aj6;
import X.C948750anR;
import X.InterfaceC948760anS;
import Y.ACListenerS118S0200000_15;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcKeyBoardChangeStatus;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperSwitchPageEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperAnchorViewModel;
import com.bytedance.android.livesdk.model.AIWallpaperChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class AigcWallpaperAnchorCreateDialog extends AbsAigcBottomDialog {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/KTHELIOSxiPi4/JDUtOSohZjMlLDh9LCwtJSA0ZiQiKic8OmsNICgwHyQgJT8yOCA+CCEwICo+Cj02KTEpDSYyJCor";
    public AigcWallpaperAnchorViewModel LLILLJJLI;
    public LiveBaseFragment LLILLL;
    public View LLILZ;
    public FrameLayout LLILZIL;
    public boolean LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public C948750anR LLJ;

    public AigcWallpaperAnchorCreateDialog() {
        super(false);
        this.LLIZ = C292401Bi.LIZ(new AwS559S0100000_15(this, 342));
        this.LLIZLLLIL = C292401Bi.LIZ(new AwS559S0100000_15(this, 343));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final void MR() {
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final int getLayoutId() {
        return R.layout.hbo;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final void initData() {
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C948750anR c948750anR = this.LLJ;
        if (c948750anR != null) {
            c948750anR.LIZ();
        }
        super.onDestroyView();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C946060aj6 c946060aj6LIZ;
        C946050aj5 c946050aj5LIZIZ;
        super.onDestroy();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (c946060aj6LIZ = C0URX.LIZ(dataChannel, AIWallpaperChannel.class)) != null && (c946050aj5LIZIZ = c946060aj6LIZ.LIZIZ()) != null) {
            c946050aj5LIZIZ.LIZIZ(this.LLILZLL ? 1 : 2);
        }
        this.LLILZLL = false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final void NR(View view) {
        this.LLILZ = view.findViewById(R.id.yg_);
        this.LLILZIL = (FrameLayout) view.findViewById(R.id.asw);
        View viewFindViewById = view.findViewById(R.id.trr);
        View view2 = this.LLILZ;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS118S0200000_15(this, view, 26), view2);
        }
        this.LLJ = new C948750anR(viewFindViewById);
        C948750anR c948750anR = this.LLJ;
        if (c948750anR != null) {
            c948750anR.LIZIZ(new InterfaceC948760anS() { // from class: X.0ais
                @Override // X.InterfaceC948760anS
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC948760anS
                public final void LIZ() {
                    this.LIZ.OR(0.3f, 0.7f);
                    DataChannel dataChannel = this.LIZ.dataChannel;
                    if (dataChannel != null) {
                        dataChannel.zW(AigcKeyBoardChangeStatus.class, Boolean.FALSE);
                    }
                }

                @Override // X.InterfaceC948760anS
                public final void LIZJ() {
                    this.LIZ.OR(0.1f, 0.9f);
                    DataChannel dataChannel = this.LIZ.dataChannel;
                    if (dataChannel != null) {
                        dataChannel.zW(AigcKeyBoardChangeStatus.class, Boolean.TRUE);
                    }
                }
            });
        }
    }

    public final void PR(AbsAigcWallpaperFragment absAigcWallpaperFragment) {
        try {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            if (c19ehLJIIJ != null) {
                LiveBaseFragment liveBaseFragment = this.LLILLL;
                if (liveBaseFragment != null) {
                    if (liveBaseFragment != absAigcWallpaperFragment) {
                        if (!absAigcWallpaperFragment.isAdded()) {
                            c19ehLJIIJ.LJIILL(liveBaseFragment);
                            c19ehLJIIJ.LIZIZ(R.id.asw, absAigcWallpaperFragment);
                            c19ehLJIIJ.LJIIIZ();
                        } else {
                            c19ehLJIIJ.LJIILL(liveBaseFragment);
                            c19ehLJIIJ.LJJIFFI(absAigcWallpaperFragment);
                            c19ehLJIIJ.LJIIIZ();
                        }
                        this.LLILLL = absAigcWallpaperFragment;
                        return;
                    }
                    return;
                }
                if (!absAigcWallpaperFragment.isAdded()) {
                    c19ehLJIIJ.LIZIZ(R.id.asw, absAigcWallpaperFragment);
                    c19ehLJIIJ.LJIIIZ();
                } else {
                    c19ehLJIIJ.LJJIFFI(absAigcWallpaperFragment);
                    c19ehLJIIJ.LJIIIZ();
                }
                this.LLILLL = absAigcWallpaperFragment;
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJFF("AigcWallpaperAnchorCreateDialog", "childFragmentManager failed,", th);
        }
        C20441214yg.LJ("AigcWallpaperAnchorCreateDialog", "switchFragment return, because  transaction is null");
    }

    public final void OR(float f, float f2) {
        ViewGroup.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        View view = this.LLILZ;
        LinearLayout.LayoutParams layoutParams4 = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.weight = f;
            }
        } else {
            layoutParams2 = null;
        }
        FrameLayout frameLayout = this.LLILZIL;
        if (frameLayout != null) {
            layoutParams3 = frameLayout.getLayoutParams();
        } else {
            layoutParams3 = null;
        }
        if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams4 = (LinearLayout.LayoutParams) layoutParams3) != null) {
            layoutParams4.weight = f2;
        }
        View view2 = this.LLILZ;
        if (view2 != null) {
            C786410Ut5.W5(view2, layoutParams2);
        }
        FrameLayout frameLayout2 = this.LLILZIL;
        if (frameLayout2 != null) {
            C786410Ut5.a6(frameLayout2, layoutParams4);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C946060aj6 c946060aj6LIZ;
        C946050aj5 c946050aj5LIZIZ;
        super.onViewCreated(view, bundle);
        this.LLILZLL = false;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (c946060aj6LIZ = C0URX.LIZ(dataChannel, AIWallpaperChannel.class)) != null && (c946050aj5LIZIZ = c946060aj6LIZ.LIZIZ()) != null) {
            c946050aj5LIZIZ.LJFF(0);
        }
        PR((AbsAigcWallpaperFragment) this.LLIZ.getValue());
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(AigcWallpaperSwitchPageEvent.class, this, new AwS594S0100000_15(this, 409));
        }
    }
}
