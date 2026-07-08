package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponseV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CnJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2$requestReachCfg$1$1$1$ssResponse$1", f = "CustomDotVMV2.kt", l = {343}, m = "invokeSuspend")
public final class C324190CnJ extends C09AX implements Function1<InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>>, Object> {
    public int LL;
    public final /* synthetic */ Function2<Boolean, InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>>, Object> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C324190CnJ(Function2<? super Boolean, ? super InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>>, ? extends Object> function2, boolean z, InterfaceC1364105Vn<? super C324190CnJ> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = function2;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324190CnJ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CustomDotVMV2@ba3d.requestReachCfg$1$1$1$ssResponse$1");
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
            Function2<Boolean, InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>>, Object> function2 = this.LLILLJJLI;
            Boolean boolValueOf = Boolean.valueOf(this.LLILLL);
            this.LL = 1;
            obj = function2.invoke(boolValueOf, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CustomDotVMV2@ba3d.requestReachCfg$1$1$1$ssResponse$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CustomDotVMV2@ba3d.requestReachCfg$1$1$1$ssResponse$1");
        return obj;
    }
}
