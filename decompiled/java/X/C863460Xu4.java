package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0Xu4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.BatchMarkConversationReadUseCase", f = "BatchMarkConversationReadUseCase.kt", l = {BaseNotice.RECOMMEND_LIVE, 57, 59, 61, BaseNotice.CREATOR}, m = "batchMarkRead")
public final class C863460Xu4 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C864340XvU LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863460Xu4(C864340XvU c864340XvU, InterfaceC1364105Vn<? super C863460Xu4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c864340XvU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BatchMarkConversationReadUseCase@9ae8.batchMarkRead$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, null, this);
        C1C7U.LIZIZ("BatchMarkConversationReadUseCase@9ae8.batchMarkRead$1");
        return objLIZ;
    }
}
