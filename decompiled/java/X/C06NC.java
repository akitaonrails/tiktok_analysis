package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.06NC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.handlers.PermissionMessageBannerHandlerV2", f = "PermissionMessageBannerHandlerV2.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "onShow")
public final class C06NC extends AbstractC23140094w {
    public C06OO LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C06NA LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06NC(C06NA c06na, InterfaceC1364105Vn<? super C06NC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c06na;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PermissionMessageBannerHandlerV2@ea20.onShow$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILLL.LJIIJ(null, this);
        C1C7U.LIZIZ("PermissionMessageBannerHandlerV2@ea20.onShow$1");
        return objLJIIJ;
    }
}
