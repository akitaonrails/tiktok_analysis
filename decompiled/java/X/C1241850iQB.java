package X;

import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultListVM;

/* JADX INFO: renamed from: X.0iQB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultListVM", f = "InboxSearchResultListVM.kt", l = {95}, m = "onLoadMore")
public final class C1241850iQB extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InboxSearchResultListVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241850iQB(InboxSearchResultListVM inboxSearchResultListVM, InterfaceC1364105Vn<? super C1241850iQB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = inboxSearchResultListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSearchResultListVM@1c63.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("InboxSearchResultListVM@1c63.onLoadMore$1");
        return objOnLoadMore;
    }
}
