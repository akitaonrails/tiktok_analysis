package X;

import com.ss.android.ugc.aweme.minis.model.payment.coupon.TiktokMinisMonetizationCheckEnablementListResponse;
import com.ss.android.ugc.aweme.minis.request.payment.IMinisCouponApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0iC8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.payment.qcpx.MinisCouponViewModel$checkEnablementListInner$2", f = "MinisCouponViewModel.kt", l = {69}, m = "invokeSuspend")
public final class C1233140iC8 extends C09AX implements Function1<InterfaceC1364105Vn<? super TiktokMinisMonetizationCheckEnablementListResponse>, Object> {
    public int LL;
    public final /* synthetic */ C1233160iCA LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1233140iC8(C1233160iCA c1233160iCA, InterfaceC1364105Vn<? super C1233140iC8> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1233160iCA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1233140iC8(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super TiktokMinisMonetizationCheckEnablementListResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisCouponViewModel@376a.checkEnablementListInner$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IMinisCouponApi.LIZ.getClass();
            IMinisCouponApi iMinisCouponApiLIZ = C1232820iBc.LIZ();
            if (iMinisCouponApiLIZ != null) {
                C1233160iCA c1233160iCA = this.LLILLJJLI;
                String str = c1233160iCA.LIZ;
                String str2 = c1233160iCA.LIZIZ;
                String str3 = c1233160iCA.LIZJ;
                String str4 = c1233160iCA.LIZLLL;
                boolean z = c1233160iCA.LJFF;
                this.LL = 1;
                obj = iMinisCouponApiLIZ.checkEnablementList(str, str2, str3, str4, z, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MinisCouponViewModel@376a.checkEnablementListInner$2");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1C7U.LIZIZ("MinisCouponViewModel@376a.checkEnablementListInner$2");
        return obj;
    }
}
