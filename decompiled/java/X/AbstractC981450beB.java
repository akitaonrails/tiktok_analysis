package X;

import X.InterfaceC981890bet;
import com.bytedance.android.live.liveinteract.matchv2.connection.matchstate.RematchButtonUpdateEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS55S0310000_15;

/* JADX INFO: renamed from: X.0beB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC981450beB<COORDINATOR extends InterfaceC981890bet> implements InterfaceC976690bWV<COORDINATOR> {
    public final InterfaceC976620bWO LIZ;
    public EnumC974260bSa LIZIZ;
    public final AbstractC982800bgM LIZJ;
    public volatile COORDINATOR LIZLLL;

    @Override // X.InterfaceC976690bWV
    public void LJ() {
    }

    @Override // X.InterfaceC976690bWV
    public void LJIILL() {
    }

    @Override // X.InterfaceC976690bWV
    public void LJIJ() {
    }

    @Override // X.InterfaceC976690bWV
    public void LJIJI(long j) {
    }

    @Override // X.InterfaceC976690bWV
    public void LJIJJ(int i, long j) {
    }

    public abstract Set LJJIFFI();

    public final COORDINATOR LJJII() {
        COORDINATOR coordinator;
        if (this.LIZLLL == null) {
            synchronized (this) {
                coordinator = (COORDINATOR) this.LIZ.LJIIIZ().LIZ(this.LIZ.getDelegate().LIZIZ(), this.LIZ.LJIILLIIL(), this.LIZ.isAnchor(), this.LIZ.getBizType(), this.LIZIZ);
            }
            this.LIZLLL = coordinator;
        }
        return this.LIZLLL;
    }

    public final C981480beE LJJIII() {
        return this.LIZ.LJIILLIIL().LIZ.LJII;
    }

    public final void LJIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearCompetitionSEI");
        sbLIZ.append(", status = ");
        sbLIZ.append(this.LIZIZ);
        C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
        if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(this.LIZ.isAnchor()))) {
            return;
        }
        C914770Zud.LIZJ(0L, true);
        C914770Zud.LIZIZ("match_info");
    }

    public final void LJJIIZ() {
        LJJIII();
        long jLIZLLL = C950220apo.LIZLLL();
        long j = LJJIII().LJIIIZ;
        C098J<Long, C098J<Long, Boolean>> c098j = C973910bS1.LIZLLL;
        C098J<Long, Boolean> c098j2 = c098j.get(Long.valueOf(jLIZLLL));
        if (c098j2 != null) {
            c098j2.put(Long.valueOf(j), Boolean.TRUE);
            return;
        }
        C098J<Long, Boolean> c098j3 = new C098J<>(20);
        c098j3.put(Long.valueOf(j), Boolean.TRUE);
        c098j.put(Long.valueOf(jLIZLLL), c098j3);
    }

    @Override // X.InterfaceC976690bWV
    public final EnumC974260bSa getStatus() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC976690bWV
    public void LIZ(AbstractC982800bgM abstractC982800bgM) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveMessage");
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(abstractC982800bgM);
        C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC981890bet interfaceC981890betLJJII = LJJII();
        if (interfaceC981890betLJJII != null) {
            interfaceC981890betLJJII.LIZ(abstractC982800bgM);
        }
    }

    @Override // X.InterfaceC976690bWV
    public void LIZJ(EnumC975850bV9 enumC975850bV9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stateDidEnter");
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fromSource = ");
        sbLIZ.append(enumC975850bV9);
        C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZIZ.compareTo(EnumC974260bSa.START) >= 0) {
            C981550beL c981550beL = LJJIII().LJJIJ;
            if (c981550beL.LIZIZ.length() == 0) {
                C962950bAL c962950bAL = EnumC962960bAM.Companion;
                C981480beE c981480beE = c981550beL.LIZ;
                EnumC962960bAM enumC962960bAM = c981480beE.LJIIIIZZ;
                int size = c981480beE.LJI.size();
                c962950bAL.getClass();
                c981550beL.LIZIZ = C962950bAL.LIZ(enumC962960bAM, size);
                c981550beL.LJIIL = C158B.LIZ();
            }
        }
        InterfaceC981890bet interfaceC981890betLJJII = LJJII();
        if (interfaceC981890betLJJII != null) {
            interfaceC981890betLJJII.LJJIII();
        }
    }

    @Override // X.InterfaceC976690bWV
    public void LIZLLL(AwS55S0310000_15 awS55S0310000_15) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEndTriggeredExternal");
        sbLIZ.append(" triggered");
        C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC976690bWV
    public void LJI(EnumC975850bV9 enumC975850bV9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stateWillLeave");
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fromSource = ");
        sbLIZ.append(enumC975850bV9);
        C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC981890bet interfaceC981890betLJJII = LJJII();
        if (interfaceC981890betLJJII != null) {
            interfaceC981890betLJJII.LIZIZ();
        }
    }

    @Override // X.InterfaceC976690bWV
    public void LJII(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onForceTerminated");
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", terminateReason=");
        sbLIZ.append(j);
        sbLIZ.append(", engine.isRematch=");
        sbLIZ.append(this.LIZ.d3());
        C20441214yg.LJ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
        if (LJJIII().LIZIZ) {
            LJIL();
        }
        if (j == 201) {
            LJJIII().LJJIJ.LJIIIIZZ = true;
            if (LJJIII().LJJIJ.LJII == LJJIII().LJFF) {
                LJJIII().LJJIJ.LJIIIZ = EnumC973680bRe.POSITIVE_OVER;
            } else {
                LJJIII().LJJIJ.LJIIIZ = EnumC973680bRe.NEGATIVE_OVER;
            }
        }
        InterfaceC981890bet interfaceC981890betLJJII = LJJII();
        if (interfaceC981890betLJJII != null) {
            interfaceC981890betLJJII.LJJ();
        }
    }

    @Override // X.InterfaceC976690bWV
    public final void LJIIIZ(AbstractC963510bBF abstractC963510bBF) {
        C915980Zwa.LJI().LJIIJ().LJ(EnumC973640bRa.COMPETITION_PLATFORM_ACTION.getValue());
        C962950bAL c962950bAL = EnumC962960bAM.Companion;
        Integer numValueOf = Integer.valueOf(abstractC963510bBF.LIZIZ);
        c962950bAL.getClass();
        this.LIZ.LJIJ(C962950bAL.LIZIZ(numValueOf), "onInitFromCompetitionAction");
        this.LIZ.LJI().LJIL = abstractC963510bBF;
        LJJIL(this, EnumC975850bV9.COMPETITION_PLATFORM_ACTION);
    }

    @Override // X.InterfaceC976690bWV
    public void LJIIJ(C945320ahu c945320ahu) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHandleSEI");
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sei=");
        sbLIZ.append(c945320ahu);
        C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC976690bWV
    public void LJIIL(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startFinishCountdown");
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", source=");
        sbLIZ.append("onDrawCountdownStart");
        sbLIZ.append(", durationMs=");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC976690bWV
    public void LJIILJJIL(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHostWithGuestsModeChange, status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", guestFrom0ChangeToNon0=");
        sbLIZ.append(z);
        C20441214yg.LJ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC976690bWV
    public final void LJIIZILJ(EnumC974260bSa enumC974260bSa) {
        this.LIZIZ = enumC974260bSa;
    }

    public final void LJJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(getClass().getName());
        C982310bfZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append('_');
        sbLIZ2.append(getClass().getName());
        C982320bfa.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJJI(List<C981870ber> list) {
        Long lValueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (C981870ber c981870ber : list) {
            if (!c981870ber.LIZIZ.isEmpty()) {
                arrayList.add(c981870ber);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            for (C982710bgD c982710bgD : ((C981870ber) it2.next()).LIZIZ) {
                linkedHashMap.put(Long.valueOf(c982710bgD.LIZ), c982710bgD);
            }
        }
        Room roomInfo = this.LIZ.getRoomInfo();
        if (roomInfo != null) {
            lValueOf = Long.valueOf(roomInfo.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        long jLongValue = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((Number) entry.getKey()).longValue() > 0) {
                long jLongValue2 = ((Number) entry.getKey()).longValue();
                if (lValueOf == null || jLongValue2 != lValueOf.longValue()) {
                    jLongValue = ((Number) entry.getKey()).longValue();
                }
            }
        }
        C20441214yg.LIZIZ("CompetitionStateBase", "ensureLinkMicGuestUserIdWithTeams, rightUserId = " + jLongValue);
        if (jLongValue > 0 && C915980Zwa.LJI().LJIIJ().LLJJJIL() <= 0) {
            C915980Zwa.LJI().LJIIJ().LJJJJZ(jLongValue);
        }
    }

    public final void LJJIIZI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setupHostListData");
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
        C981520beI c981520beI = LJJIII().LIZLLL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setupHostListData_");
        sbLIZ2.append(str);
        c981520beI.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2), C915980Zwa.LJII().LJJLI());
    }

    public final void LJJJJIZL(AbstractC982800bgM abstractC982800bgM) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        C981530beJ.LIZ(abstractC982800bgM, LJJIII(), this.LIZIZ, this.LIZ.getDataChannel());
        if (abstractC982800bgM instanceof C982480bfq) {
            for (Map.Entry<Long, ? extends EnumC982730bgF> entry : ((C982480bfq) abstractC982800bgM).LJIIIIZZ.entrySet()) {
                Room roomInfo = this.LIZ.getRoomInfo();
                if (roomInfo != null && entry.getKey().longValue() == roomInfo.getOwnerUserId() && (dataChannel2 = this.LIZ.getDataChannel()) != null) {
                    dataChannel2.SX0(C963610bBP.class, Integer.valueOf(entry.getValue().getType()));
                }
            }
        } else if (abstractC982800bgM instanceof C982450bfn) {
            for (Map.Entry<Long, ? extends EnumC982730bgF> entry2 : ((C982450bfn) abstractC982800bgM).LJIIJ.entrySet()) {
                Room roomInfo2 = this.LIZ.getRoomInfo();
                if (roomInfo2 != null && entry2.getKey().longValue() == roomInfo2.getOwnerUserId() && (dataChannel = this.LIZ.getDataChannel()) != null) {
                    dataChannel.SX0(C963610bBP.class, Integer.valueOf(entry2.getValue().getType()));
                }
            }
            LJJI(LJJIII().LJIIL);
        } else if (abstractC982800bgM instanceof C982470bfp) {
            LJJI(LJJIII().LJIIL);
        } else if (!(abstractC982800bgM instanceof C982570bfz)) {
            if (abstractC982800bgM instanceof C982670bg9) {
                LJJIII().LJJIJIIJI.LJIILIIL = true;
            } else if ((abstractC982800bgM instanceof C982490bfr) || (abstractC982800bgM instanceof C982620bg4) || (abstractC982800bgM instanceof C983020bgi) || !(abstractC982800bgM instanceof C982530bfv)) {
            }
        }
        if (abstractC982800bgM.LIZJ.LIZ.isValid()) {
            this.LIZ.LJIJ(abstractC982800bgM.LIZJ.LIZ, "updateDataByStateFromMsg");
        }
    }

    public final void LJJJJJ(AbstractC982860bgS abstractC982860bgS) {
        C981530beJ.LIZIZ(abstractC982860bgS, LJJIII(), this.LIZ.getDataChannel());
        if ((abstractC982860bgS instanceof C982460bfo) && C500260Jjc.LJJIJIIJIL(Boolean.valueOf(LJJIII().LIZIZ))) {
            this.LIZ.LJIJ(abstractC982860bgS.LIZJ.LIZ, "audienceUpdateDataByInfo");
        }
    }

    public static boolean LJJIIJZLJL(AbstractC981450beB abstractC981450beB, long j) {
        if (j == abstractC981450beB.LJJIII().LJIIIZ) {
            return true;
        }
        return false;
    }

    public static void LJJIJIL(AbstractC981450beB abstractC981450beB, EnumC975850bV9 enumC975850bV9) {
        abstractC981450beB.getClass();
        abstractC981450beB.LJJIJ(EnumC974260bSa.DRAW, enumC975850bV9, null, null);
    }

    public static void LJJIL(AbstractC981450beB abstractC981450beB, EnumC975850bV9 enumC975850bV9) {
        abstractC981450beB.getClass();
        abstractC981450beB.LJJIJ(EnumC974260bSa.INVITED, enumC975850bV9, null, null);
    }

    public static void LJJJ(AbstractC981450beB abstractC981450beB, EnumC975850bV9 enumC975850bV9) {
        abstractC981450beB.getClass();
        abstractC981450beB.LJJIJ(EnumC974260bSa.PREPARE, enumC975850bV9, null, null);
    }

    @Override // X.InterfaceC976690bWV
    public void LIZIZ(EnumC962960bAM enumC962960bAM, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClick");
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", clickFrom = ");
        sbLIZ.append(str);
        sbLIZ.append(", bizType=");
        sbLIZ.append(enumC962960bAM);
        C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC976690bWV
    public void LJFF(long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserLeft");
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", leaveReason=");
        sbLIZ.append(j);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(str);
        C20441214yg.LJ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC976690bWV
    public boolean LJIIJJI(C982460bfo c982460bfo, EnumC970440bMQ enumC970440bMQ) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHandleAudienceInfoResult");
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", infoResp=");
        sbLIZ.append(c982460bfo);
        sbLIZ.append(", type=");
        sbLIZ.append(enumC970440bMQ);
        C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
        return true;
    }

    @Override // X.InterfaceC976690bWV
    public void LJIILIIL(EnumC962960bAM enumC962960bAM, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClickGuide");
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", noticeType = ");
        sbLIZ.append(i);
        sbLIZ.append(", bizType=");
        sbLIZ.append(enumC962960bAM);
        C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC976690bWV
    public void LJIILLIIL(EnumC962960bAM enumC962960bAM, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClickRematch");
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bizType=");
        sbLIZ.append(enumC962960bAM);
        sbLIZ.append(", clickFrom=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC976690bWV
    public final boolean LJIJJLI(EnumC974260bSa enumC974260bSa, EnumC975850bV9 enumC975850bV9) {
        boolean zContains = LJJIFFI().contains(enumC974260bSa);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("canHandleStatus");
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", newStatus=");
        sbLIZ.append(enumC974260bSa);
        sbLIZ.append(", canHandle=");
        sbLIZ.append(zContains);
        sbLIZ.append(", fromSource = ");
        sbLIZ.append(enumC975850bV9);
        C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
        return zContains;
    }

    public AbstractC981450beB(InterfaceC976620bWO interfaceC976620bWO, EnumC974260bSa enumC974260bSa, AbstractC982800bgM abstractC982800bgM) {
        this.LIZ = interfaceC976620bWO;
        this.LIZIZ = enumC974260bSa;
        this.LIZJ = abstractC982800bgM;
    }

    public static void LJJIJIIJIL(AbstractC981450beB abstractC981450beB, EnumC975850bV9 enumC975850bV9, AbstractC982800bgM abstractC982800bgM) {
        abstractC981450beB.getClass();
        abstractC981450beB.LJJIJ(EnumC974260bSa.ACCEPTED, enumC975850bV9, abstractC982800bgM, null);
    }

    public static void LJJJIL(AbstractC981450beB abstractC981450beB, EnumC975850bV9 enumC975850bV9, AbstractC982800bgM abstractC982800bgM) {
        abstractC981450beB.getClass();
        abstractC981450beB.LJJIJ(EnumC974260bSa.RECEIVED, enumC975850bV9, abstractC982800bgM, null);
    }

    @Override // X.InterfaceC976690bWV
    public void LJIIIIZZ(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLinkMicFinish");
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", finishReason=");
        sbLIZ.append(i);
        sbLIZ.append(", detailedCode=");
        sbLIZ.append(i2);
        sbLIZ.append(", abnormalDisconnectReason=");
        sbLIZ.append(abnormalDisconnectReason);
        C20441214yg.LJ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJIIJ(long j, boolean z, List list) {
        EnumC973680bRe enumC973680bRe;
        if (!Room.isValid(this.LIZ.getRoomInfo())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleCompetitionResult");
            sbLIZ.append(", current room is invalid");
            C20441214yg.LJIIIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
        }
        boolean z2 = true;
        if (this.LIZ.Y2().compareTo(EnumC974260bSa.PUNISH) >= 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("dealResult, isEnd=true, status = ");
            sbLIZ2.append(this.LIZ.Y2());
            C20441214yg.LJIIIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (list.isEmpty()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("handleCompetitionResult");
            sbLIZ3.append(", result map is null or empty");
            C20441214yg.LJIIIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        Iterator it2 = list.iterator();
        C982390bfh c982390bfh = null;
        while (it2.hasNext()) {
            C982390bfh c982390bfh2 = (C982390bfh) it2.next();
            Iterator<C982710bgD> it3 = c982390bfh2.LJI.iterator();
            while (true) {
                if (it3.hasNext()) {
                    C982710bgD next = it3.next();
                    if (next.LIZ == LJJIII().LJIILIIL) {
                        if (next != null) {
                            c982390bfh = c982390bfh2;
                        }
                    }
                }
            }
        }
        if (this.LIZ.Y2().compareTo(EnumC974260bSa.PUNISH) >= 0) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("handleCompetitionResult");
            sbLIZ4.append(", return by status is punish, status=");
            sbLIZ4.append(this.LIZ.Y2());
            C20441214yg.LJIIIZ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ4));
            return;
        }
        if (c982390bfh == null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("handleCompetitionResult");
            sbLIZ5.append(", return by selfTeamScore == null");
            C20441214yg.LJIIIZ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ5));
            return;
        }
        if (LJJIII().LJIJI == EnumC982500bfs.DRAW) {
            LJJIJIL(this, EnumC975850bV9.DRAW_FROM_FINISH_REQUEST);
            return;
        }
        if (z) {
            LJJIIZ();
            Room roomInfo = this.LIZ.getRoomInfo();
            if (roomInfo == null || j != roomInfo.getOwnerUserId()) {
                z2 = false;
            }
            C981550beL c981550beL = LJJIII().LJJIJ;
            if (z2) {
                enumC973680bRe = EnumC973680bRe.POSITIVE_OVER;
            } else {
                enumC973680bRe = EnumC973680bRe.NEGATIVE_OVER;
            }
            c981550beL.LJIIIZ = enumC973680bRe;
            if (LJJIII().LIZIZ) {
                LJJIJL(this, "finish_draw", null, false, 14);
                return;
            } else {
                LJJIJLIJ(this, EnumC975850bV9.RESULT_FROM_CUT_SHORT_MESSAGE, null, null, 6);
                return;
            }
        }
        LJJJI(this, EnumC975850bV9.PUNISH_FROM_FINISH_RESPONSE, null, 6);
    }

    public final void LJJIJIIJI(String str, EnumC974260bSa enumC974260bSa, C982460bfo c982460bfo) {
        int i = C981620beS.LIZ[enumC974260bSa.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (this.LIZ.Y2() != EnumC974260bSa.NONE) {
                        LJJIJLIJ(this, EnumC975850bV9.AUDIENCE_BATTLE_INFO_ROOM_ENTER, null, c982460bfo, 2);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("transitStatusByInfoResult");
                        sbLIZ.append(", source=");
                        sbLIZ.append(str);
                        sbLIZ.append(", transit to MATCH_END");
                        C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    return;
                }
                if (c982460bfo != null) {
                    LJJJJJ(c982460bfo);
                    LJJI(c982460bfo.LJI);
                }
                LJJJI(this, EnumC975850bV9.AUDIENCE_BATTLE_INFO_ROOM_ENTER, c982460bfo, 2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("transitStatusByInfoResult");
                sbLIZ2.append(", source=");
                sbLIZ2.append(str);
                sbLIZ2.append(", transit to PUNISH_START");
                C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("transitStatusByInfoResult");
            sbLIZ3.append(", source=");
            sbLIZ3.append(str);
            sbLIZ3.append(", transit to SETTLEMENT");
            C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        if (c982460bfo != null) {
            LJJJJJ(c982460bfo);
            LJJI(c982460bfo.LJI);
        }
        LJJJJI(this, EnumC975850bV9.AUDIENCE_BATTLE_INFO_ROOM_ENTER, null, c982460bfo, 2);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("transitStatusByInfoResult");
        sbLIZ4.append(", source=");
        sbLIZ4.append(str);
        sbLIZ4.append(", transit to MATCH_START");
        C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ4));
    }

    @Override // X.InterfaceC976690bWV
    public void Z2(List<C954460awe> list, List<C954460awe> list2, CustomLinkMessage customLinkMessage) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHostsListChanged");
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", newList = ");
        sbLIZ.append(list);
        sbLIZ.append(" , oldList = ");
        sbLIZ.append(list2);
        C20441214yg.LJ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
        LJJIIZI("onHostsListChanged");
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("on host list changed coHost User list size, numHost = ");
        sbLIZ2.append(listLLILZLL.size());
        C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ2));
        C389001fE.LIZ("LiveMatchNumHostDidChangeEvent", null, System.currentTimeMillis(), false);
        DataChannel dataChannel = this.LIZ.getDataChannel();
        if (dataChannel != null) {
            dataChannel.LC0(RematchButtonUpdateEvent.class, new C979440baw(null, Integer.valueOf(listLLILZLL.size()), null, 5));
        }
        if (this.LIZIZ.compareTo(EnumC974260bSa.START) >= 0 && this.LIZIZ.compareTo(EnumC974260bSa.DRAW) <= 0 && list2 != null && LJJIII().LIZIZ && list.size() < ((ArrayList) list2).size()) {
            list.size();
        }
        InterfaceC981890bet interfaceC981890betLJJII = LJJII();
        if (interfaceC981890betLJJII != null) {
            interfaceC981890betLJJII.LJIIL(list, list2);
        }
    }

    public static void LJJIZ(AbstractC981450beB abstractC981450beB, EnumC975850bV9 enumC975850bV9, AbstractC982800bgM abstractC982800bgM, int i) {
        if ((i & 2) != 0) {
            abstractC982800bgM = null;
        }
        abstractC981450beB.getClass();
        abstractC981450beB.LJJIJ(EnumC974260bSa.NONE, enumC975850bV9, abstractC982800bgM, null);
    }

    public static void LJJJI(AbstractC981450beB abstractC981450beB, EnumC975850bV9 enumC975850bV9, C982460bfo c982460bfo, int i) {
        if ((i & 4) != 0) {
            c982460bfo = null;
        }
        abstractC981450beB.getClass();
        abstractC981450beB.LJJIJ(EnumC974260bSa.PUNISH, enumC975850bV9, null, c982460bfo);
    }

    public static void LJJJJ(AbstractC981450beB abstractC981450beB, EnumC975850bV9 enumC975850bV9, AbstractC982800bgM abstractC982800bgM, int i) {
        if ((i & 2) != 0) {
            abstractC982800bgM = null;
        }
        if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(abstractC981450beB.LIZ.d3())) && abstractC981450beB.LIZ.Y2() == EnumC974260bSa.START) {
            abstractC981450beB.LJJIJ(EnumC974260bSa.SETTLE, enumC975850bV9, abstractC982800bgM, null);
        }
    }

    public final void LJJIJ(EnumC974260bSa enumC974260bSa, EnumC975850bV9 enumC975850bV9, AbstractC982800bgM abstractC982800bgM, C982460bfo c982460bfo) {
        this.LIZ.LJIILL(enumC974260bSa, enumC975850bV9, abstractC982800bgM, c982460bfo);
    }

    public static void LJJIJL(AbstractC981450beB abstractC981450beB, String str, AbstractC982800bgM abstractC982800bgM, boolean z, int i) {
        if ((i & 2) != 0) {
            abstractC982800bgM = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        abstractC981450beB.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("anchor transit to finish, source = ");
        sbLIZ.append(str);
        sbLIZ.append(", iscutShort = ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
        abstractC981450beB.LJJIIZ();
        EnumC974260bSa enumC974260bSaY2 = abstractC981450beB.LIZ.Y2();
        EnumC974260bSa enumC974260bSa = EnumC974260bSa.FINISH;
        if (enumC974260bSaY2 != enumC974260bSa) {
            InterfaceC981890bet interfaceC981890betLJJII = abstractC981450beB.LJJII();
            if (interfaceC981890betLJJII != null) {
                interfaceC981890betLJJII.LJFF();
            }
            abstractC981450beB.LJJIJ(enumC974260bSa, EnumC975850bV9.RESULT_FROM_NEGATIVE_ACTION, abstractC982800bgM, null);
        }
    }

    public static void LJJIJLIJ(AbstractC981450beB abstractC981450beB, EnumC975850bV9 enumC975850bV9, AbstractC982800bgM abstractC982800bgM, C982460bfo c982460bfo, int i) {
        if ((i & 2) != 0) {
            abstractC982800bgM = null;
        }
        if ((i & 4) != 0) {
            c982460bfo = null;
        }
        abstractC981450beB.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audience transit to finish, source = ");
        sbLIZ.append(enumC975850bV9);
        C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
        abstractC981450beB.LJJIIZ();
        EnumC974260bSa enumC974260bSaY2 = abstractC981450beB.LIZ.Y2();
        EnumC974260bSa enumC974260bSa = EnumC974260bSa.FINISH;
        if (enumC974260bSaY2 != enumC974260bSa) {
            InterfaceC981890bet interfaceC981890betLJJII = abstractC981450beB.LJJII();
            if (interfaceC981890betLJJII != null) {
                interfaceC981890betLJJII.LJFF();
            }
            if (!abstractC981450beB.LJJIII().LJJIFFI && !abstractC981450beB.LJJIII().LIZIZ) {
                C973690bRf.LIZ.LJJI(true);
            }
            if (!abstractC981450beB.LJJIII().LIZIZ) {
                C973690bRf.LIZ.LJIJI(abstractC981450beB.LJJIII().LJIIIZ, abstractC981450beB.LIZ.getRoomInfo());
            }
            abstractC981450beB.LJJIJ(enumC974260bSa, enumC975850bV9, abstractC982800bgM, c982460bfo);
        }
    }

    public static void LJJJJI(AbstractC981450beB abstractC981450beB, EnumC975850bV9 enumC975850bV9, AbstractC982800bgM abstractC982800bgM, C982460bfo c982460bfo, int i) {
        if ((i & 2) != 0) {
            abstractC982800bgM = null;
        }
        if ((i & 4) != 0) {
            c982460bfo = null;
        }
        abstractC981450beB.getClass();
        abstractC981450beB.LJJIJ(EnumC974260bSa.START, enumC975850bV9, abstractC982800bgM, c982460bfo);
    }
}
