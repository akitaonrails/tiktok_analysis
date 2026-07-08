package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponseV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotUpdateParamsV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0w85, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2$handleShopTabClick$1$2", f = "CustomDotVMV2.kt", l = {388}, m = "invokeSuspend")
public final class C1768790w85 extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>>, Object> {
    public int LL;
    public final /* synthetic */ CustomDotVMV2 LLILLJJLI;
    public final /* synthetic */ CustomDotUpdateParamsV2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768790w85(CustomDotVMV2 customDotVMV2, CustomDotUpdateParamsV2 customDotUpdateParamsV2, InterfaceC1364105Vn<? super C1768790w85> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = customDotVMV2;
        this.LLILLL = customDotUpdateParamsV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1768790w85(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CustomDotVMV2@ba3d.handleShopTabClick$1$2");
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
            InterfaceC1768760w82 interfaceC1768760w82 = (InterfaceC1768760w82) this.LLILLJJLI.xQ2().getOperator();
            CustomDotUpdateParamsV2 customDotUpdateParamsV2 = this.LLILLL;
            this.LL = 1;
            obj = interfaceC1768760w82.shopReachUpdateV2(customDotUpdateParamsV2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CustomDotVMV2@ba3d.handleShopTabClick$1$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CustomDotVMV2@ba3d.handleShopTabClick$1$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
