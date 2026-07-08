package X;

import Y.AfS109S0300000_15;
import Y.AfS151S0200000_15;
import androidx.lifecycle.LifecycleKt;
import com.bytedance.android.live.liveinteract.competition.api.CompetitionApi;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionReplyParams;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0beY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981680beY extends AbstractC981930bex implements InterfaceC981630beT, InterfaceC983900bi8 {
    public static C981680beY LJIILJJIL;
    public final DataChannel LIZLLL;
    public LinkDialog LJ;
    public final C981800bek LJFF;
    public boolean LJI;
    public C982480bfq LJII;
    public long LJIIIIZZ;
    public final boolean LJIIIZ;
    public Function0<Unit> LJIIJ;
    public Function1<? super Boolean, Unit> LJIIJJI;
    public Function1<? super EnumC981560beM, Unit> LJIIL;
    public Function1<? super EnumC981560beM, Unit> LJIILIIL;

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LIZIZ() {
        this.LJI = true;
        C0TBZ.LIZIZ();
        LJIILJJIL = null;
    }

    @Override // X.InterfaceC981630beT
    public final void LJI() {
        this.LJFF.LJ(EnumC981560beM.HOSTS_GUEST_CHANGED);
        C766270U4b.LIZLLL(2131851853);
    }

    @Override // X.InterfaceC981630beT
    public final void LJIIJJI() {
        this.LJFF.LJ(EnumC981560beM.HOSTS_LIST_CHANGED);
    }

    @Override // X.InterfaceC983900bi8
    public final void LIZJ(int i) {
        String str;
        long channelId = C915980Zwa.LJII().getChannelId();
        if (channelId == 0) {
            C20441214yg.LJ("CatchBeansInviteeCoordinator", "Accept api error: channel id is empty");
            return;
        }
        C981880bes.LIZ(this, true);
        C974560bT4 c974560bT4 = new C974560bT4();
        if (i == 0) {
            str = "normal";
        } else {
            str = "invite_each_other";
        }
        c974560bT4.LJIIL(str, Scene.SCENE_SERVICE, true);
        c974560bT4.LJJIII();
        c974560bT4.LJIJJLI("accept_request");
        LJJJJJ().LJJIJ.LJIIJJI = C158B.LIZ();
        C974560bT4 c974560bT42 = new C974560bT4();
        C930480aJy c930480aJy = C930480aJy.LIZ;
        C480460Ism.LIZ().getClass();
        CompetitionApi competitionApi = (CompetitionApi) C480460Ism.LIZLLL(CompetitionApi.class);
        CompetitionReplyParams competitionReplyParams = new CompetitionReplyParams();
        CompetitionCommon competitionCommon = new CompetitionCommon();
        competitionCommon.type = EnumC962960bAM.CATCH_BEANS.getType();
        competitionCommon.channelId = channelId;
        competitionCommon.competitionId = this.LJIIIIZZ;
        competitionReplyParams.bizCommon = competitionCommon;
        competitionReplyParams.replyType = 1;
        C11JF c11jfLIZ = ((C0J1N) competitionApi.competitionReply(competitionReplyParams).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(this.LIZ))).LIZ(new AfS151S0200000_15(c974560bT42, this, 39), new AfS151S0200000_15(c974560bT42, this, 40));
        C11NJ c11njLJJJJIZL = LJJJJIZL();
        c930480aJy.getClass();
        c11njLJJJJIZL.LIZ(c11jfLIZ);
    }

    @Override // X.InterfaceC983900bi8
    public final void LJIILIIL(EnumC981560beM enumC981560beM) {
        long channelId = C915980Zwa.LJII().getChannelId();
        if (channelId == 0) {
            C20441214yg.LJ("CatchBeansInviteeCoordinator", "Reject api error: channel id is empty");
            return;
        }
        C981880bes.LIZ(this, false);
        C974560bT4 c974560bT4 = new C974560bT4();
        EnumC981560beM.Companion.getClass();
        C974560bT4.LJJJJI(c974560bT4, C981600beQ.LIZ(enumC981560beM), LJJJJI());
        C974560bT4 c974560bT42 = new C974560bT4();
        C930480aJy c930480aJy = C930480aJy.LIZ;
        C480460Ism.LIZ().getClass();
        CompetitionApi competitionApi = (CompetitionApi) C480460Ism.LIZLLL(CompetitionApi.class);
        CompetitionReplyParams competitionReplyParams = new CompetitionReplyParams();
        CompetitionCommon competitionCommon = new CompetitionCommon();
        competitionCommon.type = EnumC962960bAM.CATCH_BEANS.getType();
        competitionCommon.channelId = channelId;
        competitionCommon.competitionId = this.LJIIIIZZ;
        competitionReplyParams.bizCommon = competitionCommon;
        int i = 2;
        competitionReplyParams.replyType = 2;
        switch (C981610beR.LIZ[enumC981560beM.ordinal()]) {
            case 1:
                i = 1;
                break;
            case 2:
            case 3:
                i = 3;
                break;
            case 4:
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 7;
                break;
            default:
                throw new C1954807lC();
        }
        competitionReplyParams.rejectReason = i;
        C11JF c11jfLIZ = ((C0J1N) competitionApi.competitionReply(competitionReplyParams).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(this.LIZ))).LIZ(new AfS109S0300000_15(c974560bT42, this, enumC981560beM, 13), new AfS109S0300000_15(c974560bT42, this, enumC981560beM, 14));
        C11NJ c11njLJJJJIZL = LJJJJIZL();
        c930480aJy.getClass();
        c11njLJJJJIZL.LIZ(c11jfLIZ);
    }

    @Override // X.InterfaceC981630beT
    public final void LJIILJJIL(C982450bfn c982450bfn) {
        this.LJFF.LIZJ(c982450bfn.LJII, true);
    }

    @Override // X.InterfaceC981630beT
    public final void LJIL(AbstractC982800bgM abstractC982800bgM) {
        if (abstractC982800bgM instanceof C983020bgi) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131851554, LJJJJLI(((C983020bgi) abstractC982800bgM).LJFF)));
            C974560bT4 c974560bT4 = new C974560bT4();
            c974560bT4.LJIL(abstractC982800bgM);
            c974560bT4.LJIJJLI("cancel_message");
        }
    }

    @Override // X.InterfaceC981630beT
    public final void LJJI(String str) {
        Boolean boolValueOf;
        LinkDialog linkDialog = this.LJ;
        if (linkDialog != null) {
            boolValueOf = Boolean.valueOf(linkDialog.isVisible());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            new C974560bT4().LJJJ(this.LIZIZ.LJI().LJIIIIZZ, str);
        }
        LinkDialog linkDialog2 = this.LJ;
        if (linkDialog2 != null) {
            linkDialog2.dismiss();
        }
        this.LJ = null;
    }

    public final String LJJJJLI(long j) {
        Object next;
        List list = (List) this.LJFF.LIZLLL.getValue();
        C754570Tip c754570Tip = null;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((C954460awe) next).LJ == j) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C954460awe c954460awe = (C954460awe) next;
            if (c954460awe != null) {
                c754570Tip = c954460awe.LJIJJ;
            }
        }
        return C946260ajQ.LIZ(c754570Tip);
    }

    public C981680beY(MatchBaseWidget matchBaseWidget, InterfaceC981940bey interfaceC981940bey) {
        boolean z;
        super(matchBaseWidget, interfaceC981940bey);
        this.LIZLLL = matchBaseWidget.provideDataChannel();
        this.LJFF = (C981800bek) matchBaseWidget.y1(C981800bek.class);
        C20337914i1<Integer> c20337914i1 = InterfaceC1106030et7.T4;
        if (c20337914i1.LIZIZ().intValue() < 3) {
            z = true;
            c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
        } else {
            z = false;
        }
        this.LJIIIZ = z;
        this.LJIIJ = AFwS203S0000000_15.get$arr$(297);
        this.LJIIJJI = AFwS250S0000000_15.get$arr$(169);
        this.LJIIL = AFwS250S0000000_15.get$arr$(171);
        this.LJIILIIL = AFwS250S0000000_15.get$arr$(170);
    }

    @Override // X.InterfaceC981630beT
    public final void LJJIJIIJI(C982870bgT c982870bgT, boolean z) {
        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131853306, LJJJJLI(c982870bgT.LJFF)));
        new C974560bT4().LJJJJ(c982870bgT);
        if (!z) {
            C981880bes.LIZ(this, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJL(X.C982480bfq r15, X.InterfaceC1364105Vn<? super X.EnumC981560beM> r16) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C981680beY.LJJJJL(X.0bfq, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJL(X.C982480bfq r18, boolean r19, boolean r20, X.InterfaceC1364105Vn<? super kotlin.Unit> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C981680beY.LJJJJJL(X.0bfq, boolean, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC981630beT
    public final boolean LJIIZILJ(C982480bfq c982480bfq, boolean z, boolean z2, boolean z3, AwS559S0100000_15 awS559S0100000_15, AwS594S0100000_15 awS594S0100000_15, AwS594S0100000_15 awS594S0100000_152, AwS594S0100000_15 awS594S0100000_153) {
        EnumC977660bY4 enumC977660bY4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("presentInvitationView, isInitialOpen=");
        sbLIZ.append(z);
        sbLIZ.append(", shouldAutoAccept=");
        sbLIZ.append(z2);
        sbLIZ.append(", isRematch=");
        sbLIZ.append(z3);
        C20441214yg.LIZIZ("CatchBeansInviteeCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        this.LJII = c982480bfq;
        this.LJIIIIZZ = c982480bfq.LIZJ.LIZJ;
        this.LJIIJ = awS559S0100000_15;
        this.LJIIJJI = awS594S0100000_15;
        this.LJIIL = awS594S0100000_152;
        this.LJIILIIL = awS594S0100000_153;
        LinkDialog linkDialog = this.LJ;
        if (linkDialog != null && linkDialog.isVisible()) {
            LinkDialog linkDialog2 = this.LJ;
            if (linkDialog2 == null || (enumC977660bY4 = linkDialog2.LLILZIL) == null) {
                enumC977660bY4 = null;
            }
            if (enumC977660bY4 == EnumC977660bY4.CATCH_BEANS_INVITEE) {
                return true;
            }
            if (linkDialog2 != null) {
                linkDialog2.dismiss();
            }
        }
        C981800bek c981800bek = this.LJFF;
        c981800bek.LIZ = this.LIZLLL;
        c981800bek.LIZIZ = this;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(" ownerWidget.lifecycle.coroutineScope = ");
        sbLIZ2.append(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(this.LIZ.getLifecycle()).getCoroutineContext());
        C20441214yg.LIZIZ("CatchBeansInviteeCoordinator", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("ownerWidget?.lifecycle = ");
        sbLIZ3.append(this.LIZ.getLifecycle());
        C20441214yg.LIZIZ("CatchBeansInviteeCoordinator", C2188811AlT.LIZIZ(sbLIZ3));
        if (C2296808zG.LJI(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(this.LIZ.getLifecycle()))) {
            C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(this.LIZ.getLifecycle()), null, null, new C981740bee(this, c982480bfq, z, z2, null), 3);
            return true;
        }
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C981750bef(this, c982480bfq, z, z2, null), 2);
        return true;
    }
}
