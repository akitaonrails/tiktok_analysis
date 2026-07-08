package X;

import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionContributorInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInitiateInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionResultsTeamInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettleEnd;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionTeamBase;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionUserBase;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.CountDownForAllV2Service;
import com.bytedance.android.livesdk.game.model.UserInfo;
import com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget;
import com.bytedance.android.livesdk.grouplive.assem.icyclash.GroupLiveIcyClashAssem;
import com.bytedance.android.livesdk.grouplive.assem.mvpseat.GroupLiveMvpSeatAssem;
import com.bytedance.android.livesdk.grouplive.assem.timedcompetition.TimedCompetitionAssem;
import com.bytedance.android.livesdk.grouplive.inroomranking.panel.GroupLiveRankingPanelAssem;
import com.bytedance.android.livesdk.model.message.CompetitionScoreChange;
import com.bytedance.android.livesdk.model.message.CompetitionStart;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleEffectInfos;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoImageTransitionFragment;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoViewLargeImageDialogFragment;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.020Z, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020Z extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Z(C238400w2 c238400w2, C118300cf c118300cf, int i) {
        super(2);
        this.$t = i;
        this.l0 = c238400w2;
        this.l1 = c118300cf;
    }

    public static final Object invoke$0(C020Z c020z, Object obj, Object obj2) {
        Object c098200Yq;
        try {
            c098200Yq = C23250099c.LJ((CoroutineContext) obj, new C381001dw(((Number) obj2).longValue(), (InterfaceC381401e0) c020z.l0, c020z.l1, null));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        InterfaceC381401e0 interfaceC381401e0 = (InterfaceC381401e0) c020z.l0;
        Object obj3 = c020z.l1;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TaskExecutor#execute failed. TaskInfo{type: ");
            sbLIZ.append(interfaceC381401e0.getType());
            sbLIZ.append(", extra: ");
            sbLIZ.append(obj3);
            sbLIZ.append("}. error: ");
            sbLIZ.append(Log.getStackTraceString(thM5exceptionOrNullimpl));
            C20441214yg.LJ("AutoAdaptiveCenter", C2188811AlT.LIZIZ(sbLIZ));
        }
        return C189200o6.m1boximpl(c098200Yq);
    }

    public static final Object invoke$1(C020Z c020z, Object obj, Object obj2) {
        Object c098200Yq;
        try {
            c098200Yq = C23250099c.LJ((CoroutineContext) obj, new C381101dx(((Number) obj2).longValue(), (InterfaceC381401e0) c020z.l0, c020z.l1, null));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        InterfaceC381401e0 interfaceC381401e0 = (InterfaceC381401e0) c020z.l0;
        Object obj3 = c020z.l1;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TaskExecutor#execute failed. TaskInfo{type: ");
            sbLIZ.append(interfaceC381401e0.getType());
            sbLIZ.append(", extra: ");
            sbLIZ.append(obj3);
            sbLIZ.append("}. error: ");
            sbLIZ.append(Log.getStackTraceString(thM5exceptionOrNullimpl));
            C20441214yg.LJ("AutoAdaptiveCenter", C2188811AlT.LIZIZ(sbLIZ));
        }
        return C189200o6.m1boximpl(c098200Yq);
    }

    public static final Object invoke$10(C020Z c020z, Object obj, Object obj2) {
        int i;
        List<CompetitionTeamBase> list;
        C019M c019m = (C019M) obj2;
        C019Q c019q = c019m.LL;
        if (c019q == null) {
            i = -1;
        } else {
            i = C019P.LIZ[c019q.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    CompetitionStart competitionStart = c019m.LLILLJJLI;
                    if (competitionStart != null) {
                        GroupLiveIcyClashAssem groupLiveIcyClashAssem = (GroupLiveIcyClashAssem) c020z.l1;
                        View view = (View) c020z.l0;
                        ArrayList arrayList = new ArrayList();
                        CompetitionInitiateInfo competitionInitiateInfo = competitionStart.initiateInfo;
                        if (competitionInitiateInfo != null && (list = competitionInitiateInfo.teams) != null) {
                            for (CompetitionTeamBase competitionTeamBase : list) {
                                if (!competitionTeamBase.users.isEmpty()) {
                                    arrayList.add(competitionTeamBase);
                                }
                            }
                        }
                        if (arrayList.size() == 2) {
                            groupLiveIcyClashAssem.Go(competitionStart.gameplayOption, competitionStart.effectInfos, view, ((CompetitionUserBase) ListProtector.get(((CompetitionTeamBase) ListProtector.get(arrayList, 0)).users, 0)).userId, ((CompetitionUserBase) ListProtector.get(((CompetitionTeamBase) ListProtector.get(arrayList, 1)).users, 0)).userId, c019m.LLILZ);
                        }
                    }
                }
            } else {
                C500260Jjc.LJIILIIL((View) c020z.l0);
            }
            return Unit.LIZ;
        }
        if (i != 3) {
            if (i == 4) {
                GroupLiveIcyClashAssem groupLiveIcyClashAssem2 = (GroupLiveIcyClashAssem) c020z.l1;
                View view2 = (View) c020z.l0;
                groupLiveIcyClashAssem2.getClass();
                C20441214yg.LIZIZ("GroupLiveIcyClashAssem", "destroyIcyClashEffect: ");
                C500260Jjc.LJIILIIL(view2);
                C019N c019n = groupLiveIcyClashAssem2.LLJI;
                if (c019n != null) {
                    c019n.LIZIZ();
                }
                groupLiveIcyClashAssem2.LLJI = null;
            }
        } else {
            CompetitionScoreChange competitionScoreChange = c019m.LLILLL;
            if (competitionScoreChange != null) {
                GroupLiveIcyClashAssem groupLiveIcyClashAssem3 = (GroupLiveIcyClashAssem) c020z.l1;
                BattleEffectInfos battleEffectInfos = competitionScoreChange.effectInfos;
                groupLiveIcyClashAssem3.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateIcyClashEffect: effectInfos = ");
                sbLIZ.append(battleEffectInfos);
                C20441214yg.LIZIZ("GroupLiveIcyClashAssem", C2188811AlT.LIZIZ(sbLIZ));
                C019N c019n2 = groupLiveIcyClashAssem3.LLJI;
                if (c019n2 != null) {
                    c019n2.LIZ(battleEffectInfos);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(C020Z c020z, Object obj, Object obj2) {
        InterfaceC2855018r interfaceC2855018r;
        InterfaceC2855018r interfaceC2855018r2;
        CompetitionSettleEnd competitionSettleEnd;
        final C081000Sa c081000Sa = (C081000Sa) obj2;
        C00SX c00sx = c081000Sa.LL;
        if (c00sx != null) {
            int i = C00SZ.LIZ[c00sx.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (competitionSettleEnd = c081000Sa.LLILZ) != null) {
                            GroupLiveMvpSeatAssem groupLiveMvpSeatAssem = (GroupLiveMvpSeatAssem) c020z.l1;
                            View view = (View) c020z.l0;
                            if (competitionSettleEnd.reason == 2) {
                                C11JF c11jf = groupLiveMvpSeatAssem.LLJJIJIL;
                                if (c11jf != null) {
                                    c11jf.dispose();
                                }
                                groupLiveMvpSeatAssem.LLJJIJIL = (C11JF) C11NZ.LJLJJLL(3L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLL(new C516701zp(groupLiveMvpSeatAssem, competitionSettleEnd, view, 9), new C516701zp(groupLiveMvpSeatAssem, competitionSettleEnd, view, 10));
                            } else {
                                groupLiveMvpSeatAssem.Ho(competitionSettleEnd, view);
                            }
                        }
                    } else {
                        CompetitionScoreChange competitionScoreChange = c081000Sa.LLILLL;
                        if (competitionScoreChange != null) {
                            GroupLiveMvpSeatAssem groupLiveMvpSeatAssem2 = (GroupLiveMvpSeatAssem) c020z.l1;
                            if (!competitionScoreChange.teamInfos.isEmpty()) {
                                if (!((CompetitionResultsTeamInfo) ListProtector.get(competitionScoreChange.teamInfos, 0)).contributors.isEmpty()) {
                                    List<CompetitionContributorInfo> list = ((CompetitionResultsTeamInfo) ListProtector.get(competitionScoreChange.teamInfos, 0)).contributors;
                                    groupLiveMvpSeatAssem2.LLJJ = list;
                                    if (list != null && (interfaceC2855018r2 = groupLiveMvpSeatAssem2.LLJI) != null) {
                                        interfaceC2855018r2.LIZ(list);
                                    }
                                }
                                if (competitionScoreChange.teamInfos.size() > 1 && (!((CompetitionResultsTeamInfo) ListProtector.get(competitionScoreChange.teamInfos, 1)).contributors.isEmpty())) {
                                    List<CompetitionContributorInfo> list2 = ((CompetitionResultsTeamInfo) ListProtector.get(competitionScoreChange.teamInfos, 1)).contributors;
                                    groupLiveMvpSeatAssem2.LLJJI = list2;
                                    if (list2 != null && (interfaceC2855018r = groupLiveMvpSeatAssem2.LLJI) != null) {
                                        interfaceC2855018r.LJ(list2);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    InterfaceC2855018r interfaceC2855018r3 = ((GroupLiveMvpSeatAssem) c020z.l1).LLJI;
                    if (interfaceC2855018r3 != null) {
                        interfaceC2855018r3.stop();
                    }
                    List<CompetitionContributorInfo> list3 = ((GroupLiveMvpSeatAssem) c020z.l1).LLJJ;
                    if (list3 != null) {
                        list3.clear();
                    }
                    List<CompetitionContributorInfo> list4 = ((GroupLiveMvpSeatAssem) c020z.l1).LLJJI;
                    if (list4 != null) {
                        list4.clear();
                    }
                    C11JF c11jf2 = ((GroupLiveMvpSeatAssem) c020z.l1).LLJJIJIL;
                    if (c11jf2 != null) {
                        c11jf2.dispose();
                    }
                    final GroupLiveMvpSeatAssem groupLiveMvpSeatAssem3 = (GroupLiveMvpSeatAssem) c020z.l1;
                    groupLiveMvpSeatAssem3.LLJJIJIL = null;
                    final CompetitionStart competitionStart = c081000Sa.LLILLJJLI;
                    if (competitionStart != null) {
                        final View view2 = (View) c020z.l0;
                        long jLIZJ = competitionStart.endTimestamp - (C963140bAe.LIZJ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                        EnumC2856018s enumC2856018s = groupLiveMvpSeatAssem3.LLJJIJI;
                        EnumC2856018s enumC2856018s2 = EnumC2856018s.HIDDEN;
                        if (enumC2856018s == enumC2856018s2) {
                            if (jLIZJ > 0) {
                                C500260Jjc.LLFFF(view2);
                                groupLiveMvpSeatAssem3.Go(competitionStart, c081000Sa.LLILZLL);
                            }
                        } else {
                            C11JF c11jf3 = groupLiveMvpSeatAssem3.LLJJIJIL;
                            if (c11jf3 != null) {
                                c11jf3.dispose();
                            }
                            groupLiveMvpSeatAssem3.LLJJIJIL = null;
                            groupLiveMvpSeatAssem3.LLJJIJI = enumC2856018s2;
                            C500260Jjc.LJIILIIL(view2);
                            if (jLIZJ > 1) {
                                C473410IhP.LIZJ(new Runnable() { // from class: X.018p
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("GroupLiveMvpSeatAssem@92f0.initObservers$1$1$1");
                                        try {
                                            C500260Jjc.LLFFF(view2);
                                            groupLiveMvpSeatAssem3.Go(competitionStart, c081000Sa.LLILZLL);
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("GroupLiveMvpSeatAssem@92f0.initObservers$1$1$1");
                                    }
                                }, 1000L);
                            }
                        }
                    }
                }
            } else {
                C500260Jjc.LJIILIIL((View) c020z.l0);
                InterfaceC2855018r interfaceC2855018r4 = ((GroupLiveMvpSeatAssem) c020z.l1).LLJI;
                if (interfaceC2855018r4 != null) {
                    interfaceC2855018r4.stop();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(C020Z c020z, Object obj, Object obj2) {
        int i;
        C20600815jK<InterfaceC1891350zJl> state;
        AbstractC2863018z abstractC2863018z = (AbstractC2863018z) obj2;
        if (Intrinsics.LJFF(abstractC2863018z, AnonymousClass0191.LIZJ)) {
            C500260Jjc.LJIILIIL((View) c020z.l0);
        } else if (abstractC2863018z instanceof C2862018y) {
            GroupLiveRankingPanelAssem groupLiveRankingPanelAssem = (GroupLiveRankingPanelAssem) c020z.l1;
            View view = (View) c020z.l0;
            C2862018y c2862018y = (C2862018y) abstractC2863018z;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = groupLiveRankingPanelAssem.LLJ;
            if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                state.LJIILL(c2862018y.LJ, null);
            }
            if (view.getVisibility() != 0) {
                AbstractC2863018z abstractC2863018z2 = groupLiveRankingPanelAssem.Go().getState().LL;
                if (abstractC2863018z2 instanceof C2862018y) {
                    i = ((C2862018y) abstractC2863018z2).LJFF;
                } else {
                    i = 0;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("group_live_ranking_widget_show");
                c474500IjALIZ.LJJII(Integer.valueOf(i), "online_group_member_cnt");
                c474500IjALIZ.LIZ();
            }
            C500260Jjc.LLFFF(view);
        } else if (abstractC2863018z instanceof C2861018x) {
            GroupLiveRankingPanelAssem groupLiveRankingPanelAssem2 = (GroupLiveRankingPanelAssem) c020z.l1;
            View view2 = (View) c020z.l0;
            groupLiveRankingPanelAssem2.getClass();
            C500260Jjc.LJIILIIL(view2);
            C389001fE.LIZ("grouplive_member_ranking_end", null, System.currentTimeMillis(), false);
            C766270U4b.LJIIIIZZ(3000L, C497740JfY.LJII(), ((C2861018x) abstractC2863018z).LJ);
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(C020Z c020z, Object obj, Object obj2) {
        if (obj2 != null) {
            Function2 function2 = (Function2) c020z.l0;
            if (!((CountDownForAllV2Service) c020z.l1).LJFF()) {
                obj = "";
            }
            function2.invoke(obj, obj2);
        } else {
            ((Function2) c020z.l0).invoke("", null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C020Z c020z, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("| ");
        sbLIZ.append(C0KVU.LIZLLL((User) c020z.l0));
        sbLIZ.append(": ");
        spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
        spannableStringBuilder.append((CharSequence) obj);
        ((TextView) c020z.l1).setText(spannableStringBuilder);
        return Unit.LIZ;
    }

    public static final Object invoke$4(C020Z c020z, Object obj, Object obj2) throws JSONException {
        String strLJFF;
        JSONObject jSONObject = (JSONObject) obj;
        C766270U4b.LIZLLL(2131840931);
        ((GamePartnershipGamePinCardWidget) c020z.l0).LLJILJIL = (UserInfo) obj2;
        InterfaceC1107590evd interfaceC1107590evd = ((C262100zr) c020z.l1).LIZIZ;
        Integer numValueOf = null;
        if (interfaceC1107590evd != null) {
            strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "taskId", "");
        } else {
            strLJFF = null;
        }
        JSONObject jSONObjectPut = jSONObject.put("taskId", strLJFF);
        InterfaceC1107590evd interfaceC1107590evd2 = ((C262100zr) c020z.l1).LIZIZ;
        if (interfaceC1107590evd2 != null) {
            numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd2, "isLiving", 0));
        }
        C389001fE.LIZ("gamePartnershipFinishFillAge", jSONObjectPut.put("isLiving", numValueOf), System.currentTimeMillis(), false);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(X.C020Z r33, java.lang.Object r34, java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C020Z.invoke$5(X.020Z, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$6(C020Z c020z, Object obj, Object obj2) {
        LinkedHashMap linkedHashMap;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((C013C) c020z.l0).element = zBooleanValue;
        HashMap<String, String> map = ((TakoImageTransitionFragment) c020z.l1).LLJILJIL;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put("source", "post_panel");
            linkedHashMap.put("media_type", "image");
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        C1862330yYx.LJJIL(C1862330yYx.LIZ, linkedHashMap, zBooleanValue);
        return Unit.LIZ;
    }

    public static final Object invoke$7(C020Z c020z, Object obj, Object obj2) {
        LinkedHashMap linkedHashMap;
        Object objLJJJLL;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((C013C) c020z.l0).element = zBooleanValue;
        Map<String, String> map = ((TakoViewLargeImageDialogFragment) c020z.l1).LLIZ;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
            TakoViewLargeImageDialogFragment takoViewLargeImageDialogFragment = (TakoViewLargeImageDialogFragment) c020z.l1;
            linkedHashMap.put("message_id", takoViewLargeImageDialogFragment.LLILLJJLI);
            List<String> list = takoViewLargeImageDialogFragment.LL;
            if (list != null) {
                objLJJJLL = C13LP.LJJJLL(list);
            } else {
                objLJJJLL = null;
            }
            linkedHashMap.put("url", objLJJJLL);
            linkedHashMap.put("source", "post_panel");
            linkedHashMap.put("media_type", "image");
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        C1862330yYx.LJJIL(C1862330yYx.LIZ, linkedHashMap, zBooleanValue);
        return Unit.LIZ;
    }

    public static final Object invoke$8(C020Z c020z, Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        int iIntValue = ((Number) obj2).intValue();
        ((C238400w2) c020z.l0).element = jLongValue;
        ((C118300cf) c020z.l1).element = iIntValue;
        return Unit.LIZ;
    }

    public static final Object invoke$9(C020Z c020z, Object obj, Object obj2) {
        if (Intrinsics.LJFF(obj2, ((Function0) c020z.l0).invoke())) {
            ((Function0) c020z.l1).invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Z(C013C c013c, TakoImageTransitionFragment takoImageTransitionFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = takoImageTransitionFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Z(C013C c013c, TakoViewLargeImageDialogFragment takoViewLargeImageDialogFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = takoViewLargeImageDialogFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Z(View view, GroupLiveIcyClashAssem groupLiveIcyClashAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = groupLiveIcyClashAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Z(View view, GroupLiveMvpSeatAssem groupLiveMvpSeatAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = groupLiveMvpSeatAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Z(View view, TimedCompetitionAssem timedCompetitionAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = timedCompetitionAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Z(View view, GroupLiveRankingPanelAssem groupLiveRankingPanelAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = groupLiveRankingPanelAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Z(User user, TextView textView, int i) {
        super(2);
        this.$t = i;
        this.l0 = user;
        this.l1 = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020Z(GamePartnershipGamePinCardWidget gamePartnershipGamePinCardWidget, C262100zr c262100zr, int i) {
        super(2);
        this.$t = i;
        this.l0 = gamePartnershipGamePinCardWidget;
        this.l1 = c262100zr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020Z(Function0 function0, Function0<String> function02, Function0<Unit> function03) {
        super(2);
        this.$t = function03;
        this.l0 = function0;
        this.l1 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020Z(Function2 function2, Function2<? super String, ? super LiveEffect, Unit> function22, CountDownForAllV2Service<VM> countDownForAllV2Service) {
        super(2);
        this.$t = countDownForAllV2Service;
        this.l0 = function2;
        this.l1 = function22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020Z(C380401dq c380401dq, C380401dq c380401dq2, InterfaceC381401e0<T, R> interfaceC381401e0, T t) {
        super(2);
        this.$t = t;
        this.l0 = c380401dq2;
        this.l1 = interfaceC381401e0;
    }
}
