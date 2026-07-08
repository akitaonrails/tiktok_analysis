package X;

import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchDefaultVM;

/* JADX INFO: renamed from: X.0iPL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchDefaultVM", f = "InboxSearchDefaultVM.kt", l = {305, 308}, m = "getRecentItemList")
public final class C1241330iPL extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public boolean LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ InboxSearchDefaultVM LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241330iPL(InboxSearchDefaultVM inboxSearchDefaultVM, InterfaceC1364105Vn<? super C1241330iPL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = inboxSearchDefaultVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSearchDefaultVM@600.getRecentItemList$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILZLL.wQ2(null, false, this);
        C1C7U.LIZIZ("InboxSearchDefaultVM@600.getRecentItemList$1");
        return objWQ2;
    }
}
