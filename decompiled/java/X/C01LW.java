package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01LW, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.effect.utils.GiftRenderUtils$executeAsyncCpuTask$1", f = "GiftRenderUtils.kt", l = {}, m = "invokeSuspend")
public final class C01LW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Runnable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01LW(Runnable runnable, InterfaceC1364105Vn<? super C01LW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = runnable;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01LW(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftRenderUtils@1ec1.executeAsyncCpuTask$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.run();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftRenderUtils@1ec1.executeAsyncCpuTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
