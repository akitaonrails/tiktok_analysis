package com.bytedance.android.live.effect.music;

import X.C01GW;
import X.C19EG;
import X.C19EH;
import X.C292401Bi;
import X.C500980Jkm;
import X.C748630TYf;
import X.C748650TYh;
import X.C762060Tuu;
import X.C762070Tuv;
import X.C763390Tx3;
import X.C763480TxC;
import X.C766290U4d;
import X.C786410Ut5;
import X.EnumC748580TYa;
import Y.ACListenerS147S0100000_12;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveBGMDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiHELIOSLCk1LSY4ZyImOywvZwM6PiAODgIXISQgJig=";
    public final C01GW LL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(24));
    public final C01GW LLILLJJLI = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(25));
    public BGMPlaylistViewModel LLILLL;
    public View LLILZ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.fzs);
        C766290U4d.LIZ(c500980Jkm);
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C766290U4d.LIZIZ(this);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Fragment fragment;
        super.onViewCreated(view, bundle);
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        int i = C748630TYf.LIZ[EnumC748580TYa.BGM_SONG_LIST.ordinal()];
        if (i != 1) {
            if (i == 2) {
                fragment = (Fragment) this.LLILLJJLI.getValue();
            } else {
                return;
            }
        } else {
            fragment = (Fragment) this.LL.getValue();
        }
        if (fragment != null) {
            c19ehLJIIJ.LIZIZ(R.id.iiv, fragment);
            c19ehLJIIJ.LJIIIZ();
            View viewFindViewById = view.findViewById(R.id.pw6);
            this.LLILZ = viewFindViewById;
            if (viewFindViewById != null) {
                C786410Ut5.I7(new ACListenerS147S0100000_12(this, 49), viewFindViewById);
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.BQ2(this, BroadcastDialogPageChannel.class, new C748650TYh(this));
            }
            C19EG activity = getActivity();
            if (activity != null) {
                ViewModelProviders.of(activity, new C762060Tuu(new C763390Tx3(), this.dataChannel)).get(BGMSongListViewModel.class);
                C19EG activity2 = getActivity();
                if (activity2 != null) {
                    this.LLILLL = (BGMPlaylistViewModel) ViewModelProviders.of(activity2, new C762070Tuv(new C763480TxC(), this.dataChannel)).get(BGMPlaylistViewModel.class);
                }
            }
        }
    }
}
