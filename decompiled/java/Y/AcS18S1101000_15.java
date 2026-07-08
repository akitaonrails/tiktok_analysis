package Y;

import X.C20441214yg;
import X.C2188811AlT;
import X.C915980Zwa;
import X.C922550a7B;
import X.C923170a8B;
import X.C931740aM0;
import X.EnumC918990a1R;
import X.InterfaceC743640TFa;
import X.InterfaceC954180awC;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestDisconnectByWindowWithReviewEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AcS18S1101000_15 implements InterfaceC743640TFa {
    public final int $t;
    public int i2;
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
        }
    }

    public static final void LIZ$0(AcS18S1101000_15 acS18S1101000_15, LiveDialog liveDialog) {
        EnumC918990a1R enumC918990a1RLIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke2;
        liveDialog.dismiss();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LLILIL(Boolean.FALSE, acS18S1101000_15.s0);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sourceLayoutId:");
        sbLIZ.append(((LayoutSettingContract) acS18S1101000_15.l1).LJIILIIL());
        sbLIZ.append(", targetLayoutId:");
        sbLIZ.append(acS18S1101000_15.s0);
        C20441214yg.LIZIZ("BaseMultiLiveAnchorSettingView", C2188811AlT.LIZIZ(sbLIZ));
        Function0<MultiLiveAnchorPanelSettings> function0 = ((LayoutSettingContract) acS18S1101000_15.l1).anchorPanelSettingsTemp;
        Integer numValueOf = null;
        if (function0 != null && (multiLiveAnchorPanelSettingsInvoke2 = function0.invoke()) != null) {
            enumC918990a1RLIZ = C923170a8B.LIZ(multiLiveAnchorPanelSettingsInvoke2);
        } else {
            enumC918990a1RLIZ = null;
        }
        ((LayoutSettingContract) acS18S1101000_15.l1).LIZIZ(acS18S1101000_15.i2, acS18S1101000_15.s0, C922550a7B.LIZJ(enumC918990a1RLIZ), null, null, null);
        LayoutSettingContract layoutSettingContract = (LayoutSettingContract) acS18S1101000_15.l1;
        Function0<MultiLiveAnchorPanelSettings> function02 = layoutSettingContract.anchorPanelSettingsTemp;
        if (function02 != null && (multiLiveAnchorPanelSettingsInvoke = function02.invoke()) != null) {
            numValueOf = Integer.valueOf(multiLiveAnchorPanelSettingsInvoke.layoutType);
        }
        C931740aM0.LJII(layoutSettingContract.LJIIJ(numValueOf), acS18S1101000_15.i2 - 1, "normal", "click", "change", "live_take_detail");
    }

    public static final void LIZ$1(AcS18S1101000_15 acS18S1101000_15, LiveDialog liveDialog) {
        DataChannel dataChannel = ((MultiGuestV3GuestPresenter) acS18S1101000_15.l1).dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(GuestDisconnectByWindowWithReviewEvent.class, new Pair(acS18S1101000_15.s0, Integer.valueOf(acS18S1101000_15.i2)));
        }
        liveDialog.dismiss();
    }

    public AcS18S1101000_15(int i, Object obj, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.i2 = i;
    }
}
