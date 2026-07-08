package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.innerfeed.PdpCreatorVideoListVM;

/* JADX INFO: renamed from: X.0Cla, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.innerfeed.PdpCreatorVideoListVM", f = "PdpCreatorVideoListVM.kt", l = {183}, m = "fetchOrGetCreatorVideoDetail")
public final class C323120Cla extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PdpCreatorVideoListVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323120Cla(PdpCreatorVideoListVM pdpCreatorVideoListVM, InterfaceC1364105Vn<? super C323120Cla> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = pdpCreatorVideoListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpCreatorVideoListVM@9dc0.fetchOrGetCreatorVideoDetail$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLJJLI.BQ2(this);
        C1C7U.LIZIZ("PdpCreatorVideoListVM@9dc0.fetchOrGetCreatorVideoDetail$1");
        return objBQ2;
    }
}
