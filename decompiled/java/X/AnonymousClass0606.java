package X;

import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.FeedbackPanelConfig;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0606, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMSmartReplyFeedbackAnalysis$reportFeedbackReasonPanelShow$1", f = "IMSmartReplyFeedbackAnalysis.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0606 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FeedbackPanelConfig LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0606(FeedbackPanelConfig feedbackPanelConfig, InterfaceC1364105Vn<? super AnonymousClass0606> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = feedbackPanelConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0606(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZIZ;
        String str;
        C1C7U.LIZ("IMSmartReplyFeedbackAnalysis@e3de.reportFeedbackReasonPanelShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str2 = this.LL.conversationId;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str2);
        if (c0y8tLIZ != null) {
            C1508705vR.LL.getClass();
            strLIZIZ = C1508705vR.LIZIZ(c0y8tLIZ);
        } else {
            strLIZIZ = "private";
        }
        AnonymousClass0608.LIZ.getClass();
        String strLIZ = AnonymousClass0608.LIZ(str2);
        FeedbackPanelConfig feedbackPanelConfig = this.LL;
        if (feedbackPanelConfig.panelType == AnonymousClass0604.CREATOR) {
            str = "creator";
        } else {
            str = "user";
        }
        String str3 = feedbackPanelConfig.enterMethod;
        if (!(!a0.LJJJIL(str3)) || str3 == null) {
            str3 = "long_press";
        }
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", "chat"), new Pair("conversation_id", str2), new Pair("message_id", this.LL.msgId), new Pair("chat_type", strLIZIZ), new Pair("relation_tag", strLIZ), new Pair("feedback_role", str), new Pair("enter_method", str3));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("ttsocial_ai_feedback_reason_panel_show", mapLJIIIIZZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMSmartReplyFeedbackAnalysis@e3de.reportFeedbackReasonPanelShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
