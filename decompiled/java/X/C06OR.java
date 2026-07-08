package X;

import com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06OR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine", f = "ChatNoticeFlowEngine.kt", l = {328}, m = "dismissCurrentTasks")
public final class C06OR extends AbstractC23140094w {
    public boolean LL;
    public Object LLILLJJLI;
    public Function2 LLILLL;
    public Object LLILZ;
    public C06ON LLILZIL;
    public C06OO LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ ChatNoticeFlowEngine LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06OR(ChatNoticeFlowEngine chatNoticeFlowEngine, InterfaceC1364105Vn<? super C06OR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = chatNoticeFlowEngine;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatNoticeFlowEngine@85cd.dismissCurrentTasks$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZLLLIL.LIZ(false, null, null, this);
        C1C7U.LIZIZ("ChatNoticeFlowEngine@85cd.dismissCurrentTasks$1");
        return objLIZ;
    }
}
