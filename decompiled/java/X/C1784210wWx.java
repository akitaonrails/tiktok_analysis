package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.b2c.replies.api.IMQuickReplyNetAPI;
import com.ss.android.ugc.aweme.im.b2c.replies.api.QuickReplySaveRequest;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wWx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.replies.ui.FeedbackClickSpan$onClick$1$1", f = "FeedbackClickSpan.kt", l = {48}, m = "invokeSuspend")
public final class C1784210wWx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1785030wYH LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784210wWx(C1785030wYH c1785030wYH, InterfaceC1364105Vn<? super C1784210wWx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1785030wYH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1784210wWx(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        Long lLJIILIIL;
        C1C7U.LIZ("FeedbackClickSpan@519f.onClick$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                IMQuickReplyNetAPI.LIZ.getClass();
                IMQuickReplyNetAPI iMQuickReplyNetAPI = C1798930wuh.LIZIZ;
                String curUserId = C0I0B.LJFF.LIZ().getCurUserId();
                if (curUserId != null && (lLJIILIIL = C2095008Iq.LJIILIIL(curUserId)) != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                IMQuickReply iMQuickReply = this.LLILLJJLI.LLILLJJLI;
                QuickReplySaveRequest quickReplySaveRequest = new QuickReplySaveRequest(jLongValue, iMQuickReply.id, iMQuickReply.type, iMQuickReply.content);
                this.LL = 1;
                if (iMQuickReplyNetAPI.feedbackQuickReply(quickReplySaveRequest, this) == objLJFF) {
                    C1C7U.LIZIZ("FeedbackClickSpan@519f.onClick$1$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedbackClickSpan@519f.onClick$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
