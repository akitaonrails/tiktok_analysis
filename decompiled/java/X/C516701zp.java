package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettleEnd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.anchor.NoticeboardCreateAndUpdateChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardUpdateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFetchDetailParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookPopulateParams;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordFetchListResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.grouplive.assem.mvpseat.GroupLiveMvpSeatAssem;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import tikcast.api.perception.ViolationStatusResponse;
import tikcast.linkmic.controller.ChangeStateReq;
import tikcast.linkmic.controller.ChangeStateResp;
import webcast.data.multi_guest_play.NoticeboardContent;
import webcast.data.multi_guest_play.TextHeaderRecordInfo;
import webcast.data.multi_guest_play.TextHeaderTemplateExt;

/* JADX INFO: renamed from: X.01zp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C516701zp implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
        }
    }

    public static final void accept$0(C516701zp c516701zp, Object obj) {
        C1C7U.LIZ("VoiceChatModeratorMuteGuestManager@c530.manageGuestAudio$2");
        Throwable th = (Throwable) obj;
        C308901Hr c308901Hr = (C308901Hr) c516701zp.l0;
        User user = (User) c516701zp.l1;
        Context context = (Context) c516701zp.l2;
        c308901Hr.getClass();
        if ((th instanceof C501470JlZ) && ((C501520Jle) th).getErrorCode() == 4004269) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843402, C0KVU.LIZ(user)));
        } else if (th != null && context != null) {
            C501540Jlg.LIZJ(context, th);
        }
        C1C7U.LIZIZ("VoiceChatModeratorMuteGuestManager@c530.manageGuestAudio$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(C516701zp c516701zp, Object obj) {
        NoticeboardContent noticeboardContent;
        long j;
        int i;
        C1C7U.LIZ("NoticeboardUtils@5337.updateBoard$2");
        NoticeboardUpdateResponse.ResponseData responseData = (NoticeboardUpdateResponse.ResponseData) ((BaseResponse) obj).data;
        if (responseData != null) {
            noticeboardContent = responseData.noticeboardContent;
        } else {
            noticeboardContent = null;
        }
        InterfaceC1631630sYr interfaceC1631630sYr = (InterfaceC1631630sYr) c516701zp.l0;
        Boolean bool = Boolean.TRUE;
        long j2 = 0;
        if (noticeboardContent != null) {
            j = noticeboardContent.noticeboardId;
        } else {
            j = 0;
        }
        Long lValueOf = Long.valueOf(j);
        if (noticeboardContent != null) {
            i = noticeboardContent.status;
        } else {
            i = -1;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (noticeboardContent != null) {
            j2 = noticeboardContent.version;
        }
        interfaceC1631630sYr.invoke(bool, lValueOf, numValueOf, Long.valueOf(j2));
        DataChannel dataChannel = (DataChannel) c516701zp.l1;
        if (dataChannel != null) {
            dataChannel.zW(NoticeboardCreateAndUpdateChannel.class, new C462701r7(((C953600avG) c516701zp.l2).LIZ));
        }
        C1C7U.LIZIZ("NoticeboardUtils@5337.updateBoard$2");
    }

    public static final void accept$10(C516701zp c516701zp, Object obj) {
        C1C7U.LIZ("GroupLiveMvpSeatAssem@92f0.initObservers$1$3$2");
        ((GroupLiveMvpSeatAssem) c516701zp.l0).Ho((CompetitionSettleEnd) c516701zp.l1, (View) c516701zp.l2);
        C1C7U.LIZIZ("GroupLiveMvpSeatAssem@92f0.initObservers$1$3$2");
    }

    public static final void accept$11(C516701zp c516701zp, Object obj) {
        C1C7U.LIZ("RootPageImpl@f0fe.monitorNextPageStayMs$3");
        C438101n9.LIZIZ((C259800zU) c516701zp.l2, (AbstractC1387200mCc) obj, new C020Y((C259800zU) c516701zp.l0, (C259800zU<Long>) c516701zp.l1, (C238400w2) 42));
        C1C7U.LIZIZ("RootPageImpl@f0fe.monitorNextPageStayMs$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(C516701zp c516701zp, Object obj) {
        C1C7U.LIZ("AnchorTextHeaderViewModel@2fc0.fetchRecordList$2");
        C470590Icr c470590Icr = (C470590Icr) obj;
        TextHeaderRecordFetchListResponse.ResponseData responseData = (TextHeaderRecordFetchListResponse.ResponseData) c470590Icr.data;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && responseData != null) {
            List<TextHeaderRecordInfo> list = responseData.textHeaderRecordList;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<TextHeaderRecordInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C972080bP4.LJFF(it2.next()));
            }
            List<TextHeaderRecordInfo> list2 = responseData.templateRecordList;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (TextHeaderRecordInfo textHeaderRecordInfo : list2) {
                TextHeaderTemplateExt textHeaderTemplateExt = responseData.templateExts.get(Long.valueOf(textHeaderRecordInfo.recordId));
                if (textHeaderTemplateExt == null) {
                    textHeaderTemplateExt = new TextHeaderTemplateExt();
                    textHeaderTemplateExt.recordId = textHeaderRecordInfo.recordId;
                }
                arrayList2.add(new C00UM(C972080bP4.LJFF(textHeaderRecordInfo), textHeaderTemplateExt.templateType, textHeaderRecordInfo.mediaNodeId));
            }
            ((AnchorTextHeaderViewModel) c516701zp.l0).LLJILJIL.setValue(arrayList);
            ((AnchorTextHeaderViewModel) c516701zp.l0).LLJILJILJ.setValue(arrayList2);
            ((Function1) c516701zp.l1).invoke(arrayList);
        } else {
            Function0 function0 = (Function0) c516701zp.l2;
            if (function0 != null) {
                function0.invoke();
            }
        }
        C1C7U.LIZIZ("AnchorTextHeaderViewModel@2fc0.fetchRecordList$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(C516701zp c516701zp, Object obj) {
        PerceptionDialogInfo perceptionDialogInfo;
        PunishEventInfo punishEventInfo;
        Text text;
        Context context;
        DataChannel dataChannel;
        C1C7U.LIZ("CompetitionAnchorLauncher@ecb7.checkValidation$2");
        C974990bTl c974990bTl = (C974990bTl) c516701zp.l0;
        LiveWidget liveWidget = (LiveWidget) c516701zp.l1;
        ViolationStatusResponse.ResponseData responseData = (ViolationStatusResponse.ResponseData) ((BaseResponse) obj).data;
        c974990bTl.getClass();
        PerceptionMessage perceptionMessage = new PerceptionMessage();
        if (responseData != null) {
            perceptionDialogInfo = responseData.perceptionDialog;
        } else {
            perceptionDialogInfo = null;
        }
        perceptionMessage.dialog = perceptionDialogInfo;
        if (responseData != null) {
            punishEventInfo = responseData.punishEvent;
        } else {
            punishEventInfo = null;
        }
        perceptionMessage.publicEventInfo = punishEventInfo;
        if (responseData != null) {
            text = responseData.perceptionToast;
        } else {
            text = null;
        }
        perceptionMessage.toast = text;
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        if (liveWidget != null) {
            context = liveWidget.getContext();
            dataChannel = liveWidget.dataChannel;
        } else {
            context = null;
            dataChannel = null;
        }
        iBroadcastService.showDialog(context, perceptionMessage, dataChannel, null);
        Function1 function1 = (Function1) c516701zp.l2;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        C1C7U.LIZIZ("CompetitionAnchorLauncher@ecb7.checkValidation$2");
    }

    public static final void accept$4(C516701zp c516701zp, Object obj) {
        C1111930f2d c1111930f2d = (C1111930f2d) c516701zp.l0;
        InterfaceC1112060f2q interfaceC1112060f2q = (InterfaceC1112060f2q) c516701zp.l1;
        ChatMessage chatMessage = (ChatMessage) c516701zp.l2;
        c1111930f2d.getClass();
        C1C7U.LIZ("PublicScreenPresenter@c5a7.updateFilterMessage$1L");
        interfaceC1112060f2q.LJJLIIIJJIZ().LIZ = true;
        chatMessage.communityflaggedStatus = 2;
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).NL0(c1111930f2d.LLLJL.LJIIZILJ, interfaceC1112060f2q.getToken(), chatMessage);
        C1C7U.LIZIZ("PublicScreenPresenter@c5a7.updateFilterMessage$1L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$5(C516701zp c516701zp, Object obj) {
        int i;
        String str;
        RtcUserInfo rtcUserInfoG0;
        ChangeStateResp changeStateResp;
        C1C7U.LIZ("GameLinkV2GuestPresenter@40ad.changeState$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        boolean z = true;
        int i2 = 0;
        if (baseResponse != null && (changeStateResp = (ChangeStateResp) baseResponse.data) != null && changeStateResp.result == 1) {
            i = 1;
        } else {
            i = 0;
        }
        Function1 function1 = (Function1) c516701zp.l0;
        if (function1 != null) {
            if (i != 1) {
                z = false;
            }
            function1.invoke(Boolean.valueOf(z));
        }
        C923760a98 c923760a98 = (C923760a98) c516701zp.l1;
        int i3 = ((ChangeStateReq) c516701zp.l2).stateType;
        if (baseResponse != null) {
            i2 = baseResponse.statusCode;
        }
        c923760a98.getClass();
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("change_state_result", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
        c474500IjALIZIZ.LJJII(Integer.valueOf(i3), "state_type");
        c474500IjALIZIZ.LJJII(Integer.valueOf(i), "is_succeed");
        c474500IjALIZIZ.LJJII(Integer.valueOf(i2), "error_code");
        c474500IjALIZIZ.LJJII("", "error_msg");
        InterfaceC954180awC interfaceC954180awCLLJLL = c923760a98.LL.LLJLL();
        if (interfaceC954180awCLLJLL != null && (rtcUserInfoG0 = interfaceC954180awCLLJLL.G0()) != null) {
            str = rtcUserInfoG0.linkMicId;
        } else {
            str = null;
        }
        c474500IjALIZIZ.LJJII(str, "link_id");
        c474500IjALIZIZ.LJIL();
        c474500IjALIZIZ.LIZ();
        C1C7U.LIZIZ("GameLinkV2GuestPresenter@40ad.changeState$1");
    }

    public static final void accept$6(C516701zp c516701zp, Object obj) {
        C1C7U.LIZ("BasePlaybookViewModel@9898.populate$2");
        Throwable th = (Throwable) obj;
        String strLIZ = C01EI.LIZ(0, ((BasePlaybookViewModel) c516701zp.l0).xQ2());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("populate failure, errorCode=");
        sbLIZ.append(PlaybookUtilKt.LJIIL(th));
        sbLIZ.append(" ,errorMessage=");
        sbLIZ.append(th.getMessage());
        sbLIZ.append(", playbookId=");
        sbLIZ.append(((PlaybookPopulateParams) c516701zp.l1).playbookId);
        C1AZW.LJFF(strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC170900l9 interfaceC170900l9 = (InterfaceC170900l9) c516701zp.l2;
        if (interfaceC170900l9 != null) {
            interfaceC170900l9.onFailed(th);
        }
        C1C7U.LIZIZ("BasePlaybookViewModel@9898.populate$2");
    }

    public static final void accept$7(C516701zp c516701zp, Object obj) {
        C1C7U.LIZ("BasePlaybookViewModel@9898.fetchDetail$2");
        Throwable th = (Throwable) obj;
        String strLIZ = C01EI.LIZ(0, ((BasePlaybookViewModel) c516701zp.l0).xQ2());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchDetail failure, errorCode=");
        sbLIZ.append(PlaybookUtilKt.LJIIL(th));
        sbLIZ.append(" ,errorMessage=");
        sbLIZ.append(th.getMessage());
        sbLIZ.append(", playbookId=");
        sbLIZ.append(((PlaybookFetchDetailParams) c516701zp.l1).playbookId);
        C1AZW.LJFF(strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC170900l9 interfaceC170900l9 = (InterfaceC170900l9) c516701zp.l2;
        if (interfaceC170900l9 != null) {
            interfaceC170900l9.onFailed(th);
        }
        C1C7U.LIZIZ("BasePlaybookViewModel@9898.fetchDetail$2");
    }

    public static final void accept$8(C516701zp c516701zp, Object obj) {
        C1C7U.LIZ("GuardianAutographPresenter@8ef9.editGuardianAutographWithUri$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        Integer numValueOf = null;
        if (baseResponse != null && baseResponse.data != 0) {
            C389001fE.LIZ("guardianAutographUpdated", new JSONObject(), System.currentTimeMillis(), false);
            ((Function0) c516701zp.l0).invoke();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("editGuardianAutograph: non-success statusCode=");
            if (baseResponse != null) {
                numValueOf = Integer.valueOf(baseResponse.statusCode);
            }
            sbLIZ.append(numValueOf);
            C20441214yg.LJ("GuardianAutographPresenter", C2188811AlT.LIZIZ(sbLIZ));
            ((Function0) c516701zp.l1).invoke();
        }
        C143P c143p = (C143P) c516701zp.l2;
        if (c143p != null) {
            c143p.LIZ();
        }
        C1C7U.LIZIZ("GuardianAutographPresenter@8ef9.editGuardianAutographWithUri$2");
    }

    public static final void accept$9(C516701zp c516701zp, Object obj) {
        C1C7U.LIZ("GroupLiveMvpSeatAssem@92f0.initObservers$1$3$1");
        ((GroupLiveMvpSeatAssem) c516701zp.l0).Ho((CompetitionSettleEnd) c516701zp.l1, (View) c516701zp.l2);
        C1C7U.LIZIZ("GroupLiveMvpSeatAssem@92f0.initObservers$1$3$1");
    }

    public C516701zp(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
