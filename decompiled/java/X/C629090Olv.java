package X;

import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedDiggDetailListVM;

/* JADX INFO: renamed from: X.0Olv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedDiggDetailListVM", f = "VibeFeedDiggDetailListVM.kt", l = {293}, m = "onLoadMore")
public final class C629090Olv extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ VibeFeedDiggDetailListVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C629090Olv(VibeFeedDiggDetailListVM vibeFeedDiggDetailListVM, InterfaceC1364105Vn<? super C629090Olv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = vibeFeedDiggDetailListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VibeFeedDiggDetailListVM@4fc.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("VibeFeedDiggDetailListVM@4fc.onLoadMore$1");
        return objOnLoadMore;
    }
}
