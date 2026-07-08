package X;

import Y.AgS283S0100000_2;

/* JADX INFO: renamed from: X.06eF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.SingleChatAssem$lazyRecordTip$$inlined$map$1$2", f = "SingleChatAssem.kt", l = {223}, m = "emit")
public final class C1656906eF extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS283S0100000_2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1656906eF(AgS283S0100000_2 agS283S0100000_2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS283S0100000_2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleChatAssem@2b9f.lazyRecordTip$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("SingleChatAssem@2b9f.lazyRecordTip$$inlined$map$1$2$1");
        return objEmit;
    }
}
