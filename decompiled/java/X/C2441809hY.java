package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.series.voucher.viewmodel.SeriesVoucherClaimViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS582S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.09hY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.voucher.viewmodel.SeriesVoucherClaimViewModel$voucherClaim$2", f = "SeriesVoucherClaimViewModel.kt", l = {58}, m = "invokeSuspend")
public final class C2441809hY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ SeriesVoucherClaimViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2441809hY(Long l, long j, SeriesVoucherClaimViewModel seriesVoucherClaimViewModel, InterfaceC1364105Vn<? super C2441809hY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = l;
        this.LLILLL = j;
        this.LLILZ = seriesVoucherClaimViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2441809hY(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("SeriesVoucherClaimViewModel@27e2.voucherClaim$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                Long l = this.LLILLJJLI;
                long j = this.LLILLL;
                InterfaceC2441909hZ.LIZ.getClass();
                C11NZ<BaseResponse> c11nzLIZ = ((InterfaceC2441909hZ) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(Api.LIZ).create(InterfaceC2441909hZ.class)).LIZ(l, C2286608xc.LJFF(j));
                this.LL = 1;
                obj = C11UD.LIZJ(c11nzLIZ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SeriesVoucherClaimViewModel@27e2.voucherClaim$2");
                    return objLJFF;
                }
            }
            c098200Yq = (BaseResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        SeriesVoucherClaimViewModel seriesVoucherClaimViewModel = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            seriesVoucherClaimViewModel.LL = true;
            seriesVoucherClaimViewModel.setState(new AwS582S0100000_3((BaseResponse) c098200Yq, 94));
        }
        SeriesVoucherClaimViewModel seriesVoucherClaimViewModel2 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            seriesVoucherClaimViewModel2.setState(new AwS582S0100000_3(thM5exceptionOrNullimpl, 95));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeriesVoucherClaimViewModel@27e2.voucherClaim$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
