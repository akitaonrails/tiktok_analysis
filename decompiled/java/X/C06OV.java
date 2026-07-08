package X;

import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;

/* JADX INFO: renamed from: X.06OV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeScene", f = "ChatNoticeScene.kt", l = {109}, m = "addTask")
public final class C06OV extends AbstractC23140094w {
    public C06OO LL;
    public IChatNoticeFlowEngine LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C06ON LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06OV(C06ON c06on, InterfaceC1364105Vn<? super C06OV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c06on;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatNoticeScene@8b13.addTask$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(null, null, this);
        C1C7U.LIZIZ("ChatNoticeScene@8b13.addTask$1");
        return objLIZ;
    }
}
