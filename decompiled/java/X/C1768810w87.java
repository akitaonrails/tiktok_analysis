package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotGetParamsV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponseV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0w87, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2$handleShopTabClick$1$3", f = "CustomDotVMV2.kt", l = {402}, m = "invokeSuspend")
public final class C1768810w87 extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ CustomDotVMV2 LLILLL;
    public final /* synthetic */ EnumC1768950w8L LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768810w87(CustomDotVMV2 customDotVMV2, EnumC1768950w8L enumC1768950w8L, InterfaceC1364105Vn<? super C1768810w87> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = customDotVMV2;
        this.LLILZ = enumC1768950w8L;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1768810w87 c1768810w87 = new C1768810w87(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1768810w87.LLILLJJLI = ((Boolean) obj).booleanValue();
        return c1768810w87;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLLLZI = obj;
        C1C7U.LIZ("CustomDotVMV2@ba3d.handleShopTabClick$1$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLLLZI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLLLZI);
            boolean z = this.LLILLJJLI;
            InterfaceC1768760w82 interfaceC1768760w82 = (InterfaceC1768760w82) this.LLILLL.xQ2().getOperator();
            CustomDotVMV2 customDotVMV2 = this.LLILLL;
            int i2 = customDotVMV2.LL;
            String str = customDotVMV2.LLJJJIL;
            int value = this.LLILZ.getValue();
            this.LLILLL.getClass();
            CustomDotGetParamsV2 customDotGetParamsV2 = new CustomDotGetParamsV2(1, z ? 1 : 0, i2, str, value, null, CustomDotVMV2.wQ2(), this.LLILLL.zQ2(), CustomDotVMV2.LLJLILLLLZIIL, null, null, null, null);
            this.LL = 1;
            objLLLZI = interfaceC1768760w82.LLLZI(customDotGetParamsV2, this);
            if (objLLLZI == objLJFF) {
                C1C7U.LIZIZ("CustomDotVMV2@ba3d.handleShopTabClick$1$3");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CustomDotVMV2@ba3d.handleShopTabClick$1$3");
        return objLLLZI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
