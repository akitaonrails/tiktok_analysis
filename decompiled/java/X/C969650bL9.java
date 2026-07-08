package X;

import Y.ARunnableS84S0200000_15;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleItemCard;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.ss.ugc.live.sdk.message.data.IMessage;

/* JADX INFO: renamed from: X.0bL9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969650bL9 implements InterfaceC969600bL4 {
    public final InterfaceC969670bLB LIZ;
    public AbstractC974680bTG LIZJ;
    public boolean LJ;
    public final C969610bL5 LIZIZ = new C969610bL5();
    public final EnumC964170bCJ LIZLLL = EnumC964170bCJ.NONE;

    @Override // X.InterfaceC969600bL4
    public final InterfaceC969670bLB LIZIZ() {
        return this.LIZ;
    }

    public C969650bL9(C969590bL3 c969590bL3) {
        this.LIZ = c969590bL3;
    }

    @Override // X.InterfaceC969600bL4
    public final void LIZJ(IMessage iMessage) {
        AbstractC974680bTG abstractC974680bTG = this.LIZJ;
        if (abstractC974680bTG != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("message = ");
            sbLIZ.append(iMessage);
            C20441214yg.LJIIIZ("MatchFeedViewDelegateAbs", C2188811AlT.LIZIZ(sbLIZ));
            if (iMessage instanceof LinkMicBattleMessage) {
                C0UHI.LIZ(new ARunnableS84S0200000_15(abstractC974680bTG, iMessage, 60));
                return;
            }
            if (iMessage instanceof LinkMicBattleArmiesMessage) {
                C0UHI.LIZ(new ARunnableS84S0200000_15(abstractC974680bTG, iMessage, 61));
                return;
            }
            if (iMessage instanceof LinkMicBattlePunishFinishMessage) {
                C0UHI.LIZ(new ARunnableS84S0200000_15(abstractC974680bTG, iMessage, 62));
            } else if (iMessage instanceof LinkMicBattleItemCard) {
                C0UHI.LIZ(new ARunnableS84S0200000_15(abstractC974680bTG, iMessage, 63));
            } else {
                C20441214yg.LJ("MatchFeedViewDelegateAbs", "mMessageReceiver-> receive message is not support");
            }
        }
    }

    @Override // X.InterfaceC969600bL4
    public final void se(LinkMicBattleMessage linkMicBattleMessage) {
        int i;
        BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
        if (battleSetting != null) {
            i = battleSetting.battleType;
        } else {
            i = 0;
        }
        LIZLLL(i, "open_message");
        AbstractC974680bTG abstractC974680bTG = this.LIZJ;
        if (abstractC974680bTG != null) {
            abstractC974680bTG.LJII(linkMicBattleMessage);
        }
    }

    @Override // X.InterfaceC969600bL4
    public final boolean LIZ(BattleInfoResponse battleInfoResponse, int i) {
        int i2;
        BattleSetting battleSetting = battleInfoResponse.setting;
        if (battleSetting != null) {
            i2 = battleSetting.battleType;
        } else {
            i2 = 0;
        }
        LIZLLL(i2, "room_enter");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleBattleInfo, matchViewDelegate = ");
        sbLIZ.append(this.LIZJ);
        C20441214yg.LIZIZ("MatchFeedWidget", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC974680bTG abstractC974680bTG = this.LIZJ;
        if (abstractC974680bTG == null) {
            return false;
        }
        return abstractC974680bTG.LJI(battleInfoResponse, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C969650bL9.LIZLLL(int, java.lang.String):void");
    }
}
