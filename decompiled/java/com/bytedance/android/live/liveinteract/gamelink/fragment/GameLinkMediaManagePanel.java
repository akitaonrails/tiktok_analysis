package com.bytedance.android.live.liveinteract.gamelink.fragment;

import X.C01GW;
import X.C1324720kZq;
import X.C19EH;
import X.C20337914i1;
import X.C20441214yg;
import X.C452501pT;
import X.C500980Jkm;
import X.C766270U4b;
import X.C786410Ut5;
import X.InterfaceC934710aQn;
import Y.ACListenerS150S0100000_15;
import Y.ARunnableS115S0100000_15;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class GameLinkMediaManagePanel extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZygyHELIOSJSAgICE4ZiM+KCg+LSs4ZwgyJSAAICE4BSAoIC4eKSstLioDKSspJQ==";
    public View LL;
    public GameLinkMediaManageFragment LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(32));

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g6u);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJ = true;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        C1324720kZq c1324720kZq;
        GameLinkMediaManageFragment gameLinkMediaManageFragment = this.LLILLJJLI;
        if (gameLinkMediaManageFragment != null) {
            C20441214yg.LJIIIZ("GameLinkMediaManageFragment", "onDialogDismissOrBackPressed");
            gameLinkMediaManageFragment.LLJJIJI = true;
        }
        GameLinkMediaManageFragment gameLinkMediaManageFragment2 = this.LLILLJJLI;
        if (gameLinkMediaManageFragment2 == null || (c1324720kZq = gameLinkMediaManageFragment2.LL) == null) {
            return;
        }
        HandlerHook.viewPost(c1324720kZq, new ARunnableS115S0100000_15(this, 30));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        dismiss();
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) this.LLILLL.getValue();
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJIILLIIL = false;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) this.LLILLL.getValue();
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJIILLIIL = true;
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getDialogParams().LJI = 0.0f;
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.pw6);
            } else {
                viewFindViewById = null;
            }
            this.LL = viewFindViewById;
        }
        C786410Ut5.I7(new ACListenerS150S0100000_15(this, 42), viewFindViewById);
        GameLinkMediaManageFragment gameLinkMediaManageFragment = this.LLILLJJLI;
        if (gameLinkMediaManageFragment != null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(R.id.iqj, gameLinkMediaManageFragment);
            c19ehLJIIJ.LJIIIZ();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        GameLinkMediaManageFragment gameLinkMediaManageFragment = this.LLILLJJLI;
        if (gameLinkMediaManageFragment != null && !gameLinkMediaManageFragment.isAdded()) {
            try {
                super.show(fragmentManager, str);
                C20337914i1<Boolean> c20337914i1 = InterfaceC934710aQn.Sb;
                if (Intrinsics.LJFF(c20337914i1.LIZIZ(), Boolean.FALSE)) {
                    C766270U4b.LIZLLL(2131843623);
                    c20337914i1.LJFF(Boolean.TRUE);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }
}
