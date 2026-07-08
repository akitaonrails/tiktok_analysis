package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QhS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel$refreshData$1$1", f = "MixPageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C677280QhS extends C09AX implements Function2<InterfaceC346701Wf<? super AbstractC677910QiT<? extends C1422405hW>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC677290QhT LL;
    public final /* synthetic */ C675270QeD LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ MixPageViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C677280QhS(InterfaceC677290QhT interfaceC677290QhT, C675270QeD c675270QeD, Context context, MixPageViewModel mixPageViewModel, InterfaceC1364105Vn<? super C677280QhS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC677290QhT;
        this.LLILLJJLI = c675270QeD;
        this.LLILLL = context;
        this.LLILZ = mixPageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C677280QhS(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixPageViewModel@7afc.refreshData$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC677290QhT interfaceC677290QhT = this.LL;
        if (interfaceC677290QhT != null) {
            interfaceC677290QhT.onStart();
        }
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!C036E.LIZ.LIZIZ()) {
            this.LLILZ.xQ2(new C677300QhU(null));
        } else if (this.LLILLJJLI.LIZJ == EnumC675700Qeu.CONTENT_LIST_REFRESH.getValue()) {
            this.LLILZ.xQ2(C677350QhZ.LIZ);
        } else {
            this.LLILZ.xQ2(C677340QhY.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixPageViewModel@7afc.refreshData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super AbstractC677910QiT<? extends C1422405hW>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
