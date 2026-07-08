package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.settingdialog.MultiGuestModeratorSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSelectFixedMicCountSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0bnX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987250bnX extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C987250bnX(C947740alo c947740alo, int i) {
        super(4);
        this.$t = i;
        this.l0 = c947740alo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C987250bnX(MultiLiveSettingDialog multiLiveSettingDialog, int i) {
        super(4);
        this.$t = i;
        this.l0 = multiLiveSettingDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C987250bnX(MultiGuestModeratorSettingDialog multiGuestModeratorSettingDialog, int i) {
        super(4);
        this.$t = i;
        this.l0 = multiGuestModeratorSettingDialog;
    }

    public static final Object invoke$0(C987250bnX c987250bnX, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj).intValue();
        ((MultiLiveSettingDialog) c987250bnX.l0).sS((String) obj2, (Integer) obj3, (EnumC930180aJU) obj4);
        return Unit.LIZ;
    }

    public static final Object invoke$1(C987250bnX c987250bnX, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj).intValue();
        ((MultiLiveSettingDialog) c987250bnX.l0).sS((String) obj2, (Integer) obj3, (EnumC930180aJU) obj4);
        return Unit.LIZ;
    }

    public static final Object invoke$2(C987250bnX c987250bnX, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C935540aS8 state;
        int i2;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL02;
        C935540aS8 state2;
        ((Number) obj).intValue();
        String str = (String) obj2;
        Integer num = (Integer) obj3;
        C947750alp c947750alp = ((C947740alo) c987250bnX.l0).LLIZLLLIL;
        if (c947750alp != null) {
            String str2 = null;
            int iIntValue = 1;
            if (LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable()) {
                C927550aFF c927550aFF = C927570aFH.LLILZ;
                DataChannel dataChannel = c947750alp.LIZ.getDataChannel();
                Long lLJIIJ = C930540aK4.LJIIJ();
                Long lValueOf = Long.valueOf(((Number) c947750alp.LIZJ.getValue()).intValue());
                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = c947750alp.LIZIZ;
                if (num != null) {
                    iIntValue = num.intValue();
                }
                ISharedBgAbility iSharedBgAbilityLIZ = c947750alp.LIZ();
                if (iSharedBgAbilityLIZ != null && (multiGuestSharedBgAnchorViewModelGL02 = iSharedBgAbilityLIZ.GL0()) != null && (state2 = multiGuestSharedBgAnchorViewModelGL02.getState()) != null) {
                    str2 = state2.LLILZ;
                }
                String strLIZ = C936270aTJ.LIZ(str2);
                if (C931790aM5.LIZIZ()) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                C947780als c947780als = new C947780als(c947750alp);
                C947800alu c947800alu = new C947800alu(c947750alp);
                c927550aFF.getClass();
                C927550aFF.LIZIZ(dataChannel, lLJIIJ, lValueOf, multiLiveAnchorPanelSettings, iIntValue, str, strLIZ, i2, null, c947780als, c947800alu, false);
            } else {
                C927550aFF c927550aFF2 = C927570aFH.LLILZ;
                DataChannel dataChannel2 = c947750alp.LIZ.getDataChannel();
                Long lLJIIJ2 = C930540aK4.LJIIJ();
                Long lValueOf2 = Long.valueOf(((Number) c947750alp.LIZJ.getValue()).intValue());
                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = c947750alp.LIZIZ;
                if (num != null) {
                    iIntValue = num.intValue();
                }
                ISharedBgAbility iSharedBgAbilityLIZ2 = c947750alp.LIZ();
                if (iSharedBgAbilityLIZ2 != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbilityLIZ2.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL0.getState()) != null) {
                    str2 = state.LLILZ;
                }
                String strLIZ2 = C936270aTJ.LIZ(str2);
                if (C931790aM5.LIZIZ()) {
                    i = 4;
                } else {
                    i = 0;
                }
                C947790alt c947790alt = new C947790alt(c947750alp);
                C947810alv c947810alv = new C947810alv(c947750alp);
                c927550aFF2.getClass();
                C927550aFF.LIZIZ(dataChannel2, lLJIIJ2, lValueOf2, multiLiveAnchorPanelSettings2, iIntValue, null, strLIZ2, i, null, c947790alt, c947810alv, false);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C987250bnX c987250bnX, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj).intValue();
        MultiGuestModeratorSettingDialog multiGuestModeratorSettingDialog = (MultiGuestModeratorSettingDialog) c987250bnX.l0;
        multiGuestModeratorSettingDialog.getClass();
        C915980Zwa.LJIIIIZZ();
        if (!C921180a4y.LJII()) {
            if (obj4 == null) {
                C766270U4b.LIZLLL(2131853850);
            } else {
                C766270U4b.LIZLLL(2131853849);
            }
        }
        InterfaceC963450bB9 interfaceC963450bB9 = multiGuestModeratorSettingDialog.LL;
        if (interfaceC963450bB9 != null) {
            interfaceC963450bB9.dismiss();
        }
        return Unit.LIZ;
    }
}
