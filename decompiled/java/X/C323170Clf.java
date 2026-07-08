package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed.SeaPdpCreatorInnerListVM;

/* JADX INFO: renamed from: X.0Clf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed.SeaPdpCreatorInnerListVM", f = "SeaPdpCreatorInnerListVM.kt", l = {283}, m = "onLoadLatest")
public final class C323170Clf extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SeaPdpCreatorInnerListVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323170Clf(SeaPdpCreatorInnerListVM seaPdpCreatorInnerListVM, InterfaceC1364105Vn<? super C323170Clf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = seaPdpCreatorInnerListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpCreatorInnerListVM@3055.onLoadLatest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objEQ2 = this.LLILLJJLI.onLoadLatest(null, this);
        C1C7U.LIZIZ("SeaPdpCreatorInnerListVM@3055.onLoadLatest$1");
        return objEQ2;
    }
}
