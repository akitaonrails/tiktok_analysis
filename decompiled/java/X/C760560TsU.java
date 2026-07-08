package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TsU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.schema.EffectSchemaDispatchCenter$setBeauty$1$2", f = "EffectSchemaDispatchCenter.kt", l = {}, m = "invokeSuspend")
public final class C760560TsU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ C760600TsY LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760560TsU(C013C c013c, C760600TsY c760600TsY, Map<String, String> map, InterfaceC1364105Vn<? super C760560TsU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c013c;
        this.LLILLJJLI = c760600TsY;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760560TsU(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectSchemaDispatchCenter@53fc.setBeauty$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.element) {
            C760600TsY c760600TsY = this.LLILLJJLI;
            String str = this.LLILLL.get("success_tips");
            c760600TsY.getClass();
            C760600TsY.LIZ(str);
        } else {
            C760600TsY c760600TsY2 = this.LLILLJJLI;
            String str2 = this.LLILLL.get("fail_tips");
            c760600TsY2.getClass();
            C760600TsY.LIZ(str2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectSchemaDispatchCenter@53fc.setBeauty$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
