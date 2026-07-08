package X;

import X.InterfaceC960070b5h;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.service.IQuickCoHostService;
import com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.random_linkmic_message.LinkerRandomMatchContent;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0b51, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC959650b51<COORDINATOR extends InterfaceC960070b5h> implements InterfaceC959610b4x<COORDINATOR> {
    public static final Set<EnumC959690b55> LJ = C13LQ.LJLIIL(new EnumC959690b55[]{EnumC959690b55.QUICK_CO_HOST_WAITING_TIMEOUT, EnumC959690b55.QUICK_CO_HOST_CANCEL_BUTTON_CLICKED, EnumC959690b55.AUTO_MATCH_FAILED, EnumC959690b55.QUICK_PAIR_INVITE_FAILED, EnumC959690b55.QUICK_PAIR_REPLY_FAILED, EnumC959690b55.RECEIVE_QUICK_PAIR_REPLY_REFUSE_MESSAGE, EnumC959690b55.GROUP_CHANNEL_ID_CHANGED, EnumC959690b55.CO_HOST_FINISHED, EnumC959690b55.ROOM_CLOSE, EnumC959690b55.KEEP_ALIVE_FAILED, EnumC959690b55.CONFLICT_MODE_TERMINATED, EnumC959690b55.USER_LIST_CHANGED, EnumC959690b55.TEAM_PAIR_REPLY_FAILED, EnumC959690b55.TEAM_PAIR_EXIT_STATE, EnumC959690b55.TEAM_PAIR_STOP_BUTTON_CLICKED, EnumC959690b55.TEAM_PAIR_TIMED_OUT, EnumC959690b55.QUICK_BATTLE_STOP_BUTTON_CLICKED});
    public final InterfaceC959730b59 LIZ;
    public final Object LIZIZ;
    public final EnumC958900b3o LIZJ;
    public final C01GW LIZLLL = C1935407i4.LIZ(AFwS203S0000000_15.get$arr$(343));

    @Override // X.InterfaceC959610b4x
    public void H9() {
    }

    @Override // X.InterfaceC959610b4x
    public void LIZ(LinkMessage linkMessage) {
    }

    @Override // X.InterfaceC959610b4x
    public void LIZIZ(C954640aww c954640aww) {
    }

    @Override // X.InterfaceC959610b4x
    public void LIZJ(LinkMessage linkMessage) {
    }

    @Override // X.InterfaceC959610b4x
    public void LIZLLL() {
    }

    @Override // X.InterfaceC959610b4x
    public void LJ(Integer num, EnumC959580b4u enumC959580b4u, BattleGamePlayContent battleGamePlayContent, boolean z) {
    }

    @Override // X.InterfaceC959610b4x
    public void LJFF() {
    }

    @Override // X.InterfaceC959610b4x
    public void LJII() {
    }

    @Override // X.InterfaceC959610b4x
    public void LJIIIIZZ(EnumC959580b4u enumC959580b4u, InterfaceC914930Zut<C960260b60> interfaceC914930Zut) {
    }

    @Override // X.InterfaceC959610b4x
    public void LJIIIZ() {
    }

    @Override // X.InterfaceC959610b4x
    public void LJIIJJI(String str, List list) {
    }

    @Override // X.InterfaceC959610b4x
    public void LJIIL(EnumC959750b5B enumC959750b5B, C950840aqo c950840aqo) {
    }

    @Override // X.InterfaceC959610b4x
    public void LJIILL() {
    }

    @Override // X.InterfaceC959610b4x
    public void LJIILLIIL() {
    }

    @Override // X.InterfaceC959610b4x
    public void LJIIZILJ() {
    }

    @Override // X.InterfaceC959610b4x
    public void LJIJ() {
    }

    @Override // X.InterfaceC959610b4x
    public void LJIJI() {
    }

    @Override // X.InterfaceC959610b4x
    public void LJIJJ() {
    }

    @Override // X.InterfaceC959610b4x
    public void LJIJJLI(C950840aqo c950840aqo) {
    }

    @Override // X.InterfaceC959610b4x
    public void LJIL(EnumC959750b5B enumC959750b5B) {
    }

    @Override // X.InterfaceC959610b4x
    public void LJJ(EnumC959750b5B enumC959750b5B, C950840aqo c950840aqo) {
    }

    @Override // X.InterfaceC959610b4x
    public void LJJI(C954640aww c954640aww) {
    }

    @Override // X.InterfaceC959610b4x
    public void LJJIFFI(EnumC959580b4u enumC959580b4u) {
    }

    @Override // X.InterfaceC959610b4x
    public void LJJIII() {
    }

    @Override // X.InterfaceC959610b4x
    public void LJJIIJ(C954630awv c954630awv) {
    }

    public final COORDINATOR LJJIIZ() {
        AbstractC959270b4P abstractC959270b4PLIZ;
        synchronized (this) {
            abstractC959270b4PLIZ = this.LIZ.LJIIIZ().LIZ(this.LIZJ, this.LIZ);
        }
        return abstractC959270b4PLIZ;
    }

    public boolean LJJIIZI() {
        return !(this instanceof C959660b52);
    }

    @Override // X.InterfaceC959610b4x
    public final EnumC958900b3o getStatus() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC959610b4x
    public void LJI(LinkMessage linkMessage) {
        int i;
        long id;
        long id2;
        if (linkMessage != null) {
            C01GW<C958830b3h> c01gw = C958830b3h.LJII;
            C958830b3h c958830b3hLIZ = C944440agU.LIZ();
            LinkerRandomMatchContent linkerRandomMatchContent = linkMessage.randomMatchContent;
            if (linkerRandomMatchContent.innerChannelId != 0) {
                i = 1;
            } else {
                i = 0;
            }
            String sessionId = this.LIZ.getSessionId();
            String str = linkerRandomMatchContent.matchId;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            User user = linkerRandomMatchContent.user;
            if (user != null) {
                id = user.getId();
            } else {
                id = 0;
            }
            int i2 = (int) linkerRandomMatchContent.sourceType;
            c958830b3hLIZ.getClass();
            AbstractC962030b8r.LJIIJ(c958830b3hLIZ.LIZJ, "cost", Long.valueOf(SystemClock.uptimeMillis() - 0), true);
            AbstractC962030b8r.LJIIJ(c958830b3hLIZ.LIZLLL, "session_id", sessionId, true);
            AbstractC962030b8r.LJIIJ(c958830b3hLIZ.LIZLLL, "match_id", str, true);
            AbstractC962030b8r.LJIIJ(c958830b3hLIZ.LIZLLL, "rival_user_id", Long.valueOf(id), true);
            AbstractC962030b8r.LJIIJ(c958830b3hLIZ.LIZLLL, "source_type", Integer.valueOf(i2), true);
            c958830b3hLIZ.LJIIL(Integer.valueOf(i), "is_cross_arc_active", true);
            c958830b3hLIZ.LJIJJLI("auto_match_msg");
            this.LIZ.c0().LJIIL++;
            String str3 = linkerRandomMatchContent.matchId;
            if (str3 != null) {
                str2 = str3;
            }
            long j = linkerRandomMatchContent.roomId;
            User user2 = linkerRandomMatchContent.user;
            if (user2 != null) {
                id2 = user2.getId();
            } else {
                id2 = 0;
            }
            if (j != 0 && id2 != 0 && C950220apo.LIZLLL() != 0) {
                if (this.LIZJ != EnumC958900b3o.WAITED) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("current status = ");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(", receive quick pair message in wrong state");
                    C20441214yg.LJ("QuickCoHostStateBase", C2188811AlT.LIZIZ(sbLIZ));
                    c958830b3hLIZ.LJJI(EnumC959850b5L.QUICK_LINK_MIC_STATE_WRONG.getType(), id2, this.LIZ.getSessionId(), str2);
                    return;
                }
                if (C915980Zwa.LJII().LLILZLL(true).size() > 1) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(" receive quick pair message when linked, linked user list = ");
                    sbLIZ2.append(C915980Zwa.LJII().LLILZLL(true));
                    C20441214yg.LJ("QuickCoHostStateBase", C2188811AlT.LIZIZ(sbLIZ2));
                    c958830b3hLIZ.LJJI(EnumC959850b5L.QUICK_PAIR_FILTER_WHEN_LINKED.getType(), id2, this.LIZ.getSessionId(), str2);
                    return;
                }
                C956340azg c956340azg = new C956340azg();
                c956340azg.LIZ = EnumC2005007tI.LINK_MSG;
                c956340azg.LIZIZ = linkMessage.randomMatchContent.pairedTime;
                ((InterfaceC954810axD) C1161920gLG.LIZJ(IQuickCoHostService.class)).h0(c956340azg);
                AbstractC962030b8r.LJIIJ(c958830b3hLIZ.LIZLLL, "rival_user_id", Long.valueOf(id2), true);
                c958830b3hLIZ.LJIJJLI("auto_match_msg_succeed");
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("targetRoomId = ");
            sbLIZ3.append(j);
            sbLIZ3.append(" targetUserId = ");
            sbLIZ3.append(id2);
            sbLIZ3.append(" current roomId = ");
            sbLIZ3.append(C950220apo.LIZLLL());
            sbLIZ3.append(" ignore quick pair message");
            C20441214yg.LJ("QuickCoHostStateBase", C2188811AlT.LIZIZ(sbLIZ3));
            c958830b3hLIZ.LJJI(EnumC959850b5L.RANDOM_MATCH_CONTENT_INVALID.getType(), id2, this.LIZ.getSessionId(), str2);
        }
    }

    @Override // X.InterfaceC959610b4x
    public final void LJIILIIL(EnumC959580b4u enumC959580b4u) {
        boolean z;
        EnumC959690b55 enumC959690b55;
        EnumC958840b3i enumC958840b3iD0 = this.LIZ.d0();
        if (enumC958840b3iD0 != EnumC958840b3i.TEAM_PAIR) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("quitQuickCoHostForTeamPair, quick cohost type is ");
            sbLIZ.append(enumC958840b3iD0);
            sbLIZ.append(". exitType=");
            sbLIZ.append(enumC959580b4u);
            C20441214yg.LJ("QuickCoHostStateBase", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!LJJIIZI()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("quitQuickCoHostForTeamPair, status=");
            sbLIZ2.append(this.LIZJ);
            sbLIZ2.append(". exitType=");
            sbLIZ2.append(enumC959580b4u);
            C20441214yg.LJIIL("QuickCoHostStateBase", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        int i = 0;
        if (enumC959580b4u != EnumC959580b4u.TEAM_PAIR_SYNC_STATE && enumC959580b4u != EnumC959580b4u.TEAM_PAIR_TIMED_OUT && enumC959580b4u != EnumC959580b4u.TEAM_PAIR_ONE_V_ONE_BATTLE_BUTTON_CLICKED) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("quitQuickCoHostForTeamPair, exitType=");
        sbLIZ3.append(enumC959580b4u);
        sbLIZ3.append(". needToExitMatchPool=");
        sbLIZ3.append(z);
        C20441214yg.LJIIIZ("QuickCoHostStateBase", C2188811AlT.LIZIZ(sbLIZ3));
        if (z) {
            if (C959830b5J.LIZ[enumC959580b4u.ordinal()] == 1) {
                i = 1;
            }
            LJJIIJZLJL(this, false, 0L, enumC959580b4u, Integer.valueOf(i), null, null, null, null, 486);
        }
        int i2 = C959830b5J.LIZ[enumC959580b4u.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        enumC959690b55 = EnumC959690b55.UNKNOWN;
                    } else {
                        enumC959690b55 = EnumC959690b55.TEAM_PAIR_TIMED_OUT;
                    }
                } else {
                    enumC959690b55 = EnumC959690b55.TEAM_PAIR_BATTLE_BUTTON_CLICKED;
                }
            } else {
                enumC959690b55 = EnumC959690b55.TEAM_PAIR_EXIT_STATE;
            }
        } else {
            enumC959690b55 = EnumC959690b55.TEAM_PAIR_STOP_BUTTON_CLICKED;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("quitQuickCoHostForTeamPair, transit to NONE from ");
        sbLIZ4.append(this.LIZ.Y2());
        sbLIZ4.append(". exitType=");
        sbLIZ4.append(enumC959580b4u);
        C20441214yg.LJIIIZ("QuickCoHostStateBase", C2188811AlT.LIZIZ(sbLIZ4));
        LJJIJ(EnumC958900b3o.NONE, null, enumC959690b55);
    }

    @Override // X.InterfaceC959610b4x
    public final void LJJII(EnumC959690b55 enumC959690b55) {
        if (C1152520g66.LIZIZ() && LJ.contains(enumC959690b55)) {
            C214831195p c214831195pM0 = C915980Zwa.LJIIIZ().m0();
            if (c214831195pM0 != null) {
                c214831195pM0.LIZ(C960250b5z.LIZ);
            }
            int size = C915980Zwa.LJII().LJJIJ().size();
            if (size <= 1) {
                C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
                if (c955010axXI30 == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("stateWillLeave: newLayoutAdapter is null, cannot revert solo layout (source=");
                    sbLIZ.append(enumC959690b55);
                    sbLIZ.append(", linkedSize=");
                    sbLIZ.append(size);
                    sbLIZ.append(')');
                    C20441214yg.LJIIL("QuickCoHostStateBase", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                C931800aM6.LIZ.getClass();
                boolean zLIZIZ = C931800aM6.LIZIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("stateWillLeave: solo cancel → resetLayoutWhenCoHostEnd (source=");
                sbLIZ2.append(enumC959690b55);
                sbLIZ2.append(", linkedSize=");
                sbLIZ2.append(size);
                sbLIZ2.append(", isUnion=");
                sbLIZ2.append(zLIZIZ);
                sbLIZ2.append(')');
                C20441214yg.LJIIIZ("QuickCoHostStateBase", C2188811AlT.LIZIZ(sbLIZ2));
                c955010axXI30.LJIJ(zLIZIZ);
            }
        }
    }

    @Override // X.InterfaceC959610b4x
    public final boolean LJIIJ(EnumC958900b3o enumC958900b3o, EnumC959690b55 enumC959690b55) {
        Set setLJIIIZ;
        InterfaceC960070b5h interfaceC960070b5hLJJIIZ = LJJIIZ();
        if (interfaceC960070b5hLJJIIZ == null || (setLJIIIZ = interfaceC960070b5hLJJIIZ.LJIIIZ()) == null) {
            setLJIIIZ = C08CX.INSTANCE;
        }
        return setLJIIIZ.contains(enumC958900b3o);
    }

    @Override // X.InterfaceC959610b4x
    public final void LJIILJJIL(EnumC959580b4u enumC959580b4u, InterfaceC914930Zut<C960260b60> interfaceC914930Zut) {
        EnumC958840b3i enumC958840b3iD0 = this.LIZ.d0();
        if (enumC958840b3iD0 != EnumC958840b3i.QUICK_BATTLE) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("quitQuickCoHostForQuickBattle, quick cohost type is ");
            sbLIZ.append(enumC958840b3iD0);
            sbLIZ.append(". exitType=");
            sbLIZ.append(enumC959580b4u);
            C20441214yg.LJ("QuickCoHostStateBase", C2188811AlT.LIZIZ(sbLIZ));
            if (interfaceC914930Zut != null) {
                interfaceC914930Zut.LIZ(1, "quick battle is not running", null);
                return;
            }
            return;
        }
        LJJIIJZLJL(this, false, 0L, enumC959580b4u, 1, null, null, null, interfaceC914930Zut, 230);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("quitQuickCoHostForQuickBattle, transit to NONE from ");
        sbLIZ2.append(this.LIZ.Y2());
        sbLIZ2.append(". exitType=");
        sbLIZ2.append(enumC959580b4u);
        C20441214yg.LJIIIZ("QuickCoHostStateBase", C2188811AlT.LIZIZ(sbLIZ2));
        LJJIJ(EnumC958900b3o.NONE, null, EnumC959690b55.QUICK_BATTLE_STOP_BUTTON_CLICKED);
    }

    public AbstractC959650b51(EnumC958900b3o enumC958900b3o, InterfaceC959730b59 interfaceC959730b59, Object obj) {
        this.LIZ = interfaceC959730b59;
        this.LIZIZ = obj;
        this.LIZJ = enumC958900b3o;
    }

    public final boolean LJJIJ(EnumC958900b3o enumC958900b3o, Object obj, EnumC959690b55 enumC959690b55) {
        return this.LIZ.LJIIJJI(enumC958900b3o, obj, enumC959690b55);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a A[PHI: r9 r23
      0x009a: PHI (r9v1 long) = (r9v0 long), (r9v3 long), (r9v3 long) binds: [B:66:0x0103, B:38:0x0092, B:40:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r23v1 long) = (r23v0 long), (r23v3 long), (r23v3 long) binds: [B:66:0x0103, B:38:0x0092, B:40:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0286  */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [int] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r40v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIIJZLJL(final X.AbstractC959650b51 r40, boolean r41, long r42, X.EnumC959580b4u r44, java.lang.Integer r45, com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent r46, kotlin.jvm.functions.Function0 r47, kotlin.jvm.functions.Function0 r48, X.InterfaceC914930Zut r49, int r50) {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC959650b51.LJJIIJZLJL(X.0b51, boolean, long, X.0b4u, java.lang.Integer, com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.0Zut, int):void");
    }
}
