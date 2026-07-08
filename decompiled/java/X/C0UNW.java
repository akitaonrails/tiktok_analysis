package X;

import Y.ACListenerS116S0200000_12;
import Y.ACListenerS147S0100000_12;
import Y.AfS148S0200000_12;
import Y.AfS178S0100000_9;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.android.livesdk.dataChannel.QuestionCardChangeTextEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePinCardSetting;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.model.message.QuestionSelectMessage;
import com.bytedance.android.livesdk.model.message.QuestionSlideDownMessage;
import com.bytedance.android.livesdk.qa.CloseQuestionEvent;
import com.bytedance.android.livesdk.qa.CurrentQuestionChannel;
import com.bytedance.android.livesdk.qa.QAApi;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.bytedance.android.livesdk.qa.QuestionRemoveQuestionChannel;
import com.bytedance.android.livesdk.qa.ReportQuestionDialog;
import com.bytedance.android.livesdk.slot.FullBottomContainerHeightChannel;
import com.bytedance.android.livesdkapi.depend.model.live.CurrentInteractionQuestion;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS221S0300000_12;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UNW, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UNW extends C0UTI implements OnMessageListener {
    public static final /* synthetic */ int LLJILLL = 0;
    public boolean LLILZIL;
    public long LLILZLL;
    public C1107460evQ LLIZ;
    public Question LLIZLLLIL;
    public ReportQuestionDialog LLJ;
    public IMessageManager LLJIJIL;
    public boolean LLJILJILJ;
    public final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
    public final Map<String, Runnable> LLILLL = new HashMap();
    public final C01GW LLILZ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(552));
    public final C11NJ LLJI = new C11NJ();
    public final C0UNX LLJILJIL = new C0UNX();

    @Override // X.InterfaceC1107910ew9
    public final void LIZJ(EnumC1107860ew4 enumC1107860ew4, boolean z) {
    }

    public final void LJI() {
        LJIIJ(null);
        Question question = this.LLIZLLLIL;
        if (question != null) {
            LJIIIIZZ(this, question);
        }
        this.LLIZLLLIL = null;
        if (this.LLJILJILJ) {
            ((IPinCardService) this.LLILZ.getValue()).Rg(EnumC1107860ew4.QUESTION, EnumC1108010ewJ.OTHERS, null);
            DataChannel dataChannelLJFF = LJFF();
            if (dataChannelLJFF != null) {
                dataChannelLJFF.zW(FullBottomContainerHeightChannel.class, 0);
            }
            DataChannel dataChannelLJFF2 = LJFF();
            if (dataChannelLJFF2 != null) {
                dataChannelLJFF2.LC0(QuestionCardChangeTextEvent.class, Boolean.FALSE);
            }
        }
    }

    public final DataChannel LJFF() {
        C1107460evQ c1107460evQ = this.LLIZ;
        if (c1107460evQ != null) {
            return c1107460evQ.LIZJ;
        }
        return null;
    }

    public final void LJ(Function1<? super Boolean, Unit> function1) {
        Question question;
        long jLongValue;
        Long l;
        if (this.LLILZIL && (question = this.LLIZLLLIL) != null) {
            QAApi qAApi = (QAApi) C482260Ivg.LIZJ(QAApi.class);
            DataChannel dataChannelLJFF = LJFF();
            if (dataChannelLJFF != null && (l = (Long) dataChannelLJFF.gg0(C751340Tdc.class)) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            qAApi.endAnswer(jLongValue, question.questionId).LJIILIIL(new C0UO0()).LJJLL(new AfS148S0200000_12(this, function1, 77), new AfS178S0100000_9(function1, (Function1<? super Throwable, Unit>) 84));
        }
        LJI();
    }

    public final void LJIIJ(Question question) {
        CurrentInteractionQuestion currentInteractionQuestion;
        Room room;
        Room room2;
        if (!((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
            return;
        }
        DataChannel dataChannelLJFF = LJFF();
        if (dataChannelLJFF == null || (room2 = (Room) dataChannelLJFF.gg0(RoomChannel.class)) == null || (currentInteractionQuestion = room2.currentInteractionQuestion) == null) {
            currentInteractionQuestion = new CurrentInteractionQuestion();
        }
        currentInteractionQuestion.question = question;
        DataChannel dataChannelLJFF2 = LJFF();
        if (dataChannelLJFF2 != null && (room = (Room) dataChannelLJFF2.gg0(RoomChannel.class)) != null) {
            room.currentInteractionQuestion = currentInteractionQuestion;
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        AbstractC1136060ffY abstractC1136060ffY;
        if ((iMessage instanceof AbstractC1136060ffY) && (abstractC1136060ffY = (AbstractC1136060ffY) iMessage) != null) {
            if (abstractC1136060ffY instanceof QuestionSlideDownMessage) {
                Question question = this.LLIZLLLIL;
                if (question != null && ((QuestionSlideDownMessage) abstractC1136060ffY).questionId == question.questionId) {
                    LJI();
                    return;
                }
                return;
            }
            if (!(abstractC1136060ffY instanceof QuestionSelectMessage)) {
                return;
            }
            Question question2 = ((QuestionSelectMessage) abstractC1136060ffY).question;
            if (question2.answerFrom != 3) {
                return;
            }
            LJIIIZ(question2, false);
        }
    }

    public static void LJIIIIZZ(C0UNW c0unw, Question question) {
        c0unw.getClass();
        int iUptimeMillis = (int) (SystemClock.uptimeMillis() - c0unw.LLILZLL);
        Long lValueOf = null;
        if (c0unw.LLILZIL) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_qa_card_show_duration");
            c474500IjALIZ.LJIJJLI(c0unw.LJFF());
            c474500IjALIZ.LJJII(0, "question_like");
            Question question2 = c0unw.LLIZLLLIL;
            if (question2 != null) {
                lValueOf = Long.valueOf(question2.questionId);
            }
            c474500IjALIZ.LJJII(lValueOf, "question_id");
            c474500IjALIZ.LJJII(Integer.valueOf(iUptimeMillis), "duration");
            c474500IjALIZ.LJJII(0, "is_timeout");
            c474500IjALIZ.LJJII(Integer.valueOf(question.createFrom), "create_from");
            c474500IjALIZ.LJJII(Integer.valueOf(question.answerFrom), "answer_from");
            c474500IjALIZ.LJJII(question.recReqId, "rec_req_id");
            c474500IjALIZ.LIZ();
            return;
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_qa_card_show_duration");
        c474500IjALIZ2.LJIJJLI(c0unw.LJFF());
        Question question3 = c0unw.LLIZLLLIL;
        if (question3 != null) {
            lValueOf = Long.valueOf(question3.questionId);
        }
        c474500IjALIZ2.LJJII(lValueOf, "question_id");
        c474500IjALIZ2.LJJII(Integer.valueOf(iUptimeMillis), "duration");
        c474500IjALIZ2.LJJII(Integer.valueOf(question.createFrom), "create_from");
        c474500IjALIZ2.LJJII(Integer.valueOf(question.answerFrom), "answer_from");
        c474500IjALIZ2.LIZ();
    }

    @Override // X.InterfaceC1107910ew9
    public final void LIZ(EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map) {
        this.LLJILJILJ = false;
    }

    @Override // X.InterfaceC1107910ew9
    public final void LIZIZ(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
        ReportQuestionDialog reportQuestionDialog = this.LLJ;
        if (reportQuestionDialog != null) {
            reportQuestionDialog.dismiss();
        }
        Question question = this.LLIZLLLIL;
        if (question != null) {
            LJIIIIZZ(this, question);
        }
        this.LLIZLLLIL = null;
        IMessageManager iMessageManager = this.LLJIJIL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LLJI.LJ();
        this.LLILLJJLI.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC1107910ew9
    public final void LIZLLL(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
        boolean zBooleanValue;
        CurrentInteractionQuestion currentInteractionQuestion;
        Question question;
        this.LLIZ = c1107460evQ;
        Boolean bool = (Boolean) c1107460evQ.LIZJ.gg0(UserIsAnchorChannel.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLILZIL = zBooleanValue;
        C1107460evQ c1107460evQ2 = this.LLIZ;
        if (c1107460evQ2 != null) {
            c1107460evQ2.LIZJ.BQ2(c1107460evQ2.LIZIZ, CurrentQuestionChannel.class, new AwS591S0100000_12(this, 1217));
            if (this.LLILZIL) {
                DataChannel dataChannel = c1107460evQ2.LIZJ;
                dataChannel.BQ2(c1107460evQ2.LIZIZ, QuestionRemoveQuestionChannel.class, new AwS591S0100000_12(this, 1218));
                dataChannel.BQ2(c1107460evQ2.LIZIZ, CloseQuestionEvent.class, new AwS588S0100000_9(this, 684));
            }
        }
        IMessageManager iMessageManager = (IMessageManager) c1107460evQ.LIZJ.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            if (!this.LLILZIL) {
                iMessageManager.addMessageListener(C001A.QUESTION_SLIDE_DOWN_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(C001A.QUESTION_SELECT_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(C001A.QUESTION_SWITCH_MESSAGE.getIntType(), this);
            }
            iMessageManager.addMessageListener(C001A.QUESTION_DELETE_MESSAGE.getIntType(), this);
        } else {
            iMessageManager = null;
        }
        this.LLJIJIL = iMessageManager;
        if (!this.LLILZIL) {
            DataChannel dataChannel2 = c1107460evQ.LIZJ;
            Room room = (Room) dataChannel2.gg0(RoomChannel.class);
            if (room != null && (currentInteractionQuestion = room.currentInteractionQuestion) != null && (question = currentInteractionQuestion.question) != null) {
                dataChannel2.zW(CurrentQuestionChannel.class, new QuestionEx(question, currentInteractionQuestion.likeCnt, currentInteractionQuestion.selfLikeStatus, false, false, false, 0L, 0, 0));
            }
        }
        DataChannel dataChannelLJFF = LJFF();
        if (dataChannelLJFF != null) {
            dataChannelLJFF.EQ2(c1107460evQ.LIZIZ, SubOnlyLiveAudienceStatusChannel.class, new AwS591S0100000_12(this, 1216));
        }
    }

    public final void LJII(User user, String str) {
        long j;
        String str2;
        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
        UserProfileEvent userProfileEvent = new UserProfileEvent(user.getId(), str);
        userProfileEvent.setEnigmaOutside(user.enigmaInfo);
        Question question = this.LLIZLLLIL;
        if (question != null) {
            j = question.questionId;
        } else {
            j = 0;
        }
        userProfileEvent.msgId = j;
        if (question != null) {
            str2 = question.content;
        } else {
            str2 = null;
        }
        userProfileEvent.content = str2;
        userProfileEvent.chatType = "3";
        userProfileEvent.mReportType = "report_question";
        userProfileEvent.setClickUserPosition("qa_card");
        c784440UpuLIZ.LIZIZ(userProfileEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(com.bytedance.android.livesdk.model.message.Question r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UNW.LJIIIZ(com.bytedance.android.livesdk.model.message.Question, boolean):void");
    }

    @Override // X.InterfaceC1107910ew9
    public final void LLLZIIL(View view, Map<String, ? extends Object> map) {
        C1107460evQ c1107460evQ = this.LLIZ;
        if (c1107460evQ != null) {
            DataChannel dataChannel = c1107460evQ.LIZJ;
            LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.e2x);
            if (liveIconView != null) {
                C786410Ut5.g8(liveIconView, new ACListenerS147S0100000_12(this, 476));
                View viewFindViewById = view.findViewById(R.id.sl5);
                if (viewFindViewById != null) {
                    C500260Jjc.LJLIIIL(240L, viewFindViewById, new AwS221S0300000_12(this, view, dataChannel, 33));
                }
                if (!C162200jk.LIZ(dataChannel)) {
                    C786410Ut5.I7(new ACListenerS116S0200000_12(this, dataChannel, 103), view);
                }
                view.setOnLongClickListener(new ViewOnLongClickListenerC785900UsG(this, dataChannel, 1));
                IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                if (iBroadcastService != null) {
                    iBroadcastService.notifyApplyStatusAndSaveStatus(EnumC773040UUc.LIGHTING_QUESTION, EnumC771230UNd.APPLYING, null);
                }
                View viewFindViewById2 = view.findViewById(R.id.sl3);
                if (viewFindViewById2 != null) {
                    LivePinCardSetting livePinCardSetting = LivePinCardSetting.INSTANCE;
                    if (livePinCardSetting.enableQA()) {
                        viewFindViewById2.setMinimumHeight(livePinCardSetting.pinCardMinHeightPx());
                    } else {
                        C500260Jjc.LJJZ(livePinCardSetting.pinCardDefaultHeightPx(), viewFindViewById2);
                    }
                }
            }
        }
        this.LLJILJILJ = true;
    }
}
