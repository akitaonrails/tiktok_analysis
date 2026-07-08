package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.FeedbackPanelConfig;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0607, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMSmartReplyFeedbackAnalysis$reportFeedbackReasonPanelClick$1", f = "IMSmartReplyFeedbackAnalysis.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0607 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FeedbackPanelConfig LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0607(FeedbackPanelConfig feedbackPanelConfig, String str, String str2, boolean z, InterfaceC1364105Vn<? super AnonymousClass0607> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = feedbackPanelConfig;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0607(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZIZ;
        String str;
        String str2;
        C1C7U.LIZ("IMSmartReplyFeedbackAnalysis@e3de.reportFeedbackReasonPanelClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str3 = this.LL.conversationId;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str3);
        if (c0y8tLIZ != null) {
            C1508705vR.LL.getClass();
            strLIZIZ = C1508705vR.LIZIZ(c0y8tLIZ);
        } else {
            strLIZIZ = "private";
        }
        AnonymousClass0608.LIZ.getClass();
        String strLIZ = AnonymousClass0608.LIZ(str3);
        FeedbackPanelConfig feedbackPanelConfig = this.LL;
        if (feedbackPanelConfig.panelType == AnonymousClass0604.CREATOR) {
            str = "creator";
        } else {
            str = "user";
        }
        String str4 = feedbackPanelConfig.enterMethod;
        if (!(!a0.LJJJIL(str4)) || str4 == null) {
            str4 = "long_press";
        }
        Pair[] pairArr = new Pair[10];
        pairArr[0] = new Pair("enter_from", "chat");
        pairArr[1] = new Pair("enter_method", str4);
        pairArr[2] = new Pair("conversation_id", str3);
        pairArr[3] = new Pair("message_id", this.LL.msgId);
        pairArr[4] = new Pair("chat_type", strLIZIZ);
        pairArr[5] = new Pair("relation_tag", strLIZ);
        pairArr[6] = new Pair("feedback_role", str);
        pairArr[7] = new Pair("feedback_reason", this.LLILLJJLI);
        pairArr[8] = new Pair("button_name", this.LLILLL);
        if (this.LLILZ) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[9] = new Pair("is_text_feedback", str2);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("ttsocial_ai_feedback_reason_panel_click", mapLJIIIIZZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMSmartReplyFeedbackAnalysis@e3de.reportFeedbackReasonPanelClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
