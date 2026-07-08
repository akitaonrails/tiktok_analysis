package Y;

import X.C09JN;
import X.C0UO0;
import X.C15438062q;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C470590Icr;
import X.C480460Ism;
import X.C500260Jjc;
import X.C766270U4b;
import X.C915980Zwa;
import X.C917350Zyn;
import X.C925640aCA;
import X.C954460awe;
import X.C973660bRc;
import X.C974540bT2;
import X.C976880bWo;
import X.C977570bXv;
import X.C977590bXx;
import X.C977610bXz;
import X.C977720bYA;
import X.C977850bYN;
import X.C978480bZO;
import X.C979440baw;
import X.C986440bmE;
import X.EnumC919170a1j;
import X.EnumC976510bWD;
import X.InterfaceC1631620sYq;
import X.InterfaceC973730bRj;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.matchv2.connection.matchstate.RematchButtonUpdateEvent;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInvite4004049FixSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.TeamUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS69S0100100_15;

/* JADX INFO: loaded from: classes16.dex */
public class AfS0S0111100_15 implements C09JN {
    public final int $t;
    public int i2;
    public long j3;
    public Object l0;
    public boolean z1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S0111100_15 afS0S0111100_15, Object obj) {
        long id;
        ArrayList arrayList;
        long jLongValue;
        MutableLiveData<Map<Long, GiftGalleryBadgeInfo>> mutableLiveData;
        User owner;
        MutableLiveData mutableLiveData2;
        List list;
        long jLongValue2;
        Room room;
        long channelId;
        boolean z;
        long jLongValue3;
        User owner2;
        C1C7U.LIZ("IndividualMatchInviterCoordinator@dd3e.requestInviteApi$2");
        C470590Icr<MultiInviteResponse> c470590Icr = (C470590Icr) obj;
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        C974540bT2.LIZ.LJJLIIIJJIZ(afS0S0111100_15.i2, afS0S0111100_15.j3, c470590Icr, 0L, "", 0L);
        C977570bXv c977570bXv = (C977570bXv) afS0S0111100_15.l0;
        Long l = c470590Icr.data.battleId;
        boolean z2 = afS0S0111100_15.z1;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(c977570bXv.LIZJ);
        long id2 = 0;
        if (roomLJJLIIIIJ != null && (owner2 = roomLJJLIIIIJ.getOwner()) != null) {
            id = owner2.getId();
        } else {
            id = 0;
        }
        boolean z3 = true;
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        C925640aCA.LJ(C915980Zwa.LJI().LJIIJ().LJJIJIIJI());
        for (C954460awe c954460awe : listLLILZLL) {
            if (c954460awe.LJ != id) {
                C973660bRc c973660bRc = C973660bRc.LIZ;
                if (l != null) {
                    jLongValue3 = l.longValue();
                } else {
                    jLongValue3 = 0;
                }
                long j = c954460awe.LJ;
                C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
                EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
                int size = C915980Zwa.LJII().LLILZLL(z3).size();
                c917350Zyn.getClass();
                String strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
                z = z2;
                C973660bRc.LIZ.LJJLIIIJ(jLongValue3, true, null, null, j, id, z2, strLIZIZ, C915980Zwa.LJI().LIZ().LJIILLIIL(), null);
            } else {
                z = z2;
            }
            z2 = z;
            z3 = true;
        }
        C977570bXv c977570bXv2 = (C977570bXv) afS0S0111100_15.l0;
        MultiInviteResponse multiInviteResponse = c470590Icr.data;
        if (c977570bXv2.LJ) {
            if (LiveMatchInvite4004049FixSetting.INSTANCE.isEnable()) {
                Long l2 = multiInviteResponse.battleId;
                if (l2 != null) {
                    jLongValue2 = l2.longValue();
                } else {
                    jLongValue2 = 0;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleInviteRequestSuccess: orphan battle detected, battleId=");
                sbLIZ.append(jLongValue2);
                C20441214yg.LJIIL("IndividualMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
                C974540bT2.LIZ.LJJLL(jLongValue2);
                if (jLongValue2 != 0) {
                    DataChannel dataChannel = c977570bXv2.LIZJ;
                    if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
                        room = new Room();
                    }
                    InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                    if (interfaceC973730bRjYf2 != null) {
                        channelId = interfaceC973730bRjYf2.LJJL();
                    } else {
                        channelId = C915980Zwa.LJII().getChannelId();
                    }
                    C480460Ism.LIZ().getClass();
                    ((MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class)).cancel(room.getId(), channelId, jLongValue2, 0).LJIILIIL(new C0UO0()).LJJLL(new AfS3S0000100_15(jLongValue2, 0), new AfS3S0000100_15(jLongValue2, 1));
                }
                C766270U4b.LIZLLL(2131853338);
                Function2<? super Boolean, ? super Boolean, Unit> function2 = c977570bXv2.LJIIJ;
                Boolean bool = Boolean.TRUE;
                function2.invoke(bool, bool);
            }
        } else {
            C986440bmE c986440bmE = c977570bXv2.LJIILJJIL;
            if (c986440bmE != null) {
                c986440bmE.LIZJ();
            }
            ArrayList arrayList2 = null;
            c977570bXv2.LJIILJJIL = null;
            DataChannel dataChannel2 = c977570bXv2.LIZJ;
            if (dataChannel2 != null) {
                dataChannel2.LC0(RematchButtonUpdateEvent.class, new C979440baw(Boolean.TRUE, null, null, 6));
            }
            C977610bXz c977610bXz = c977570bXv2.LIZLLL;
            if (c977610bXz != null && (mutableLiveData2 = c977610bXz.LIZLLL) != null && (list = (List) mutableLiveData2.getValue()) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(((C954460awe) it2.next()).LJ));
                }
            } else {
                arrayList = null;
            }
            List<TeamUser> list2 = multiInviteResponse.battleTeamUser;
            if (list2 != null) {
                arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<TeamUser> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Long.valueOf(it3.next().teamId));
                }
            }
            boolean z4 = !C976880bWo.LIZ(arrayList2, arrayList);
            Long l3 = multiInviteResponse.battleId;
            if (l3 != null) {
                jLongValue = l3.longValue();
            } else {
                jLongValue = 0;
            }
            C915980Zwa.LJII().LJJJJLL(multiInviteResponse.leagueInfoMap);
            if (z4) {
                c977570bXv2.LIZJ(jLongValue, EnumC976510bWD.HOSTS_LIST_CHANGED);
                C766270U4b.LIZLLL(2131853338);
            } else {
                C977610bXz c977610bXz2 = c977570bXv2.LIZLLL;
                if (c977610bXz2 != null) {
                    c977610bXz2.LJIIJJI.setValue(Boolean.FALSE);
                    c977610bXz2.LJIILL = false;
                    c977610bXz2.LJIIIZ.setValue(Boolean.TRUE);
                    c977610bXz2.LJIILJJIL = jLongValue;
                    Room roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(c977610bXz2.LIZ);
                    if (roomLJJLIIIIJ2 != null && (owner = roomLJJLIIIIJ2.getOwner()) != null) {
                        id2 = owner.getId();
                    }
                    long jLIZ = C978480bZO.LIZ(true);
                    c977610bXz2.LIZIZ(id2, true);
                    c977610bXz2.LIZ(c977610bXz2.LIZ, jLIZ, new AwS69S0100100_15(c977610bXz2, jLongValue, 1));
                }
                C977610bXz c977610bXz3 = c977570bXv2.LIZLLL;
                if (c977610bXz3 != null && (mutableLiveData = c977610bXz3.LJIILIIL) != null) {
                    mutableLiveData.setValue(multiInviteResponse.leagueInfoMap);
                }
                List<C954460awe> listLLILZLL2 = C915980Zwa.LJII().LLILZLL(true);
                if (!multiInviteResponse.leagueInfoMap.isEmpty()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("update league info ");
                    sbLIZ2.append(multiInviteResponse.leagueInfoMap);
                    C20441214yg.LJIIIZ("IndividualMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ2));
                    for (C954460awe c954460awe2 : listLLILZLL2) {
                        c954460awe2.LJJIII = multiInviteResponse.leagueInfoMap.get(Long.valueOf(c954460awe2.LJ));
                    }
                }
                if (multiInviteResponse.meanwhileInviteScene != 1 && multiInviteResponse.battleTeamUser != null) {
                    InterfaceC1631620sYq<? super Long, ? super EnumC919170a1j, ? super List<TeamUser>, Unit> interfaceC1631620sYq = c977570bXv2.LJIIIZ;
                    Long lValueOf = Long.valueOf(jLongValue);
                    EnumC919170a1j enumC919170a1j = EnumC919170a1j.MATCH_TYPE_INDIVIDUAL;
                    List<TeamUser> list3 = multiInviteResponse.battleTeamUser;
                    if (list3 != null) {
                        interfaceC1631620sYq.invoke(lValueOf, enumC919170a1j, list3);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }
        }
        C1C7U.LIZIZ("IndividualMatchInviterCoordinator@dd3e.requestInviteApi$2");
    }

    public static final void accept$1(AfS0S0111100_15 afS0S0111100_15, Object obj) {
        boolean z;
        C1C7U.LIZ("MatchMatchingCoordinator@f28c.requestLinkMicLeaveApi$leaveDispose$2");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("leave request failed, onFailed is null = ");
        if (((Function1) afS0S0111100_15.l0) == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ("MatchMatchingCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        Function1 function1 = (Function1) afS0S0111100_15.l0;
        if (function1 != null) {
            function1.invoke(th);
        }
        C974540bT2.LIZ.LJJLIIIJLLLLLLLZ(afS0S0111100_15.j3, afS0S0111100_15.z1, afS0S0111100_15.i2, th);
        C1C7U.LIZIZ("MatchMatchingCoordinator@f28c.requestLinkMicLeaveApi$leaveDispose$2");
    }

    public static final void accept$2(AfS0S0111100_15 afS0S0111100_15, Object obj) {
        C1C7U.LIZ("TeamMatchInviterViewModel@38a2.requestInviteApi$2");
        C470590Icr<MultiInviteResponse> c470590Icr = (C470590Icr) obj;
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        C974540bT2.LIZ.LJJLIIIJJIZ(afS0S0111100_15.i2, afS0S0111100_15.j3, c470590Icr, 0L, "", 0L);
        ((C977590bXx) afS0S0111100_15.l0).LJIIL(c470590Icr.data.battleId, null, afS0S0111100_15.z1);
        Long l = c470590Icr.data.battleId;
        if (l != null) {
            long jLongValue = l.longValue();
            long jLongValue2 = 0;
            if (jLongValue != 0) {
                if (LiveMatchInvite4004049FixSetting.INSTANCE.isEnable() && ((C977590bXx) afS0S0111100_15.l0).LJIJJLI) {
                    Long l2 = c470590Icr.data.battleId;
                    if (l2 != null) {
                        jLongValue2 = l2.longValue();
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Invite succeeded but ViewModel cleared - orphan battle, battleId=");
                    sbLIZ.append(jLongValue2);
                    C20441214yg.LJIIL("TeamMatchInviterInviteeViewModel", C2188811AlT.LIZIZ(sbLIZ));
                    c974540bT2.LJJLL(jLongValue2);
                    ((C977590bXx) afS0S0111100_15.l0).LJIIZILJ.setValue(C977720bYA.LIZ(new C977720bYA(null, null, null, null), null, new C977850bYN(jLongValue2), null, null, 13));
                } else {
                    ((C977590bXx) afS0S0111100_15.l0).LJIIZILJ.setValue(C977720bYA.LIZ(new C977720bYA(null, null, null, null), c470590Icr.data, null, null, null, 14));
                }
            }
        }
        C1C7U.LIZIZ("TeamMatchInviterViewModel@38a2.requestInviteApi$2");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$3(Y.AfS0S0111100_15 r16, java.lang.Object r17) {
        /*
            r12 = r17
            java.lang.String r7 = "CombinedMatchInviterViewModel@5274.requestMultiMatchInviteApi$2"
            X.C1C7U.LIZ(r7)
            X.0Icr r12 = (X.C470590Icr) r12
            X.0bT2 r6 = X.C974540bT2.LIZ
            r2 = r16
            int r9 = r2.i2
            long r10 = r2.j3
            X.0bT2 r8 = X.C974540bT2.LIZ
            r13 = 0
            java.lang.String r15 = ""
            r16 = r13
            r8.LJJLIIIJJIZ(r9, r10, r12, r13, r15, r16)
            java.lang.Object r5 = r2.l0
            X.0bY1 r5 = (X.C977630bY1) r5
            T r0 = r12.data
            com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse r0 = (com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse) r0
            java.lang.Long r4 = r0.battleId
            boolean r3 = r2.z1
            r1 = 1
            r0 = 0
            r5.LJIJJ(r4, r0, r3, r1)
            T r0 = r12.data
            com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse r0 = (com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse) r0
            java.lang.Long r0 = r0.battleId
            if (r0 == 0) goto Lb1
            long r4 = r0.longValue()
            r0 = 0
            int r3 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r3 == 0) goto Lb1
            com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInvite4004049FixSetting r3 = com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInvite4004049FixSetting.INSTANCE
            boolean r3 = r3.isEnable()
            r5 = 0
            if (r3 == 0) goto L95
            java.lang.Object r3 = r2.l0
            X.0bY1 r3 = (X.C977630bY1) r3
            boolean r3 = r3.LJJJIL
            if (r3 == 0) goto L95
            T r3 = r12.data
            com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse r3 = (com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse) r3
            java.lang.Long r3 = r3.battleId
            if (r3 == 0) goto L5c
            long r0 = r3.longValue()
        L5c:
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
            java.lang.String r3 = "Invite succeeded but ViewModel cleared - orphan battle (multi), battleId="
            r4.append(r3)
            r4.append(r0)
            java.lang.String r4 = X.C2188811AlT.LIZIZ(r4)
            java.lang.String r3 = "CombinedMatchInviterViewModel"
            X.C20441214yg.LJIIL(r3, r4)
            r6.LJJLL(r0)
            java.lang.Object r2 = r2.l0
            X.0bY1 r2 = (X.C977630bY1) r2
            androidx.lifecycle.MutableLiveData<X.0bYF> r2 = r2.LJJ
            X.0bYF r8 = new X.0bYF
            r9 = 0
            r8.<init>(r5)
            X.0bYN r11 = new X.0bYN
            r11.<init>(r0)
            r14 = 27
            r10 = r9
            r12 = r9
            r13 = r9
            X.0bYF r0 = X.C977770bYF.LIZ(r8, r9, r10, r11, r12, r13, r14)
            r2.setValue(r0)
        L91:
            X.C1C7U.LIZIZ(r7)
            return
        L95:
            java.lang.Object r0 = r2.l0
            X.0bY1 r0 = (X.C977630bY1) r0
            androidx.lifecycle.MutableLiveData<X.0bYF> r1 = r0.LJJ
            X.0bYF r8 = new X.0bYF
            r9 = 0
            r8.<init>(r5)
            T r10 = r12.data
            com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse r10 = (com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse) r10
            r14 = 29
            r11 = r9
            r12 = r9
            r13 = r9
            X.0bYF r0 = X.C977770bYF.LIZ(r8, r9, r10, r11, r12, r13, r14)
            r1.setValue(r0)
        Lb1:
            java.lang.Object r0 = r2.l0
            X.0bY1 r0 = (X.C977630bY1) r0
            r0.LJIJJLI()
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S0111100_15.accept$3(Y.AfS0S0111100_15, java.lang.Object):void");
    }

    public static final void accept$4(AfS0S0111100_15 afS0S0111100_15, Object obj) {
        boolean z;
        C1C7U.LIZ("TwoMatchMatchingCoordinator@caf2.requestLinkMicLeaveApi$leaveDispose$2");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("leave request failed, onFailed is null = ");
        if (((Function1) afS0S0111100_15.l0) == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ("TwoMatchMatchingCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        Function1 function1 = (Function1) afS0S0111100_15.l0;
        if (function1 != null) {
            function1.invoke(th);
        }
        C974540bT2.LIZ.LJJLIIIJLLLLLLLZ(afS0S0111100_15.j3, afS0S0111100_15.z1, afS0S0111100_15.i2, th);
        C1C7U.LIZIZ("TwoMatchMatchingCoordinator@caf2.requestLinkMicLeaveApi$leaveDispose$2");
    }

    public AfS0S0111100_15(int i, long j, Object obj, boolean z, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.j3 = j;
        this.l0 = obj;
        this.z1 = z;
    }
}
