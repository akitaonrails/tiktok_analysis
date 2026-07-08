package X;

import com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine;

/* JADX INFO: renamed from: X.06OQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine", f = "ChatNoticeFlowEngine.kt", l = {235, 247, 268, 271}, m = "startShowingIfNotStarted")
public final class C06OQ extends AbstractC23140094w {
    public C06NH LL;
    public C06ON LLILLJJLI;
    public C06OO LLILLL;
    public AnonymousClass0684 LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ ChatNoticeFlowEngine LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06OQ(ChatNoticeFlowEngine chatNoticeFlowEngine, InterfaceC1364105Vn<? super C06OQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = chatNoticeFlowEngine;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatNoticeFlowEngine@85cd.startShowingIfNotStarted$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJIJI = this.LLIZ.LJIJI(null, this);
        C1C7U.LIZIZ("ChatNoticeFlowEngine@85cd.startShowingIfNotStarted$1");
        return objLJIJI;
    }
}
