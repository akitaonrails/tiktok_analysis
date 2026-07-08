package X;

import Y.AgS283S0100000_2;

/* JADX INFO: renamed from: X.06eG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.singlechat.BusinessSingleChatAssem$lazyRecordTip$$inlined$map$1$2", f = "BusinessSingleChatAssem.kt", l = {223}, m = "emit")
public final class C1657006eG extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS283S0100000_2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1657006eG(AgS283S0100000_2 agS283S0100000_2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS283S0100000_2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BusinessSingleChatAssem@83bf.lazyRecordTip$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("BusinessSingleChatAssem@83bf.lazyRecordTip$$inlined$map$1$2$1");
        return objEmit;
    }
}
