package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Qe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.conflict.PCSBoardEffectManager$checkBoardConflicts$1", f = "PCSBoardEffectManager.kt", l = {}, m = "invokeSuspend")
public final class C331001Qe extends C09AX implements Function2<Integer, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends Boolean>>, Object> {
    public /* synthetic */ int LL;
    public final /* synthetic */ C389701fL LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331001Qe(C389701fL c389701fL, InterfaceC1364105Vn<? super C331001Qe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c389701fL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C331001Qe c331001Qe = new C331001Qe(this.LLILLJJLI, interfaceC1364105Vn);
        c331001Qe.LL = ((Number) obj).intValue();
        return c331001Qe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectManager@20d3.checkBoardConflicts$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C095D c095d = new C095D(new C387601f0(this.LL, this.LLILLJJLI, null));
        C1C7U.LIZIZ("PCSBoardEffectManager@20d3.checkBoardConflicts$1");
        return c095d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends Boolean>> interfaceC1364105Vn) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
