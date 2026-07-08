package X;

import com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine;

/* JADX INFO: renamed from: X.06OW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine", f = "ChatNoticeFlowEngine.kt", l = {162, 163, 165}, m = "addTasksAndStartShowing")
public final class C06OW extends AbstractC23140094w {
    public boolean LL;
    public boolean LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ ChatNoticeFlowEngine LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06OW(ChatNoticeFlowEngine chatNoticeFlowEngine, InterfaceC1364105Vn<? super C06OW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = chatNoticeFlowEngine;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatNoticeFlowEngine@85cd.addTasksAndStartShowing$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZIL.LIZLLL(this, null, false, false);
        C1C7U.LIZIZ("ChatNoticeFlowEngine@85cd.addTasksAndStartShowing$1");
        return objLIZLLL;
    }
}
