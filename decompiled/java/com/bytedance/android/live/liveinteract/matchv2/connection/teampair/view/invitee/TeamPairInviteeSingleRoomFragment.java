package com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.invitee;

import X.C0UO0;
import X.C16FS;
import X.C480460Ism;
import X.C784440Upu;
import X.C786410Ut5;
import X.C917350Zyn;
import X.C959180b4G;
import X.C959200b4I;
import X.C962900bAG;
import X.C973660bRc;
import X.C974540bT2;
import X.EnumC919170a1j;
import X.InterfaceC944070aft;
import Y.ACListenerS150S0100000_15;
import Y.AfS184S0100000_15;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.liveinteract.match.business.event.BattleInvitingTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsInTeamPairing;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairConfigSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class TeamPairInviteeSingleRoomFragment extends AbsTeamPairInviteeFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyIyPCYkP319KyoiJyowPCwjHELIOSJ2EnLSQhOS46Oms6ICokZiwiPyYnLSBiHSoyJRUtID0aJjMlPSo2GywiLiM2GiojJAkhKSIhLCEn";
    public InterfaceC944070aft LLLIILIL;

    public final void zS() {
        InterfaceC944070aft interfaceC944070aft = this.LLLIILIL;
        if (interfaceC944070aft != null) {
            interfaceC944070aft.stop();
        }
        DataChannel dataChannel = this.LLL;
        if (dataChannel != null) {
            dataChannel.zW(BattleIsInTeamPairing.class, new C962900bAG(false, true, 4));
        }
        DataChannel dataChannel2 = this.LLL;
        if (dataChannel2 != null) {
            dataChannel2.zW(BattleInvitingTimeLeftChannel.class, 0L);
        }
    }

    public final void ES() {
        long j;
        C480460Ism.LIZ().getClass();
        MultiMatchApi multiMatchApi = (MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class);
        LinkMicBattleMessage linkMicBattleMessage = this.LLLF;
        if (linkMicBattleMessage != null) {
            j = linkMicBattleMessage.battleId;
            BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
            j = battleSetting != null ? battleSetting.channelId : 0L;
            BattleSetting battleSetting2 = linkMicBattleMessage.battleSetting;
            int i = battleSetting2 != null ? battleSetting2.inviteType : 0;
            multiMatchApi.reject(j, j, i, 0, this.LLLI ? 1 : 0, 0L, null).LJIILIIL(new C0UO0()).LJJLL(new AfS184S0100000_15(this, 20), new AfS184S0100000_15(this, 21));
        }
        j = 0;
        multiMatchApi.reject(j, j, i, 0, this.LLLI ? 1 : 0, 0L, null).LJIILIIL(new C0UO0()).LJJLL(new AfS184S0100000_15(this, 20), new AfS184S0100000_15(this, 21));
    }

    @Override // com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.AbsTeamPairFragment
    public final void uS() {
        super.uS();
        C784440Upu.LIZ().LIZJ(this, C959200b4I.class).LIZJ(new AfS184S0100000_15(this, 22));
    }

    public final void BS(boolean z) {
        Long lValueOf;
        List<TeamUsersInfo> list;
        long j;
        Map<Long, GiftGalleryBadgeInfo> map;
        BattleSetting battleSetting;
        C973660bRc c973660bRc = C973660bRc.LIZ;
        LinkMicBattleMessage linkMicBattleMessage = this.LLLF;
        Integer numValueOf = null;
        if (linkMicBattleMessage != null) {
            lValueOf = Long.valueOf(linkMicBattleMessage.actionByUserId);
        } else {
            lValueOf = null;
        }
        LinkMicBattleMessage linkMicBattleMessage2 = this.LLLF;
        if (linkMicBattleMessage2 != null) {
            list = linkMicBattleMessage2.teamUsers;
        } else {
            list = null;
        }
        long j2 = 0;
        if (linkMicBattleMessage2 != null) {
            j = linkMicBattleMessage2.battleId;
            map = linkMicBattleMessage2.leagueInfoMap;
        } else {
            j = 0;
            map = null;
        }
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        EnumC919170a1j enumC919170a1j = EnumC919170a1j.MATCH_TYPE_2V2;
        c917350Zyn.getClass();
        String strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1j, 1);
        LinkMicBattleMessage linkMicBattleMessage3 = this.LLLF;
        if (linkMicBattleMessage3 != null && (battleSetting = linkMicBattleMessage3.battleSetting) != null) {
            numValueOf = Integer.valueOf(battleSetting.inviteType);
        }
        C973660bRc.LIZ.LJJLI(z, true, lValueOf, list, j, map, false, strLIZIZ, numValueOf);
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        LinkMicBattleMessage linkMicBattleMessage4 = this.LLLF;
        if (linkMicBattleMessage4 != null) {
            j2 = linkMicBattleMessage4.battleId;
        }
        C974540bT2.LJLJJL(1, j2);
    }

    @Override // com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.invitee.AbsTeamPairInviteeFragment, com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.AbsTeamPairFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer numValueOf;
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.LLL;
        if (dataChannel != null) {
            dataChannel.zW(BattleIsInTeamPairing.class, new C962900bAG(true, false, 4));
        }
        InterfaceC944070aft interfaceC944070aft = this.LLLIILIL;
        if (interfaceC944070aft != null) {
            interfaceC944070aft.LIZ(LiveMatchTeamPairConfigSetting.INSTANCE.getValue().inviteeWaitingTime, new AwS594S0100000_15(this, 767), AFwS250S0000000_15.get$arr$(168), new AwS559S0100000_15(this, 678));
        }
        C16FS c16fs = this.LLLIIIL;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS150S0100000_15(this, 218));
        }
        C16FS c16fs2 = this.LLLIIIIL;
        if (c16fs2 != null) {
            C786410Ut5.h8(c16fs2, new ACListenerS150S0100000_15(this, 219));
        }
        LinkMicBattleMessage linkMicBattleMessage = this.LLLF;
        if (linkMicBattleMessage != null) {
            EnumC919170a1j enumC919170a1j = EnumC919170a1j.MATCH_TYPE_2V2;
            BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
            Integer numValueOf2 = null;
            if (battleSetting != null) {
                numValueOf = Integer.valueOf(battleSetting.inviteType);
            } else {
                numValueOf = null;
            }
            boolean zLIZ = C959180b4G.LIZ(numValueOf);
            C973660bRc c973660bRc = C973660bRc.LIZ;
            Long lValueOf = Long.valueOf(linkMicBattleMessage.actionByUserId);
            List<TeamUsersInfo> list = linkMicBattleMessage.teamUsers;
            long j = linkMicBattleMessage.battleId;
            Map<Long, GiftGalleryBadgeInfo> map = linkMicBattleMessage.leagueInfoMap;
            EnumC919170a1j.Companion.getClass();
            String strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1j, 1);
            BattleSetting battleSetting2 = linkMicBattleMessage.battleSetting;
            if (battleSetting2 != null) {
                numValueOf2 = Integer.valueOf(battleSetting2.inviteType);
            }
            C973660bRc.LJJJJZI(lValueOf, true, list, j, map, zLIZ, strLIZIZ, numValueOf2, null, 576);
        }
    }
}
