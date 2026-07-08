package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotGetParamsV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponseV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0w88, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2$reachGet$1$1", f = "CustomDotVMV2.kt", l = {283}, m = "invokeSuspend")
public final class C1768820w88 extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ CustomDotVMV2 LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ EnumC1768950w8L LLILZIL;
    public final /* synthetic */ C1768850w8B LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768820w88(CustomDotVMV2 customDotVMV2, boolean z, EnumC1768950w8L enumC1768950w8L, C1768850w8B c1768850w8B, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = customDotVMV2;
        this.LLILZ = z;
        this.LLILZIL = enumC1768950w8L;
        this.LLILZLL = c1768850w8B;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1768820w88 c1768820w88 = new C1768820w88(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1768820w88.LLILLJJLI = ((Boolean) obj).booleanValue();
        return c1768820w88;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Integer num;
        Object objLLLZI = obj;
        C1C7U.LIZ("CustomDotVMV2@ba3d.reachGet$1$1");
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
            CustomDotVMV2 customDotVMV2 = this.LLILLL;
            String str3 = customDotVMV2.LLJJIII;
            String str4 = null;
            customDotVMV2.LLJJIII = null;
            InterfaceC1768760w82 interfaceC1768760w82 = (InterfaceC1768760w82) customDotVMV2.xQ2().getOperator();
            boolean z2 = this.LLILZ;
            CustomDotVMV2 customDotVMV22 = this.LLILLL;
            int i2 = customDotVMV22.LL;
            String str5 = customDotVMV22.LLJJJIL;
            int value = this.LLILZIL.getValue();
            C1768850w8B c1768850w8B = this.LLILZLL;
            if (c1768850w8B != null) {
                str4 = c1768850w8B.LIZ;
            }
            this.LLILLL.getClass();
            String strWQ2 = CustomDotVMV2.wQ2();
            n nVarZQ2 = this.LLILLL.zQ2();
            String str6 = CustomDotVMV2.LLJLILLLLZIIL;
            C1768850w8B c1768850w8B2 = this.LLILZLL;
            if (c1768850w8B2 != null) {
                str = c1768850w8B2.LIZIZ;
                str2 = c1768850w8B2.LIZJ;
                num = c1768850w8B2.LIZLLL;
            } else {
                str = null;
                str2 = null;
                num = null;
            }
            int i3 = z ? 1 : 0;
            CustomDotGetParamsV2 customDotGetParamsV2 = new CustomDotGetParamsV2(z2 ? 1 : 0, i3, i2, str5, value, str4, strWQ2, nVarZQ2, str6, str3, str, str2, num);
            this.LL = 1;
            objLLLZI = interfaceC1768760w82.LLLZI(customDotGetParamsV2, this);
            if (objLLLZI == objLJFF) {
                C1C7U.LIZIZ("CustomDotVMV2@ba3d.reachGet$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CustomDotVMV2@ba3d.reachGet$1$1");
        return objLLLZI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
