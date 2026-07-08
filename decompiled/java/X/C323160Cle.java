package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed.SeaPdpCreatorInnerListVM;

/* JADX INFO: renamed from: X.0Cle, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed.SeaPdpCreatorInnerListVM", f = "SeaPdpCreatorInnerListVM.kt", l = {302}, m = "batchLoadVideo")
public final class C323160Cle extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SeaPdpCreatorInnerListVM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323160Cle(SeaPdpCreatorInnerListVM seaPdpCreatorInnerListVM, InterfaceC1364105Vn<? super C323160Cle> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = seaPdpCreatorInnerListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpCreatorInnerListVM@3055.batchLoadVideo$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLL.BQ2(null, 0, this);
        C1C7U.LIZIZ("SeaPdpCreatorInnerListVM@3055.batchLoadVideo$1");
        return objBQ2;
    }
}
