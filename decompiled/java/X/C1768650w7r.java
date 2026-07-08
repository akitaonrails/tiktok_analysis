package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponseV2;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0w7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2$requestReachCfg$1$1$1", f = "CustomDotVMV2.kt", l = {342}, m = "invokeSuspend")
public final class C1768650w7r extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CustomDotResponseV2>, Object> {
    public int LL;
    public final /* synthetic */ EnumC1768960w8M LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ Function2<Boolean, InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>>, Object> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1768650w7r(EnumC1768960w8M enumC1768960w8M, Map<String, Object> map, Function2<? super Boolean, ? super InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>>, ? extends Object> function2, boolean z, InterfaceC1364105Vn<? super C1768650w7r> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC1768960w8M;
        this.LLILLL = map;
        this.LLILZ = function2;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1768650w7r(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Response response;
        Object obj2;
        C1C7U.LIZ("CustomDotVMV2@ba3d.requestReachCfg$1$1$1");
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
            C1768560w7i c1768560w7i = C1768560w7i.LIZ;
            EnumC1768570w7j enumC1768570w7j = EnumC1768570w7j.TRIGGER_REQUEST;
            EnumC1768960w8M enumC1768960w8M = this.LLILLJJLI;
            Map<String, Object> map = this.LLILLL;
            c1768560w7i.getClass();
            C1768560w7i.LJ(enumC1768570w7j, enumC1768960w8M, true, map);
            C324190CnJ c324190CnJ = new C324190CnJ(this.LLILZ, this.LLILZIL, null);
            this.LL = 1;
            obj = C2381909Uz.LIZJ("mall", null, this, c324190CnJ);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CustomDotVMV2@ba3d.requestReachCfg$1$1$1");
                return objLJFF;
            }
        }
        C0X52 c0x52 = (C0X52) obj;
        if (c0x52 != null && (response = (Response) c0x52.LIZIZ) != null && response.isCodeOK() && (obj2 = response.data) != null) {
            obj3 = obj2;
        }
        C1C7U.LIZIZ("CustomDotVMV2@ba3d.requestReachCfg$1$1$1");
        return obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CustomDotResponseV2> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
