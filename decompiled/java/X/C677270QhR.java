package X;

import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0QhR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel$refreshData$1$2", f = "MixPageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C677270QhR extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super AbstractC677910QiT<? extends C1422405hW>>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C675270QeD LLILLJJLI;
    public final /* synthetic */ MixPageViewModel LLILLL;
    public final /* synthetic */ InterfaceC677290QhT LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C677270QhR(InterfaceC677290QhT interfaceC677290QhT, MixPageViewModel mixPageViewModel, C675270QeD c675270QeD, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = c675270QeD;
        this.LLILLL = mixPageViewModel;
        this.LLILZ = interfaceC677290QhT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixPageViewModel@7afc.refreshData$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Throwable th = (Throwable) this.LL;
        if (this.LLILLJJLI.LIZJ == EnumC675700Qeu.CONTENT_LIST_REFRESH.getValue()) {
            this.LLILLL.xQ2(C677330QhX.LIZ);
        }
        if (!(th instanceof C1494450ozb) && !(th.getCause() instanceof C1494450ozb)) {
            this.LLILLL.xQ2(new C677320QhW(8));
        } else {
            this.LLILLL.xQ2(new C677300QhU(null));
        }
        InterfaceC677290QhT interfaceC677290QhT = this.LLILZ;
        if (interfaceC677290QhT != null) {
            interfaceC677290QhT.LIZIZ(this.LLILLJJLI, new C676770Qgd(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixPageViewModel@7afc.refreshData$1$2");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super AbstractC677910QiT<? extends C1422405hW>> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C675270QeD c675270QeD = this.LLILLJJLI;
        MixPageViewModel mixPageViewModel = this.LLILLL;
        C677270QhR c677270QhR = new C677270QhR(this.LLILZ, mixPageViewModel, c675270QeD, interfaceC1364105Vn);
        c677270QhR.LL = th;
        return c677270QhR.invokeSuspend(Unit.LIZ);
    }
}
