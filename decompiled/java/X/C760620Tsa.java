package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tsa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.schema.EffectSchemaDispatchCenter$setFilter$1", f = "EffectSchemaDispatchCenter.kt", l = {95, 117}, m = "invokeSuspend")
public final class C760620Tsa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C013C LL;
    public C013C LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ C760600TsY LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760620Tsa(Map<String, String> map, C760600TsY c760600TsY, InterfaceC1364105Vn<? super C760620Tsa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = map;
        this.LLILZIL = c760600TsY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760620Tsa(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C760620Tsa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
