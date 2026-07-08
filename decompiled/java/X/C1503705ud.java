package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMSmartReplyAnalysis$reportAIAsstAutoReplyMsgFeedbackBtnClick$1", f = "IMSmartReplyAnalysis.kt", l = {}, m = "invokeSuspend")
public final class C1503705ud extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C869590Y9l LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1503705ud(C869590Y9l c869590Y9l, String str, String str2, InterfaceC1364105Vn<? super C1503705ud> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c869590Y9l;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1503705ud(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZIZ;
        String str;
        C1C7U.LIZ("IMSmartReplyAnalysis@3a3f.reportAIAsstAutoReplyMsgFeedbackBtnClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String conversationId = this.LL.getConversationId();
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(conversationId);
        if (c0y8tLIZ != null) {
            C1508705vR.LL.getClass();
            strLIZIZ = C1508705vR.LIZIZ(c0y8tLIZ);
        } else {
            strLIZIZ = "private";
        }
        String uuid = this.LL.getUuid();
        uuid.toString();
        C15392060w c15392060w = C15392060w.LIZ;
        C869590Y9l c869590Y9l = this.LL;
        c15392060w.getClass();
        String strLIZ = C15392060w.LIZ(c869590Y9l);
        String strValueOf = String.valueOf(C0YNP.LJII(conversationId));
        if (C0ZDX.LJJJJIZL(this.LL)) {
            str = "creator";
        } else {
            str = "user";
        }
        C1508705vR c1508705vR = C1508705vR.LL;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", "chat"), new Pair("chat_type", strLIZIZ), new Pair("inbox_mode", this.LLILLJJLI), new Pair("message_id", uuid), new Pair("reply_message_id", strLIZ), new Pair("to_user_id", strValueOf), new Pair("click_type", this.LLILLL), new Pair("conversation_id", conversationId), new Pair("feedback_role", str));
        c1508705vR.getClass();
        C1508705vR.LIZLLL("ttsocial_aiasst_autoreply_msg_feedback_btn_click", mapLJIIIIZZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.reportAIAsstAutoReplyMsgFeedbackBtnClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
