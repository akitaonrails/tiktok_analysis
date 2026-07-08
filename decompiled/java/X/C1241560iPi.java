package X;

import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchUserFilterVM;

/* JADX INFO: renamed from: X.0iPi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchUserFilterVM", f = "InboxSearchUserFilterVM.kt", l = {140}, m = "loadUserFilterList")
public final class C1241560iPi extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InboxSearchUserFilterVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241560iPi(InboxSearchUserFilterVM inboxSearchUserFilterVM, InterfaceC1364105Vn<? super C1241560iPi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = inboxSearchUserFilterVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSearchUserFilterVM@4309.loadUserFilterList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLJJLI.wQ2(0L, null, this);
        C1C7U.LIZIZ("InboxSearchUserFilterVM@4309.loadUserFilterList$1");
        return objWQ2;
    }
}
