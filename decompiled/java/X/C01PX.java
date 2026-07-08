package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01PX, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.PCSBoardEffectService$EffectRenderStrategy$render$2$delayTask$1", f = "PCSBoardEffectService.kt", l = {}, m = "invokeSuspend")
public final class C01PX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C01PX(InterfaceC1364105Vn<? super C01PX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01PX(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectService$EffectRenderStrategy@f9c0.render$2$delayTask$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PCSBoardEffectService$EffectRenderStrategy@f9c0.render$2$delayTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C01PX(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
