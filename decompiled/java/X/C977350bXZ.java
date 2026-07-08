package X;

import Y.AObserverS219S0100000_15;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.match.business.event.MatchStartAnimationEndEvent;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCoreScenariosMetricsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchDropOffSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchOnlyGiftIconSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchScoreTrackSetting;
import com.bytedance.android.livesdk.model.message.BattleGameplayMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.IceShowdownInfo;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bXZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977350bXZ implements InterfaceC975560bUg {
    public final InterfaceC977420bXg LL;
    public EnumC976730bWZ LLILLJJLI;
    public MatchBaseWidget LLILLL;

    @Override // X.InterfaceC975560bUg
    public final void LIZIZ(int i, int i2, List list, List list2, List list3, List list4) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJI(EnumC919170a1j enumC919170a1j) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void onDestroy() {
        if (SettingsManager.INSTANCE.getBooleanValue("live_match_audience_mvp_reset_enable", true)) {
            this.LL.dismiss();
            this.LL.reset();
        }
        this.LL.onUnload();
        this.LLILLL = null;
    }

    @Override // X.InterfaceC975560bUg
    public final EnumC976730bWZ getPriority() {
        return this.LLILLJJLI;
    }

    public C977350bXZ(InterfaceC977420bXg interfaceC977420bXg) {
        this.LL = interfaceC977420bXg;
        EnumSet.noneOf(EnumC963560bBK.class);
        this.LLILLJJLI = EnumC976730bWZ.P1;
    }

    @Override // X.InterfaceC975560bUg
    public final void LIZJ(AbstractC986700bme abstractC986700bme) {
        this.LL.LIZJ(abstractC986700bme);
    }

    @Override // X.InterfaceC975560bUg
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        this.LLILLL = matchBaseWidget;
        this.LL.LIZLLL(matchBaseWidget);
        matchBaseWidget.dataChannel.BQ2(matchBaseWidget, MatchStartAnimationEndEvent.class, new AwS594S0100000_15(this, 8));
    }

    @Override // X.InterfaceC975560bUg
    public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
        InterfaceC977420bXg interfaceC977420bXg = this.LL;
        if (interfaceC977420bXg instanceof C158N) {
            ((C158N) interfaceC977420bXg).onUnload();
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
        C975960bVK c975960bVK;
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
        if (this.LL instanceof C985780blA) {
            C20441214yg.LIZIZ("MatchBattleComponentAdapter", "matchComponent.enterPunish()");
            C985780blA c985780blA = (C985780blA) this.LL;
            c985780blA.LJIIIIZZ();
            C500260Jjc.LLFFF(c985780blA.LLILLL);
            if (LiveMatchOnlyGiftIconSettings.INSTANCE.getValue()) {
                C15DF c15df = c985780blA.LLILLL;
                if (c15df != null) {
                    c15df.LJJIII();
                }
                InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                if (interfaceC973730bRjYf2 != null && (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf2.LJJJJIZL()) != null) {
                    mutableLiveDataLJJJJIZL.observe(c985780blA.LL, new AObserverS219S0100000_15(c985780blA, 33));
                }
            }
        } else {
            C20441214yg.LIZIZ("MatchBattleComponentAdapter", "onPunishUIChange, show");
            InterfaceC977420bXg interfaceC977420bXg = this.LL;
            if (interfaceC963620bBQ instanceof C975960bVK) {
                c975960bVK = (C975960bVK) interfaceC963620bBQ;
            } else {
                c975960bVK = null;
            }
            interfaceC977420bXg.LJFF(c975960bVK);
        }
        InterfaceC977420bXg interfaceC977420bXg2 = this.LL;
        if (interfaceC977420bXg2 instanceof AbstractC977390bXd) {
            AbstractC977390bXd abstractC977390bXd = (AbstractC977390bXd) interfaceC977420bXg2;
            if (!abstractC977390bXd.LL) {
                abstractC977390bXd.LL = true;
                abstractC977390bXd.LJI(abstractC977390bXd.LLILLJJLI);
            }
        }
        InterfaceC977420bXg interfaceC977420bXg3 = this.LL;
        if (interfaceC977420bXg3 instanceof C158N) {
            ((C158N) interfaceC977420bXg3).onUnload();
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LJII(AbstractC1136060ffY abstractC1136060ffY) throws Throwable {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        String strLIZIZ;
        InterfaceC977420bXg interfaceC977420bXg = this.LL;
        if (interfaceC977420bXg instanceof C985780blA) {
            if (abstractC1136060ffY instanceof LinkMicBattleArmiesMessage) {
                C985780blA c985780blA = (C985780blA) interfaceC977420bXg;
                LinkMicBattleArmiesMessage linkMicBattleArmiesMessage = (LinkMicBattleArmiesMessage) abstractC1136060ffY;
                c985780blA.getClass();
                c985780blA.LLIZ = C974520bT0.LIZ();
                c985780blA.LJIIJ(linkMicBattleArmiesMessage.fuzzyDisplayConfigV2);
                C15DF c15df = c985780blA.LLILLL;
                if (c15df != null) {
                    c15df.LJJIJIIJIL();
                }
                long j = c985780blA.LLIZ;
                long jLIZ = C974520bT0.LIZ();
                boolean z = false;
                if (LiveMatchCoreScenariosMetricsSetting.INSTANCE.enableScoreTrack()) {
                    long currentUserId = UserService.getInstance().user().getCurrentUserId();
                    if (linkMicBattleArmiesMessage.fromUserId == currentUserId && linkMicBattleArmiesMessage.triggerReason == EnumC975300bUG.SCORE_UPDATE.getValue()) {
                        if (linkMicBattleArmiesMessage.giftId != 0) {
                            strLIZIZ = linkMicBattleArmiesMessage.logId;
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                            if (interfaceC973730bRjYf2 != null) {
                                lValueOf3 = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL());
                            } else {
                                lValueOf3 = null;
                            }
                            sbLIZ.append(lValueOf3);
                            sbLIZ.append(',');
                            sbLIZ.append(currentUserId);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        long jLIZJ = C963140bAe.LIZJ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        long j2 = C946230ajN.LJIIIIZZ;
                        List<C974600bT8> list = (List) ((LinkedHashMap) C974540bT2.LJJIII).get(strLIZIZ);
                        if (list != null) {
                            for (C974600bT8 c974600bT8 : list) {
                                if (c974600bT8.LJI == 0) {
                                    c974600bT8.LJI = jLIZJ;
                                    c974600bT8.LJIIJ = jElapsedRealtime;
                                    c974600bT8.LJIILJJIL = j2;
                                }
                            }
                        }
                        C974540bT2 c974540bT2 = C974540bT2.LIZ;
                        C974540bT2.LJJIII(linkMicBattleArmiesMessage.giftId, linkMicBattleArmiesMessage.logId, false, false);
                    }
                }
                if (LiveMatchScoreTrackSetting.INSTANCE.enableTrack()) {
                    if (C975390bUP.LJIIIZ == null) {
                        C975390bUP.LJIIIZ = new C975470bUX();
                    }
                    C975470bUX c975470bUX = C975390bUP.LJIIIZ;
                    if (c975470bUX != null && linkMicBattleArmiesMessage.triggerReason == EnumC975300bUG.SCORE_UPDATE.getValue()) {
                        if (linkMicBattleArmiesMessage.giftCount > 0) {
                            z = true;
                            c975470bUX.LIZ = linkMicBattleArmiesMessage.giftSentTime;
                        }
                        long j3 = linkMicBattleArmiesMessage.scoreUpdateTime;
                        long j4 = linkMicBattleArmiesMessage.baseMessage.createTime;
                        c975470bUX.LIZIZ++;
                        long j5 = c975470bUX.LIZJ;
                        if (z) {
                            j3 = c975470bUX.LIZ;
                        }
                        c975470bUX.LIZJ = j5 + (jLIZ - j3);
                        c975470bUX.LIZLLL += j - j4;
                        c975470bUX.LJ += jLIZ - j;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("updateScoreTimeRecord: isUpdateByGift ");
                        sbLIZ2.append(z);
                        sbLIZ2.append(", scoreUpdateCount ");
                        sbLIZ2.append(c975470bUX.LIZIZ);
                        sbLIZ2.append(", scoreUpdateDelaySum ");
                        sbLIZ2.append(c975470bUX.LIZJ);
                        sbLIZ2.append(", scoreMesssageDelaySum ");
                        sbLIZ2.append(c975470bUX.LIZLLL);
                        sbLIZ2.append(",  clientScoreUpdateDelaySum ");
                        sbLIZ2.append(c975470bUX.LJ);
                        C20441214yg.LIZIZ("MatchScoreAccuracyHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            } else if (abstractC1136060ffY instanceof LinkMicBattleMessage) {
                C985780blA c985780blA2 = (C985780blA) interfaceC977420bXg;
                c985780blA2.getClass();
                c985780blA2.LJIIJ(((LinkMicBattleMessage) abstractC1136060ffY).fuzzyDisplayConfigV2);
            }
        }
        InterfaceC977420bXg interfaceC977420bXg2 = this.LL;
        if (interfaceC977420bXg2 instanceof C158N) {
            C158N c158n = (C158N) interfaceC977420bXg2;
            c158n.getClass();
            C20441214yg.LIZIZ("LiveMatchEffectComponent", "onReceiveMessage");
            if (abstractC1136060ffY instanceof LinkMicBattleArmiesMessage) {
                C158M c158m = c158n.LLILLL;
                if (c158m != null) {
                    c158m.LIZIZ(((LinkMicBattleArmiesMessage) abstractC1136060ffY).effectInfos);
                    return;
                }
                return;
            }
            if (!(abstractC1136060ffY instanceof BattleGameplayMessage)) {
                return;
            }
            BattleGameplayMessage battleGameplayMessage = (BattleGameplayMessage) abstractC1136060ffY;
            if (battleGameplayMessage.gameplayType == 2 && battleGameplayMessage.updateType == 1) {
                C975960bVK c975960bVK = c158n.LLIZ;
                if (c975960bVK != null) {
                    c975960bVK.LJJLIIIJLJLI = true;
                }
                IceShowdownInfo iceShowdownInfo = battleGameplayMessage.iceShowdownInfo;
                if (iceShowdownInfo != null) {
                    lValueOf = Long.valueOf(iceShowdownInfo.promptTimeMs);
                } else {
                    lValueOf = null;
                }
                IceShowdownInfo iceShowdownInfo2 = battleGameplayMessage.iceShowdownInfo;
                if (iceShowdownInfo2 != null) {
                    lValueOf2 = Long.valueOf(iceShowdownInfo2.startTimeMs);
                } else {
                    lValueOf2 = null;
                }
                c158n.LJIILIIL(lValueOf, lValueOf2, null);
                return;
            }
            C20441214yg.LJ("LiveMatchEffectComponent", "handleGamePlayMessage return for gameplayType is not MATCH_OPTION_ICE_SHOWDOWN.");
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
        C975960bVK c975960bVK;
        this.LL.dismiss();
        this.LL.reset();
        if ((interfaceC963620bBQ instanceof C975960bVK) && (c975960bVK = (C975960bVK) interfaceC963620bBQ) != null) {
            c975960bVK.LJJLIIIJJIZ = 0L;
            c975960bVK.LJJLIIIJL = 0L;
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
        C975960bVK c975960bVK;
        InterfaceC977420bXg interfaceC977420bXg = this.LL;
        if (interfaceC963620bBQ instanceof C975960bVK) {
            c975960bVK = (C975960bVK) interfaceC963620bBQ;
        } else {
            c975960bVK = null;
        }
        interfaceC977420bXg.LJFF(c975960bVK);
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
        this.LL.LJII(battleInfoResponse);
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
        if (abstractC970850bN5 instanceof C970840bN4) {
            this.LL.LJII(((C970840bN4) abstractC970850bN5).LIZ);
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void vc(List<C954460awe> list, List<C954460awe> list2) {
        C985780blA c985780blA;
        Fragment fragmentLIZ;
        IMatchItemAbility iMatchItemAbility;
        C977470bXl c977470bXl;
        InterfaceC977420bXg interfaceC977420bXg = this.LL;
        if (interfaceC977420bXg instanceof C985780blA) {
            c985780blA = (C985780blA) interfaceC977420bXg;
        } else {
            c985780blA = null;
        }
        if (c985780blA != null) {
            c985780blA.LJIIIIZZ();
            if (LiveMatchDropOffSetting.INSTANCE.isEnable() && C970370bMJ.LJIIIZ() && C915980Zwa.LJFF().RY(false).compareTo(EnumC964170bCJ.PUNISH_START) < 0) {
                C985780blA.LJI(c985780blA);
            }
        }
        InterfaceC977420bXg interfaceC977420bXg2 = this.LL;
        if ((interfaceC977420bXg2 instanceof C977470bXl) && (c977470bXl = (C977470bXl) interfaceC977420bXg2) != null && !list.isEmpty()) {
            c977470bXl.LLILZIL = list;
        }
        if (!list.isEmpty()) {
            if (list2 != null && list.size() == ((ArrayList) list2).size()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<C954460awe> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().LJ));
            }
            MatchBaseWidget matchBaseWidget = this.LLILLL;
            if (matchBaseWidget == null) {
                return;
            }
            InterfaceC1097170eep interfaceC1097170eep = matchBaseWidget.widgetCallback;
            if (((interfaceC1097170eep == null || (fragmentLIZ = interfaceC1097170eep.getFragment()) == null) && (fragmentLIZ = C946803n0.LIZ(matchBaseWidget.getView())) == null) || (iMatchItemAbility = (IMatchItemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ, null), IMatchItemAbility.class, null)) == null) {
                return;
            }
            iMatchItemAbility.eY(arrayList);
        }
    }
}
