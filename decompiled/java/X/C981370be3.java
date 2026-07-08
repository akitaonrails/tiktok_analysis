package X;

import Y.AfS109S0300000_15;
import Y.AfS151S0200000_15;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.competition.api.CompetitionApi;
import com.bytedance.android.live.liveinteract.competition.core.model.bizextra.TakeTheStageBizExtra;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionReplyParams;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.VWSettingsPageCloseChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageInviteTimeoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LivePlazaPanelSimplifiedInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LivePlazaPanelSimplifiedTimeout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0be3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981370be3 extends AbstractC981930bex implements InterfaceC981630beT, InterfaceC981320bdy {
    public static C981370be3 LJIILJJIL;
    public final DataChannel LIZLLL;
    public LinkDialog LJ;
    public final C981290bdv LJFF;
    public boolean LJI;
    public C982480bfq LJII;
    public long LJIIIIZZ;
    public final boolean LJIIIZ;
    public Function0<Unit> LJIIJ;
    public Function1<? super Boolean, Unit> LJIIJJI;
    public Function1<? super EnumC981560beM, Unit> LJIIL;
    public Function1<? super EnumC981560beM, Unit> LJIILIIL;

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJFF() {
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LJJIII() {
    }

    @Override // X.InterfaceC981630beT
    public final void LJI() {
        C981290bdv c981290bdv = this.LJFF;
        if (c981290bdv != null) {
            c981290bdv.LIZLLL(EnumC981560beM.HOSTS_GUEST_CHANGED);
        }
        C766270U4b.LIZLLL(2131851853);
    }

    @Override // X.InterfaceC981630beT
    public final void LJIIJJI() {
        C981290bdv c981290bdv = this.LJFF;
        if (c981290bdv != null) {
            c981290bdv.LIZLLL(EnumC981560beM.HOSTS_LIST_CHANGED);
        }
    }

    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
    public final void LIZIZ() {
        super.LIZIZ();
        this.LJI = true;
        if (this.LJFF != null) {
            AbstractC742610TBb.LIZIZ();
        }
        C981290bdv c981290bdv = this.LJFF;
        if (c981290bdv != null) {
            MutableLiveData<Boolean> mutableLiveData = c981290bdv.LJIIJ;
            Boolean bool = Boolean.FALSE;
            mutableLiveData.setValue(bool);
            c981290bdv.LJIIL.setValue(bool);
        }
        LJIILJJIL = null;
    }

    @Override // X.InterfaceC981320bdy
    public final void LIZJ(int i) {
        String str;
        C981410be7.LIZ(this, true);
        long channelId = C915980Zwa.LJII().getChannelId();
        if (channelId == 0) {
            C20441214yg.LJ("TakeStageInviteeCoordinator", "Accept api error channel id is empty");
            return;
        }
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
        competitionCommon.type = EnumC962960bAM.TAKE_THE_STAGE.getType();
        competitionCommon.channelId = channelId;
        competitionCommon.competitionId = this.LJIIIIZZ;
        competitionReplyParams.bizCommon = competitionCommon;
        competitionReplyParams.replyType = 1;
        C11JF c11jfLIZ = ((C0J1N) competitionApi.competitionReply(competitionReplyParams).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(this.LIZ))).LIZ(new AfS151S0200000_15(this, c974560bT42, 69), new AfS151S0200000_15(this, c974560bT42, 70));
        C11NJ c11njLJJJJIZL = LJJJJIZL();
        c930480aJy.getClass();
        c11njLJJJJIZL.LIZ(c11jfLIZ);
    }

    @Override // X.InterfaceC981320bdy
    public final void LJIILIIL(EnumC981560beM enumC981560beM) {
        C981410be7.LIZ(this, false);
        long channelId = C915980Zwa.LJII().getChannelId();
        if (channelId == 0) {
            C20441214yg.LJ("TakeStageInviteeCoordinator", "Reject api error channel id is empty");
            return;
        }
        C974560bT4 c974560bT4 = new C974560bT4();
        EnumC981560beM.Companion.getClass();
        C974560bT4.LJJJJI(c974560bT4, C981600beQ.LIZ(enumC981560beM), LJJJJI());
        C974560bT4 c974560bT42 = new C974560bT4();
        C930480aJy c930480aJy = C930480aJy.LIZ;
        C480460Ism.LIZ().getClass();
        CompetitionApi competitionApi = (CompetitionApi) C480460Ism.LIZLLL(CompetitionApi.class);
        CompetitionReplyParams competitionReplyParams = new CompetitionReplyParams();
        CompetitionCommon competitionCommon = new CompetitionCommon();
        competitionCommon.type = EnumC962960bAM.TAKE_THE_STAGE.getType();
        competitionCommon.channelId = channelId;
        competitionCommon.competitionId = this.LJIIIIZZ;
        competitionReplyParams.bizCommon = competitionCommon;
        competitionReplyParams.replyType = 2;
        C11JF c11jfLIZ = ((C0J1N) competitionApi.competitionReply(competitionReplyParams).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(this.LIZ))).LIZ(new AfS109S0300000_15(c974560bT42, this, enumC981560beM, 25), new AfS109S0300000_15(c974560bT42, this, enumC981560beM, 26));
        C11NJ c11njLJJJJIZL = LJJJJIZL();
        c930480aJy.getClass();
        c11njLJJJJIZL.LIZ(c11jfLIZ);
    }

    @Override // X.InterfaceC981630beT
    public final void LJIILJJIL(C982450bfn c982450bfn) {
        C981290bdv c981290bdv = this.LJFF;
        if (c981290bdv != null) {
            c981290bdv.LIZJ(c982450bfn.LJII, true);
        }
    }

    @Override // X.InterfaceC981630beT
    public final void LJIL(AbstractC982800bgM abstractC982800bgM) {
        if (abstractC982800bgM instanceof C983020bgi) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131851820, LJJJJJL(((C983020bgi) abstractC982800bgM).LJFF)));
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
            new C974560bT4().LJJJ(LJJJJI(), str);
        }
        LinkDialog linkDialog2 = this.LJ;
        if (linkDialog2 != null) {
            linkDialog2.dismiss();
        }
        this.LJ = null;
    }

    public final String LJJJJJL(long j) {
        MutableLiveData mutableLiveData;
        List list;
        Object next;
        C981290bdv c981290bdv = this.LJFF;
        C754570Tip c754570Tip = null;
        if (c981290bdv != null && (mutableLiveData = c981290bdv.LIZLLL) != null && (list = (List) mutableLiveData.getValue()) != null) {
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

    public C981370be3(MatchBaseWidget matchBaseWidget, InterfaceC981940bey interfaceC981940bey) {
        boolean z;
        super(matchBaseWidget, interfaceC981940bey);
        this.LIZLLL = matchBaseWidget.provideDataChannel();
        this.LJFF = (C981290bdv) matchBaseWidget.y1(C981290bdv.class);
        C20337914i1<Integer> c20337914i1 = InterfaceC960800b6s.LLLFF;
        if (c20337914i1.LIZIZ().intValue() < 3) {
            z = true;
            c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
        } else {
            z = false;
        }
        this.LJIIIZ = z;
        this.LJIIJ = AFwS203S0000000_15.get$arr$(460);
        this.LJIIJJI = AFwS250S0000000_15.get$arr$(249);
        this.LJIIL = AFwS250S0000000_15.get$arr$(251);
        this.LJIILIIL = AFwS250S0000000_15.get$arr$(250);
    }

    @Override // X.InterfaceC981630beT
    public final void LJJIJIIJI(C982870bgT c982870bgT, boolean z) {
        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131851819, LJJJJJL(c982870bgT.LJFF)));
        new C974560bT4().LJJJJ(c982870bgT);
        if (!z) {
            C981410be7.LIZ(this, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC981630beT
    public final boolean LJIIZILJ(C982480bfq c982480bfq, boolean z, boolean z2, boolean z3, AwS559S0100000_15 awS559S0100000_15, AwS594S0100000_15 awS594S0100000_15, AwS594S0100000_15 awS594S0100000_152, AwS594S0100000_15 awS594S0100000_153) {
        ArrayList arrayList;
        long j;
        long value;
        List<TakeTheStageBizExtra.PerformAnchor> list;
        TakeTheStageBizExtra.PerformAnchor performAnchor;
        EnumC977660bY4 enumC977660bY4;
        this.LJII = c982480bfq;
        this.LJIIIIZZ = c982480bfq.LIZJ.LIZJ;
        this.LJIIJ = awS559S0100000_15;
        this.LJIIJJI = awS594S0100000_15;
        this.LJIIL = awS594S0100000_152;
        this.LJIILIIL = awS594S0100000_153;
        LinkDialog linkDialog = this.LJ;
        FragmentManager fragmentManager = null;
        if (linkDialog != null && linkDialog.isVisible()) {
            LinkDialog linkDialog2 = this.LJ;
            if (linkDialog2 == null || (enumC977660bY4 = linkDialog2.LLILZIL) == null) {
                enumC977660bY4 = null;
            }
            if (enumC977660bY4 == EnumC977660bY4.TAKE_THE_STAGE_INVITEE) {
                return true;
            }
            if (linkDialog2 != null) {
                linkDialog2.dismiss();
            }
        }
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        List<C981870ber> list2 = c982480bfq.LJII;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJIJJ, 10));
        Iterator<C954460awe> it2 = listLJIJJ.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(it2.next().LJ));
        }
        if (list2 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<C981870ber> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(Long.valueOf(it3.next().LIZ));
            }
        } else {
            arrayList = null;
        }
        if (!C973560bRS.LIZIZ(arrayList2, arrayList)) {
            LJIILIIL(EnumC981560beM.HOSTS_LIST_CHANGED);
            C766270U4b.LIZLLL(2131853338);
            return false;
        }
        C981290bdv c981290bdv = this.LJFF;
        c981290bdv.LIZ = this.LIZLLL;
        c981290bdv.LIZIZ = this;
        if (z) {
            c981290bdv.onCleared();
            this.LJFF.LIZJ.setValue(listLJIJJ);
            this.LJFF.LIZJ(c982480bfq.LJI, true);
            C981290bdv c981290bdv2 = this.LJFF;
            c981290bdv2.LJIILL = z3;
            TakeTheStageBizExtra takeTheStageBizExtraLIZIZ = C982410bfj.LIZIZ(c982480bfq);
            if (takeTheStageBizExtraLIZIZ != null && (list = takeTheStageBizExtraLIZIZ.LIZ) != null && (performAnchor = (TakeTheStageBizExtra.PerformAnchor) C13LP.LJJJLZIJ(0, list)) != null) {
                j = performAnchor.userId;
            } else {
                j = 0;
            }
            c981290bdv2.LJIILJJIL = j;
            if (z2) {
                C981290bdv c981290bdv3 = this.LJFF;
                c981290bdv3.LJIIJ.setValue(Boolean.TRUE);
                InterfaceC981320bdy interfaceC981320bdy = (InterfaceC981320bdy) c981290bdv3.LIZIZ;
                if (interfaceC981320bdy != null) {
                    interfaceC981320bdy.LIZJ(1);
                }
            }
            if (LivePlazaPanelSimplifiedInfo.INSTANCE.isEnable()) {
                value = LivePlazaPanelSimplifiedTimeout.INSTANCE.timeout();
            } else {
                value = LiveCoHostTakeTheStageInviteTimeoutSetting.INSTANCE.getValue();
            }
            this.LJFF.LIZ(this.LIZLLL, value, new AwS559S0100000_15(this, 1107));
        }
        MatchBaseWidget matchBaseWidget = this.LIZ;
        long jLIZ = C158B.LIZ();
        boolean z4 = this.LJIIIZ;
        AwS559S0100000_15 awS559S0100000_152 = new AwS559S0100000_15(this, 1108);
        boolean zLJ = LJJJJJ().LJJIJIIJI.LJ();
        LinkDialog linkDialog3 = new LinkDialog(matchBaseWidget);
        EnumC977660bY4 enumC977660bY42 = EnumC977660bY4.TAKE_THE_STAGE_INVITEE;
        C979950bbl c979950bbl = new C979950bbl(matchBaseWidget, awS559S0100000_152, z4, zLJ);
        linkDialog3.LLILZIL = enumC977660bY42;
        linkDialog3.LLILZLL = c979950bbl;
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
        }
        linkDialog3.show(fragmentManager, "TakeStageInviteeCoordinator");
        DataChannel dataChannel2 = this.LIZLLL;
        if (dataChannel2 != null) {
            dataChannel2.FQ2(VWSettingsPageCloseChannel.class);
        }
        this.LJ = linkDialog3;
        new C974560bT4().LJJJI(z, LJJJJJ().LJJIJ.LJFF, LJJJJI(), C158B.LIZ() - jLIZ);
        C982480bfq c982480bfq2 = this.LJII;
        if (c982480bfq2 != null) {
            C973690bRf.LIZ.LJJIIJ(c982480bfq2.LIZJ.LIZJ, c982480bfq2.LJI, c982480bfq2.LJFF.isRematch(), C973690bRf.LJIILLIIL(), "take_stage");
        }
        return true;
    }
}
