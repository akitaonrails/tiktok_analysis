package X;

import com.bytedance.android.live.liveinteract.match.model.BattleQuickStartRequest;
import com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairConfigSetting;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bBS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963640bBS implements InterfaceC956300azc {
    public final C0TWC LIZ;
    public final InterfaceC957660b1o LIZIZ;
    public final InterfaceC449101ov LIZJ;
    public final InterfaceC963670bBV LIZLLL;
    public final InterfaceC963690bBX LJ;
    public BattleQuickStartRequest LJFF;
    public boolean LJI;
    public boolean LJII;

    @Override // X.InterfaceC956300azc
    public final void stop() {
        this.LIZLLL.LIZIZ();
    }

    @Override // X.InterfaceC957620b1k
    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Match widget is ready. hasPendingReq=");
        sbLIZ.append(this.LJI);
        C20441214yg.LJIIIZ("TeamPairBattleQuickStartOrchestrator", C2188811AlT.LIZIZ(sbLIZ));
        this.LJII = true;
        if (this.LJI) {
            this.LJI = false;
            BattleQuickStartRequest battleQuickStartRequest = this.LJFF;
            if (battleQuickStartRequest == null) {
                C20441214yg.LJ("TeamPairBattleQuickStartOrchestrator", "Has pending request but the cached request is null");
            } else {
                C20441214yg.LJIIIZ("TeamPairBattleQuickStartOrchestrator", "Start to send quick start request to backend");
                this.LIZLLL.LIZ(battleQuickStartRequest, new AwS594S0100000_15(this, 1025), new AwS594S0100000_15(this, 1026));
            }
        }
    }

    @Override // X.InterfaceC956300azc
    public final void LIZIZ(long j, InterfaceC954180awC interfaceC954180awC, C954930axP c954930axP) {
        BattleGamePlayContent battleGamePlayContentLIZ;
        if (!Intrinsics.LJFF(c954930axP.LIZIZ, "im") || !C959920b5S.LIZIZ(c954930axP) || (battleGamePlayContentLIZ = C959920b5S.LIZ(c954930axP)) == null) {
            return;
        }
        int i = battleGamePlayContentLIZ.inviteType;
        List<Integer> list = LiveMatchTeamPairConfigSetting.INSTANCE.getValue().inviteTypeWhiteList;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inviteType=");
        sbLIZ.append(i);
        sbLIZ.append(", whiteList=");
        sbLIZ.append(list);
        C20441214yg.LIZIZ("TeamPairBattleQuickStartOrchestrator", C2188811AlT.LIZIZ(sbLIZ));
        if (!list.contains(Integer.valueOf(i))) {
            C20441214yg.LJ("TeamPairBattleQuickStartOrchestrator", "inviteType is not team pair battle");
            return;
        }
        List<LinkUser> listLIZLLL = interfaceC954180awC.LIZLLL();
        List<BattleGamePlayContent.TeamUser> list2 = battleGamePlayContentLIZ.teamMember;
        if (!this.LIZ.LIZ(listLIZLLL, list2)) {
            C20441214yg.LJ("TeamPairBattleQuickStartOrchestrator", "Given players are not matched with the current co-host users");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Co-host users: ");
            sbLIZ2.append(C13LP.LJJLIIIJ(listLIZLLL, null, null, null, 0, null, AFwS245S0000000_12.get$arr$(219), 31));
            C20441214yg.LIZIZ("TeamPairBattleQuickStartOrchestrator", C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Teams: ");
            sbLIZ3.append(C13LP.LJJLIIIJ(list2, null, null, null, 0, null, AnonymousClass0207.get$arr$(142), 31));
            C20441214yg.LIZIZ("TeamPairBattleQuickStartOrchestrator", C2188811AlT.LIZIZ(sbLIZ3));
            this.LIZIZ.LIZ();
            return;
        }
        Long lLIZIZ = this.LIZ.LIZIZ(j, list2);
        if (lLIZIZ == null) {
            C20441214yg.LJ("TeamPairBattleQuickStartOrchestrator", "Cannot find the teammate");
            this.LIZIZ.LIZ();
            return;
        }
        List listLIZ = this.LIZJ.LIZ(listLIZLLL, j, lLIZIZ.longValue());
        final AwS416S0200000_15 awS416S0200000_15 = new AwS416S0200000_15(this, battleGamePlayContentLIZ, 95);
        if (Intrinsics.LJFF(listLIZLLL, listLIZ)) {
            awS416S0200000_15.invoke();
        } else {
            interfaceC954180awC.LLJJ().LJJJJJ(new ArrayList(listLIZ), new InterfaceC967450bHb() { // from class: X.0bBU
                @Override // X.InterfaceC967500bHg
                public final void LJIIL() {
                }

                @Override // X.InterfaceC967500bHg
                public final void LJIILJJIL(int i2, C967130bH5 c967130bH5) {
                }

                @Override // X.InterfaceC967500bHg
                public final void LJIILLIIL(List<LinkUser> list3, List<LinkUser> list4) {
                }

                @Override // X.InterfaceC967450bHb
                public final void LJJIIJ(List<LinkUser> list3, List<LinkUser> list4) {
                }

                @Override // X.InterfaceC967450bHb
                public final void LJJJJZ(List<LinkUser> list3, List<LinkUser> list4) {
                }

                @Override // X.InterfaceC967450bHb
                public final void LJJJJZI(List<LinkUser> list3) {
                }

                @Override // X.InterfaceC967450bHb
                public final void LJJJLL(List<LinkUser> list3) {
                }

                @Override // X.InterfaceC967450bHb
                public final void LJJJLZIJ(LinkUser linkUser) {
                }

                @Override // X.InterfaceC967450bHb
                public final void LJJL() {
                    awS416S0200000_15.invoke();
                }
            });
        }
    }

    public C963640bBS(C0TWB c0twb, C956500azw c956500azw, C449001ou c449001ou, C963650bBT c963650bBT, C958860b3k c958860b3k, C958880b3m c958880b3m, InterfaceC963690bBX interfaceC963690bBX) {
        this.LIZ = c0twb;
        this.LIZIZ = c956500azw;
        this.LIZJ = c449001ou;
        this.LIZLLL = c963650bBT;
        this.LJ = interfaceC963690bBX;
        c963650bBT.LIZJ(c958860b3k);
        c963650bBT.LIZJ(c958880b3m);
    }
}
