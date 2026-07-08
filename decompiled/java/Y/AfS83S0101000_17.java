package Y;

import X.C09JN;
import X.C0IJT;
import X.C1086780eO4;
import X.C1086800eO6;
import X.C1086850eOB;
import X.C1096970eeV;
import X.C1096990eeX;
import X.C1161920gLG;
import X.C1C7U;
import X.C2188811AlT;
import X.C474500IjA;
import X.C780320UjG;
import X.CountDownTimerC1086810eO7;
import X.EnumC771230UNd;
import X.EnumC773040UUc;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.dataChannel.AnchorPollEndEvent;
import com.bytedance.android.livesdk.game.model.GameTaskInfo;
import com.bytedance.android.livesdk.game.model.GuessTaskPackInfo;
import com.bytedance.android.livesdk.interaction.poll.network.EndPollResponse;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollDurationSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.PollData;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class AfS83S0101000_17 implements C09JN {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS83S0101000_17 afS83S0101000_17, Object obj) {
        Long lValueOf;
        Gift gift;
        Long lValueOf2;
        Long lValueOf3;
        Gift gift2;
        Gift gift3;
        Long lValueOf4;
        Gift gift4;
        String str;
        HashMap map;
        IBroadcastService iBroadcastService;
        C1C7U.LIZ("BroadcastPollCountdownUtil@43c8.endPoll$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        CountDownTimerC1086810eO7 countDownTimerC1086810eO7 = C1086800eO6.LIZIZ;
        if (countDownTimerC1086810eO7 != null) {
            countDownTimerC1086810eO7.cancel();
        }
        PollData pollData = ((EndPollResponse) baseResponse.data).pollData;
        int i = afS83S0101000_17.i1;
        DataChannel dataChannel = C1086800eO6.LJI;
        HashMap map2 = new HashMap();
        C1086850eOB pollGifts = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getPollGifts();
        String str2 = "normal_poll";
        if (pollData.pollKind == 0) {
            map2.put("winner", pollData.LIZJ());
            map2.put("poll_type", "normal_poll");
            map2.put("poll_result", pollData.LIZIZ());
        } else {
            if (Intrinsics.LJFF(pollData.LIZ(), CardStruct.IStatusCode.DEFAULT)) {
                if (pollGifts != null && (gift4 = pollGifts.LIZ) != null) {
                    lValueOf4 = Long.valueOf(gift4.id);
                } else {
                    lValueOf4 = null;
                }
                map2.put("winner", String.valueOf(lValueOf4));
            } else if (Intrinsics.LJFF(pollData.LIZ(), "1")) {
                if (pollGifts != null && (gift = pollGifts.LIZIZ) != null) {
                    lValueOf = Long.valueOf(gift.id);
                } else {
                    lValueOf = null;
                }
                map2.put("winner", String.valueOf(lValueOf));
            } else {
                map2.put("winner", pollData.LIZ());
            }
            map2.put("poll_type", "gift_poll");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("{gift_1_id: ");
            sbLIZ.append(((PollOptionInfo) ListProtector.get(pollData.pollOptionList, 0)).votes);
            sbLIZ.append(" , gift_2_id: ");
            sbLIZ.append(((PollOptionInfo) ListProtector.get(pollData.pollOptionList, 1)).votes);
            sbLIZ.append('}');
            map2.put("poll_result", C2188811AlT.LIZIZ(sbLIZ));
            if (pollGifts != null && (gift3 = pollGifts.LIZ) != null) {
                lValueOf2 = Long.valueOf(gift3.id);
            } else {
                lValueOf2 = null;
            }
            map2.put("gift_1_id", String.valueOf(lValueOf2));
            if (pollGifts != null && (gift2 = pollGifts.LIZIZ) != null) {
                lValueOf3 = Long.valueOf(gift2.id);
            } else {
                lValueOf3 = null;
            }
            map2.put("gift_2_id", String.valueOf(lValueOf3));
            map2.put("gift_1_cnts", String.valueOf(((PollOptionInfo) ListProtector.get(pollData.pollOptionList, 0)).votes));
            map2.put("gift_2_cnts", String.valueOf(((PollOptionInfo) ListProtector.get(pollData.pollOptionList, 1)).votes));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_poll_end");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(pollData.pollId), "poll_id");
        c474500IjALIZ.LJJII(Long.valueOf(LivePollDurationSetting.INSTANCE.getMillisecond() - (pollData.endTime - pollData.startTime)), "time_remain");
        if (pollData.pollKind != 0) {
            str2 = "gift_poll";
        }
        c474500IjALIZ.LJJII(str2, "poll_type");
        c474500IjALIZ.LJJII(pollData.LIZJ(), "winner");
        if (i != 0) {
            if (i != 1) {
                str = "other";
            } else {
                str = "anchor_click_end";
            }
        } else {
            str = "time_up";
        }
        c474500IjALIZ.LJJII(str, "end_reason");
        c474500IjALIZ.LJJIIZI(map2);
        c474500IjALIZ.LIZ();
        DataChannel dataChannel2 = C1086800eO6.LJI;
        if (dataChannel2 == null || (map = (HashMap) dataChannel2.gg0(C780320UjG.class)) == null) {
            map = new HashMap();
        }
        map.put(Integer.valueOf(((EndPollResponse) baseResponse.data).pollData.pollKind), ((EndPollResponse) baseResponse.data).pollData);
        if (((EndPollResponse) baseResponse.data).pollData.pollKind == 0 && (iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)) != null) {
            iBroadcastService.notifyApplyStatusAndSaveStatus(EnumC773040UUc.POLL_NORMAL, EnumC771230UNd.APPLY_FINISH, null);
        }
        DataChannel dataChannel3 = C1086800eO6.LJI;
        if (dataChannel3 != null) {
            dataChannel3.SX0(C780320UjG.class, map);
            dataChannel3.SX0(C1086780eO4.class, 0L);
            dataChannel3.LC0(AnchorPollEndEvent.class, Integer.valueOf(afS83S0101000_17.i1));
        }
        Function1 function1 = (Function1) afS83S0101000_17.l0;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        C1C7U.LIZIZ("BroadcastPollCountdownUtil@43c8.endPoll$2");
    }

    public static final void accept$1(AfS83S0101000_17 afS83S0101000_17, Object obj) {
        GameTaskInfo next;
        String str;
        C1C7U.LIZ("PointsShortTouchViewModel@559d.startShowShortTouchDelayDisable$2");
        C1096990eeX c1096990eeX = (C1096990eeX) afS83S0101000_17.l0;
        int i = afS83S0101000_17.i1;
        if (c1096990eeX.LLJILJIL != null) {
            GuessTaskPackInfo guessTaskPackInfo = c1096990eeX.LLJI.LIZIZ;
            if (guessTaskPackInfo != null) {
                Iterator<GameTaskInfo> it2 = guessTaskPackInfo.tasksInfo.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        String str2 = next.taskId;
                        GameTaskInfo gameTaskInfo = c1096990eeX.LLJILJIL;
                        if (gameTaskInfo != null) {
                            str = gameTaskInfo.taskId;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str2, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                GameTaskInfo gameTaskInfo2 = next;
                if (gameTaskInfo2 != null) {
                    GameTaskInfo gameTaskInfo3 = c1096990eeX.LLJILJIL;
                    if (gameTaskInfo3 != null) {
                        gameTaskInfo2.currentValue = gameTaskInfo3.currentValue + i;
                    }
                    c1096990eeX.LLJI.getClass();
                    c1096990eeX.LJIIIIZZ(new C1096970eeV(guessTaskPackInfo, true), true, false);
                }
            }
            c1096990eeX.LLJILJIL = null;
        }
        C1C7U.LIZIZ("PointsShortTouchViewModel@559d.startShowShortTouchDelayDisable$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS83S0101000_17(int i, int i2, Function1<? super Boolean, Unit> function1) {
        this.$t = function1;
        this.i1 = i;
        this.l0 = i2;
    }
}
