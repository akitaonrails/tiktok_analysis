package X;

import com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgVM;

/* JADX INFO: renamed from: X.06rz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgVM", f = "BusinessChatLandingMsgVM.kt", l = {254, 262}, m = "requestLandingMessage$im_business_chat_release")
public final class C1742106rz extends AbstractC23140094w {
    public C909290Zln LL;
    public C259800zU LLILLJJLI;
    public C259800zU LLILLL;
    public int LLILZ;
    public long LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ BusinessChatLandingMsgVM LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1742106rz(BusinessChatLandingMsgVM businessChatLandingMsgVM, InterfaceC1364105Vn<? super C1742106rz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = businessChatLandingMsgVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BusinessChatLandingMsgVM@c76d.requestLandingMessage$2");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objZQ2 = this.LLIZ.zQ2(null, 0L, 0, null, null, this);
        C1C7U.LIZIZ("BusinessChatLandingMsgVM@c76d.requestLandingMessage$2");
        return objZQ2;
    }
}
