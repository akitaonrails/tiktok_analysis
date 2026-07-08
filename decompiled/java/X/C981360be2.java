package X;

import Y.AfS109S0300000_15;
import Y.AfS151S0200000_15;
import Y.AfS4S0200100_15;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.competition.api.CompetitionApi;
import com.bytedance.android.live.liveinteract.competition.core.model.bizextra.TakeTheStageBizExtra;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInitiateInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInitiateParams;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionReplyParams;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionUserBase;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMatchTakeStageOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AwS155S0110000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0be2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981360be2 extends AbstractC981930bex implements InterfaceC981590beP, InterfaceC981310bdx {
    public LinkDialog LIZLLL;
    public LinkDialog LJ;
    public final C981300bdw LJFF;
    public boolean LJI;
    public boolean LJII;
    public Long LJIIIIZZ;
    public Function2<? super Long, ? super List<C981870ber>, Unit> LJIIIZ;
    public Function2<? super Boolean, ? super Boolean, Unit> LJIIJ;
    public Function1<? super EnumC981380be4, Unit> LJIIJJI;
    public Function1<? super Boolean, Unit> LJIIL;
    public Function0<Unit> LJIILIIL;
    public Function0<Unit> LJIILJJIL;
    public Function1<? super EnumC981560beM, Unit> LJIILL;
    public boolean LJIILLIIL;

    @Override // X.InterfaceC981590beP
    public final void LJJIJLIJ() {
    }

    @Override // X.InterfaceC981590beP
    public final void LIZLLL() {
        LinkDialog linkDialog = this.LIZLLL;
        if (linkDialog != null) {
            linkDialog.dismiss();
        }
        LinkDialog linkDialog2 = this.LJ;
        if (linkDialog2 != null) {
            linkDialog2.dismiss();
        }
        this.LIZLLL = null;
        this.LJ = null;
        this.LJIILJJIL.invoke();
    }

    @Override // X.InterfaceC981590beP
    public final void LJ() {
        C981300bdw c981300bdw = this.LJFF;
        if (c981300bdw != null) {
            c981300bdw.LJFF(EnumC981380be4.MIC_ROOM_START);
        }
    }

    @Override // X.InterfaceC981590beP
    public final void LJI() {
        C981300bdw c981300bdw = this.LJFF;
        if (c981300bdw != null) {
            c981300bdw.LJFF(EnumC981380be4.HOSTS_LIST_CHANGED);
        }
        C766270U4b.LIZLLL(2131851853);
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LIZIZ() {
        super.LIZIZ();
        this.LJI = true;
        if (this.LJFF != null) {
            AbstractC742610TBb.LIZIZ();
        }
        C981300bdw c981300bdw = this.LJFF;
        if (c981300bdw != null) {
            c981300bdw.LJIIL.setValue(Boolean.FALSE);
        }
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJJIII() {
        if (LJJJJJ().LJIIIIZZ == EnumC962960bAM.TAKE_THE_STAGE) {
            C981480beE c981480beELJJJJJ = LJJJJJ();
            for (C954460awe c954460awe : c981480beELJJJJJ.LJI) {
                C981520beI c981520beI = c981480beELJJJJJ.LIZLLL;
                long j = c954460awe.LJ;
                c981520beI.LIZJ(j, Collections.singletonList(Long.valueOf(j)));
            }
        }
    }

    @Override // X.InterfaceC981310bdx
    public final void LJIIIZ(List<C954460awe> list) {
        DataChannel dataChannel;
        long ownerUserId;
        boolean z;
        int i;
        long j;
        List<Long> list2;
        C963520bBG c963520bBG;
        C963520bBG c963520bBG2;
        boolean z2 = this.LJII;
        MatchBaseWidget matchBaseWidget = this.LIZ;
        if (matchBaseWidget != null) {
            dataChannel = matchBaseWidget.dataChannel;
        } else {
            dataChannel = null;
        }
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        long ownerUserId2 = 0;
        if (roomLJJLIIIIJ != null) {
            ownerUserId = roomLJJLIIIIJ.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        Iterator<C954460awe> it2 = C915980Zwa.LJII().LLILZLL(true).iterator();
        while (it2.hasNext()) {
            long j2 = it2.next().LJ;
            if (j2 != ownerUserId) {
                C973690bRf.LIZ.LJJII(j2, C973690bRf.LJIILLIIL(), "take_stage", z2);
            }
        }
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        int i2 = 0;
        if ((listLJIJJ instanceof Collection) && listLJIJJ.isEmpty()) {
            z = false;
        } else {
            Iterator<C954460awe> it3 = listLJIJJ.iterator();
            while (it3.hasNext()) {
                if (it3.next().LJIIJ()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (z) {
            C20441214yg.LJ("TakeStageInviterCoordinator", "Invite Request Error, HostsChangedException");
            LJJJJJL(new Exception() { // from class: X.0bi7
                public static final int $stable = 8;
            });
            return;
        }
        LJJJJJ().getClass();
        long jLIZ = C981480beE.LIZ();
        if (jLIZ == 0) {
            C20441214yg.LJ("TakeStageInviterCoordinator", "Invite Request Error: channelId is empty");
            return;
        }
        if (Intrinsics.LJFF(C915980Zwa.LJI().LJIIJ().LJJIJIIJI(), EnumC973640bRa.PK_REMATCH.getValue())) {
            i = 6;
        } else if (this.LJII) {
            i = 1;
        } else {
            i = 0;
        }
        Room roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(this.LIZ.dataChannel);
        if (roomLJJLIIIIJ2 != null) {
            ownerUserId2 = roomLJJLIIIIJ2.getOwnerUserId();
        }
        this.LJIIIIZZ = Long.valueOf(System.currentTimeMillis());
        new C974560bT4().LJJIJIL(LJJJJI(), this.LJII);
        LJJJJJ().LJJIJ.LJIIJ = C158B.LIZ();
        C974560bT4 c974560bT4 = new C974560bT4();
        if (this.LJIILLIIL) {
            j = 3;
        } else {
            j = 2;
        }
        AbstractC963510bBF abstractC963510bBF = LJJJJJ().LJIL;
        if ((abstractC963510bBF instanceof C963520bBG) && (c963520bBG2 = (C963520bBG) abstractC963510bBF) != null) {
            i2 = c963520bBG2.LJFF;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList<C954460awe> arrayList = new ArrayList(list);
        AbstractC963510bBF abstractC963510bBF2 = LJJJJJ().LJJIJIIJI.LIZ.LJIL;
        if ((abstractC963510bBF2 instanceof C963520bBG) && (c963520bBG = (C963520bBG) abstractC963510bBF2) != null) {
            list2 = c963520bBG.LJI;
        } else {
            list2 = null;
        }
        C968660bJY.LIZIZ(arrayList, list2);
        long jLIZIZ = C972470bPh.LIZIZ(!this.LJII);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestInviteApi. perfDuration=");
        sbLIZ.append(jLIZIZ);
        sbLIZ.append(". isRematch=");
        sbLIZ.append(this.LJII);
        C20441214yg.LIZIZ("TakeStageInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        C930480aJy c930480aJy = C930480aJy.LIZ;
        C480460Ism.LIZ().getClass();
        CompetitionApi competitionApi = (CompetitionApi) C480460Ism.LIZLLL(CompetitionApi.class);
        CompetitionInitiateParams competitionInitiateParams = new CompetitionInitiateParams();
        competitionInitiateParams.channelId = jLIZ;
        competitionInitiateParams.competitionType = EnumC962960bAM.TAKE_THE_STAGE.getType();
        CompetitionInitiateInfo competitionInitiateInfo = new CompetitionInitiateInfo();
        CompetitionUserBase competitionUserBase = new CompetitionUserBase();
        competitionUserBase.userId = ownerUserId2;
        competitionUserBase.role = 1;
        competitionInitiateInfo.initiator = competitionUserBase;
        competitionInitiateInfo.initiateType = i;
        CompetitionInitiateInfo.TakeTheStageBiz takeTheStageBiz = new CompetitionInitiateInfo.TakeTheStageBiz();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (C954460awe c954460awe : arrayList) {
            CompetitionInitiateInfo.TakeTheStageBiz.AnchorInfo anchorInfo = new CompetitionInitiateInfo.TakeTheStageBiz.AnchorInfo();
            anchorInfo.userId = c954460awe.LJ;
            anchorInfo.defaultOrder = arrayList.indexOf(c954460awe);
            arrayList2.add(anchorInfo);
        }
        takeTheStageBiz.anchors = new ArrayList(arrayList2);
        takeTheStageBiz.takeTheStageVersion = j;
        competitionInitiateInfo.takeTheStageBiz = takeTheStageBiz;
        competitionInitiateParams.initiateInfo = competitionInitiateInfo;
        competitionInitiateParams.durationSec = jLIZIZ;
        competitionInitiateParams.triggerSource = i2;
        C11JF c11jfLIZ = ((C0J1N) competitionApi.competitionInitiate(competitionInitiateParams).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(this.LIZ))).LIZ(new AfS151S0200000_15(c974560bT4, this, 74), new AfS4S0200100_15(jCurrentTimeMillis, c974560bT4, this, 6));
        C11NJ c11njLJJJJIZL = LJJJJIZL();
        c930480aJy.getClass();
        c11njLJJJJIZL.LIZ(c11jfLIZ);
    }

    @Override // X.InterfaceC981590beP
    public final void LJIIJ(boolean z) {
        C981300bdw c981300bdw = this.LJFF;
        if (c981300bdw != null) {
            c981300bdw.LJFF(EnumC981380be4.HOSTS_LIST_CHANGED);
        }
        if (z) {
            C766270U4b.LIZLLL(2131853338);
        }
    }

    @Override // X.InterfaceC981590beP
    public final void LJIILJJIL(C982450bfn c982450bfn) {
        C981300bdw c981300bdw = this.LJFF;
        if (c981300bdw != null) {
            c981300bdw.LIZJ(c982450bfn.LJII, true);
        }
    }

    @Override // X.InterfaceC981590beP
    public final boolean LJJII(C982480bfq c982480bfq) {
        long jLongValue;
        ArrayList arrayList;
        MutableLiveData mutableLiveData;
        List list;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = this.LJIIIIZZ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (jCurrentTimeMillis - jLongValue > 3000) {
            return false;
        }
        C981300bdw c981300bdw = this.LJFF;
        ArrayList arrayList2 = null;
        if (c981300bdw != null && (mutableLiveData = c981300bdw.LIZLLL) != null && (list = (List) mutableLiveData.getValue()) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((C954460awe) it2.next()).LJ));
            }
        } else {
            arrayList = null;
        }
        List<C981870ber> list2 = c982480bfq.LJII;
        if (list2 != null) {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<C981870ber> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Long.valueOf(it3.next().LIZ));
            }
        }
        return C973560bRS.LIZIZ(arrayList2, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    @Override // X.InterfaceC981590beP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(X.C982870bgT r10) {
        /*
            r9 = this;
            X.0bdw r0 = r9.LJFF
            r7 = 0
            r5 = 0
            if (r0 == 0) goto L87
            androidx.lifecycle.MutableLiveData r0 = r0.LIZLLL
            if (r0 == 0) goto L87
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L87
            java.util.Iterator r8 = r0.iterator()
        L16:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r6 = r8.next()
            r0 = r6
            X.0awe r0 = (X.C954460awe) r0
            if (r10 == 0) goto L16
            long r3 = r0.LJ
            long r1 = r10.LJFF
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L16
        L2d:
            X.0awe r6 = (X.C954460awe) r6
            if (r6 == 0) goto L87
            X.0Tip r0 = r6.LJIJJ
        L33:
            java.lang.String r2 = X.C946260ajQ.LIZ(r0)
            com.bytedance.android.livesdk.livesetting.linkmic.match.LivePlazaPanelSimplifiedInfo r6 = com.bytedance.android.livesdk.livesetting.linkmic.match.LivePlazaPanelSimplifiedInfo.INSTANCE
            boolean r0 = r6.isEnable()
            if (r0 == 0) goto L74
            r0 = 2131851804(0x7f117a1c, float:1.9337209E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            X.C766270U4b.LJIIJJI(r0)
        L49:
            if (r10 == 0) goto L53
            X.0bT4 r0 = new X.0bT4
            r0.<init>()
            r0.LJJJJ(r10)
        L53:
            com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget r0 = r9.LIZ
            com.bytedance.ies.sdk.datachannel.DataChannel r4 = r0.dataChannel
            if (r4 == 0) goto L66
            java.lang.Class<com.bytedance.android.live.liveinteract.matchv2.connection.matchstate.RematchButtonUpdateEvent> r3 = com.bytedance.android.live.liveinteract.matchv2.connection.matchstate.RematchButtonUpdateEvent.class
            X.0baw r2 = new X.0baw
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0 = 6
            r2.<init>(r1, r5, r5, r0)
            r4.LC0(r3, r2)
        L66:
            boolean r0 = r6.isEnable()
            if (r0 == 0) goto L73
            kotlin.jvm.functions.Function1<? super X.0beM, kotlin.Unit> r1 = r9.LJIILL
            X.0beM r0 = X.EnumC981560beM.DECLINE_BUTTON
            r1.invoke(r0)
        L73:
            return
        L74:
            r0 = 2131853306(0x7f117ffa, float:1.9340255E38)
            java.lang.String r1 = X.C497740JfY.LJIJI(r0)
            java.lang.String r0 = "{username}"
            java.lang.String r0 = kotlin.text.u.LJJIFFI(r1, r0, r2, r7)
            X.C766270U4b.LJIIJJI(r0)
            goto L49
        L85:
            r6 = r5
            goto L2d
        L87:
            r0 = r5
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C981360be2.LJJIIZ(X.0bgT):void");
    }

    @Override // X.InterfaceC981590beP
    public final void LJJIJ(C983020bgi c983020bgi) {
        MutableLiveData mutableLiveData;
        List list;
        Object next;
        C981300bdw c981300bdw = this.LJFF;
        C754570Tip c754570Tip = null;
        if (c981300bdw != null && (mutableLiveData = c981300bdw.LIZLLL) != null && (list = (List) mutableLiveData.getValue()) != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    C954460awe c954460awe = (C954460awe) next;
                    if (c983020bgi != null && c954460awe.LJ == c983020bgi.LJFF) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C954460awe c954460awe2 = (C954460awe) next;
            if (c954460awe2 != null) {
                c754570Tip = c954460awe2.LJIJJ;
            }
        }
        C946260ajQ.LIZ(c754570Tip);
        if (c983020bgi != null) {
            C974560bT4 c974560bT4 = new C974560bT4();
            c974560bT4.LJIL(c983020bgi);
            c974560bT4.LJIJJLI("cancel_message");
        }
    }

    @Override // X.InterfaceC981590beP
    public final boolean LJJJ(C982480bfq c982480bfq) {
        long j;
        List<TakeTheStageBizExtra.PerformAnchor> list;
        TakeTheStageBizExtra.PerformAnchor performAnchor;
        if (!LiveMatchTakeStageOptSetting.INSTANCE.isEnableOptInvitationLogic()) {
            return true;
        }
        TakeTheStageBizExtra takeTheStageBizExtraLIZIZ = C982410bfj.LIZIZ(c982480bfq);
        if (takeTheStageBizExtraLIZIZ != null && (list = takeTheStageBizExtraLIZIZ.LIZ) != null && (performAnchor = (TakeTheStageBizExtra.PerformAnchor) C13LP.LJJJLZIJ(0, list)) != null) {
            j = performAnchor.userId;
        } else {
            j = 0;
        }
        long j2 = this.LJFF.LJIILL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldAutoAccept, firstPerformFromMsg=");
        sbLIZ.append(j);
        sbLIZ.append(", firstPerformFromLocal=");
        sbLIZ.append(j2);
        C20441214yg.LJ("TakeStageInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        if (j == j2) {
            return true;
        }
        return false;
    }

    public final void LJJJJJL(Throwable th) {
        String str;
        if (this.LJI) {
            return;
        }
        C981300bdw c981300bdw = this.LJFF;
        if (c981300bdw != null) {
            c981300bdw.LJIIL.setValue(Boolean.FALSE);
        }
        if (th instanceof C983890bi7) {
            C766270U4b.LIZLLL(2131851705);
            str = "hosts_changed";
        } else {
            C915490Zvn.LIZ(EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE, this.LIZ.context, th);
            str = "others";
        }
        new C974560bT4().LJJIJIIJIL(str, this.LJII, LJJJJI());
        Function2<? super Boolean, ? super Boolean, Unit> function2 = this.LJIIJ;
        Boolean bool = Boolean.TRUE;
        function2.invoke(bool, bool);
    }

    public C981360be2(MatchBaseWidget matchBaseWidget, InterfaceC981940bey interfaceC981940bey) {
        super(matchBaseWidget, interfaceC981940bey);
        this.LJFF = (C981300bdw) matchBaseWidget.y1(C981300bdw.class);
        this.LJIIIZ = AFwS299S0000000_15.get$arr$(51);
        this.LJIIJ = AFwS299S0000000_15.get$arr$(50);
        this.LJIIJJI = AFwS250S0000000_15.get$arr$(257);
        this.LJIIL = AFwS250S0000000_15.get$arr$(256);
        this.LJIILIIL = AFwS203S0000000_15.get$arr$(475);
        this.LJIILJJIL = AFwS203S0000000_15.get$arr$(476);
        this.LJIILL = AFwS250S0000000_15.get$arr$(255);
        this.LJIILLIIL = C968660bJY.LIZ();
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJIJJ(long j, EnumC981380be4 enumC981380be4) {
        LJJIJIIJIL(j, enumC981380be4);
    }

    @Override // X.InterfaceC981310bdx
    public final void LJJIJIIJIL(long j, EnumC981380be4 enumC981380be4) {
        LJJJJJ().getClass();
        long jLIZ = C981480beE.LIZ();
        if (jLIZ == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestCancelApi");
            sbLIZ.append(", error, channelId = 0");
            C20441214yg.LJ("TakeStageInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        }
        C974560bT4 c974560bT4 = new C974560bT4();
        EnumC981380be4.Companion.getClass();
        C974560bT4.LJJIIJ(c974560bT4, C981390be5.LIZ(enumC981380be4), LJJJJI());
        C974560bT4 c974560bT42 = new C974560bT4();
        C930480aJy c930480aJy = C930480aJy.LIZ;
        C480460Ism.LIZ().getClass();
        CompetitionApi competitionApi = (CompetitionApi) C480460Ism.LIZLLL(CompetitionApi.class);
        CompetitionReplyParams competitionReplyParams = new CompetitionReplyParams();
        CompetitionCommon competitionCommon = new CompetitionCommon();
        competitionCommon.type = EnumC962960bAM.TAKE_THE_STAGE.getType();
        competitionCommon.channelId = jLIZ;
        competitionCommon.competitionId = j;
        competitionReplyParams.bizCommon = competitionCommon;
        competitionReplyParams.replyType = 3;
        InterfaceC420801kM interfaceC420801kMLJJLL = competitionApi.competitionReply(competitionReplyParams).LJIILIIL(new C0UO0()).LJJLL(new AfS109S0300000_15(c974560bT42, this, enumC981380be4, 29), new AfS151S0200000_15(c974560bT42, this, 73));
        C11NJ c11njLJJJJIZL = LJJJJIZL();
        c930480aJy.getClass();
        c11njLJJJJIZL.LIZ(interfaceC420801kMLJJLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC981590beP
    public final void LJJIJIL(boolean z, boolean z2, String str, AwS155S0110000_15 awS155S0110000_15, AwS629S0100000_15 awS629S0100000_15, AwS381S0200000_15 awS381S0200000_15, AwS594S0100000_15 awS594S0100000_15, AwS594S0100000_15 awS594S0100000_152, AwS559S0100000_15 awS559S0100000_15, AwS559S0100000_15 awS559S0100000_152) {
        long jLongValue;
        C963520bBG c963520bBG;
        List<Long> list;
        Long l;
        this.LJII = z2;
        this.LJIIIZ = awS155S0110000_15;
        this.LJIIJ = awS629S0100000_15;
        this.LJIIJJI = awS381S0200000_15;
        this.LJIIL = awS594S0100000_15;
        this.LJIILL = awS594S0100000_152;
        this.LJIILIIL = awS559S0100000_15;
        this.LJIILJJIL = awS559S0100000_152;
        LinkDialog linkDialog = this.LJ;
        C07WX c07wx = null;
        FragmentManager fragmentManager = null;
        FragmentManager fragmentManager2 = null;
        if (linkDialog != null) {
            DataChannel dataChannel = this.LIZ.dataChannel;
            if (dataChannel != null) {
                dataChannel.SX0(C755570TkR.class, Boolean.valueOf(z));
            }
            if (!linkDialog.isVisible()) {
                DataChannel dataChannel2 = this.LIZ.dataChannel;
                if (dataChannel2 != null) {
                    fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class);
                }
                linkDialog.show(fragmentManager, "TakeStageInviterCoordinator");
            }
            C20441214yg.LIZIZ("TakeStageInviterCoordinator", "presentInvitationView, inviterWaitingDialog is already create");
            return;
        }
        LinkDialog linkDialog2 = this.LIZLLL;
        if (linkDialog2 != null) {
            if (!linkDialog2.isVisible()) {
                DataChannel dataChannel3 = this.LIZ.dataChannel;
                if (dataChannel3 != null) {
                    fragmentManager2 = (FragmentManager) dataChannel3.gg0(C748880TZe.class);
                }
                linkDialog2.show(fragmentManager2, "TakeStageInviterCoordinator");
            }
            C20441214yg.LIZIZ("TakeStageInviterCoordinator", "presentInvitationView, inviterSelectDialog is already create");
            return;
        }
        C981300bdw c981300bdw = this.LJFF;
        if (c981300bdw != null) {
            c981300bdw.LIZ = this.LIZ.dataChannel;
            c981300bdw.LIZIZ = this;
        }
        this.LJIILLIIL = C968660bJY.LIZ();
        LJJJJJ().LJJIIZI.getClass();
        C973910bS1.LJIIIIZZ.getClass();
        long j = C973920bS2.LIZIZ;
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        boolean zContains = arrayList.contains(Long.valueOf(j));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("presentInvitationView, isRematch=");
        sbLIZ.append(z2);
        sbLIZ.append(", isInitialOpen=");
        sbLIZ.append(z);
        sbLIZ.append(", initialPerformUid=");
        sbLIZ.append(j);
        sbLIZ.append(" ,isInitialPerformAnchorIn=");
        sbLIZ.append(zContains);
        C20441214yg.LIZIZ("TakeStageInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        if (z2 && z && zContains) {
            if (j > 0) {
                if (this.LJIILLIIL) {
                    List<C954460awe> listLLILZLL2 = C915980Zwa.LJII().LLILZLL(true);
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLLILZLL2, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                    for (C954460awe c954460awe : listLLILZLL2) {
                        linkedHashMap.put(Long.valueOf(c954460awe.LJ), c954460awe);
                    }
                    LJJJJJ().LJJIIZI.getClass();
                    C973910bS1.LJIIIIZZ.getClass();
                    List<Long> list2 = C973920bS2.LIZJ;
                    if (list2.isEmpty()) {
                        C20441214yg.LJIIL("TakeStageInviterCoordinator", "Performer list in the previous TTS is empty. If it is first round, then it's okay.");
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<Long> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        long jLongValue2 = it3.next().longValue();
                        Object obj = linkedHashMap.get(Long.valueOf(jLongValue2));
                        if (obj == null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(jLongValue2);
                            sbLIZ2.append(" cannot be found. Maybe he leaves?");
                            C20441214yg.LJIIL("TakeStageInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ2));
                        } else {
                            arrayList2.add(obj);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        C20441214yg.LJ("TakeStageInviterCoordinator", "Unexpected error! Cannot find performer list from the previous round. Fallback!");
                        C981300bdw.LJ(this.LJFF, j);
                        return;
                    } else {
                        this.LJFF.LIZLLL(((C954460awe) ListProtector.get(arrayList2, 0)).LJ, new ArrayList(arrayList2));
                        return;
                    }
                }
                C981300bdw.LJ(this.LJFF, j);
                return;
            }
            MatchBaseWidget matchBaseWidget = this.LIZ;
            AwS559S0100000_15 awS559S0100000_153 = new AwS559S0100000_15(this, 1172);
            LinkDialog linkDialog3 = new LinkDialog(matchBaseWidget);
            EnumC977660bY4 enumC977660bY4 = EnumC977660bY4.TAKE_THE_STAGE_INVITER_SELECT;
            C979990bbp c979990bbp = new C979990bbp(matchBaseWidget, str, awS559S0100000_153, z2);
            linkDialog3.LLILZIL = enumC977660bY4;
            linkDialog3.LLILZLL = c979990bbp;
            C957750b1x.LIZ(matchBaseWidget.dataChannel, linkDialog3, "tag_competition_inviter_prepare_dialog");
            this.LIZLLL = linkDialog3;
            return;
        }
        AbstractC963510bBF abstractC963510bBF = LJJJJJ().LJIL;
        if ((abstractC963510bBF instanceof C963520bBG) && (c963520bBG = (C963520bBG) abstractC963510bBF) != null && (list = c963520bBG.LJI) != null && (l = (Long) C13LP.LJJJLL(list)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = LJJJJJ().LJFF;
        }
        if (this.LJIILLIIL) {
            DataChannel dataChannel4 = this.LIZ.dataChannel;
            if (dataChannel4 != null && (c07wx = (C07WX) dataChannel4.gg0(C0UEF.class)) != null && (!c07wx.LIZ.isEmpty())) {
                C20441214yg.LIZIZ("TakeStageInviterCoordinator", "Use custom settings panel flow. performList is " + c07wx.LIZ);
                this.LJFF.LIZLLL(((C954460awe) ListProtector.get(c07wx.LIZ, 0)).LJ, new ArrayList(c07wx.LIZ));
                return;
            }
            C20441214yg.LIZIZ("TakeStageInviterCoordinator", "Use default behavior flow. info=" + c07wx);
            C981300bdw.LJ(this.LJFF, jLongValue);
            return;
        }
        C981300bdw.LJ(this.LJFF, jLongValue);
    }
}
