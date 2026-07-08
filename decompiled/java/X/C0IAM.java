package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SendMessageViewModel;

/* JADX INFO: renamed from: X.0IAM, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SendMessageViewModel", f = "SendMessageViewModel.kt", l = {282, 590}, m = "realSendMessage")
public final class C0IAM extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ SendMessageViewModel LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IAM(SendMessageViewModel sendMessageViewModel, InterfaceC1364105Vn<? super C0IAM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = sendMessageViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendMessageViewModel@52c6.realSendMessage$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLIZ.wQ2(null, null, null, null, null, null, null, null, null, this);
        C1C7U.LIZIZ("SendMessageViewModel@52c6.realSendMessage$1");
        return objWQ2;
    }
}
