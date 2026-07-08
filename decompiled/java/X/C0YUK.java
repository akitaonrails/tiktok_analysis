package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS558S0100000_14;
import njp.a;

/* JADX INFO: renamed from: X.0YUK, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.sdk.SDKManagerV2$refreshSDK$2", f = "SDKManagerV2.kt", l = {}, m = "invokeSuspend")
public final class C0YUK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C883100Yke LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YUK(C883100Yke c883100Yke, InterfaceC1364105Vn<? super C0YUK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c883100Yke;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YUK(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SDKManagerV2@3636.refreshSDK$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C883100Yke c883100Yke = this.LL;
        c883100Yke.LJIIJJI(new AwS558S0100000_14(c883100Yke, 1667));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SDKManagerV2@3636.refreshSDK$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
