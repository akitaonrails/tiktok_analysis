package X;

import com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine;

/* JADX INFO: renamed from: X.06OY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine", f = "ChatNoticeFlowEngine.kt", l = {212}, m = "startShowingOnAllScenes")
public final class C06OY extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ChatNoticeFlowEngine LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06OY(ChatNoticeFlowEngine chatNoticeFlowEngine, InterfaceC1364105Vn<? super C06OY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = chatNoticeFlowEngine;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatNoticeFlowEngine@85cd.startShowingOnAllScenes$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIJJ = this.LLILLL.LJIJJ(false, this);
        C1C7U.LIZIZ("ChatNoticeFlowEngine@85cd.startShowingOnAllScenes$1");
        return objLJIJJ;
    }
}
