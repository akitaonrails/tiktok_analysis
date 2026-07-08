package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.model.MiddleCouponModel;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchSuggestViewModelNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchSuggestViewModelNew$fetchCouponData$1", f = "EcSearchSuggestViewModelNew.kt", l = {617}, m = "invokeSuspend")
public final class C673260Qay extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EcSearchSuggestViewModelNew LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C673260Qay(EcSearchSuggestViewModelNew ecSearchSuggestViewModelNew, InterfaceC1364105Vn<? super C673260Qay> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ecSearchSuggestViewModelNew;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C673260Qay(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MiddleCouponModel middleCouponModel;
        C1C7U.LIZ("EcSearchSuggestViewModelNew@29c4.fetchCouponData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                EcSearchSuggestViewModelNew ecSearchSuggestViewModelNew = this.LLILLJJLI;
                ecSearchSuggestViewModelNew.LLJIJIL = ((InterfaceC673060Qae) ecSearchSuggestViewModelNew.zQ2().getOperator()).u();
                ListenableFuture<MiddleCouponModel> listenableFuture = this.LLILLJJLI.LLJIJIL;
                if (listenableFuture != null) {
                    middleCouponModel = listenableFuture.get();
                } else {
                    middleCouponModel = null;
                }
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C673270Qaz c673270Qaz = new C673270Qaz(this.LLILLJJLI, middleCouponModel, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c673270Qaz) == objLJFF) {
                    C1C7U.LIZIZ("EcSearchSuggestViewModelNew@29c4.fetchCouponData$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchSuggestViewModelNew@29c4.fetchCouponData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
