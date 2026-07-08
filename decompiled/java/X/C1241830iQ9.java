package X;

import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultListVM;

/* JADX INFO: renamed from: X.0iQ9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultListVM", f = "InboxSearchResultListVM.kt", l = {56}, m = "onRefresh")
public final class C1241830iQ9 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InboxSearchResultListVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241830iQ9(InboxSearchResultListVM inboxSearchResultListVM, InterfaceC1364105Vn<? super C1241830iQ9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = inboxSearchResultListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSearchResultListVM@1c63.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("InboxSearchResultListVM@1c63.onRefresh$1");
        return objOnRefresh;
    }
}
