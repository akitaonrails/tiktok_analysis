package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ShopReachControlGetParams;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ShopReachControlResponse;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0w7z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2$reachControlGet$1$1$1", f = "CustomDotVMV2.kt", l = {1035}, m = "invokeSuspend")
public final class C1768730w7z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ShopReachControlResponse>, Object> {
    public int LL;
    public final /* synthetic */ EnumC1768950w8L LLILLJJLI;
    public final /* synthetic */ CustomDotVMV2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768730w7z(CustomDotVMV2 customDotVMV2, EnumC1768950w8L enumC1768950w8L, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC1768950w8L;
        this.LLILLL = customDotVMV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1768730w7z(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Response response;
        Object obj2;
        C1C7U.LIZ("CustomDotVMV2@ba3d.reachControlGet$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj3 = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1768740w80 c1768740w80 = new C1768740w80(this.LLILLL, new ShopReachControlGetParams(Collections.singletonList(C2286608xc.LJ(this.LLILLJJLI.getValue()))), null);
            this.LL = 1;
            obj = C2381909Uz.LIZJ("mall", null, this, c1768740w80);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CustomDotVMV2@ba3d.reachControlGet$1$1$1");
                return objLJFF;
            }
        }
        C0X52 c0x52 = (C0X52) obj;
        if (c0x52 != null && (response = (Response) c0x52.LIZIZ) != null && response.isCodeOK() && (obj2 = response.data) != null) {
            obj3 = obj2;
        }
        C1C7U.LIZIZ("CustomDotVMV2@ba3d.reachControlGet$1$1$1");
        return obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ShopReachControlResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
