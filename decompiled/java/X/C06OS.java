package X;

import com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine;

/* JADX INFO: renamed from: X.06OS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine", f = "ChatNoticeFlowEngine.kt", l = {182, 187, 192, 197}, m = "addTask")
public final class C06OS extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public EnumC1596306Mv LLILLL;
    public boolean LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ ChatNoticeFlowEngine LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06OS(ChatNoticeFlowEngine chatNoticeFlowEngine, InterfaceC1364105Vn<? super C06OS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = chatNoticeFlowEngine;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatNoticeFlowEngine@85cd.addTask$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJIIZILJ = this.LLILZLL.LJIIZILJ(null, this);
        C1C7U.LIZIZ("ChatNoticeFlowEngine@85cd.addTask$1");
        return objLJIIZILJ;
    }
}
