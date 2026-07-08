package X;

import com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultListVM;

/* JADX INFO: renamed from: X.0iQA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultListVM", f = "InboxSearchResultListVM.kt", l = {120}, m = "realLoad")
public final class C1241840iQA extends AbstractC23140094w {
    public InboxSearchTabProtocol LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InboxSearchResultListVM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241840iQA(InboxSearchResultListVM inboxSearchResultListVM, InterfaceC1364105Vn<? super C1241840iQA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = inboxSearchResultListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSearchResultListVM@1c63.realLoad$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLILLL.xQ2(0, null, this);
        C1C7U.LIZIZ("InboxSearchResultListVM@1c63.realLoad$1");
        return objXQ2;
    }
}
