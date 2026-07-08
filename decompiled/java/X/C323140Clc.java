package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed.SeaPdpCreatorInnerListVM;

/* JADX INFO: renamed from: X.0Clc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed.SeaPdpCreatorInnerListVM", f = "SeaPdpCreatorInnerListVM.kt", l = {418}, m = "fetchOrGetCreatorVideoDetail")
public final class C323140Clc extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SeaPdpCreatorInnerListVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323140Clc(SeaPdpCreatorInnerListVM seaPdpCreatorInnerListVM, InterfaceC1364105Vn<? super C323140Clc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = seaPdpCreatorInnerListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpCreatorInnerListVM@3055.fetchOrGetCreatorVideoDetail$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objCQ2 = this.LLILLJJLI.CQ2(null, this);
        C1C7U.LIZIZ("SeaPdpCreatorInnerListVM@3055.fetchOrGetCreatorVideoDetail$1");
        return objCQ2;
    }
}
