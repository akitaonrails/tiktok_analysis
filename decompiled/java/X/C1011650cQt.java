package X;

import Y.AgS204S0200000_16;

/* JADX INFO: renamed from: X.0cQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.SearchAdStateBridge$subscribe$1$1$1$invokeSuspend$$inlined$filter$1$2", f = "SearchAdStateBridge.kt", l = {223}, m = "emit")
public final class C1011650cQt extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS204S0200000_16 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1011650cQt(AgS204S0200000_16 agS204S0200000_16, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS204S0200000_16;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAdStateBridge@1a5c.subscribe$1$1$1$invokeSuspend$$inlined$filter$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("SearchAdStateBridge@1a5c.subscribe$1$1$1$invokeSuspend$$inlined$filter$1$2$1");
        return objEmit;
    }
}
