package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.IMFromMessageTips;
import com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.06AF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel$triggerTopMessageBanner$1", f = "BaseCommonChatNoticeViewModel.kt", l = {294}, m = "invokeSuspend")
public final class C06AF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ BaseCommonChatNoticeViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06AF(C869590Y9l c869590Y9l, BaseCommonChatNoticeViewModel baseCommonChatNoticeViewModel, InterfaceC1364105Vn<? super C06AF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = baseCommonChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06AF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String conversationId;
        String noticeCode;
        CheckMessage.StatusMsg statusMsg;
        SystemContent content;
        C06OO c06aj;
        SystemContent.Key[] template;
        CheckMessage.StatusMsg statusMsg2;
        C1C7U.LIZ("BaseCommonChatNoticeViewModel@63e8.triggerTopMessageBanner$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String conversationId2 = this.LLILLJJLI.getConversationId();
            SessionInfo sessionInfoRQ2 = this.LLILLL.RQ2();
            if (sessionInfoRQ2 != null) {
                conversationId = sessionInfoRQ2.getConversationId();
            } else {
                conversationId = null;
            }
            if (!Intrinsics.LJFF(conversationId2, conversationId)) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.triggerTopMessageBanner$1");
                return unit;
            }
            C1675506hF c1675506hF = C1675506hF.LIZ;
            Map<String, String> localExt = this.LLILLJJLI.getLocalExt();
            c1675506hF.getClass();
            CheckMessage checkMessageLIZ = C1675506hF.LIZ(localExt);
            if (checkMessageLIZ != null && (statusMsg2 = checkMessageLIZ.getStatusMsg()) != null) {
                noticeCode = statusMsg2.getNoticeCode();
            } else {
                noticeCode = null;
            }
            if (C13LP.LJJJJ(noticeCode, C1697810uHb.LJIIJJI("sender_permission_off", "receiver_permission_off"))) {
                c06aj = new C06AH(EnumC1596306Mv.PERMISSION_OFF, new IMNoticeMsgStruct(null, noticeCode, new IMFromMessageTips(null, null, C2097608Jq.LJ()), null));
            } else {
                int i2 = 0;
                if (checkMessageLIZ != null && (statusMsg = checkMessageLIZ.getStatusMsg()) != null && statusMsg.getMsgType() == 1022 && (content = CheckMessage.Companion.getContent(checkMessageLIZ)) != null && C123100dR.LIZ(content.getTips())) {
                    BaseCommonChatNoticeViewModel baseCommonChatNoticeViewModel = this.LLILLL;
                    C869590Y9l c869590Y9l = this.LLILLJJLI;
                    baseCommonChatNoticeViewModel.getClass();
                    if (C06AG.LIZ == 1 && (template = content.getTemplate()) != null) {
                        int length = template.length;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            SystemContent.Key key = template[i2];
                            C1675506hF.LIZ.getClass();
                            if (C1675506hF.LIZJ(key)) {
                                if (key != null) {
                                    C0YNP.LJIIIIZZ(c869590Y9l.getConversationId(), "reduce_exposure_banner_key", String.valueOf(c869590Y9l.getMsgId()));
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                    C2286608xc.LJ(1022);
                    c06aj = new C06AJ(content, null);
                }
            }
            IChatNoticeFlowEngine iChatNoticeFlowEngine = this.LLILLL.LL;
            this.LL = 1;
            if (iChatNoticeFlowEngine.LJIILJJIL(c06aj, this) == objLJFF) {
                C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.triggerTopMessageBanner$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.triggerTopMessageBanner$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
