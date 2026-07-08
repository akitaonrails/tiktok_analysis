package X;

import androidx.lifecycle.LifecycleKt;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionTeamBase;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionUserBase;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchBeansSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
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

/* JADX INFO: renamed from: X.0beX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981670beX extends AbstractC981930bex implements InterfaceC981590beP, InterfaceC981920bew {
    public LinkDialog LIZLLL;
    public final C981850bep LJ;
    public boolean LJFF;
    public boolean LJI;
    public Long LJII;
    public Function2<? super Long, ? super List<C981870ber>, Unit> LJIIIIZZ;
    public Function2<? super Boolean, ? super Boolean, Unit> LJIIIZ;
    public Function1<? super EnumC981380be4, Unit> LJIIJ;
    public Function1<? super Boolean, Unit> LJIIJJI;
    public Function0<Unit> LJIIL;
    public Function0<Unit> LJIILIIL;
    public Function1<? super EnumC981560beM, Unit> LJIILJJIL;

    @Override // X.InterfaceC981590beP
    public final void LJJIJLIJ() {
    }

    @Override // X.InterfaceC981590beP
    public final boolean LJJJ(C982480bfq c982480bfq) {
        return true;
    }

    @Override // X.InterfaceC981590beP
    public final void LIZLLL() {
        LinkDialog linkDialog = this.LIZLLL;
        if (linkDialog != null) {
            linkDialog.dismiss();
        }
        this.LJIILIIL.invoke();
    }

    @Override // X.InterfaceC981590beP
    public final void LJ() {
        this.LJ.LIZLLL(EnumC981380be4.MIC_ROOM_START);
    }

    @Override // X.InterfaceC981590beP
    public final void LJI() {
        this.LJ.LIZLLL(EnumC981380be4.HOSTS_LIST_CHANGED);
        C766270U4b.LIZLLL(2131851853);
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LIZIZ() {
        super.LIZIZ();
        this.LJFF = true;
        C0TBZ.LIZIZ();
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJJIII() {
        if (LJJJJI() == EnumC962960bAM.CATCH_BEANS) {
            C981480beE c981480beELJJJJJ = LJJJJJ();
            for (C954460awe c954460awe : c981480beELJJJJJ.LJI) {
                C981520beI c981520beI = c981480beELJJJJJ.LIZLLL;
                long j = c954460awe.LJ;
                c981520beI.LIZJ(j, Collections.singletonList(Long.valueOf(j)));
            }
        }
    }

    @Override // X.InterfaceC981920bew
    public final void LJIIIZ(List<C954460awe> list) {
        long ownerUserId;
        boolean z;
        int i;
        boolean z2 = this.LJI;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZ.dataChannel);
        if (roomLJJLIIIIJ != null) {
            ownerUserId = roomLJJLIIIIJ.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        Iterator<C954460awe> it2 = C915980Zwa.LJII().LLILZLL(true).iterator();
        while (it2.hasNext()) {
            long j = it2.next().LJ;
            if (j != ownerUserId) {
                C973690bRf.LIZ.LJJII(j, "catch_bean", "catch_bean", z2);
            }
        }
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
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
            C20441214yg.LJ("CatchBeansInviterCoordinator", "Invite Request Error, HostsChangedException");
            LJJJJLL(new C977870bYP());
            return;
        }
        LJJJJJ().getClass();
        long jLIZ = C981480beE.LIZ();
        if (jLIZ == 0) {
            C20441214yg.LJ("CatchBeansInviterCoordinator", "Invite Request Error: channelId is empty");
            return;
        }
        if (Intrinsics.LJFF(C915980Zwa.LJI().LJIIJ().LJJIJIIJI(), EnumC973640bRa.PK_REMATCH.getValue())) {
            i = 6;
        } else if (this.LJI) {
            i = 1;
        } else {
            i = 0;
        }
        this.LJII = Long.valueOf(System.currentTimeMillis());
        new C974560bT4().LJJIJIL(LJJJJI(), this.LJI);
        LJJJJJ().LJJIJ.LJIIJ = C158B.LIZ();
        C974560bT4 c974560bT4 = new C974560bT4();
        long gameDurationInSecs = LiveMatchBeansSettings.INSTANCE.getGameDurationInSecs();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C954460awe c954460awe : list) {
            CompetitionTeamBase competitionTeamBase = new CompetitionTeamBase();
            competitionTeamBase.teamId = c954460awe.LJ;
            CompetitionUserBase competitionUserBase = new CompetitionUserBase();
            competitionUserBase.userId = c954460awe.LJ;
            competitionTeamBase.users = new ArrayList(Collections.singletonList(competitionUserBase));
            arrayList.add(competitionTeamBase);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ownerWidget?.lifecycle = ");
        sbLIZ.append(this.LIZ.getLifecycle().getCurrentState());
        C20441214yg.LIZIZ("CatchBeansInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        if (C2296808zG.LJI(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(this.LIZ.getLifecycle()))) {
            C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(this.LIZ.getLifecycle()), null, null, new C981710beb(this, jLIZ, gameDurationInSecs, arrayList2, i, c974560bT4, null), 3);
            return;
        }
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C981720bec(this, jLIZ, gameDurationInSecs, arrayList2, i, c974560bT4, null), 2);
    }

    @Override // X.InterfaceC981590beP
    public final void LJIIJ(boolean z) {
        this.LJ.LIZLLL(EnumC981380be4.HOSTS_LIST_CHANGED);
        if (z) {
            C766270U4b.LIZLLL(2131853338);
        }
    }

    @Override // X.InterfaceC981590beP
    public final void LJIILJJIL(C982450bfn c982450bfn) {
        this.LJ.LIZJ(c982450bfn.LJII, true);
    }

    @Override // X.InterfaceC981590beP
    public final boolean LJJII(C982480bfq c982480bfq) {
        long jLongValue;
        ArrayList arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = this.LJII;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (jCurrentTimeMillis - jLongValue > 3000) {
            return false;
        }
        List list = (List) this.LJ.LIZLLL.getValue();
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((C954460awe) it2.next()).LJ));
            }
        } else {
            arrayList = null;
        }
        List<C981870ber> list2 = c982480bfq.LJII;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<C981870ber> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Long.valueOf(it3.next().LIZ));
        }
        return C973560bRS.LIZIZ(arrayList2, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    @Override // X.InterfaceC981590beP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(X.C982870bgT r12) {
        /*
            r11 = this;
            X.0bep r0 = r11.LJ
            androidx.lifecycle.MutableLiveData r0 = r0.LIZLLL
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r6 = 1
            r7 = 0
            r8 = 0
            if (r0 == 0) goto La4
            java.util.Iterator r9 = r0.iterator()
        L13:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto La2
            java.lang.Object r5 = r9.next()
            r0 = r5
            X.0awe r0 = (X.C954460awe) r0
            if (r12 == 0) goto L13
            long r2 = r0.LJ
            long r0 = r12.LJFF
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L13
        L2a:
            X.0awe r5 = (X.C954460awe) r5
            if (r5 == 0) goto La4
            X.0Tip r0 = r5.LJIJJ
        L30:
            java.lang.String r9 = X.C946260ajQ.LIZ(r0)
            if (r12 == 0) goto La0
            int r5 = r12.LJI
        L38:
            r0 = 4
            r10 = 6
            if (r5 == r0) goto L9c
            r0 = 5
            if (r5 == r0) goto L98
            if (r5 == r10) goto L94
            com.bytedance.android.livesdk.livesetting.linkmic.match.LivePlazaPanelSimplifiedInfo r0 = com.bytedance.android.livesdk.livesetting.linkmic.match.LivePlazaPanelSimplifiedInfo.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 == 0) goto L90
            r4 = 2131851803(0x7f117a1b, float:1.9337207E38)
        L4c:
            com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget r0 = r11.LIZ
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r0.dataChannel
            if (r3 == 0) goto L5e
            java.lang.Class<com.bytedance.android.live.liveinteract.matchv2.connection.matchstate.RematchButtonUpdateEvent> r2 = com.bytedance.android.live.liveinteract.matchv2.connection.matchstate.RematchButtonUpdateEvent.class
            X.0baw r1 = new X.0baw
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.<init>(r0, r8, r8, r10)
            r3.LC0(r2, r1)
        L5e:
            java.lang.String r1 = X.C497740JfY.LJIJI(r4)
            java.lang.String r0 = "{username}"
            java.lang.String r0 = kotlin.text.u.LJJIFFI(r1, r0, r9, r7)
            X.C766270U4b.LJIIJJI(r0)
            if (r12 == 0) goto L75
            X.0bT4 r0 = new X.0bT4
            r0.<init>()
            r0.LJJJJ(r12)
        L75:
            com.bytedance.android.livesdk.livesetting.linkmic.match.LivePlazaPanelSimplifiedInfo r0 = com.bytedance.android.livesdk.livesetting.linkmic.match.LivePlazaPanelSimplifiedInfo.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 == 0) goto L89
            if (r5 == r6) goto L8d
            r0 = 2
            if (r5 == r0) goto L8a
            X.0beM r1 = X.EnumC981560beM.DECLINE_BUTTON
        L84:
            kotlin.jvm.functions.Function1<? super X.0beM, kotlin.Unit> r0 = r11.LJIILJJIL
            r0.invoke(r1)
        L89:
            return
        L8a:
            X.0beM r1 = X.EnumC981560beM.TIME_OUT
            goto L84
        L8d:
            X.0beM r1 = X.EnumC981560beM.DECLINE_BUTTON
            goto L84
        L90:
            r4 = 2131853306(0x7f117ffa, float:1.9340255E38)
            goto L4c
        L94:
            r4 = 2131851558(0x7f117926, float:1.933671E38)
            goto L4c
        L98:
            r4 = 2131851559(0x7f117927, float:1.9336712E38)
            goto L4c
        L9c:
            r4 = 2131851556(0x7f117924, float:1.9336706E38)
            goto L4c
        La0:
            r5 = 0
            goto L38
        La2:
            r5 = r8
            goto L2a
        La4:
            r0 = r8
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C981670beX.LJJIIZ(X.0bgT):void");
    }

    @Override // X.InterfaceC981590beP
    public final void LJJIJ(C983020bgi c983020bgi) {
        if (c983020bgi != null) {
            C974560bT4 c974560bT4 = new C974560bT4();
            c974560bT4.LJIL(c983020bgi);
            c974560bT4.LJIJJLI("cancel_message");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJL(X.InterfaceC1364105Vn<? super java.lang.Throwable> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C981860beq
            if (r0 == 0) goto L77
            r4 = r6
            X.0beq r4 = (X.C981860beq) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L3c
            if (r0 != r2) goto L7f
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L7d
            X.0bl1 r0 = X.C985690bl1.LIZ
            r0.getClass()
            java.lang.String r1 = X.C985690bl1.LIZIZ
            java.util.Set<java.lang.String> r0 = X.C985690bl1.LJFF
            r0.add(r1)
            X.0bkF r0 = new X.0bkF
            r0.<init>()
            return r0
        L3c:
            X.C155000ia.LIZIZ(r1)
            com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget r0 = r5.LIZ
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.dataChannel
            if (r1 == 0) goto L5b
            java.lang.Class<com.bytedance.android.livesdk.sticker.game.GameGiftStateChannel> r0 = com.bytedance.android.livesdk.sticker.game.GameGiftStateChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            X.0flW r0 = (X.EnumC1139760flW) r0
            if (r0 == 0) goto L5b
            boolean r0 = r0.isInGaming()
            if (r0 != r2) goto L5b
            X.0bkG r0 = new X.0bkG
            r0.<init>()
            return r0
        L5b:
            X.0bl1 r1 = X.C985690bl1.LIZ
            r1.getClass()
            boolean r0 = X.C985690bl1.LIZJ()
            if (r0 != 0) goto L6c
            X.0bkD r0 = new X.0bkD
            r0.<init>()
            return r0
        L6c:
            java.lang.String r0 = X.C985690bl1.LIZIZ
            r4.LLILLL = r2
            java.lang.Object r1 = r1.LIZIZ(r0, r4)
            if (r1 != r3) goto L22
            return r3
        L77:
            X.0beq r4 = new X.0beq
            r4.<init>(r5, r6)
            goto L12
        L7d:
            r0 = 0
            return r0
        L7f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C981670beX.LJJJJL(X.05Vn):java.lang.Object");
    }

    public final void LJJJJLL(Throwable th) {
        String str;
        if (this.LJFF) {
            return;
        }
        this.LJ.LJIIJJI.setValue(Boolean.FALSE);
        if (th instanceof C977870bYP) {
            C766270U4b.LIZLLL(2131851705);
            str = "hosts_changed";
        } else if (th instanceof C985210bkF) {
            C766270U4b.LIZLLL(2131851548);
            str = "game_not_ready";
        } else if (th instanceof C985190bkD) {
            C766270U4b.LIZLLL(2131851545);
            str = "device_score_too_low";
        } else if (th instanceof C985220bkG) {
            C766270U4b.LIZLLL(2131853108);
            str = "in_arena_game";
        } else {
            C915490Zvn.LIZ(EnumC919170a1j.MATCH_TYPE_CATCH_BEANS, this.LIZ.context, th);
            str = "others";
        }
        new C974560bT4().LJJIJIIJIL(str, this.LJI, LJJJJI());
        Function2<? super Boolean, ? super Boolean, Unit> function2 = this.LJIIIZ;
        Boolean bool = Boolean.TRUE;
        function2.invoke(bool, bool);
    }

    public C981670beX(MatchBaseWidget matchBaseWidget, InterfaceC981940bey interfaceC981940bey) {
        super(matchBaseWidget, interfaceC981940bey);
        this.LJ = (C981850bep) matchBaseWidget.y1(C981850bep.class);
        this.LJIIIIZZ = AFwS299S0000000_15.get$arr$(42);
        this.LJIIIZ = AFwS299S0000000_15.get$arr$(41);
        this.LJIIJ = AFwS250S0000000_15.get$arr$(198);
        this.LJIIJJI = AFwS250S0000000_15.get$arr$(197);
        this.LJIIL = AFwS203S0000000_15.get$arr$(351);
        this.LJIILIIL = AFwS203S0000000_15.get$arr$(352);
        this.LJIILJJIL = AFwS250S0000000_15.get$arr$(196);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00aa  */
    @Override // X.InterfaceC981920bew
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(long r10, X.EnumC981380be4 r12) {
        /*
            r9 = this;
            X.0beE r0 = r9.LJJJJJ()
            r0.getClass()
            long r0 = X.C981480beE.LIZ()
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L28
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r2 = "requestWithdrawApi"
            r3.append(r2)
            java.lang.String r2 = ", error, channelId = 0"
            r3.append(r2)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r3)
            java.lang.String r2 = "CatchBeansInviterCoordinator"
            X.C20441214yg.LJ(r2, r3)
        L28:
            X.0bT4 r3 = new X.0bT4
            r3.<init>()
            X.0be5 r2 = X.EnumC981380be4.Companion
            r2.getClass()
            java.lang.String r2 = X.C981390be5.LIZ(r12)
            X.0bAM r8 = X.EnumC962960bAM.CATCH_BEANS
            X.C974560bT4.LJJIIJ(r3, r2, r8)
            X.0bT4 r4 = new X.0bT4
            r4.<init>()
            X.0aJy r7 = X.C930480aJy.LIZ
            X.0Ism r3 = X.C480460Ism.LIZ()
            java.lang.Class<com.bytedance.android.live.liveinteract.competition.api.CompetitionApi> r2 = com.bytedance.android.live.liveinteract.competition.api.CompetitionApi.class
            r3.getClass()
            java.lang.Object r5 = X.C480460Ism.LIZLLL(r2)
            com.bytedance.android.live.liveinteract.competition.api.CompetitionApi r5 = (com.bytedance.android.live.liveinteract.competition.api.CompetitionApi) r5
            com.bytedance.android.live.liveinteract.competition.model.CompetitionReplyParams r3 = new com.bytedance.android.live.liveinteract.competition.model.CompetitionReplyParams
            r3.<init>()
            com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon r6 = new com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon
            r6.<init>()
            int r2 = r8.getType()
            r6.type = r2
            r6.channelId = r0
            r6.competitionId = r10
            r3.bizCommon = r6
            r2 = 3
            r3.replyType = r2
            int[] r1 = X.C981400be6.LIZ
            int r0 = r12.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto Laa
            r0 = 2
            if (r1 == r0) goto L7e
            if (r1 == r2) goto Laa
            r0 = 4
            if (r1 != r0) goto Lac
            r2 = 2
        L7e:
            r3.rejectReason = r2
            X.11NZ r1 = r5.competitionReply(r3)
            X.0UO0 r0 = new X.0UO0
            r0.<init>()
            X.11NZ r3 = r1.LJIILIIL(r0)
            Y.AfS109S0300000_15 r2 = new Y.AfS109S0300000_15
            r0 = 17
            r2.<init>(r4, r9, r12, r0)
            Y.AfS151S0200000_15 r1 = new Y.AfS151S0200000_15
            r0 = 52
            r1.<init>(r4, r9, r0)
            X.01kM r1 = r3.LJJLL(r2, r1)
            X.11NJ r0 = r9.LJJJJIZL()
            r7.getClass()
            r0.LIZ(r1)
            return
        Laa:
            r2 = 1
            goto L7e
        Lac:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C981670beX.LJJIFFI(long, X.0be4):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJL(boolean r7, boolean r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C981670beX.LJJJJJL(boolean, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLI(long r13, long r15, java.util.List<com.bytedance.android.live.liveinteract.competition.model.CompetitionTeamBase> r17, int r18, X.C974560bT4 r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C981670beX.LJJJJLI(long, long, java.util.List, int, X.0bT4, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC981590beP
    public final void LJJIJIL(boolean z, boolean z2, String str, AwS155S0110000_15 awS155S0110000_15, AwS629S0100000_15 awS629S0100000_15, AwS381S0200000_15 awS381S0200000_15, AwS594S0100000_15 awS594S0100000_15, AwS594S0100000_15 awS594S0100000_152, AwS559S0100000_15 awS559S0100000_15, AwS559S0100000_15 awS559S0100000_152) {
        EnumC977660bY4 enumC977660bY4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("presentInvitationView, isInitialOpen=");
        sbLIZ.append(z);
        sbLIZ.append(", isRematch=");
        sbLIZ.append(z2);
        C20441214yg.LIZIZ("CatchBeansInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        LinkDialog linkDialog = this.LIZLLL;
        if (linkDialog != null && linkDialog.isVisible()) {
            LinkDialog linkDialog2 = this.LIZLLL;
            if (linkDialog2 == null || (enumC977660bY4 = linkDialog2.LLILZIL) == null) {
                enumC977660bY4 = null;
            }
            if (enumC977660bY4 == EnumC977660bY4.CATCH_BEANS_INVITER) {
                return;
            }
            if (linkDialog2 != null) {
                linkDialog2.dismiss();
            }
        }
        C981850bep c981850bep = this.LJ;
        c981850bep.LIZ = this.LIZ.dataChannel;
        c981850bep.LIZIZ = this;
        this.LJI = z2;
        this.LJIIIIZZ = awS155S0110000_15;
        this.LJIIIZ = awS629S0100000_15;
        this.LJIIJ = awS381S0200000_15;
        this.LJIIJJI = awS594S0100000_15;
        this.LJIILJJIL = awS594S0100000_152;
        this.LJIIL = awS559S0100000_15;
        this.LJIILIIL = awS559S0100000_152;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ownerWidget?.lifecycle = ");
        sbLIZ2.append(this.LIZ.getLifecycle().getCurrentState());
        C20441214yg.LIZIZ("CatchBeansInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ2));
        if (C2296808zG.LJI(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(this.LIZ.getLifecycle()))) {
            C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(this.LIZ.getLifecycle()), null, null, new C981780bei(this, z, z2, null), 3);
            return;
        }
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C981790bej(this, z, z2, null), 2);
    }
}
