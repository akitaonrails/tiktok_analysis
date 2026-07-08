package X;

import Y.ARunnableS115S0100000_15;
import Y.AfS184S0100000_15;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemExtraTimeCardSentEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTimeIncrementForBattleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchBattleStartTimeTrackingFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCountDownOptSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserInfoWrapper;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bVP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976010bVP extends C975970bVL {
    public final BattleInfoResponse LJIILL;
    public long LJIILLIIL;
    public final BPEAHandler LJIIZILJ;
    public C11JF LJIJ;
    public C1699720uKg LJIJI;
    public final ARunnableS115S0100000_15 LJIJJ;

    public final void LJJJJZ() {
        C11JF c11jf;
        C1699720uKg c1699720uKg = this.LJIJI;
        if (c1699720uKg != null) {
            c1699720uKg.LIZ();
        }
        C11JF c11jf2 = this.LJIJ;
        if (!C500260Jjc.LJJIJIIJIL(c11jf2 != null ? Boolean.valueOf(c11jf2.isDisposed()) : null) || (c11jf = this.LJIJ) == null) {
            return;
        }
        c11jf.dispose();
    }

    @Override // X.C976040bVS, X.InterfaceC975690bUt
    public final void d1() {
        MutableLiveData<List<C976480bWA>> mutableLiveData;
        List<C976480bWA> value;
        C975960bVK c975960bVK = this.LJII;
        Long lValueOf = c975960bVK != null ? Long.valueOf(c975960bVK.LJJJJJ()) : null;
        C20441214yg.LIZIZ("MultiMatchStateBattlingAudience", "MultiMatch State Battling audience cohost window recreated ");
        C975960bVK c975960bVK2 = this.LJII;
        if (c975960bVK2 == null || (mutableLiveData = c975960bVK2.LJJJLIIL) == null || (value = mutableLiveData.getValue()) == null) {
            return;
        }
        for (C976480bWA c976480bWA : value) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update hostArmies, ");
            sbLIZ.append(c976480bWA);
            sbLIZ.append(", user name = ");
            sbLIZ.append(c976480bWA.LIZ);
            sbLIZ.append(",  rank = ");
            sbLIZ.append(c976480bWA.LIZLLL);
            C20441214yg.LIZIZ("MultiMatchStateBattlingAudience", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC976360bVy interfaceC976360bVy = (InterfaceC976360bVy) LJIILJJIL();
            if (interfaceC976360bVy != null) {
                interfaceC976360bVy.LJJIJIL(C915980Zwa.LJFF().Nt() ? c976480bWA.LJ : c976480bWA.LIZLLL, c976480bWA.LJFF, lValueOf != null && c976480bWA.LIZ == lValueOf.longValue(), true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJJLIIL() {
        /*
            r5 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "linkedList = "
            r1.append(r0)
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            r4 = 1
            java.util.List r0 = r0.LLILZLL(r4)
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = " and listSize = "
            r1.append(r0)
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            java.util.List r0 = r0.LJIJJ()
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r3 = "MultiMatchStateBattlingAudience"
            X.C20441214yg.LJ(r3, r0)
            X.0bVK r0 = r5.LJII
            if (r0 == 0) goto L67
            androidx.lifecycle.MutableLiveData<java.util.List<X.0bWA>> r0 = r0.LJJJLIIL
            if (r0 == 0) goto L67
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L67
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
        L4b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r1.next()
            X.0bWA r0 = (X.C976480bWA) r0
            java.util.List<X.0bWg> r0 = r0.LJFF
            if (r0 == 0) goto L63
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
        L61:
            int r2 = r2 + r0
            goto L4b
        L63:
            r0 = 0
            goto L61
        L65:
            if (r2 != 0) goto L73
        L67:
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            java.util.List r0 = r0.LLILZLL(r4)
            int r2 = r0.size()
        L73:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "retry , linked size from model = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LJ(r3, r0)
            X.0Zyn r1 = X.EnumC919170a1j.Companion
            X.0bUc r0 = r5.LIZIZ
            if (r0 == 0) goto L92
            X.0a1j r0 = r0.LJIIIZ()
            if (r0 != 0) goto L94
        L92:
            X.0a1j r0 = X.EnumC919170a1j.MATCH_TYPE_INDIVIDUAL
        L94:
            r1.getClass()
            java.lang.String r0 = X.C917350Zyn.LIZIZ(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C976010bVP.LJJJLIIL():java.lang.String");
    }

    @Override // X.C975970bVL, X.C975800bV4, X.InterfaceC975690bUt
    public final void LIZ(AbstractC1136060ffY abstractC1136060ffY) {
        Integer numValueOf;
        super.LIZ(abstractC1136060ffY);
        if (abstractC1136060ffY instanceof LinkMicBattleMessage) {
            LinkMicBattleMessage linkMicBattleMessage = (LinkMicBattleMessage) abstractC1136060ffY;
            int i = linkMicBattleMessage.action;
            if (i != 5) {
                if (i == 6) {
                    C974540bT2 c974540bT2 = C974540bT2.LIZ;
                    JSONObject jSONObject = new JSONObject();
                    C974540bT2.LJIJ(linkMicBattleMessage, jSONObject);
                    C0K04.LJ("battle_id", linkMicBattleMessage.battleId, jSONObject);
                    C974540bT2.LJIJJLI(jSONObject, false);
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
                    if (battleSetting != null) {
                        numValueOf = Integer.valueOf(battleSetting.battleType);
                    } else {
                        numValueOf = null;
                    }
                    C974540bT2.LLIIZ(c974540bT2, "cut_short_message", jSONObject, jSONObject2, jSONObject3, false, C918130a03.LIZ(numValueOf), 16);
                    if (!C976040bVS.LJIIJ(this, linkMicBattleMessage.battleId)) {
                        return;
                    }
                    C975800bV4.LJJIIZ(this, linkMicBattleMessage, null, EnumC975850bV9.SETTLE_CUT_SHORT_MESSAGE_AUDIENCE, 2);
                    return;
                }
                return;
            }
            C974540bT2.LIZ.LLF(linkMicBattleMessage);
            if (!C976040bVS.LJIIJ(this, linkMicBattleMessage.battleId)) {
                return;
            }
            C975800bV4.LJJIIZ(this, linkMicBattleMessage, null, EnumC975850bV9.SETTLE_FINISH_MESSAGE_AUDIENCE, 2);
        }
    }

    @Override // X.InterfaceC975690bUt
    public final void LIZJ(EnumC975850bV9 enumC975850bV9) {
        Boolean boolValueOf;
        DataChannel dataChannel;
        Integer numValueOf;
        Long lValueOf;
        Long l;
        long jLongValue;
        List<? extends TeamUsersInfo> list;
        String str;
        long j;
        C975960bVK c975960bVK;
        long jLIZ;
        InterfaceC975520bUc interfaceC975520bUc;
        Room roomInfo;
        Integer numValueOf2;
        boolean z;
        List<? extends TeamUsersInfo> list2;
        long j2;
        long jLongValue2;
        InterfaceC975520bUc interfaceC975520bUc2;
        Room roomInfo2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("state did enter ");
        sbLIZ.append(this.LIZ);
        C20441214yg.LIZIZ("MultiMatchStateBattlingAudience", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
        DataChannel dataChannel2 = null;
        if (interfaceC975520bUc3 != null) {
            boolValueOf = Boolean.valueOf(interfaceC975520bUc3.isAnchor());
        } else {
            boolValueOf = null;
        }
        C176600m4.LIZIZ(boolValueOf);
        LJJJJZ();
        LinkMicBattleMessage linkMicBattleMessage = this.LIZLLL;
        boolean z2 = false;
        if (linkMicBattleMessage != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleOpenMessage, info = ");
            sbLIZ2.append(Long.valueOf(linkMicBattleMessage.getMessageId()));
            sbLIZ2.append(", CurrentState = ");
            sbLIZ2.append(this.LIZ);
            C20441214yg.LJIIIZ("MultiMatchStateBattlingAudience", C2188811AlT.LIZIZ(sbLIZ2));
            BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
            if (battleSetting != null) {
                numValueOf2 = Integer.valueOf(battleSetting.inviteType);
            } else {
                numValueOf2 = null;
            }
            boolean zLIZ = C959180b4G.LIZ(numValueOf2);
            if (linkMicBattleMessage.battleSetting.battleType != EnumC919170a1j.MATCH_TYPE_1V1.getType()) {
                z = true;
            } else {
                z = false;
            }
            if (zLIZ) {
                C970290bMB.LIZ.getClass();
                C970290bMB.LJIJJ(1, false);
                C974540bT2 c974540bT2 = C974540bT2.LIZ;
                C974540bT2.LLIIII("normal", z);
            }
            try {
                C970290bMB.LIZ.LJIJI("open_message", "start", z, zLIZ);
                C955430ayD.LJIIIIZZ("match_open_message");
                C975960bVK c975960bVK2 = this.LJII;
                if ((c975960bVK2 == null || c975960bVK2.LJ != linkMicBattleMessage.battleId) && (interfaceC975520bUc2 = this.LIZIZ) != null) {
                    EnumC975850bV9 enumC975850bV92 = EnumC975850bV9.OPEN_MESSAGE_AUDIENCE;
                    InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
                    if (interfaceC975520bUc4 != null) {
                        roomInfo2 = interfaceC975520bUc4.getRoomInfo();
                    } else {
                        roomInfo2 = null;
                    }
                    interfaceC975520bUc2.g3(new C975960bVK(enumC975850bV92, false, roomInfo2));
                }
                LJJJJLI(linkMicBattleMessage);
                C974540bT2.LIZ.LLFFF(linkMicBattleMessage);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("handleOpenMessage occurs exceptions, message = ");
                sbLIZ3.append(e);
                C20441214yg.LJ("MultiMatchStateBattlingAudience", C2188811AlT.LIZIZ(sbLIZ3));
            }
            List<BattleUserInfoWrapper> list3 = linkMicBattleMessage.anchorInfo;
            if (list3 != null) {
                ArrayList<BattleUserInfoWrapper> arrayList = new ArrayList();
                for (BattleUserInfoWrapper battleUserInfoWrapper : list3) {
                    BattleUserInfoWrapper battleUserInfoWrapper2 = battleUserInfoWrapper;
                    if (battleUserInfoWrapper2.userId != null && battleUserInfoWrapper2.userInfo != null) {
                        arrayList.add(battleUserInfoWrapper);
                    }
                }
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (BattleUserInfoWrapper battleUserInfoWrapper3 : arrayList) {
                    Long l2 = battleUserInfoWrapper3.userId;
                    if (l2 != null) {
                        jLongValue2 = l2.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    Long lValueOf2 = Long.valueOf(jLongValue2);
                    BattleUserInfo battleUserInfo = battleUserInfoWrapper3.userInfo;
                    if (battleUserInfo == null) {
                        battleUserInfo = new BattleUserInfo(null, null, 3, null);
                    }
                    Pair pair = new Pair(lValueOf2, battleUserInfo);
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                C976040bVS.LJIIJJI(linkedHashMap);
            }
            this.LJIILLIIL = linkMicBattleMessage.battleId;
            C973660bRc c973660bRc = C973660bRc.LIZ;
            C975960bVK c975960bVK3 = this.LJII;
            if (c975960bVK3 != null) {
                list2 = c975960bVK3.LJJIJ;
            } else {
                list2 = null;
            }
            c973660bRc.LJJJLIIL(LJJJLIIL(), "battling_open_message", list2, z, true);
            BattleSetting battleSetting2 = linkMicBattleMessage.battleSetting;
            if (battleSetting2 != null) {
                j2 = battleSetting2.extraDurationSecond;
            } else {
                j2 = 0;
            }
            Map mapLJJIJIIJIL = C975970bVL.LJJIJIIJIL(linkMicBattleMessage);
            List arrayList2 = linkMicBattleMessage.teamArmies;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            LJJJJZI(10, j2, arrayList2, mapLJJIJIIJIL, true);
        }
        BattleInfoResponse battleInfoResponse = this.LJIILL;
        if (battleInfoResponse != null) {
            BattleSetting battleSetting3 = battleInfoResponse.setting;
            if (battleSetting3 != null) {
                numValueOf = Integer.valueOf(battleSetting3.inviteType);
            } else {
                numValueOf = null;
            }
            boolean zLIZ2 = C959180b4G.LIZ(numValueOf);
            C975960bVK c975960bVK4 = this.LJII;
            if (c975960bVK4 != null) {
                lValueOf = Long.valueOf(c975960bVK4.LJ);
            } else {
                lValueOf = null;
            }
            if (!Intrinsics.LJFF(lValueOf, battleInfoResponse.battleId) && (interfaceC975520bUc = this.LIZIZ) != null) {
                InterfaceC975520bUc interfaceC975520bUc5 = this.LIZIZ;
                if (interfaceC975520bUc5 != null) {
                    roomInfo = interfaceC975520bUc5.getRoomInfo();
                } else {
                    roomInfo = null;
                }
                interfaceC975520bUc.g3(new C975960bVK(enumC975850bV9, false, roomInfo));
            }
            LJIL(battleInfoResponse);
            if (LiveMatchBattleStartTimeTrackingFixSetting.INSTANCE.isEnable() && (c975960bVK = this.LJII) != null) {
                c975960bVK.LJJII = C974520bT0.LIZ();
                BattleSetting battleSetting4 = battleInfoResponse.setting;
                if (battleSetting4 != null) {
                    jLIZ = battleSetting4.startTimeMs;
                } else {
                    jLIZ = C974520bT0.LIZ();
                }
                c975960bVK.LJJIII = jLIZ;
            }
            BattleSetting battleSetting5 = battleInfoResponse.setting;
            if (battleSetting5 == null || (battleSetting5.battleType != 0 && battleSetting5.battleType != EnumC919170a1j.MATCH_TYPE_1V1.getType())) {
                z2 = true;
            }
            long j3 = this.LJIILLIIL;
            Long l3 = battleInfoResponse.battleId;
            if ((l3 == null || j3 != l3.longValue()) && ((l = battleInfoResponse.battleId) == null || l.longValue() != 0)) {
                Long l4 = battleInfoResponse.battleId;
                if (l4 != null) {
                    jLongValue = l4.longValue();
                } else {
                    jLongValue = 0;
                }
                this.LJIILLIIL = jLongValue;
                C973660bRc c973660bRc2 = C973660bRc.LIZ;
                C975960bVK c975960bVK5 = this.LJII;
                if (c975960bVK5 != null) {
                    list = c975960bVK5.LJJIJ;
                } else {
                    list = null;
                }
                String strLJJJLIIL = LJJJLIIL();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("battling_battle_info_");
                sbLIZ4.append(enumC975850bV9.getSource());
                c973660bRc2.LJJJLIIL(strLJJJLIIL, C2188811AlT.LIZIZ(sbLIZ4), list, z2, true);
            }
            if (enumC975850bV9 == EnumC975850bV9.AUDIENCE_BATTLE_INFO_ROOM_ENTER) {
                str = "room_enter";
            } else {
                str = "battle_info";
            }
            C970290bMB.LIZ.LJIJI(str, "start", z2, zLIZ2);
            BattleSetting battleSetting6 = battleInfoResponse.setting;
            if (battleSetting6 != null) {
                j = battleSetting6.extraDurationSecond;
            } else {
                j = 0;
            }
            ArrayList arrayList3 = new ArrayList();
            Map<Long, BattleTeamUserArmies> map = battleInfoResponse.teamArmies;
            if (map != null) {
                Iterator<Map.Entry<Long, BattleTeamUserArmies>> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList3.add(it2.next().getValue());
                }
            }
            LJJJJZI(C970370bMJ.LIZ(enumC975850bV9), j, arrayList3, battleInfoResponse.armies, false);
        }
        InterfaceC975520bUc interfaceC975520bUc6 = this.LIZIZ;
        if (interfaceC975520bUc6 != null && (dataChannel = interfaceC975520bUc6.getDataChannel()) != null) {
            dataChannel.CQ2(BattleItemExtraTimeCardSentEvent.class, this, new AwS594S0100000_15(this, 870));
        }
        IMatchAICommentaryService iMatchAICommentaryServiceLJ = C915980Zwa.LJ();
        InterfaceC975520bUc interfaceC975520bUc7 = this.LIZIZ;
        if (interfaceC975520bUc7 != null) {
            dataChannel2 = interfaceC975520bUc7.getDataChannel();
        }
        iMatchAICommentaryServiceLJ.IY0(dataChannel2);
        LJJJJIZL("MultiMatchStateBattlingAudience");
    }

    @Override // X.C975970bVL, X.InterfaceC975690bUt
    public final void LJI(EnumC975850bV9 enumC975850bV9) {
        Boolean boolValueOf;
        DataChannel dataChannel;
        C11JF c11jf;
        this.LJIIZILJ.removeCallbacks(this.LJIJJ);
        C11JF c11jf2 = this.LJIJ;
        if (c11jf2 != null) {
            boolValueOf = Boolean.valueOf(c11jf2.isDisposed());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIL(boolValueOf) && (c11jf = this.LJIJ) != null) {
            c11jf.dispose();
        }
        LJJJJZ();
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc != null && (dataChannel = interfaceC975520bUc.getDataChannel()) != null) {
            dataChannel.zQ2(this);
        }
    }

    public final void LJJJLL(long j, long j2, long j3) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleCountDown, timeSecond = ");
        sbLIZ.append(j);
        sbLIZ.append(" and extraTime = ");
        sbLIZ.append(j2);
        C20441214yg.LJIIIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ));
        final long j4 = j3 + j2;
        long j5 = j + j4;
        if (j5 <= 0) {
            return;
        }
        C975960bVK c975960bVK = this.LJII;
        if (c975960bVK != null) {
            c975960bVK.LJJIIJZLJL = j5;
        }
        final C974800bTS c974800bTS = new C974800bTS(j5, j4);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BattleCountDown, realTimeSecond = ");
        sbLIZ2.append(j5);
        sbLIZ2.append(" addExtraTime = ");
        sbLIZ2.append(j2);
        sbLIZ2.append(" totalExtraTime = ");
        sbLIZ2.append(j4);
        sbLIZ2.append(" lastExtra = ");
        sbLIZ2.append(j3);
        sbLIZ2.append(" lastLeftTime = ");
        sbLIZ2.append(j);
        C20441214yg.LIZIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ2));
        if (LiveInteractBattleDurationSetting.INSTANCE.getValue() == j && j2 == 0) {
            InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
            if (interfaceC975520bUc != null && (dataChannel2 = interfaceC975520bUc.getDataChannel()) != null) {
                dataChannel2.zW(BattleTimeLeftChannel.class, new C974800bTS(j - 1, 0L));
            }
        } else {
            InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
            if (interfaceC975520bUc2 != null && (dataChannel = interfaceC975520bUc2.getDataChannel()) != null) {
                dataChannel.zW(BattleTimeLeftChannel.class, c974800bTS);
            }
        }
        if (this.LJIJI == null) {
            this.LJIJI = new C1699720uKg();
        } else {
            LJJJJZ();
        }
        C1699720uKg c1699720uKg = this.LJIJI;
        if (c1699720uKg != null) {
            c1699720uKg.LIZ = new InterfaceC1699740uKi() { // from class: X.0bVv
                @Override // X.InterfaceC1699740uKi
                public final void LIZLLL() {
                    DataChannel dataChannel3;
                    C20441214yg.LJIIIZ("MultiMatchStateMatching", "MatchCountDown, finish");
                    InterfaceC975520bUc interfaceC975520bUc3 = this.LIZ.LIZIZ;
                    if (interfaceC975520bUc3 != null && (dataChannel3 = interfaceC975520bUc3.getDataChannel()) != null) {
                        dataChannel3.zW(BattleTimeLeftChannel.class, new C974800bTS(0L, j4));
                    }
                    long value = LiveTimeIncrementForBattleSetting.INSTANCE.getValue();
                    C976010bVP c976010bVP = this.LIZ;
                    C11O8 c11o8LJJJLZIJ = C11NZ.LJLJJLL(value, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ());
                    C976010bVP c976010bVP2 = this.LIZ;
                    c976010bVP.LJIJ = (C11JF) c11o8LJJJLZIJ.LJJLL(new AfS184S0100000_15(c976010bVP2, 153), new AfS184S0100000_15(c976010bVP2, 154));
                }

                @Override // X.InterfaceC1699740uKi
                public final void LJJI(long j6) {
                    DataChannel dataChannel3;
                    InterfaceC975520bUc interfaceC975520bUc3 = this.LIZ.LIZIZ;
                    if (interfaceC975520bUc3 != null && (dataChannel3 = interfaceC975520bUc3.getDataChannel()) != null) {
                        dataChannel3.zW(BattleTimeLeftChannel.class, C974800bTS.LIZ(c974800bTS, j6));
                    }
                }
            };
            c1699720uKg.LIZIZ(j5, LiveMatchCountDownOptSetting.INSTANCE.getRefreshIntervalMs());
        }
    }

    public C976010bVP(EnumC964170bCJ enumC964170bCJ, InterfaceC975520bUc interfaceC975520bUc, InterfaceC977310bXV interfaceC977310bXV, LinkMicBattleMessage linkMicBattleMessage, BattleInfoResponse battleInfoResponse) {
        super(enumC964170bCJ, interfaceC975520bUc, interfaceC977310bXV, linkMicBattleMessage, battleInfoResponse);
        this.LJIILL = battleInfoResponse;
        this.LJIIZILJ = new BPEAHandler(Looper.getMainLooper());
        this.LJIJJ = new ARunnableS115S0100000_15(this, 158);
    }

    public final void LJJJJZI(int i, long j, List list, Map map, boolean z) {
        long j2;
        EnumC919170a1j enumC919170a1jLJIIIZ;
        EnumC919170a1j enumC919170a1jLJIIIZ2;
        ArrayList arrayList;
        BattleSetting battleSetting;
        List<? extends TeamUsersInfo> list2;
        Map mapLJ = map;
        C978500bZQ.LIZIZ("match_prepare");
        long jLJIILL = LJIILL();
        long j3 = jLJIILL + j;
        LJJJLL(jLJIILL, j, 0L);
        if (j3 > 1) {
            C786410Ut5.LJLIIL(1000L, this.LJIIZILJ, this.LJIJJ);
        }
        long jLJIILL2 = LJIILL() + j;
        long channelId = C915980Zwa.LJI().LJIIJ().getChannelId();
        C975960bVK c975960bVK = this.LJII;
        long j4 = 0;
        if (c975960bVK != null) {
            j2 = c975960bVK.LJ;
        } else {
            j2 = 0;
        }
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc == null || (enumC919170a1jLJIIIZ = interfaceC975520bUc.LJIIIZ()) == null) {
            enumC919170a1jLJIIIZ = EnumC919170a1j.MATCH_TYPE_2V2;
        }
        C974540bT2.LIZ.LJLZ(j2, channelId, 3, null, enumC919170a1jLJIIIZ);
        InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
        if (interfaceC975520bUc2 == null || (enumC919170a1jLJIIIZ2 = interfaceC975520bUc2.LJIIIZ()) == null) {
            enumC919170a1jLJIIIZ2 = EnumC919170a1j.MATCH_TYPE_2V2;
        }
        c974540bT2.LJZI(j2, channelId, false, 3, z, false, enumC919170a1jLJIIIZ2);
        C975960bVK c975960bVK2 = this.LJII;
        if (c975960bVK2 != null && (list2 = c975960bVK2.LJJIJ) != null) {
            arrayList = new ArrayList(list2);
        } else {
            arrayList = null;
        }
        c974540bT2.LLFF(jLJIILL2, j2, arrayList, i, list, true);
        C975960bVK c975960bVK3 = this.LJII;
        if (c975960bVK3 != null && (battleSetting = c975960bVK3.LJII) != null) {
            j4 = battleSetting.startTimeMs;
        }
        C974540bT2.LJJIJL = C158B.LIZ();
        C974540bT2.LJJIJLIJ = j4;
        this.LJIIIZ = null;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C976060bVU.LIZIZ(this, list, mapLJ, 0L, 0L, false, 28);
    }
}
