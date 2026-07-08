package X;

import com.bytedance.android.live.liveinteract.match.business.event.TeamPairBattleInvitationChannel;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0b3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958810b3f {
    public static final /* synthetic */ int LIZ = 0;

    public static InterfaceC963690bBX LIZ(final DataChannel dataChannel) {
        if (dataChannel == null) {
            C20441214yg.LJIIL("TeamPairBattleInvitationCacheModule", "DataChannel is null, use simple object cache");
            return new InterfaceC963690bBX() { // from class: X.0bC6
                public static C964020bC4 LIZIZ;

                @Override // X.InterfaceC963690bBX
                public final void clear() {
                    LIZIZ = null;
                }

                @Override // X.InterfaceC963690bBX
                public final C964020bC4 get() {
                    return LIZIZ;
                }

                @Override // X.InterfaceC963690bBX
                public final boolean LIZ(LinkMicBattleMessage linkMicBattleMessage) {
                    if (!C964050bC7.LIZ(linkMicBattleMessage)) {
                        return false;
                    }
                    BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
                    LIZIZ = new C964020bC4(battleSetting.battleId, battleSetting.channelId, battleSetting.inviteType);
                    C20441214yg.LIZIZ("SimpleCache", "Cache battle information for team pair solo anchor");
                    return true;
                }
            };
        }
        C20441214yg.LIZIZ("TeamPairBattleInvitationCacheModule", "use data channel cache");
        return new InterfaceC963690bBX(dataChannel) { // from class: X.0bC5
            public final DataChannel LIZ;

            @Override // X.InterfaceC963690bBX
            public final void clear() {
                this.LIZ.zW(TeamPairBattleInvitationChannel.class, new C964020bC4(0L, 0L, 0));
            }

            @Override // X.InterfaceC963690bBX
            public final C964020bC4 get() {
                return (C964020bC4) this.LIZ.gg0(TeamPairBattleInvitationChannel.class);
            }

            {
                this.LIZ = dataChannel;
            }

            @Override // X.InterfaceC963690bBX
            public final boolean LIZ(LinkMicBattleMessage linkMicBattleMessage) {
                if (!C964050bC7.LIZ(linkMicBattleMessage)) {
                    return false;
                }
                BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
                this.LIZ.zW(TeamPairBattleInvitationChannel.class, new C964020bC4(battleSetting.battleId, battleSetting.channelId, battleSetting.inviteType));
                C20441214yg.LIZIZ("DataChannelCache", "Cache battle information for team pair solo anchor");
                return true;
            }
        };
    }
}
