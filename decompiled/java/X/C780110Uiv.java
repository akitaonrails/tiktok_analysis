package X;

import com.bytedance.android.live.publicscreen.api.BackToAppEvent;
import com.bytedance.android.live.publicscreen.api.TipMessageChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import com.bytedance.android.livesdk.model.message.PollEndContent;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Uiv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780110Uiv implements OnMessageListener, InterfaceC777850UfH {
    public IMessageManager LL;
    public final DataChannel LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public int LLILZLL;
    public long LLIZ;
    public int LLIZLLLIL;
    public String LLILZIL = "";
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1462));

    public final HashMap<String, String> LIZ() {
        return (HashMap) this.LLJ.getValue();
    }

    @Override // X.InterfaceC777850UfH
    public final void LJI(AbstractC777950UfR abstractC777950UfR) {
        if (abstractC777950UfR instanceof C778910Ugz) {
            LIZIZ(true, ((C778910Ugz) abstractC777950UfR).LJFF);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        PollEndContent pollEndContent;
        List<PollOptionInfo> list;
        List<PollOptionInfo> list2;
        String str;
        if (iMessage instanceof PollMessage) {
            PollMessage pollMessage = (PollMessage) iMessage;
            long j = pollMessage.messageType;
            if (j == 1) {
                this.LLILZIL = "";
                LIZ().clear();
                Integer num = pollMessage.pollKind;
                if (num != null && num.intValue() == 3) {
                    this.LLILZLL = 0;
                    this.LLIZ = 0L;
                    this.LLIZLLLIL = -1;
                    PollEndContent pollEndContent2 = pollMessage.endContent;
                    if (pollEndContent2 != null && (list2 = pollEndContent2.optionList) != null) {
                        this.LLILZLL = list2.size();
                        long j2 = 0;
                        for (PollOptionInfo pollOptionInfo : list2) {
                            if (pollOptionInfo != null) {
                                this.LLIZ += pollOptionInfo.votes;
                                LIZ().put(String.valueOf(pollOptionInfo.optionIndex + 1), String.valueOf(pollOptionInfo.votes));
                                long j3 = pollOptionInfo.votes;
                                if (j3 > j2) {
                                    this.LLIZLLLIL = pollOptionInfo.optionIndex + 1;
                                    j2 = j3;
                                } else if (j3 == j2) {
                                    this.LLIZLLLIL = -1;
                                }
                            }
                        }
                        if (j2 != 0) {
                            int i = this.LLIZLLLIL;
                            if (i != -1) {
                                if (i - 1 > 26) {
                                    Throwable th = new Throwable();
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("PollAndGiftVote : length of optionList is ");
                                    sbLIZ.append(list2.size());
                                    sbLIZ.append(", winner index=");
                                    sbLIZ.append(this.LLIZLLLIL - 1);
                                    C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ), th);
                                } else {
                                    PollOptionInfo pollOptionInfo2 = (PollOptionInfo) C13LP.LJJJLZIJ(i - 1, list2);
                                    if (pollOptionInfo2 != null && (str = pollOptionInfo2.displayContent) != null) {
                                        LIZJ(EnumC778100Ufg.LIVE_TIP_GIFT_TEXT_POLL_END.ordinal(), u.LJJIFFI(u.LJJIFFI(C497740JfY.LJIJI(2131852600), "{option_a}", String.valueOf((char) (((char) (this.LLIZLLLIL + 65)) - 1)), false), "{option_desc}", str, false), pollMessage);
                                    }
                                }
                            } else {
                                LIZJ(EnumC778100Ufg.LIVE_TIP_GIFT_TEXT_POLL_END.ordinal(), u.LJJIFFI(C497740JfY.LJIJI(2131852604), "{vote}", C497740JfY.LJIJI(2131852599), false), pollMessage);
                            }
                            if (!GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                                LIZIZ(true, pollMessage);
                            }
                        }
                    }
                } else {
                    Integer num2 = pollMessage.pollKind;
                    if (num2 != null && num2.intValue() == 4 && (pollEndContent = pollMessage.endContent) != null && (list = pollEndContent.optionList) != null) {
                        try {
                            PollOptionInfo pollOptionInfo3 = (PollOptionInfo) C13LP.LJJJLZIJ(0, list);
                            if (pollOptionInfo3 != null) {
                                this.LLILLL = pollOptionInfo3.votes;
                                LIZ().put("1", String.valueOf(this.LLILLL));
                                PollOptionInfo pollOptionInfo4 = (PollOptionInfo) C13LP.LJJJLZIJ(1, list);
                                if (pollOptionInfo4 != null) {
                                    this.LLILZ = pollOptionInfo4.votes;
                                    LIZ().put("2", String.valueOf(this.LLILZ));
                                    long j4 = this.LLILLL;
                                    if (j4 != 0 || this.LLILZ != 0) {
                                        long j5 = this.LLILZ;
                                        if (j4 > j5) {
                                            LIZJ(EnumC778100Ufg.LIVE_TIP_GIFT_QUICK_POLL_RED_STAR_WIN.ordinal(), C497740JfY.LJIJI(2131852597), pollMessage);
                                        } else if (j4 < j5) {
                                            LIZJ(EnumC778100Ufg.LIVE_TIP_GIFT_QUICK_POLL_BLUE_HEART_WIN.ordinal(), C497740JfY.LJIJI(2131852591), pollMessage);
                                        } else {
                                            LIZJ(EnumC778100Ufg.LIVE_TIP_GIFT_QUICK_POLL_TIE_VOTE.ordinal(), u.LJJIFFI(C497740JfY.LJIJI(2131852604), "{vote}", C497740JfY.LJIJI(2131852595), false), pollMessage);
                                        }
                                        if (!GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                                            LIZIZ(true, pollMessage);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("optionList.size=");
                            sbLIZ2.append(list.size());
                            sbLIZ2.append(", message=");
                            sbLIZ2.append(e.getMessage());
                            C20441214yg.LJ("GameUiStrategy", C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }
                }
                ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(0, "g_interaction_vote_enable");
                return;
            }
            if (j == 0) {
                ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(1, "g_interaction_vote_enable");
            }
        }
    }

    public C780110Uiv(DataChannel dataChannel, IMessageManager iMessageManager) {
        this.LL = iMessageManager;
        this.LLILLJJLI = dataChannel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(boolean r16, com.bytedance.android.livesdk.model.message.PollMessage r17) {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C780110Uiv.LIZIZ(boolean, com.bytedance.android.livesdk.model.message.PollMessage):void");
    }

    @Override // X.InterfaceC777850UfH
    public final void LJII(AbstractC777950UfR abstractC777950UfR, EnumC778130Ufj enumC778130Ufj) {
        if ((abstractC777950UfR instanceof C778910Ugz) && enumC778130Ufj == EnumC778130Ufj.USER_CLICK) {
            LIZIZ(false, ((C778910Ugz) abstractC777950UfR).LJFF);
            this.LLILLJJLI.FQ2(BackToAppEvent.class);
        }
    }

    public final void LIZJ(int i, CharSequence charSequence, PollMessage pollMessage) {
        String str;
        this.LLILZIL = charSequence.toString();
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            if (i == EnumC778100Ufg.LIVE_TIP_GIFT_QUICK_POLL_RED_STAR_WIN.ordinal()) {
                str = "red";
            } else if (i == EnumC778100Ufg.LIVE_TIP_GIFT_QUICK_POLL_BLUE_HEART_WIN.ordinal()) {
                str = "blue";
            } else if (i == EnumC778100Ufg.LIVE_TIP_GIFT_TEXT_POLL_END.ordinal()) {
                str = "end";
            } else {
                str = "default";
            }
            C777840UfG.LJII(new C778910Ugz(str, this.LLILZIL, pollMessage));
            return;
        }
        this.LLILLJJLI.zW(TipMessageChannel.class, new C778500UgK(charSequence, i, pollMessage, 8));
    }
}
