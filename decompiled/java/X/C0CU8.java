package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CU8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.player.playservice.BasePlayService$play$1", f = "BasePlayService.kt", l = {}, m = "invokeSuspend")
public final class C0CU8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC2272941Dxs LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CU8(InterfaceC2272941Dxs interfaceC2272941Dxs, InterfaceC1364105Vn<? super C0CU8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC2272941Dxs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CU8(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BasePlayService@d7cf.play$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLLLLIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BasePlayService@d7cf.play$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
