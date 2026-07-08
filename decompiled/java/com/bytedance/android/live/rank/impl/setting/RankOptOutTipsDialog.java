package com.bytedance.android.live.rank.impl.setting;

import X.AbstractViewOnClickListenerC1105820esm;
import X.C0TZM;
import X.C16F5;
import X.C16FS;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingDialog;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public final class RankOptOutTipsDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slHELIOSJD8/ZjYpPTs6JiJiGy49Iwo8PQAmPBElOTwXISQgJig=";
    public C16FS LL;
    public C16F5 LLILLJJLI;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g_y);
        c500980Jkm.LJIIIZ = -1;
        c500980Jkm.LJIIJ = -2;
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJII = 80;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean bool;
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.dataChannel;
        View viewFindViewById = null;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(C0TZM.class);
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJIFFI(bool)) {
            dismiss();
            return;
        }
        View viewFindViewById2 = this.LL;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.pk7);
            } else {
                viewFindViewById2 = null;
            }
            this.LL = (C16FS) viewFindViewById2;
        }
        C786410Ut5.h8((C16FS) viewFindViewById2, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0ULt
            @Override // X.AbstractViewOnClickListenerC1105820esm
            public final void LIZ() {
                this.LLILZIL.dismiss();
            }

            {
                super(1200L);
            }
        });
        View view3 = this.LLILLJJLI;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById = view4.findViewById(R.id.uw0);
            }
            this.LLILLJJLI = (C16F5) viewFindViewById;
            view3 = viewFindViewById;
        }
        C786410Ut5.l8((C16F5) view3, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0ULs
            @Override // X.AbstractViewOnClickListenerC1105820esm
            public final void LIZ() {
                FragmentManager childFragmentManager;
                LiveAdminSettingDialog liveAdminSettingDialogXu2;
                DataChannelGlobal.LLILZ.JQ2(C1148180fz6.class, "pop_window");
                DataChannel dataChannel2 = this.LLILZIL.dataChannel;
                if (C500260Jjc.LJJJI(dataChannel2 != null ? (Boolean) dataChannel2.gg0(UserIsAnchorChannel.class) : null)) {
                    Fragment parentFragment = this.LLILZIL.getParentFragment();
                    if (parentFragment != null && (childFragmentManager = parentFragment.getChildFragmentManager()) != null && (liveAdminSettingDialogXu2 = ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).xu2(false)) != null) {
                        liveAdminSettingDialogXu2.show(childFragmentManager, "LiveAdminSettingDialog");
                    }
                } else {
                    ((IShareService) C1161920gLG.LIZJ(IShareService.class)).hy1(C520010KaN.LJIL(this.LLILZIL.getContext(), false));
                }
                this.LLILZIL.dismiss();
            }

            {
                super(1200L);
            }
        });
    }
}
