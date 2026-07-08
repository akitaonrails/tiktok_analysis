package X;

import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchUserFilterVM;

/* JADX INFO: renamed from: X.0iPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchUserFilterVM", f = "InboxSearchUserFilterVM.kt", l = {99}, m = "loadSuggesterUser")
public final class C1241550iPh extends AbstractC23140094w {
    public InboxSearchUserFilterVM LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ InboxSearchUserFilterVM LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241550iPh(InboxSearchUserFilterVM inboxSearchUserFilterVM, InterfaceC1364105Vn<? super C1241550iPh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = inboxSearchUserFilterVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSearchUserFilterVM@4309.loadSuggesterUser$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILZ.vQ2(this);
        C1C7U.LIZIZ("InboxSearchUserFilterVM@4309.loadSuggesterUser$1");
        return objVQ2;
    }
}
