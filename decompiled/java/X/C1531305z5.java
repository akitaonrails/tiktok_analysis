package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;

/* JADX INFO: renamed from: X.05z5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel", f = "LiveVerticalViewModel.kt", l = {325, 329, 346}, m = "fetchLoadMoreData")
public final class C1531305z5 extends AbstractC23140094w {
    public SearchResultParam LL;
    public Object LLILLJJLI;
    public CompletionBlock LLILLL;
    public n LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ LiveVerticalViewModel LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1531305z5(LiveVerticalViewModel liveVerticalViewModel, InterfaceC1364105Vn<? super C1531305z5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = liveVerticalViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveVerticalViewModel@b55d.fetchLoadMoreData$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLILZLL.xQ2(null, null, null, null, this);
        C1C7U.LIZIZ("LiveVerticalViewModel@b55d.fetchLoadMoreData$1");
        return objXQ2;
    }
}
