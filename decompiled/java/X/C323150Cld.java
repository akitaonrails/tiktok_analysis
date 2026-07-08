package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed.SeaPdpCreatorInnerListVM;

/* JADX INFO: renamed from: X.0Cld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed.SeaPdpCreatorInnerListVM", f = "SeaPdpCreatorInnerListVM.kt", l = {273}, m = "onLoadMore")
public final class C323150Cld extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SeaPdpCreatorInnerListVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323150Cld(SeaPdpCreatorInnerListVM seaPdpCreatorInnerListVM, InterfaceC1364105Vn<? super C323150Cld> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = seaPdpCreatorInnerListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpCreatorInnerListVM@3055.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objFQ2 = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("SeaPdpCreatorInnerListVM@3055.onLoadMore$1");
        return objFQ2;
    }
}
