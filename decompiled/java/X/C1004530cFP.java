package X;

import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareVM;

/* JADX INFO: renamed from: X.0cFP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareVM", f = "QuickShareVM.kt", l = {196}, m = "getShareItemInfo")
public final class C1004530cFP extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ QuickShareVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004530cFP(QuickShareVM quickShareVM, InterfaceC1364105Vn<? super C1004530cFP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = quickShareVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QuickShareVM@6d02.getShareItemInfo$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLJJLI.wQ2(this);
        C1C7U.LIZIZ("QuickShareVM@6d02.getShareItemInfo$1");
        return objWQ2;
    }
}
