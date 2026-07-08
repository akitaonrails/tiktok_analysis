package X;

import com.ss.android.ugc.aweme.im.b2c.actionbar.BusinessChatActionBarVM;

/* JADX INFO: renamed from: X.06vK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.actionbar.BusinessChatActionBarVM", f = "BusinessChatActionBarVM.kt", l = {119}, m = "fetchBusinessActionBarData")
public final class C1762806vK extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BusinessChatActionBarVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1762806vK(BusinessChatActionBarVM businessChatActionBarVM, InterfaceC1364105Vn<? super C1762806vK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = businessChatActionBarVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BusinessChatActionBarVM@a852.fetchBusinessActionBarData$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.vQ2(this);
        C1C7U.LIZIZ("BusinessChatActionBarVM@a852.fetchBusinessActionBarData$1");
        return objVQ2;
    }
}
