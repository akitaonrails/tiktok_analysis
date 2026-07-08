package X;

import com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgVM;

/* JADX INFO: renamed from: X.06s0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgVM", f = "BusinessChatLandingMsgVM.kt", l = {326}, m = "revalidatePreloadedLandingMessage")
public final class C1742206s0 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BusinessChatLandingMsgVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1742206s0(BusinessChatLandingMsgVM businessChatLandingMsgVM, InterfaceC1364105Vn<? super C1742206s0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = businessChatLandingMsgVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BusinessChatLandingMsgVM@c76d.revalidatePreloadedLandingMessage$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objAQ2 = this.LLILLJJLI.AQ2(null, null, 0L, null, null, null, this);
        C1C7U.LIZIZ("BusinessChatLandingMsgVM@c76d.revalidatePreloadedLandingMessage$1");
        return objAQ2;
    }
}
