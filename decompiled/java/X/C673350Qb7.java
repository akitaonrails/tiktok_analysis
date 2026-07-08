package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.model.MiddleCouponModel;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.SuggestAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qb7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.SuggestAssemViewModel$fetchCouponData$1", f = "SuggestAssemViewModel.kt", l = {404, 407}, m = "invokeSuspend")
public final class C673350Qb7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public SuggestAssemViewModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ SuggestAssemViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C673350Qb7(SuggestAssemViewModel suggestAssemViewModel, InterfaceC1364105Vn<? super C673350Qb7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = suggestAssemViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C673350Qb7(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SuggestAssemViewModel suggestAssemViewModel;
        MiddleCouponModel middleCouponModel;
        C1C7U.LIZ("SuggestAssemViewModel@b236.fetchCouponData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SuggestAssemViewModel@b236.fetchCouponData$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            suggestAssemViewModel = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            suggestAssemViewModel = this.LLILLL;
            InterfaceC673410QbD interfaceC673410QbD = (InterfaceC673410QbD) suggestAssemViewModel.DQ2().getOperator();
            this.LL = suggestAssemViewModel;
            this.LLILLJJLI = 1;
            obj = interfaceC673410QbD.LJIJI();
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SuggestAssemViewModel@b236.fetchCouponData$1");
                return objLJFF;
            }
        }
        suggestAssemViewModel.LLJILLL = (ListenableFuture) obj;
        ListenableFuture<MiddleCouponModel> listenableFuture = this.LLILLL.LLJILLL;
        if (listenableFuture != null) {
            middleCouponModel = listenableFuture.get();
        } else {
            middleCouponModel = null;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C673360Qb8 c673360Qb8 = new C673360Qb8(this.LLILLL, middleCouponModel, null);
        this.LL = null;
        this.LLILLJJLI = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c673360Qb8) == objLJFF) {
            C1C7U.LIZIZ("SuggestAssemViewModel@b236.fetchCouponData$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SuggestAssemViewModel@b236.fetchCouponData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
