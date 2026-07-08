package X;

import Y.AgS285S0100000_4;

/* JADX INFO: renamed from: X.0CXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.amazon.AmazonLoginHandler$collectLoginEvent$$inlined$collect$1$1$2", f = "AmazonLoginHandler.kt", l = {223}, m = "emit")
public final class C315350CXt extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS285S0100000_4 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315350CXt(AgS285S0100000_4 agS285S0100000_4, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS285S0100000_4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("null.");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("null.");
        return objEmit;
    }
}
