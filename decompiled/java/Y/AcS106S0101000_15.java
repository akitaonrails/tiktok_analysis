package Y;

import X.C917510Zz3;
import X.C931740aM0;
import X.C948150amT;
import X.C973690bRf;
import X.EnumC983140bgu;
import X.InterfaceC743640TFa;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.competition.game.panel.CatchBeansManagementPanelFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AcS106S0101000_15 implements InterfaceC743640TFa {
    public final int $t;
    public int i1;
    public Object l0;

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
        }
    }

    public static final void LIZ$0(AcS106S0101000_15 acS106S0101000_15, LiveDialog liveDialog) {
        Integer numValueOf;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
        LayoutSettingContract layoutSettingContract = (LayoutSettingContract) acS106S0101000_15.l0;
        Function0<MultiLiveAnchorPanelSettings> function0 = layoutSettingContract.anchorPanelSettingsTemp;
        if (function0 != null && (multiLiveAnchorPanelSettingsInvoke = function0.invoke()) != null) {
            numValueOf = Integer.valueOf(multiLiveAnchorPanelSettingsInvoke.layoutType);
        } else {
            numValueOf = null;
        }
        C931740aM0.LJII(layoutSettingContract.LJIIJ(numValueOf), acS106S0101000_15.i1 - 1, "normal", "click", "cancel", "live_take_detail");
        liveDialog.dismiss();
    }

    public static final void LIZ$1(AcS106S0101000_15 acS106S0101000_15, LiveDialog liveDialog) {
        MultiGuestPreviewLiveSettingViewModel multiGuestPreviewLiveSettingViewModel = ((MultiGuestPreviewLiveSettingDialog) acS106S0101000_15.l0).LLJLLL;
        if (multiGuestPreviewLiveSettingViewModel != null) {
            multiGuestPreviewLiveSettingViewModel.vQ2(new C948150amT(acS106S0101000_15.i1));
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$2(AcS106S0101000_15 acS106S0101000_15, LiveDialog liveDialog) {
        Integer numValueOf;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
        LayoutSettingContract layoutSettingContract = (LayoutSettingContract) acS106S0101000_15.l0;
        Function0<MultiLiveAnchorPanelSettings> function0 = layoutSettingContract.anchorPanelSettingsTemp;
        if (function0 != null && (multiLiveAnchorPanelSettingsInvoke = function0.invoke()) != null) {
            numValueOf = Integer.valueOf(multiLiveAnchorPanelSettingsInvoke.layoutType);
        } else {
            numValueOf = null;
        }
        C931740aM0.LJII(layoutSettingContract.LJIIJ(numValueOf), acS106S0101000_15.i1 - 1, "normal", "click", "cancel", "live_take_detail");
        liveDialog.dismiss();
    }

    public static final void LIZ$3(AcS106S0101000_15 acS106S0101000_15, LiveDialog liveDialog) {
        ((CatchBeansManagementPanelFragment) acS106S0101000_15.l0).LLILZIL.invoke(EnumC983140bgu.USER_LEAVE, 0L);
        C973690bRf.LIZ.LJIIZILJ(acS106S0101000_15.i1, true);
        liveDialog.dismiss();
    }

    public static final void LIZ$4(AcS106S0101000_15 acS106S0101000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C917510Zz3.LIZIZ();
        ((MultiLiveAsAnchorListDialogV2) acS106S0101000_15.l0).LLII(acS106S0101000_15.i1);
        ((MultiLiveAsAnchorListDialogV2) acS106S0101000_15.l0).r = true;
    }

    public AcS106S0101000_15(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
