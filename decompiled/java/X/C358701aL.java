package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.01aL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nimblecard.tako.vm.NimbleRepository", f = "NimbleRepository.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "queryBatchAweme")
public final class C358701aL extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C358401aI LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C358701aL(C358401aI c358401aI, InterfaceC1364105Vn<? super C358701aL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c358401aI;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NimbleRepository@800d.queryBatchAweme$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, 0, this);
        C1C7U.LIZIZ("NimbleRepository@800d.queryBatchAweme$1");
        return objLIZIZ;
    }
}
