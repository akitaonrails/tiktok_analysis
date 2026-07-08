package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0Xr4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.ui.CreatorRankingPageDialogFragment$onViewCreated$5$1$2$1", f = "CreatorRankingPageDialogFragment.kt", l = {}, m = "invokeSuspend")
public final class C861600Xr4 extends C09AX implements InterfaceC1631630sYr<C861610Xr5, InterfaceC1785620wZE, C1785480wZ0, InterfaceC1364105Vn<? super C443120HZe<? extends C861610Xr5, ? extends InterfaceC1785620wZE, ? extends C1785480wZ0>>, Object> {
    public /* synthetic */ C861610Xr5 LL;
    public /* synthetic */ InterfaceC1785620wZE LLILLJJLI;
    public /* synthetic */ C1785480wZ0 LLILLL;

    public C861600Xr4(InterfaceC1364105Vn<? super C861600Xr4> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatorRankingPageDialogFragment@c771.onViewCreated$5$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C443120HZe c443120HZe = new C443120HZe(this.LL, this.LLILLJJLI, this.LLILLL);
        C1C7U.LIZIZ("CreatorRankingPageDialogFragment@c771.onViewCreated$5$1$2$1");
        return c443120HZe;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(C861610Xr5 c861610Xr5, InterfaceC1785620wZE interfaceC1785620wZE, C1785480wZ0 c1785480wZ0, InterfaceC1364105Vn<? super C443120HZe<? extends C861610Xr5, ? extends InterfaceC1785620wZE, ? extends C1785480wZ0>> interfaceC1364105Vn) {
        C861600Xr4 c861600Xr4 = new C861600Xr4(interfaceC1364105Vn);
        c861600Xr4.LL = c861610Xr5;
        c861600Xr4.LLILLJJLI = interfaceC1785620wZE;
        c861600Xr4.LLILLL = c1785480wZ0;
        return c861600Xr4.invokeSuspend(Unit.LIZ);
    }
}
