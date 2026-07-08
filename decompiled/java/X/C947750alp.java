package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;

/* JADX INFO: renamed from: X.0alp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947750alp {
    public final InterfaceC950700aqa LIZ;
    public volatile MultiLiveAnchorPanelSettings LIZIZ;
    public final C01GW LIZJ = C292401Bi.LIZ(AFwS203S0000000_15.get$arr$(263));

    public final ISharedBgAbility LIZ() {
        InterfaceC665370Q7z interfaceC665370Q7z;
        DataChannel dataChannel = this.LIZ.getDataChannel();
        if (dataChannel == null || (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) == null) {
            return null;
        }
        return (ISharedBgAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedBgAbility.class, null);
    }

    public final void LIZLLL() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LIZIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZ = multiLiveAnchorPanelSettings != null ? MultiLiveAnchorPanelSettings.LIZ(multiLiveAnchorPanelSettings, 0, 0, 0, 8388607) : null;
        MultiGuestDataHolder multiGuestDataHolderLJJIFFI = PlaybookUtilKt.LJJIFFI();
        if (multiGuestDataHolderLJJIFFI != null) {
            multiGuestDataHolderLJJIFFI.LJJ(multiLiveAnchorPanelSettingsLIZ);
        }
        C924810aAp.LJ().LJJIII = multiLiveAnchorPanelSettingsLIZ;
        InterfaceC934710aQn.Mb.LJFF(multiLiveAnchorPanelSettingsLIZ);
    }

    public final MultiLiveAnchorPanelSettings LIZIZ() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiGuestDataHolder multiGuestDataHolderLJJIFFI = PlaybookUtilKt.LJJIFFI();
        this.LIZIZ = (multiGuestDataHolderLJJIFFI == null || (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLJJIFFI.LIZIZ()) == null) ? null : MultiLiveAnchorPanelSettings.LIZ(multiLiveAnchorPanelSettingsLIZIZ, 0, 0, 0, 8388607);
        return this.LIZIZ;
    }

    public final void LIZJ() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = C924810aAp.LJ().LJJIII;
        if (multiLiveAnchorPanelSettings != null) {
            this.LIZIZ = MultiLiveAnchorPanelSettings.LIZ(multiLiveAnchorPanelSettings, 0, 0, 0, 8388607);
        }
    }

    public C947750alp(InterfaceC950700aqa interfaceC950700aqa) {
        this.LIZ = interfaceC950700aqa;
    }

    public final void LJ(int i, Function0<Unit> function0) {
        String str;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C935540aS8 state;
        C927550aFF c927550aFF = C927570aFH.LLILZ;
        DataChannel dataChannel = this.LIZ.getDataChannel();
        Long lLJIIJ = C930540aK4.LJIIJ();
        Long lValueOf = Long.valueOf(((Number) this.LIZJ.getValue()).intValue());
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LIZIZ;
        ISharedBgAbility iSharedBgAbilityLIZ = LIZ();
        if (iSharedBgAbilityLIZ != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbilityLIZ.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL0.getState()) != null) {
            str = state.LLILZ;
        } else {
            str = null;
        }
        String strLIZ = C936270aTJ.LIZ(str);
        C947770alr c947770alr = new C947770alr(this);
        AwS381S0200000_15 awS381S0200000_15 = new AwS381S0200000_15(this, (C947750alp) function0, (Function0<Unit>) 92);
        c927550aFF.getClass();
        C927550aFF.LIZLLL(dataChannel, lLJIIJ, lValueOf, multiLiveAnchorPanelSettings, 13, null, strLIZ, i, null, c947770alr, awS381S0200000_15);
    }
}
