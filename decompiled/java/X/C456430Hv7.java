package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SingleChatInputViewModel;

/* JADX INFO: renamed from: X.0Hv7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SingleChatInputViewModel", f = "SingleChatInputViewModel.kt", l = {209, 211}, m = "subscribeForSendBtnState")
public final class C456430Hv7 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SingleChatInputViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456430Hv7(SingleChatInputViewModel singleChatInputViewModel, InterfaceC1364105Vn<? super C456430Hv7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = singleChatInputViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleChatInputViewModel@c295.subscribeForSendBtnState$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objAQ2 = this.LLILLJJLI.AQ2(this);
        C1C7U.LIZIZ("SingleChatInputViewModel@c295.subscribeForSendBtnState$1");
        return objAQ2;
    }
}
