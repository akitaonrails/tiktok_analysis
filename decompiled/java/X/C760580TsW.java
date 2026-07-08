package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TsW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.schema.EffectSchemaDispatchCenter$setSingleEffect$1$1", f = "EffectSchemaDispatchCenter.kt", l = {}, m = "invokeSuspend")
public final class C760580TsW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C760600TsY LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760580TsW(boolean z, C760600TsY c760600TsY, Map<String, String> map, String str, InterfaceC1364105Vn<? super C760580TsW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c760600TsY;
        this.LLILLL = map;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760580TsW(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectSchemaDispatchCenter@53fc.setSingleEffect$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            C760600TsY c760600TsY = this.LLILLJJLI;
            String str = this.LLILLL.get("success_tips");
            c760600TsY.getClass();
            C760600TsY.LIZ(str);
        } else {
            C760600TsY c760600TsY2 = this.LLILLJJLI;
            String str2 = this.LLILZ;
            c760600TsY2.getClass();
            C760600TsY.LIZ(str2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectSchemaDispatchCenter@53fc.setSingleEffect$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
