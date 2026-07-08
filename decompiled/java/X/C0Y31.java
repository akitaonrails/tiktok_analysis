package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0Y31, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.leaveconversation.LeaveConversationUseCase", f = "LeaveConversationUseCase.kt", l = {49, BaseNotice.RECOMMEND_LIVE}, m = "leaveConversation")
public final class C0Y31 extends AbstractC23140094w {
    public InterfaceC867020Xzo LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C867910Y2z LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y31(C867910Y2z c867910Y2z, InterfaceC1364105Vn<? super C0Y31> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c867910Y2z;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LeaveConversationUseCase@f268.leaveConversation$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, false, null, this);
        C1C7U.LIZIZ("LeaveConversationUseCase@f268.leaveConversation$1");
        return objLIZJ;
    }
}
