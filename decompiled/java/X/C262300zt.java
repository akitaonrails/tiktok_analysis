package X;

import com.bytedance.android.livesdk.dataChannel.GameGuessMessageDisplayEvent;
import com.bytedance.android.livesdk.dataChannel.GameLiveGuessInfoChangeEvent;
import com.bytedance.android.livesdk.game.model.GuessOptions;
import com.bytedance.android.livesdk.game.model.GuessRound;
import com.bytedance.android.livesdk.game.model.GuessRoundStats;
import com.bytedance.android.livesdk.game.model.GuessText;
import com.bytedance.android.livesdk.livesetting.game.GameGuessResultNotifyInterval;
import com.bytedance.android.livesdk.livesetting.game.GameLiveGuessPinGuideTimeSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C262300zt {
    public final DataChannel LIZ;
    public boolean LIZIZ;
    public Room LIZJ;
    public C11JF LIZLLL;
    public C11JF LJ;
    public String LJFF;
    public long LJI;
    public final C01GW LJII = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(531));
    public int LJIIIIZZ;

    public C262300zt(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public final void LIZ(int i) {
        int iIntValue;
        Integer num = (Integer) ((Map) this.LJII.getValue()).get(Integer.valueOf(i));
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        ((Map) this.LJII.getValue()).put(Integer.valueOf(i), Integer.valueOf(iIntValue + 1));
    }

    public final void LIZIZ(GuessRound guessRound, GuessRound guessRound2) {
        boolean z;
        long jLongValue;
        long jLongValue2;
        String strLJIJJ;
        DataChannel dataChannel;
        GuessOptions next;
        GuessText guessText;
        String strLIZ;
        DataChannel dataChannel2;
        int i;
        GuessRoundStats guessRoundStats;
        long j;
        GuessRoundStats guessRoundStats2;
        if (guessRound2 == null) {
            return;
        }
        if (Intrinsics.LJFF(guessRound2.operatorId, String.valueOf(UserService.getInstance().user().getCurrentUserId())) && guessRound2.guessStatus == 0 && !Intrinsics.LJFF(this.LJFF, guessRound2.roundIdStr) && ((guessRoundStats2 = guessRound2.guessRoundStats) == null || guessRoundStats2.memberNums == 0)) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (!z) {
            C11JF c11jf = this.LJ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LJ = null;
        } else {
            if (guessRound != null) {
                str = guessRound.roundIdStr;
            }
            if (!Intrinsics.LJFF(str, guessRound2.roundIdStr)) {
                try {
                    String strLIZ2 = InterfaceC772390URp.f133i0.LIZ();
                    if (strLIZ2 == null) {
                        strLIZ2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    Long lLJIILIIL = C2095008Iq.LJIILIIL(strLIZ2);
                    if (lLJIILIIL != null) {
                        jLongValue = lLJIILIIL.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    String strLIZ3 = InterfaceC772390URp.j0.LIZ();
                    if (strLIZ3 == null) {
                        strLIZ3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    Long lLJIILIIL2 = C2095008Iq.LJIILIIL(strLIZ3);
                    if (lLJIILIIL2 != null) {
                        jLongValue2 = lLJIILIIL2.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    if (jLongValue < 3) {
                        if (!C1387310mCn.LJ(jLongValue2)) {
                            C11JF c11jf2 = this.LJ;
                            if (c11jf2 != null) {
                                c11jf2.dispose();
                            }
                            this.LJ = (C11JF) C11NZ.LJLJJLL(GameLiveGuessPinGuideTimeSetting.INSTANCE.getValue(), TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C516201zk(this, 319), new C09JN() { // from class: X.00qW
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    C1C7U.LIZ("GuessMessageDisplayManager@eb9f.handlePinGuideDisplay$2");
                                    C20441214yg.LJI("GuessMessageDisplay", (Throwable) obj);
                                    C1C7U.LIZIZ("GuessMessageDisplayManager@eb9f.handlePinGuideDisplay$2");
                                }
                            });
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJI("GuessMessageDisplay", e);
                }
            }
        }
        if (this.LIZIZ && guessRound != null && guessRound.guessStatus == 0 && (((i = guessRound2.guessStatus) == 1 || i == 2) && (guessRoundStats = guessRound2.guessRoundStats) != null)) {
            long j2 = guessRoundStats.memberNums;
            if (j2 > 0 && (this.LJI <= 0 || System.currentTimeMillis() - this.LJI >= GameGuessResultNotifyInterval.INSTANCE.getValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT))) {
                this.LJI = System.currentTimeMillis();
                String strLIZ4 = AnonymousClass0104.LIZ(j2);
                GuessRoundStats guessRoundStats3 = guessRound2.guessRoundStats;
                if (guessRoundStats3 != null) {
                    j = guessRoundStats3.pointsNum;
                } else {
                    j = 0;
                }
                long j3 = j / ((long) 100);
                String strLJIIL = C497740JfY.LJIIL(2131755890, (int) j2, strLIZ4, C497740JfY.LJIIL(2131755891, (int) j3, AnonymousClass0104.LIZ(j3)));
                DataChannel dataChannel3 = this.LIZ;
                if (dataChannel3 != null) {
                    dataChannel3.LC0(GameGuessMessageDisplayEvent.class, new C774740UaG(strLJIIL, EnumC262400zu.GUESS_MSG_GUESS_RESULT.ordinal(), null, null, 10000L, 26));
                }
            }
        }
        if (this.LIZIZ && ((guessRound == null || guessRound.guessStatus != guessRound2.guessStatus) && (dataChannel2 = this.LIZ) != null)) {
            dataChannel2.LC0(GameLiveGuessInfoChangeEvent.class, new Object() { // from class: X.00zy
            });
        }
        if (!this.LIZIZ && !Intrinsics.LJFF(guessRound2.operatorId, String.valueOf(UserService.getInstance().user().getCurrentUserId()))) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleGuessOperationMsg, isAnchor: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", operatorId: ");
        sbLIZ.append(guessRound2.operatorId);
        sbLIZ.append(", currentUserId: ");
        sbLIZ.append(UserService.getInstance().user().getCurrentUserId());
        C20441214yg.LIZIZ("GuessMessageDisplay", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZIZ && !Intrinsics.LJFF(guessRound2.anchorId, guessRound2.operatorId)) {
            if ((guessRound != null && guessRound.guessStatus == guessRound2.guessStatus && (guessRound2.guessStatus != 2 || Intrinsics.LJFF(guessRound.winOption, guessRound2.winOption))) || Intrinsics.LJFF(guessRound2.operatorId, CardStruct.IStatusCode.DEFAULT)) {
                return;
            }
            String str2 = "";
            if (Intrinsics.LJFF(guessRound2.operatorId, "")) {
                return;
            }
            int i2 = guessRound2.guessStatus;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 20) {
                            return;
                        } else {
                            strLJIJJ = C497740JfY.LJIJJ(2131852787, C297401Dg.LIZIZ(guessRound2.operatorName), C497740JfY.LJIJI(2131852802));
                        }
                    } else {
                        String str3 = guessRound2.winOption;
                        Iterator<GuessOptions> it2 = guessRound2.guessOptions.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(next.optionIdStr, str3)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        GuessOptions guessOptions = next;
                        if (guessOptions != null && (guessText = guessOptions.text) != null) {
                            long j4 = guessText.type;
                            if (j4 == 1) {
                                strLIZ = C297401Dg.LIZ(guessText.key);
                            } else if (j4 != 2) {
                                strLIZ = "";
                                str2 = strLIZ;
                            } else {
                                strLIZ = guessText.desc;
                            }
                            if (strLIZ != null) {
                                str2 = strLIZ;
                            }
                        }
                        strLJIJJ = C497740JfY.LJIJJ(2131852787, C297401Dg.LIZIZ(guessRound2.operatorName), str2);
                    }
                } else {
                    strLJIJJ = C497740JfY.LJIJJ(2131852789, C297401Dg.LIZIZ(guessRound2.operatorName));
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("handleModeratorOperationNotifyInfo, isAnchor: ");
                sbLIZ2.append(this.LIZIZ);
                sbLIZ2.append(", isAutoPin: ");
                sbLIZ2.append(guessRound2.isAutoPin);
                C20441214yg.LIZIZ("GuessMessageDisplay", C2188811AlT.LIZIZ(sbLIZ2));
                if (guessRound2.isAutoPin) {
                    strLJIJJ = C497740JfY.LJIJJ(2131852786, C297401Dg.LIZIZ(guessRound2.operatorName));
                } else {
                    strLJIJJ = C497740JfY.LJIJJ(2131852788, C297401Dg.LIZIZ(guessRound2.operatorName));
                }
            }
            if (strLJIJJ == null || (dataChannel = this.LIZ) == null) {
                return;
            }
            dataChannel.LC0(GameGuessMessageDisplayEvent.class, new C774740UaG(strLJIJJ, EnumC262400zu.GUESS_MSG_MODERATOR.ordinal(), null, null, 10000L, 26));
            return;
        }
        if ((guessRound != null && guessRound.guessStatus == guessRound2.guessStatus) || guessRound2.guessStatus != 0) {
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("handleSelfOperationNotifyInfo, isAnchor: ");
        sbLIZ3.append(this.LIZIZ);
        sbLIZ3.append(", isAutoPin: ");
        sbLIZ3.append(guessRound2.isAutoPin);
        C20441214yg.LIZIZ("GuessMessageDisplay", C2188811AlT.LIZIZ(sbLIZ3));
        if (guessRound2.isAutoPin) {
            if (this.LIZIZ) {
                DataChannel dataChannel4 = this.LIZ;
                if (dataChannel4 == null) {
                    return;
                }
                dataChannel4.LC0(GameGuessMessageDisplayEvent.class, new C774740UaG(C497740JfY.LJIJI(2131852771), EnumC262400zu.GUESS_MSG_NORMAL.ordinal(), null, null, Mp4ScreenVideoLoadTimeout.CONTROL, 26));
                return;
            }
            C766270U4b.LJIIIIZZ(Mp4ScreenVideoLoadTimeout.CONTROL, ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopContext(), C497740JfY.LJIJI(2131852771));
            return;
        }
        if (this.LIZIZ) {
            DataChannel dataChannel5 = this.LIZ;
            if (dataChannel5 == null) {
                return;
            }
            dataChannel5.LC0(GameGuessMessageDisplayEvent.class, new C774740UaG(C497740JfY.LJIJI(2131853578), EnumC262400zu.GUESS_MSG_NORMAL.ordinal(), null, null, Mp4ScreenVideoLoadTimeout.CONTROL, 26));
            return;
        }
        C766270U4b.LJIIIIZZ(Mp4ScreenVideoLoadTimeout.CONTROL, ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopContext(), C497740JfY.LJIJI(2131853578));
    }

    public final void LIZJ(int i, int i2, String str, String str2) {
        String str3;
        Long lValueOf;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str3 = "";
                } else {
                    str3 = "capsule";
                }
            } else {
                str3 = "outofapp_toast";
            }
        } else {
            str3 = "inapp_toast";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_guessing_audience_request");
        Room room = this.LIZJ;
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJIJIIJI(lValueOf);
        Room room2 = this.LIZJ;
        if (room2 != null) {
            lValueOf2 = Long.valueOf(room2.getOwnerUserId());
        }
        c474500IjALIZ.LJI(lValueOf2);
        c474500IjALIZ.LJJII(str3, "tips_type");
        c474500IjALIZ.LJ(str);
        c474500IjALIZ.LJJII(str2, "request_nums");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "show_rank");
        c474500IjALIZ.LJIJJLI(this.LIZ);
        c474500IjALIZ.LIZ();
    }
}
