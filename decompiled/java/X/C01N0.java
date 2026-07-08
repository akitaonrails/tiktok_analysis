package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01N0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.conflict.PCSBoardEffectManager$startOnStartTimeoutMonitorIfNeeded$1$1$1", f = "PCSBoardEffectManager.kt", l = {}, m = "invokeSuspend")
public final class C01N0 extends C09AX implements Function2<Integer, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ int LL;

    public C01N0(InterfaceC1364105Vn<? super C01N0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01N0 c01n0 = new C01N0(interfaceC1364105Vn);
        c01n0.LL = ((Number) obj).intValue();
        return c01n0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("PCSBoardEffectManager@20d3.startOnStartTimeoutMonitorIfNeeded$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == 2) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("PCSBoardEffectManager@20d3.startOnStartTimeoutMonitorIfNeeded$1$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
