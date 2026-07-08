package X;

import com.bytedance.android.live.liveinteract.match.model.BattleQuickStartRequest;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTimeIncrementForBattleSetting;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bBR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963630bBR implements InterfaceC956300azc {
    public final ILiveMatchService LIZ;
    public final InterfaceC963670bBV LIZIZ;
    public BattleQuickStartRequest LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC956300azc
    public final void stop() {
        this.LIZIZ.LIZIZ();
    }

    @Override // X.InterfaceC957620b1k
    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Match widget is loaded. hasPendingReq=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('.');
        C20441214yg.LJIIIZ("QuickBattleQuickStartOrchestrator", C2188811AlT.LIZIZ(sbLIZ));
        this.LJ = true;
        if (this.LIZLLL) {
            this.LIZLLL = false;
            BattleQuickStartRequest battleQuickStartRequest = this.LIZJ;
            if (battleQuickStartRequest == null) {
                C20441214yg.LJ("QuickBattleQuickStartOrchestrator", "Has pending request but the cached request is null");
            } else {
                LIZLLL(battleQuickStartRequest);
            }
        }
    }

    public final void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Match widget is unloaded. hasPendingReq=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('.');
        C20441214yg.LJIIIZ("QuickBattleQuickStartOrchestrator", C2188811AlT.LIZIZ(sbLIZ));
        this.LJ = false;
    }

    public final void LIZLLL(BattleQuickStartRequest battleQuickStartRequest) {
        EnumC964170bCJ enumC964170bCJRY = this.LIZ.RY(false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("matchState=");
        sbLIZ.append(enumC964170bCJRY);
        C20441214yg.LJIIIZ("QuickBattleQuickStartOrchestrator", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC964170bCJRY == EnumC964170bCJ.NONE) {
            C20441214yg.LJ("QuickBattleQuickStartOrchestrator", "matchState is NONE. Can not start quick start.");
        } else {
            C20441214yg.LJIIIZ("QuickBattleQuickStartOrchestrator", "Start to send quick start request to backend");
            this.LIZIZ.LIZ(battleQuickStartRequest, new AwS594S0100000_15(this, 1023), new AwS594S0100000_15(this, 1024));
        }
    }

    public C963630bBR(ILiveMatchService iLiveMatchService, C963650bBT c963650bBT, C958870b3l c958870b3l) {
        this.LIZ = iLiveMatchService;
        this.LIZIZ = c963650bBT;
        c963650bBT.LIZJ(c958870b3l);
    }

    @Override // X.InterfaceC956300azc
    public final void LIZIZ(long j, InterfaceC954180awC interfaceC954180awC, C954930axP c954930axP) {
        BattleQuickStartRequest battleQuickStartRequest;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("orchestrateBattleStart, from=");
        sbLIZ.append(c954930axP.LIZIZ);
        C20441214yg.LJIIIZ("QuickBattleQuickStartOrchestrator", C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(c954930axP.LIZIZ, "im")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("message is from=");
            sbLIZ2.append(c954930axP.LIZIZ);
            sbLIZ2.append(", expected im. Return");
            C20441214yg.LIZIZ("QuickBattleQuickStartOrchestrator", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        int size = c954930axP.LIZ.size();
        if (size != 2) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("numConnectedUsers=");
            sbLIZ3.append(size);
            C20441214yg.LIZIZ("QuickBattleQuickStartOrchestrator", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        if (!C959920b5S.LIZIZ(c954930axP)) {
            C20441214yg.LIZIZ("QuickBattleQuickStartOrchestrator", "no valid battleGameplayContent");
            return;
        }
        BattleGamePlayContent battleGamePlayContentLIZ = C959920b5S.LIZ(c954930axP);
        if (battleGamePlayContentLIZ == null) {
            C20441214yg.LIZIZ("QuickBattleQuickStartOrchestrator", "battleGameplayContent is null");
            return;
        }
        if (battleGamePlayContentLIZ.inviteType != 5) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("inviteType ");
            sbLIZ4.append(battleGamePlayContentLIZ.inviteType);
            sbLIZ4.append(" is not direct battle");
            C20441214yg.LJ("QuickBattleQuickStartOrchestrator", C2188811AlT.LIZIZ(sbLIZ4));
            return;
        }
        C20441214yg.LIZIZ("QuickBattleQuickStartOrchestrator", "Checks are done. try to call quick start");
        long j2 = battleGamePlayContentLIZ.groupChannelId;
        long j3 = battleGamePlayContentLIZ.battleId;
        BattleQuickStartRequest battleQuickStartRequest2 = new BattleQuickStartRequest();
        battleQuickStartRequest2.channelId = j2;
        battleQuickStartRequest2.battleId = j3;
        long value = LiveInteractBattleDurationSetting.INSTANCE.getValue();
        long value2 = LiveTimeIncrementForBattleSetting.INSTANCE.getValue() + value;
        battleQuickStartRequest2.duration = value;
        battleQuickStartRequest2.actualDuration = value2;
        battleQuickStartRequest2.quickStartScene = 2;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("channelId=");
        sbLIZ5.append(j2);
        sbLIZ5.append(", battleId=");
        sbLIZ5.append(j3);
        sbLIZ5.append(", duration=");
        sbLIZ5.append(value);
        sbLIZ5.append(", actualDuration=");
        sbLIZ5.append(value2);
        C20441214yg.LIZIZ("BattleQuickStartRequestFactory", C2188811AlT.LIZIZ(sbLIZ5));
        if (battleQuickStartRequest2.channelId <= 0 || battleQuickStartRequest2.battleId <= 0 || ((battleQuickStartRequest = this.LIZJ) != null && battleQuickStartRequest2.battleId == battleQuickStartRequest.battleId)) {
            C20441214yg.LJIIL("QuickBattleQuickStartOrchestrator", "The request was sent before");
            return;
        }
        this.LIZJ = battleQuickStartRequest2;
        if (!this.LJ) {
            C20441214yg.LJIIL("QuickBattleQuickStartOrchestrator", "Match widget is not loaded, wait for it");
            this.LIZLLL = true;
        } else {
            this.LIZLLL = false;
            LIZLLL(battleQuickStartRequest2);
        }
    }
}
