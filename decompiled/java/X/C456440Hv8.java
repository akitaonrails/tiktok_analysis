package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SingleChatInputViewModel;

/* JADX INFO: renamed from: X.0Hv8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SingleChatInputViewModel", f = "SingleChatInputViewModel.kt", l = {218}, m = "subscribeForTextEmptyState")
public final class C456440Hv8 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SingleChatInputViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456440Hv8(SingleChatInputViewModel singleChatInputViewModel, InterfaceC1364105Vn<? super C456440Hv8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = singleChatInputViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleChatInputViewModel@c295.subscribeForTextEmptyState$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLJJLI.BQ2(this);
        C1C7U.LIZIZ("SingleChatInputViewModel@c295.subscribeForTextEmptyState$1");
        return objBQ2;
    }
}
