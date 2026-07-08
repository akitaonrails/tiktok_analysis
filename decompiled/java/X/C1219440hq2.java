package X;

import com.ss.android.ugc.now.interaction.assem.LikeListVM;

/* JADX INFO: renamed from: X.0hq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.now.interaction.assem.LikeListVM", f = "LikeListVM.kt", l = {119}, m = "fetchLikeList")
public final class C1219440hq2 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LikeListVM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219440hq2(LikeListVM likeListVM, InterfaceC1364105Vn<? super C1219440hq2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = likeListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LikeListVM@32c5.fetchLikeList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLL.vQ2(null, null, null, this);
        C1C7U.LIZIZ("LikeListVM@32c5.fetchLikeList$1");
        return objVQ2;
    }
}
