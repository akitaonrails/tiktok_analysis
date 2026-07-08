package X;

import com.bytedance.android.live.liveinteract.competition.core.model.bizextra.TakeTheStageBizExtra;
import com.bytedance.android.live.liveinteract.competition.model.BeansInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionContributorInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionFinish;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionFinishResponse;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInitiateResponse;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionLeaveResponse;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionReply;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionReplyResponse;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionResultsTeamInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettleEnd;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettlementEndResponse;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSwitchTurn;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionTeamBase;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionTeamMemberInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionUserBase;
import com.bytedance.android.live.liveinteract.competition.model.TakeTheStageInfo;
import com.bytedance.android.live.liveinteract.competition.model.TakeTheStageOrderInfo;
import com.bytedance.android.livesdk.model.message.CompetitionMessage;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTask;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0bfm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982440bfm {
    public static final /* synthetic */ int LIZ = 0;

    public static CompetitionMessage LIZ(AbstractC982800bgM abstractC982800bgM) {
        Object obj = abstractC982800bgM.LIZIZ;
        if (obj instanceof CompetitionMessage) {
            return (CompetitionMessage) obj;
        }
        CompetitionMessage competitionMessage = new CompetitionMessage();
        CommonMessageData commonMessageData = new CommonMessageData();
        competitionMessage.baseMessage = commonMessageData;
        commonMessageData.messageId = abstractC982800bgM.LIZ;
        competitionMessage.type = abstractC982800bgM.LJ.getType();
        CompetitionCommon competitionCommon = new CompetitionCommon();
        competitionCommon.type = abstractC982800bgM.LIZJ.LIZ.getType();
        C982690bgB c982690bgB = abstractC982800bgM.LIZJ;
        competitionCommon.channelId = c982690bgB.LIZIZ;
        competitionCommon.competitionId = c982690bgB.LIZJ;
        competitionMessage.bizCommon = competitionCommon;
        return competitionMessage;
    }

    public static C982690bgB LIZIZ(CompetitionCommon competitionCommon) {
        if (competitionCommon == null) {
            return C982690bgB.LIZLLL;
        }
        C962950bAL c962950bAL = EnumC962960bAM.Companion;
        Integer numValueOf = Integer.valueOf(competitionCommon.type);
        c962950bAL.getClass();
        return new C982690bgB(C962950bAL.LIZIZ(numValueOf), competitionCommon.channelId, competitionCommon.competitionId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C982460bfo LIZLLL(CompetitionInfo competitionInfo) {
        C470590Icr c470590Icr = new C470590Icr();
        c470590Icr.LIZIZ = "-10000";
        c470590Icr.data = competitionInfo;
        return LJIIIZ(c470590Icr);
    }

    public static List LJ(List list) {
        long j;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                CompetitionContributorInfo competitionContributorInfo = (CompetitionContributorInfo) it2.next();
                CompetitionUserBase competitionUserBase = competitionContributorInfo.user;
                if (competitionUserBase != null) {
                    j = competitionUserBase.userId;
                } else {
                    j = 0;
                }
                arrayList.add(new C01BH(j, competitionContributorInfo.score, competitionContributorInfo.avatar));
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static Map LJFF(Map map) {
        if (map.isEmpty()) {
            return C2097608Jq.LJ();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Long lValueOf = Long.valueOf(((Number) entry.getKey()).longValue());
            C983330bhD c983330bhD = EnumC982730bgF.Companion;
            Integer num = (Integer) entry.getValue();
            c983330bhD.getClass();
            arrayList.add(new Pair(lValueOf, C983330bhD.LIZ(num)));
        }
        return C2097608Jq.LJIILLIIL(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.AbstractC982800bgM LJII(com.bytedance.android.livesdk.model.message.CompetitionMessage r35) {
        /*
            Method dump skipped, instruction units count: 1591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C982440bfm.LJII(com.bytedance.android.livesdk.model.message.CompetitionMessage):X.0bgM");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIIIZZ(C470590Icr c470590Icr) {
        C983360bhG c983360bhG = new C983360bhG();
        c983360bhG.LIZ = c470590Icr.LIZIZ;
        T t = c470590Icr.data;
        c983360bhG.LIZIZ = t;
        CompetitionFinish competitionFinish = ((CompetitionFinishResponse.ResponseData) t).finishInfo;
        if (competitionFinish != null) {
            c983360bhG.LJ = new C981540beK(c983360bhG.LIZJ.LIZ, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, competitionFinish.competitionFinishTime, 1534);
            C983530bhX c983530bhX = EnumC982750bgH.Companion;
            Integer numValueOf = Integer.valueOf(competitionFinish.reason);
            c983530bhX.getClass();
            c983360bhG.LJFF = C983530bhX.LIZ(numValueOf);
            CompetitionUserBase competitionUserBase = competitionFinish.leaveUser;
            if (competitionUserBase != null) {
                c983360bhG.LJI = competitionUserBase.userId;
            }
        }
        new C982550bfx(c983360bhG).LIZ(c983360bhG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List<X.0ber>] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    public static C982460bfo LJIIIZ(C470590Icr c470590Icr) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        EnumC982500bfs enumC982500bfsLIZ;
        ?? arrayList;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        CompetitionUserBase competitionUserBase;
        Integer numValueOf4;
        ArrayList arrayList2;
        List<TakeTheStageOrderInfo.AnchorInfo> list;
        Integer numValueOf5;
        Integer numValueOf6;
        C982560bfy c982560bfy = new C982560bfy();
        c982560bfy.LIZ = c470590Icr.LIZIZ;
        Object obj = c470590Icr.data;
        c982560bfy.LIZIZ = obj;
        c982560bfy.LIZJ = LIZIZ(((CompetitionInfo) obj).bizCommon);
        CompetitionInfo competitionInfo = (CompetitionInfo) c470590Icr.data;
        if (competitionInfo != null) {
            CompetitionCommon competitionCommon = competitionInfo.bizCommon;
            if (competitionCommon != null) {
                numValueOf = Integer.valueOf(competitionCommon.type);
            } else {
                numValueOf = null;
            }
            int type = EnumC919170a1j.MATCH_TYPE_CATCH_BEANS.getType();
            if (numValueOf != null && numValueOf.intValue() == type) {
                CompetitionCommon competitionCommon2 = competitionInfo.bizCommon;
                if (competitionCommon2 != null) {
                    numValueOf5 = Integer.valueOf(competitionCommon2.type);
                } else {
                    numValueOf5 = null;
                }
                BeansInfo beansInfo = competitionInfo.beansInfo;
                if (beansInfo != null) {
                    numValueOf6 = Integer.valueOf(beansInfo.status);
                } else {
                    numValueOf6 = null;
                }
                c982560bfy.LJ = LIZJ(numValueOf5, numValueOf6);
            } else {
                int type2 = EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE.getType();
                if (numValueOf != null && numValueOf.intValue() == type2) {
                    CompetitionCommon competitionCommon3 = competitionInfo.bizCommon;
                    if (competitionCommon3 != null) {
                        numValueOf2 = Integer.valueOf(competitionCommon3.type);
                    } else {
                        numValueOf2 = null;
                    }
                    TakeTheStageInfo takeTheStageInfo = competitionInfo.takeTheStageInfo;
                    if (takeTheStageInfo != null) {
                        numValueOf3 = Integer.valueOf(takeTheStageInfo.takeTheStageStatus);
                    } else {
                        numValueOf3 = null;
                    }
                    c982560bfy.LJ = LIZJ(numValueOf2, numValueOf3);
                }
            }
            EnumC974260bSa enumC974260bSa = c982560bfy.LJ;
            List<CompetitionResultsTeamInfo> list2 = competitionInfo.teamInfos;
            if (enumC974260bSa != EnumC974260bSa.PUNISH) {
                enumC982500bfsLIZ = EnumC982500bfs.UNKNOWN;
            } else {
                Iterator<CompetitionResultsTeamInfo> it2 = list2.iterator();
                loop2: while (true) {
                    if (it2.hasNext()) {
                        CompetitionResultsTeamInfo next = it2.next();
                        Iterator<CompetitionTeamMemberInfo> it3 = next.members.iterator();
                        while (it3.hasNext()) {
                            CompetitionUserBase competitionUserBase2 = it3.next().user;
                            if (competitionUserBase2 != null && competitionUserBase2.userId == C950220apo.LJ()) {
                                C983410bhL c983410bhL = EnumC982500bfs.Companion;
                                Integer numValueOf7 = Integer.valueOf(next.result);
                                c983410bhL.getClass();
                                enumC982500bfsLIZ = C983410bhL.LIZ(numValueOf7);
                                break loop2;
                            }
                        }
                    } else {
                        enumC982500bfsLIZ = EnumC982500bfs.UNKNOWN;
                        break;
                    }
                }
            }
            c982560bfy.LJFF = enumC982500bfsLIZ;
            List<CompetitionResultsTeamInfo> list3 = competitionInfo.teamInfos;
            if (list3 != null && !list3.isEmpty() && 0 == 0) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                for (CompetitionResultsTeamInfo competitionResultsTeamInfo : list3) {
                    arrayList.add(new C981870ber(competitionResultsTeamInfo.teamId, LJIILLIIL(competitionResultsTeamInfo.members)));
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            c982560bfy.LJI = arrayList;
            c982560bfy.LJII = LJIJ("RespInfo", competitionInfo.teamInfos);
            BeansInfo beansInfo2 = competitionInfo.beansInfo;
            if (beansInfo2 != null) {
                EnumC962960bAM enumC962960bAM = c982560bfy.LIZJ.LIZ;
                long j6 = beansInfo2.startTimestamp;
                long j7 = beansInfo2.endTimestamp;
                c982560bfy.LJIIIIZZ = new C981540beK(enumC962960bAM, j6, 0L, 0L, 0L, j7, 0L, beansInfo2.actualEndTimestamp - j7, 0L, beansInfo2.plannedFinishTime, 1372);
            }
            c982560bfy.LJIIIZ = ((CompetitionInfo) c470590Icr.data).abInfos;
            TakeTheStageInfo takeTheStageInfo2 = competitionInfo.takeTheStageInfo;
            if (takeTheStageInfo2 != null) {
                EnumC962960bAM enumC962960bAM2 = c982560bfy.LIZJ.LIZ;
                long j8 = takeTheStageInfo2.takeTheStageStartTime;
                TakeTheStageInfo.StartedInfo startedInfo = takeTheStageInfo2.startedInfo;
                if (startedInfo != null) {
                    j = startedInfo.performanceStartTime;
                    j2 = startedInfo.plannedPerformanceEndTime;
                } else {
                    j = 0;
                    j2 = 0;
                }
                TakeTheStageInfo.FinalCallInfo finalCallInfo = takeTheStageInfo2.finalCallInfo;
                if (finalCallInfo != null) {
                    j3 = finalCallInfo.plannedSettlementEndTime;
                    j4 = finalCallInfo.extraTimeInterval;
                } else {
                    j3 = 0;
                    j4 = 0;
                }
                TakeTheStageInfo.VictoryLapInfo victoryLapInfo = takeTheStageInfo2.victoryLapInfo;
                if (victoryLapInfo != null) {
                    j5 = victoryLapInfo.plannedFinishTime;
                } else {
                    j5 = 0;
                }
                c982560bfy.LJIIIIZZ = new C981540beK(enumC962960bAM2, j8, j, j2, 0L, j3, 0L, j4, 0L, j5, 1360);
                TakeTheStageInfo takeTheStageInfo3 = competitionInfo.takeTheStageInfo;
                TakeTheStageBizExtra takeTheStageBizExtra = new TakeTheStageBizExtra();
                if (takeTheStageInfo3 != null) {
                    takeTheStageBizExtra.takeTheStageStatus = LIZJ(Integer.valueOf(EnumC962960bAM.TAKE_THE_STAGE.getType()), Integer.valueOf(takeTheStageInfo3.takeTheStageStatus));
                    takeTheStageBizExtra.takeTheStageStartTime = takeTheStageInfo3.takeTheStageStartTime;
                    TakeTheStageInfo.StartedInfo startedInfo2 = takeTheStageInfo3.startedInfo;
                    if (startedInfo2 != null) {
                        TakeTheStageOrderInfo takeTheStageOrderInfo = startedInfo2.orderInfo;
                        if (takeTheStageOrderInfo != null) {
                            competitionUserBase = takeTheStageOrderInfo.initiator;
                        } else {
                            competitionUserBase = null;
                        }
                        takeTheStageBizExtra.initiator = LJIJI(competitionUserBase);
                        C983430bhN c983430bhN = EnumC982900bgW.Companion;
                        TakeTheStageOrderInfo takeTheStageOrderInfo2 = startedInfo2.orderInfo;
                        if (takeTheStageOrderInfo2 != null) {
                            numValueOf4 = Integer.valueOf(takeTheStageOrderInfo2.switchTurnReason);
                        } else {
                            numValueOf4 = null;
                        }
                        c983430bhN.getClass();
                        takeTheStageBizExtra.switchTurnReason = C983430bhN.LIZ(numValueOf4);
                        TakeTheStageOrderInfo takeTheStageOrderInfo3 = startedInfo2.orderInfo;
                        if (takeTheStageOrderInfo3 != null && (list = takeTheStageOrderInfo3.anchors) != null) {
                            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
                            for (TakeTheStageOrderInfo.AnchorInfo anchorInfo : list) {
                                TakeTheStageBizExtra.PerformAnchor performAnchor = new TakeTheStageBizExtra.PerformAnchor();
                                performAnchor.userId = anchorInfo.userId;
                                performAnchor.defaultOrder = anchorInfo.defaultOrder;
                                arrayList3.add(performAnchor);
                            }
                            arrayList2 = new ArrayList(arrayList3);
                        } else {
                            arrayList2 = new ArrayList();
                        }
                        takeTheStageBizExtra.LIZ = arrayList2;
                        TakeTheStageBizExtra.StartedInfo startedInfo3 = new TakeTheStageBizExtra.StartedInfo();
                        startedInfo3.performanceStartTime = startedInfo2.performanceStartTime;
                        takeTheStageBizExtra.startedInfo = startedInfo3;
                    }
                    TakeTheStageInfo.FinalCallInfo finalCallInfo2 = takeTheStageInfo3.finalCallInfo;
                    if (finalCallInfo2 != null) {
                        TakeTheStageBizExtra.FinalCallInfo finalCallInfo3 = new TakeTheStageBizExtra.FinalCallInfo();
                        finalCallInfo3.plannedSettlementEndTime = finalCallInfo2.plannedSettlementEndTime;
                        finalCallInfo3.extraTimeInterval = finalCallInfo2.extraTimeInterval;
                        takeTheStageBizExtra.finalCallInfo = finalCallInfo3;
                    }
                    TakeTheStageInfo.VictoryLapInfo victoryLapInfo2 = takeTheStageInfo3.victoryLapInfo;
                    if (victoryLapInfo2 != null) {
                        TakeTheStageBizExtra.VictoryLapInfo victoryLapInfo3 = new TakeTheStageBizExtra.VictoryLapInfo();
                        victoryLapInfo3.plannedFinishTime = victoryLapInfo2.plannedFinishTime;
                        takeTheStageBizExtra.victoryLapInfo = victoryLapInfo3;
                    }
                    takeTheStageBizExtra.takeTheStageVersion = takeTheStageInfo3.takeTheStageVersion;
                    takeTheStageBizExtra.defaultOrders = takeTheStageInfo3.defaultOrders;
                }
                c982560bfy.LIZLLL = takeTheStageBizExtra;
            }
            BattleTask battleTask = competitionInfo.battleTask;
            if (battleTask != null) {
                c982560bfy.LJIIJ = battleTask;
            }
        }
        C982460bfo c982460bfo = new C982460bfo(c982560bfy);
        c982460bfo.LIZ(c982560bfy);
        return c982460bfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C982610bg3 LJIIJ(C470590Icr c470590Icr) {
        C983250bh5 c983250bh5 = new C983250bh5();
        c983250bh5.LIZ = c470590Icr.LIZIZ;
        T t = c470590Icr.data;
        c983250bh5.LIZIZ = t;
        c983250bh5.LIZJ = LIZIZ(((CompetitionInitiateResponse.ResponseData) t).bizCommon);
        CompetitionInitiateResponse.ResponseData responseData = (CompetitionInitiateResponse.ResponseData) c470590Icr.data;
        if (responseData != null) {
            c983250bh5.LJ = LJIIZILJ(responseData.teams);
            C983330bhD c983330bhD = EnumC982730bgF.Companion;
            Integer numValueOf = Integer.valueOf(responseData.inviterGiftPermissionType);
            c983330bhD.getClass();
            c983250bh5.LJFF = C983330bhD.LIZ(numValueOf);
        }
        C982610bg3 c982610bg3 = new C982610bg3(c983250bh5);
        c982610bg3.LIZ(c983250bh5);
        return c982610bg3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C982600bg2 LJIIJJI(C470590Icr c470590Icr) {
        C983260bh6 c983260bh6 = new C983260bh6();
        c983260bh6.LIZ = c470590Icr.LIZIZ;
        T t = c470590Icr.data;
        c983260bh6.LIZIZ = t;
        c983260bh6.LIZJ = LIZIZ(((CompetitionLeaveResponse.ResponseData) t).bizCommon);
        CompetitionLeaveResponse.ResponseData responseData = (CompetitionLeaveResponse.ResponseData) c470590Icr.data;
        c983260bh6.LJ = LJIJ("RespLeaveLinkMic", responseData.teamInfos);
        c983260bh6.LJFF = LJIJJ(responseData.teamInfos);
        C982600bg2 c982600bg2 = new C982600bg2(c983260bh6);
        c982600bg2.LIZ(c983260bh6);
        return c982600bg2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C982590bg1 LJIIL(C470590Icr c470590Icr) {
        C983120bgs c983120bgs = new C983120bgs();
        c983120bgs.LIZ = c470590Icr.LIZIZ;
        T t = c470590Icr.data;
        c983120bgs.LIZIZ = t;
        c983120bgs.LIZJ = LIZIZ(((CompetitionReplyResponse.ResponseData) t).bizCommon);
        CompetitionReplyResponse.ResponseData responseData = (CompetitionReplyResponse.ResponseData) c470590Icr.data;
        if (responseData != null) {
            c983120bgs.LIZLLL = LJIILJJIL(responseData.takeTheStageBiz);
            c983120bgs.LJFF = responseData.abInfos;
        }
        C982590bg1 c982590bg1 = new C982590bg1(c983120bgs);
        c982590bg1.LIZ(c983120bgs);
        return c982590bg1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C982510bft LJIILIIL(C470590Icr c470590Icr) {
        C983070bgn c983070bgn = new C983070bgn();
        c983070bgn.LIZ = c470590Icr.LIZIZ;
        T t = c470590Icr.data;
        c983070bgn.LIZIZ = t;
        c983070bgn.LIZJ = LIZIZ(((CompetitionSettlementEndResponse.ResponseData) t).bizCommon);
        CompetitionSettleEnd competitionSettleEnd = ((CompetitionSettlementEndResponse.ResponseData) c470590Icr.data).settleEnd;
        if (competitionSettleEnd != null) {
            c983070bgn.LJ = LJIJJ(competitionSettleEnd.teamInfos);
            c983070bgn.LJFF = LJIJ("RespSettlementEnd", competitionSettleEnd.teamInfos);
            c983070bgn.LJI = new C981540beK(c983070bgn.LIZJ.LIZ, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, competitionSettleEnd.plannedFinishTime, 1534);
        }
        C982510bft c982510bft = new C982510bft(c983070bgn);
        c982510bft.LIZ(c983070bgn);
        return c982510bft;
    }

    public static TakeTheStageBizExtra LJIILJJIL(CompetitionReply.TakeTheStageBiz takeTheStageBiz) {
        ArrayList arrayList;
        TakeTheStageBizExtra takeTheStageBizExtra = new TakeTheStageBizExtra();
        if (takeTheStageBiz != null) {
            takeTheStageBizExtra.takeTheStageStatus = LIZJ(Integer.valueOf(EnumC962960bAM.TAKE_THE_STAGE.getType()), Integer.valueOf(takeTheStageBiz.takeTheStageStatus));
            List<CompetitionReply.TakeTheStageBiz.AnchorInfo> list = takeTheStageBiz.anchors;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (CompetitionReply.TakeTheStageBiz.AnchorInfo anchorInfo : list) {
                    TakeTheStageBizExtra.PerformAnchor performAnchor = new TakeTheStageBizExtra.PerformAnchor();
                    performAnchor.userId = anchorInfo.userId;
                    performAnchor.defaultOrder = anchorInfo.defaultOrder;
                    arrayList2.add(performAnchor);
                }
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = new ArrayList();
            }
            takeTheStageBizExtra.LIZ = arrayList;
            TakeTheStageBizExtra.StartedInfo startedInfo = new TakeTheStageBizExtra.StartedInfo();
            startedInfo.performanceStartTime = takeTheStageBiz.performanceStartTime;
            takeTheStageBizExtra.startedInfo = startedInfo;
        }
        return takeTheStageBizExtra;
    }

    public static TakeTheStageBizExtra LJIILL(CompetitionSwitchTurn.TakeTheStageBiz takeTheStageBiz) {
        CompetitionUserBase competitionUserBase;
        ArrayList arrayList;
        List<TakeTheStageOrderInfo.AnchorInfo> list;
        TakeTheStageBizExtra takeTheStageBizExtra = new TakeTheStageBizExtra();
        if (takeTheStageBiz != null) {
            takeTheStageBizExtra.takeTheStageStatus = EnumC974260bSa.START;
            TakeTheStageOrderInfo takeTheStageOrderInfo = takeTheStageBiz.orderInfo;
            Integer numValueOf = null;
            if (takeTheStageOrderInfo != null) {
                competitionUserBase = takeTheStageOrderInfo.initiator;
            } else {
                competitionUserBase = null;
            }
            takeTheStageBizExtra.initiator = LJIJI(competitionUserBase);
            C983430bhN c983430bhN = EnumC982900bgW.Companion;
            TakeTheStageOrderInfo takeTheStageOrderInfo2 = takeTheStageBiz.orderInfo;
            if (takeTheStageOrderInfo2 != null) {
                numValueOf = Integer.valueOf(takeTheStageOrderInfo2.switchTurnReason);
            }
            c983430bhN.getClass();
            takeTheStageBizExtra.switchTurnReason = C983430bhN.LIZ(numValueOf);
            TakeTheStageOrderInfo takeTheStageOrderInfo3 = takeTheStageBiz.orderInfo;
            if (takeTheStageOrderInfo3 != null && (list = takeTheStageOrderInfo3.anchors) != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (TakeTheStageOrderInfo.AnchorInfo anchorInfo : list) {
                    TakeTheStageBizExtra.PerformAnchor performAnchor = new TakeTheStageBizExtra.PerformAnchor();
                    performAnchor.userId = anchorInfo.userId;
                    performAnchor.defaultOrder = anchorInfo.defaultOrder;
                    arrayList2.add(performAnchor);
                }
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = new ArrayList();
            }
            takeTheStageBizExtra.LIZ = arrayList;
            TakeTheStageBizExtra.StartedInfo startedInfo = new TakeTheStageBizExtra.StartedInfo();
            startedInfo.performanceStartTime = takeTheStageBiz.performanceStartTime;
            takeTheStageBizExtra.startedInfo = startedInfo;
        }
        return takeTheStageBizExtra;
    }

    public static List LJIILLIIL(List list) {
        long j;
        Integer numValueOf;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                CompetitionTeamMemberInfo competitionTeamMemberInfo = (CompetitionTeamMemberInfo) it2.next();
                CompetitionUserBase competitionUserBase = competitionTeamMemberInfo.user;
                if (competitionUserBase != null) {
                    j = competitionUserBase.userId;
                } else {
                    j = 0;
                }
                C983500bhU c983500bhU = EnumC982700bgC.Companion;
                if (competitionUserBase != null) {
                    numValueOf = Integer.valueOf(competitionUserBase.role);
                } else {
                    numValueOf = null;
                }
                c983500bhU.getClass();
                arrayList.add(new C982710bgD(j, C983500bhU.LIZ(numValueOf), competitionTeamMemberInfo.score));
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.13BV] */
    public static List LJIIZILJ(List list) {
        ?? arrayList;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                CompetitionTeamBase competitionTeamBase = (CompetitionTeamBase) it2.next();
                long j = competitionTeamBase.teamId;
                List<CompetitionUserBase> list2 = competitionTeamBase.users;
                if (list2.isEmpty()) {
                    arrayList = C13BV.INSTANCE;
                } else {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<CompetitionUserBase> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(LJIJI(it3.next()));
                    }
                }
                arrayList2.add(new C981870ber(j, arrayList));
            }
            return arrayList2;
        }
        return C13BV.INSTANCE;
    }

    public static C982710bgD LJIJI(CompetitionUserBase competitionUserBase) {
        if (competitionUserBase == null) {
            return C982710bgD.LIZLLL;
        }
        long j = competitionUserBase.userId;
        C983500bhU c983500bhU = EnumC982700bgC.Companion;
        Integer numValueOf = Integer.valueOf(competitionUserBase.role);
        c983500bhU.getClass();
        return new C982710bgD(j, C983500bhU.LIZ(numValueOf), 0L);
    }

    public static EnumC982500bfs LJIJJ(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            CompetitionResultsTeamInfo competitionResultsTeamInfo = (CompetitionResultsTeamInfo) it2.next();
            Iterator<CompetitionTeamMemberInfo> it3 = competitionResultsTeamInfo.members.iterator();
            while (it3.hasNext()) {
                CompetitionUserBase competitionUserBase = it3.next().user;
                if (competitionUserBase != null && competitionUserBase.userId == C950220apo.LJ()) {
                    C983410bhL c983410bhL = EnumC982500bfs.Companion;
                    Integer numValueOf = Integer.valueOf(competitionResultsTeamInfo.result);
                    c983410bhL.getClass();
                    return C983410bhL.LIZ(numValueOf);
                }
            }
        }
        return EnumC982500bfs.UNKNOWN;
    }

    public static EnumC974260bSa LIZJ(Integer num, Integer num2) {
        C974280bSc c974280bSc = EnumC974260bSa.Companion;
        EnumC962960bAM.Companion.getClass();
        EnumC962960bAM enumC962960bAMLIZIZ = C962950bAL.LIZIZ(num);
        c974280bSc.getClass();
        return C974280bSc.LIZ(enumC962960bAMLIZIZ, num2);
    }

    public static void LJI(CompetitionMessage competitionMessage, C983010bgh c983010bgh) {
        c983010bgh.LIZ = competitionMessage.getMessageId();
        c983010bgh.LIZIZ = competitionMessage;
        c983010bgh.LIZJ = LIZIZ(competitionMessage.bizCommon);
        C982960bgc c982960bgc = EnumC982520bfu.Companion;
        Integer numValueOf = Integer.valueOf(competitionMessage.type);
        c982960bgc.getClass();
        c983010bgh.LIZLLL = C982960bgc.LIZ(numValueOf);
    }

    public static List LJIJ(String str, List list) {
        long j;
        Long lValueOf;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                CompetitionResultsTeamInfo competitionResultsTeamInfo = (CompetitionResultsTeamInfo) it2.next();
                StringBuilder sb = new StringBuilder(e3.h);
                int size = competitionResultsTeamInfo.members.size();
                for (int i = 0; i < size; i++) {
                    CompetitionUserBase competitionUserBase = ((CompetitionTeamMemberInfo) ListProtector.get(competitionResultsTeamInfo.members, i)).user;
                    if (competitionUserBase != null) {
                        lValueOf = Long.valueOf(competitionUserBase.userId);
                    } else {
                        lValueOf = null;
                    }
                    sb.append(String.valueOf(lValueOf));
                    if (i < competitionResultsTeamInfo.members.size() - 1) {
                        sb.append(", ");
                    }
                }
                sb.append(")");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TeamInfo=");
                sbLIZ.append((Object) sb);
                sbLIZ.append(", rank=");
                sbLIZ.append(competitionResultsTeamInfo.rank);
                sbLIZ.append(", score=");
                sbLIZ.append(competitionResultsTeamInfo.score);
                sbLIZ.append(". Set by=");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("CompetitionModelConvertorAdapter", C2188811AlT.LIZIZ(sbLIZ));
                long j2 = competitionResultsTeamInfo.teamId;
                long j3 = competitionResultsTeamInfo.score;
                long j4 = competitionResultsTeamInfo.rank;
                int i2 = competitionResultsTeamInfo.result;
                if (i2 > 0) {
                    j = Long.MAX_VALUE;
                } else {
                    j = j3;
                }
                C983410bhL c983410bhL = EnumC982500bfs.Companion;
                Integer numValueOf = Integer.valueOf(i2);
                c983410bhL.getClass();
                arrayList.add(new C982390bfh(j2, j3, j4, j, C983410bhL.LIZ(numValueOf), LJ(competitionResultsTeamInfo.contributors), LJIILLIIL(competitionResultsTeamInfo.members)));
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
