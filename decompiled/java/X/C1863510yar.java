package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;

/* JADX INFO: renamed from: X.0yar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler", f = "MessageOperatorHandler.kt", l = {2629, 2630}, m = "handleSubconversationCompleted")
public final class C1863510yar extends AbstractC23140094w {
    public ConversationInfo LL;
    public SubConversationConfig LLILLJJLI;
    public C1863400yag LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1863280yaU LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863510yar(C1863280yaU c1863280yaU, InterfaceC1364105Vn<? super C1863510yar> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1863280yaU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@b589.handleSubconversationCompleted$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILZLL.LJJJJJL(null, 0L, 0, this);
        C1C7U.LIZIZ("MessageOperatorHandler@b589.handleSubconversationCompleted$1");
        return objLJJJJJL;
    }
}
