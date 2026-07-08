package com.bytedance.android.live.rank.impl.setting;

import X.C0TZM;
import X.C19322110iZ;
import X.C19EH;
import X.C465640INu;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public final class AnchorRankingSettingDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slJD8/HELIOSZjYpPTs6JiJiCCEwICo+Gy49IywiLhw2PDElJygXISQgJig=";
    public View LL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        DataChannel dataChannel = this.dataChannel;
        boolean zLJJIJIL = C500260Jjc.LJJIJIL(dataChannel != null ? (Boolean) dataChannel.gg0(C0TZM.class) : null);
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g_0);
        c500980Jkm.LIZJ = zLJJIJIL ? R.style.ahb : C497740JfY.LJJ() ? R.style.ahf : R.style.ahg;
        c500980Jkm.LJII = zLJJIJIL ? 80 : C497740JfY.LJJ() ? 3 : 5;
        c500980Jkm.LJI = 0.0f;
        int iLIZIZ = C465640INu.LIZIZ(getContext());
        c500980Jkm.LJIIIZ = -1;
        if (zLJJIJIL) {
            iLIZIZ = -1;
        }
        c500980Jkm.LJIIJ = iLIZIZ;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Room room;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.yg_);
            } else {
                viewFindViewById = null;
            }
            this.LL = viewFindViewById;
        }
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 70), viewFindViewById);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && room.getId() != 0) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("no_back", true);
            AnchorRankingSettingFragment anchorRankingSettingFragment = new AnchorRankingSettingFragment();
            anchorRankingSettingFragment.setArguments(bundle2);
            c19ehLJIIJ.LIZIZ(R.id.iiv, anchorRankingSettingFragment);
            c19ehLJIIJ.LJIIIZ();
            return;
        }
        C19322110iZ.LIZLLL(getChildFragmentManager(), PreviewRankingSettingFragmentSheet.class, "preview_ranking_setting", null, null);
    }
}
