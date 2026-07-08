package X;

import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Qi6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel$loadMore$1$2", f = "MixPageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C677680Qi6 extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super AbstractC677910QiT<? extends C1422405hW>>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MixPageViewModel LLILLJJLI;
    public final /* synthetic */ InterfaceC677290QhT LLILLL;
    public final /* synthetic */ C675270QeD LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C677680Qi6(InterfaceC677290QhT interfaceC677290QhT, MixPageViewModel mixPageViewModel, C675270QeD c675270QeD, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = mixPageViewModel;
        this.LLILLL = interfaceC677290QhT;
        this.LLILZ = c675270QeD;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixPageViewModel@7afc.loadMore$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Throwable th = (Throwable) this.LL;
        this.LLILLJJLI.LLJ.postValue(C2286608xc.LJ(EnumC677800QiI.ERROR.getValue()));
        this.LLILLJJLI.xQ2(new C677950QiX());
        InterfaceC677290QhT interfaceC677290QhT = this.LLILLL;
        if (interfaceC677290QhT != null) {
            interfaceC677290QhT.LIZIZ(this.LLILZ, new C676770Qgd(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixPageViewModel@7afc.loadMore$1$2");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super AbstractC677910QiT<? extends C1422405hW>> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        MixPageViewModel mixPageViewModel = this.LLILLJJLI;
        C677680Qi6 c677680Qi6 = new C677680Qi6(this.LLILLL, mixPageViewModel, this.LLILZ, interfaceC1364105Vn);
        c677680Qi6.LL = th;
        return c677680Qi6.invokeSuspend(Unit.LIZ);
    }
}
