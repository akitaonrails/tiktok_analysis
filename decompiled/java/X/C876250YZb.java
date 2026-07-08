package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YZb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.sdk.SDKManagerV2$initSDK$1", f = "SDKManagerV2.kt", l = {}, m = "invokeSuspend")
public final class C876250YZb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C883100Yke LL;
    public final /* synthetic */ AbstractC877810Yc7 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C876250YZb(C883100Yke c883100Yke, AbstractC877810Yc7 abstractC877810Yc7, InterfaceC1364105Vn<? super C876250YZb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c883100Yke;
        this.LLILLJJLI = abstractC877810Yc7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C876250YZb(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SDKManagerV2@3636.initSDK$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIILJJIL(new C876260YZc(this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SDKManagerV2@3636.initSDK$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
