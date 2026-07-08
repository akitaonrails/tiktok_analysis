package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01PT, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.PCSBoardEffectService$EffectRenderStrategy$render$2$applyBoardTask$1$1", f = "PCSBoardEffectService.kt", l = {}, m = "invokeSuspend")
public final class C01PT extends C09AX implements Function2<Integer, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ int LL;

    public C01PT(InterfaceC1364105Vn<? super C01PT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01PT c01pt = new C01PT(interfaceC1364105Vn);
        c01pt.LL = ((Number) obj).intValue();
        return c01pt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("PCSBoardEffectService$EffectRenderStrategy@f9c0.render$2$applyBoardTask$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == 2) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("PCSBoardEffectService$EffectRenderStrategy@f9c0.render$2$applyBoardTask$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
