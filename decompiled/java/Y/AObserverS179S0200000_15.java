package Y;

import X.AbstractC977830bYL;
import X.C09JN;
import X.C11JF;
import X.C11QJ;
import X.C12ES;
import X.C13LP;
import X.C15438062q;
import X.C1701940uOG;
import X.C19487111Lx;
import X.C19490011Na;
import X.C1954807lC;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C501520Jle;
import X.C517101zt;
import X.C748880TZe;
import X.C766270U4b;
import X.C915980Zwa;
import X.C934230aQ1;
import X.C936030aSv;
import X.C936220aTE;
import X.C939710aYr;
import X.C939800aZ0;
import X.C954460awe;
import X.C974540bT2;
import X.C974910bTd;
import X.C976880bWo;
import X.C977550bXt;
import X.C977560bXu;
import X.C977620bY0;
import X.C977630bY1;
import X.C977730bYB;
import X.C977770bYF;
import X.C977840bYM;
import X.C977850bYN;
import X.C977870bYP;
import X.C979440baw;
import X.C979480bb0;
import X.C986440bmE;
import X.C987100bnI;
import X.EnumC919170a1j;
import X.EnumC975850bV9;
import X.EnumC976510bWD;
import X.InterfaceC1631620sYq;
import X.InterfaceC957770b1z;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.match.model.BattleInviteResult;
import com.bytedance.android.live.liveinteract.matchv2.connection.matchstate.RematchButtonUpdateEvent;
import com.bytedance.android.live.liveinteract.matchv2.connection.twomatch.coordinator.inviter.view.TwoMatchInviterFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.interceptor.FansRequiredInterceptor;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.apply.guest.MultiGuestFollowAndApplyDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInvite4004049FixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairConfigSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.TeamUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public class AObserverS179S0200000_15 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS179S0200000_15 aObserverS179S0200000_15, Object obj) {
        FragmentManager fragmentManager;
        MultiGuestFollowAndApplyDialog multiGuestFollowAndApplyDialog;
        ((Number) obj).intValue();
        DataChannel dataChannel = (DataChannel) aObserverS179S0200000_15.l0;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null && (multiGuestFollowAndApplyDialog = ((FansRequiredInterceptor) aObserverS179S0200000_15.l1).LIZIZ) != null) {
            multiGuestFollowAndApplyDialog.show(fragmentManager, "MultiGuestFollowAndApplyDialog");
        }
    }

    public static final void onChanged$1(AObserverS179S0200000_15 aObserverS179S0200000_15, Object obj) {
        boolean z;
        boolean z2;
        boolean zLJIILLIIL;
        C977630bY1 c977630bY1;
        C986440bmE c986440bmE;
        MutableLiveData<Map<Long, GiftGalleryBadgeInfo>> mutableLiveData;
        ArrayList arrayList;
        ArrayList arrayList2;
        MutableLiveData mutableLiveData2;
        List list;
        long jLongValue;
        long jLongValue2;
        ArrayList arrayList3;
        long jLongValue3;
        MutableLiveData<Map<Long, GiftGalleryBadgeInfo>> mutableLiveData3;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData4;
        Map<Boolean, List<C954460awe>> value;
        List<C954460awe> list2;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData5;
        Map<Boolean, List<C954460awe>> value2;
        List<C954460awe> list3;
        long jLongValue4;
        C977770bYF c977770bYF = (C977770bYF) obj;
        BattleInviteResult.ResponseData responseData = c977770bYF.LIZ;
        long jLongValue5 = 0;
        ArrayList arrayList4 = null;
        if (responseData != null) {
            C977560bXu c977560bXu = (C977560bXu) aObserverS179S0200000_15.l0;
            EnumC975850bV9 enumC975850bV9 = (EnumC975850bV9) aObserverS179S0200000_15.l1;
            if (c977560bXu.LIZLLL) {
                if (LiveMatchInvite4004049FixSetting.INSTANCE.isEnable()) {
                    Long l = responseData.battleId;
                    if (l != null) {
                        jLongValue4 = l.longValue();
                    } else {
                        jLongValue4 = 0;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("handleTwoMatchInviteRequestSuccess: orphan battle detected, battleId=");
                    sbLIZ.append(jLongValue4);
                    C20441214yg.LJIIL("CombinedMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
                    C974540bT2.LIZ.LJJLL(jLongValue4);
                    if (jLongValue4 != 0) {
                        c977560bXu.LJIILJJIL(jLongValue4, null);
                    }
                    C766270U4b.LIZLLL(2131853338);
                    Function2<? super Boolean, ? super Boolean, Unit> function2 = c977560bXu.LJIIIZ;
                    Boolean bool = Boolean.TRUE;
                    function2.invoke(bool, bool);
                    return;
                }
                return;
            }
            C986440bmE c986440bmE2 = c977560bXu.LJIILLIIL;
            if (c986440bmE2 != null) {
                c986440bmE2.LIZJ();
            }
            c977560bXu.LJIILLIIL = null;
            DataChannel dataChannel = c977560bXu.LIZJ;
            if (dataChannel != null) {
                dataChannel.LC0(RematchButtonUpdateEvent.class, new C979440baw(Boolean.FALSE, null, null, 6));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleInviteRequestSuccess, response = ");
            sbLIZ2.append(responseData.battleId);
            C20441214yg.LIZIZ("CombinedMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ2));
            Long l2 = responseData.battleId;
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            } else {
                jLongValue2 = 0;
            }
            C977630bY1 c977630bY12 = c977560bXu.LJII;
            if (c977630bY12 != null && (mutableLiveData5 = c977630bY12.LJFF) != null && (value2 = mutableLiveData5.getValue()) != null && (list3 = value2.get(Boolean.TRUE)) != null) {
                arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                Iterator<C954460awe> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Long.valueOf(it2.next().LJ));
                }
            } else {
                arrayList3 = null;
            }
            C977630bY1 c977630bY13 = c977560bXu.LJII;
            if (c977630bY13 != null && (mutableLiveData4 = c977630bY13.LJFF) != null && (value = mutableLiveData4.getValue()) != null && (list2 = value.get(Boolean.FALSE)) != null) {
                arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<C954460awe> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(Long.valueOf(it3.next().LJ));
                }
            }
            C977630bY1 c977630bY14 = c977560bXu.LJII;
            if (c977630bY14 != null) {
                c977630bY14.LJIIZILJ(jLongValue2, enumC975850bV9);
            }
            C977630bY1 c977630bY15 = c977560bXu.LJII;
            if (c977630bY15 != null && (mutableLiveData3 = c977630bY15.LJIIJJI) != null) {
                mutableLiveData3.setValue(responseData.leagueInfoMap);
            }
            C915980Zwa.LJII().LJJJJLL(responseData.leagueInfoMap);
            new ArrayList();
            if (arrayList3 != null && !arrayList3.isEmpty() && C13LP.LJJJLL(arrayList3) != null && arrayList4 != null && !arrayList4.isEmpty() && C13LP.LJJJLL(arrayList4) != null) {
                ArrayList arrayList5 = new ArrayList();
                Long l3 = (Long) C13LP.LJJJLL(arrayList3);
                if (l3 != null) {
                    jLongValue3 = l3.longValue();
                } else {
                    jLongValue3 = 0;
                }
                arrayList5.add(new TeamUser(arrayList3, jLongValue3));
                Long l4 = (Long) C13LP.LJJJLL(arrayList4);
                if (l4 != null) {
                    jLongValue5 = l4.longValue();
                }
                arrayList5.add(new TeamUser(arrayList4, jLongValue5));
                c977560bXu.LJIIIIZZ.invoke(Long.valueOf(jLongValue2), c977560bXu.LIZIZ, arrayList5);
                return;
            }
            C20441214yg.LJ("CombinedMatchInviterCoordinator", "self and rival is empty or null");
            return;
        }
        MultiInviteResponse multiInviteResponse = c977770bYF.LIZIZ;
        if (multiInviteResponse != null) {
            C977560bXu c977560bXu2 = (C977560bXu) aObserverS179S0200000_15.l0;
            if (c977560bXu2.LIZLLL) {
                if (!LiveMatchInvite4004049FixSetting.INSTANCE.isEnable()) {
                    return;
                }
                Long l5 = multiInviteResponse.battleId;
                if (l5 != null) {
                    jLongValue = l5.longValue();
                } else {
                    jLongValue = 0;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("handleMultiMatchInviteRequestSuccess: orphan battle detected, battleId=");
                sbLIZ3.append(jLongValue);
                C20441214yg.LJIIL("CombinedMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ3));
                C974540bT2.LIZ.LJJLL(jLongValue);
                if (jLongValue != 0) {
                    c977560bXu2.LIZJ(jLongValue);
                }
                C766270U4b.LIZLLL(2131853338);
                Function2<? super Boolean, ? super Boolean, Unit> function22 = c977560bXu2.LJIIIZ;
                Boolean bool2 = Boolean.TRUE;
                function22.invoke(bool2, bool2);
                return;
            }
            C986440bmE c986440bmE3 = c977560bXu2.LJIILLIIL;
            if (c986440bmE3 != null) {
                c986440bmE3.LIZJ();
            }
            c977560bXu2.LJIILLIIL = null;
            DataChannel dataChannel2 = c977560bXu2.LIZJ;
            if (dataChannel2 != null) {
                dataChannel2.LC0(RematchButtonUpdateEvent.class, new C979440baw(Boolean.FALSE, null, null, 6));
            }
            Long l6 = multiInviteResponse.battleId;
            if (l6 != null) {
                jLongValue5 = l6.longValue();
            }
            if (c977560bXu2.LIZIZ == EnumC919170a1j.MATCH_TYPE_INDIVIDUAL) {
                C977630bY1 c977630bY16 = c977560bXu2.LJII;
                if (c977630bY16 != null && (mutableLiveData2 = c977630bY16.LIZJ) != null && (list = (List) mutableLiveData2.getValue()) != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(Long.valueOf(((C954460awe) it4.next()).LJ));
                    }
                } else {
                    arrayList = null;
                }
                List<TeamUser> list4 = multiInviteResponse.battleTeamUser;
                if (list4 != null) {
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                    Iterator<TeamUser> it5 = list4.iterator();
                    while (it5.hasNext()) {
                        arrayList2.add(Long.valueOf(it5.next().teamId));
                    }
                } else {
                    arrayList2 = null;
                }
                if (!C976880bWo.LIZ(arrayList2, arrayList)) {
                    C977630bY1 c977630bY17 = c977560bXu2.LJII;
                    if (c977630bY17 != null) {
                        c977630bY17.LJIIJJI(EnumC976510bWD.HOSTS_LIST_CHANGED, c977560bXu2.LJ);
                    }
                    C766270U4b.LIZLLL(2131853338);
                    return;
                }
            }
            C977630bY1 c977630bY18 = c977560bXu2.LJII;
            if (c977630bY18 != null) {
                c977630bY18.LJIIZILJ(jLongValue5, null);
            }
            C977630bY1 c977630bY19 = c977560bXu2.LJII;
            if (c977630bY19 != null && (mutableLiveData = c977630bY19.LJIIJJI) != null) {
                mutableLiveData.setValue(multiInviteResponse.leagueInfoMap);
            }
            List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
            if (!multiInviteResponse.leagueInfoMap.isEmpty()) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("update league info ");
                sbLIZ4.append(multiInviteResponse.leagueInfoMap);
                C20441214yg.LJIIIZ("CombinedMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ4));
                for (C954460awe c954460awe : listLLILZLL) {
                    c954460awe.LJJIII = multiInviteResponse.leagueInfoMap.get(Long.valueOf(c954460awe.LJ));
                }
            }
            boolean z3 = true;
            if (multiInviteResponse.meanwhileInviteScene != 1) {
                z3 = false;
            }
            C915980Zwa.LJII().LJJJJLL(multiInviteResponse.leagueInfoMap);
            if (z3 || multiInviteResponse.battleTeamUser == null) {
                return;
            }
            InterfaceC1631620sYq<? super Long, ? super EnumC919170a1j, ? super List<TeamUser>, Unit> interfaceC1631620sYq = c977560bXu2.LJIIIIZZ;
            Long lValueOf = Long.valueOf(jLongValue5);
            EnumC919170a1j enumC919170a1j = c977560bXu2.LIZIZ;
            List<TeamUser> list5 = multiInviteResponse.battleTeamUser;
            if (list5 != null) {
                interfaceC1631620sYq.invoke(lValueOf, enumC919170a1j, list5);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Throwable th = c977770bYF.LIZJ;
        if (th != null) {
            boolean z4 = th instanceof C977840bYM;
            if (z4) {
                C977840bYM c977840bYM = (C977840bYM) th;
                ((C977560bXu) aObserverS179S0200000_15.l0).LJIILJJIL(c977840bYM.getBattleId(), Long.valueOf(c977840bYM.getInviteeId()));
            } else if (th instanceof C977850bYN) {
                ((C977560bXu) aObserverS179S0200000_15.l0).LIZJ(((AbstractC977830bYL) th).getBattleId());
            }
            C977560bXu c977560bXu3 = (C977560bXu) aObserverS179S0200000_15.l0;
            if (c977560bXu3.LIZLLL) {
                return;
            }
            C986440bmE c986440bmE4 = c977560bXu3.LJIILLIIL;
            if (c986440bmE4 != null) {
                c986440bmE4.LIZLLL(th);
            }
            boolean z5 = th instanceof C501470JlZ;
            if (z5 && ((C501520Jle) th).getErrorCode() == 4029011 && (c986440bmE = c977560bXu3.LJIILLIIL) != null && c986440bmE.LJ()) {
                C977630bY1 c977630bY110 = c977560bXu3.LJII;
                if (c977630bY110 == null) {
                    return;
                }
                c977630bY110.LJJJJ = false;
                return;
            }
            boolean z6 = false;
            c977560bXu3.LJIILLIIL = null;
            C977630bY1 c977630bY111 = c977560bXu3.LJII;
            if (c977630bY111 != null) {
                c977630bY111.LJIILLIIL();
            }
            EnumC919170a1j enumC919170a1j2 = c977560bXu3.LIZIZ;
            EnumC919170a1j enumC919170a1j3 = EnumC919170a1j.MATCH_TYPE_1V1;
            if (enumC919170a1j2 == enumC919170a1j3 && LiveDirectMatchSetting.INSTANCE.isEnabled() && (c977630bY1 = c977560bXu3.LJII) != null) {
                zLJIILLIIL = c977630bY1.LJIILLIIL();
            } else {
                zLJIILLIIL = true;
            }
            if (z5) {
                C501470JlZ c501470JlZ = (C501470JlZ) th;
                if (!TextUtils.isEmpty(c501470JlZ.getPrompt())) {
                    C766270U4b.LJIIJJI(c501470JlZ.getPrompt());
                } else if (c977560bXu3.LIZIZ == enumC919170a1j3) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("errorCode = ");
                    sbLIZ5.append(c501470JlZ.getErrorMsg());
                    C20441214yg.LJ("CombinedMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ5));
                } else {
                    switch (c501470JlZ.getErrorCode()) {
                        case 4004047:
                        case 4029016:
                            C766270U4b.LIZLLL(2131853282);
                            break;
                        case 4029012:
                            C766270U4b.LIZLLL(2131853281);
                            break;
                        case 4029013:
                            C766270U4b.LIZLLL(2131853343);
                            break;
                        case 4029014:
                            C766270U4b.LIZLLL(2131853278);
                            break;
                        case 4029019:
                            C766270U4b.LIZLLL(2131853342);
                            break;
                    }
                }
                if (c501470JlZ.getErrorCode() == 4004253) {
                    c977560bXu3.LIZLLL();
                    zLJIILLIIL = false;
                } else {
                    z6 = true;
                }
            } else {
                if (th instanceof C977870bYP) {
                    C766270U4b.LIZLLL(2131843062);
                } else if (!z4 && !(th instanceof C977850bYN)) {
                    C766270U4b.LIZLLL(2131852422);
                } else {
                    C766270U4b.LIZLLL(2131852422);
                    z6 = true;
                }
                z6 = false;
            }
            c977560bXu3.LJIIIZ.invoke(Boolean.valueOf(zLJIILLIIL), Boolean.valueOf(z6));
            return;
        }
        EnumC976510bWD enumC976510bWD = c977770bYF.LIZLLL;
        if (enumC976510bWD != null) {
            C977560bXu c977560bXu4 = (C977560bXu) aObserverS179S0200000_15.l0;
            C986440bmE c986440bmE5 = c977560bXu4.LJIILLIIL;
            if (c986440bmE5 != null) {
                c986440bmE5.LIZIZ();
            }
            if (c977560bXu4.LIZLLL) {
                return;
            }
            DataChannel dataChannel3 = c977560bXu4.LIZJ;
            if (dataChannel3 != null) {
                dataChannel3.LC0(RematchButtonUpdateEvent.class, new C979440baw(Boolean.TRUE, null, null, 6));
            }
            C977630bY1 c977630bY112 = c977560bXu4.LJII;
            if (c977630bY112 != null) {
                c977630bY112.LJIIZILJ.setValue(Boolean.FALSE);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("handleCancelRequestSuccess battleIdMap.isEmpty() ");
                sbLIZ6.append(c977630bY112.LJJIL.isEmpty());
                C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ6));
                z2 = !c977630bY112.LJJIL.isEmpty();
            } else {
                z2 = false;
            }
            c977560bXu4.LJIIJ.invoke(enumC976510bWD, Boolean.valueOf(z2));
            return;
        }
        Throwable th2 = c977770bYF.LJ;
        if (th2 == null) {
            return;
        }
        C977560bXu c977560bXu5 = (C977560bXu) aObserverS179S0200000_15.l0;
        C986440bmE c986440bmE6 = c977560bXu5.LJIILLIIL;
        if (c986440bmE6 != null) {
            c986440bmE6.LIZIZ();
        }
        if (c977560bXu5.LIZLLL) {
            return;
        }
        C977630bY1 c977630bY113 = c977560bXu5.LJII;
        if (c977630bY113 != null) {
            c977630bY113.LJIIZILJ.setValue(Boolean.FALSE);
        }
        if (th2 instanceof C501470JlZ) {
            C501470JlZ c501470JlZ2 = (C501470JlZ) th2;
            if (!TextUtils.isEmpty(c501470JlZ2.getPrompt())) {
                C766270U4b.LJIIJJI(c501470JlZ2.getPrompt());
            } else if (c501470JlZ2.getErrorCode() == 4004048) {
                C766270U4b.LIZLLL(2131842762);
            } else {
                C766270U4b.LIZLLL(2131852422);
            }
            if (c501470JlZ2.getErrorCode() == 4004048) {
                z = true;
            }
            c977560bXu5.LJIIJJI.invoke(Boolean.valueOf(z));
        }
        C766270U4b.LIZLLL(2131852422);
        z = false;
        c977560bXu5.LJIIJJI.invoke(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$10(AObserverS179S0200000_15 aObserverS179S0200000_15, Object obj) {
        long jLongValue;
        if (C500260Jjc.LJJJI((Boolean) obj)) {
            long j = LiveMatchTeamPairConfigSetting.INSTANCE.getValue().inviteeFallbackTime;
            Long l = (Long) ((C974910bTd) aObserverS179S0200000_15.l0).LJ.LJIIJ.getValue();
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            long j2 = j + jLongValue;
            if (((C974910bTd) aObserverS179S0200000_15.l0).LJIIJ == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Self accepted time = ");
                sbLIZ.append(j2);
                sbLIZ.append(", startFallbackCountdown");
                C20441214yg.LIZIZ("TeamMatchInviteeCoordinator", C2188811AlT.LIZIZ(sbLIZ));
                C974910bTd c974910bTd = (C974910bTd) aObserverS179S0200000_15.l0;
                Function1 function1 = (Function1) aObserverS179S0200000_15.l1;
                c974910bTd.getClass();
                c974910bTd.LJIIJ = (C11JF) C19490011Na.LIZ(0L, 1L, TimeUnit.SECONDS).LJLIIL(j2).LJJJJZI(new C517101zt(j2, 12)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new C09JN() { // from class: X.00Js
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                        C1C7U.LIZ("TeamMatchInviteeCoordinator@3266.startFallbackCountdown$2");
                        ((Number) obj2).longValue();
                        C1C7U.LIZIZ("TeamMatchInviteeCoordinator@3266.startFallbackCountdown$2");
                    }
                }, new C09JN() { // from class: X.00Jy
                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        C1C7U.LIZ("TeamMatchInviteeCoordinator@3266.startFallbackCountdown$3");
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Throwable ");
                        sbLIZ2.append(((Throwable) obj2).getMessage());
                        C20441214yg.LIZIZ("TeamMatchInviteeCoordinator", C2188811AlT.LIZIZ(sbLIZ2));
                        C1C7U.LIZIZ("TeamMatchInviteeCoordinator@3266.startFallbackCountdown$3");
                    }
                }, new C987100bnI(function1, 24));
            }
        }
    }

    public static final void onChanged$11(AObserverS179S0200000_15 aObserverS179S0200000_15, Object obj) {
        long jLongValue;
        C936030aSv c936030aSv = (C936030aSv) obj;
        C939710aYr c939710aYr = (C939710aYr) aObserverS179S0200000_15.l0;
        if (c939710aYr.LLLL) {
            c939710aYr.LLLL = false;
            return;
        }
        if (c936030aSv == null) {
            Long l = c939710aYr.LLLILZLLLI;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            c939710aYr.LJJIJLIJ(jLongValue);
            return;
        }
        View viewLJIL = c939710aYr.LJIL(true);
        if (viewLJIL != null) {
            C12ES.LJIILL(0, viewLJIL);
        }
        int i = C936220aTE.LIZ[c936030aSv.LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LiveIconView liveIconView = ((C939710aYr) aObserverS179S0200000_15.l0).LLLJ;
                    if (liveIconView != null) {
                        liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.e7k, (Context) aObserverS179S0200000_15.l1));
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                LiveIconView liveIconView2 = ((C939710aYr) aObserverS179S0200000_15.l0).LLLJ;
                if (liveIconView2 != null) {
                    liveIconView2.setIcon(C20736316Cj.LIZLLL(R.attr.e8e, (Context) aObserverS179S0200000_15.l1));
                }
            }
            ((C939710aYr) aObserverS179S0200000_15.l0).LLLJL = (C19487111Lx) C11QJ.LL.LJ(20L, TimeUnit.SECONDS).LJIILJJIL(C1701940uOG.LIZIZ()).LJII(new C987100bnI((C939710aYr) aObserverS179S0200000_15.l0, 25)).LJIIIIZZ(new C09JN() { // from class: X.00LK
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                    C1C7U.LIZ("MultiGuestV3GuestMask@c123.generatingProgressObserver$2$1$2");
                    C1C7U.LIZIZ("MultiGuestV3GuestMask@c123.generatingProgressObserver$2$1$2");
                }
            }).LJIIZILJ();
            return;
        }
        C939710aYr c939710aYr2 = (C939710aYr) aObserverS179S0200000_15.l0;
        if (c939710aYr2.LLLILZ) {
            return;
        }
        c939710aYr2.LLLILZ = true;
        LiveIconView liveIconView3 = c939710aYr2.LLLJ;
        if (liveIconView3 == null) {
            return;
        }
        liveIconView3.setIcon(C20736316Cj.LIZLLL(R.attr.e89, (Context) aObserverS179S0200000_15.l1));
    }

    public static final void onChanged$2(AObserverS179S0200000_15 aObserverS179S0200000_15, Object obj) {
        ((MediatorLiveData) aObserverS179S0200000_15.l0).setValue(((C977630bY1) aObserverS179S0200000_15.l1).LJIILL());
    }

    public static final void onChanged$3(AObserverS179S0200000_15 aObserverS179S0200000_15, Object obj) {
        ((MediatorLiveData) aObserverS179S0200000_15.l0).setValue(((C977630bY1) aObserverS179S0200000_15.l1).LJIILJJIL());
    }

    public static final void onChanged$4(AObserverS179S0200000_15 aObserverS179S0200000_15, Object obj) {
        ((MediatorLiveData) aObserverS179S0200000_15.l0).setValue(((C977630bY1) aObserverS179S0200000_15.l1).LJIILJJIL());
    }

    public static final void onChanged$5(AObserverS179S0200000_15 aObserverS179S0200000_15, Object obj) {
        boolean z;
        boolean z2;
        boolean zLJIILIIL;
        boolean z3;
        C977620bY0 c977620bY0;
        C986440bmE c986440bmE;
        long jLongValue;
        ArrayList arrayList;
        ArrayList arrayList2;
        long jLongValue2;
        long jLongValue3;
        MutableLiveData<Map<Long, GiftGalleryBadgeInfo>> mutableLiveData;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData2;
        Map<Boolean, List<C954460awe>> value;
        List<C954460awe> list;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData3;
        Map<Boolean, List<C954460awe>> value2;
        List<C954460awe> list2;
        long jLongValue4;
        C977730bYB c977730bYB = (C977730bYB) obj;
        if (c977730bYB.LIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("inviteSuccess = ");
            sbLIZ.append(c977730bYB);
            C20441214yg.LIZIZ("TwoMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
            C977550bXt c977550bXt = (C977550bXt) aObserverS179S0200000_15.l0;
            BattleInviteResult.ResponseData responseData = c977730bYB.LIZ;
            EnumC975850bV9 enumC975850bV9 = (EnumC975850bV9) aObserverS179S0200000_15.l1;
            if (c977550bXt.LJ) {
                if (LiveMatchInvite4004049FixSetting.INSTANCE.isEnable()) {
                    Long l = responseData.battleId;
                    if (l != null) {
                        jLongValue4 = l.longValue();
                    } else {
                        jLongValue4 = 0;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("handleInviteRequestSuccess: orphan battle detected, battleId=");
                    sbLIZ2.append(jLongValue4);
                    C20441214yg.LJIIL("TwoMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ2));
                    C974540bT2.LIZ.LJJLL(jLongValue4);
                    if (jLongValue4 != 0) {
                        c977550bXt.LIZJ(jLongValue4, null);
                    }
                    C766270U4b.LIZLLL(2131853338);
                    Function2<? super Boolean, ? super Boolean, Unit> function2 = c977550bXt.LJIIJ;
                    Boolean bool = Boolean.TRUE;
                    function2.invoke(bool, bool);
                }
            } else {
                C986440bmE c986440bmE2 = c977550bXt.LJIILL;
                if (c986440bmE2 != null) {
                    c986440bmE2.LIZJ();
                }
                c977550bXt.LJIILL = null;
                DataChannel dataChannel = c977550bXt.LIZJ;
                if (dataChannel != null) {
                    dataChannel.LC0(RematchButtonUpdateEvent.class, new C979440baw(Boolean.FALSE, null, null, 6));
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("handleInviteRequestSuccess, response = ");
                sbLIZ3.append(responseData.battleId);
                C20441214yg.LIZIZ("TwoMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ3));
                Long l2 = responseData.battleId;
                if (l2 != null) {
                    jLongValue = l2.longValue();
                } else {
                    jLongValue = 0;
                }
                C977620bY0 c977620bY02 = c977550bXt.LIZLLL;
                if (c977620bY02 != null && (mutableLiveData3 = c977620bY02.LJFF) != null && (value2 = mutableLiveData3.getValue()) != null && (list2 = value2.get(Boolean.TRUE)) != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<C954460awe> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Long.valueOf(it2.next().LJ));
                    }
                } else {
                    arrayList = null;
                }
                C977620bY0 c977620bY03 = c977550bXt.LIZLLL;
                if (c977620bY03 != null && (mutableLiveData2 = c977620bY03.LJFF) != null && (value = mutableLiveData2.getValue()) != null && (list = value.get(Boolean.FALSE)) != null) {
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<C954460awe> it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(Long.valueOf(it3.next().LJ));
                    }
                } else {
                    arrayList2 = null;
                }
                C977620bY0 c977620bY04 = c977550bXt.LIZLLL;
                if (c977620bY04 != null) {
                    c977620bY04.LJIILJJIL(jLongValue, enumC975850bV9);
                }
                C977620bY0 c977620bY05 = c977550bXt.LIZLLL;
                if (c977620bY05 != null && (mutableLiveData = c977620bY05.LJIIJJI) != null) {
                    mutableLiveData.setValue(responseData.leagueInfoMap);
                }
                C915980Zwa.LJII().LJJJJLL(responseData.leagueInfoMap);
                new ArrayList();
                if (arrayList != null && !arrayList.isEmpty() && C13LP.LJJJLL(arrayList) != null && arrayList2 != null && !arrayList2.isEmpty() && C13LP.LJJJLL(arrayList2) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Long l3 = (Long) C13LP.LJJJLL(arrayList);
                    if (l3 != null) {
                        jLongValue2 = l3.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    arrayList3.add(new TeamUser(arrayList, jLongValue2));
                    Long l4 = (Long) C13LP.LJJJLL(arrayList2);
                    if (l4 != null) {
                        jLongValue3 = l4.longValue();
                    } else {
                        jLongValue3 = 0;
                    }
                    arrayList3.add(new TeamUser(arrayList2, jLongValue3));
                    c977550bXt.LJIIIZ.invoke(Long.valueOf(jLongValue), c977550bXt.LJII, arrayList3);
                } else {
                    C20441214yg.LJ("TwoMatchInviterCoordinator", "self and rival is empty or null");
                }
            }
        }
        Throwable th = c977730bYB.LIZIZ;
        if (th != null) {
            boolean z4 = th instanceof C977840bYM;
            if (z4) {
                C977840bYM c977840bYM = (C977840bYM) th;
                ((C977550bXt) aObserverS179S0200000_15.l0).LIZJ(c977840bYM.getBattleId(), Long.valueOf(c977840bYM.getInviteeId()));
            }
            C977550bXt c977550bXt2 = (C977550bXt) aObserverS179S0200000_15.l0;
            if (!c977550bXt2.LJ) {
                C986440bmE c986440bmE3 = c977550bXt2.LJIILL;
                if (c986440bmE3 != null) {
                    c986440bmE3.LIZLLL(th);
                }
                boolean z5 = th instanceof C501470JlZ;
                if (z5 && ((C501520Jle) th).getErrorCode() == 4029011 && (c986440bmE = c977550bXt2.LJIILL) != null && c986440bmE.LJ()) {
                    C977620bY0 c977620bY06 = c977550bXt2.LIZLLL;
                    if (c977620bY06 != null) {
                        c977620bY06.LJJIIJZLJL = false;
                    }
                } else {
                    c977550bXt2.LJIILL = null;
                    if (LiveDirectMatchSetting.INSTANCE.isEnabled() && (c977620bY0 = c977550bXt2.LIZLLL) != null) {
                        zLJIILIIL = c977620bY0.LJIILIIL();
                    } else {
                        zLJIILIIL = true;
                    }
                    if (z5) {
                        C501470JlZ c501470JlZ = (C501470JlZ) th;
                        if (!TextUtils.isEmpty(c501470JlZ.getPrompt())) {
                            C766270U4b.LJIIJJI(c501470JlZ.getPrompt());
                        } else {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("errorCode = ");
                            sbLIZ4.append(c501470JlZ.getErrorMsg());
                            C20441214yg.LJ("TwoMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ4));
                        }
                        if (c501470JlZ.getErrorCode() == 4004253) {
                            InterfaceC957770b1z interfaceC957770b1z = c977550bXt2.LIZIZ;
                            if (interfaceC957770b1z != null) {
                                interfaceC957770b1z.dismiss();
                            }
                            z3 = false;
                            zLJIILIIL = false;
                        } else {
                            z3 = true;
                        }
                        c977550bXt2.LJIIJ.invoke(Boolean.valueOf(zLJIILIIL), Boolean.valueOf(z3));
                    } else {
                        if (th instanceof C977870bYP) {
                            C766270U4b.LIZLLL(2131843062);
                        } else if (z4) {
                            C766270U4b.LIZLLL(2131852422);
                            z3 = true;
                            c977550bXt2.LJIIJ.invoke(Boolean.valueOf(zLJIILIIL), Boolean.valueOf(z3));
                        } else {
                            C766270U4b.LIZLLL(2131852422);
                        }
                        z3 = false;
                        c977550bXt2.LJIIJ.invoke(Boolean.valueOf(zLJIILIIL), Boolean.valueOf(z3));
                    }
                }
            }
        }
        if (c977730bYB.LIZJ != null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("cancel success = ");
            sbLIZ5.append(c977730bYB.LIZJ);
            C20441214yg.LIZIZ("TwoMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ5));
            C977550bXt c977550bXt3 = (C977550bXt) aObserverS179S0200000_15.l0;
            EnumC976510bWD enumC976510bWD = c977730bYB.LIZJ;
            C986440bmE c986440bmE4 = c977550bXt3.LJIILL;
            if (c986440bmE4 != null) {
                c986440bmE4.LIZIZ();
            }
            if (!c977550bXt3.LJ) {
                DataChannel dataChannel2 = c977550bXt3.LIZJ;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(RematchButtonUpdateEvent.class, new C979440baw(Boolean.TRUE, null, null, 6));
                }
                C977620bY0 c977620bY07 = c977550bXt3.LIZLLL;
                if (c977620bY07 != null) {
                    c977620bY07.LJIILL.setValue(Boolean.FALSE);
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("handleCancelRequestSuccess battleIdMap.isEmpty() ");
                    sbLIZ6.append(c977620bY07.LJJIJ.isEmpty());
                    C20441214yg.LIZIZ("TwoMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ6));
                    z2 = !c977620bY07.LJJIJ.isEmpty();
                } else {
                    z2 = false;
                }
                c977550bXt3.LJIIJJI.invoke(enumC976510bWD, Boolean.valueOf(z2));
            }
        }
        if (c977730bYB.LIZLLL != null) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("cancel failed = ");
            sbLIZ7.append(c977730bYB.LIZLLL);
            C20441214yg.LIZIZ("TwoMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ7));
            C977550bXt c977550bXt4 = (C977550bXt) aObserverS179S0200000_15.l0;
            Throwable th2 = c977730bYB.LIZLLL;
            C986440bmE c986440bmE5 = c977550bXt4.LJIILL;
            if (c986440bmE5 != null) {
                c986440bmE5.LIZIZ();
            }
            if (!c977550bXt4.LJ) {
                C977620bY0 c977620bY08 = c977550bXt4.LIZLLL;
                if (c977620bY08 != null) {
                    c977620bY08.LJIILL.setValue(Boolean.FALSE);
                }
                if (th2 instanceof C501470JlZ) {
                    C501470JlZ c501470JlZ2 = (C501470JlZ) th2;
                    if (!TextUtils.isEmpty(c501470JlZ2.getPrompt())) {
                        C766270U4b.LJIIJJI(c501470JlZ2.getPrompt());
                    } else if (c501470JlZ2.getErrorCode() == 4004048) {
                        C766270U4b.LIZLLL(2131842762);
                    } else {
                        C766270U4b.LIZLLL(2131852422);
                    }
                    if (c501470JlZ2.getErrorCode() == 4004048) {
                        z = true;
                    }
                    c977550bXt4.LJIIL.invoke(Boolean.valueOf(z));
                }
                C766270U4b.LIZLLL(2131852422);
                z = false;
                c977550bXt4.LJIIL.invoke(Boolean.valueOf(z));
            }
        }
    }

    public static final void onChanged$6(AObserverS179S0200000_15 aObserverS179S0200000_15, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C20441214yg.LIZIZ("TwoMatchInviterViewBinder", "auto invite");
            ((C979480bb0) aObserverS179S0200000_15.l0).LJIIJJI();
            ((C977630bY1) aObserverS179S0200000_15.l1).LJJIFFI.setValue(Boolean.FALSE);
        }
    }

    public static final void onChanged$7(AObserverS179S0200000_15 aObserverS179S0200000_15, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C20441214yg.LIZIZ("TwoMatchInviterViewBinder", "auto invite");
            ((C979480bb0) aObserverS179S0200000_15.l0).LJIIJJI();
            ((C977620bY0) aObserverS179S0200000_15.l1).LJIJI.setValue(Boolean.FALSE);
        }
    }

    public static final void onChanged$8(AObserverS179S0200000_15 aObserverS179S0200000_15, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C20441214yg.LIZIZ("TwoMatchInvitePanel", "auto invite");
            ((TwoMatchInviterFragment) aObserverS179S0200000_15.l0).aS();
            ((C977620bY0) aObserverS179S0200000_15.l1).LJIJI.setValue(Boolean.FALSE);
        }
    }

    public static final void onChanged$9(AObserverS179S0200000_15 aObserverS179S0200000_15, Object obj) {
        MultiGuestThemeViewModel multiGuestThemeViewModel = (MultiGuestThemeViewModel) obj;
        AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15((ViewGroup) aObserverS179S0200000_15.l1, 1086);
        AwS559S0100000_15 awS559S0100000_152 = new AwS559S0100000_15((C939800aZ0) aObserverS179S0200000_15.l0, 1087);
        if (multiGuestThemeViewModel == null) {
            awS559S0100000_15.invoke();
            awS559S0100000_152.invoke();
        } else {
            multiGuestThemeViewModel.vQ2(new C2217371BqR() { // from class: X.0aOc
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C938810aXP) obj2).LL;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj2, Object obj3) {
                    ((C938810aXP) obj2).LL = (Integer) obj3;
                }
            }, null, (C939800aZ0) aObserverS179S0200000_15.l0, new AwS381S0200000_15((ViewGroup) aObserverS179S0200000_15.l1, awS559S0100000_15, 165));
            C934230aQ1 c934230aQ1 = new C2217371BqR() { // from class: X.0aQ1
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C938810aXP) obj2).LLILLJJLI;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj2, Object obj3) {
                    ((C938810aXP) obj2).LLILLJJLI = (Integer) obj3;
                }
            };
            C939800aZ0 c939800aZ0 = (C939800aZ0) aObserverS179S0200000_15.l0;
            multiGuestThemeViewModel.vQ2(c934230aQ1, null, c939800aZ0, new AwS381S0200000_15(awS559S0100000_152, c939800aZ0, 166));
        }
    }

    public AObserverS179S0200000_15(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
