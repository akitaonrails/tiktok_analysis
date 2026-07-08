package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1;

import X.C19EH;
import X.C500980Jkm;
import X.C769890UHz;
import X.C786410Ut5;
import X.C948450amx;
import X.InterfaceC1294060jmO;
import X.InterfaceC947260al2;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteVideoEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC1294060jmO
public final class GuestMediaManagePanel extends PreviewDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6HELIOSemE+KSwiZyI2LCwtZygmLTY4Zz8hLTMlLDgleWsLPCogPAgpLSYyBSQiKCg2GCQiLCM=";
    public GuestMediaManageFragment guestMediaManageFragment;

    @InterfaceC947260al2(name = "MULTI_GUEST_DATA_HOLDER")
    public final MultiGuestDataHolder multiGuestDataHolder;
    public View outerViewFromXml;
    public static final C769890UHz Companion = new Object() { // from class: X.0UHz
    };
    public static final int $stable = 8;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g9n);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJ = true;
        return c500980Jkm;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dismiss() {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManagePanel.dismiss():void");
    }

    public GuestMediaManagePanel() throws IllegalAccessException {
        C948450amx.LIZIZ.LIZLLL(this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        dismiss();
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.outerViewFromXml = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        MultiGuestDataHolder multiGuestDataHolder = this.multiGuestDataHolder;
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJIILLIIL = false;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        MultiGuestDataHolder multiGuestDataHolder = this.multiGuestDataHolder;
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJIILLIIL = true;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.CQ2(MultiLiveGuestMuteVideoEvent.class, this, new AwS591S0100000_12(this, 133));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getDialogParams().LJI = 0.0f;
        View viewFindViewById = this.outerViewFromXml;
        ACListenerS147S0100000_12 aCListenerS147S0100000_12 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.pw6);
            } else {
                viewFindViewById = null;
            }
            this.outerViewFromXml = viewFindViewById;
        }
        GuestMediaManageFragment guestMediaManageFragment = this.guestMediaManageFragment;
        if (guestMediaManageFragment != null) {
            aCListenerS147S0100000_12 = guestMediaManageFragment.LLLLLZ;
        }
        C786410Ut5.I7(aCListenerS147S0100000_12, viewFindViewById);
        GuestMediaManageFragment guestMediaManageFragment2 = this.guestMediaManageFragment;
        if (guestMediaManageFragment2 != null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(R.id.iiv, guestMediaManageFragment2);
            c19ehLJIIJ.LJIIIZ();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        GuestMediaManageFragment guestMediaManageFragment = this.guestMediaManageFragment;
        if (guestMediaManageFragment != null && !guestMediaManageFragment.isAdded()) {
            try {
                super.show(fragmentManager, str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }
}
