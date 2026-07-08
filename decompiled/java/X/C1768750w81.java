package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0w81, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2$updateUIShowToServer$1$1$3$1", f = "CustomDotVMV2.kt", l = {722}, m = "invokeSuspend")
public final class C1768750w81 extends C09AX implements Function1<InterfaceC1364105Vn<? super C0X52<Response<Object>>>, Object> {
    public int LL;
    public final /* synthetic */ CustomDotVMV2 LLILLJJLI;
    public final /* synthetic */ n LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768750w81(CustomDotVMV2 customDotVMV2, n nVar, InterfaceC1364105Vn<? super C1768750w81> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = customDotVMV2;
        this.LLILLL = nVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1768750w81(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CustomDotVMV2@ba3d.updateUIShowToServer$1$1$3$1");
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
            n nVar = this.LLILLL;
            this.LL = 1;
            obj = interfaceC1768760w82.shopTabRecImpression(nVar, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CustomDotVMV2@ba3d.updateUIShowToServer$1$1$3$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CustomDotVMV2@ba3d.updateUIShowToServer$1$1$3$1");
        return obj;
    }
}
