package X;

import Y.ARunnableS129S0100000_29;
import android.os.Build;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.120K, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C120K implements InterfaceC1846110y8n {
    public final /* synthetic */ BaseNewMusicTabFragment LIZ;

    @Override // X.InterfaceC1846110y8n
    public final void LIZ(C1845940y8W c1845940y8W) {
    }

    @Override // X.InterfaceC1846110y8n
    public final void LIZJ(C1845940y8W c1845940y8W) {
    }

    public C120K(BaseNewMusicTabFragment baseNewMusicTabFragment) {
        this.LIZ = baseNewMusicTabFragment;
    }

    @Override // X.InterfaceC1846110y8n
    public final void LIZIZ(C1845940y8W c1845940y8W) {
        String str;
        int i = c1845940y8W.LIZLLL;
        BaseNewMusicTabFragment baseNewMusicTabFragment = this.LIZ;
        C11FA c11faLIZIZ = C11FD.LIZIZ(i, baseNewMusicTabFragment.LLLFF, baseNewMusicTabFragment.LLJJIJIIJIL);
        C11FA c11fa = C11FA.TAB_TYPE_COLLECT;
        if (c11faLIZIZ == c11fa) {
            this.LIZ.getString(2131834437);
            if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
                this.LIZ.gS();
                HandlerHook.viewPost(this.LIZ.LLILLL, new ARunnableS129S0100000_29(this, 209));
                return;
            }
        }
        C15IK.LJIIZILJ = c11faLIZIZ;
        if (c11faLIZIZ == c11fa && this.LIZ.PR() != null) {
            this.LIZ.PR().dismiss();
        }
        boolean z = false;
        if (c11faLIZIZ == C11FA.TAB_TYPE_LOCAL) {
            C19EG activity = this.LIZ.getActivity();
            if (Build.VERSION.SDK_INT >= 33) {
                str = "android.permission.READ_MEDIA_AUDIO";
            } else {
                str = "android.permission.WRITE_EXTERNAL_STORAGE";
            }
            if (C838410Wul.LIZ(activity, str) == 0) {
                z = true;
            }
            C15IK.LJIIZILJ(c11faLIZIZ, z);
        } else {
            C15IK.LJIIZILJ(c11faLIZIZ, false);
        }
        this.LIZ.bS();
        this.LIZ.hS(c11faLIZIZ);
    }
}
