package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YQ1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.bridge.init.B2CLandingPreSendInterceptor$execute$2$1", f = "B2CLandingPreSendInterceptor.kt", l = {28}, m = "invokeSuspend")
public final class C0YQ1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1742406s2 LLILLJJLI;
    public final /* synthetic */ C873720YPi LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YQ1(InterfaceC1742406s2 interfaceC1742406s2, C873720YPi c873720YPi, InterfaceC1364105Vn<? super C0YQ1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1742406s2;
        this.LLILLL = c873720YPi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YQ1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("B2CLandingPreSendInterceptor@8810.execute$2$1");
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
            InterfaceC1742406s2 interfaceC1742406s2 = this.LLILLJJLI;
            Map<String, String> localExt = this.LLILLL.LIZ.getLocalExt();
            Map<String, String> map = this.LLILLL.LIZJ.LIZIZ;
            this.LL = 1;
            if (interfaceC1742406s2.LIZ(localExt, map, this) == objLJFF) {
                C1C7U.LIZIZ("B2CLandingPreSendInterceptor@8810.execute$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("B2CLandingPreSendInterceptor@8810.execute$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
