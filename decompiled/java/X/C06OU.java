package X;

import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;

/* JADX INFO: renamed from: X.06OU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeScene", f = "ChatNoticeScene.kt", l = {127}, m = "removeInvalidTasks")
public final class C06OU extends AbstractC23140094w {
    public IChatNoticeFlowEngine LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C06ON LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06OU(C06ON c06on, InterfaceC1364105Vn<? super C06OU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c06on;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatNoticeScene@8b13.removeInvalidTasks$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZLL.LIZIZ(null, this);
        C1C7U.LIZIZ("ChatNoticeScene@8b13.removeInvalidTasks$1");
        return objLIZIZ;
    }
}
