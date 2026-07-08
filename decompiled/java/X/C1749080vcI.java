package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity.CpfViewModel;

/* JADX INFO: renamed from: X.0vcI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity.CpfViewModel", f = "CpfViewModel.kt", l = {39}, m = "validateIdentity")
public final class C1749080vcI extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CpfViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1749080vcI(CpfViewModel cpfViewModel, InterfaceC1364105Vn<? super C1749080vcI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = cpfViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CpfViewModel@16c8.validateIdentity$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.vQ2(null, this);
        C1C7U.LIZIZ("CpfViewModel@16c8.validateIdentity$1");
        return objVQ2;
    }
}
