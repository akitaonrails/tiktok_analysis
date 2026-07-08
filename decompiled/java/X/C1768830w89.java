package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotGetParamsV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0w89, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem$onUgSparkCloseEvent$1$1$2$1", f = "CustomDotAssem.kt", l = {580}, m = "invokeSuspend")
public final class C1768830w89 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CustomDotAssem LLILLJJLI;
    public final /* synthetic */ C1768860w8C LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768830w89(CustomDotAssem customDotAssem, C1768860w8C c1768860w8C, String str, InterfaceC1364105Vn<? super C1768830w89> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = customDotAssem;
        this.LLILLL = c1768860w8C;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1768830w89(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CustomDotAssem@3d76.onUgSparkCloseEvent$1$1$2$1");
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
            InterfaceC1768760w82 interfaceC1768760w82 = (InterfaceC1768760w82) this.LLILLJJLI.m183do().xQ2().getOperator();
            CustomDotGetParamsV2 customDotGetParamsV2 = new CustomDotGetParamsV2(1, 0, 0, "", EnumC1768950w8L.UG_BACK_FYP_SHOW_BUBBLE.getValue(), null, null, null, null, null, this.LLILLL.LIZ, this.LLILZ, C2286608xc.LJ(0));
            this.LL = 1;
            if (interfaceC1768760w82.LLLZI(customDotGetParamsV2, this) == objLJFF) {
                C1C7U.LIZIZ("CustomDotAssem@3d76.onUgSparkCloseEvent$1$1$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CustomDotAssem@3d76.onUgSparkCloseEvent$1$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
