package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchSettingRepositorySetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS155S0110000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bVT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976050bVT extends C975800bV4<InterfaceC976280bVq> {
    public final C976400bW2 LJI;
    public boolean LJII;

    @Override // X.C976040bVS, X.InterfaceC975690bUt
    public final void LIZLLL(String str) {
    }

    @Override // X.C976040bVS, X.InterfaceC975690bUt
    public final void LJ() {
        C20441214yg.LIZIZ("MatchStateInviter", "onMicRoomStart, cancel invite");
        InterfaceC976280bVq interfaceC976280bVq = (InterfaceC976280bVq) LJIILJJIL();
        if (interfaceC976280bVq != null) {
            interfaceC976280bVq.LJ();
        }
        InterfaceC976280bVq interfaceC976280bVq2 = (InterfaceC976280bVq) LJIILJJIL();
        if (interfaceC976280bVq2 != null) {
            interfaceC976280bVq2.LIZLLL();
        }
    }

    @Override // X.C976040bVS, X.InterfaceC975690bUt
    public final void H0(C960280b62 c960280b62) {
        if (c960280b62.LIZIZ == 2) {
            C20441214yg.LIZIZ("MatchStateInviter", "Anchor Pairing is successful. No need to transit to NONE state.");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StateNoneAnchor onCancelAutoMatchEvent, data = ");
        sbLIZ.append(c960280b62);
        C20441214yg.LIZIZ("liuxuedi", C2188811AlT.LIZIZ(sbLIZ));
        C975800bV4.LJJIIJ(this, EnumC975850bV9.CANCEL_BEFORE_INVITE);
    }

    @Override // X.C975800bV4, X.InterfaceC975690bUt
    public final void LIZ(AbstractC1136060ffY abstractC1136060ffY) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        InterfaceC976280bVq interfaceC976280bVq;
        EnumC975850bV9 enumC975850bV9;
        if (!(abstractC1136060ffY instanceof LinkMicBattleMessage)) {
            return;
        }
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        Integer numValueOf = null;
        if (interfaceC975520bUc != null) {
            boolValueOf = Boolean.valueOf(interfaceC975520bUc.d3());
        } else {
            boolValueOf = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        LinkMicBattleMessage linkMicBattleMessage = (LinkMicBattleMessage) abstractC1136060ffY;
        int i = linkMicBattleMessage.action;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 7) {
                            LJJIJIIJIL(linkMicBattleMessage.battleSetting);
                            BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
                            if (battleSetting != null) {
                                numValueOf = Integer.valueOf(battleSetting.inviteType);
                            }
                            boolean zLIZ = C959180b4G.LIZ(numValueOf);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("handleAcceptMsg isRematch:");
                            sbLIZ.append(zLIZ);
                            C20441214yg.LIZIZ("MatchStateInviter", C2188811AlT.LIZIZ(sbLIZ));
                            C974540bT2.LJJIJL(linkMicBattleMessage);
                            if (linkMicBattleMessage.battleSetting.status == 1) {
                                LJJIJ(1, linkMicBattleMessage);
                            }
                            InterfaceC976280bVq interfaceC976280bVq2 = (InterfaceC976280bVq) LJIILJJIL();
                            if (interfaceC976280bVq2 != null) {
                                interfaceC976280bVq2.LJIIIZ(linkMicBattleMessage);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    C20441214yg.LIZIZ("MatchStateInviter", "ACTION_OPEN with IM");
                    LJJIJIIJIL(linkMicBattleMessage.battleSetting);
                    LJJIJ(0, linkMicBattleMessage);
                    InterfaceC976280bVq interfaceC976280bVq3 = (InterfaceC976280bVq) LJIILJJIL();
                    if (interfaceC976280bVq3 == null) {
                        return;
                    }
                    interfaceC976280bVq3.LIZLLL();
                    return;
                }
                C20441214yg.LJIIIZ("MatchStateInviter", "handleCancelMessage");
                if (!C976040bVS.LJIIJ(this, linkMicBattleMessage.battleId)) {
                    return;
                }
                InterfaceC976280bVq interfaceC976280bVq4 = (InterfaceC976280bVq) LJIILJJIL();
                if (interfaceC976280bVq4 != null) {
                    interfaceC976280bVq4.LJJIIJZLJL(linkMicBattleMessage, zLJJJI);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("cancel message, isRematch = ");
                sbLIZ2.append(zLJJJI);
                C20441214yg.LIZIZ("MatchStateInviter", C2188811AlT.LIZIZ(sbLIZ2));
                EnumC964170bCJ enumC964170bCJ = EnumC964170bCJ.NONE;
                if (zLJJJI) {
                    enumC975850bV9 = EnumC975850bV9.CANCEL_MESSAGE_REMATCH;
                } else {
                    enumC975850bV9 = EnumC975850bV9.CANCEL_MESSAGE;
                }
                LJIJ(enumC964170bCJ, enumC975850bV9, linkMicBattleMessage, null);
                return;
            }
            if (!C976040bVS.LJIIJ(this, linkMicBattleMessage.battleId) || (interfaceC976280bVq = (InterfaceC976280bVq) LJIILJJIL()) == null) {
                return;
            }
            interfaceC976280bVq.LJJIJLIJ(linkMicBattleMessage, zLJJJI, new AwS381S0200000_15(this, abstractC1136060ffY, 113));
            return;
        }
        LJJIJIIJIL(linkMicBattleMessage.battleSetting);
        C974500bSy.LIZ(linkMicBattleMessage);
        InterfaceC976280bVq interfaceC976280bVq5 = (InterfaceC976280bVq) LJIILJJIL();
        if (interfaceC976280bVq5 != null) {
            boolValueOf2 = Boolean.valueOf(interfaceC976280bVq5.LJIILIIL(linkMicBattleMessage));
        } else {
            boolValueOf2 = null;
        }
        boolean zLJJJI2 = C500260Jjc.LJJJI(boolValueOf2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("receive invite ,isMeanwhile = ");
        sbLIZ3.append(zLJJJI2);
        C20441214yg.LIZIZ("MatchStateInviter", C2188811AlT.LIZIZ(sbLIZ3));
        if (C974500bSy.LIZJ(linkMicBattleMessage)) {
            C20441214yg.LIZIZ("MatchStateInviter", "receive invite, is team pair");
            return;
        }
        if (C974500bSy.LIZIZ(linkMicBattleMessage)) {
            C20441214yg.LIZIZ("MatchStateInviter", "receive direct match invite. skip");
            return;
        }
        if (zLJJJI2) {
            InterfaceC976280bVq interfaceC976280bVq6 = (InterfaceC976280bVq) LJIILJJIL();
            if (interfaceC976280bVq6 != null) {
                boolValueOf3 = Boolean.valueOf(interfaceC976280bVq6.LJJIJIIJIL(linkMicBattleMessage));
            } else {
                boolValueOf3 = null;
            }
            boolean zLJJJI3 = C500260Jjc.LJJJI(boolValueOf3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("showAutoAccept = ");
            sbLIZ4.append(zLJJJI3);
            C20441214yg.LIZIZ("MatchStateInviter", C2188811AlT.LIZIZ(sbLIZ4));
            if (zLJJJI3) {
                LJIJ(EnumC964170bCJ.ACCEPTED, EnumC975850bV9.INVITER_MEANWHILE_AUTO_ACCEPT, linkMicBattleMessage, null);
                return;
            } else {
                LJJI(linkMicBattleMessage);
                LJIJ(EnumC964170bCJ.RECEIVED, EnumC975850bV9.INVITER_MEANWHILE, linkMicBattleMessage, null);
                return;
            }
        }
        LJIJ(EnumC964170bCJ.RECEIVED, EnumC975850bV9.INVITE_MESSAGE, linkMicBattleMessage, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    @Override // X.InterfaceC975690bUt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.EnumC975850bV9 r9) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C976050bVT.LIZJ(X.0bV9):void");
    }

    @Override // X.InterfaceC975690bUt
    public final void LJI(EnumC975850bV9 enumC975850bV9) {
        this.LJI.LIZ();
        C0UVC.LIZJ("MatchStateInviter");
        C0UVC.LIZLLL = "stateWillLeave";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("status = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" fromSource = ");
        sbLIZ.append(enumC975850bV9);
        C0UVC.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC976280bVq interfaceC976280bVq = (InterfaceC976280bVq) LJIILJJIL();
        if (interfaceC976280bVq != null) {
            interfaceC976280bVq.LIZIZ();
        }
        InterfaceC976280bVq interfaceC976280bVq2 = (InterfaceC976280bVq) LJIILJJIL();
        if (interfaceC976280bVq2 != null) {
            interfaceC976280bVq2.LIZLLL();
        }
    }

    @Override // X.C976040bVS, X.InterfaceC975690bUt
    public final void LJII(long j) {
        Boolean boolValueOf;
        InterfaceC976280bVq interfaceC976280bVq = (InterfaceC976280bVq) LJIILJJIL();
        if (interfaceC976280bVq != null) {
            InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
            if (interfaceC975520bUc != null) {
                boolValueOf = Boolean.valueOf(interfaceC975520bUc.d3());
            } else {
                boolValueOf = null;
            }
            interfaceC976280bVq.LJIIJ(C500260Jjc.LJJIFFI(boolValueOf));
        }
        C20441214yg.LIZIZ("MatchStateInviter", "onForceTerminated, cancel invite");
        LJIJ(EnumC964170bCJ.NONE, EnumC975850bV9.INVITER_LEAVE_COHOST, null, null);
    }

    public final Pair<Boolean, Boolean> LJJIJIIJI(EnumC975850bV9 enumC975850bV9) {
        Pair<Boolean, Boolean> pairLJJIJ;
        InterfaceC976280bVq interfaceC976280bVq = (InterfaceC976280bVq) LJIILJJIL();
        if (interfaceC976280bVq == null || (pairLJJIJ = interfaceC976280bVq.LJJIJ(new AwS559S0100000_15(this, 863), new AwS559S0100000_15(this, 864), new AwS559S0100000_15(this, 865), new AwS559S0100000_15(this, 866), new AwS559S0100000_15(this, 867), new AwS594S0100000_15(this, 840), enumC975850bV9, this.LIZLLL)) == null) {
            return new Pair<>(Boolean.FALSE, Boolean.TRUE);
        }
        return pairLJJIJ;
    }

    public final void LJJIJIIJIL(BattleSetting battleSetting) {
        Integer numValueOf;
        EnumC919170a1j enumC919170a1jLJIIIZ;
        C975960bVK c975960bVKM3;
        Boolean boolValueOf = null;
        if (battleSetting != null) {
            numValueOf = Integer.valueOf(battleSetting.battleType);
        } else {
            numValueOf = null;
        }
        EnumC919170a1j enumC919170a1jLIZ = C918130a03.LIZ(numValueOf);
        if (enumC919170a1jLIZ != EnumC919170a1j.UNKNOWN) {
            InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
            if (interfaceC975520bUc != null) {
                enumC919170a1jLJIIIZ = interfaceC975520bUc.LJIIIZ();
            } else {
                enumC919170a1jLJIIIZ = null;
            }
            if (enumC919170a1jLIZ != enumC919170a1jLJIIIZ) {
                InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                if (interfaceC975520bUc2 != null) {
                    interfaceC975520bUc2.k3(enumC919170a1jLIZ);
                }
                InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
                if (interfaceC975520bUc3 != null && (c975960bVKM3 = interfaceC975520bUc3.m3()) != null) {
                    c975960bVKM3.LJLJJI(battleSetting);
                    c975960bVKM3.LJJJZ(false);
                    InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
                    if (interfaceC975520bUc4 != null) {
                        boolValueOf = Boolean.valueOf(interfaceC975520bUc4.d3());
                    }
                    c975960bVKM3.LJFF = C500260Jjc.LJJJI(boolValueOf);
                    c975960bVKM3.LIZLLL = enumC919170a1jLIZ;
                }
            }
        }
    }

    @Override // X.C975800bV4, X.InterfaceC975690bUt
    public final void h3(String str) {
        super.h3(str);
        C0UVC.LIZJ("MatchStateInviter");
        C0UVC.LIZLLL = "onClickBattleButton";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clickFrom = ");
        sbLIZ.append(str);
        C0UVC.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onClickBattleButton, clickFrom = ");
        sbLIZ2.append(str);
        C20441214yg.LIZIZ("MatchStateInviter", C2188811AlT.LIZIZ(sbLIZ2));
        EnumC975850bV9 enumC975850bV9 = EnumC975850bV9.MATCH_ICON_CLICK;
        if (!LJJIJIIJI(enumC975850bV9).getFirst().booleanValue()) {
            LJJIJIL(false, false, enumC975850bV9);
        }
    }

    @Override // X.C975800bV4, X.InterfaceC975690bUt
    public final void i3(C974230bSX c974230bSX) {
        EnumC919170a1j enumC919170a1jLJIIIZ;
        super.i3(c974230bSX);
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc != null) {
            enumC919170a1jLJIIIZ = interfaceC975520bUc.LJIIIZ();
        } else {
            enumC919170a1jLJIIIZ = null;
        }
        if (enumC919170a1jLJIIIZ != c974230bSX.LIZ) {
            return;
        }
        h3("game_router");
    }

    @Override // X.C976040bVS, X.InterfaceC975690bUt
    public final void LJFF(long j, String str) {
        Boolean boolValueOf;
        C975960bVK c975960bVKM3;
        MutableLiveData<List<C976480bWA>> mutableLiveData;
        List<C976480bWA> value;
        int size;
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        int i = 0;
        if (interfaceC975520bUc != null && (c975960bVKM3 = interfaceC975520bUc.m3()) != null && (mutableLiveData = c975960bVKM3.LJJJLIIL) != null && (value = mutableLiveData.getValue()) != null) {
            Iterator<C976480bWA> it2 = value.iterator();
            i = 0;
            while (it2.hasNext()) {
                List<C976800bWg> list = it2.next().LJFF;
                if (list != null) {
                    size = ((ArrayList) list).size();
                } else {
                    size = 0;
                }
                i += size;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserLeft ");
        sbLIZ.append(j);
        sbLIZ.append(" linkmicid = ");
        sbLIZ.append(str);
        sbLIZ.append(", currentListSize = ");
        sbLIZ.append(listLLILZLL.size());
        sbLIZ.append(" anchorCount = ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("MatchStateInviter", C2188811AlT.LIZIZ(sbLIZ));
        if (i != listLLILZLL.size()) {
            InterfaceC976280bVq interfaceC976280bVq = (InterfaceC976280bVq) LJIILJJIL();
            if (interfaceC976280bVq != null) {
                InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                if (interfaceC975520bUc2 != null) {
                    boolValueOf = Boolean.valueOf(interfaceC975520bUc2.d3());
                } else {
                    boolValueOf = null;
                }
                interfaceC976280bVq.LJIIJ(C500260Jjc.LJJIFFI(boolValueOf));
            }
            InterfaceC976280bVq interfaceC976280bVq2 = (InterfaceC976280bVq) LJIILJJIL();
            if (interfaceC976280bVq2 != null) {
                interfaceC976280bVq2.LIZLLL();
            }
        }
    }

    @Override // X.C976040bVS, X.InterfaceC975690bUt
    public final void LJIIL(List list, List list2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHostUserListChange = ");
        sbLIZ.append(list);
        C20441214yg.LIZIZ("MatchStateInviter", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onHostUserListChange, triggerMessage = ");
        sbLIZ2.append(this.LIZLLL);
        C20441214yg.LIZIZ("MatchStateInviter", C2188811AlT.LIZIZ(sbLIZ2));
        InterfaceC976280bVq interfaceC976280bVq = (InterfaceC976280bVq) LJIILJJIL();
        if (interfaceC976280bVq != null) {
            interfaceC976280bVq.LJIIJ(true);
        }
        InterfaceC976280bVq interfaceC976280bVq2 = (InterfaceC976280bVq) LJIILJJIL();
        if (interfaceC976280bVq2 != null) {
            interfaceC976280bVq2.LIZLLL();
        }
    }

    public final void LJJIJ(int i, LinkMicBattleMessage linkMicBattleMessage) {
        Integer numValueOf;
        if (this.LJII) {
            C20441214yg.LJIIIZ("MatchStateInviter", "handleBattleStartPreInspection: ");
            return;
        }
        this.LJII = true;
        BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
        if (battleSetting != null) {
            numValueOf = Integer.valueOf(battleSetting.inviteType);
        } else {
            numValueOf = null;
        }
        C959180b4G.LIZ(numValueOf);
        C976040bVS.LJJ(linkMicBattleMessage.leagueInfoMap, linkMicBattleMessage.leagueScoreInfoMap);
        LJIJJLI(linkMicBattleMessage.enigmaBattleSetting);
        if (i == 0) {
            LJIJ(EnumC964170bCJ.MATCH_START, EnumC975850bV9.OPEN_MESSAGE, linkMicBattleMessage, null);
        }
        if (linkMicBattleMessage.action == 7 && i == 1) {
            LJIJ(EnumC964170bCJ.MATCH_START, EnumC975850bV9.ACCEPT_MESSAGE, linkMicBattleMessage, null);
        }
    }

    @Override // X.C975800bV4, X.InterfaceC975690bUt
    public final void f3(int i, boolean z) {
        super.f3(i, z);
        C766270U4b.LIZLLL(2131853782);
        C974540bT2.LIZ.LJJJJJ(String.valueOf(i), EnumC964160bCI.BLOCKED, "invite_in_progress");
    }

    @Override // X.C976040bVS, X.InterfaceC975690bUt
    public final void LJIIIIZZ(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
        InterfaceC976280bVq interfaceC976280bVq = (InterfaceC976280bVq) LJIILJJIL();
        if (interfaceC976280bVq != null) {
            interfaceC976280bVq.LJIIJ(false);
        }
        InterfaceC976280bVq interfaceC976280bVq2 = (InterfaceC976280bVq) LJIILJJIL();
        if (interfaceC976280bVq2 != null) {
            interfaceC976280bVq2.LIZLLL();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLinkMicFinish, finishReason = ");
        sbLIZ.append(i);
        sbLIZ.append(", detailedCode = ");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ("MatchStateInviter", C2188811AlT.LIZIZ(sbLIZ));
        LJIJ(EnumC964170bCJ.NONE, EnumC975850bV9.INVITER_LEAVE_COHOST, null, null);
    }

    public final void LJJIJIL(boolean z, boolean z2, EnumC975850bV9 enumC975850bV9) {
        boolean z3;
        GiftMode giftModeLJIIZILJ;
        boolean z4;
        String str;
        C975960bVK c975960bVKM3;
        C975960bVK c975960bVKM32;
        C975960bVK c975960bVKM33;
        C0UVC.LIZJ("MatchStateInviter");
        C0UVC.LIZLLL = "openInviteDialog";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("status = ");
        sbLIZ.append(this.LIZ);
        C0UVC.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc != null && (c975960bVKM33 = interfaceC975520bUc.m3()) != null && c975960bVKM33.LJFF) {
            z3 = true;
        } else {
            z3 = false;
        }
        InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
        if (interfaceC975520bUc2 != null) {
            interfaceC975520bUc2.getDataChannel();
        }
        C918250a0F.LIZ(z3);
        Boolean boolValueOf = null;
        if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            giftModeLJIIZILJ = C915980Zwa.LJI().LJI().LJI().getValue();
        } else {
            InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
            if (interfaceC975810bV5LIZLLL != null) {
                giftModeLJIIZILJ = interfaceC975810bV5LIZLLL.LJIIZILJ();
            } else {
                giftModeLJIIZILJ = null;
            }
        }
        InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
        if (interfaceC975520bUc3 != null && (c975960bVKM32 = interfaceC975520bUc3.m3()) != null) {
            c975960bVKM32.LJJLJ(giftModeLJIIZILJ);
        }
        C973890bRz.LIZ.LJJLJ(giftModeLJIIZILJ);
        T tLJIILJJIL = LJIILJJIL();
        if (tLJIILJJIL != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("openInviteDialog, matchCoordinator = ");
            sbLIZ2.append(tLJIILJJIL.getClass().getName());
            C20441214yg.LIZIZ("MatchStateInviter", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (z && !z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        InterfaceC976280bVq interfaceC976280bVq = (InterfaceC976280bVq) LJIILJJIL();
        if (interfaceC976280bVq != null) {
            InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
            if (interfaceC975520bUc4 != null) {
                boolValueOf = Boolean.valueOf(interfaceC975520bUc4.d3());
            }
            boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
            InterfaceC975520bUc interfaceC975520bUc5 = this.LIZIZ;
            if (interfaceC975520bUc5 == null || (c975960bVKM3 = interfaceC975520bUc5.m3()) == null || (str = c975960bVKM3.LJIILIIL) == null) {
                str = "";
            }
            interfaceC976280bVq.LJIJJ(enumC975850bV9, z4, z3, zLJJJI, str, giftModeLJIIZILJ, new AwS594S0100000_15(this, 841), new C976220bVk(this, z3), new AwS155S0110000_15(this, z3, 2), new C976150bVd(z3, this, enumC975850bV9), new AwS594S0100000_15(this, 842), new AwS594S0100000_15(this, 843), new AwS559S0100000_15(this, 868), new AwS559S0100000_15(this, 869));
        }
    }

    public C976050bVT(EnumC964170bCJ enumC964170bCJ, InterfaceC975520bUc interfaceC975520bUc, InterfaceC977310bXV interfaceC977310bXV, LinkMicBattleMessage linkMicBattleMessage, EnumC975850bV9 enumC975850bV9) {
        super(enumC964170bCJ, interfaceC975520bUc, interfaceC977310bXV, linkMicBattleMessage, enumC975850bV9);
        this.LJI = new C976400bW2("MatchStateInviter", interfaceC975520bUc);
    }
}
